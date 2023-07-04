package com.google.android.exoplayer2.source;

import android.net.Uri;
import ci.i;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.z0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class w extends com.google.android.exoplayer2.source.a {

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f14381g;

    /* renamed from: h  reason: collision with root package name */
    private final a.InterfaceC0258a f14382h;

    /* renamed from: i  reason: collision with root package name */
    private final ci.i f14383i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14384j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f14385k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f14386l;

    /* renamed from: m  reason: collision with root package name */
    private final z0 f14387m;

    /* renamed from: n  reason: collision with root package name */
    private final i0 f14388n;

    /* renamed from: o  reason: collision with root package name */
    private zj.n f14389o;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0258a f14390a;

        /* renamed from: b  reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g f14391b = new com.google.android.exoplayer2.upstream.f();

        /* renamed from: c  reason: collision with root package name */
        private boolean f14392c = true;

        /* renamed from: d  reason: collision with root package name */
        private Object f14393d;

        /* renamed from: e  reason: collision with root package name */
        private String f14394e;

        public b(a.InterfaceC0258a interfaceC0258a) {
            this.f14390a = (a.InterfaceC0258a) ak.a.e(interfaceC0258a);
        }

        @Deprecated
        public w a(Uri uri, ci.i iVar, long j11) {
            String str = iVar.f9194a;
            if (str == null) {
                str = this.f14394e;
            }
            return new w(str, new i0.h(uri, (String) ak.a.e(iVar.f9205l), iVar.f9196c, iVar.f9197d), this.f14390a, j11, this.f14391b, this.f14392c, this.f14393d);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(zj.n nVar) {
        this.f14389o = nVar;
        B(this.f14387m);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f14388n;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        ((v) iVar).s();
    }

    @Override // com.google.android.exoplayer2.source.j
    public i k(j.a aVar, zj.b bVar, long j11) {
        return new v(this.f14381g, this.f14382h, this.f14389o, this.f14383i, this.f14384j, this.f14385k, v(aVar), this.f14386l);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
    }

    private w(String str, i0.h hVar, a.InterfaceC0258a interfaceC0258a, long j11, com.google.android.exoplayer2.upstream.g gVar, boolean z11, Object obj) {
        this.f14382h = interfaceC0258a;
        this.f14384j = j11;
        this.f14385k = gVar;
        this.f14386l = z11;
        i0 a11 = new i0.c().i(Uri.EMPTY).d(hVar.f13560a.toString()).g(Collections.singletonList(hVar)).h(obj).a();
        this.f14388n = a11;
        this.f14383i = new i.b().S(str).e0(hVar.f13561b).V(hVar.f13562c).g0(hVar.f13563d).c0(hVar.f13564e).U(hVar.f13565f).E();
        this.f14381g = new b.C0259b().i(hVar.f13560a).b(1).a();
        this.f14387m = new fj.t(j11, true, false, false, null, a11);
    }
}