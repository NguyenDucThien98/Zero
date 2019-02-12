/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprocess;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener;
import com.google.api.client.http.InputStreamContent;
import com.google.api.services.samples.youtube.cmdline.Auth;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoSnippet;
import com.google.api.services.youtube.model.VideoStatus;
import com.google.common.collect.Lists;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import view.main;

/**
 *
 * @author gg
 */
public class uploadyoutube {

    String s = "";
    private main mainFrame = null;
    private static YouTube youtube;
    private static final String VIDEO_FILE_FORMAT = "video/*";

    public void upload(int i, String credentialname, String SAMPLE_VIDEO_FILENAME, String SAMPLE_VIDEO_FILEPATH, String Status, String Title, String Description, String Tag, javax.swing.JFrame frame) {
        mainFrame = (main) frame;
        List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.upload");
        try {

            Credential credential = Auth.authorize(scopes, credentialname);
            System.out.println(credential.toString());
            youtube = new YouTube.Builder(Auth.HTTP_TRANSPORT, Auth.JSON_FACTORY, credential).setApplicationName(
                    "youtube-cmdline-uploadvideo-sample").build();

            mainFrame.setConsoleUpload("Uploading: " + SAMPLE_VIDEO_FILENAME);
            mainFrame.model2.setValueAt("Upload Completed!", i, 4);
            // Add extra information to the video before uploading.
            Video videoObjectDefiningMetadata = new Video();

            // Set the video to be publicly visible. This is the default
            // setting. Other supporting settings are "unlisted" and "private.","public"
            VideoStatus status = new VideoStatus();
            status.setPrivacyStatus(Status);
            videoObjectDefiningMetadata.setStatus(status);

            // Most of the video's metadata is set on the VideoSnippet object.
            VideoSnippet snippet = new VideoSnippet();

            // This code uses a Calendar instance to create a unique name and
            // description for test purposes so that you can easily upload
            // multiple files. You should remove this code from your project
            // and use your own standard names instead.
            List<String> tags = new ArrayList<String>();
            snippet.setTitle(Title);
            snippet.setDescription(Description);
            String[] words = Tag.split(",");
            for (String w : words) {
                tags.add(w.toString());
                System.out.println(w);
            }
            tags.add("Zero tool");
            tags.add("Zero");
            snippet.setTags(tags);

            videoObjectDefiningMetadata.setSnippet(snippet);
            InputStream is = new FileInputStream(SAMPLE_VIDEO_FILEPATH);
            InputStreamContent mediaContent = new InputStreamContent(VIDEO_FILE_FORMAT, is);

            // Insert the video. The command sends three arguments. The first
            // specifies which information the API request is setting and which
            // information the API response should return. The second argument
            // is the video resource that contains metadata about the new video.
            // The third argument is the actual video content.
            YouTube.Videos.Insert videoInsert = youtube.videos()
                    .insert("snippet,statistics,status", videoObjectDefiningMetadata, mediaContent);

            // Set the upload type and add an event listener.
            MediaHttpUploader uploader = videoInsert.getMediaHttpUploader();

            // Indicate whether direct media upload is enabled. A value of
            // "True" indicates that direct media upload is enabled and that
            // the entire media content will be uploaded in a single request.
            // A value of "False," which is the default, indicates that the
            // request will use the resumable media upload protocol, which
            // supports the ability to resume an upload operation after a
            // network interruption or other transmission failure, saving
            // time and bandwidth in the event of network failures.
            uploader.setDirectUploadEnabled(false);

            MediaHttpUploaderProgressListener progressListener = new MediaHttpUploaderProgressListener() {
                public void progressChanged(MediaHttpUploader uploader) throws IOException {
                    switch (uploader.getUploadState()) {
                        case INITIATION_STARTED:

                            mainFrame.setConsoleUpload("Initiation Started");
                            mainFrame.model2.setValueAt("Initiation Started", i, 4);
                            break;
                        case INITIATION_COMPLETE:

                            mainFrame.setConsoleUpload("Initiation Completed");
                            mainFrame.model2.setValueAt("Initiation Completed", i, 4);
                            break;
                        case MEDIA_IN_PROGRESS:

                            mainFrame.setConsoleUpload("Upload in progress : " + uploader.getNumBytesUploaded() + "KB");
                            System.out.println("Upload in progress :" + uploader.getNumBytesUploaded() + "KB");
                            mainFrame.model2.setValueAt("Upload in progress", i, 4);
                            break;
                        case MEDIA_COMPLETE:

                            mainFrame.setConsoleUpload("Upload Completed!");
                            mainFrame.model2.setValueAt("Upload Completed!", i, 4);
                            break;
                        case NOT_STARTED:

                            mainFrame.setConsoleUpload("Upload Not Started!");
                            mainFrame.model2.setValueAt("Upload Not Started!", i, 4);
                            break;
                    }
                }
            };
            uploader.setProgressListener(progressListener);

            // Call the API and upload the video.
            Video returnedVideo = videoInsert.execute();

            // Print data about the newly inserted video from the API response.
            mainFrame.setConsoleUpload("\n================== Returned Video ==================\n");
            mainFrame.setConsoleUpload("  - Id: " + returnedVideo.getId());
            mainFrame.setConsoleUpload("  - Title: " + returnedVideo.getSnippet().getTitle());
            mainFrame.setConsoleUpload("  - Tags: " + returnedVideo.getSnippet().getTags());
            mainFrame.setConsoleUpload("  - Privacy Status: " + returnedVideo.getStatus().getPrivacyStatus());
            mainFrame.setConsoleUpload("  - Video Count: " + returnedVideo.getStatistics().getViewCount());

        } catch (GoogleJsonResponseException e) {
            JOptionPane.showMessageDialog(null, "GoogleJsonResponseException code: " + e.getDetails().getCode() + " : "
                    + e.getDetails().getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Throwable: " + t.getMessage());
            t.printStackTrace();
        }
    }
}
