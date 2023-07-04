package atd.d;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: g  reason: collision with root package name */
    private final int f6791g;

    /* renamed from: h  reason: collision with root package name */
    private final atd.e.a f6792h;

    /* renamed from: i  reason: collision with root package name */
    private final atd.e.e f6793i;

    /* renamed from: j  reason: collision with root package name */
    private final a f6794j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject) {
        super(jSONObject);
        atd.e.e a11;
        try {
            this.f6791g = a(jSONObject, atd.s0.a.a(-98851631196736L));
            atd.e.a a12 = atd.e.a.a(b(jSONObject, atd.s0.a.a(-98890285902400L)));
            this.f6792h = a12;
            if (a12.a()) {
                a11 = atd.e.e.a(d(jSONObject, atd.s0.a.a(-98722782177856L)));
            } else {
                a11 = atd.e.e.a(b(jSONObject, atd.s0.a.a(-98774321785408L)));
            }
            this.f6793i = a11;
            if (a12.a()) {
                atd.e.b.a(b(jSONObject, atd.s0.a.a(-98001227672128L)));
            } else {
                atd.e.b.a(d(jSONObject, atd.s0.a.a(-98061357214272L)));
            }
            this.f6794j = a12.a() ? a.a(jSONObject) : null;
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-98087127018048L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    @Override // atd.d.j
    public boolean f() {
        return true;
    }

    public int g() {
        return this.f6791g;
    }

    public a h() {
        return this.f6794j;
    }

    public String i() {
        return this.f6793i.a();
    }

    public boolean j() {
        return this.f6792h.b();
    }

    @Override // atd.d.j
    String g(JSONObject jSONObject, String str) {
        return c(jSONObject, str);
    }
}