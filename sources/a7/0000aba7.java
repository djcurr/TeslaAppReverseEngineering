package pv;

import pv.r;

/* loaded from: classes2.dex */
public final class d implements tw.e<x20.e<r.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final c f46933a;

    public d(c cVar) {
        this.f46933a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static x20.e<r.a> c(c cVar) {
        return (x20.e) tw.h.e(cVar.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public x20.e<r.a> get() {
        return c(this.f46933a);
    }
}