package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class MediaStream {
    private static final String TAG = "MediaStream";
    private long nativeStream;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    @CalledByNative
    public MediaStream(long j11) {
        this.nativeStream = j11;
    }

    private void checkMediaStreamExists() {
        if (this.nativeStream == 0) {
            throw new IllegalStateException("MediaStream has been disposed.");
        }
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long j11, long j12);

    private static native boolean nativeAddVideoTrackToNativeStream(long j11, long j12);

    private static native String nativeGetId(long j11);

    private static native boolean nativeRemoveAudioTrack(long j11, long j12);

    private static native boolean nativeRemoveVideoTrack(long j11, long j12);

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j11) {
        Iterator<? extends MediaStreamTrack> it2 = list.iterator();
        while (it2.hasNext()) {
            MediaStreamTrack next = it2.next();
            if (next.getNativeMediaStreamTrack() == j11) {
                next.dispose();
                it2.remove();
                return;
            }
        }
        Logging.e(TAG, "Couldn't not find track");
    }

    @CalledByNative
    void addNativeAudioTrack(long j11) {
        this.audioTracks.add(new AudioTrack(j11));
    }

    @CalledByNative
    void addNativeVideoTrack(long j11) {
        this.videoTracks.add(new VideoTrack(j11));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.preservedVideoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeAudioTrack())) {
            this.audioTracks.add(audioTrack);
            return true;
        }
        return false;
    }

    @CalledByNative
    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    @CalledByNative
    void removeAudioTrack(long j11) {
        removeMediaStreamTrack(this.audioTracks, j11);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeAudioTrack());
    }

    @CalledByNative
    void removeVideoTrack(long j11) {
        removeMediaStreamTrack(this.videoTracks, j11);
    }

    public String toString() {
        String id2 = getId();
        int size = this.audioTracks.size();
        int size2 = this.videoTracks.size();
        return "[" + id2 + ":A=" + size + ":V=" + size2 + "]";
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.videoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeVideoTrack());
    }
}