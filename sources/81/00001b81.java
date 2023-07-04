package com.google.android.exoplayer2.drm;

import ak.k0;
import android.net.Uri;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.e;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements hi.l {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13343a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private i0.e f13344b;

    /* renamed from: c  reason: collision with root package name */
    private g f13345c;

    /* renamed from: d  reason: collision with root package name */
    private HttpDataSource.b f13346d;

    /* renamed from: e  reason: collision with root package name */
    private String f13347e;

    private g b(i0.e eVar) {
        HttpDataSource.b bVar = this.f13346d;
        if (bVar == null) {
            bVar = new e.b().c(this.f13347e);
        }
        Uri uri = eVar.f13540b;
        l lVar = new l(uri == null ? null : uri.toString(), eVar.f13544f, bVar);
        for (Map.Entry<String, String> entry : eVar.f13541c.entrySet()) {
            lVar.e(entry.getKey(), entry.getValue());
        }
        DefaultDrmSessionManager a11 = new DefaultDrmSessionManager.b().e(eVar.f13539a, k.f13369d).b(eVar.f13542d).c(eVar.f13543e).d(fl.d.k(eVar.f13545g)).a(lVar);
        a11.t(0, eVar.a());
        return a11;
    }

    @Override // hi.l
    public g a(i0 i0Var) {
        g gVar;
        ak.a.e(i0Var.f13502b);
        i0.e eVar = i0Var.f13502b.f13554c;
        if (eVar != null && k0.f477a >= 18) {
            synchronized (this.f13343a) {
                if (!k0.c(eVar, this.f13344b)) {
                    this.f13344b = eVar;
                    this.f13345c = b(eVar);
                }
                gVar = (g) ak.a.e(this.f13345c);
            }
            return gVar;
        }
        return g.f13362a;
    }
}