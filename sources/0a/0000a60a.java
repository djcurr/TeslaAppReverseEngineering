package org.webrtc;

import java.util.List;

/* loaded from: classes4.dex */
public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    @CalledByNative
    public RtpSender(long j11) {
        this.nativeRtpSender = j11;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j11));
        long nativeGetDtmfSender = nativeGetDtmfSender(j11);
        this.dtmfSender = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new IllegalStateException("RtpSender has been disposed.");
        }
    }

    private static native long nativeGetDtmfSender(long j11);

    private static native String nativeGetId(long j11);

    private static native RtpParameters nativeGetParameters(long j11);

    private static native List<String> nativeGetStreams(long j11);

    private static native long nativeGetTrack(long j11);

    private static native void nativeSetFrameEncryptor(long j11, long j12);

    private static native boolean nativeSetParameters(long j11, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j11, List<String> list);

    private static native boolean nativeSetTrack(long j11, long j12);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z11) {
        checkRtpSenderExists();
        if (nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack())) {
            MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
            if (mediaStreamTrack2 != null && this.ownsTrack) {
                mediaStreamTrack2.dispose();
            }
            this.cachedTrack = mediaStreamTrack;
            this.ownsTrack = z11;
            return true;
        }
        return false;
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}