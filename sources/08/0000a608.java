package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes4.dex */
public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    /* loaded from: classes4.dex */
    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    @CalledByNative
    public RtpReceiver(long j11) {
        this.nativeRtpReceiver = j11;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j11));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j11);

    private static native RtpParameters nativeGetParameters(long j11);

    private static native long nativeGetTrack(long j11);

    private static native void nativeSetFrameDecryptor(long j11, long j12);

    private static native long nativeSetObserver(long j11, Observer observer);

    private static native void nativeUnsetObserver(long j11, long j12);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j11 = this.nativeObserver;
        if (j11 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j11);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j11 = this.nativeObserver;
        if (j11 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j11);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}