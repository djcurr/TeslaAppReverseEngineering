package net.time4j;

/* loaded from: classes5.dex */
final class t0<T> implements net.time4j.engine.u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.u<T> f41523a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f41524b;

    private t0(net.time4j.engine.u<T> uVar, Object obj) {
        this.f41523a = uVar;
        this.f41524b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> t0 a(net.time4j.engine.u<T> uVar, Object obj) {
        return new t0(uVar, obj);
    }

    @Override // net.time4j.engine.u
    public T apply(T t11) {
        return this.f41523a.apply(t11);
    }
}