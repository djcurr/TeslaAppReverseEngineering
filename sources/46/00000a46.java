package atd.c;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c<T> implements atd.f.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f6779a;

    /* renamed from: b  reason: collision with root package name */
    private final T f6780b;

    public c(String str, T t11) {
        this.f6779a = str;
        this.f6780b = t11;
    }

    private String b() {
        return this.f6779a;
    }

    private T c() {
        return this.f6780b;
    }

    @Override // atd.f.b
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (a(c())) {
            jSONObject.put(b(), c());
        }
        return jSONObject;
    }

    abstract boolean a(T t11);
}