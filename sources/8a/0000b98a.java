package v60;

/* loaded from: classes5.dex */
public abstract class a {
    public static int a(int i11, int i12, int i13) {
        int i14 = i12 & ((i11 >>> i13) ^ i11);
        return i11 ^ (i14 ^ (i14 << i13));
    }

    public static long b(long j11, long j12, int i11) {
        long j13 = j12 & ((j11 >>> i11) ^ j11);
        return j11 ^ (j13 ^ (j13 << i11));
    }
}