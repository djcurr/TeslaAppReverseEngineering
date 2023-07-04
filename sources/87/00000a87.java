package atd.f0;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends atd.i0.f {

    /* renamed from: c */
    private final atd.d0.f f6853c;

    /* renamed from: d */
    private final atd.c0.b f6854d;

    public f(atd.d0.f fVar, atd.c0.b bVar, JSONObject jSONObject) {
        super(a(fVar, bVar, jSONObject));
        this.f6853c = fVar;
        this.f6854d = bVar;
    }

    private static byte[] a(atd.d0.f fVar, atd.c0.b bVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(atd.s0.a.a(-798583408093760L), fVar.a());
            jSONObject2.put(atd.s0.a.a(-798600587962944L), bVar.a());
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return jSONObject2.toString().getBytes(com.adyen.threeds2.internal.b.f9630a);
        } catch (JSONException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public atd.c0.b e() {
        return this.f6854d;
    }

    public atd.d0.f f() {
        return this.f6853c;
    }

    public f(String str) {
        super(str);
        try {
            JSONObject d11 = d();
            this.f6853c = atd.d0.g.a(d11.getString(atd.s0.a.a(-798617767832128L)));
            this.f6854d = atd.c0.c.a(d11.getString(atd.s0.a.a(-798634947701312L)));
        } catch (JSONException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }
}