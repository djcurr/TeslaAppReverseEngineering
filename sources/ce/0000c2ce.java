package yo;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final wo.c f59658a = new wo.c(wo.a.f56145m);

    private void a(byte[] bArr, int i11) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        try {
            this.f59658a.a(iArr, bArr.length - i11);
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i13] = (byte) iArr[i13];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public uo.e b(uo.b bVar) {
        a aVar = new a(bVar);
        b[] b11 = b.b(aVar.c(), aVar.b());
        int i11 = 0;
        for (b bVar2 : b11) {
            i11 += bVar2.c();
        }
        byte[] bArr = new byte[i11];
        int length = b11.length;
        for (int i12 = 0; i12 < length; i12++) {
            b bVar3 = b11[i12];
            byte[] a11 = bVar3.a();
            int c11 = bVar3.c();
            a(a11, c11);
            for (int i13 = 0; i13 < c11; i13++) {
                bArr[(i13 * length) + i12] = a11[i13];
            }
        }
        return c.a(bArr);
    }
}