package RTP_example;

import live555.Live555Wrapper;

public class Live555Example {
    public static void main(String[] args) {
        try {
            // Initialize Live555 using the Java wrapper
            Live555Wrapper.init();

            // Create an RTSP server
            Live555Wrapper.RtspServer rtspServer = new Live555Wrapper.RtspServer(8554);

            // Create a media stream
            Live555Wrapper.MediaStream mediaStream = rtspServer.createMediaStream("video");

            // Add your media data to the stream (e.g., video frames)

            // Start the RTSP server
            rtspServer.start();

            // Wait for connections and handle requests

            // Stop the RTSP server and release resources
            rtspServer.stop();
            Live555Wrapper.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
