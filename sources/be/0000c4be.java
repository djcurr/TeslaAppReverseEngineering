package zc;

import bc.l;
import bc.m;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class b implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 5 && "Ducky".equals(new String(bArr, 0, 5))) {
                c(new l(bArr, 5), eVar);
            }
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APPC);
    }

    public void c(m mVar, cc.e eVar) {
        a aVar = new a();
        eVar.a(aVar);
        while (true) {
            try {
                int p11 = mVar.p();
                if (p11 == 0) {
                    return;
                }
                int p12 = mVar.p();
                if (p11 != 1) {
                    if (p11 != 2 && p11 != 3) {
                        aVar.C(p11, mVar.d(p12));
                    } else {
                        mVar.t(4L);
                        aVar.T(p11, mVar.o(p12 - 4, bc.e.f7599d));
                    }
                } else if (p12 != 4) {
                    aVar.a("Unexpected length for the quality tag");
                    return;
                } else {
                    aVar.J(p11, mVar.f());
                }
            } catch (IOException e11) {
                aVar.a(e11.getMessage());
                return;
            }
        }
    }
}