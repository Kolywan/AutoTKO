package com.base.common;

import com.teamdev.jxcapture.Codec;
import com.teamdev.jxcapture.EncodingParameters;
import com.teamdev.jxcapture.VideoCapture;
import com.teamdev.jxcapture.video.Desktop;

import java.awt.*;
import java.io.File;

public class ScreenRecorder {
    public static void startVideo() throws Exception {
        VideoCapture videoCapture = VideoCapture.create();
        videoCapture.setVideoSource(new Desktop());

        java.util.List<Codec> videoCodecs = videoCapture.getVideoCodecs();
        Codec videoCodec = videoCodecs.get(0);
        System.out.println("videoCodec = " + videoCodec);

        EncodingParameters encodingParameters = new EncodingParameters(new File("C:\\01\\" + videoCapture.getVideoFormat().getId()));
        // Resize output video
        encodingParameters.setSize(new Dimension(800, 600));
        encodingParameters.setBitrate(800000);
        encodingParameters.setFramerate(10);
        encodingParameters.setCodec(videoCodec);
        System.out.println("encodingParameters = " + encodingParameters);

        videoCapture.setEncodingParameters(encodingParameters);
        videoCapture.start();

        System.out.println("Recording started. Press 'Enter' to terminate.");
        
       // System.in.read();
       
        
        Thread.sleep(10000);
        videoCapture.stop();
        System.out.println("Done.");
    }
}