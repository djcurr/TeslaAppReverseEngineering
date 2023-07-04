package ta;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final fa.a f51832a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f51833b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f51834c;

    /* renamed from: d  reason: collision with root package name */
    final k f51835d;

    /* renamed from: e  reason: collision with root package name */
    private final ka.e f51836e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f51837f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f51838g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f51839h;

    /* renamed from: i  reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f51840i;

    /* renamed from: j  reason: collision with root package name */
    private a f51841j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f51842k;

    /* renamed from: l  reason: collision with root package name */
    private a f51843l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f51844m;

    /* renamed from: n  reason: collision with root package name */
    private ha.h<Bitmap> f51845n;

    /* renamed from: o  reason: collision with root package name */
    private a f51846o;

    /* renamed from: p  reason: collision with root package name */
    private d f51847p;

    /* renamed from: q  reason: collision with root package name */
    private int f51848q;

    /* renamed from: r  reason: collision with root package name */
    private int f51849r;

    /* renamed from: s  reason: collision with root package name */
    private int f51850s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ya.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f51851d;

        /* renamed from: e  reason: collision with root package name */
        final int f51852e;

        /* renamed from: f  reason: collision with root package name */
        private final long f51853f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f51854g;

        a(Handler handler, int i11, long j11) {
            this.f51851d = handler;
            this.f51852e = i11;
            this.f51853f = j11;
        }

        Bitmap a() {
            return this.f51854g;
        }

        @Override // ya.k
        /* renamed from: b */
        public void onResourceReady(Bitmap bitmap, za.b<? super Bitmap> bVar) {
            this.f51854g = bitmap;
            this.f51851d.sendMessageAtTime(this.f51851d.obtainMessage(1, this), this.f51853f);
        }

        @Override // ya.k
        public void onLoadCleared(Drawable drawable) {
            this.f51854g = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i11 == 2) {
                g.this.f51835d.clear((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.bumptech.glide.c cVar, fa.a aVar, int i11, int i12, ha.h<Bitmap> hVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.C(cVar.j()), aVar, null, i(com.bumptech.glide.c.C(cVar.j()), i11, i12), hVar, bitmap);
    }

    private static ha.b g() {
        return new ab.d(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i11, int i12) {
        return kVar.asBitmap().apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.diskCacheStrategyOf(ja.a.f33305a).useAnimationPool(true).skipMemoryCache(true).override(i11, i12));
    }

    private void l() {
        if (!this.f51837f || this.f51838g) {
            return;
        }
        if (this.f51839h) {
            bb.j.a(this.f51846o == null, "Pending target must be null when starting from the first frame");
            this.f51832a.f();
            this.f51839h = false;
        }
        a aVar = this.f51846o;
        if (aVar != null) {
            this.f51846o = null;
            m(aVar);
            return;
        }
        this.f51838g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f51832a.e();
        this.f51832a.b();
        this.f51843l = new a(this.f51833b, this.f51832a.g(), uptimeMillis);
        this.f51840i.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.signatureOf(g())).mo99load((Object) this.f51832a).into((com.bumptech.glide.j<Bitmap>) this.f51843l);
    }

    private void n() {
        Bitmap bitmap = this.f51844m;
        if (bitmap != null) {
            this.f51836e.b(bitmap);
            this.f51844m = null;
        }
    }

    private void p() {
        if (this.f51837f) {
            return;
        }
        this.f51837f = true;
        this.f51842k = false;
        l();
    }

    private void q() {
        this.f51837f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f51834c.clear();
        n();
        q();
        a aVar = this.f51841j;
        if (aVar != null) {
            this.f51835d.clear(aVar);
            this.f51841j = null;
        }
        a aVar2 = this.f51843l;
        if (aVar2 != null) {
            this.f51835d.clear(aVar2);
            this.f51843l = null;
        }
        a aVar3 = this.f51846o;
        if (aVar3 != null) {
            this.f51835d.clear(aVar3);
            this.f51846o = null;
        }
        this.f51832a.clear();
        this.f51842k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f51832a.d().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f51841j;
        return aVar != null ? aVar.a() : this.f51844m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f51841j;
        if (aVar != null) {
            return aVar.f51852e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f51844m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f51832a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f51850s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f51832a.h() + this.f51848q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f51849r;
    }

    void m(a aVar) {
        d dVar = this.f51847p;
        if (dVar != null) {
            dVar.a();
        }
        this.f51838g = false;
        if (this.f51842k) {
            this.f51833b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f51837f) {
            if (this.f51839h) {
                this.f51833b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f51846o = aVar;
            }
        } else {
            if (aVar.a() != null) {
                n();
                a aVar2 = this.f51841j;
                this.f51841j = aVar;
                for (int size = this.f51834c.size() - 1; size >= 0; size--) {
                    this.f51834c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f51833b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ha.h<Bitmap> hVar, Bitmap bitmap) {
        this.f51845n = (ha.h) bb.j.d(hVar);
        this.f51844m = (Bitmap) bb.j.d(bitmap);
        this.f51840i = this.f51840i.apply((com.bumptech.glide.request.a<?>) new com.bumptech.glide.request.h().transform(hVar));
        this.f51848q = bb.k.h(bitmap);
        this.f51849r = bitmap.getWidth();
        this.f51850s = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(b bVar) {
        if (!this.f51842k) {
            if (!this.f51834c.contains(bVar)) {
                boolean isEmpty = this.f51834c.isEmpty();
                this.f51834c.add(bVar);
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f51834c.remove(bVar);
        if (this.f51834c.isEmpty()) {
            q();
        }
    }

    g(ka.e eVar, k kVar, fa.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, ha.h<Bitmap> hVar, Bitmap bitmap) {
        this.f51834c = new ArrayList();
        this.f51835d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f51836e = eVar;
        this.f51833b = handler;
        this.f51840i = jVar;
        this.f51832a = aVar;
        o(hVar, bitmap);
    }
}