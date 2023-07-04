package zc;

import bc.m;
import java.io.IOException;

/* loaded from: classes.dex */
public class j {
    public void a(m mVar, cc.e eVar) {
        i iVar = new i();
        eVar.a(iVar);
        try {
            if (mVar.f() != 943870035) {
                iVar.a("Invalid PSD file signature");
                return;
            }
            int p11 = mVar.p();
            if (p11 != 1 && p11 != 2) {
                iVar.a("Invalid PSD file version (must be 1 or 2)");
                return;
            }
            mVar.t(6L);
            iVar.J(1, mVar.p());
            iVar.J(2, mVar.f());
            iVar.J(3, mVar.f());
            iVar.J(4, mVar.p());
            iVar.J(5, mVar.p());
            try {
                mVar.t(mVar.q());
                new f().c(mVar, (int) mVar.q(), eVar);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            iVar.a("Unable to read PSD header");
        }
    }
}