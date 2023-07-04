package du;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.networking.FraudDetectionData;
import j$.time.Instant;
import kotlin.jvm.internal.s;
import kt.u;
import mt.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f {
    public static final o a(JSONObject jSONObject) {
        o.c cVar;
        o.c cVar2;
        s.g(jSONObject, "<this>");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("drive_state");
            if (optJSONObject == null) {
                return null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("vehicle_state");
            o oVar = new o(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
            k kVar = k.f24247a;
            Float d11 = kVar.d(optJSONObject, "corrected_latitude");
            Float d12 = kVar.d(optJSONObject, "corrected_longitude");
            long optLong = optJSONObject.optLong("gps_as_of");
            Integer g11 = kVar.g(optJSONObject, "heading");
            Float d13 = kVar.d(optJSONObject, "latitude");
            Float d14 = kVar.d(optJSONObject, "longitude");
            Float d15 = kVar.d(optJSONObject, "native_latitude");
            Boolean b11 = kVar.b(optJSONObject, "native_location_supported");
            Float d16 = kVar.d(optJSONObject, "native_longitude");
            Instant e11 = kVar.e(optJSONObject, FraudDetectionData.KEY_TIMESTAMP);
            if (e11 == null) {
                e11 = oVar.x();
            }
            Instant instant = e11;
            String j11 = kVar.j(optJSONObject, "native_type");
            if (j11 == null) {
                cVar2 = null;
            } else {
                if (s.c(j11, "gcj")) {
                    cVar = new o.c(new u(null, 1, null), null, null, 6, null);
                } else {
                    cVar = s.c(j11, "wgs") ? new o.c(null, new u(null, 1, null), null, 5, null) : oVar.w();
                }
                if (cVar == null) {
                    cVar = oVar.w();
                }
                cVar2 = cVar;
            }
            return new o(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, cVar2, instant, d13, d14, g11, Long.valueOf(optLong), b11, d15, d16, d11, d12, optJSONObject2 == null ? null : kVar.b(optJSONObject2, "homelink_nearby"), null, 4195327, null);
        } catch (Exception e12) {
            k.f24247a.h().f("Location state parse failure", e12);
            return null;
        }
    }
}