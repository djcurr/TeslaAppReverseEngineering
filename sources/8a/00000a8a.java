package atd.g;

import atd.g0.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f6860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6861b;

    public a(JSONObject jSONObject) {
        this.f6860a = b.a(jSONObject.getJSONObject(atd.s0.a.a(-86765593225792L)));
        b.a(jSONObject.getJSONObject(atd.s0.a.a(-86838607669824L)));
        this.f6861b = jSONObject.getString(atd.s0.a.a(-86636744206912L));
    }

    public b a() {
        return this.f6860a;
    }

    public String b() {
        return this.f6861b;
    }
}