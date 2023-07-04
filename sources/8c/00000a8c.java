package atd.g0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final String f6865a;

    public b(JSONObject jSONObject) {
        this.f6865a = jSONObject.optString(atd.s0.a.a(-798201156004416L));
        jSONObject.getString(atd.s0.a.a(-798218335873600L));
    }

    public static b a(JSONObject jSONObject) {
        String string = jSONObject.getString(atd.s0.a.a(-798128141560384L));
        if (atd.s0.a.a(-798145321429568L).equals(string)) {
            return new d(jSONObject);
        }
        if (atd.s0.a.a(-798162501298752L).equals(string)) {
            return new a(jSONObject);
        }
        if (atd.s0.a.a(-798183976135232L).equals(string)) {
            return new e(jSONObject);
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }

    public String b() {
        return this.f6865a;
    }

    public b(String str, String str2) {
        this.f6865a = str;
    }

    public static void a(b bVar, Class<? extends b> cls) {
        if (!cls.isInstance(bVar)) {
            throw atd.y.c.CRYPTO_FAILURE.a();
        }
    }
}