package du;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f24244a = new h();

    private h() {
    }

    public final boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("sentry_mode_available");
    }

    public final boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("sentry_mode");
    }

    public final boolean c(JSONObject jSONObject) {
        return jSONObject != null && b(jSONObject) && a(jSONObject);
    }
}