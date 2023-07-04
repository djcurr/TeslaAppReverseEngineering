package fm;

import com.google.firebase.crashlytics.internal.common.q;
import com.stripe.android.model.Stripe3ds2AuthParams;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class h implements g {
    private static gm.a b(JSONObject jSONObject, JSONObject jSONObject2) {
        String string = jSONObject2.getString(PermissionsResponse.STATUS_KEY);
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        String format = equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        return new gm.a(string, format, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static gm.b c(JSONObject jSONObject) {
        return new gm.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static gm.c d() {
        return new gm.c(8, 4);
    }

    private static long e(q qVar, long j11, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return qVar.a() + (j11 * 1000);
    }

    @Override // fm.g
    public gm.e a(q qVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new gm.e(e(qVar, optInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject(Stripe3ds2AuthParams.FIELD_APP)), d(), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}