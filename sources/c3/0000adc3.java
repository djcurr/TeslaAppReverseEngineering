package qc;

import bc.l;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class j implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            c(bArr, eVar, aVar);
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.DNL);
    }

    public void c(byte[] bArr, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        i iVar = (i) eVar.e(i.class);
        if (iVar == null) {
            cc.c cVar = new cc.c();
            eVar.a(cVar);
            cVar.a("DNL segment found without SOFx - illegal JPEG format");
            return;
        }
        l lVar = new l(bArr);
        try {
            Integer l11 = iVar.l(1);
            if (l11 == null || l11.intValue() == 0) {
                iVar.J(1, lVar.p());
            }
        } catch (IOException e11) {
            iVar.a(e11.getMessage());
        }
    }
}