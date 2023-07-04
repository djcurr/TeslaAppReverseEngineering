package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r0<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36250a;

    public r0() {
        this(0, 1, null);
    }

    public r0(int i11) {
        this.f36250a = i11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r0) && ((r0) obj).f36250a == this.f36250a;
    }

    public int hashCode() {
        return this.f36250a;
    }

    @Override // l0.i
    public <V extends p> j1<V> a(d1<T, V> converter) {
        kotlin.jvm.internal.s.g(converter, "converter");
        return new p1(this.f36250a);
    }

    public /* synthetic */ r0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}