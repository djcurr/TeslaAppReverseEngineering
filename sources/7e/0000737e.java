package hl;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import ol.a0;
import ol.c0;
import ol.i0;
import ol.y;
import ol.z;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final c0.b f29324a;

    private j(c0.b bVar) {
        this.f29324a = bVar;
    }

    private synchronized boolean d(int i11) {
        for (c0.c cVar : this.f29324a.q()) {
            if (cVar.I() == i11) {
                return true;
            }
        }
        return false;
    }

    private synchronized c0.c e(a0 a0Var) {
        y p11;
        int f11;
        i0 H;
        p11 = r.p(a0Var);
        f11 = f();
        H = a0Var.H();
        if (H == i0.UNKNOWN_PREFIX) {
            H = i0.TINK;
        }
        return c0.c.M().n(p11).o(f11).q(z.ENABLED).p(H).build();
    }

    private synchronized int f() {
        int g11;
        g11 = g();
        while (d(g11)) {
            g11 = g();
        }
        return g11;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i11 = 0;
        while (i11 == 0) {
            secureRandom.nextBytes(bArr);
            i11 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i11;
    }

    public static j i() {
        return new j(c0.L());
    }

    public static j j(i iVar) {
        return new j(iVar.f().toBuilder());
    }

    public synchronized j a(g gVar) {
        b(gVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z11) {
        c0.c e11;
        e11 = e(a0Var);
        this.f29324a.n(e11);
        if (z11) {
            this.f29324a.r(e11.I());
        }
        return e11.I();
    }

    public synchronized i c() {
        return i.e(this.f29324a.build());
    }

    public synchronized j h(int i11) {
        for (int i12 = 0; i12 < this.f29324a.p(); i12++) {
            c0.c o11 = this.f29324a.o(i12);
            if (o11.I() == i11) {
                if (o11.K().equals(z.ENABLED)) {
                    this.f29324a.r(i11);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i11);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i11);
        return this;
    }
}