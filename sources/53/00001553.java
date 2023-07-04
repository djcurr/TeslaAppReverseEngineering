package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.util.Collections;
import java.util.List;
import na.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v implements f, f.a {

    /* renamed from: a  reason: collision with root package name */
    private final g<?> f10725a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f10726b;

    /* renamed from: c  reason: collision with root package name */
    private int f10727c;

    /* renamed from: d  reason: collision with root package name */
    private c f10728d;

    /* renamed from: e  reason: collision with root package name */
    private Object f10729e;

    /* renamed from: f  reason: collision with root package name */
    private volatile n.a<?> f10730f;

    /* renamed from: g  reason: collision with root package name */
    private d f10731g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n.a f10732a;

        a(n.a aVar) {
            this.f10732a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void b(Exception exc) {
            if (v.this.g(this.f10732a)) {
                v.this.i(this.f10732a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Object obj) {
            if (v.this.g(this.f10732a)) {
                v.this.h(this.f10732a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(g<?> gVar, f.a aVar) {
        this.f10725a = gVar;
        this.f10726b = aVar;
    }

    private void d(Object obj) {
        long b11 = bb.f.b();
        try {
            ha.a<X> p11 = this.f10725a.p(obj);
            e eVar = new e(p11, obj, this.f10725a.k());
            this.f10731g = new d(this.f10730f.f40733a, this.f10725a.o());
            this.f10725a.d().b(this.f10731g, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f10731g + ", data: " + obj + ", encoder: " + p11 + ", duration: " + bb.f.a(b11));
            }
            this.f10730f.f40735c.cleanup();
            this.f10728d = new c(Collections.singletonList(this.f10730f.f40733a), this.f10725a, this);
        } catch (Throwable th2) {
            this.f10730f.f40735c.cleanup();
            throw th2;
        }
    }

    private boolean f() {
        return this.f10727c < this.f10725a.g().size();
    }

    private void j(n.a<?> aVar) {
        this.f10730f.f40735c.d(this.f10725a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(ha.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f10726b.a(bVar, exc, dVar, this.f10730f.f40735c.c());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean c() {
        Object obj = this.f10729e;
        if (obj != null) {
            this.f10729e = null;
            d(obj);
        }
        c cVar = this.f10728d;
        if (cVar == null || !cVar.c()) {
            this.f10728d = null;
            this.f10730f = null;
            boolean z11 = false;
            while (!z11 && f()) {
                List<n.a<?>> g11 = this.f10725a.g();
                int i11 = this.f10727c;
                this.f10727c = i11 + 1;
                this.f10730f = g11.get(i11);
                if (this.f10730f != null && (this.f10725a.e().c(this.f10730f.f40735c.c()) || this.f10725a.t(this.f10730f.f40735c.a()))) {
                    j(this.f10730f);
                    z11 = true;
                }
            }
            return z11;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f10730f;
        if (aVar != null) {
            aVar.f40735c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(ha.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, ha.b bVar2) {
        this.f10726b.e(bVar, obj, dVar, this.f10730f.f40735c.c(), bVar);
    }

    boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.f10730f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a<?> aVar, Object obj) {
        ja.a e11 = this.f10725a.e();
        if (obj != null && e11.c(aVar.f40735c.c())) {
            this.f10729e = obj;
            this.f10726b.b();
            return;
        }
        f.a aVar2 = this.f10726b;
        ha.b bVar = aVar.f40733a;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f40735c;
        aVar2.e(bVar, obj, dVar, dVar.c(), this.f10731g);
    }

    void i(n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f10726b;
        d dVar = this.f10731g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f40735c;
        aVar2.a(dVar, exc, dVar2, dVar2.c());
    }
}