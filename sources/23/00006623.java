package du;

import android.util.Base64;
import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.s;
import lt.w2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f24245a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f24246b = com.tesla.logging.g.f21878b.a("VehicleDataConverter");

    private j() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if ((r0.length() > 0) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final lt.w2 a(lt.w2 r112, java.lang.String r113) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: du.j.a(lt.w2, java.lang.String):lt.w2");
    }

    public final w2 b(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        byte[] decode = Base64.decode(jSONObject.optString("cached_data"), 0);
        if (decode == null) {
            return null;
        }
        if (!(!(decode.length == 0))) {
            decode = null;
        }
        if (decode == null) {
            return null;
        }
        try {
            j jVar = f24245a;
            w2 a11 = g.f24242a.a(w2.f37685n.decode(decode));
            String optString = jSONObject.optString("vin");
            s.f(optString, "optString(\"vin\")");
            return jVar.a(a11, optString);
        } catch (Exception e11) {
            f24246b.f("error when parsing cached vehicle data from owner api response", e11);
            return null;
        }
    }

    public final w2 c(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        try {
            w2 a11 = k.f24247a.a(jSONObject);
            if (a11 == null) {
                return null;
            }
            String optString = jSONObject.optString("vin");
            s.f(optString, "optString(\"vin\")");
            return a(a11, optString);
        } catch (Exception e11) {
            f24246b.f("error when parsing vehicle data from owner api response", e11);
            return null;
        }
    }

    public final w2 d(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        byte[] vehicleString = Base64.decode(jSONObject.optString("proto_vehicle_data_raw"), 0);
        try {
            ProtoAdapter<w2> protoAdapter = w2.f37685n;
            s.f(vehicleString, "vehicleString");
            String optString = jSONObject.optString("vin");
            s.f(optString, "optString(\"vin\")");
            return a(protoAdapter.decode(vehicleString), optString);
        } catch (Exception e11) {
            f24246b.f("error when parsing vehicle data from proto_vehicle_data_raw", e11);
            return null;
        }
    }
}