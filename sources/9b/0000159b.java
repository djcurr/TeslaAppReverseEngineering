package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j<R> implements d, ya.j, i {
    private static final boolean D = Log.isLoggable("Request", 2);
    private int A;
    private boolean B;
    private RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    private final String f10843a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.c f10844b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f10845c;

    /* renamed from: d  reason: collision with root package name */
    private final g<R> f10846d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10847e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f10848f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bumptech.glide.e f10849g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f10850h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<R> f10851i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f10852j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10853k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10854l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bumptech.glide.h f10855m;

    /* renamed from: n  reason: collision with root package name */
    private final ya.k<R> f10856n;

    /* renamed from: o  reason: collision with root package name */
    private final List<g<R>> f10857o;

    /* renamed from: p  reason: collision with root package name */
    private final za.c<? super R> f10858p;

    /* renamed from: q  reason: collision with root package name */
    private final Executor f10859q;

    /* renamed from: r  reason: collision with root package name */
    private ja.c<R> f10860r;

    /* renamed from: s  reason: collision with root package name */
    private j.d f10861s;

    /* renamed from: t  reason: collision with root package name */
    private long f10862t;

    /* renamed from: u  reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f10863u;

    /* renamed from: v  reason: collision with root package name */
    private a f10864v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f10865w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f10866x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f10867y;

    /* renamed from: z  reason: collision with root package name */
    private int f10868z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i11, int i12, com.bumptech.glide.h hVar, ya.k<R> kVar, g<R> gVar, List<g<R>> list, e eVar2, com.bumptech.glide.load.engine.j jVar, za.c<? super R> cVar, Executor executor) {
        this.f10843a = D ? String.valueOf(super.hashCode()) : null;
        this.f10844b = cb.c.a();
        this.f10845c = obj;
        this.f10848f = context;
        this.f10849g = eVar;
        this.f10850h = obj2;
        this.f10851i = cls;
        this.f10852j = aVar;
        this.f10853k = i11;
        this.f10854l = i12;
        this.f10855m = hVar;
        this.f10856n = kVar;
        this.f10846d = gVar;
        this.f10857o = list;
        this.f10847e = eVar2;
        this.f10863u = jVar;
        this.f10858p = cVar;
        this.f10859q = executor;
        this.f10864v = a.PENDING;
        if (this.C == null && eVar.g().a(d.c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        if (l()) {
            Drawable p11 = this.f10850h == null ? p() : null;
            if (p11 == null) {
                p11 = o();
            }
            if (p11 == null) {
                p11 = q();
            }
            this.f10856n.onLoadFailed(p11);
        }
    }

    private void j() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        e eVar = this.f10847e;
        return eVar == null || eVar.j(this);
    }

    private boolean l() {
        e eVar = this.f10847e;
        return eVar == null || eVar.b(this);
    }

    private boolean m() {
        e eVar = this.f10847e;
        return eVar == null || eVar.c(this);
    }

    private void n() {
        j();
        this.f10844b.c();
        this.f10856n.removeCallback(this);
        j.d dVar = this.f10861s;
        if (dVar != null) {
            dVar.a();
            this.f10861s = null;
        }
    }

    private Drawable o() {
        if (this.f10865w == null) {
            Drawable errorPlaceholder = this.f10852j.getErrorPlaceholder();
            this.f10865w = errorPlaceholder;
            if (errorPlaceholder == null && this.f10852j.getErrorId() > 0) {
                this.f10865w = s(this.f10852j.getErrorId());
            }
        }
        return this.f10865w;
    }

    private Drawable p() {
        if (this.f10867y == null) {
            Drawable fallbackDrawable = this.f10852j.getFallbackDrawable();
            this.f10867y = fallbackDrawable;
            if (fallbackDrawable == null && this.f10852j.getFallbackId() > 0) {
                this.f10867y = s(this.f10852j.getFallbackId());
            }
        }
        return this.f10867y;
    }

    private Drawable q() {
        if (this.f10866x == null) {
            Drawable placeholderDrawable = this.f10852j.getPlaceholderDrawable();
            this.f10866x = placeholderDrawable;
            if (placeholderDrawable == null && this.f10852j.getPlaceholderId() > 0) {
                this.f10866x = s(this.f10852j.getPlaceholderId());
            }
        }
        return this.f10866x;
    }

    private boolean r() {
        e eVar = this.f10847e;
        return eVar == null || !eVar.getRoot().a();
    }

    private Drawable s(int i11) {
        return ra.a.a(this.f10849g, i11, this.f10852j.getTheme() != null ? this.f10852j.getTheme() : this.f10848f.getTheme());
    }

    private void t(String str) {
        Log.v("Request", str + " this: " + this.f10843a);
    }

    private static int u(int i11, float f11) {
        return i11 == Integer.MIN_VALUE ? i11 : Math.round(f11 * i11);
    }

    private void v() {
        e eVar = this.f10847e;
        if (eVar != null) {
            eVar.e(this);
        }
    }

    private void w() {
        e eVar = this.f10847e;
        if (eVar != null) {
            eVar.g(this);
        }
    }

    public static <R> j<R> x(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i11, int i12, com.bumptech.glide.h hVar, ya.k<R> kVar, g<R> gVar, List<g<R>> list, e eVar2, com.bumptech.glide.load.engine.j jVar, za.c<? super R> cVar, Executor executor) {
        return new j<>(context, eVar, obj, obj2, cls, aVar, i11, i12, hVar, kVar, gVar, list, eVar2, jVar, cVar, executor);
    }

    private void y(GlideException glideException, int i11) {
        boolean z11;
        this.f10844b.c();
        synchronized (this.f10845c) {
            glideException.k(this.C);
            int h11 = this.f10849g.h();
            if (h11 <= i11) {
                Log.w("Glide", "Load failed for " + this.f10850h + " with size [" + this.f10868z + "x" + this.A + "]", glideException);
                if (h11 <= 4) {
                    glideException.g("Glide");
                }
            }
            this.f10861s = null;
            this.f10864v = a.FAILED;
            boolean z12 = true;
            this.B = true;
            List<g<R>> list = this.f10857o;
            if (list != null) {
                z11 = false;
                for (g<R> gVar : list) {
                    z11 |= gVar.onLoadFailed(glideException, this.f10850h, this.f10856n, r());
                }
            } else {
                z11 = false;
            }
            g<R> gVar2 = this.f10846d;
            if (gVar2 == null || !gVar2.onLoadFailed(glideException, this.f10850h, this.f10856n, r())) {
                z12 = false;
            }
            if (!(z11 | z12)) {
                A();
            }
            this.B = false;
            v();
        }
    }

    private void z(ja.c<R> cVar, R r11, com.bumptech.glide.load.a aVar, boolean z11) {
        boolean z12;
        boolean r12 = r();
        this.f10864v = a.COMPLETE;
        this.f10860r = cVar;
        if (this.f10849g.h() <= 3) {
            Log.d("Glide", "Finished loading " + r11.getClass().getSimpleName() + " from " + aVar + " for " + this.f10850h + " with size [" + this.f10868z + "x" + this.A + "] in " + bb.f.a(this.f10862t) + " ms");
        }
        boolean z13 = true;
        this.B = true;
        try {
            List<g<R>> list = this.f10857o;
            if (list != null) {
                z12 = false;
                for (g<R> gVar : list) {
                    z12 |= gVar.onResourceReady(r11, this.f10850h, this.f10856n, aVar, r12);
                }
            } else {
                z12 = false;
            }
            g<R> gVar2 = this.f10846d;
            if (gVar2 == null || !gVar2.onResourceReady(r11, this.f10850h, this.f10856n, aVar, r12)) {
                z13 = false;
            }
            if (!(z13 | z12)) {
                this.f10856n.onResourceReady(r11, this.f10858p.a(aVar, r12));
            }
            this.B = false;
            w();
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean a() {
        boolean z11;
        synchronized (this.f10845c) {
            z11 = this.f10864v == a.COMPLETE;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.i
    public void b(GlideException glideException) {
        y(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.i
    public void c(ja.c<?> cVar, com.bumptech.glide.load.a aVar, boolean z11) {
        this.f10844b.c();
        ja.c<?> cVar2 = null;
        try {
            synchronized (this.f10845c) {
                try {
                    this.f10861s = null;
                    if (cVar == null) {
                        b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f10851i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj != null && this.f10851i.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                this.f10860r = null;
                                this.f10864v = a.COMPLETE;
                                this.f10863u.l(cVar);
                                return;
                            }
                            z(cVar, obj, aVar, z11);
                            return;
                        }
                        this.f10860r = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f10851i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(cVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        b(new GlideException(sb2.toString()));
                        this.f10863u.l(cVar);
                    } catch (Throwable th2) {
                        cVar2 = cVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (cVar2 != null) {
                this.f10863u.l(cVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f10845c) {
            j();
            this.f10844b.c();
            a aVar = this.f10864v;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            ja.c<R> cVar = this.f10860r;
            if (cVar != null) {
                this.f10860r = null;
            } else {
                cVar = null;
            }
            if (k()) {
                this.f10856n.onLoadCleared(q());
            }
            this.f10864v = aVar2;
            if (cVar != null) {
                this.f10863u.l(cVar);
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void d() {
        synchronized (this.f10845c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // ya.j
    public void e(int i11, int i12) {
        Object obj;
        this.f10844b.c();
        Object obj2 = this.f10845c;
        synchronized (obj2) {
            try {
                try {
                    boolean z11 = D;
                    if (z11) {
                        t("Got onSizeReady in " + bb.f.a(this.f10862t));
                    }
                    if (this.f10864v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f10864v = aVar;
                        float sizeMultiplier = this.f10852j.getSizeMultiplier();
                        this.f10868z = u(i11, sizeMultiplier);
                        this.A = u(i12, sizeMultiplier);
                        if (z11) {
                            t("finished setup for calling load in " + bb.f.a(this.f10862t));
                        }
                        obj = obj2;
                        try {
                            this.f10861s = this.f10863u.g(this.f10849g, this.f10850h, this.f10852j.getSignature(), this.f10868z, this.A, this.f10852j.getResourceClass(), this.f10851i, this.f10855m, this.f10852j.getDiskCacheStrategy(), this.f10852j.getTransformations(), this.f10852j.isTransformationRequired(), this.f10852j.isScaleOnlyOrNoTransform(), this.f10852j.getOptions(), this.f10852j.isMemoryCacheable(), this.f10852j.getUseUnlimitedSourceGeneratorsPool(), this.f10852j.getUseAnimationPool(), this.f10852j.getOnlyRetrieveFromCache(), this, this.f10859q);
                            if (this.f10864v != aVar) {
                                this.f10861s = null;
                            }
                            if (z11) {
                                t("finished onSizeReady in " + bb.f.a(this.f10862t));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z11;
        synchronized (this.f10845c) {
            z11 = this.f10864v == a.CLEARED;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.i
    public Object g() {
        this.f10844b.c();
        return this.f10845c;
    }

    @Override // com.bumptech.glide.request.d
    public boolean h(d dVar) {
        int i11;
        int i12;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (dVar instanceof j) {
            synchronized (this.f10845c) {
                i11 = this.f10853k;
                i12 = this.f10854l;
                obj = this.f10850h;
                cls = this.f10851i;
                aVar = this.f10852j;
                hVar = this.f10855m;
                List<g<R>> list = this.f10857o;
                size = list != null ? list.size() : 0;
            }
            j jVar = (j) dVar;
            synchronized (jVar.f10845c) {
                i13 = jVar.f10853k;
                i14 = jVar.f10854l;
                obj2 = jVar.f10850h;
                cls2 = jVar.f10851i;
                aVar2 = jVar.f10852j;
                hVar2 = jVar.f10855m;
                List<g<R>> list2 = jVar.f10857o;
                size2 = list2 != null ? list2.size() : 0;
            }
            return i11 == i13 && i12 == i14 && bb.k.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.d
    public void i() {
        synchronized (this.f10845c) {
            j();
            this.f10844b.c();
            this.f10862t = bb.f.b();
            if (this.f10850h == null) {
                if (bb.k.t(this.f10853k, this.f10854l)) {
                    this.f10868z = this.f10853k;
                    this.A = this.f10854l;
                }
                y(new GlideException("Received null model"), p() == null ? 5 : 3);
                return;
            }
            a aVar = this.f10864v;
            a aVar2 = a.RUNNING;
            if (aVar != aVar2) {
                if (aVar == a.COMPLETE) {
                    c(this.f10860r, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                    return;
                }
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f10864v = aVar3;
                if (bb.k.t(this.f10853k, this.f10854l)) {
                    e(this.f10853k, this.f10854l);
                } else {
                    this.f10856n.getSize(this);
                }
                a aVar4 = this.f10864v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f10856n.onLoadStarted(q());
                }
                if (D) {
                    t("finished run method in " + bb.f.a(this.f10862t));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f10845c) {
            z11 = this.f10864v == a.COMPLETE;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f10845c) {
            a aVar = this.f10864v;
            z11 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z11;
    }
}