package androidx.camera.core.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f2287a;

    @Override // androidx.camera.core.impl.e
    public void a() {
        for (e eVar : this.f2287a) {
            eVar.a();
        }
    }

    @Override // androidx.camera.core.impl.e
    public void b(m mVar) {
        for (e eVar : this.f2287a) {
            eVar.b(mVar);
        }
    }

    @Override // androidx.camera.core.impl.e
    public void c(g gVar) {
        for (e eVar : this.f2287a) {
            eVar.c(gVar);
        }
    }

    public List<e> d() {
        return this.f2287a;
    }
}