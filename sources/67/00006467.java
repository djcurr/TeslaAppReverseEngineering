package cv;

import java.util.List;
import kotlin.jvm.internal.s;
import vz.p;
import wz.v;
import wz.w;

/* loaded from: classes6.dex */
public final class b {
    public static final void a(ct.i iVar) {
        List<String> i11;
        List<String> d11;
        s.g(iVar, "<this>");
        i11 = w.i();
        d11 = v.d("appwidget_cache");
        iVar.r(i11, d11);
    }

    public static final void b(ct.i iVar, int i11) {
        s.g(iVar, "<this>");
        iVar.q("appwidget_" + i11);
    }

    public static final String c(ct.i iVar, String vin, p<Double, Double> location) {
        s.g(iVar, "<this>");
        s.g(vin, "vin");
        s.g(location, "location");
        return iVar.g("REALM_WIDGET_LOCATION_CACHE" + vin + ":location" + location);
    }

    public static final String d(ct.i iVar, int i11) {
        s.g(iVar, "<this>");
        return iVar.g("appwidget_" + i11);
    }

    public static final void e(ct.i iVar, String vin, p<Double, Double> location, String locationString) {
        List<String> i11;
        List<String> d11;
        s.g(iVar, "<this>");
        s.g(vin, "vin");
        s.g(location, "location");
        s.g(locationString, "locationString");
        i11 = w.i();
        d11 = v.d("REALM_WIDGET_LOCATION_CACHE" + vin + ":location");
        iVar.r(i11, d11);
        iVar.t("REALM_WIDGET_LOCATION_CACHE" + vin + ":location" + location, locationString);
    }

    public static final void f(ct.i iVar, int i11, String vehicleId) {
        s.g(iVar, "<this>");
        s.g(vehicleId, "vehicleId");
        iVar.t("appwidget_" + i11, vehicleId);
    }
}