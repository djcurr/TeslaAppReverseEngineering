package org.webrtc;

import org.webrtc.VideoDecoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    @CalledByNative
    static VideoDecoder.Callback createDecoderCallback(final long j11) {
        return new VideoDecoder.Callback() { // from class: org.webrtc.a1
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j11, videoFrame, num, num2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j11, VideoFrame videoFrame, Integer num, Integer num2);
}