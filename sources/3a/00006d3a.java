package f30;

import f30.c;
import f30.e;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class a implements e, c {
    @Override // f30.c
    public final <T> T A(e30.f descriptor, int i11, c30.a<T> deserializer, T t11) {
        s.g(descriptor, "descriptor");
        s.g(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || D()) ? (T) H(deserializer, t11) : (T) h();
    }

    @Override // f30.e
    public String B() {
        return (String) I();
    }

    @Override // f30.c
    public final int C(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return g();
    }

    @Override // f30.e
    public boolean D() {
        return true;
    }

    @Override // f30.c
    public final float E(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return t();
    }

    @Override // f30.e
    public abstract byte F();

    @Override // f30.e
    public int G(e30.f enumDescriptor) {
        s.g(enumDescriptor, "enumDescriptor");
        return ((Integer) I()).intValue();
    }

    public <T> T H(c30.a<T> deserializer, T t11) {
        s.g(deserializer, "deserializer");
        return (T) m(deserializer);
    }

    public Object I() {
        throw new SerializationException(m0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // f30.e
    public c b(e30.f descriptor) {
        s.g(descriptor, "descriptor");
        return this;
    }

    @Override // f30.c
    public void d(e30.f descriptor) {
        s.g(descriptor, "descriptor");
    }

    @Override // f30.c
    public <T> T e(e30.f descriptor, int i11, c30.a<T> deserializer, T t11) {
        s.g(descriptor, "descriptor");
        s.g(deserializer, "deserializer");
        return (T) H(deserializer, t11);
    }

    @Override // f30.e
    public abstract int g();

    @Override // f30.e
    public Void h() {
        return null;
    }

    @Override // f30.c
    public final String i(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return B();
    }

    @Override // f30.c
    public int j(e30.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // f30.e
    public abstract long k();

    @Override // f30.c
    public final byte l(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return F();
    }

    @Override // f30.e
    public <T> T m(c30.a<T> aVar) {
        return (T) e.a.a(this, aVar);
    }

    @Override // f30.c
    public boolean n() {
        return c.a.b(this);
    }

    @Override // f30.c
    public final boolean o(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return y();
    }

    @Override // f30.c
    public final double q(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return v();
    }

    @Override // f30.c
    public final char r(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return z();
    }

    @Override // f30.e
    public abstract short s();

    @Override // f30.e
    public float t() {
        return ((Float) I()).floatValue();
    }

    @Override // f30.c
    public final short u(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return s();
    }

    @Override // f30.e
    public double v() {
        return ((Double) I()).doubleValue();
    }

    @Override // f30.e
    public e w(e30.f inlineDescriptor) {
        s.g(inlineDescriptor, "inlineDescriptor");
        return this;
    }

    @Override // f30.c
    public final long x(e30.f descriptor, int i11) {
        s.g(descriptor, "descriptor");
        return k();
    }

    @Override // f30.e
    public boolean y() {
        return ((Boolean) I()).booleanValue();
    }

    @Override // f30.e
    public char z() {
        return ((Character) I()).charValue();
    }
}