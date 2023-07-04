package hc;

import com.drew.imaging.tiff.TiffProcessingException;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class i implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 6 && new String(bArr, 0, 6).equals("Exif\u0000\u0000")) {
                d(new bc.a(bArr), eVar, 6);
            }
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APP1);
    }

    public void c(bc.i iVar, cc.e eVar) {
        d(iVar, eVar, 0);
    }

    public void d(bc.i iVar, cc.e eVar, int i11) {
        e(iVar, eVar, i11, null);
    }

    public void e(bc.i iVar, cc.e eVar, int i11, cc.b bVar) {
        n nVar = new n(eVar, bVar);
        try {
            new yb.d().d(iVar, nVar, i11);
        } catch (TiffProcessingException e11) {
            nVar.error("Exception processing TIFF data: " + e11.getMessage());
            e11.printStackTrace(System.err);
        } catch (IOException e12) {
            nVar.error("Exception processing TIFF data: " + e12.getMessage());
            e12.printStackTrace(System.err);
        }
    }
}