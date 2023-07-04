package atd.d;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: h  reason: collision with root package name */
    private final atd.c.c f6789h;

    /* renamed from: i  reason: collision with root package name */
    private final String f6790i;

    public b(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, null);
    }

    @Override // atd.d.i, atd.f.b
    public JSONObject a() {
        JSONObject a11 = super.a();
        atd.c.c cVar = this.f6789h;
        if (cVar != null) {
            a11 = atd.f.a.a(a11, cVar.a());
        }
        a11.putOpt(atd.s0.a.a(-98465084140096L), this.f6790i);
        return a11;
    }

    @Override // atd.d.i
    public boolean i() {
        return true;
    }

    public atd.c.c j() {
        return this.f6789h;
    }

    public b(String str, String str2, String str3, String str4, String str5, atd.c.c cVar, String str6) {
        super(atd.e.d.CHALLENGE_REQUEST, str, str2, str3, str4, str5);
        this.f6789h = cVar;
        this.f6790i = str6;
    }
}