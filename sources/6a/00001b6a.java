package com.google.android.exoplayer2.drm;

import ak.k0;
import ak.o;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.upstream.g;
import hi.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class DefaultDrmSession implements DrmSession {

    /* renamed from: a */
    public final List<e.b> f13270a;

    /* renamed from: b */
    private final j f13271b;

    /* renamed from: c */
    private final a f13272c;

    /* renamed from: d */
    private final b f13273d;

    /* renamed from: e */
    private final int f13274e;

    /* renamed from: f */
    private final boolean f13275f;

    /* renamed from: g */
    private final boolean f13276g;

    /* renamed from: h */
    private final HashMap<String, String> f13277h;

    /* renamed from: i */
    private final ak.g<f.a> f13278i;

    /* renamed from: j */
    private final com.google.android.exoplayer2.upstream.g f13279j;

    /* renamed from: k */
    final m f13280k;

    /* renamed from: l */
    final UUID f13281l;

    /* renamed from: m */
    final e f13282m;

    /* renamed from: n */
    private int f13283n;

    /* renamed from: o */
    private int f13284o;

    /* renamed from: p */
    private HandlerThread f13285p;

    /* renamed from: q */
    private c f13286q;

    /* renamed from: r */
    private hi.m f13287r;

    /* renamed from: s */
    private DrmSession.DrmSessionException f13288s;

    /* renamed from: t */
    private byte[] f13289t;

    /* renamed from: u */
    private byte[] f13290u;

    /* renamed from: v */
    private j.b f13291v;

    /* renamed from: w */
    private j.e f13292w;

    /* loaded from: classes3.dex */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(DefaultDrmSession defaultDrmSession);

        void b();

        void c(Exception exc);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i11);

        void b(DefaultDrmSession defaultDrmSession, int i11);
    }

    /* loaded from: classes3.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f13293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Looper looper) {
            super(looper);
            DefaultDrmSession.this = r1;
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException unexpectedDrmSessionException;
            d dVar = (d) message.obj;
            if (dVar.f13296b) {
                int i11 = dVar.f13299e + 1;
                dVar.f13299e = i11;
                if (i11 > DefaultDrmSession.this.f13279j.d(3)) {
                    return false;
                }
                fj.g gVar = new fj.g(dVar.f13295a, mediaDrmCallbackException.f13336a, mediaDrmCallbackException.f13337b, mediaDrmCallbackException.f13338c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f13297c, mediaDrmCallbackException.f13339d);
                fj.h hVar = new fj.h(3);
                if (mediaDrmCallbackException.getCause() instanceof IOException) {
                    unexpectedDrmSessionException = (IOException) mediaDrmCallbackException.getCause();
                } else {
                    unexpectedDrmSessionException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
                }
                long a11 = DefaultDrmSession.this.f13279j.a(new g.a(gVar, hVar, unexpectedDrmSessionException, dVar.f13299e));
                if (a11 == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    if (this.f13293a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a11);
                    return true;
                }
            }
            return false;
        }

        void b(int i11, Object obj, boolean z11) {
            obtainMessage(i11, new d(fj.g.a(), z11, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f13293a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i11 = message.what;
                if (i11 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    bArr = defaultDrmSession.f13280k.a(defaultDrmSession.f13281l, (j.e) dVar.f13298d);
                } else if (i11 == 1) {
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    bArr = defaultDrmSession2.f13280k.b(defaultDrmSession2.f13281l, (j.b) dVar.f13298d);
                } else {
                    throw new RuntimeException();
                }
            } catch (MediaDrmCallbackException e11) {
                boolean a11 = a(message, e11);
                bArr = e11;
                if (a11) {
                    return;
                }
            } catch (Exception e12) {
                o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e12);
                bArr = e12;
            }
            DefaultDrmSession.this.f13279j.f(dVar.f13295a);
            synchronized (this) {
                if (!this.f13293a) {
                    DefaultDrmSession.this.f13282m.obtainMessage(message.what, Pair.create(dVar.f13298d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public final long f13295a;

        /* renamed from: b */
        public final boolean f13296b;

        /* renamed from: c */
        public final long f13297c;

        /* renamed from: d */
        public final Object f13298d;

        /* renamed from: e */
        public int f13299e;

        public d(long j11, boolean z11, long j12, Object obj) {
            this.f13295a = j11;
            this.f13296b = z11;
            this.f13297c = j12;
            this.f13298d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Looper looper) {
            super(looper);
            DefaultDrmSession.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i11 = message.what;
            if (i11 == 0) {
                DefaultDrmSession.this.y(obj, obj2);
            } else if (i11 != 1) {
            } else {
                DefaultDrmSession.this.s(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, j jVar, a aVar, b bVar, List<e.b> list, int i11, boolean z11, boolean z12, byte[] bArr, HashMap<String, String> hashMap, m mVar, Looper looper, com.google.android.exoplayer2.upstream.g gVar) {
        if (i11 == 1 || i11 == 3) {
            ak.a.e(bArr);
        }
        this.f13281l = uuid;
        this.f13272c = aVar;
        this.f13273d = bVar;
        this.f13271b = jVar;
        this.f13274e = i11;
        this.f13275f = z11;
        this.f13276g = z12;
        if (bArr != null) {
            this.f13290u = bArr;
            this.f13270a = null;
        } else {
            this.f13270a = Collections.unmodifiableList((List) ak.a.e(list));
        }
        this.f13277h = hashMap;
        this.f13280k = mVar;
        this.f13278i = new ak.g<>();
        this.f13279j = gVar;
        this.f13283n = 2;
        this.f13282m = new e(looper);
    }

    private void A(byte[] bArr, int i11, boolean z11) {
        try {
            this.f13291v = this.f13271b.l(bArr, this.f13270a, i11, this.f13277h);
            ((c) k0.j(this.f13286q)).b(1, ak.a.e(this.f13291v), z11);
        } catch (Exception e11) {
            t(e11);
        }
    }

    private boolean C() {
        try {
            this.f13271b.g(this.f13289t, this.f13290u);
            return true;
        } catch (Exception e11) {
            o.d("DefaultDrmSession", "Error trying to restore keys.", e11);
            r(e11);
            return false;
        }
    }

    public static /* synthetic */ void h(Exception exc, f.a aVar) {
        aVar.l(exc);
    }

    private void l(ak.f<f.a> fVar) {
        for (f.a aVar : this.f13278i.D0()) {
            fVar.accept(aVar);
        }
    }

    private void m(boolean z11) {
        if (this.f13276g) {
            return;
        }
        byte[] bArr = (byte[]) k0.j(this.f13289t);
        int i11 = this.f13274e;
        if (i11 != 0 && i11 != 1) {
            if (i11 == 2) {
                if (this.f13290u == null || C()) {
                    A(bArr, 2, z11);
                }
            } else if (i11 != 3) {
            } else {
                ak.a.e(this.f13290u);
                ak.a.e(this.f13289t);
                if (C()) {
                    A(this.f13290u, 3, z11);
                }
            }
        } else if (this.f13290u == null) {
            A(bArr, 1, z11);
        } else if (this.f13283n == 4 || C()) {
            long n11 = n();
            if (this.f13274e != 0 || n11 > 60) {
                if (n11 <= 0) {
                    r(new KeysExpiredException());
                    return;
                }
                this.f13283n = 4;
                l(new ak.f() { // from class: hi.c
                    @Override // ak.f
                    public final void accept(Object obj) {
                        ((f.a) obj).j();
                    }
                });
                return;
            }
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb2.append(n11);
            o.b("DefaultDrmSession", sb2.toString());
            A(bArr, 2, z11);
        }
    }

    private long n() {
        if (ci.b.f9156d.equals(this.f13281l)) {
            Pair pair = (Pair) ak.a.e(r.b(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    private boolean p() {
        int i11 = this.f13283n;
        return i11 == 3 || i11 == 4;
    }

    private void r(final Exception exc) {
        this.f13288s = new DrmSession.DrmSessionException(exc);
        l(new ak.f() { // from class: com.google.android.exoplayer2.drm.b
            @Override // ak.f
            public final void accept(Object obj) {
                DefaultDrmSession.h(exc, (f.a) obj);
            }
        });
        if (this.f13283n != 4) {
            this.f13283n = 1;
        }
    }

    public void s(Object obj, Object obj2) {
        if (obj == this.f13291v && p()) {
            this.f13291v = null;
            if (obj2 instanceof Exception) {
                t((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f13274e == 3) {
                    this.f13271b.k((byte[]) k0.j(this.f13290u), bArr);
                    l(new ak.f() { // from class: hi.b
                        @Override // ak.f
                        public final void accept(Object obj3) {
                            ((f.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] k11 = this.f13271b.k(this.f13289t, bArr);
                int i11 = this.f13274e;
                if ((i11 == 2 || (i11 == 0 && this.f13290u != null)) && k11 != null && k11.length != 0) {
                    this.f13290u = k11;
                }
                this.f13283n = 4;
                l(new ak.f() { // from class: hi.a
                    @Override // ak.f
                    public final void accept(Object obj3) {
                        ((f.a) obj3).h();
                    }
                });
            } catch (Exception e11) {
                t(e11);
            }
        }
    }

    private void t(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f13272c.a(this);
        } else {
            r(exc);
        }
    }

    private void u() {
        if (this.f13274e == 0 && this.f13283n == 4) {
            k0.j(this.f13289t);
            m(false);
        }
    }

    public void y(Object obj, Object obj2) {
        if (obj == this.f13292w) {
            if (this.f13283n == 2 || p()) {
                this.f13292w = null;
                if (obj2 instanceof Exception) {
                    this.f13272c.c((Exception) obj2);
                    return;
                }
                try {
                    this.f13271b.i((byte[]) obj2);
                    this.f13272c.b();
                } catch (Exception e11) {
                    this.f13272c.c(e11);
                }
            }
        }
    }

    private boolean z(boolean z11) {
        if (p()) {
            return true;
        }
        try {
            byte[] f11 = this.f13271b.f();
            this.f13289t = f11;
            this.f13287r = this.f13271b.d(f11);
            l(new ak.f() { // from class: hi.d
                @Override // ak.f
                public final void accept(Object obj) {
                    ((f.a) obj).k();
                }
            });
            this.f13283n = 3;
            ak.a.e(this.f13289t);
            return true;
        } catch (NotProvisionedException e11) {
            if (z11) {
                this.f13272c.a(this);
                return false;
            }
            r(e11);
            return false;
        } catch (Exception e12) {
            r(e12);
            return false;
        }
    }

    public void B() {
        this.f13292w = this.f13271b.e();
        ((c) k0.j(this.f13286q)).b(0, ak.a.e(this.f13292w), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(f.a aVar) {
        ak.a.f(this.f13284o >= 0);
        if (aVar != null) {
            this.f13278i.b(aVar);
        }
        int i11 = this.f13284o + 1;
        this.f13284o = i11;
        if (i11 == 1) {
            ak.a.f(this.f13283n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13285p = handlerThread;
            handlerThread.start();
            this.f13286q = new c(this.f13285p.getLooper());
            if (z(true)) {
                m(true);
            }
        } else if (aVar != null && p()) {
            aVar.k();
        }
        this.f13273d.a(this, this.f13284o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void b(f.a aVar) {
        ak.a.f(this.f13284o > 0);
        int i11 = this.f13284o - 1;
        this.f13284o = i11;
        if (i11 == 0) {
            this.f13283n = 0;
            ((e) k0.j(this.f13282m)).removeCallbacksAndMessages(null);
            ((c) k0.j(this.f13286q)).c();
            this.f13286q = null;
            ((HandlerThread) k0.j(this.f13285p)).quit();
            this.f13285p = null;
            this.f13287r = null;
            this.f13288s = null;
            this.f13291v = null;
            this.f13292w = null;
            byte[] bArr = this.f13289t;
            if (bArr != null) {
                this.f13271b.j(bArr);
                this.f13289t = null;
            }
            l(new ak.f() { // from class: hi.e
                @Override // ak.f
                public final void accept(Object obj) {
                    ((f.a) obj).m();
                }
            });
        }
        if (aVar != null) {
            if (p()) {
                aVar.m();
            }
            this.f13278i.c(aVar);
        }
        this.f13273d.b(this, this.f13284o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return this.f13281l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        return this.f13275f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final hi.m e() {
        return this.f13287r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> g() {
        byte[] bArr = this.f13289t;
        if (bArr == null) {
            return null;
        }
        return this.f13271b.c(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.f13283n == 1) {
            return this.f13288s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f13283n;
    }

    public boolean o(byte[] bArr) {
        return Arrays.equals(this.f13289t, bArr);
    }

    public void v(int i11) {
        if (i11 != 2) {
            return;
        }
        u();
    }

    public void w() {
        if (z(false)) {
            m(true);
        }
    }

    public void x(Exception exc) {
        r(exc);
    }
}