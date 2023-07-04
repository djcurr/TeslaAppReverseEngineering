package du;

import j$.time.Instant;
import kotlin.jvm.internal.s;
import lt.w2;
import mt.m;
import mt.n;
import mt.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f24247a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f24248b = com.tesla.logging.g.f21878b.a("VehicleDataFactory");

    private k() {
    }

    public final w2 a(JSONObject jSONObject) {
        JSONObject vehicleDataJson = jSONObject;
        s.g(vehicleDataJson, "vehicleDataJson");
        try {
            w2 w2Var = new w2(null, null, null, null, null, null, null, null, 0, null, null, null, false, null, 16383, null);
            if (vehicleDataJson.has("response")) {
                vehicleDataJson = vehicleDataJson.optJSONObject("response");
            }
            if (vehicleDataJson != null) {
                mt.j a11 = a.a(vehicleDataJson);
                mt.k b11 = b.b(vehicleDataJson);
                m a12 = d.a(vehicleDataJson);
                mt.l a13 = c.a(vehicleDataJson);
                n a14 = e.a(vehicleDataJson);
                o a15 = f.a(vehicleDataJson);
                return new w2(a14, a11, b11, a12, l.b(vehicleDataJson), i.f(vehicleDataJson), a15, a13, vehicleDataJson.optInt("proto_json_version", w2Var.k()), null, null, null, true, null, 11776, null);
            }
            return null;
        } catch (Exception e11) {
            f24248b.f("Failed to convert JSON to vehicle data", e11);
            return null;
        }
    }

    public final Boolean b(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.has(name)) {
            Object obj = jSONObject.get(name);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Integer) {
                return Boolean.valueOf(!s.c(obj, 0));
            }
            return null;
        }
        return null;
    }

    public final Double c(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        Double valueOf = Double.valueOf(jSONObject.optDouble(name));
        if (!(!Double.isNaN(valueOf.doubleValue()))) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf.doubleValue());
    }

    public final Float d(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        Double valueOf = Double.valueOf(jSONObject.optDouble(name));
        if (!(!Double.isNaN(valueOf.doubleValue()))) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Float.valueOf((float) valueOf.doubleValue());
    }

    public final Instant e(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.has(name)) {
            Long valueOf = Long.valueOf(jSONObject.optLong(name, -1L));
            if (!(valueOf.longValue() != -1)) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return Instant.ofEpochMilli(valueOf.longValue());
        }
        return null;
    }

    public final Instant f(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.has(name)) {
            Long valueOf = Long.valueOf(jSONObject.optLong(name, -1L));
            if (!(valueOf.longValue() != -1)) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return Instant.ofEpochMilli(valueOf.longValue() * 1000);
        }
        return null;
    }

    public final Integer g(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.has(name)) {
            return Integer.valueOf(jSONObject.optInt(name));
        }
        return null;
    }

    public final com.tesla.logging.g h() {
        return f24248b;
    }

    public final Long i(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.has(name)) {
            return Long.valueOf(jSONObject.optLong(name));
        }
        return null;
    }

    public final String j(JSONObject jSONObject, String name) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        if (jSONObject.isNull(name)) {
            return null;
        }
        String it2 = jSONObject.optString(name);
        s.f(it2, "it");
        if (it2.length() > 0) {
            return it2;
        }
        return null;
    }

    public final float k(JSONObject jSONObject, String name, float f11) {
        s.g(jSONObject, "<this>");
        s.g(name, "name");
        Double valueOf = Double.valueOf(jSONObject.optDouble(name));
        if (!(!Double.isNaN(valueOf.doubleValue()))) {
            valueOf = null;
        }
        return valueOf == null ? f11 : Float.valueOf((float) valueOf.doubleValue()).floatValue();
    }
}