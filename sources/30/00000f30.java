package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final l0<T> f8652a;

    private q(h00.a<? extends T> aVar) {
        this.f8652a = new l0<>(aVar);
    }

    public /* synthetic */ q(h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final l0<T> a() {
        return this.f8652a;
    }

    public abstract v1<T> b(T t11, i iVar, int i11);
}