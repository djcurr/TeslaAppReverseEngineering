package com.google.android.exoplayer2.source.dash;

import ak.b0;
import ak.k0;
import ak.o;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.z0;
import fj.p;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jj.i;
import org.slf4j.Marker;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    private final l A;
    private com.google.android.exoplayer2.upstream.a B;
    private Loader C;
    private n E;
    private IOException F;
    private Handler G;
    private i0.f H;
    private Uri K;
    private Uri L;
    private jj.b O;
    private boolean P;
    private long Q;
    private long R;
    private long T;
    private int Y;

    /* renamed from: b1 */
    private long f13821b1;

    /* renamed from: g */
    private final i0 f13822g;

    /* renamed from: g1 */
    private int f13823g1;

    /* renamed from: h */
    private final boolean f13824h;

    /* renamed from: i */
    private final a.InterfaceC0258a f13825i;

    /* renamed from: j */
    private final a.InterfaceC0250a f13826j;

    /* renamed from: k */
    private final fj.c f13827k;

    /* renamed from: l */
    private final com.google.android.exoplayer2.drm.g f13828l;

    /* renamed from: m */
    private final com.google.android.exoplayer2.upstream.g f13829m;

    /* renamed from: n */
    private final long f13830n;

    /* renamed from: o */
    private final k.a f13831o;

    /* renamed from: p */
    private final h.a<? extends jj.b> f13832p;

    /* renamed from: q */
    private final e f13833q;

    /* renamed from: t */
    private final Object f13834t;

    /* renamed from: w */
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> f13835w;

    /* renamed from: x */
    private final Runnable f13836x;

    /* renamed from: y */
    private final Runnable f13837y;

    /* renamed from: z */
    private final e.b f13838z;

    /* loaded from: classes3.dex */
    public static final class Factory implements p {

        /* renamed from: a */
        private final a.InterfaceC0250a f13839a;

        /* renamed from: b */
        private final a.InterfaceC0258a f13840b;

        /* renamed from: c */
        private hi.l f13841c;

        /* renamed from: d */
        private fj.c f13842d;

        /* renamed from: e */
        private com.google.android.exoplayer2.upstream.g f13843e;

        /* renamed from: f */
        private long f13844f;

        /* renamed from: g */
        private long f13845g;

        /* renamed from: h */
        private h.a<? extends jj.b> f13846h;

        /* renamed from: i */
        private List<ej.c> f13847i;

        /* renamed from: j */
        private Object f13848j;

        public Factory(a.InterfaceC0258a interfaceC0258a) {
            this(new c.a(interfaceC0258a), interfaceC0258a);
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g a(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return d(gVar, i0Var);
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g d(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return gVar;
        }

        @Deprecated
        public DashMediaSource b(Uri uri) {
            return c(new i0.c().i(uri).e("application/dash+xml").h(this.f13848j).a());
        }

        public DashMediaSource c(i0 i0Var) {
            List<ej.c> list;
            i0 i0Var2 = i0Var;
            ak.a.e(i0Var2.f13502b);
            h.a aVar = this.f13846h;
            if (aVar == null) {
                aVar = new jj.c();
            }
            if (i0Var2.f13502b.f13556e.isEmpty()) {
                list = this.f13847i;
            } else {
                list = i0Var2.f13502b.f13556e;
            }
            ej.b bVar = !list.isEmpty() ? new ej.b(aVar, list) : aVar;
            i0.g gVar = i0Var2.f13502b;
            boolean z11 = true;
            boolean z12 = gVar.f13559h == null && this.f13848j != null;
            boolean z13 = gVar.f13556e.isEmpty() && !list.isEmpty();
            if (i0Var2.f13503c.f13547a != -9223372036854775807L || this.f13844f == -9223372036854775807L) {
                z11 = false;
            }
            if (z12 || z13 || z11) {
                i0.c a11 = i0Var.a();
                if (z12) {
                    a11.h(this.f13848j);
                }
                if (z13) {
                    a11.f(list);
                }
                if (z11) {
                    a11.c(this.f13844f);
                }
                i0Var2 = a11.a();
            }
            i0 i0Var3 = i0Var2;
            return new DashMediaSource(i0Var3, null, this.f13840b, bVar, this.f13839a, this.f13842d, this.f13841c.a(i0Var3), this.f13843e, this.f13845g, null);
        }

        public Factory e(final com.google.android.exoplayer2.drm.g gVar) {
            if (gVar == null) {
                f(null);
            } else {
                f(new hi.l() { // from class: ij.c
                    @Override // hi.l
                    public final g a(i0 i0Var) {
                        return DashMediaSource.Factory.a(g.this, i0Var);
                    }
                });
            }
            return this;
        }

        public Factory f(hi.l lVar) {
            if (lVar != null) {
                this.f13841c = lVar;
            } else {
                this.f13841c = new com.google.android.exoplayer2.drm.d();
            }
            return this;
        }

        public Factory g(com.google.android.exoplayer2.upstream.g gVar) {
            if (gVar == null) {
                gVar = new com.google.android.exoplayer2.upstream.f();
            }
            this.f13843e = gVar;
            return this;
        }

        public Factory(a.InterfaceC0250a interfaceC0250a, a.InterfaceC0258a interfaceC0258a) {
            this.f13839a = (a.InterfaceC0250a) ak.a.e(interfaceC0250a);
            this.f13840b = interfaceC0258a;
            this.f13841c = new com.google.android.exoplayer2.drm.d();
            this.f13843e = new com.google.android.exoplayer2.upstream.f();
            this.f13844f = -9223372036854775807L;
            this.f13845g = 30000L;
            this.f13842d = new fj.d();
            this.f13847i = Collections.emptyList();
        }
    }

    /* loaded from: classes3.dex */
    public class a implements b0.b {
        a() {
            DashMediaSource.this = r1;
        }

        @Override // ak.b0.b
        public void a(IOException iOException) {
            DashMediaSource.this.Y(iOException);
        }

        @Override // ak.b0.b
        public void b() {
            DashMediaSource.this.Z(b0.h());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends z0 {

        /* renamed from: b */
        private final long f13850b;

        /* renamed from: c */
        private final long f13851c;

        /* renamed from: d */
        private final long f13852d;

        /* renamed from: e */
        private final int f13853e;

        /* renamed from: f */
        private final long f13854f;

        /* renamed from: g */
        private final long f13855g;

        /* renamed from: h */
        private final long f13856h;

        /* renamed from: i */
        private final jj.b f13857i;

        /* renamed from: j */
        private final i0 f13858j;

        /* renamed from: k */
        private final i0.f f13859k;

        public b(long j11, long j12, long j13, int i11, long j14, long j15, long j16, jj.b bVar, i0 i0Var, i0.f fVar) {
            ak.a.f(bVar.f33804d == (fVar != null));
            this.f13850b = j11;
            this.f13851c = j12;
            this.f13852d = j13;
            this.f13853e = i11;
            this.f13854f = j14;
            this.f13855g = j15;
            this.f13856h = j16;
            this.f13857i = bVar;
            this.f13858j = i0Var;
            this.f13859k = fVar;
        }

        private long s(long j11) {
            ij.d b11;
            long j12 = this.f13856h;
            if (t(this.f13857i)) {
                if (j11 > 0) {
                    j12 += j11;
                    if (j12 > this.f13855g) {
                        return -9223372036854775807L;
                    }
                }
                long j13 = this.f13854f + j12;
                long g11 = this.f13857i.g(0);
                int i11 = 0;
                while (i11 < this.f13857i.e() - 1 && j13 >= g11) {
                    j13 -= g11;
                    i11++;
                    g11 = this.f13857i.g(i11);
                }
                jj.f d11 = this.f13857i.d(i11);
                int a11 = d11.a(2);
                return (a11 == -1 || (b11 = d11.f33835c.get(a11).f33797c.get(0).b()) == null || b11.i(g11) == 0) ? j12 : (j12 + b11.c(b11.h(j13, g11))) - j13;
            }
            return j12;
        }

        private static boolean t(jj.b bVar) {
            return bVar.f33804d && bVar.f33805e != -9223372036854775807L && bVar.f33802b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.z0
        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f13853e) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.z0
        public z0.b g(int i11, z0.b bVar, boolean z11) {
            ak.a.c(i11, 0, i());
            return bVar.n(z11 ? this.f13857i.d(i11).f33833a : null, z11 ? Integer.valueOf(this.f13853e + i11) : null, 0, this.f13857i.g(i11), ci.b.c(this.f13857i.d(i11).f33834b - this.f13857i.d(0).f33834b) - this.f13854f);
        }

        @Override // com.google.android.exoplayer2.z0
        public int i() {
            return this.f13857i.e();
        }

        @Override // com.google.android.exoplayer2.z0
        public Object m(int i11) {
            ak.a.c(i11, 0, i());
            return Integer.valueOf(this.f13853e + i11);
        }

        @Override // com.google.android.exoplayer2.z0
        public z0.c o(int i11, z0.c cVar, long j11) {
            ak.a.c(i11, 0, 1);
            long s11 = s(j11);
            Object obj = z0.c.f14785r;
            i0 i0Var = this.f13858j;
            jj.b bVar = this.f13857i;
            return cVar.g(obj, i0Var, bVar, this.f13850b, this.f13851c, this.f13852d, true, t(bVar), this.f13859k, s11, this.f13855g, 0, i() - 1, this.f13854f);
        }

        @Override // com.google.android.exoplayer2.z0
        public int p() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c implements e.b {
        private c() {
            DashMediaSource.this = r1;
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a(long j11) {
            DashMediaSource.this.R(j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b() {
            DashMediaSource.this.S();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements h.a<Long> {

        /* renamed from: a */
        private static final Pattern f13861a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // com.google.android.exoplayer2.upstream.h.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, com.google.common.base.f.f15920c)).readLine();
            try {
                Matcher matcher = f13861a.matcher(readLine);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(readLine);
                    throw new ParserException(valueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(valueOf) : new String("Couldn't parse timestamp: "));
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j11 = Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j11 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e11) {
                throw new ParserException(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class e implements Loader.b<com.google.android.exoplayer2.upstream.h<jj.b>> {
        private e() {
            DashMediaSource.this = r1;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: a */
        public void i(com.google.android.exoplayer2.upstream.h<jj.b> hVar, long j11, long j12, boolean z11) {
            DashMediaSource.this.T(hVar, j11, j12);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: b */
        public void j(com.google.android.exoplayer2.upstream.h<jj.b> hVar, long j11, long j12) {
            DashMediaSource.this.U(hVar, j11, j12);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: c */
        public Loader.c n(com.google.android.exoplayer2.upstream.h<jj.b> hVar, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.V(hVar, j11, j12, iOException, i11);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class f implements l {
        f() {
            DashMediaSource.this = r1;
        }

        private void b() {
            if (DashMediaSource.this.F != null) {
                throw DashMediaSource.this.F;
            }
        }

        @Override // zj.l
        public void a() {
            DashMediaSource.this.C.a();
            b();
        }
    }

    /* loaded from: classes3.dex */
    public final class g implements Loader.b<com.google.android.exoplayer2.upstream.h<Long>> {
        private g() {
            DashMediaSource.this = r1;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: a */
        public void i(com.google.android.exoplayer2.upstream.h<Long> hVar, long j11, long j12, boolean z11) {
            DashMediaSource.this.T(hVar, j11, j12);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: b */
        public void j(com.google.android.exoplayer2.upstream.h<Long> hVar, long j11, long j12) {
            DashMediaSource.this.W(hVar, j11, j12);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: c */
        public Loader.c n(com.google.android.exoplayer2.upstream.h<Long> hVar, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.X(hVar, j11, j12, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements h.a<Long> {
        private h() {
        }

        @Override // com.google.android.exoplayer2.upstream.h.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(k0.D0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        ci.h.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(i0 i0Var, jj.b bVar, a.InterfaceC0258a interfaceC0258a, h.a aVar, a.InterfaceC0250a interfaceC0250a, fj.c cVar, com.google.android.exoplayer2.drm.g gVar, com.google.android.exoplayer2.upstream.g gVar2, long j11, a aVar2) {
        this(i0Var, bVar, interfaceC0258a, aVar, interfaceC0250a, cVar, gVar, gVar2, j11);
    }

    public static /* synthetic */ void D(DashMediaSource dashMediaSource) {
        dashMediaSource.g0();
    }

    public static /* synthetic */ void E(DashMediaSource dashMediaSource) {
        dashMediaSource.P();
    }

    private static long J(jj.f fVar, long j11, long j12) {
        long c11 = ci.b.c(fVar.f33834b);
        boolean N = N(fVar);
        int i11 = 0;
        long j13 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < fVar.f33835c.size()) {
            jj.a aVar = fVar.f33835c.get(i12);
            List<i> list = aVar.f33797c;
            if ((!N || aVar.f33796b != 3) && !list.isEmpty()) {
                ij.d b11 = list.get(i11).b();
                if (b11 == null) {
                    return c11 + j11;
                }
                int l11 = b11.l(j11, j12);
                if (l11 == 0) {
                    return c11;
                }
                long e11 = (b11.e(j11, j12) + l11) - 1;
                j13 = Math.min(j13, b11.c(e11) + c11 + b11.d(e11, j11));
            }
            i12++;
            i11 = 0;
        }
        return j13;
    }

    private static long K(jj.f fVar, long j11, long j12) {
        long c11 = ci.b.c(fVar.f33834b);
        boolean N = N(fVar);
        long j13 = c11;
        for (int i11 = 0; i11 < fVar.f33835c.size(); i11++) {
            jj.a aVar = fVar.f33835c.get(i11);
            List<i> list = aVar.f33797c;
            if ((!N || aVar.f33796b != 3) && !list.isEmpty()) {
                ij.d b11 = list.get(0).b();
                if (b11 == null || b11.l(j11, j12) == 0) {
                    return c11;
                }
                j13 = Math.max(j13, b11.c(b11.e(j11, j12)) + c11);
            }
        }
        return j13;
    }

    private static long L(jj.b bVar, long j11) {
        ij.d b11;
        int e11 = bVar.e() - 1;
        jj.f d11 = bVar.d(e11);
        long c11 = ci.b.c(d11.f33834b);
        long g11 = bVar.g(e11);
        long c12 = ci.b.c(j11);
        long c13 = ci.b.c(bVar.f33801a);
        long c14 = ci.b.c(5000L);
        for (int i11 = 0; i11 < d11.f33835c.size(); i11++) {
            List<i> list = d11.f33835c.get(i11).f33797c;
            if (!list.isEmpty() && (b11 = list.get(0).b()) != null) {
                long f11 = ((c13 + c11) + b11.f(g11, c12)) - c12;
                if (f11 < c14 - 100000 || (f11 > c14 && f11 < c14 + 100000)) {
                    c14 = f11;
                }
            }
        }
        return el.b.d(c14, 1000L, RoundingMode.CEILING);
    }

    private long M() {
        return Math.min((this.Y - 1) * 1000, 5000);
    }

    private static boolean N(jj.f fVar) {
        for (int i11 = 0; i11 < fVar.f33835c.size(); i11++) {
            int i12 = fVar.f33835c.get(i11).f33796b;
            if (i12 == 1 || i12 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean O(jj.f fVar) {
        for (int i11 = 0; i11 < fVar.f33835c.size(); i11++) {
            ij.d b11 = fVar.f33835c.get(i11).f33797c.get(0).b();
            if (b11 == null || b11.j()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void P() {
        a0(false);
    }

    private void Q() {
        b0.j(this.C, new a());
    }

    public void Y(IOException iOException) {
        o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        a0(true);
    }

    public void Z(long j11) {
        this.T = j11;
        a0(true);
    }

    private void a0(boolean z11) {
        jj.f fVar;
        long j11;
        long j12;
        for (int i11 = 0; i11 < this.f13835w.size(); i11++) {
            int keyAt = this.f13835w.keyAt(i11);
            if (keyAt >= this.f13823g1) {
                this.f13835w.valueAt(i11).M(this.O, keyAt - this.f13823g1);
            }
        }
        jj.f d11 = this.O.d(0);
        int e11 = this.O.e() - 1;
        jj.f d12 = this.O.d(e11);
        long g11 = this.O.g(e11);
        long c11 = ci.b.c(k0.Z(this.T));
        long K = K(d11, this.O.g(0), c11);
        long J = J(d12, g11, c11);
        boolean z12 = this.O.f33804d && !O(d12);
        if (z12) {
            long j13 = this.O.f33806f;
            if (j13 != -9223372036854775807L) {
                K = Math.max(K, J - ci.b.c(j13));
            }
        }
        long j14 = J - K;
        jj.b bVar = this.O;
        if (bVar.f33804d) {
            ak.a.f(bVar.f33801a != -9223372036854775807L);
            long c12 = (c11 - ci.b.c(this.O.f33801a)) - K;
            h0(c12, j14);
            long d13 = this.O.f33801a + ci.b.d(K);
            long c13 = c12 - ci.b.c(this.H.f13547a);
            long min = Math.min(5000000L, j14 / 2);
            j11 = d13;
            j12 = c13 < min ? min : c13;
            fVar = d11;
        } else {
            fVar = d11;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long c14 = K - ci.b.c(fVar.f33834b);
        jj.b bVar2 = this.O;
        B(new b(bVar2.f33801a, j11, this.T, this.f13823g1, c14, j14, j12, bVar2, this.f13822g, bVar2.f33804d ? this.H : null));
        if (this.f13824h) {
            return;
        }
        this.G.removeCallbacks(this.f13837y);
        if (z12) {
            this.G.postDelayed(this.f13837y, L(this.O, k0.Z(this.T)));
        }
        if (this.P) {
            g0();
        } else if (z11) {
            jj.b bVar3 = this.O;
            if (bVar3.f33804d) {
                long j15 = bVar3.f33805e;
                if (j15 != -9223372036854775807L) {
                    if (j15 == 0) {
                        j15 = 5000;
                    }
                    e0(Math.max(0L, (this.Q + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void b0(jj.n nVar) {
        String str = nVar.f33882a;
        if (!k0.c(str, "urn:mpeg:dash:utc:direct:2014") && !k0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            if (!k0.c(str, "urn:mpeg:dash:utc:http-iso:2014") && !k0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!k0.c(str, "urn:mpeg:dash:utc:ntp:2014") && !k0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        Y(new IOException("Unsupported UTC timing scheme"));
                        return;
                    } else {
                        Q();
                        return;
                    }
                }
                d0(nVar, new h(null));
                return;
            }
            d0(nVar, new d());
            return;
        }
        c0(nVar);
    }

    private void c0(jj.n nVar) {
        try {
            Z(k0.D0(nVar.f33883b) - this.R);
        } catch (ParserException e11) {
            Y(e11);
        }
    }

    private void d0(jj.n nVar, h.a<Long> aVar) {
        f0(new com.google.android.exoplayer2.upstream.h(this.B, Uri.parse(nVar.f33883b), 5, aVar), new g(this, null), 1);
    }

    private void e0(long j11) {
        this.G.postDelayed(this.f13836x, j11);
    }

    private <T> void f0(com.google.android.exoplayer2.upstream.h<T> hVar, Loader.b<com.google.android.exoplayer2.upstream.h<T>> bVar, int i11) {
        this.f13831o.z(new fj.g(hVar.f14696a, hVar.f14697b, this.C.n(hVar, bVar, i11)), hVar.f14698c);
    }

    public void g0() {
        Uri uri;
        this.G.removeCallbacks(this.f13836x);
        if (this.C.i()) {
            return;
        }
        if (this.C.j()) {
            this.P = true;
            return;
        }
        synchronized (this.f13834t) {
            uri = this.K;
        }
        this.P = false;
        f0(new com.google.android.exoplayer2.upstream.h(this.B, uri, 4, this.f13832p), this.f13833q, this.f13829m.d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x001b, code lost:
        if (r1 != (-9223372036854775807L)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0038, code lost:
        if (r5 != (-9223372036854775807L)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h0(long r15, long r17) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.h0(long, long):void");
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(n nVar) {
        this.E = nVar;
        this.f13828l.a();
        if (this.f13824h) {
            a0(false);
            return;
        }
        this.B = this.f13825i.a();
        this.C = new Loader("Loader:DashMediaSource");
        this.G = k0.x();
        g0();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.P = false;
        this.B = null;
        Loader loader = this.C;
        if (loader != null) {
            loader.l();
            this.C = null;
        }
        this.Q = 0L;
        this.R = 0L;
        this.O = this.f13824h ? this.O : null;
        this.K = this.L;
        this.F = null;
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.G = null;
        }
        this.T = -9223372036854775807L;
        this.Y = 0;
        this.f13821b1 = -9223372036854775807L;
        this.f13823g1 = 0;
        this.f13835w.clear();
        this.f13828l.release();
    }

    void R(long j11) {
        long j12 = this.f13821b1;
        if (j12 == -9223372036854775807L || j12 < j11) {
            this.f13821b1 = j11;
        }
    }

    void S() {
        this.G.removeCallbacks(this.f13837y);
        g0();
    }

    void T(com.google.android.exoplayer2.upstream.h<?> hVar, long j11, long j12) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        this.f13829m.f(hVar.f14696a);
        this.f13831o.q(gVar, hVar.f14698c);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void U(com.google.android.exoplayer2.upstream.h<jj.b> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.U(com.google.android.exoplayer2.upstream.h, long, long):void");
    }

    Loader.c V(com.google.android.exoplayer2.upstream.h<jj.b> hVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c h11;
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        long a11 = this.f13829m.a(new g.a(gVar, new fj.h(hVar.f14698c), iOException, i11));
        if (a11 == -9223372036854775807L) {
            h11 = Loader.f14598f;
        } else {
            h11 = Loader.h(false, a11);
        }
        boolean z11 = !h11.c();
        this.f13831o.x(gVar, hVar.f14698c, iOException, z11);
        if (z11) {
            this.f13829m.f(hVar.f14696a);
        }
        return h11;
    }

    void W(com.google.android.exoplayer2.upstream.h<Long> hVar, long j11, long j12) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        this.f13829m.f(hVar.f14696a);
        this.f13831o.t(gVar, hVar.f14698c);
        Z(hVar.e().longValue() - j11);
    }

    Loader.c X(com.google.android.exoplayer2.upstream.h<Long> hVar, long j11, long j12, IOException iOException) {
        this.f13831o.x(new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c()), hVar.f14698c, iOException, true);
        this.f13829m.f(hVar.f14696a);
        Y(iOException);
        return Loader.f14597e;
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f13822g;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(com.google.android.exoplayer2.source.i iVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) iVar;
        bVar.I();
        this.f13835w.remove(bVar.f13865a);
    }

    @Override // com.google.android.exoplayer2.source.j
    public com.google.android.exoplayer2.source.i k(j.a aVar, zj.b bVar, long j11) {
        int intValue = ((Integer) aVar.f26303a).intValue() - this.f13823g1;
        k.a w11 = w(aVar, this.O.d(intValue).f33834b);
        com.google.android.exoplayer2.source.dash.b bVar2 = new com.google.android.exoplayer2.source.dash.b(this.f13823g1 + intValue, this.O, intValue, this.f13826j, this.E, this.f13828l, t(aVar), this.f13829m, w11, this.T, this.A, bVar, this.f13827k, this.f13838z);
        this.f13835w.put(bVar2.f13865a, bVar2);
        return bVar2;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
        this.A.a();
    }

    private DashMediaSource(i0 i0Var, jj.b bVar, a.InterfaceC0258a interfaceC0258a, h.a<? extends jj.b> aVar, a.InterfaceC0250a interfaceC0250a, fj.c cVar, com.google.android.exoplayer2.drm.g gVar, com.google.android.exoplayer2.upstream.g gVar2, long j11) {
        this.f13822g = i0Var;
        this.H = i0Var.f13503c;
        this.K = ((i0.g) ak.a.e(i0Var.f13502b)).f13552a;
        this.L = i0Var.f13502b.f13552a;
        this.O = bVar;
        this.f13825i = interfaceC0258a;
        this.f13832p = aVar;
        this.f13826j = interfaceC0250a;
        this.f13828l = gVar;
        this.f13829m = gVar2;
        this.f13830n = j11;
        this.f13827k = cVar;
        boolean z11 = bVar != null;
        this.f13824h = z11;
        this.f13831o = v(null);
        this.f13834t = new Object();
        this.f13835w = new SparseArray<>();
        this.f13838z = new c(this, null);
        this.f13821b1 = -9223372036854775807L;
        this.T = -9223372036854775807L;
        if (z11) {
            ak.a.f(true ^ bVar.f33804d);
            this.f13833q = null;
            this.f13836x = null;
            this.f13837y = null;
            this.A = new l.a();
            return;
        }
        this.f13833q = new e(this, null);
        this.A = new f();
        this.f13836x = new Runnable() { // from class: ij.a
            {
                DashMediaSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.D(DashMediaSource.this);
            }
        };
        this.f13837y = new Runnable() { // from class: ij.b
            {
                DashMediaSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.E(DashMediaSource.this);
            }
        };
    }
}