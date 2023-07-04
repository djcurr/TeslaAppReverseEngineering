package n60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class b implements h {
    @Override // n60.h
    public i a(i iVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || iVar.u()) {
            return iVar.i().u();
        }
        i c11 = c(iVar, bigInteger.abs());
        if (signum <= 0) {
            c11 = c11.z();
        }
        return b(c11);
    }

    protected i b(i iVar) {
        return c.b(iVar);
    }

    protected abstract i c(i iVar, BigInteger bigInteger);
}