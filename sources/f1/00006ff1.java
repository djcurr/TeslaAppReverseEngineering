package g30;

import f30.f;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class w1<Tag> implements f30.f, f30.d {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Tag> f27676a = new ArrayList<>();

    private final boolean G(e30.f fVar, int i11) {
        Y(W(fVar, i11));
        return true;
    }

    @Override // f30.f
    public final void A(int i11) {
        P(X(), i11);
    }

    @Override // f30.f
    public f30.d B(e30.f fVar, int i11) {
        return f.a.a(this, fVar, i11);
    }

    @Override // f30.d
    public final void C(e30.f descriptor, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        I(W(descriptor, i11), z11);
    }

    @Override // f30.d
    public <T> void D(e30.f descriptor, int i11, c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if (G(descriptor, i11)) {
            H(serializer, t11);
        }
    }

    @Override // f30.f
    public final void E(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        S(X(), value);
    }

    @Override // f30.f
    public abstract <T> void F(c30.h<? super T> hVar, T t11);

    public <T> void H(c30.h<? super T> hVar, T t11) {
        f.a.c(this, hVar, t11);
    }

    protected abstract void I(Tag tag, boolean z11);

    protected abstract void J(Tag tag, byte b11);

    protected abstract void K(Tag tag, char c11);

    protected abstract void L(Tag tag, double d11);

    protected abstract void M(Tag tag, e30.f fVar, int i11);

    protected abstract void N(Tag tag, float f11);

    /* JADX INFO: Access modifiers changed from: protected */
    public f30.f O(Tag tag, e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        Y(tag);
        return this;
    }

    protected abstract void P(Tag tag, int i11);

    protected abstract void Q(Tag tag, long j11);

    protected abstract void R(Tag tag, short s11);

    protected abstract void S(Tag tag, String str);

    protected abstract void T(e30.f fVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Tag U() {
        return (Tag) wz.u.n0(this.f27676a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Tag V() {
        return (Tag) wz.u.p0(this.f27676a);
    }

    protected abstract Tag W(e30.f fVar, int i11);

    protected final Tag X() {
        int k11;
        if (!this.f27676a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f27676a;
            k11 = wz.w.k(arrayList);
            return arrayList.remove(k11);
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y(Tag tag) {
        this.f27676a.add(tag);
    }

    @Override // f30.d
    public final void d(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (!this.f27676a.isEmpty()) {
            X();
        }
        T(descriptor);
    }

    @Override // f30.f
    public final void e(double d11) {
        L(X(), d11);
    }

    @Override // f30.d
    public final void f(e30.f descriptor, int i11, long j11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        Q(W(descriptor, i11), j11);
    }

    @Override // f30.f
    public final void g(byte b11) {
        J(X(), b11);
    }

    @Override // f30.d
    public final void h(e30.f descriptor, int i11, double d11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        L(W(descriptor, i11), d11);
    }

    @Override // f30.f
    public final f30.f i(e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        return O(X(), inlineDescriptor);
    }

    @Override // f30.d
    public final void j(e30.f descriptor, int i11, float f11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        N(W(descriptor, i11), f11);
    }

    @Override // f30.d
    public final void l(e30.f descriptor, int i11, byte b11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        J(W(descriptor, i11), b11);
    }

    @Override // f30.f
    public final void m(long j11) {
        Q(X(), j11);
    }

    @Override // f30.d
    public final void n(e30.f descriptor, int i11, int i12) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        P(W(descriptor, i11), i12);
    }

    @Override // f30.d
    public final void p(e30.f descriptor, int i11, String value) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(value, "value");
        S(W(descriptor, i11), value);
    }

    @Override // f30.d
    public <T> void q(e30.f descriptor, int i11, c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if (G(descriptor, i11)) {
            F(serializer, t11);
        }
    }

    @Override // f30.f
    public final void r(short s11) {
        R(X(), s11);
    }

    @Override // f30.f
    public final void s(boolean z11) {
        I(X(), z11);
    }

    @Override // f30.f
    public final void t(float f11) {
        N(X(), f11);
    }

    @Override // f30.f
    public final void u(char c11) {
        K(X(), c11);
    }

    @Override // f30.f
    public final void v() {
    }

    @Override // f30.d
    public final void w(e30.f descriptor, int i11, short s11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        R(W(descriptor, i11), s11);
    }

    @Override // f30.f
    public final void x(e30.f enumDescriptor, int i11) {
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        M(X(), enumDescriptor, i11);
    }

    @Override // f30.d
    public final void y(e30.f descriptor, int i11, char c11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        K(W(descriptor, i11), c11);
    }
}