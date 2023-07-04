package bl;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.classic.spi.CallerData;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes3.dex */
public class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private long f7838a;

    /* renamed from: b  reason: collision with root package name */
    private long f7839b;

    /* renamed from: c  reason: collision with root package name */
    private long f7840c;

    /* renamed from: d  reason: collision with root package name */
    private long f7841d;

    /* renamed from: f  reason: collision with root package name */
    private int f7843f;

    /* renamed from: g  reason: collision with root package name */
    private j f7844g;

    /* renamed from: e  reason: collision with root package name */
    private long f7842e = 0;

    /* renamed from: h  reason: collision with root package name */
    private Vector<String> f7845h = new Vector<>();

    /* renamed from: i  reason: collision with root package name */
    private Vector<String> f7846i = new Vector<>();

    /* renamed from: j  reason: collision with root package name */
    private Vector<Long> f7847j = new Vector<>();

    public b(Context context, h hVar) {
        j jVar = new j(context.getSharedPreferences("com.google.android.vending.licensing.APKExpansionPolicy", 0), hVar);
        this.f7844g = jVar;
        this.f7843f = Integer.parseInt(jVar.b("lastResponse", Integer.toString(291)));
        this.f7838a = Long.parseLong(this.f7844g.b("validityTimestamp", "0"));
        this.f7839b = Long.parseLong(this.f7844g.b("retryUntil", "0"));
        this.f7840c = Long.parseLong(this.f7844g.b("maxRetries", "0"));
        this.f7841d = Long.parseLong(this.f7844g.b("retryCount", "0"));
        this.f7844g.b("licensingUrl", null);
    }

    private Map<String, String> c(k kVar) {
        HashMap hashMap = new HashMap();
        if (kVar == null) {
            return hashMap;
        }
        try {
            cl.b.a(new URI(CallerData.NA + kVar.f7881g), hashMap);
        } catch (URISyntaxException unused) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    private void l(int i11) {
        this.f7842e = System.currentTimeMillis();
        this.f7843f = i11;
        this.f7844g.c("lastResponse", Integer.toString(i11));
    }

    private void m(String str) {
        this.f7844g.c("licensingUrl", str);
    }

    private void n(String str) {
        Long l11;
        try {
            l11 = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
            l11 = 0L;
            str = "0";
        }
        this.f7840c = l11.longValue();
        this.f7844g.c("maxRetries", str);
    }

    private void o(long j11) {
        this.f7841d = j11;
        this.f7844g.c("retryCount", Long.toString(j11));
    }

    private void p(String str) {
        Long l11;
        try {
            l11 = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
            l11 = 0L;
            str = "0";
        }
        this.f7839b = l11.longValue();
        this.f7844g.c("retryUntil", str);
    }

    private void q(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            valueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(valueOf.longValue());
        }
        this.f7838a = valueOf.longValue();
        this.f7844g.c("validityTimestamp", str);
    }

    @Override // bl.i
    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = this.f7843f;
        if (i11 == 256) {
            if (currentTimeMillis <= this.f7838a) {
                return true;
            }
        } else if (i11 == 291 && currentTimeMillis < this.f7842e + 60000) {
            return currentTimeMillis <= this.f7839b || this.f7841d <= this.f7840c;
        }
        return false;
    }

    @Override // bl.i
    public void b(int i11, k kVar) {
        if (i11 != 291) {
            o(0L);
        } else {
            o(this.f7841d + 1);
        }
        Map<String, String> c11 = c(kVar);
        if (i11 == 256) {
            this.f7843f = i11;
            m(null);
            q(Long.toString(System.currentTimeMillis() + 60000));
            for (String str : c11.keySet()) {
                if (str.equals("VT")) {
                    q(c11.get(str));
                } else if (str.equals("GT")) {
                    p(c11.get(str));
                } else if (str.equals("GR")) {
                    n(c11.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    k(Integer.parseInt(str.substring(8)) - 1, c11.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    i(Integer.parseInt(str.substring(9)) - 1, c11.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    j(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(c11.get(str)));
                }
            }
        } else if (i11 == 561) {
            q("0");
            p("0");
            n("0");
            m(c11.get("LU"));
        }
        l(i11);
        this.f7844g.a();
    }

    public String d(int i11) {
        if (i11 < this.f7846i.size()) {
            return this.f7846i.elementAt(i11);
        }
        return null;
    }

    public long e(int i11) {
        if (i11 < this.f7847j.size()) {
            return this.f7847j.elementAt(i11).longValue();
        }
        return -1L;
    }

    public String f(int i11) {
        if (i11 < this.f7845h.size()) {
            return this.f7845h.elementAt(i11);
        }
        return null;
    }

    public int g() {
        return this.f7845h.size();
    }

    public void h() {
        this.f7844g.c("lastResponse", Integer.toString(291));
        p("0");
        n("0");
        o(Long.parseLong("0"));
        q("0");
        this.f7844g.a();
    }

    public void i(int i11, String str) {
        if (i11 >= this.f7846i.size()) {
            this.f7846i.setSize(i11 + 1);
        }
        this.f7846i.set(i11, str);
    }

    public void j(int i11, long j11) {
        if (i11 >= this.f7847j.size()) {
            this.f7847j.setSize(i11 + 1);
        }
        this.f7847j.set(i11, Long.valueOf(j11));
    }

    public void k(int i11, String str) {
        if (i11 >= this.f7845h.size()) {
            this.f7845h.setSize(i11 + 1);
        }
        this.f7845h.set(i11, str);
    }
}