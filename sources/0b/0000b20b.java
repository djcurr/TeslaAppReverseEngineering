package s30;

import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f50237a;

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f50238b;

    static {
        Charset charset = r30.a.f49124a;
        f50237a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        f50238b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static char[] a(byte[] bArr) {
        return b(bArr, true);
    }

    public static char[] b(byte[] bArr, boolean z11) {
        return c(bArr, z11 ? f50237a : f50238b);
    }

    protected static char[] c(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i11 + 1;
            cArr2[i11] = cArr[(bArr[i12] & 240) >>> 4];
            i11 = i13 + 1;
            cArr2[i13] = cArr[bArr[i12] & 15];
        }
        return cArr2;
    }
}