package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long j11) {
        this.nativeAndroidVideoTrackSource = j11;
    }

    @CalledByNative
    static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i11, int i12, int i13, int i14, int i15, int i16, long j11, boolean z11) {
        return new VideoProcessor.FrameAdaptationParameters(i11, i12, i13, i14, i15, i16, j11, z11);
    }

    private static native VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j11, int i11, int i12, int i13, long j12);

    private static native void nativeAdaptOutputFormat(long j11, int i11, int i12, Integer num, int i13, int i14, Integer num2, Integer num3);

    private static native void nativeOnFrameCaptured(long j11, int i11, long j12, VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j11, boolean z11);

    private static native void nativeSetState(long j11, boolean z11);

    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, Integer num, VideoSource.AspectRatio aspectRatio2, Integer num2, Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z11) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z11);
    }

    public void setState(boolean z11) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z11);
    }
}