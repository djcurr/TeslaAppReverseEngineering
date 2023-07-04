package g30;

import f30.c;
import java.util.ArrayList;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
public abstract class v1<Tag> implements f30.e, f30.c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Tag> f27659a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f27660b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    static final class a<T> extends kotlin.jvm.internal.u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<Tag> f27661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c30.a<T> f27662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f27663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v1<Tag> v1Var, c30.a<T> aVar, T t11) {
            super(0);
            this.f27661a = v1Var;
            this.f27662b = aVar;
            this.f27663c = t11;
        }

        @Override // h00.a
        public final T invoke() {
            if (this.f27661a.D()) {
                return (T) this.f27661a.H(this.f27662b, this.f27663c);
            }
            return (T) this.f27661a.h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    static final class b<T> extends kotlin.jvm.internal.u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<Tag> f27664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c30.a<T> f27665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f27666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v1<Tag> v1Var, c30.a<T> aVar, T t11) {
            super(0);
            this.f27664a = v1Var;
            this.f27665b = aVar;
            this.f27666c = t11;
        }

        @Override // h00.a
        public final T invoke() {
            return (T) this.f27664a.H(this.f27665b, this.f27666c);
        }
    }

    public v1() {
    }

    private final <E> E X(Tag tag, h00.a<? extends E> aVar) {
        W(tag);
        E invoke = aVar.invoke();
        if (!this.f27660b) {
            V();
        }
        this.f27660b = false;
        return invoke;
    }

    @Override // f30.c
    public final <T> T A(e30.f descriptor, int i11, c30.a<T> deserializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        return (T) X(U(descriptor, i11), new a(this, deserializer, t11));
    }

    @Override // f30.e
    public final String B() {
        return S(V());
    }

    @Override // f30.c
    public final int C(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return P(U(descriptor, i11));
    }

    @Override // f30.e
    public abstract boolean D();

    @Override // f30.c
    public final float E(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return N(U(descriptor, i11));
    }

    @Override // f30.e
    public final byte F() {
        return J(V());
    }

    @Override // f30.e
    public final int G(e30.f enumDescriptor) {
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        return M(V(), enumDescriptor);
    }

    protected <T> T H(c30.a<T> deserializer, T t11) {
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        return (T) m(deserializer);
    }

    protected abstract boolean I(Tag tag);

    protected abstract byte J(Tag tag);

    protected abstract char K(Tag tag);

    protected abstract double L(Tag tag);

    protected abstract int M(Tag tag, e30.f fVar);

    protected abstract float N(Tag tag);

    /* JADX INFO: Access modifiers changed from: protected */
    public f30.e O(Tag tag, e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        W(tag);
        return this;
    }

    protected abstract int P(Tag tag);

    protected abstract long Q(Tag tag);

    protected abstract short R(Tag tag);

    protected abstract String S(Tag tag);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Tag T() {
        return (Tag) wz.u.p0(this.f27659a);
    }

    protected abstract Tag U(e30.f fVar, int i11);

    protected final Tag V() {
        int k11;
        ArrayList<Tag> arrayList = this.f27659a;
        k11 = wz.w.k(arrayList);
        Tag remove = arrayList.remove(k11);
        this.f27660b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void W(Tag tag) {
        this.f27659a.add(tag);
    }

    @Override // f30.c
    public final <T> T e(e30.f descriptor, int i11, c30.a<T> deserializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        return (T) X(U(descriptor, i11), new b(this, deserializer, t11));
    }

    @Override // f30.e
    public final int g() {
        return P(V());
    }

    @Override // f30.e
    public final Void h() {
        return null;
    }

    @Override // f30.c
    public final String i(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return S(U(descriptor, i11));
    }

    @Override // f30.c
    public int j(e30.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // f30.e
    public final long k() {
        return Q(V());
    }

    @Override // f30.c
    public final byte l(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return J(U(descriptor, i11));
    }

    @Override // f30.e
    public abstract <T> T m(c30.a<T> aVar);

    @Override // f30.c
    public boolean n() {
        return c.a.b(this);
    }

    @Override // f30.c
    public final boolean o(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return I(U(descriptor, i11));
    }

    @Override // f30.c
    public final double q(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return L(U(descriptor, i11));
    }

    @Override // f30.c
    public final char r(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return K(U(descriptor, i11));
    }

    @Override // f30.e
    public final short s() {
        return R(V());
    }

    @Override // f30.e
    public final float t() {
        return N(V());
    }

    @Override // f30.c
    public final short u(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return R(U(descriptor, i11));
    }

    @Override // f30.e
    public final double v() {
        return L(V());
    }

    @Override // f30.e
    public final f30.e w(e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        return O(V(), inlineDescriptor);
    }

    @Override // f30.c
    public final long x(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return Q(U(descriptor, i11));
    }

    @Override // f30.e
    public final boolean y() {
        return I(V());
    }

    @Override // f30.e
    public final char z() {
        return K(V());
    }
}