package du;

import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.networking.FraudDetectionData;
import ezvcard.property.Gender;
import j$.time.Instant;
import kotlin.jvm.internal.s;
import kt.u;
import mt.n;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {
    public static final n a(JSONObject jSONObject) {
        n.a aVar;
        n.e eVar;
        n.d dVar;
        n.f fVar;
        n.g i11;
        s.g(jSONObject, "<this>");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("gui_settings");
            if (optJSONObject == null) {
                return null;
            }
            n nVar = new n(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
            k kVar = k.f24247a;
            Boolean b11 = kVar.b(optJSONObject, "gui_24_hour_time");
            Boolean b12 = kVar.b(optJSONObject, "show_range_units");
            Instant e11 = kVar.e(optJSONObject, FraudDetectionData.KEY_TIMESTAMP);
            if (e11 == null) {
                e11 = nVar.m();
            }
            Instant instant = e11;
            String j11 = kVar.j(optJSONObject, "gui_charge_rate_units");
            if (j11 == null) {
                aVar = null;
            } else {
                int hashCode = j11.hashCode();
                if (hashCode == -670529065) {
                    if (j11.equals("Invalid")) {
                        aVar = new n.a(new u(null, 1, null), null, null, null, null, 30, null);
                    }
                    aVar = nVar.e();
                } else if (hashCode != 3404) {
                    if (hashCode == 3426) {
                        if (!j11.equals("km")) {
                            aVar = nVar.e();
                        }
                        aVar = new n.a(null, new u(null, 1, null), null, null, null, 29, null);
                    } else if (hashCode == 3484) {
                        if (!j11.equals("mi")) {
                            aVar = nVar.e();
                        }
                        aVar = new n.a(null, null, new u(null, 1, null), null, null, 27, null);
                    } else {
                        if (hashCode == 102112471) {
                            if (!j11.equals("km/hr")) {
                            }
                            aVar = new n.a(null, new u(null, 1, null), null, null, null, 29, null);
                        } else if (hashCode == 103840349) {
                            if (!j11.equals("mi/hr")) {
                            }
                            aVar = new n.a(null, null, new u(null, 1, null), null, null, 27, null);
                        }
                        aVar = nVar.e();
                    }
                } else if (j11.equals("kW")) {
                    aVar = new n.a(null, null, null, new u(null, 1, null), null, 23, null);
                } else {
                    aVar = nVar.e();
                }
            }
            if (aVar == null) {
                aVar = nVar.e();
            }
            n.a aVar2 = aVar;
            String j12 = kVar.j(optJSONObject, "gui_distance_units");
            if (j12 == null) {
                eVar = null;
            } else if (s.c(j12, "km/hr")) {
                eVar = new n.e(new u(null, 1, null), null, null, 6, null);
            } else {
                eVar = s.c(j12, "mi/hr") ? new n.e(null, new u(null, 1, null), null, 5, null) : nVar.f();
            }
            if (eVar == null) {
                eVar = nVar.f();
            }
            n.e eVar2 = eVar;
            String j13 = kVar.j(optJSONObject, "gui_range_display");
            if (j13 == null) {
                dVar = null;
            } else if (s.c(j13, "Ideal")) {
                dVar = new n.d(new u(null, 1, null), null, null, 6, null);
            } else {
                dVar = s.c(j13, "Rated") ? new n.d(null, new u(null, 1, null), null, 5, null) : nVar.g();
            }
            if (dVar == null) {
                dVar = nVar.g();
            }
            n.d dVar2 = dVar;
            String j14 = kVar.j(optJSONObject, "gui_temperature_units");
            if (j14 == null) {
                fVar = null;
            } else if (s.c(j14, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE)) {
                fVar = new n.f(null, new u(null, 1, null), null, 5, null);
            } else {
                fVar = s.c(j14, Gender.FEMALE) ? new n.f(new u(null, 1, null), null, null, 6, null) : nVar.h();
            }
            if (fVar == null) {
                fVar = nVar.h();
            }
            n.f fVar2 = fVar;
            String j15 = kVar.j(optJSONObject, "gui_tirepressure_units");
            if (s.c(j15, "Bar")) {
                i11 = n.g.TirePressureUnitBar;
            } else {
                i11 = s.c(j15, "Psi") ? n.g.TirePressureUnitPsi : nVar.i();
            }
            return new n(false, false, null, eVar2, fVar2, aVar2, dVar2, instant, b11, b12, i11, null, 2055, null);
        } catch (Exception e12) {
            k.f24247a.h().f("Gui settings parse failure", e12);
            return null;
        }
    }
}