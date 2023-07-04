package com.google.android.exoplayer2.source.dash;

import ak.k0;
import ak.v;
import android.os.Handler;
import android.os.Message;
import ci.i;
import ci.j;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.t;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ji.x;
import zj.f;

/* loaded from: classes3.dex */
public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final zj.b f13922a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13923b;

    /* renamed from: f  reason: collision with root package name */
    private jj.b f13927f;

    /* renamed from: g  reason: collision with root package name */
    private long f13928g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13929h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13930i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13931j;

    /* renamed from: e  reason: collision with root package name */
    private final TreeMap<Long, Long> f13926e = new TreeMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f13925d = k0.y(this);

    /* renamed from: c  reason: collision with root package name */
    private final yi.b f13924c = new yi.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f13932a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13933b;

        public a(long j11, long j12) {
            this.f13932a = j11;
            this.f13933b = j12;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(long j11);

        void b();
    }

    /* loaded from: classes3.dex */
    public final class c implements x {

        /* renamed from: a  reason: collision with root package name */
        private final t f13934a;

        /* renamed from: b  reason: collision with root package name */
        private final j f13935b = new j();

        /* renamed from: c  reason: collision with root package name */
        private final wi.d f13936c = new wi.d();

        /* renamed from: d  reason: collision with root package name */
        private long f13937d = -9223372036854775807L;

        c(zj.b bVar) {
            this.f13934a = t.k(bVar);
        }

        private wi.d g() {
            this.f13936c.f();
            if (this.f13934a.Q(this.f13935b, this.f13936c, false, false) == -4) {
                this.f13936c.s();
                return this.f13936c;
            }
            return null;
        }

        private void k(long j11, long j12) {
            e.this.f13925d.sendMessage(e.this.f13925d.obtainMessage(1, new a(j11, j12)));
        }

        private void l() {
            while (this.f13934a.J(false)) {
                wi.d g11 = g();
                if (g11 != null) {
                    long j11 = g11.f13266e;
                    wi.a a11 = e.this.f13924c.a(g11);
                    if (a11 != null) {
                        yi.a aVar = (yi.a) a11.c(0);
                        if (e.h(aVar.f59592a, aVar.f59593b)) {
                            m(j11, aVar);
                        }
                    }
                }
            }
            this.f13934a.r();
        }

        private void m(long j11, yi.a aVar) {
            long f11 = e.f(aVar);
            if (f11 == -9223372036854775807L) {
                return;
            }
            k(j11, f11);
        }

        @Override // ji.x
        public int b(f fVar, int i11, boolean z11, int i12) {
            return this.f13934a.a(fVar, i11, z11);
        }

        @Override // ji.x
        public void c(v vVar, int i11, int i12) {
            this.f13934a.e(vVar, i11);
        }

        @Override // ji.x
        public void d(i iVar) {
            this.f13934a.d(iVar);
        }

        @Override // ji.x
        public void f(long j11, int i11, int i12, int i13, x.a aVar) {
            this.f13934a.f(j11, i11, i12, i13, aVar);
            l();
        }

        public boolean h(long j11) {
            return e.this.j(j11);
        }

        public void i(hj.e eVar) {
            long j11 = this.f13937d;
            if (j11 == -9223372036854775807L || eVar.f29261h > j11) {
                this.f13937d = eVar.f29261h;
            }
            e.this.m(eVar);
        }

        public boolean j(hj.e eVar) {
            long j11 = this.f13937d;
            return e.this.n(j11 != -9223372036854775807L && j11 < eVar.f29260g);
        }

        public void n() {
            this.f13934a.R();
        }
    }

    public e(jj.b bVar, b bVar2, zj.b bVar3) {
        this.f13927f = bVar;
        this.f13923b = bVar2;
        this.f13922a = bVar3;
    }

    private Map.Entry<Long, Long> e(long j11) {
        return this.f13926e.ceilingEntry(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(yi.a aVar) {
        try {
            return k0.D0(k0.E(aVar.f59596e));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j11, long j12) {
        Long l11 = this.f13926e.get(Long.valueOf(j12));
        if (l11 == null) {
            this.f13926e.put(Long.valueOf(j12), Long.valueOf(j11));
        } else if (l11.longValue() > j11) {
            this.f13926e.put(Long.valueOf(j12), Long.valueOf(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f13929h) {
            this.f13930i = true;
            this.f13929h = false;
            this.f13923b.b();
        }
    }

    private void l() {
        this.f13923b.a(this.f13928g);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it2 = this.f13926e.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getKey().longValue() < this.f13927f.f33808h) {
                it2.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f13931j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f13932a, aVar.f13933b);
        return true;
    }

    boolean j(long j11) {
        jj.b bVar = this.f13927f;
        boolean z11 = false;
        if (bVar.f33804d) {
            if (this.f13930i) {
                return true;
            }
            Map.Entry<Long, Long> e11 = e(bVar.f33808h);
            if (e11 != null && e11.getValue().longValue() < j11) {
                this.f13928g = e11.getKey().longValue();
                l();
                z11 = true;
            }
            if (z11) {
                i();
            }
            return z11;
        }
        return false;
    }

    public c k() {
        return new c(this.f13922a);
    }

    void m(hj.e eVar) {
        this.f13929h = true;
    }

    boolean n(boolean z11) {
        if (this.f13927f.f33804d) {
            if (this.f13930i) {
                return true;
            }
            if (z11) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    public void o() {
        this.f13931j = true;
        this.f13925d.removeCallbacksAndMessages(null);
    }

    public void q(jj.b bVar) {
        this.f13930i = false;
        this.f13928g = -9223372036854775807L;
        this.f13927f = bVar;
        p();
    }
}