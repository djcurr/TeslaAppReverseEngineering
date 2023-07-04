package org.webrtc;

/* loaded from: classes4.dex */
public interface VideoDecoder {

    /* loaded from: classes4.dex */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* loaded from: classes4.dex */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z11, long j11) {
            this.isMissingFrames = z11;
            this.renderTimeMs = j11;
        }
    }

    /* loaded from: classes4.dex */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i11, int i12, int i13) {
            this.numberOfCores = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    @CalledByNative
    default long createNativeVideoDecoder() {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    VideoCodecStatus release();
}