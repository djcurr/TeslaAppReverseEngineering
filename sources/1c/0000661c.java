package du;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.networking.FraudDetectionData;
import j$.time.Instant;
import kotlin.jvm.internal.s;
import kt.u;
import mt.l;
import mt.t;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {
    public static final mt.l a(JSONObject jSONObject) {
        t tVar;
        l.e eVar;
        l.c cVar;
        l.d dVar;
        l.d dVar2;
        s.g(jSONObject, "<this>");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("vehicle_state");
            if (optJSONObject == null) {
                return null;
            }
            mt.l lVar = new mt.l(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 255, null);
            k kVar = k.f24247a;
            Boolean b11 = kVar.b(optJSONObject, "locked");
            Boolean b12 = kVar.b(optJSONObject, "df");
            Boolean b13 = kVar.b(optJSONObject, "dr");
            Boolean b14 = kVar.b(optJSONObject, "pf");
            Boolean b15 = kVar.b(optJSONObject, "pr");
            Boolean b16 = kVar.b(optJSONObject, "ft");
            Boolean b17 = kVar.b(optJSONObject, "rt");
            Boolean b18 = kVar.b(optJSONObject, "fd_window");
            Boolean b19 = kVar.b(optJSONObject, "fp_window");
            Boolean b21 = kVar.b(optJSONObject, "rd_window");
            Boolean b22 = kVar.b(optJSONObject, "rp_window");
            Boolean b23 = kVar.b(optJSONObject, "is_user_present");
            Boolean b24 = kVar.b(optJSONObject, "remote_start");
            Instant e11 = kVar.e(optJSONObject, FraudDetectionData.KEY_TIMESTAMP);
            if (e11 == null) {
                e11 = lVar.A();
            }
            Instant instant = e11;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("speed_limit_mode");
            if (optJSONObject2 == null) {
                tVar = null;
            } else {
                tVar = new t(false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kVar.b(optJSONObject2, "active"), kVar.b(optJSONObject2, "pin_code_set"), kVar.d(optJSONObject2, "max_limit_mph"), kVar.d(optJSONObject2, "min_limit_mph"), kVar.d(optJSONObject2, "current_limit_mph"), null, 1055, null);
            }
            if (tVar == null) {
                tVar = lVar.w();
            }
            t tVar2 = tVar;
            Integer g11 = kVar.g(optJSONObject, "sun_roof_percent_open");
            Boolean b25 = kVar.b(optJSONObject, "valet_mode");
            Boolean b26 = kVar.b(optJSONObject, "valet_pin_needed");
            String j11 = kVar.j(optJSONObject, "sun_roof_state");
            if (j11 != null) {
                switch (j11.hashCode()) {
                    case -1357520532:
                        if (j11.equals("closed")) {
                            eVar = new l.e(null, null, new u(null, 1, null), null, null, null, null, 123, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    case -1068259250:
                        if (j11.equals("moving")) {
                            eVar = new l.e(null, null, null, null, new u(null, 1, null), null, null, 111, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    case -284840886:
                        if (j11.equals("unknown")) {
                            eVar = new l.e(new u(null, 1, null), null, null, null, null, null, null, 126, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    case 3417674:
                        if (j11.equals("open")) {
                            eVar = new l.e(null, null, null, new u(null, 1, null), null, null, null, 119, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    case 3615925:
                        if (j11.equals("vent")) {
                            eVar = new l.e(null, null, null, null, null, new u(null, 1, null), null, 95, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    case 1421318596:
                        if (j11.equals("calibrating")) {
                            eVar = new l.e(null, new u(null, 1, null), null, null, null, null, null, 125, null);
                            break;
                        } else {
                            eVar = lVar.z();
                            break;
                        }
                    default:
                        eVar = lVar.z();
                        break;
                }
            } else {
                eVar = null;
            }
            if (eVar == null) {
                eVar = lVar.z();
            }
            l.e eVar2 = eVar;
            Integer g12 = kVar.g(optJSONObject, "center_display_state");
            if (g12 != null) {
                switch (g12.intValue()) {
                    case 0:
                        cVar = new l.c(new u(null, 1, null), null, null, null, null, null, null, null, null, null, null, 2046, null);
                        break;
                    case 1:
                        cVar = new l.c(null, new u(null, 1, null), null, null, null, null, null, null, null, null, null, 2045, null);
                        break;
                    case 2:
                        cVar = new l.c(null, null, new u(null, 1, null), null, null, null, null, null, null, null, null, 2043, null);
                        break;
                    case 3:
                        cVar = new l.c(null, null, null, new u(null, 1, null), null, null, null, null, null, null, null, 2039, null);
                        break;
                    case 4:
                        cVar = new l.c(null, null, null, null, new u(null, 1, null), null, null, null, null, null, null, 2031, null);
                        break;
                    case 5:
                        cVar = new l.c(null, null, null, null, null, new u(null, 1, null), null, null, null, null, null, 2015, null);
                        break;
                    case 6:
                        cVar = new l.c(null, null, null, null, null, null, new u(null, 1, null), null, null, null, null, 1983, null);
                        break;
                    case 7:
                        cVar = new l.c(null, null, null, null, null, null, null, new u(null, 1, null), null, null, null, 1919, null);
                        break;
                    case 8:
                        cVar = new l.c(null, null, null, null, null, null, null, null, new u(null, 1, null), null, null, 1791, null);
                        break;
                    case 9:
                        cVar = new l.c(null, null, null, null, null, null, null, null, null, new u(null, 1, null), null, 1535, null);
                        break;
                    default:
                        cVar = lVar.c();
                        break;
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                cVar = lVar.c();
            }
            l.c cVar2 = cVar;
            h hVar = h.f24244a;
            Boolean b27 = hVar.c(optJSONObject) ? kVar.b(optJSONObject, "sentry_mode_available") : null;
            if (hVar.c(optJSONObject)) {
                Object opt = optJSONObject.opt("sentry_mode");
                if (opt == null) {
                    dVar2 = null;
                } else {
                    Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
                    if (bool == null) {
                        dVar2 = null;
                    } else if (bool.booleanValue()) {
                        dVar2 = new l.d(null, new u(null, 1, null), null, null, null, null, null, 125, null);
                    } else {
                        dVar2 = new l.d(new u(null, 1, null), null, null, null, null, null, null, 126, null);
                    }
                    if (dVar2 == null) {
                        dVar2 = new l.d(new u(null, 1, null), null, null, null, null, null, null, 126, null);
                    }
                }
                if (dVar2 == null) {
                    dVar2 = new l.d(new u(null, 1, null), null, null, null, null, null, null, 126, null);
                }
                dVar = dVar2;
            } else {
                dVar = null;
            }
            return new mt.l(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, eVar2, cVar2, dVar, tVar2, instant, b12, b13, b14, b15, b16, b17, b18, b19, b21, b22, g11, b11, b23, b24, b25, b26, b27, null, 131071, 128, null);
        } catch (Exception e12) {
            k.f24247a.h().f("Closure state parse failure", e12);
            return null;
        }
    }
}