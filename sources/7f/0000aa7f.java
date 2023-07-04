package pc;

import bc.i;
import cc.e;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class c implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 4 && "JFXX".equals(new String(bArr, 0, 4))) {
                c(new bc.a(bArr), eVar);
            }
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APP0);
    }

    public void c(i iVar, e eVar) {
        b bVar = new b();
        eVar.a(bVar);
        try {
            bVar.J(5, iVar.u(5));
        } catch (IOException e11) {
            bVar.a(e11.getMessage());
        }
    }
}