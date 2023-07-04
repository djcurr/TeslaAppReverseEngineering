package fc;

import bc.m;
import cc.e;
import com.drew.metadata.MetadataException;
import fc.b;
import java.io.IOException;

/* loaded from: classes.dex */
public class c {
    protected void a(String str, e eVar) {
        cc.c cVar = (cc.c) eVar.e(cc.c.class);
        if (cVar == null) {
            eVar.a(new cc.c(str));
        } else {
            cVar.a(str);
        }
    }

    public void b(m mVar, e eVar) {
        mVar.s(false);
        d(mVar, eVar, true);
    }

    protected void c(m mVar, b bVar, e eVar) {
        try {
            int j11 = bVar.j(-2);
            long l11 = mVar.l();
            int f11 = mVar.f();
            bVar.J(-1, f11);
            if (f11 == 12 && j11 == 19778) {
                bVar.J(2, mVar.e());
                bVar.J(1, mVar.e());
                bVar.J(3, mVar.p());
                bVar.J(4, mVar.p());
            } else if (f11 == 12) {
                bVar.J(2, mVar.p());
                bVar.J(1, mVar.p());
                bVar.J(3, mVar.p());
                bVar.J(4, mVar.p());
            } else {
                if (f11 != 16 && f11 != 64) {
                    if (f11 != 40 && f11 != 52 && f11 != 56 && f11 != 108 && f11 != 124) {
                        bVar.a("Unexpected DIB header size: " + f11);
                        return;
                    }
                    bVar.J(2, mVar.f());
                    bVar.J(1, mVar.f());
                    bVar.J(3, mVar.p());
                    bVar.J(4, mVar.p());
                    bVar.J(5, mVar.f());
                    mVar.t(4L);
                    bVar.J(6, mVar.f());
                    bVar.J(7, mVar.f());
                    bVar.J(8, mVar.f());
                    bVar.J(9, mVar.f());
                    if (f11 == 40) {
                        return;
                    }
                    bVar.L(12, mVar.q());
                    bVar.L(13, mVar.q());
                    bVar.L(14, mVar.q());
                    if (f11 == 52) {
                        return;
                    }
                    bVar.L(15, mVar.q());
                    if (f11 == 56) {
                        return;
                    }
                    long q11 = mVar.q();
                    bVar.L(16, q11);
                    mVar.t(36L);
                    bVar.L(17, mVar.q());
                    bVar.L(18, mVar.q());
                    bVar.L(19, mVar.q());
                    if (f11 == 108) {
                        return;
                    }
                    bVar.J(20, mVar.f());
                    if (q11 != b.d.PROFILE_EMBEDDED.getValue() && q11 != b.d.PROFILE_LINKED.getValue()) {
                        mVar.t(12L);
                        return;
                    }
                    long q12 = mVar.q();
                    int f12 = mVar.f();
                    long j12 = q12 + l11;
                    if (mVar.l() > j12) {
                        bVar.a("Invalid profile data offset 0x" + Long.toHexString(j12));
                        return;
                    }
                    mVar.t(j12 - mVar.l());
                    if (q11 == b.d.PROFILE_LINKED.getValue()) {
                        bVar.R(21, mVar.j(f12, bc.e.f7601f));
                        return;
                    }
                    new lc.c().d(new bc.a(mVar.d(f12)), eVar, bVar);
                    return;
                }
                bVar.J(2, mVar.f());
                bVar.J(1, mVar.f());
                bVar.J(3, mVar.p());
                bVar.J(4, mVar.p());
                if (f11 > 16) {
                    bVar.J(5, mVar.f());
                    mVar.t(4L);
                    bVar.J(6, mVar.f());
                    bVar.J(7, mVar.f());
                    bVar.J(8, mVar.f());
                    bVar.J(9, mVar.f());
                    mVar.t(6L);
                    bVar.J(10, mVar.p());
                    mVar.t(8L);
                    bVar.J(11, mVar.f());
                    mVar.t(4L);
                }
            }
        } catch (MetadataException unused) {
            bVar.a("Internal error");
        } catch (IOException unused2) {
            bVar.a("Unable to read BMP header");
        }
    }

    protected void d(m mVar, e eVar, boolean z11) {
        try {
            int p11 = mVar.p();
            b bVar = null;
            try {
                if (p11 == 16706) {
                    if (!z11) {
                        a("Invalid bitmap file - nested arrays not allowed", eVar);
                        return;
                    }
                    mVar.t(4L);
                    long q11 = mVar.q();
                    mVar.t(4L);
                    d(mVar, eVar, false);
                    if (q11 == 0) {
                        return;
                    }
                    if (mVar.l() > q11) {
                        a("Invalid next header offset", eVar);
                        return;
                    }
                    mVar.t(q11 - mVar.l());
                    d(mVar, eVar, true);
                } else if (p11 != 17225 && p11 != 18755 && p11 != 19778 && p11 != 20547 && p11 != 21584) {
                    eVar.a(new cc.c("Invalid BMP magic number 0x" + Integer.toHexString(p11)));
                } else {
                    b bVar2 = new b();
                    try {
                        eVar.a(bVar2);
                        bVar2.J(-2, p11);
                        mVar.t(12L);
                        c(mVar, bVar2, eVar);
                    } catch (IOException unused) {
                        bVar = bVar2;
                        if (bVar == null) {
                            a("Unable to read BMP file header", eVar);
                        } else {
                            bVar.a("Unable to read BMP file header");
                        }
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (IOException e11) {
            eVar.a(new cc.c("Couldn't determine bitmap type: " + e11.getMessage()));
        }
    }
}