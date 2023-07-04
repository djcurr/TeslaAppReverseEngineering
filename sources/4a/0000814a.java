package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c1<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36103a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36104b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f36105c;

    public c1() {
        this(0, 0, null, 7, null);
    }

    public c1(int i11, int i12, a0 easing) {
        kotlin.jvm.internal.s.g(easing, "easing");
        this.f36103a = i11;
        this.f36104b = i12;
        this.f36105c = easing;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c1) {
            c1 c1Var = (c1) obj;
            return c1Var.f36103a == this.f36103a && c1Var.f36104b == this.f36104b && kotlin.jvm.internal.s.c(c1Var.f36105c, this.f36105c);
        }
        return false;
    }

    @Override // l0.z, l0.i
    /* renamed from: f */
    public <V extends p> r1<V> a(d1<T, V> converter) {
        kotlin.jvm.internal.s.g(converter, "converter");
        return new r1<>(this.f36103a, this.f36104b, this.f36105c);
    }

    public int hashCode() {
        return (((this.f36103a * 31) + this.f36105c.hashCode()) * 31) + this.f36104b;
    }

    public /* synthetic */ c1(int i11, int i12, a0 a0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? b0.a() : a0Var);
    }
}