package fm;

import com.google.firebase.crashlytics.internal.common.q;
import com.stripe.android.model.Stripe3ds2AuthParams;
import expo.modules.interfaces.permissions.PermissionsResponse;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements g {
    private static gm.a b(JSONObject jSONObject) {
        return new gm.a(jSONObject.getString(PermissionsResponse.STATUS_KEY), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static gm.b c(JSONObject jSONObject) {
        return new gm.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static gm.c d(JSONObject jSONObject) {
        return new gm.c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gm.d e(q qVar) {
        JSONObject jSONObject = new JSONObject();
        return new gm.e(f(qVar, 3600L, jSONObject), null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(q qVar, long j11, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return qVar.a() + (j11 * 1000);
    }

    @Override // fm.g
    public gm.e a(q qVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new gm.e(f(qVar, optInt2, jSONObject), b(jSONObject.getJSONObject(Stripe3ds2AuthParams.FIELD_APP)), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}