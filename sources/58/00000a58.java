package atd.d;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends i {

    /* renamed from: h  reason: collision with root package name */
    private final atd.e.c f6795h;

    /* renamed from: i  reason: collision with root package name */
    private final String f6796i;

    public d(String str, String str2, String str3, String str4, String str5, atd.e.c cVar, String str6) {
        super(atd.e.d.ERROR, str, str2, str3, str4, str5);
        this.f6795h = cVar;
        this.f6796i = str6;
    }

    @Override // atd.d.i, atd.f.b
    public JSONObject a() {
        JSONObject a11 = super.a();
        a11.put(atd.s0.a.a(-98280400546368L), this.f6795h.a());
        a11.put(atd.s0.a.a(-98306170350144L), this.f6795h.b());
        a11.put(atd.s0.a.a(-98379184794176L), this.f6795h.c());
        a11.put(atd.s0.a.a(-98168731396672L), this.f6795h.d());
        a11.put(atd.s0.a.a(-98267515644480L), this.f6796i);
        return a11;
    }

    @Override // atd.d.i
    public boolean i() {
        return false;
    }
}