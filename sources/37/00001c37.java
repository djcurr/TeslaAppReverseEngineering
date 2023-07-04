package com.google.android.exoplayer2.source.hls.playlist;

import ak.k0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kj.g;
import lj.e;

/* loaded from: classes3.dex */
public final class b implements HlsPlaylistTracker, Loader.b<h<lj.d>> {

    /* renamed from: p */
    public static final HlsPlaylistTracker.a f14036p = new HlsPlaylistTracker.a() { // from class: lj.b
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar) {
            return new com.google.android.exoplayer2.source.hls.playlist.b(gVar, gVar2, eVar);
        }
    };

    /* renamed from: a */
    private final g f14037a;

    /* renamed from: b */
    private final e f14038b;

    /* renamed from: c */
    private final com.google.android.exoplayer2.upstream.g f14039c;

    /* renamed from: d */
    private final HashMap<Uri, a> f14040d;

    /* renamed from: e */
    private final List<HlsPlaylistTracker.b> f14041e;

    /* renamed from: f */
    private final double f14042f;

    /* renamed from: g */
    private k.a f14043g;

    /* renamed from: h */
    private Loader f14044h;

    /* renamed from: i */
    private Handler f14045i;

    /* renamed from: j */
    private HlsPlaylistTracker.c f14046j;

    /* renamed from: k */
    private c f14047k;

    /* renamed from: l */
    private Uri f14048l;

    /* renamed from: m */
    private d f14049m;

    /* renamed from: n */
    private boolean f14050n;

    /* renamed from: o */
    private long f14051o;

    /* loaded from: classes3.dex */
    public final class a implements Loader.b<h<lj.d>> {

        /* renamed from: a */
        private final Uri f14052a;

        /* renamed from: b */
        private final Loader f14053b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final com.google.android.exoplayer2.upstream.a f14054c;

        /* renamed from: d */
        private d f14055d;

        /* renamed from: e */
        private long f14056e;

        /* renamed from: f */
        private long f14057f;

        /* renamed from: g */
        private long f14058g;

        /* renamed from: h */
        private long f14059h;

        /* renamed from: i */
        private boolean f14060i;

        /* renamed from: j */
        private IOException f14061j;

        public a(Uri uri) {
            b.this = r2;
            this.f14052a = uri;
            this.f14054c = r2.f14037a.a(4);
        }

        public static /* synthetic */ void a(a aVar, Uri uri) {
            aVar.l(uri);
        }

        private boolean f(long j11) {
            this.f14059h = SystemClock.elapsedRealtime() + j11;
            return this.f14052a.equals(b.this.f14048l) && !b.this.H();
        }

        private Uri g() {
            d dVar = this.f14055d;
            if (dVar != null) {
                d.f fVar = dVar.f14099t;
                if (fVar.f14117a != -9223372036854775807L || fVar.f14121e) {
                    Uri.Builder buildUpon = this.f14052a.buildUpon();
                    d dVar2 = this.f14055d;
                    if (dVar2.f14099t.f14121e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar2.f14088i + dVar2.f14095p.size()));
                        d dVar3 = this.f14055d;
                        if (dVar3.f14091l != -9223372036854775807L) {
                            List<d.b> list = dVar3.f14096q;
                            int size = list.size();
                            if (!list.isEmpty() && ((d.b) w.b(list)).f14101m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    d.f fVar2 = this.f14055d.f14099t;
                    if (fVar2.f14117a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f14118b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f14052a;
        }

        public /* synthetic */ void l(Uri uri) {
            this.f14060i = false;
            o(uri);
        }

        private void o(Uri uri) {
            h hVar = new h(this.f14054c, uri, 4, b.this.f14038b.a(b.this.f14047k, this.f14055d));
            b.this.f14043g.z(new fj.g(hVar.f14696a, hVar.f14697b, this.f14053b.n(hVar, this, b.this.f14039c.d(hVar.f14698c))), hVar.f14698c);
        }

        public void p(final Uri uri) {
            this.f14059h = 0L;
            if (this.f14060i || this.f14053b.j() || this.f14053b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.f14058g) {
                this.f14060i = true;
                b.this.f14045i.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.a
                    {
                        b.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.a(b.a.this, uri);
                    }
                }, this.f14058g - elapsedRealtime);
                return;
            }
            o(uri);
        }

        public void u(d dVar, fj.g gVar) {
            d dVar2 = this.f14055d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14056e = elapsedRealtime;
            d C = b.this.C(dVar2, dVar);
            this.f14055d = C;
            boolean z11 = true;
            if (C != dVar2) {
                this.f14061j = null;
                this.f14057f = elapsedRealtime;
                b.this.N(this.f14052a, C);
            } else if (!C.f14092m) {
                d dVar3 = this.f14055d;
                if (dVar.f14088i + dVar.f14095p.size() >= dVar3.f14088i) {
                    if (elapsedRealtime - this.f14057f > ci.b.d(dVar3.f14090k) * b.this.f14042f) {
                        this.f14061j = new HlsPlaylistTracker.PlaylistStuckException(this.f14052a);
                        long c11 = b.this.f14039c.c(new g.a(gVar, new fj.h(4), this.f14061j, 1));
                        b.this.J(this.f14052a, c11);
                        if (c11 != -9223372036854775807L) {
                            f(c11);
                        }
                    }
                } else {
                    this.f14061j = new HlsPlaylistTracker.PlaylistResetException(this.f14052a);
                    b.this.J(this.f14052a, -9223372036854775807L);
                }
            }
            long j11 = 0;
            d dVar4 = this.f14055d;
            if (!dVar4.f14099t.f14121e) {
                if (dVar4 != dVar2) {
                    j11 = dVar4.f14090k;
                } else {
                    j11 = dVar4.f14090k / 2;
                }
            }
            this.f14058g = elapsedRealtime + ci.b.d(j11);
            if (this.f14055d.f14091l == -9223372036854775807L && !this.f14052a.equals(b.this.f14048l)) {
                z11 = false;
            }
            if (!z11 || this.f14055d.f14092m) {
                return;
            }
            p(g());
        }

        public d h() {
            return this.f14055d;
        }

        public boolean k() {
            int i11;
            if (this.f14055d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, ci.b.d(this.f14055d.f14098s));
            d dVar = this.f14055d;
            return dVar.f14092m || (i11 = dVar.f14083d) == 2 || i11 == 1 || this.f14056e + max > elapsedRealtime;
        }

        public void m() {
            p(this.f14052a);
        }

        public void q() {
            this.f14053b.a();
            IOException iOException = this.f14061j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: r */
        public void i(h<lj.d> hVar, long j11, long j12, boolean z11) {
            fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
            b.this.f14039c.f(hVar.f14696a);
            b.this.f14043g.q(gVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: s */
        public void j(h<lj.d> hVar, long j11, long j12) {
            lj.d e11 = hVar.e();
            fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
            if (e11 instanceof d) {
                u((d) e11, gVar);
                b.this.f14043g.t(gVar, 4);
            } else {
                this.f14061j = new ParserException("Loaded playlist has unexpected type.");
                b.this.f14043g.x(gVar, 4, this.f14061j, true);
            }
            b.this.f14039c.f(hVar.f14696a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: t */
        public Loader.c n(h<lj.d> hVar, long j11, long j12, IOException iOException, int i11) {
            Loader.c cVar;
            fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
            boolean z11 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((hVar.f().getQueryParameter("_HLS_msn") != null) || z11) {
                int i12 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).f14591a : Integer.MAX_VALUE;
                if (z11 || i12 == 400 || i12 == 503) {
                    this.f14058g = SystemClock.elapsedRealtime();
                    m();
                    ((k.a) k0.j(b.this.f14043g)).x(gVar, hVar.f14698c, iOException, true);
                    return Loader.f14597e;
                }
            }
            g.a aVar = new g.a(gVar, new fj.h(hVar.f14698c), iOException, i11);
            long c11 = b.this.f14039c.c(aVar);
            boolean z12 = c11 != -9223372036854775807L;
            boolean z13 = b.this.J(this.f14052a, c11) || !z12;
            if (z12) {
                z13 |= f(c11);
            }
            if (z13) {
                long a11 = b.this.f14039c.a(aVar);
                if (a11 != -9223372036854775807L) {
                    cVar = Loader.h(false, a11);
                } else {
                    cVar = Loader.f14598f;
                }
            } else {
                cVar = Loader.f14597e;
            }
            boolean z14 = !cVar.c();
            b.this.f14043g.x(gVar, hVar.f14698c, iOException, z14);
            if (z14) {
                b.this.f14039c.f(hVar.f14696a);
            }
            return cVar;
        }

        public void v() {
            this.f14053b.l();
        }
    }

    public b(kj.g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar) {
        this(gVar, gVar2, eVar, 3.5d);
    }

    private void A(List<Uri> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Uri uri = list.get(i11);
            this.f14040d.put(uri, new a(uri));
        }
    }

    private static d.C0252d B(d dVar, d dVar2) {
        int i11 = (int) (dVar2.f14088i - dVar.f14088i);
        List<d.C0252d> list = dVar.f14095p;
        if (i11 < list.size()) {
            return list.get(i11);
        }
        return null;
    }

    public d C(d dVar, d dVar2) {
        if (dVar2.f(dVar)) {
            return dVar2.c(E(dVar, dVar2), D(dVar, dVar2));
        }
        return dVar2.f14092m ? dVar.d() : dVar;
    }

    private int D(d dVar, d dVar2) {
        d.C0252d B;
        if (dVar2.f14086g) {
            return dVar2.f14087h;
        }
        d dVar3 = this.f14049m;
        int i11 = dVar3 != null ? dVar3.f14087h : 0;
        return (dVar == null || (B = B(dVar, dVar2)) == null) ? i11 : (dVar.f14087h + B.f14109d) - dVar2.f14095p.get(0).f14109d;
    }

    private long E(d dVar, d dVar2) {
        if (dVar2.f14093n) {
            return dVar2.f14085f;
        }
        d dVar3 = this.f14049m;
        long j11 = dVar3 != null ? dVar3.f14085f : 0L;
        if (dVar == null) {
            return j11;
        }
        int size = dVar.f14095p.size();
        d.C0252d B = B(dVar, dVar2);
        if (B != null) {
            return dVar.f14085f + B.f14110e;
        }
        return ((long) size) == dVar2.f14088i - dVar.f14088i ? dVar.e() : j11;
    }

    private Uri F(Uri uri) {
        d.c cVar;
        d dVar = this.f14049m;
        if (dVar == null || !dVar.f14099t.f14121e || (cVar = dVar.f14097r.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f14102a));
        int i11 = cVar.f14103b;
        if (i11 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i11));
        }
        return buildUpon.build();
    }

    private boolean G(Uri uri) {
        List<c.b> list = this.f14047k.f14065e;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (uri.equals(list.get(i11).f14077a)) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        List<c.b> list = this.f14047k.f14065e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) ak.a.e(this.f14040d.get(list.get(i11).f14077a));
            if (elapsedRealtime > aVar.f14059h) {
                Uri uri = aVar.f14052a;
                this.f14048l = uri;
                aVar.p(F(uri));
                return true;
            }
        }
        return false;
    }

    private void I(Uri uri) {
        if (uri.equals(this.f14048l) || !G(uri)) {
            return;
        }
        d dVar = this.f14049m;
        if (dVar == null || !dVar.f14092m) {
            this.f14048l = uri;
            this.f14040d.get(uri).p(F(uri));
        }
    }

    public boolean J(Uri uri, long j11) {
        int size = this.f14041e.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            z11 |= !this.f14041e.get(i11).i(uri, j11);
        }
        return z11;
    }

    public void N(Uri uri, d dVar) {
        if (uri.equals(this.f14048l)) {
            if (this.f14049m == null) {
                this.f14050n = !dVar.f14092m;
                this.f14051o = dVar.f14085f;
            }
            this.f14049m = dVar;
            this.f14046j.c(dVar);
        }
        int size = this.f14041e.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f14041e.get(i11).f();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: K */
    public void i(h<lj.d> hVar, long j11, long j12, boolean z11) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        this.f14039c.f(hVar.f14696a);
        this.f14043g.q(gVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: L */
    public void j(h<lj.d> hVar, long j11, long j12) {
        c cVar;
        lj.d e11 = hVar.e();
        boolean z11 = e11 instanceof d;
        if (z11) {
            cVar = c.e(e11.f37205a);
        } else {
            cVar = (c) e11;
        }
        this.f14047k = cVar;
        this.f14048l = cVar.f14065e.get(0).f14077a;
        A(cVar.f14064d);
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        a aVar = this.f14040d.get(this.f14048l);
        if (z11) {
            aVar.u((d) e11, gVar);
        } else {
            aVar.m();
        }
        this.f14039c.f(hVar.f14696a);
        this.f14043g.t(gVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: M */
    public Loader.c n(h<lj.d> hVar, long j11, long j12, IOException iOException, int i11) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        long a11 = this.f14039c.a(new g.a(gVar, new fj.h(hVar.f14698c), iOException, i11));
        boolean z11 = a11 == -9223372036854775807L;
        this.f14043g.x(gVar, hVar.f14698c, iOException, z11);
        if (z11) {
            this.f14039c.f(hVar.f14696a);
        }
        if (z11) {
            return Loader.f14598f;
        }
        return Loader.h(false, a11);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.f14041e.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void b(Uri uri) {
        this.f14040d.get(uri).q();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long c() {
        return this.f14051o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public c d() {
        return this.f14047k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void e(Uri uri) {
        this.f14040d.get(uri).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void f(HlsPlaylistTracker.b bVar) {
        ak.a.e(bVar);
        this.f14041e.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean g(Uri uri) {
        return this.f14040d.get(uri).k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean h() {
        return this.f14050n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void k(Uri uri, k.a aVar, HlsPlaylistTracker.c cVar) {
        this.f14045i = k0.x();
        this.f14043g = aVar;
        this.f14046j = cVar;
        h hVar = new h(this.f14037a.a(4), uri, 4, this.f14038b.b());
        ak.a.f(this.f14044h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f14044h = loader;
        aVar.z(new fj.g(hVar.f14696a, hVar.f14697b, loader.n(hVar, this, this.f14039c.d(hVar.f14698c))), hVar.f14698c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void l() {
        Loader loader = this.f14044h;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.f14048l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public d m(Uri uri, boolean z11) {
        d h11 = this.f14040d.get(uri).h();
        if (h11 != null && z11) {
            I(uri);
        }
        return h11;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f14048l = null;
        this.f14049m = null;
        this.f14047k = null;
        this.f14051o = -9223372036854775807L;
        this.f14044h.l();
        this.f14044h = null;
        for (a aVar : this.f14040d.values()) {
            aVar.v();
        }
        this.f14045i.removeCallbacksAndMessages(null);
        this.f14045i = null;
        this.f14040d.clear();
    }

    public b(kj.g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar, double d11) {
        this.f14037a = gVar;
        this.f14038b = eVar;
        this.f14039c = gVar2;
        this.f14042f = d11;
        this.f14041e = new ArrayList();
        this.f14040d = new HashMap<>();
        this.f14051o = -9223372036854775807L;
    }
}