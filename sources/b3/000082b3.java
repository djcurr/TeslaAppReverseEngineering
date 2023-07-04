package l6;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class d {
    public static a a(a aVar) {
        if ("UTF-8".equals(aVar.g())) {
            byte[] bArr = new byte[8];
            a aVar2 = new a((aVar.h() * 4) / 3);
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            int i13 = 0;
            while (i11 < aVar.h()) {
                int d11 = aVar.d(i11);
                if (z11) {
                    if (i12 <= 0 || (d11 & 192) != 128) {
                        aVar2.b(b(bArr[0]));
                        i11 -= i13;
                    } else {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) d11;
                        i12--;
                        if (i12 == 0) {
                            aVar2.c(bArr, 0, i14);
                        } else {
                            i13 = i14;
                        }
                    }
                    z11 = false;
                    i13 = 0;
                } else if (d11 < 127) {
                    aVar2.a((byte) d11);
                } else if (d11 >= 192) {
                    i12 = -1;
                    for (int i15 = d11; i12 < 8 && (i15 & 128) == 128; i15 <<= 1) {
                        i12++;
                    }
                    bArr[i13] = (byte) d11;
                    i13++;
                    z11 = true;
                } else {
                    aVar2.b(b((byte) d11));
                }
                i11++;
            }
            if (z11) {
                for (int i16 = 0; i16 < i13; i16++) {
                    aVar2.b(b(bArr[i16]));
                }
            }
            return aVar2;
        }
        return aVar;
    }

    private static byte[] b(byte b11) {
        int i11 = b11 & 255;
        if (i11 >= 128) {
            try {
                return (i11 == 129 || i11 == 141 || i11 == 143 || i11 == 144 || i11 == 157) ? new byte[]{32} : new String(new byte[]{b11}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b11};
    }
}