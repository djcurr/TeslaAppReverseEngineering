package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.d;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.x0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import di.d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class w0 extends e {
    private int A;
    private fi.d B;
    private fi.d C;
    private int D;
    private ei.d E;
    private float F;
    private boolean G;
    private List<nj.b> H;
    private boolean I;
    private boolean J;
    private PriorityTaskManager K;
    private boolean L;
    private gi.a M;

    /* renamed from: b  reason: collision with root package name */
    protected final v0[] f14716b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14717c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f14718d;

    /* renamed from: e  reason: collision with root package name */
    private final c f14719e;

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArraySet<bk.m> f14720f;

    /* renamed from: g  reason: collision with root package name */
    private final CopyOnWriteArraySet<ei.f> f14721g;

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArraySet<nj.k> f14722h;

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArraySet<wi.e> f14723i;

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArraySet<gi.b> f14724j;

    /* renamed from: k  reason: collision with root package name */
    private final d1 f14725k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.exoplayer2.b f14726l;

    /* renamed from: m  reason: collision with root package name */
    private final d f14727m;

    /* renamed from: n  reason: collision with root package name */
    private final x0 f14728n;

    /* renamed from: o  reason: collision with root package name */
    private final a1 f14729o;

    /* renamed from: p  reason: collision with root package name */
    private final b1 f14730p;

    /* renamed from: q  reason: collision with root package name */
    private final long f14731q;

    /* renamed from: r  reason: collision with root package name */
    private ci.i f14732r;

    /* renamed from: s  reason: collision with root package name */
    private ci.i f14733s;

    /* renamed from: t  reason: collision with root package name */
    private AudioTrack f14734t;

    /* renamed from: u  reason: collision with root package name */
    private Surface f14735u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f14736v;

    /* renamed from: w  reason: collision with root package name */
    private int f14737w;

    /* renamed from: x  reason: collision with root package name */
    private SurfaceHolder f14738x;

    /* renamed from: y  reason: collision with root package name */
    private TextureView f14739y;

    /* renamed from: z  reason: collision with root package name */
    private int f14740z;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f14741a;

        /* renamed from: b  reason: collision with root package name */
        private final ci.p f14742b;

        /* renamed from: c  reason: collision with root package name */
        private ak.b f14743c;

        /* renamed from: d  reason: collision with root package name */
        private xj.m f14744d;

        /* renamed from: e  reason: collision with root package name */
        private fj.p f14745e;

        /* renamed from: f  reason: collision with root package name */
        private ci.k f14746f;

        /* renamed from: g  reason: collision with root package name */
        private zj.d f14747g;

        /* renamed from: h  reason: collision with root package name */
        private d1 f14748h;

        /* renamed from: i  reason: collision with root package name */
        private Looper f14749i;

        /* renamed from: j  reason: collision with root package name */
        private PriorityTaskManager f14750j;

        /* renamed from: k  reason: collision with root package name */
        private ei.d f14751k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f14752l;

        /* renamed from: m  reason: collision with root package name */
        private int f14753m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f14754n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f14755o;

        /* renamed from: p  reason: collision with root package name */
        private int f14756p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f14757q;

        /* renamed from: r  reason: collision with root package name */
        private ci.q f14758r;

        /* renamed from: s  reason: collision with root package name */
        private h0 f14759s;

        /* renamed from: t  reason: collision with root package name */
        private long f14760t;

        /* renamed from: u  reason: collision with root package name */
        private long f14761u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f14762v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f14763w;

        public b(Context context, ci.p pVar) {
            this(context, pVar, new ji.f());
        }

        public w0 w() {
            ak.a.f(!this.f14763w);
            this.f14763w = true;
            return new w0(this);
        }

        public b x(zj.d dVar) {
            ak.a.f(!this.f14763w);
            this.f14747g = dVar;
            return this;
        }

        public b y(ci.k kVar) {
            ak.a.f(!this.f14763w);
            this.f14746f = kVar;
            return this;
        }

        public b z(xj.m mVar) {
            ak.a.f(!this.f14763w);
            this.f14744d = mVar;
            return this;
        }

        public b(Context context, ci.p pVar, ji.l lVar) {
            this(context, pVar, new xj.f(context), new com.google.android.exoplayer2.source.e(context, lVar), new ci.d(), zj.j.l(context), new d1(ak.b.f439a));
        }

        public b(Context context, ci.p pVar, xj.m mVar, fj.p pVar2, ci.k kVar, zj.d dVar, d1 d1Var) {
            this.f14741a = context;
            this.f14742b = pVar;
            this.f14744d = mVar;
            this.f14745e = pVar2;
            this.f14746f = kVar;
            this.f14747g = dVar;
            this.f14748h = d1Var;
            this.f14749i = ak.k0.P();
            this.f14751k = ei.d.f25128f;
            this.f14753m = 0;
            this.f14756p = 1;
            this.f14757q = true;
            this.f14758r = ci.q.f9251d;
            this.f14759s = new g.b().a();
            this.f14743c = ak.b.f439a;
            this.f14760t = 500L;
            this.f14761u = 2000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c implements bk.w, com.google.android.exoplayer2.audio.a, nj.k, wi.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, d.b, b.InterfaceC0247b, x0.b, s0.a {
        private c() {
        }

        @Override // bk.w
        public void A(ci.i iVar, fi.e eVar) {
            w0.this.f14732r = iVar;
            w0.this.f14725k.A(iVar, eVar);
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void D(boolean z11) {
            if (w0.this.K != null) {
                if (!z11 || w0.this.L) {
                    if (z11 || !w0.this.L) {
                        return;
                    }
                    w0.this.K.b(0);
                    w0.this.L = false;
                    return;
                }
                w0.this.K.a(0);
                w0.this.L = true;
            }
        }

        @Override // com.google.android.exoplayer2.d.b
        public void F(float f11) {
            w0.this.G0();
        }

        @Override // bk.w
        public void H(int i11, long j11) {
            w0.this.f14725k.H(i11, j11);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void I(ci.i iVar, fi.e eVar) {
            w0.this.f14733s = iVar;
            w0.this.f14725k.I(iVar, eVar);
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void J(boolean z11) {
            w0.this.R0();
        }

        @Override // bk.w
        public void K(fi.d dVar) {
            w0.this.B = dVar;
            w0.this.f14725k.K(dVar);
        }

        @Override // com.google.android.exoplayer2.d.b
        public void M(int i11) {
            boolean o11 = w0.this.o();
            w0.this.Q0(o11, i11, w0.s0(o11, i11));
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void T(boolean z11, int i11) {
            w0.this.R0();
        }

        @Override // bk.w
        public void W(fi.d dVar) {
            w0.this.f14725k.W(dVar);
            w0.this.f14732r = null;
            w0.this.B = null;
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void X(int i11, long j11, long j12) {
            w0.this.f14725k.X(i11, j11, j12);
        }

        @Override // bk.w
        public void Z(long j11, int i11) {
            w0.this.f14725k.Z(j11, i11);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void a(boolean z11) {
            if (w0.this.G == z11) {
                return;
            }
            w0.this.G = z11;
            w0.this.y0();
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0247b
        public void b() {
            w0.this.Q0(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void c(Exception exc) {
            w0.this.f14725k.c(exc);
        }

        @Override // bk.w
        public void d(int i11, int i12, int i13, float f11) {
            w0.this.f14725k.d(i11, i12, i13, f11);
            Iterator it2 = w0.this.f14720f.iterator();
            while (it2.hasNext()) {
                ((bk.m) it2.next()).d(i11, i12, i13, f11);
            }
        }

        @Override // bk.w
        public void i(String str) {
            w0.this.f14725k.i(str);
        }

        @Override // bk.w
        public void k(String str, long j11, long j12) {
            w0.this.f14725k.k(str, j11, j12);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void m(fi.d dVar) {
            w0.this.C = dVar;
            w0.this.f14725k.m(dVar);
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void n(int i11) {
            w0.this.R0();
        }

        @Override // com.google.android.exoplayer2.x0.b
        public void o(int i11) {
            gi.a p02 = w0.p0(w0.this.f14728n);
            if (p02.equals(w0.this.M)) {
                return;
            }
            w0.this.M = p02;
            Iterator it2 = w0.this.f14724j.iterator();
            while (it2.hasNext()) {
                ((gi.b) it2.next()).a(p02);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            w0.this.L0(new Surface(surfaceTexture), true);
            w0.this.x0(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            w0.this.L0(null, true);
            w0.this.x0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            w0.this.x0(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // bk.w
        public void p(Surface surface) {
            w0.this.f14725k.p(surface);
            if (w0.this.f14735u == surface) {
                Iterator it2 = w0.this.f14720f.iterator();
                while (it2.hasNext()) {
                    ((bk.m) it2.next()).i();
                }
            }
        }

        @Override // wi.e
        public void r(wi.a aVar) {
            w0.this.f14725k.o2(aVar);
            Iterator it2 = w0.this.f14723i.iterator();
            while (it2.hasNext()) {
                ((wi.e) it2.next()).r(aVar);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void s(String str) {
            w0.this.f14725k.s(str);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            w0.this.x0(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            w0.this.L0(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            w0.this.L0(null, false);
            w0.this.x0(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void t(String str, long j11, long j12) {
            w0.this.f14725k.t(str, j11, j12);
        }

        @Override // com.google.android.exoplayer2.x0.b
        public void v(int i11, boolean z11) {
            Iterator it2 = w0.this.f14724j.iterator();
            while (it2.hasNext()) {
                ((gi.b) it2.next()).b(i11, z11);
            }
        }

        @Override // nj.k
        public void w(List<nj.b> list) {
            w0.this.H = list;
            Iterator it2 = w0.this.f14722h.iterator();
            while (it2.hasNext()) {
                ((nj.k) it2.next()).w(list);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void x(long j11) {
            w0.this.f14725k.x(j11);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void z(fi.d dVar) {
            w0.this.f14725k.z(dVar);
            w0.this.f14733s = null;
            w0.this.C = null;
        }
    }

    protected w0(b bVar) {
        Context applicationContext = bVar.f14741a.getApplicationContext();
        this.f14717c = applicationContext;
        d1 d1Var = bVar.f14748h;
        this.f14725k = d1Var;
        this.K = bVar.f14750j;
        this.E = bVar.f14751k;
        this.f14737w = bVar.f14756p;
        this.G = bVar.f14755o;
        this.f14731q = bVar.f14761u;
        c cVar = new c();
        this.f14719e = cVar;
        this.f14720f = new CopyOnWriteArraySet<>();
        this.f14721g = new CopyOnWriteArraySet<>();
        this.f14722h = new CopyOnWriteArraySet<>();
        this.f14723i = new CopyOnWriteArraySet<>();
        this.f14724j = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(bVar.f14749i);
        v0[] a11 = bVar.f14742b.a(handler, cVar, cVar, cVar, cVar);
        this.f14716b = a11;
        this.F = 1.0f;
        if (ak.k0.f477a < 21) {
            this.D = w0(0);
        } else {
            this.D = ci.b.a(applicationContext);
        }
        this.H = Collections.emptyList();
        this.I = true;
        d0 d0Var = new d0(a11, bVar.f14744d, bVar.f14745e, bVar.f14746f, bVar.f14747g, d1Var, bVar.f14757q, bVar.f14758r, bVar.f14759s, bVar.f14760t, bVar.f14762v, bVar.f14743c, bVar.f14749i, this);
        this.f14718d = d0Var;
        d0Var.r(cVar);
        com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(bVar.f14741a, handler, cVar);
        this.f14726l = bVar2;
        bVar2.b(bVar.f14754n);
        d dVar = new d(bVar.f14741a, handler, cVar);
        this.f14727m = dVar;
        dVar.m(bVar.f14752l ? this.E : null);
        x0 x0Var = new x0(bVar.f14741a, handler, cVar);
        this.f14728n = x0Var;
        x0Var.h(ak.k0.e0(this.E.f25131c));
        a1 a1Var = new a1(bVar.f14741a);
        this.f14729o = a1Var;
        a1Var.a(bVar.f14753m != 0);
        b1 b1Var = new b1(bVar.f14741a);
        this.f14730p = b1Var;
        b1Var.a(bVar.f14753m == 2);
        this.M = p0(x0Var);
        F0(1, 102, Integer.valueOf(this.D));
        F0(2, 102, Integer.valueOf(this.D));
        F0(1, 3, this.E);
        F0(2, 4, Integer.valueOf(this.f14737w));
        F0(1, 101, Boolean.valueOf(this.G));
    }

    private void C0() {
        TextureView textureView = this.f14739y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f14719e) {
                ak.o.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f14739y.setSurfaceTextureListener(null);
            }
            this.f14739y = null;
        }
        SurfaceHolder surfaceHolder = this.f14738x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f14719e);
            this.f14738x = null;
        }
    }

    private void F0(int i11, int i12, Object obj) {
        v0[] v0VarArr;
        for (v0 v0Var : this.f14716b) {
            if (v0Var.d() == i11) {
                this.f14718d.e0(v0Var).n(i12).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        F0(1, 2, Float.valueOf(this.F * this.f14727m.g()));
    }

    private void J0(bk.j jVar) {
        F0(2, 8, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(Surface surface, boolean z11) {
        v0[] v0VarArr;
        ArrayList<t0> arrayList = new ArrayList();
        for (v0 v0Var : this.f14716b) {
            if (v0Var.d() == 2) {
                arrayList.add(this.f14718d.e0(v0Var).n(1).m(surface).l());
            }
        }
        Surface surface2 = this.f14735u;
        if (surface2 != null && surface2 != surface) {
            try {
                for (t0 t0Var : arrayList) {
                    t0Var.a(this.f14731q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f14718d.U0(false, ExoPlaybackException.b(new ExoTimeoutException(3)));
            }
            if (this.f14736v) {
                this.f14735u.release();
            }
        }
        this.f14735u = surface;
        this.f14736v = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(boolean z11, int i11, int i12) {
        int i13 = 0;
        boolean z12 = z11 && i11 != -1;
        if (z12 && i11 != 1) {
            i13 = 1;
        }
        this.f14718d.R0(z12, i13, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        int w11 = w();
        boolean z11 = true;
        if (w11 != 1) {
            if (w11 == 2 || w11 == 3) {
                boolean q02 = q0();
                a1 a1Var = this.f14729o;
                if (!o() || q02) {
                    z11 = false;
                }
                a1Var.b(z11);
                this.f14730p.b(o());
                return;
            } else if (w11 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f14729o.b(false);
        this.f14730p.b(false);
    }

    private void S0() {
        if (Looper.myLooper() != m()) {
            if (!this.I) {
                ak.o.i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.J ? null : new IllegalStateException());
                this.J = true;
                return;
            }
            throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gi.a p0(x0 x0Var) {
        return new gi.a(0, x0Var.d(), x0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s0(boolean z11, int i11) {
        return (!z11 || i11 == 1) ? 1 : 2;
    }

    private int w0(int i11) {
        AudioTrack audioTrack = this.f14734t;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i11) {
            this.f14734t.release();
            this.f14734t = null;
        }
        if (this.f14734t == null) {
            this.f14734t = new AudioTrack(3, 4000, 4, 2, 2, 0, i11);
        }
        return this.f14734t.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(int i11, int i12) {
        if (i11 == this.f14740z && i12 == this.A) {
            return;
        }
        this.f14740z = i11;
        this.A = i12;
        this.f14725k.p2(i11, i12);
        Iterator<bk.m> it2 = this.f14720f.iterator();
        while (it2.hasNext()) {
            it2.next().k(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        this.f14725k.a(this.G);
        Iterator<ei.f> it2 = this.f14721g.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.G);
        }
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean A() {
        S0();
        return this.f14718d.A();
    }

    public void A0() {
        AudioTrack audioTrack;
        S0();
        if (ak.k0.f477a < 21 && (audioTrack = this.f14734t) != null) {
            audioTrack.release();
            this.f14734t = null;
        }
        this.f14726l.b(false);
        this.f14728n.g();
        this.f14729o.b(false);
        this.f14730p.b(false);
        this.f14727m.i();
        this.f14718d.M0();
        this.f14725k.r2();
        C0();
        Surface surface = this.f14735u;
        if (surface != null) {
            if (this.f14736v) {
                surface.release();
            }
            this.f14735u = null;
        }
        if (this.L) {
            ((PriorityTaskManager) ak.a.e(this.K)).b(0);
            this.L = false;
        }
        this.H = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.s0
    public long B() {
        S0();
        return this.f14718d.B();
    }

    public void B0(wi.e eVar) {
        this.f14723i.remove(eVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public long C() {
        S0();
        return this.f14718d.C();
    }

    public void D0(nj.k kVar) {
        this.f14722h.remove(kVar);
    }

    public void E0(bk.m mVar) {
        this.f14720f.remove(mVar);
    }

    public void H0(List<com.google.android.exoplayer2.source.j> list, int i11, long j11) {
        S0();
        this.f14725k.s2();
        this.f14718d.P0(list, i11, j11);
    }

    public void I0(ci.l lVar) {
        S0();
        this.f14718d.S0(lVar);
    }

    public void K0(SurfaceHolder surfaceHolder) {
        S0();
        C0();
        if (surfaceHolder != null) {
            J0(null);
        }
        this.f14738x = surfaceHolder;
        if (surfaceHolder == null) {
            L0(null, false);
            x0(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f14719e);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            L0(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            x0(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        L0(null, false);
        x0(0, 0);
    }

    public void M0(SurfaceView surfaceView) {
        S0();
        if (surfaceView instanceof bk.i) {
            bk.j videoDecoderOutputBufferRenderer = ((bk.i) surfaceView).getVideoDecoderOutputBufferRenderer();
            l0();
            this.f14738x = surfaceView.getHolder();
            J0(videoDecoderOutputBufferRenderer);
            return;
        }
        K0(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void N0(TextureView textureView) {
        S0();
        C0();
        if (textureView != null) {
            J0(null);
        }
        this.f14739y = textureView;
        if (textureView == null) {
            L0(null, true);
            x0(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            ak.o.h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f14719e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            L0(null, true);
            x0(0, 0);
            return;
        }
        L0(new Surface(surfaceTexture), true);
        x0(textureView.getWidth(), textureView.getHeight());
    }

    public void O0(float f11) {
        S0();
        float q11 = ak.k0.q(f11, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.F == q11) {
            return;
        }
        this.F = q11;
        G0();
        this.f14725k.q2(q11);
        Iterator<ei.f> it2 = this.f14721g.iterator();
        while (it2.hasNext()) {
            it2.next().b(q11);
        }
    }

    public void P0(boolean z11) {
        S0();
        this.f14727m.p(o(), 1);
        this.f14718d.T0(z11);
        this.H = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.s0
    public void a() {
        S0();
        boolean o11 = o();
        int p11 = this.f14727m.p(o11, 2);
        Q0(o11, p11, s0(o11, p11));
        this.f14718d.a();
    }

    @Override // com.google.android.exoplayer2.s0
    public ci.l b() {
        S0();
        return this.f14718d.b();
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean c() {
        S0();
        return this.f14718d.c();
    }

    @Override // com.google.android.exoplayer2.s0
    public long d() {
        S0();
        return this.f14718d.d();
    }

    @Override // com.google.android.exoplayer2.s0
    public void f(s0.a aVar) {
        this.f14718d.f(aVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public int g() {
        S0();
        return this.f14718d.g();
    }

    @Override // com.google.android.exoplayer2.s0
    public void h(boolean z11) {
        S0();
        int p11 = this.f14727m.p(z11, w());
        Q0(z11, p11, s0(z11, p11));
    }

    @Override // com.google.android.exoplayer2.s0
    public int i() {
        S0();
        return this.f14718d.i();
    }

    public void i0(wi.e eVar) {
        ak.a.e(eVar);
        this.f14723i.add(eVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public int j() {
        S0();
        return this.f14718d.j();
    }

    public void j0(nj.k kVar) {
        ak.a.e(kVar);
        this.f14722h.add(kVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public long k() {
        S0();
        return this.f14718d.k();
    }

    public void k0(bk.m mVar) {
        ak.a.e(mVar);
        this.f14720f.add(mVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public z0 l() {
        S0();
        return this.f14718d.l();
    }

    public void l0() {
        S0();
        C0();
        L0(null, false);
        x0(0, 0);
    }

    @Override // com.google.android.exoplayer2.s0
    public Looper m() {
        return this.f14718d.m();
    }

    public void m0(SurfaceHolder surfaceHolder) {
        S0();
        if (surfaceHolder == null || surfaceHolder != this.f14738x) {
            return;
        }
        K0(null);
    }

    @Override // com.google.android.exoplayer2.s0
    public void n(int i11, long j11) {
        S0();
        this.f14725k.n2();
        this.f14718d.n(i11, j11);
    }

    public void n0(SurfaceView surfaceView) {
        S0();
        if (surfaceView instanceof bk.i) {
            if (surfaceView.getHolder() == this.f14738x) {
                J0(null);
                this.f14738x = null;
                return;
            }
            return;
        }
        m0(surfaceView != null ? surfaceView.getHolder() : null);
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean o() {
        S0();
        return this.f14718d.o();
    }

    public void o0(TextureView textureView) {
        S0();
        if (textureView == null || textureView != this.f14739y) {
            return;
        }
        N0(null);
    }

    @Override // com.google.android.exoplayer2.s0
    public void p(boolean z11) {
        S0();
        this.f14718d.p(z11);
    }

    @Override // com.google.android.exoplayer2.s0
    public int q() {
        S0();
        return this.f14718d.q();
    }

    public boolean q0() {
        S0();
        return this.f14718d.g0();
    }

    @Override // com.google.android.exoplayer2.s0
    public void r(s0.a aVar) {
        ak.a.e(aVar);
        this.f14718d.r(aVar);
    }

    public xj.k r0() {
        S0();
        return this.f14718d.h0();
    }

    @Override // com.google.android.exoplayer2.s0
    public int s() {
        S0();
        return this.f14718d.s();
    }

    @Override // com.google.android.exoplayer2.s0
    public long t() {
        S0();
        return this.f14718d.t();
    }

    public int t0() {
        S0();
        return this.f14718d.l0();
    }

    public int u0(int i11) {
        S0();
        return this.f14718d.m0(i11);
    }

    @Override // com.google.android.exoplayer2.s0
    public long v() {
        S0();
        return this.f14718d.v();
    }

    public ci.i v0() {
        return this.f14732r;
    }

    @Override // com.google.android.exoplayer2.s0
    public int w() {
        S0();
        return this.f14718d.w();
    }

    @Override // com.google.android.exoplayer2.s0
    public void x(int i11) {
        S0();
        this.f14718d.x(i11);
    }

    @Override // com.google.android.exoplayer2.s0
    public int z() {
        S0();
        return this.f14718d.z();
    }

    @Deprecated
    public void z0(com.google.android.exoplayer2.source.j jVar, boolean z11, boolean z12) {
        S0();
        H0(Collections.singletonList(jVar), z11 ? 0 : -1, -9223372036854775807L);
        a();
    }
}