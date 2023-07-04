package org.webrtc;

/* loaded from: classes4.dex */
public interface VideoProcessor extends CapturerObserver {

    /* loaded from: classes4.dex */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i11, int i12, int i13, int i14, int i15, int i16, long j11, boolean z11) {
            this.cropX = i11;
            this.cropY = i12;
            this.cropWidth = i13;
            this.cropHeight = i14;
            this.scaleWidth = i15;
            this.scaleHeight = i16;
            this.timestampNs = j11;
            this.drop = z11;
        }
    }

    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame applyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        }
    }

    void setSink(VideoSink videoSink);
}