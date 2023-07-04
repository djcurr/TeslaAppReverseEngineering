package okio;

import java.util.Arrays;
import okio.i;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f42632a;

    static {
        i.a aVar = i.f42657e;
        f42632a = aVar.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").h();
        aVar.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").h();
    }

    public static final byte[] a(String decodeBase64ToArray) {
        int i11;
        char charAt;
        kotlin.jvm.internal.s.g(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((charAt = decodeBase64ToArray.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i12 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char charAt2 = decodeBase64ToArray.charAt(i16);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i11 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i11 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i11 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i11 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i11 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i14 = (i14 << 6) | i11;
            i13++;
            if (i13 % 4 == 0) {
                int i17 = i15 + 1;
                bArr[i15] = (byte) (i14 >> 16);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (i14 >> 8);
                bArr[i18] = (byte) i14;
                i15 = i18 + 1;
            }
        }
        int i19 = i13 % 4;
        if (i19 != 1) {
            if (i19 == 2) {
                bArr[i15] = (byte) ((i14 << 12) >> 16);
                i15++;
            } else if (i19 == 3) {
                int i21 = i14 << 6;
                int i22 = i15 + 1;
                bArr[i15] = (byte) (i21 >> 16);
                i15 = i22 + 1;
                bArr[i22] = (byte) (i21 >> 8);
            }
            if (i15 == i12) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i15);
            kotlin.jvm.internal.s.f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }

    public static final String b(byte[] encodeBase64, byte[] map) {
        kotlin.jvm.internal.s.g(encodeBase64, "$this$encodeBase64");
        kotlin.jvm.internal.s.g(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 + 1;
            byte b11 = encodeBase64[i11];
            int i14 = i13 + 1;
            byte b12 = encodeBase64[i13];
            int i15 = i14 + 1;
            byte b13 = encodeBase64[i14];
            int i16 = i12 + 1;
            bArr[i12] = map[(b11 & 255) >> 2];
            int i17 = i16 + 1;
            bArr[i16] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            int i18 = i17 + 1;
            bArr[i17] = map[((b12 & 15) << 2) | ((b13 & 255) >> 6)];
            i12 = i18 + 1;
            bArr[i18] = map[b13 & 63];
            i11 = i15;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b14 = encodeBase64[i11];
            int i19 = i12 + 1;
            bArr[i12] = map[(b14 & 255) >> 2];
            int i21 = i19 + 1;
            bArr[i19] = map[(b14 & 3) << 4];
            byte b15 = (byte) 61;
            bArr[i21] = b15;
            bArr[i21 + 1] = b15;
        } else if (length2 == 2) {
            int i22 = i11 + 1;
            byte b16 = encodeBase64[i11];
            byte b17 = encodeBase64[i22];
            int i23 = i12 + 1;
            bArr[i12] = map[(b16 & 255) >> 2];
            int i24 = i23 + 1;
            bArr[i23] = map[((b16 & 3) << 4) | ((b17 & 255) >> 4)];
            bArr[i24] = map[(b17 & 15) << 2];
            bArr[i24 + 1] = (byte) 61;
        }
        return b.b(bArr);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr2 = f42632a;
        }
        return b(bArr, bArr2);
    }
}