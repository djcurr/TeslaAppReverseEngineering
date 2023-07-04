package qc;

import bc.l;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class k implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            c(bArr, eVar, aVar);
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Arrays.asList(com.drew.imaging.jpeg.a.SOF0, com.drew.imaging.jpeg.a.SOF1, com.drew.imaging.jpeg.a.SOF2, com.drew.imaging.jpeg.a.SOF3, com.drew.imaging.jpeg.a.SOF5, com.drew.imaging.jpeg.a.SOF6, com.drew.imaging.jpeg.a.SOF7, com.drew.imaging.jpeg.a.SOF9, com.drew.imaging.jpeg.a.SOF10, com.drew.imaging.jpeg.a.SOF11, com.drew.imaging.jpeg.a.SOF13, com.drew.imaging.jpeg.a.SOF14, com.drew.imaging.jpeg.a.SOF15);
    }

    public void c(byte[] bArr, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        i iVar = new i();
        eVar.a(iVar);
        iVar.J(-3, aVar.byteValue - com.drew.imaging.jpeg.a.SOF0.byteValue);
        l lVar = new l(bArr);
        try {
            iVar.J(0, lVar.r());
            iVar.J(1, lVar.p());
            iVar.J(3, lVar.p());
            short r11 = lVar.r();
            iVar.J(5, r11);
            for (int i11 = 0; i11 < r11; i11++) {
                iVar.M(i11 + 6, new f(lVar.r(), lVar.r(), lVar.r()));
            }
        } catch (IOException e11) {
            iVar.a(e11.getMessage());
        }
    }
}