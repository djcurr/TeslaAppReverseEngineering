package atd.d;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends j {

    /* renamed from: g  reason: collision with root package name */
    private final String f6797g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6798h;

    /* renamed from: i  reason: collision with root package name */
    private final String f6799i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f6797g = b(jSONObject, atd.s0.a.a(-97494421531200L));
            b(jSONObject, atd.s0.a.a(-97520191334976L));
            this.f6798h = b(jSONObject, atd.s0.a.a(-97318327872064L));
            this.f6799i = b(jSONObject, atd.s0.a.a(-97382752381504L));
            b(jSONObject, atd.s0.a.a(-97434291989056L));
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-97773594405440L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    @Override // atd.d.j
    public boolean f() {
        return false;
    }

    public String g() {
        return this.f6797g;
    }

    public String h() {
        return this.f6798h;
    }

    public String i() {
        return this.f6799i;
    }

    @Override // atd.d.j
    String g(JSONObject jSONObject, String str) {
        return f(jSONObject, str);
    }
}