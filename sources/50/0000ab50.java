package pp;

/* loaded from: classes2.dex */
public class b {
    public static int a(long j11) {
        if (j11 > 2147483647L || j11 < -2147483648L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + j11 + ")");
        }
        return (int) j11;
    }
}