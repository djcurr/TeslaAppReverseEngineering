package f30;

import c30.h;
import f30.d;
import f30.f;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class b implements f, d {
    @Override // f30.f
    public abstract void A(int i11);

    @Override // f30.f
    public d B(e30.f fVar, int i11) {
        return f.a.a(this, fVar, i11);
    }

    @Override // f30.d
    public final void C(e30.f descriptor, int i11, boolean z11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            s(z11);
        }
    }

    @Override // f30.d
    public <T> void D(e30.f descriptor, int i11, h<? super T> serializer, T t11) {
        s.g(descriptor, "descriptor");
        s.g(serializer, "serializer");
        if (G(descriptor, i11)) {
            H(serializer, t11);
        }
    }

    @Override // f30.f
    public void E(String value) {
        s.g(value, "value");
        I(value);
    }

    @Override // f30.f
    public <T> void F(h<? super T> hVar, T t11) {
        f.a.d(this, hVar, t11);
    }

    public boolean G(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return true;
    }

    public <T> void H(h<? super T> hVar, T t11) {
        f.a.c(this, hVar, t11);
    }

    public void I(Object value) {
        s.g(value, "value");
        throw new SerializationException("Non-serializable " + m0.b(value.getClass()) + " is not supported by " + m0.b(getClass()) + " encoder");
    }

    @Override // f30.f
    public d b(e30.f descriptor) {
        s.g(descriptor, "descriptor");
        return this;
    }

    @Override // f30.d
    public void d(e30.f descriptor) {
        s.g(descriptor, "descriptor");
    }

    @Override // f30.f
    public void e(double d11) {
        I(Double.valueOf(d11));
    }

    @Override // f30.d
    public final void f(e30.f descriptor, int i11, long j11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            m(j11);
        }
    }

    @Override // f30.f
    public abstract void g(byte b11);

    @Override // f30.d
    public final void h(e30.f descriptor, int i11, double d11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            e(d11);
        }
    }

    @Override // f30.f
    public f i(e30.f inlineDescriptor) {
        s.g(inlineDescriptor, "inlineDescriptor");
        return this;
    }

    @Override // f30.d
    public final void j(e30.f descriptor, int i11, float f11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            t(f11);
        }
    }

    @Override // f30.d
    public boolean k(e30.f fVar, int i11) {
        return d.a.a(this, fVar, i11);
    }

    @Override // f30.d
    public final void l(e30.f descriptor, int i11, byte b11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            g(b11);
        }
    }

    @Override // f30.f
    public abstract void m(long j11);

    @Override // f30.d
    public final void n(e30.f descriptor, int i11, int i12) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            A(i12);
        }
    }

    @Override // f30.f
    public void o() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // f30.d
    public final void p(e30.f descriptor, int i11, String value) {
        s.g(descriptor, "descriptor");
        s.g(value, "value");
        if (G(descriptor, i11)) {
            E(value);
        }
    }

    @Override // f30.d
    public <T> void q(e30.f descriptor, int i11, h<? super T> serializer, T t11) {
        s.g(descriptor, "descriptor");
        s.g(serializer, "serializer");
        if (G(descriptor, i11)) {
            F(serializer, t11);
        }
    }

    @Override // f30.f
    public abstract void r(short s11);

    @Override // f30.f
    public void s(boolean z11) {
        I(Boolean.valueOf(z11));
    }

    @Override // f30.f
    public void t(float f11) {
        I(Float.valueOf(f11));
    }

    @Override // f30.f
    public void u(char c11) {
        I(Character.valueOf(c11));
    }

    @Override // f30.f
    public void v() {
        f.a.b(this);
    }

    @Override // f30.d
    public final void w(e30.f descriptor, int i11, short s11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            r(s11);
        }
    }

    @Override // f30.f
    public void x(e30.f enumDescriptor, int i11) {
        s.g(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i11));
    }

    @Override // f30.d
    public final void y(e30.f descriptor, int i11, char c11) {
        s.g(descriptor, "descriptor");
        if (G(descriptor, i11)) {
            u(c11);
        }
    }
}