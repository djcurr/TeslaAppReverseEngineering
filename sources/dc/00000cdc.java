package bp;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.d;
import java.util.Map;
import uo.e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final wo.c f7899a = new wo.c(wo.a.f56147o);

    private void a(byte[] bArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 + i13;
        int i16 = i14 == 0 ? 1 : 2;
        int[] iArr = new int[i15 / i16];
        for (int i17 = 0; i17 < i15; i17++) {
            if (i14 == 0 || i17 % 2 == i14 - 1) {
                iArr[i17 / i16] = bArr[i17 + i11] & 255;
            }
        }
        try {
            this.f7899a.a(iArr, i13 / i16);
            for (int i18 = 0; i18 < i12; i18++) {
                if (i14 == 0 || i18 % 2 == i14 - 1) {
                    bArr[i18 + i11] = (byte) iArr[i18 / i16];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public e b(uo.b bVar, Map<d, ?> map) {
        byte[] bArr;
        byte[] a11 = new a(bVar).a();
        a(a11, 0, 10, 10, 0);
        int i11 = a11[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            a(a11, 20, 84, 40, 1);
            a(a11, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i11 == 5) {
            a(a11, 20, 68, 56, 1);
            a(a11, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.a();
        }
        System.arraycopy(a11, 0, bArr, 0, 10);
        System.arraycopy(a11, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i11);
    }
}