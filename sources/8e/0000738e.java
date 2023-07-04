package hl;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import ol.c0;
import ol.d0;
import ol.i0;
import ol.y;
import ol.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s {
    static {
        Charset.forName("UTF-8");
    }

    public static d0.c a(c0.c cVar) {
        return d0.c.I().q(cVar.H().I()).p(cVar.K()).o(cVar.J()).n(cVar.I()).build();
    }

    public static d0 b(c0 c0Var) {
        d0.b o11 = d0.I().o(c0Var.K());
        for (c0.c cVar : c0Var.J()) {
            o11.n(a(cVar));
        }
        return o11.build();
    }

    public static void c(c0.c cVar) {
        if (cVar.L()) {
            if (cVar.J() != i0.UNKNOWN_PREFIX) {
                if (cVar.K() == z.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.I())));
                }
                return;
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.I())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.I())));
    }

    public static void d(c0 c0Var) {
        int K = c0Var.K();
        boolean z11 = true;
        int i11 = 0;
        boolean z12 = false;
        for (c0.c cVar : c0Var.J()) {
            if (cVar.K() == z.ENABLED) {
                c(cVar);
                if (cVar.I() == K) {
                    if (z12) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z12 = true;
                }
                if (cVar.H().H() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z12 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}