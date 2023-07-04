package org.webrtc;

import org.webrtc.EncodedImage;

/* loaded from: classes4.dex */
public interface VideoEncoder {

    /* loaded from: classes4.dex */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int[][] iArr;
            int i11 = 0;
            for (int[] iArr2 : this.bitratesBbs) {
                for (int i12 : iArr2) {
                    i11 += i12;
                }
            }
            return i11;
        }
    }

    /* loaded from: classes4.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes4.dex */
    public static class Capabilities {
        public final boolean lossNotification;

        @CalledByNative("Capabilities")
        public Capabilities(boolean z11) {
            this.lossNotification = z11;
        }
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: classes4.dex */
    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i11, boolean z11) {
            this.requestedResolutionAlignment = i11;
            this.applyAlignmentToAllSimulcastLayers = z11;
        }

        @CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        @CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    /* loaded from: classes4.dex */
    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        @CalledByNative("RateControlParameters")
        public RateControlParameters(BitrateAllocation bitrateAllocation, double d11) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d11;
        }
    }

    /* loaded from: classes4.dex */
    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i11, int i12, int i13, int i14) {
            this.frameSizePixels = i11;
            this.minStartBitrateBps = i12;
            this.minBitrateBps = i13;
            this.maxBitrateBps = i14;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    /* loaded from: classes4.dex */
    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
            this(i11, i12, i13, i14, i15, i16, z11, new Capabilities(false));
        }

        @CalledByNative("Settings")
        public Settings(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Capabilities capabilities) {
            this.numberOfCores = i11;
            this.width = i12;
            this.height = i13;
            this.startBitrate = i14;
            this.maxFramerate = i15;
            this.numberOfSimulcastStreams = i16;
            this.automaticResizeOn = z11;
            this.capabilities = capabilities;
        }
    }

    @CalledByNative
    default long createNativeVideoEncoder() {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    default EncoderInfo getEncoderInfo() {
        return new EncoderInfo(1, false);
    }

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    default ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new ResolutionBitrateLimits[0];
    }

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    default boolean isHardwareEncoder() {
        return true;
    }

    @CalledByNative
    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i11);

    @CalledByNative
    default VideoCodecStatus setRates(RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }

    /* loaded from: classes4.dex */
    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on  reason: collision with root package name */
        public final boolean f43896on;

        public ScalingSettings(int i11, int i12) {
            this.f43896on = true;
            this.low = Integer.valueOf(i11);
            this.high = Integer.valueOf(i12);
        }

        public String toString() {
            if (this.f43896on) {
                Integer num = this.low;
                Integer num2 = this.high;
                return "[ " + num + ", " + num2 + " ]";
            }
            return "OFF";
        }

        private ScalingSettings() {
            this.f43896on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z11) {
            this.f43896on = z11;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z11, int i11, int i12) {
            this.f43896on = z11;
            this.low = Integer.valueOf(i11);
            this.high = Integer.valueOf(i12);
        }
    }
}