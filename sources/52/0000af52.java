package qz;

import io.sentry.f3;
import io.sentry.g3;
import io.sentry.i2;
import io.sentry.z2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rz.h;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a */
    private final o f48852a;

    /* renamed from: b */
    private final g3 f48853b;

    /* renamed from: c */
    private final Map<io.sentry.f, Date> f48854c;

    public y(o oVar, g3 g3Var) {
        this.f48854c = new ConcurrentHashMap();
        this.f48852a = oVar;
        this.f48853b = g3Var;
    }

    public static /* synthetic */ void a(boolean z11, oz.f fVar) {
        fVar.c(z11);
    }

    public static /* synthetic */ void b(oz.k kVar) {
        kVar.b(false);
    }

    private void c(io.sentry.f fVar, Date date) {
        Date date2 = this.f48854c.get(fVar);
        if (date2 == null || date.after(date2)) {
            this.f48854c.put(fVar, date);
        }
    }

    private io.sentry.f e(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1963501277:
                if (str.equals("attachment")) {
                    c11 = 0;
                    break;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1984987798:
                if (str.equals("session")) {
                    c11 = 2;
                    break;
                }
                break;
            case 2141246174:
                if (str.equals("transaction")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return io.sentry.f.Attachment;
            case 1:
                return io.sentry.f.Error;
            case 2:
                return io.sentry.f.Session;
            case 3:
                return io.sentry.f.Transaction;
            default:
                return io.sentry.f.Unknown;
        }
    }

    private boolean f(String str) {
        Date date;
        io.sentry.f e11 = e(str);
        Date date2 = new Date(this.f48852a.a());
        Date date3 = this.f48854c.get(io.sentry.f.All);
        if (date3 == null || date2.after(date3)) {
            if (io.sentry.f.Unknown.equals(e11) || (date = this.f48854c.get(e11)) == null) {
                return false;
            }
            return !date2.after(date);
        }
        return true;
    }

    private static void i(io.sentry.t tVar, final boolean z11) {
        rz.h.m(tVar, oz.k.class, new h.a() { // from class: qz.x
            @Override // rz.h.a
            public final void accept(Object obj) {
                y.b((oz.k) obj);
            }
        });
        rz.h.m(tVar, oz.f.class, new h.a() { // from class: qz.w
            @Override // rz.h.a
            public final void accept(Object obj) {
                y.a(z11, (oz.f) obj);
            }
        });
    }

    private long j(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    public i2 d(i2 i2Var, io.sentry.t tVar) {
        ArrayList arrayList = null;
        for (z2 z2Var : i2Var.c()) {
            if (f(z2Var.w().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z2Var);
                this.f48853b.getClientReportRecorder().a(mz.e.RATELIMIT_BACKOFF, z2Var);
            }
        }
        if (arrayList != null) {
            this.f48853b.getLogger().c(f3.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (z2 z2Var2 : i2Var.c()) {
                if (!arrayList.contains(z2Var2)) {
                    arrayList2.add(z2Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                this.f48853b.getLogger().c(f3.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                i(tVar, false);
                return null;
            }
            return new i2(i2Var.b(), arrayList2);
        }
        return i2Var;
    }

    public void k(String str, String str2, int i11) {
        String[] split;
        if (str == null) {
            if (i11 == 429) {
                c(io.sentry.f.All, new Date(this.f48852a.a() + j(str2)));
                return;
            }
            return;
        }
        int i12 = -1;
        String[] split2 = str.split(",", -1);
        int length = split2.length;
        int i13 = 0;
        while (i13 < length) {
            String[] split3 = split2[i13].replace(" ", "").split(":", i12);
            if (split3.length > 0) {
                long j11 = j(split3[0]);
                if (split3.length > 1) {
                    String str3 = split3[1];
                    Date date = new Date(this.f48852a.a() + j11);
                    if (str3 != null && !str3.isEmpty()) {
                        for (String str4 : str3.split(";", i12)) {
                            io.sentry.f fVar = io.sentry.f.Unknown;
                            try {
                                String b11 = rz.m.b(str4);
                                if (b11 != null) {
                                    fVar = io.sentry.f.valueOf(b11);
                                } else {
                                    this.f48853b.getLogger().c(f3.ERROR, "Couldn't capitalize: %s", str4);
                                }
                            } catch (IllegalArgumentException e11) {
                                this.f48853b.getLogger().a(f3.INFO, e11, "Unknown category: %s", str4);
                            }
                            if (!io.sentry.f.Unknown.equals(fVar)) {
                                c(fVar, date);
                            }
                        }
                    } else {
                        c(io.sentry.f.All, date);
                    }
                }
            }
            i13++;
            i12 = -1;
        }
    }

    public y(g3 g3Var) {
        this(m.b(), g3Var);
    }
}