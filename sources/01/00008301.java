package lc;

import bc.f;
import bc.i;
import cc.e;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class c implements qb.c {
    public static String e(int i11) {
        return new String(new byte[]{(byte) (((-16777216) & i11) >> 24), (byte) ((16711680 & i11) >> 16), (byte) ((65280 & i11) >> 8), (byte) (i11 & 255)});
    }

    private void f(cc.b bVar, int i11, i iVar) {
        int h11 = iVar.h(i11);
        if (h11 != 0) {
            bVar.R(i11, e(h11));
        }
    }

    private void g(b bVar, int i11, i iVar) {
        int s11 = iVar.s(i11);
        int s12 = iVar.s(i11 + 2);
        int s13 = iVar.s(i11 + 4);
        int s14 = iVar.s(i11 + 6);
        int s15 = iVar.s(i11 + 8);
        int s16 = iVar.s(i11 + 10);
        if (f.a(s11, s12 - 1, s13) && f.b(s14, s15, s16)) {
            bVar.R(i11, String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(s11), Integer.valueOf(s12), Integer.valueOf(s13), Integer.valueOf(s14), Integer.valueOf(s15), Integer.valueOf(s16)));
        } else {
            bVar.a(String.format("ICC data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", Integer.valueOf(s11), Integer.valueOf(s12), Integer.valueOf(s13), Integer.valueOf(s14), Integer.valueOf(s15), Integer.valueOf(s16)));
        }
    }

    private void h(cc.b bVar, int i11, i iVar) {
        int h11 = iVar.h(i11);
        if (h11 != 0) {
            bVar.J(i11, h11);
        }
    }

    private void i(cc.b bVar, int i11, i iVar) {
        long i12 = iVar.i(i11);
        if (i12 != 0) {
            bVar.L(i11, i12);
        }
    }

    @Override // qb.c
    public void a(Iterable<byte[]> iterable, e eVar, com.drew.imaging.jpeg.a aVar) {
        byte[] bArr = null;
        for (byte[] bArr2 : iterable) {
            if (bArr2.length >= 11 && "ICC_PROFILE".equalsIgnoreCase(new String(bArr2, 0, 11))) {
                if (bArr == null) {
                    bArr = new byte[bArr2.length - 14];
                    System.arraycopy(bArr2, 14, bArr, 0, bArr2.length - 14);
                } else {
                    byte[] bArr3 = new byte[(bArr.length + bArr2.length) - 14];
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                    System.arraycopy(bArr2, 14, bArr3, bArr.length, bArr2.length - 14);
                    bArr = bArr3;
                }
            }
        }
        if (bArr != null) {
            c(new bc.a(bArr), eVar);
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APP2);
    }

    public void c(i iVar, e eVar) {
        d(iVar, eVar, null);
    }

    public void d(i iVar, e eVar, cc.b bVar) {
        b bVar2 = new b();
        if (bVar != null) {
            bVar2.O(bVar);
        }
        try {
            bVar2.J(0, iVar.h(0));
            f(bVar2, 4, iVar);
            h(bVar2, 8, iVar);
            f(bVar2, 12, iVar);
            f(bVar2, 16, iVar);
            f(bVar2, 20, iVar);
            g(bVar2, 24, iVar);
            f(bVar2, 36, iVar);
            f(bVar2, 40, iVar);
            h(bVar2, 44, iVar);
            f(bVar2, 48, iVar);
            int h11 = iVar.h(52);
            if (h11 != 0) {
                if (h11 <= 538976288) {
                    bVar2.J(52, h11);
                } else {
                    bVar2.R(52, e(h11));
                }
            }
            h(bVar2, 64, iVar);
            i(bVar2, 56, iVar);
            bVar2.M(68, new float[]{iVar.o(68), iVar.o(72), iVar.o(76)});
            int h12 = iVar.h(128);
            bVar2.J(128, h12);
            for (int i11 = 0; i11 < h12; i11++) {
                int i12 = (i11 * 12) + 132;
                bVar2.C(iVar.h(i12), iVar.c(iVar.h(i12 + 4), iVar.h(i12 + 8)));
            }
        } catch (IOException e11) {
            bVar2.a("Exception reading ICC profile: " + e11.getMessage());
        }
        eVar.a(bVar2);
    }
}