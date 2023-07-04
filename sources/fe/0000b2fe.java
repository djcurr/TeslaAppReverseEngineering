package sx;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public class a {
    private static long a(int i11, String[] strArr, long j11) {
        return (strArr[i11 / 8191].charAt(i11 % 8191) << 32) ^ b.a(j11);
    }

    public static String b(long j11, String[] strArr) {
        long a11 = b.a(b.c(4294967295L & j11));
        long j12 = (a11 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        long a12 = b.a(a11);
        int i11 = (int) (((j11 >>> 32) ^ j12) ^ ((a12 >>> 16) & (-65536)));
        long a13 = a(i11, strArr, a12);
        int i12 = (int) ((a13 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        char[] cArr = new char[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            a13 = a(i11 + i13 + 1, strArr, a13);
            cArr[i13] = (char) ((a13 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        }
        return new String(cArr);
    }
}