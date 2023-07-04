package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Histogram {
    private final long handle;

    private Histogram(long j11) {
        this.handle = j11;
    }

    public static Histogram createCounts(String str, int i11, int i12, int i13) {
        return new Histogram(nativeCreateCounts(str, i11, i12, i13));
    }

    public static Histogram createEnumeration(String str, int i11) {
        return new Histogram(nativeCreateEnumeration(str, i11));
    }

    private static native void nativeAddSample(long j11, int i11);

    private static native long nativeCreateCounts(String str, int i11, int i12, int i13);

    private static native long nativeCreateEnumeration(String str, int i11);

    public void addSample(int i11) {
        nativeAddSample(this.handle, i11);
    }
}