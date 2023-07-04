package vb;

import bc.n;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c {
    public static void a(InputStream inputStream, a aVar) {
        n nVar = new n(inputStream);
        nVar.s(true);
        b(nVar, -1L, aVar);
    }

    private static void b(n nVar, long j11, a aVar) {
        while (true) {
            if (j11 != -1) {
                try {
                    if (nVar.l() >= j11) {
                        return;
                    }
                } catch (IOException e11) {
                    aVar.a(e11.getMessage());
                    return;
                }
            }
            sc.a aVar2 = new sc.a(nVar);
            if (aVar.f(aVar2)) {
                b(nVar, (aVar2.f50323a + nVar.l()) - 8, aVar.d(aVar2));
            } else if (aVar.e(aVar2)) {
                aVar = aVar.c(aVar2, nVar.d(((int) aVar2.f50323a) - 8));
            } else {
                long j12 = aVar2.f50323a;
                if (j12 > 1) {
                    nVar.t(j12 - 8);
                } else if (j12 == -1) {
                    return;
                }
            }
        }
    }
}