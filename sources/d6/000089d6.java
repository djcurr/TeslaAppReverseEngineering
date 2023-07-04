package n6;

import com.adobe.xmp.XMPException;

/* loaded from: classes.dex */
public final class e extends c {
    public e() {
    }

    public e(int i11) {
        super(i11);
    }

    public e A(boolean z11) {
        f(Integer.MIN_VALUE, z11);
        return this;
    }

    public e B(boolean z11) {
        f(256, z11);
        return this;
    }

    public e C(boolean z11) {
        f(2, z11);
        return this;
    }

    @Override // n6.c
    public void a(int i11) {
        if ((i11 & 256) > 0 && (i11 & 512) > 0) {
            throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((i11 & 2) > 0 && (i11 & 768) > 0) {
            throw new XMPException("Structs and arrays can't have \"value\" options", 103);
        }
    }

    @Override // n6.c
    protected int e() {
        return -2147475470;
    }

    public boolean h() {
        return c(64);
    }

    public boolean i() {
        return c(512);
    }

    public boolean j() {
        return c(4096);
    }

    public boolean k() {
        return c(2048);
    }

    public boolean l() {
        return c(1024);
    }

    public boolean m() {
        return (d() & 768) > 0;
    }

    public boolean n() {
        return c(32);
    }

    public boolean o() {
        return c(Integer.MIN_VALUE);
    }

    public boolean p() {
        return (d() & 768) == 0;
    }

    public boolean q() {
        return c(256);
    }

    public void r(e eVar) {
        if (eVar != null) {
            g(eVar.d() | d());
        }
    }

    public e s(boolean z11) {
        f(512, z11);
        return this;
    }

    public e t(boolean z11) {
        f(4096, z11);
        return this;
    }

    public e u(boolean z11) {
        f(2048, z11);
        return this;
    }

    public e v(boolean z11) {
        f(1024, z11);
        return this;
    }

    public e w(boolean z11) {
        f(64, z11);
        return this;
    }

    public e x(boolean z11) {
        f(16, z11);
        return this;
    }

    public e y(boolean z11) {
        f(128, z11);
        return this;
    }

    public e z(boolean z11) {
        f(32, z11);
        return this;
    }
}