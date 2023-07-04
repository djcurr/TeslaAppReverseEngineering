package zj;

import ak.a0;
import ak.k0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.common.collect.r;
import com.google.common.collect.s;
import com.google.common.collect.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import zj.d;
import zj.j;

/* loaded from: classes3.dex */
public final class j implements d, n {

    /* renamed from: p */
    public static final s<String, Integer> f60454p = j();

    /* renamed from: q */
    public static final r<Long> f60455q = r.u(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* renamed from: r */
    public static final r<Long> f60456r = r.u(218000L, 159000L, 145000L, 130000L, 112000L);

    /* renamed from: s */
    public static final r<Long> f60457s = r.u(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* renamed from: t */
    public static final r<Long> f60458t;

    /* renamed from: u */
    public static final r<Long> f60459u;

    /* renamed from: v */
    private static j f60460v;

    /* renamed from: a */
    private final Context f60461a;

    /* renamed from: b */
    private final t<Integer, Long> f60462b;

    /* renamed from: c */
    private final d.a.C1384a f60463c;

    /* renamed from: d */
    private final a0 f60464d;

    /* renamed from: e */
    private final ak.b f60465e;

    /* renamed from: f */
    private int f60466f;

    /* renamed from: g */
    private long f60467g;

    /* renamed from: h */
    private long f60468h;

    /* renamed from: i */
    private int f60469i;

    /* renamed from: j */
    private long f60470j;

    /* renamed from: k */
    private long f60471k;

    /* renamed from: l */
    private long f60472l;

    /* renamed from: m */
    private long f60473m;

    /* renamed from: n */
    private boolean f60474n;

    /* renamed from: o */
    private int f60475o;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final Context f60476a;

        /* renamed from: b */
        private Map<Integer, Long> f60477b;

        /* renamed from: c */
        private int f60478c;

        /* renamed from: d */
        private ak.b f60479d;

        /* renamed from: e */
        private boolean f60480e;

        public b(Context context) {
            this.f60476a = context == null ? null : context.getApplicationContext();
            this.f60477b = c(k0.M(context));
            this.f60478c = 2000;
            this.f60479d = ak.b.f439a;
            this.f60480e = true;
        }

        private static r<Integer> b(String str) {
            r<Integer> rVar = j.f60454p.get(str);
            return rVar.isEmpty() ? r.u(2, 2, 2, 2, 2) : rVar;
        }

        private static Map<Integer, Long> c(String str) {
            r<Integer> b11 = b(str);
            HashMap hashMap = new HashMap(6);
            hashMap.put(0, 1000000L);
            r<Long> rVar = j.f60455q;
            hashMap.put(2, rVar.get(b11.get(0).intValue()));
            hashMap.put(3, j.f60456r.get(b11.get(1).intValue()));
            hashMap.put(4, j.f60457s.get(b11.get(2).intValue()));
            hashMap.put(5, j.f60458t.get(b11.get(3).intValue()));
            hashMap.put(9, j.f60459u.get(b11.get(4).intValue()));
            hashMap.put(7, rVar.get(b11.get(0).intValue()));
            return hashMap;
        }

        public j a() {
            return new j(this.f60476a, this.f60477b, this.f60478c, this.f60479d, this.f60480e);
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: c */
        private static c f60481c;

        /* renamed from: a */
        private final Handler f60482a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final ArrayList<WeakReference<j>> f60483b = new ArrayList<>();

        private c() {
        }

        public static /* synthetic */ void a(c cVar, j jVar) {
            cVar.c(jVar);
        }

        public static synchronized c b(Context context) {
            c cVar;
            synchronized (c.class) {
                if (f60481c == null) {
                    f60481c = new c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f60481c, intentFilter);
                }
                cVar = f60481c;
            }
            return cVar;
        }

        private void e() {
            for (int size = this.f60483b.size() - 1; size >= 0; size--) {
                if (this.f60483b.get(size).get() == null) {
                    this.f60483b.remove(size);
                }
            }
        }

        /* renamed from: f */
        public void c(j jVar) {
            jVar.o();
        }

        public synchronized void d(final j jVar) {
            e();
            this.f60483b.add(new WeakReference<>(jVar));
            this.f60482a.post(new Runnable() { // from class: zj.k
                {
                    j.c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    j.c.a(j.c.this, jVar);
                }
            });
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            e();
            for (int i11 = 0; i11 < this.f60483b.size(); i11++) {
                j jVar = this.f60483b.get(i11).get();
                if (jVar != null) {
                    c(jVar);
                }
            }
        }
    }

    static {
        Long valueOf = Long.valueOf((long) ComponentTracker.DEFAULT_TIMEOUT);
        f60458t = r.u(4800000L, 2700000L, valueOf, 1200000L, 630000L);
        f60459u = r.u(12000000L, 8800000L, 5900000L, 3500000L, valueOf);
    }

    private static s<String, Integer> j() {
        s.a r11 = s.r();
        r11.g("AD", 1, 2, 0, 0, 2);
        r11.g("AE", 1, 4, 4, 4, 1);
        r11.g("AF", 4, 4, 3, 4, 2);
        r11.g("AG", 2, 2, 1, 1, 2);
        r11.g("AI", 1, 2, 2, 2, 2);
        r11.g("AL", 1, 1, 0, 1, 2);
        r11.g("AM", 2, 2, 1, 2, 2);
        r11.g("AO", 3, 4, 4, 2, 2);
        r11.g("AR", 2, 4, 2, 2, 2);
        r11.g("AS", 2, 2, 4, 3, 2);
        r11.g("AT", 0, 3, 0, 0, 2);
        r11.g("AU", 0, 2, 0, 1, 1);
        r11.g("AW", 1, 2, 0, 4, 2);
        r11.g("AX", 0, 2, 2, 2, 2);
        r11.g("AZ", 3, 3, 3, 4, 2);
        r11.g("BA", 1, 1, 0, 1, 2);
        r11.g("BB", 0, 2, 0, 0, 2);
        r11.g("BD", 2, 0, 3, 3, 2);
        r11.g("BE", 0, 1, 2, 3, 2);
        r11.g("BF", 4, 4, 4, 2, 2);
        r11.g("BG", 0, 1, 0, 0, 2);
        r11.g("BH", 1, 0, 2, 4, 2);
        r11.g("BI", 4, 4, 4, 4, 2);
        r11.g("BJ", 4, 4, 3, 4, 2);
        r11.g("BL", 1, 2, 2, 2, 2);
        r11.g("BM", 1, 2, 0, 0, 2);
        r11.g("BN", 4, 0, 1, 1, 2);
        r11.g("BO", 2, 3, 3, 2, 2);
        r11.g("BQ", 1, 2, 1, 2, 2);
        r11.g("BR", 2, 4, 2, 1, 2);
        r11.g("BS", 3, 2, 2, 3, 2);
        r11.g("BT", 3, 0, 3, 2, 2);
        r11.g("BW", 3, 4, 2, 2, 2);
        r11.g("BY", 1, 0, 2, 1, 2);
        r11.g("BZ", 2, 2, 2, 1, 2);
        r11.g("CA", 0, 3, 1, 2, 3);
        r11.g("CD", 4, 3, 2, 2, 2);
        r11.g("CF", 4, 2, 2, 2, 2);
        r11.g("CG", 3, 4, 1, 1, 2);
        r11.g("CH", 0, 1, 0, 0, 0);
        r11.g("CI", 3, 3, 3, 3, 2);
        r11.g("CK", 3, 2, 1, 0, 2);
        r11.g("CL", 1, 1, 2, 3, 2);
        r11.g("CM", 3, 4, 3, 2, 2);
        r11.g("CN", 2, 2, 2, 1, 3);
        r11.g("CO", 2, 4, 3, 2, 2);
        r11.g("CR", 2, 3, 4, 4, 2);
        r11.g("CU", 4, 4, 2, 1, 2);
        r11.g("CV", 2, 3, 3, 3, 2);
        r11.g("CW", 1, 2, 0, 0, 2);
        r11.g("CY", 1, 2, 0, 0, 2);
        r11.g("CZ", 0, 1, 0, 0, 2);
        r11.g("DE", 0, 1, 1, 2, 0);
        r11.g("DJ", 4, 1, 4, 4, 2);
        r11.g("DK", 0, 0, 1, 0, 2);
        r11.g("DM", 1, 2, 2, 2, 2);
        r11.g("DO", 3, 4, 4, 4, 2);
        r11.g("DZ", 3, 2, 4, 4, 2);
        r11.g("EC", 2, 4, 3, 2, 2);
        r11.g("EE", 0, 0, 0, 0, 2);
        r11.g("EG", 3, 4, 2, 1, 2);
        r11.g("EH", 2, 2, 2, 2, 2);
        r11.g("ER", 4, 2, 2, 2, 2);
        r11.g("ES", 0, 1, 2, 1, 2);
        r11.g("ET", 4, 4, 4, 1, 2);
        r11.g("FI", 0, 0, 1, 0, 0);
        r11.g("FJ", 3, 0, 3, 3, 2);
        r11.g("FK", 2, 2, 2, 2, 2);
        r11.g("FM", 4, 2, 4, 3, 2);
        r11.g("FO", 0, 2, 0, 0, 2);
        r11.g("FR", 1, 0, 2, 1, 2);
        r11.g("GA", 3, 3, 1, 0, 2);
        r11.g("GB", 0, 0, 1, 2, 2);
        r11.g("GD", 1, 2, 2, 2, 2);
        r11.g("GE", 1, 0, 1, 3, 2);
        r11.g("GF", 2, 2, 2, 4, 2);
        r11.g("GG", 0, 2, 0, 0, 2);
        r11.g("GH", 3, 2, 3, 2, 2);
        r11.g("GI", 0, 2, 0, 0, 2);
        r11.g("GL", 1, 2, 2, 1, 2);
        r11.g("GM", 4, 3, 2, 4, 2);
        r11.g("GN", 4, 3, 4, 2, 2);
        r11.g("GP", 2, 2, 3, 4, 2);
        r11.g("GQ", 4, 2, 3, 4, 2);
        r11.g("GR", 1, 1, 0, 1, 2);
        r11.g("GT", 3, 2, 3, 2, 2);
        r11.g("GU", 1, 2, 4, 4, 2);
        r11.g("GW", 3, 4, 4, 3, 2);
        r11.g("GY", 3, 3, 1, 0, 2);
        r11.g("HK", 0, 2, 3, 4, 2);
        r11.g("HN", 3, 0, 3, 3, 2);
        r11.g("HR", 1, 1, 0, 1, 2);
        r11.g("HT", 4, 3, 4, 4, 2);
        r11.g("HU", 0, 1, 0, 0, 2);
        r11.g("ID", 3, 2, 2, 3, 2);
        r11.g("IE", 0, 0, 1, 1, 2);
        r11.g("IL", 1, 0, 2, 3, 2);
        r11.g("IM", 0, 2, 0, 1, 2);
        r11.g("IN", 2, 1, 3, 3, 2);
        r11.g("IO", 4, 2, 2, 4, 2);
        r11.g("IQ", 3, 2, 4, 3, 2);
        r11.g("IR", 4, 2, 3, 4, 2);
        r11.g("IS", 0, 2, 0, 0, 2);
        r11.g("IT", 0, 0, 1, 1, 2);
        r11.g("JE", 2, 2, 0, 2, 2);
        r11.g("JM", 3, 3, 4, 4, 2);
        r11.g("JO", 1, 2, 1, 1, 2);
        r11.g("JP", 0, 2, 0, 1, 3);
        r11.g("KE", 3, 4, 2, 2, 2);
        r11.g("KG", 1, 0, 2, 2, 2);
        r11.g("KH", 2, 0, 4, 3, 2);
        r11.g("KI", 4, 2, 3, 1, 2);
        r11.g("KM", 4, 2, 2, 3, 2);
        r11.g("KN", 1, 2, 2, 2, 2);
        r11.g("KP", 4, 2, 2, 2, 2);
        r11.g("KR", 0, 2, 1, 1, 1);
        r11.g("KW", 2, 3, 1, 1, 1);
        r11.g("KY", 1, 2, 0, 0, 2);
        r11.g("KZ", 1, 2, 2, 3, 2);
        r11.g("LA", 2, 2, 1, 1, 2);
        r11.g("LB", 3, 2, 0, 0, 2);
        r11.g("LC", 1, 1, 0, 0, 2);
        r11.g("LI", 0, 2, 2, 2, 2);
        r11.g("LK", 2, 0, 2, 3, 2);
        r11.g("LR", 3, 4, 3, 2, 2);
        r11.g("LS", 3, 3, 2, 3, 2);
        r11.g("LT", 0, 0, 0, 0, 2);
        r11.g("LU", 0, 0, 0, 0, 2);
        r11.g("LV", 0, 0, 0, 0, 2);
        r11.g("LY", 4, 2, 4, 3, 2);
        r11.g("MA", 2, 1, 2, 1, 2);
        r11.g("MC", 0, 2, 2, 2, 2);
        r11.g("MD", 1, 2, 0, 0, 2);
        r11.g("ME", 1, 2, 1, 2, 2);
        r11.g("MF", 1, 2, 1, 0, 2);
        r11.g("MG", 3, 4, 3, 3, 2);
        r11.g("MH", 4, 2, 2, 4, 2);
        r11.g("MK", 1, 0, 0, 0, 2);
        r11.g("ML", 4, 4, 1, 1, 2);
        r11.g("MM", 2, 3, 2, 2, 2);
        r11.g("MN", 2, 4, 1, 1, 2);
        r11.g("MO", 0, 2, 4, 4, 2);
        r11.g("MP", 0, 2, 2, 2, 2);
        r11.g("MQ", 2, 2, 2, 3, 2);
        r11.g("MR", 3, 0, 4, 2, 2);
        r11.g("MS", 1, 2, 2, 2, 2);
        r11.g("MT", 0, 2, 0, 1, 2);
        r11.g("MU", 3, 1, 2, 3, 2);
        r11.g("MV", 4, 3, 1, 4, 2);
        r11.g("MW", 4, 1, 1, 0, 2);
        r11.g("MX", 2, 4, 3, 3, 2);
        r11.g("MY", 2, 0, 3, 3, 2);
        r11.g("MZ", 3, 3, 2, 3, 2);
        r11.g("NA", 4, 3, 2, 2, 2);
        r11.g("NC", 2, 0, 4, 4, 2);
        r11.g("NE", 4, 4, 4, 4, 2);
        r11.g("NF", 2, 2, 2, 2, 2);
        r11.g("NG", 3, 3, 2, 2, 2);
        r11.g("NI", 3, 1, 4, 4, 2);
        r11.g("NL", 0, 2, 4, 2, 0);
        r11.g("NO", 0, 1, 1, 0, 2);
        r11.g("NP", 2, 0, 4, 3, 2);
        r11.g("NR", 4, 2, 3, 1, 2);
        r11.g("NU", 4, 2, 2, 2, 2);
        r11.g("NZ", 0, 2, 1, 2, 4);
        r11.g("OM", 2, 2, 0, 2, 2);
        r11.g("PA", 1, 3, 3, 4, 2);
        r11.g("PE", 2, 4, 4, 4, 2);
        r11.g("PF", 2, 2, 1, 1, 2);
        r11.g("PG", 4, 3, 3, 2, 2);
        r11.g("PH", 3, 0, 3, 4, 4);
        r11.g("PK", 3, 2, 3, 3, 2);
        r11.g("PL", 1, 0, 2, 2, 2);
        r11.g("PM", 0, 2, 2, 2, 2);
        r11.g("PR", 1, 2, 2, 3, 4);
        r11.g("PS", 3, 3, 2, 2, 2);
        r11.g("PT", 1, 1, 0, 0, 2);
        r11.g("PW", 1, 2, 3, 0, 2);
        r11.g("PY", 2, 0, 3, 3, 2);
        r11.g("QA", 2, 3, 1, 2, 2);
        r11.g("RE", 1, 0, 2, 1, 2);
        r11.g("RO", 1, 1, 1, 2, 2);
        r11.g("RS", 1, 2, 0, 0, 2);
        r11.g("RU", 0, 1, 0, 1, 2);
        r11.g("RW", 4, 3, 3, 4, 2);
        r11.g("SA", 2, 2, 2, 1, 2);
        r11.g("SB", 4, 2, 4, 2, 2);
        r11.g(BouncyCastleProvider.PROVIDER_NAME, 4, 2, 0, 1, 2);
        r11.g("SD", 4, 4, 4, 3, 2);
        r11.g("SE", 0, 0, 0, 0, 2);
        r11.g("SG", 0, 0, 3, 3, 4);
        r11.g("SH", 4, 2, 2, 2, 2);
        r11.g("SI", 0, 1, 0, 0, 2);
        r11.g("SJ", 2, 2, 2, 2, 2);
        r11.g("SK", 0, 1, 0, 0, 2);
        r11.g("SL", 4, 3, 3, 1, 2);
        r11.g("SM", 0, 2, 2, 2, 2);
        r11.g("SN", 4, 4, 4, 3, 2);
        r11.g("SO", 3, 4, 4, 4, 2);
        r11.g("SR", 3, 2, 3, 1, 2);
        r11.g("SS", 4, 1, 4, 2, 2);
        r11.g("ST", 2, 2, 1, 2, 2);
        r11.g("SV", 2, 1, 4, 4, 2);
        r11.g("SX", 2, 2, 1, 0, 2);
        r11.g("SY", 4, 3, 2, 2, 2);
        r11.g("SZ", 3, 4, 3, 4, 2);
        r11.g("TC", 1, 2, 1, 0, 2);
        r11.g("TD", 4, 4, 4, 4, 2);
        r11.g("TG", 3, 2, 1, 0, 2);
        r11.g("TH", 1, 3, 4, 3, 0);
        r11.g("TJ", 4, 4, 4, 4, 2);
        r11.g("TL", 4, 1, 4, 4, 2);
        r11.g("TM", 4, 2, 1, 2, 2);
        r11.g("TN", 2, 1, 1, 1, 2);
        r11.g("TO", 3, 3, 4, 2, 2);
        r11.g("TR", 1, 2, 1, 1, 2);
        r11.g("TT", 1, 3, 1, 3, 2);
        r11.g("TV", 3, 2, 2, 4, 2);
        r11.g("TW", 0, 0, 0, 0, 1);
        r11.g("TZ", 3, 3, 3, 2, 2);
        r11.g("UA", 0, 3, 0, 0, 2);
        r11.g("UG", 3, 2, 2, 3, 2);
        r11.g("US", 0, 1, 3, 3, 3);
        r11.g("UY", 2, 1, 1, 1, 2);
        r11.g("UZ", 2, 0, 3, 2, 2);
        r11.g("VC", 2, 2, 2, 2, 2);
        r11.g("VE", 4, 4, 4, 4, 2);
        r11.g("VG", 2, 2, 1, 2, 2);
        r11.g("VI", 1, 2, 2, 4, 2);
        r11.g("VN", 0, 1, 4, 4, 2);
        r11.g("VU", 4, 1, 3, 1, 2);
        r11.g("WS", 3, 1, 4, 2, 2);
        r11.g("XK", 1, 1, 1, 0, 2);
        r11.g("YE", 4, 4, 4, 4, 2);
        r11.g("YT", 3, 2, 1, 3, 2);
        r11.g("ZA", 2, 3, 2, 2, 2);
        r11.g("ZM", 3, 2, 2, 3, 2);
        r11.g("ZW", 3, 3, 3, 3, 2);
        return r11.e();
    }

    private long k(int i11) {
        Long l11 = this.f60462b.get(Integer.valueOf(i11));
        if (l11 == null) {
            l11 = this.f60462b.get(0);
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    public static synchronized j l(Context context) {
        j jVar;
        synchronized (j.class) {
            if (f60460v == null) {
                f60460v = new b(context).a();
            }
            jVar = f60460v;
        }
        return jVar;
    }

    private static boolean m(com.google.android.exoplayer2.upstream.b bVar, boolean z11) {
        return z11 && !bVar.d(8);
    }

    private void n(int i11, long j11, long j12) {
        if (i11 == 0 && j11 == 0 && j12 == this.f60473m) {
            return;
        }
        this.f60473m = j12;
        this.f60463c.c(i11, j11, j12);
    }

    public synchronized void o() {
        int Y;
        if (this.f60474n) {
            Y = this.f60475o;
        } else {
            Context context = this.f60461a;
            Y = context == null ? 0 : k0.Y(context);
        }
        if (this.f60469i == Y) {
            return;
        }
        this.f60469i = Y;
        if (Y != 1 && Y != 0 && Y != 8) {
            this.f60472l = k(Y);
            long elapsedRealtime = this.f60465e.elapsedRealtime();
            n(this.f60466f > 0 ? (int) (elapsedRealtime - this.f60467g) : 0, this.f60468h, this.f60472l);
            this.f60467g = elapsedRealtime;
            this.f60468h = 0L;
            this.f60471k = 0L;
            this.f60470j = 0L;
            this.f60464d.i();
        }
    }

    @Override // zj.d
    public void a(d.a aVar) {
        this.f60463c.e(aVar);
    }

    @Override // zj.n
    public synchronized void b(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z11) {
        if (m(bVar, z11)) {
            ak.a.f(this.f60466f > 0);
            long elapsedRealtime = this.f60465e.elapsedRealtime();
            int i11 = (int) (elapsedRealtime - this.f60467g);
            this.f60470j += i11;
            long j11 = this.f60471k;
            long j12 = this.f60468h;
            this.f60471k = j11 + j12;
            if (i11 > 0) {
                this.f60464d.c((int) Math.sqrt(j12), (((float) j12) * 8000.0f) / i11);
                if (this.f60470j >= 2000 || this.f60471k >= 524288) {
                    this.f60472l = this.f60464d.f(0.5f);
                }
                n(i11, this.f60468h, this.f60472l);
                this.f60467g = elapsedRealtime;
                this.f60468h = 0L;
            }
            this.f60466f--;
        }
    }

    @Override // zj.d
    public void c(Handler handler, d.a aVar) {
        ak.a.e(handler);
        ak.a.e(aVar);
        this.f60463c.b(handler, aVar);
    }

    @Override // zj.d
    public n d() {
        return this;
    }

    @Override // zj.d
    public synchronized long e() {
        return this.f60472l;
    }

    @Override // zj.n
    public synchronized void f(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z11, int i11) {
        if (m(bVar, z11)) {
            this.f60468h += i11;
        }
    }

    @Override // zj.n
    public synchronized void g(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z11) {
        if (m(bVar, z11)) {
            if (this.f60466f == 0) {
                this.f60467g = this.f60465e.elapsedRealtime();
            }
            this.f60466f++;
        }
    }

    @Override // zj.n
    public void h(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z11) {
    }

    @Deprecated
    public j() {
        this(null, t.l(), 2000, ak.b.f439a, false);
    }

    private j(Context context, Map<Integer, Long> map, int i11, ak.b bVar, boolean z11) {
        this.f60461a = context == null ? null : context.getApplicationContext();
        this.f60462b = t.c(map);
        this.f60463c = new d.a.C1384a();
        this.f60464d = new a0(i11);
        this.f60465e = bVar;
        int Y = context == null ? 0 : k0.Y(context);
        this.f60469i = Y;
        this.f60472l = k(Y);
        if (context == null || !z11) {
            return;
        }
        c.b(context).d(this);
    }
}