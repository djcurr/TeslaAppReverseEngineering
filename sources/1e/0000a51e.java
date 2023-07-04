package org.webrtc;

/* loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j11) {
        super(j11);
    }

    private static native void nativeSetVolume(long j11, double d11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d11) {
        nativeSetVolume(getNativeAudioTrack(), d11);
    }
}