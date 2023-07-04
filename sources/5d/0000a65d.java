package org.webrtc;

import org.webrtc.VideoProcessor;

/* loaded from: classes4.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    /* loaded from: classes4.dex */
    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }
    }

    public VideoSource(long j11) {
        super(j11);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: org.webrtc.VideoSource.1
            {
                VideoSource.this = this;
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z11) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z11);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = z11;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStarted(z11);
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = false;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                VideoProcessor.FrameAdaptationParameters adaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, adaptFrame);
                        return;
                    }
                    VideoFrame applyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(videoFrame, adaptFrame);
                    if (applyFrameAdaptationParameters != null) {
                        VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(applyFrameAdaptationParameters);
                        applyFrameAdaptationParameters.release();
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j11);
    }

    public static /* synthetic */ void b(VideoSource videoSource, VideoFrame videoFrame) {
        videoSource.lambda$setVideoProcessor$0(videoFrame);
    }

    public static /* synthetic */ void c(VideoSource videoSource, VideoFrame videoFrame) {
        videoSource.lambda$setVideoProcessor$1(videoFrame);
    }

    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    public /* synthetic */ void lambda$setVideoProcessor$1(final VideoFrame videoFrame) {
        runWithReference(new Runnable() { // from class: org.webrtc.h1
            {
                VideoSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoSource.b(VideoSource.this, videoFrame);
            }
        });
    }

    public void adaptOutputFormat(int i11, int i12, int i13) {
        int max = Math.max(i11, i12);
        int min = Math.min(i11, i12);
        adaptOutputFormat(max, min, min, max, i13);
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z11) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z11);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            VideoProcessor videoProcessor2 = this.videoProcessor;
            if (videoProcessor2 != null) {
                videoProcessor2.setSink(null);
                if (this.isCapturerRunning) {
                    this.videoProcessor.onCapturerStopped();
                }
            }
            this.videoProcessor = videoProcessor;
            if (videoProcessor != null) {
                videoProcessor.setSink(new VideoSink() { // from class: org.webrtc.i1
                    {
                        VideoSource.this = this;
                    }

                    @Override // org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        VideoSource.c(VideoSource.this, videoFrame);
                    }
                });
                if (this.isCapturerRunning) {
                    videoProcessor.onCapturerStarted(true);
                }
            }
        }
    }

    public void adaptOutputFormat(int i11, int i12, int i13, int i14, int i15) {
        adaptOutputFormat(new AspectRatio(i11, i12), Integer.valueOf(i11 * i12), new AspectRatio(i13, i14), Integer.valueOf(i13 * i14), Integer.valueOf(i15));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}