package org.webrtc;

/* loaded from: classes4.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j11) {
        super(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}