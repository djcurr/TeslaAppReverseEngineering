package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ha.b, k<?>> f10694a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<ha.b, k<?>> f10695b = new HashMap();

    private Map<ha.b, k<?>> b(boolean z11) {
        return z11 ? this.f10695b : this.f10694a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k<?> a(ha.b bVar, boolean z11) {
        return b(z11).get(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ha.b bVar, k<?> kVar) {
        b(kVar.p()).put(bVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ha.b bVar, k<?> kVar) {
        Map<ha.b, k<?>> b11 = b(kVar.p());
        if (kVar.equals(b11.get(bVar))) {
            b11.remove(bVar);
        }
    }
}