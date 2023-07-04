package com.google.android.exoplayer2.drm;

import ak.k0;
import ak.o;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.j;
import com.google.common.collect.r;
import com.google.common.collect.s0;
import com.google.common.collect.v;
import hi.n;
import hi.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public class DefaultDrmSessionManager implements g {

    /* renamed from: b */
    private final UUID f13301b;

    /* renamed from: c */
    private final j.d f13302c;

    /* renamed from: d */
    private final m f13303d;

    /* renamed from: e */
    private final HashMap<String, String> f13304e;

    /* renamed from: f */
    private final boolean f13305f;

    /* renamed from: g */
    private final int[] f13306g;

    /* renamed from: h */
    private final boolean f13307h;

    /* renamed from: i */
    private final e f13308i;

    /* renamed from: j */
    private final com.google.android.exoplayer2.upstream.g f13309j;

    /* renamed from: k */
    private final f f13310k;

    /* renamed from: l */
    private final long f13311l;

    /* renamed from: m */
    private final List<DefaultDrmSession> f13312m;

    /* renamed from: n */
    private final List<DefaultDrmSession> f13313n;

    /* renamed from: o */
    private final Set<DefaultDrmSession> f13314o;

    /* renamed from: p */
    private int f13315p;

    /* renamed from: q */
    private j f13316q;

    /* renamed from: r */
    private DefaultDrmSession f13317r;

    /* renamed from: s */
    private DefaultDrmSession f13318s;

    /* renamed from: t */
    private Looper f13319t;

    /* renamed from: u */
    private Handler f13320u;

    /* renamed from: v */
    private int f13321v;

    /* renamed from: w */
    private byte[] f13322w;

    /* renamed from: x */
    volatile d f13323x;

    /* loaded from: classes3.dex */
    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private MissingSchemeDataException(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: d */
        private boolean f13327d;

        /* renamed from: f */
        private boolean f13329f;

        /* renamed from: a */
        private final HashMap<String, String> f13324a = new HashMap<>();

        /* renamed from: b */
        private UUID f13325b = ci.b.f9156d;

        /* renamed from: c */
        private j.d f13326c = k.f13369d;

        /* renamed from: g */
        private com.google.android.exoplayer2.upstream.g f13330g = new com.google.android.exoplayer2.upstream.f();

        /* renamed from: e */
        private int[] f13328e = new int[0];

        /* renamed from: h */
        private long f13331h = 300000;

        public DefaultDrmSessionManager a(m mVar) {
            return new DefaultDrmSessionManager(this.f13325b, this.f13326c, mVar, this.f13324a, this.f13327d, this.f13328e, this.f13329f, this.f13330g, this.f13331h);
        }

        public b b(boolean z11) {
            this.f13327d = z11;
            return this;
        }

        public b c(boolean z11) {
            this.f13329f = z11;
            return this;
        }

        public b d(int... iArr) {
            for (int i11 : iArr) {
                boolean z11 = true;
                if (i11 != 2 && i11 != 1) {
                    z11 = false;
                }
                ak.a.a(z11);
            }
            this.f13328e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, j.d dVar) {
            this.f13325b = (UUID) ak.a.e(uuid);
            this.f13326c = (j.d) ak.a.e(dVar);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    private class c implements j.c {
        private c() {
            DefaultDrmSessionManager.this = r1;
        }

        @Override // com.google.android.exoplayer2.drm.j.c
        public void a(j jVar, byte[] bArr, int i11, int i12, byte[] bArr2) {
            ((d) ak.a.e(DefaultDrmSessionManager.this.f13323x)).obtainMessage(i11, bArr).sendToTarget();
        }
    }

    /* loaded from: classes3.dex */
    public class d extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Looper looper) {
            super(looper);
            DefaultDrmSessionManager.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f13312m) {
                if (defaultDrmSession.o(bArr)) {
                    defaultDrmSession.v(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements DefaultDrmSession.a {
        private e() {
            DefaultDrmSessionManager.this = r1;
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(DefaultDrmSession defaultDrmSession) {
            if (DefaultDrmSessionManager.this.f13313n.contains(defaultDrmSession)) {
                return;
            }
            DefaultDrmSessionManager.this.f13313n.add(defaultDrmSession);
            if (DefaultDrmSessionManager.this.f13313n.size() == 1) {
                defaultDrmSession.B();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b() {
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f13313n) {
                defaultDrmSession.w();
            }
            DefaultDrmSessionManager.this.f13313n.clear();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void c(Exception exc) {
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f13313n) {
                defaultDrmSession.x(exc);
            }
            DefaultDrmSessionManager.this.f13313n.clear();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements DefaultDrmSession.b {
        private f() {
            DefaultDrmSessionManager.this = r1;
        }

        public static /* synthetic */ void c(DefaultDrmSession defaultDrmSession) {
            defaultDrmSession.b(null);
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i11) {
            if (DefaultDrmSessionManager.this.f13311l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f13314o.remove(defaultDrmSession);
                ((Handler) ak.a.e(DefaultDrmSessionManager.this.f13320u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i11) {
            if (i11 == 1 && DefaultDrmSessionManager.this.f13311l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f13314o.add(defaultDrmSession);
                ((Handler) ak.a.e(DefaultDrmSessionManager.this.f13320u)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultDrmSessionManager.f.c(DefaultDrmSession.this);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f13311l);
            } else if (i11 == 0) {
                DefaultDrmSessionManager.this.f13312m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f13317r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f13317r = null;
                }
                if (DefaultDrmSessionManager.this.f13318s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f13318s = null;
                }
                if (DefaultDrmSessionManager.this.f13313n.size() > 1 && DefaultDrmSessionManager.this.f13313n.get(0) == defaultDrmSession) {
                    ((DefaultDrmSession) DefaultDrmSessionManager.this.f13313n.get(1)).B();
                }
                DefaultDrmSessionManager.this.f13313n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f13311l != -9223372036854775807L) {
                    ((Handler) ak.a.e(DefaultDrmSessionManager.this.f13320u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f13314o.remove(defaultDrmSession);
                }
            }
        }
    }

    private boolean m(com.google.android.exoplayer2.drm.e eVar) {
        if (this.f13322w != null) {
            return true;
        }
        if (p(eVar, this.f13301b, true).isEmpty()) {
            if (eVar.f13351d != 1 || !eVar.g(0).d(ci.b.f9154b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f13301b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(valueOf);
            o.h("DefaultDrmSessionMgr", sb2.toString());
        }
        String str = eVar.f13350c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? k0.f477a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession n(List<e.b> list, boolean z11, f.a aVar) {
        ak.a.e(this.f13316q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f13301b, this.f13316q, this.f13308i, this.f13310k, list, this.f13321v, this.f13307h | z11, z11, this.f13322w, this.f13304e, this.f13303d, (Looper) ak.a.e(this.f13319t), this.f13309j);
        defaultDrmSession.a(aVar);
        if (this.f13311l != -9223372036854775807L) {
            defaultDrmSession.a(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession o(List<e.b> list, boolean z11, f.a aVar) {
        DefaultDrmSession n11 = n(list, z11, aVar);
        if (n11.getState() == 1) {
            if ((k0.f477a < 19 || (((DrmSession.DrmSessionException) ak.a.e(n11.getError())).getCause() instanceof ResourceBusyException)) && !this.f13314o.isEmpty()) {
                Iterator it2 = v.m(this.f13314o).iterator();
                while (it2.hasNext()) {
                    ((DrmSession) it2.next()).b(null);
                }
                n11.b(aVar);
                if (this.f13311l != -9223372036854775807L) {
                    n11.b(null);
                }
                return n(list, z11, aVar);
            }
            return n11;
        }
        return n11;
    }

    private static List<e.b> p(com.google.android.exoplayer2.drm.e eVar, UUID uuid, boolean z11) {
        ArrayList arrayList = new ArrayList(eVar.f13351d);
        for (int i11 = 0; i11 < eVar.f13351d; i11++) {
            e.b g11 = eVar.g(i11);
            if ((g11.d(uuid) || (ci.b.f9155c.equals(uuid) && g11.d(ci.b.f9154b))) && (g11.f13356e != null || z11)) {
                arrayList.add(g11);
            }
        }
        return arrayList;
    }

    private void q(Looper looper) {
        Looper looper2 = this.f13319t;
        if (looper2 == null) {
            this.f13319t = looper;
            this.f13320u = new Handler(looper);
            return;
        }
        ak.a.f(looper2 == looper);
    }

    private DrmSession r(int i11) {
        j jVar = (j) ak.a.e(this.f13316q);
        if ((n.class.equals(jVar.a()) && n.f29223d) || k0.u0(this.f13306g, i11) == -1 || q.class.equals(jVar.a())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f13317r;
        if (defaultDrmSession == null) {
            DefaultDrmSession o11 = o(r.r(), true, null);
            this.f13312m.add(o11);
            this.f13317r = o11;
        } else {
            defaultDrmSession.a(null);
        }
        return this.f13317r;
    }

    private void s(Looper looper) {
        if (this.f13323x == null) {
            this.f13323x = new d(looper);
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void a() {
        int i11 = this.f13315p;
        this.f13315p = i11 + 1;
        if (i11 != 0) {
            return;
        }
        ak.a.f(this.f13316q == null);
        j a11 = this.f13302c.a(this.f13301b);
        this.f13316q = a11;
        a11.h(new c());
    }

    @Override // com.google.android.exoplayer2.drm.g
    public DrmSession b(Looper looper, f.a aVar, ci.i iVar) {
        List<e.b> list;
        q(looper);
        s(looper);
        com.google.android.exoplayer2.drm.e eVar = iVar.f9208o;
        if (eVar == null) {
            return r(ak.r.l(iVar.f9205l));
        }
        DefaultDrmSession defaultDrmSession = null;
        if (this.f13322w == null) {
            list = p((com.google.android.exoplayer2.drm.e) ak.a.e(eVar), this.f13301b, false);
            if (list.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f13301b);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new i(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            list = null;
        }
        if (!this.f13305f) {
            defaultDrmSession = this.f13318s;
        } else {
            Iterator<DefaultDrmSession> it2 = this.f13312m.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it2.next();
                if (k0.c(next.f13270a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = o(list, false, aVar);
            if (!this.f13305f) {
                this.f13318s = defaultDrmSession;
            }
            this.f13312m.add(defaultDrmSession);
        } else {
            defaultDrmSession.a(aVar);
        }
        return defaultDrmSession;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Class<? extends hi.m> c(ci.i iVar) {
        Class<? extends hi.m> a11 = ((j) ak.a.e(this.f13316q)).a();
        com.google.android.exoplayer2.drm.e eVar = iVar.f9208o;
        if (eVar != null) {
            return m(eVar) ? a11 : q.class;
        }
        if (k0.u0(this.f13306g, ak.r.l(iVar.f9205l)) != -1) {
            return a11;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void release() {
        int i11 = this.f13315p - 1;
        this.f13315p = i11;
        if (i11 != 0) {
            return;
        }
        if (this.f13311l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f13312m);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((DefaultDrmSession) arrayList.get(i12)).b(null);
            }
        }
        ((j) ak.a.e(this.f13316q)).release();
        this.f13316q = null;
    }

    public void t(int i11, byte[] bArr) {
        ak.a.f(this.f13312m.isEmpty());
        if (i11 == 1 || i11 == 3) {
            ak.a.e(bArr);
        }
        this.f13321v = i11;
        this.f13322w = bArr;
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, j jVar, m mVar, HashMap<String, String> hashMap, boolean z11, int i11) {
        this(uuid, new j.a(jVar), mVar, hashMap == null ? new HashMap<>() : hashMap, z11, new int[0], false, new com.google.android.exoplayer2.upstream.f(i11), 300000L);
    }

    private DefaultDrmSessionManager(UUID uuid, j.d dVar, m mVar, HashMap<String, String> hashMap, boolean z11, int[] iArr, boolean z12, com.google.android.exoplayer2.upstream.g gVar, long j11) {
        ak.a.e(uuid);
        ak.a.b(!ci.b.f9154b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13301b = uuid;
        this.f13302c = dVar;
        this.f13303d = mVar;
        this.f13304e = hashMap;
        this.f13305f = z11;
        this.f13306g = iArr;
        this.f13307h = z12;
        this.f13309j = gVar;
        this.f13308i = new e();
        this.f13310k = new f();
        this.f13321v = 0;
        this.f13312m = new ArrayList();
        this.f13313n = new ArrayList();
        this.f13314o = s0.e();
        this.f13311l = j11;
    }
}