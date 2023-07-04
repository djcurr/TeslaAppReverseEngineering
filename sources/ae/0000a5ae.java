package org.webrtc;

/* loaded from: classes4.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* loaded from: classes4.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        static State fromNativeIndex(int i11) {
            return values()[i11];
        }
    }

    public MediaSource(final long j11) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.f0
            @Override // java.lang.Runnable
            public final void run() {
                MediaSource.a(j11);
            }
        });
        this.nativeSource = j11;
    }

    public static /* synthetic */ void a(long j11) {
        JniCommon.nativeReleaseRef(j11);
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j11);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}