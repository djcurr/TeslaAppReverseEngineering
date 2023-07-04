package l2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f36508a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<T, T, T> f36509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<T, T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36510a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        public final T invoke(T t11, T t12) {
            return t11 == null ? t12 : t11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(String name, h00.p<? super T, ? super T, ? extends T> mergePolicy) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(mergePolicy, "mergePolicy");
        this.f36508a = name;
        this.f36509b = mergePolicy;
    }

    public final String a() {
        return this.f36508a;
    }

    public final T b(T t11, T t12) {
        return this.f36509b.invoke(t11, t12);
    }

    public final void c(v thisRef, n00.m<?> property, T t11) {
        kotlin.jvm.internal.s.g(thisRef, "thisRef");
        kotlin.jvm.internal.s.g(property, "property");
        thisRef.b(this, t11);
    }

    public String toString() {
        return kotlin.jvm.internal.s.p("SemanticsPropertyKey: ", this.f36508a);
    }

    public /* synthetic */ u(String str, h00.p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? a.f36510a : pVar);
    }
}