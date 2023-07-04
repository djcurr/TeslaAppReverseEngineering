package rb;

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
            wc.b bVar = new wc.b(nVar);
            if (aVar.f(bVar)) {
                b(nVar, (bVar.f55747a + nVar.l()) - 8, aVar.d(bVar));
            } else if (aVar.e(bVar)) {
                aVar = aVar.c(bVar, nVar.d(((int) bVar.f55747a) - 8));
            } else if (bVar.f55749c != null) {
                nVar.t(bVar.f55747a - 24);
            } else {
                long j12 = bVar.f55747a;
                if (j12 > 1) {
                    nVar.t(j12 - 8);
                } else if (j12 == -1) {
                    return;
                }
            }
        }
    }
}