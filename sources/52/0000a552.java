package org.webrtc;

/* loaded from: classes4.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    /* loaded from: classes4.dex */
    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        private Builder() {
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z11) {
            this.enableAes128Sha1_32CryptoCipher = z11;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z11) {
            this.enableEncryptedRtpHeaderExtensions = z11;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z11) {
            this.enableGcmCryptoSuites = z11;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z11) {
            this.requireFrameEncryption = z11;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public final class SFrame {
        private final boolean requireFrameEncryption;

        private SFrame(boolean z11) {
            this.requireFrameEncryption = z11;
        }

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }
    }

    /* loaded from: classes4.dex */
    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        private Srtp(boolean z11, boolean z12, boolean z13) {
            this.enableGcmCryptoSuites = z11;
            this.enableAes128Sha1_32CryptoCipher = z12;
            this.enableEncryptedRtpHeaderExtensions = z13;
        }

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }
    }

    private CryptoOptions(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.srtp = new Srtp(z11, z12, z13);
        this.sframe = new SFrame(z14);
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }
}