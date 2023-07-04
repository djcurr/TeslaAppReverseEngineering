package mz;

import com.stripe.android.networking.FraudDetectionData;
import io.sentry.d0;
import io.sentry.f3;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mz.f;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class b implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final Date f39651a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f39652b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f39653c;

    /* loaded from: classes5.dex */
    public static final class a implements n0<b> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.n0
        /* renamed from: b */
        public b a(t0 t0Var, d0 d0Var) {
            ArrayList arrayList = new ArrayList();
            t0Var.g();
            Date date = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                if (p02.equals("discarded_events")) {
                    arrayList.addAll(t0Var.F1(d0Var, new f.a()));
                } else if (!p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    t0Var.P1(d0Var, hashMap, p02);
                } else {
                    date = t0Var.t1(d0Var);
                }
            }
            t0Var.C();
            if (date != null) {
                if (!arrayList.isEmpty()) {
                    b bVar = new b(date, arrayList);
                    bVar.b(hashMap);
                    return bVar;
                }
                throw c("discarded_events", d0Var);
            }
            throw c(FraudDetectionData.KEY_TIMESTAMP, d0Var);
        }
    }

    public b(Date date, List<f> list) {
        this.f39651a = date;
        this.f39652b = list;
    }

    public List<f> a() {
        return this.f39652b;
    }

    public void b(Map<String, Object> map) {
        this.f39653c = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).G0(io.sentry.g.f(this.f39651a));
        v0Var.P0("discarded_events").Q0(d0Var, this.f39652b);
        Map<String, Object> map = this.f39653c;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f39653c.get(str));
            }
        }
        v0Var.C();
    }
}