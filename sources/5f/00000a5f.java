package atd.d;

import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i implements atd.f.b {

    /* renamed from: a  reason: collision with root package name */
    private final atd.e.d f6810a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6811b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6812c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6813d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6814e;

    /* renamed from: f  reason: collision with root package name */
    private int f6815f;

    /* renamed from: g  reason: collision with root package name */
    private String f6816g;

    public i(atd.e.d dVar, String str, String str2, String str3, String str4, String str5) {
        this.f6810a = dVar;
        this.f6811b = str;
        this.f6812c = str2;
        this.f6813d = str3;
        this.f6814e = str4;
        this.f6816g = str5;
    }

    @Override // atd.f.b
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(atd.s0.a.a(-95660470495808L), this.f6810a.a());
        jSONObject.put(atd.s0.a.a(-95712010103360L), this.f6811b);
        jSONObject.put(atd.s0.a.a(-95785024547392L), this.f6812c);
        jSONObject.put(atd.s0.a.a(-96141506832960L), this.f6813d);
        jSONObject.put(atd.s0.a.a(-96197341407808L), this.f6814e);
        jSONObject.put(atd.s0.a.a(-95978298075712L), String.format(Locale.ROOT, atd.s0.a.a(-96051312519744L), Integer.valueOf(this.f6815f)));
        jSONObject.putOpt(atd.s0.a.a(-96064197421632L), this.f6816g);
        return jSONObject;
    }

    public String b() {
        return this.f6813d;
    }

    public atd.e.d c() {
        return this.f6810a;
    }

    public String d() {
        return this.f6811b;
    }

    public int e() {
        return this.f6815f;
    }

    public String f() {
        return this.f6814e;
    }

    public String g() {
        return this.f6816g;
    }

    public String h() {
        return this.f6812c;
    }

    public abstract boolean i();

    public void a(int i11) {
        this.f6815f = i11;
    }
}