package cv;

import android.util.Pair;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import lt.w2;
import mt.u;
import org.json.JSONObject;
import wz.b0;
import wz.e0;
import wz.v;
import wz.w;

/* loaded from: classes6.dex */
public final class c {

    /* loaded from: classes6.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            w2 g11 = ((cu.a) t11).g();
            Integer valueOf = g11 == null ? null : Integer.valueOf(et.a.m(g11));
            w2 g12 = ((cu.a) t12).g();
            a11 = yz.b.a(valueOf, g12 != null ? Integer.valueOf(et.a.m(g12)) : null);
            return a11;
        }
    }

    public static final void a(ct.i iVar) {
        List<String> i11;
        List<String> d11;
        s.g(iVar, "<this>");
        i11 = w.i();
        d11 = v.d("REALM_V_DATA_PROTO_CACHE_PREFIX");
        iVar.r(i11, d11);
    }

    public static final cu.a b(ct.i iVar, String vehicleId) {
        cu.a c11;
        u n11;
        u n12;
        s.g(iVar, "<this>");
        s.g(vehicleId, "vehicleId");
        cu.a c12 = c(iVar, vehicleId);
        String g11 = iVar.g("V_" + vehicleId);
        Instant instant = null;
        if (g11 == null) {
            c11 = null;
        } else {
            av.a.a().a("got vehicle " + vehicleId + " from redux");
            c11 = cv.a.f23118a.c(new JSONObject(g11));
        }
        if (c12 == null) {
            return c11;
        }
        if (c11 == null) {
            return c12;
        }
        w2 g12 = c12.g();
        Instant F0 = (g12 == null || (n11 = g12.n()) == null) ? null : n11.F0();
        if (F0 == null) {
            F0 = Instant.now();
        }
        w2 g13 = c11.g();
        if (g13 != null && (n12 = g13.n()) != null) {
            instant = n12.F0();
        }
        if (instant == null) {
            instant = Instant.now();
        }
        if (F0.isAfter(instant)) {
            return cu.a.b(c12, null, c11.f(), false, null, null, null, null, null, 253, null);
        }
        e(iVar, c11);
        av.a.a().a("save redux vehicle " + vehicleId + " to widget cache because the timestamp is more recent");
        return c11;
    }

    public static final cu.a c(ct.i iVar, String vehicleId) {
        s.g(iVar, "<this>");
        s.g(vehicleId, "vehicleId");
        String g11 = iVar.g("REALM_V_DATA_PROTO_CACHE_PREFIX" + vehicleId);
        if (g11 == null) {
            return null;
        }
        com.tesla.logging.g a11 = av.a.a();
        a11.a("got vehicle " + vehicleId + " from widget cache");
        try {
            return cv.a.f23118a.d(g11);
        } catch (Exception e11) {
            av.a.a().d("error when decode vehicle byte array from cache", e11);
            return null;
        }
    }

    public static final List<cu.a> d(ct.i iVar) {
        List<String> d11;
        List<String> i11;
        List<cu.a> G0;
        List i12;
        s.g(iVar, "<this>");
        d11 = v.d("persist:productList");
        i11 = w.i();
        List<Pair<String, String>> h11 = iVar.h(d11, i11);
        s.f(h11, "get(listOf(\"persist:productList\"), emptyList())");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = h11.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            try {
                i12 = new ArrayList();
                JSONObject jSONObject = new JSONObject(new JSONObject((String) pair.second).getString("productMap"));
                Iterator<String> keys = jSONObject.keys();
                s.f(keys, "productMap.keys()");
                while (keys.hasNext()) {
                    cv.a aVar = cv.a.f23118a;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(keys.next());
                    s.f(jSONObject2, "productMap.getJSONObject(key)");
                    cu.a c11 = aVar.c(jSONObject2);
                    if (c11 != null) {
                        i12.add(c11);
                    }
                }
            } catch (Exception e11) {
                av.a.a().d("error parsing product", e11);
                i12 = w.i();
            }
            b0.z(arrayList, i12);
        }
        G0 = e0.G0(arrayList, new a());
        return G0;
    }

    public static final void e(ct.i iVar, cu.a vehicle) {
        s.g(iVar, "<this>");
        s.g(vehicle, "vehicle");
        com.tesla.logging.g a11 = av.a.a();
        String h11 = vehicle.h();
        a11.a("saving vehicle " + h11 + " to widget cache");
        String h12 = vehicle.h();
        iVar.t("REALM_V_DATA_PROTO_CACHE_PREFIX" + h12, cv.a.f23118a.a(vehicle));
    }
}