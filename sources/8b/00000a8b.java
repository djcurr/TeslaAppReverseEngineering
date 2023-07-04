package atd.g0;

import atd.d0.g;
import atd.f0.f;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private final atd.i0.d f6862b;

    /* renamed from: c  reason: collision with root package name */
    private final ECPublicKey f6863c;

    /* renamed from: d  reason: collision with root package name */
    private final ECPrivateKey f6864d;

    static {
        atd.s0.a.a(-798141026462272L);
    }

    public a(String str, atd.i0.d dVar) {
        super(str, atd.s0.a.a(-797960637835840L));
        this.f6862b = dVar;
        KeyPair a11 = atd.i0.e.a(dVar);
        this.f6863c = (ECPublicKey) a11.getPublic();
        this.f6864d = (ECPrivateKey) a11.getPrivate();
    }

    @Override // atd.f0.b
    public atd.f0.a a() {
        a aVar = new a(b(), atd.i0.d.P256);
        JSONObject jSONObject = new JSONObject();
        String b11 = aVar.b();
        if (b11 != null && !b11.isEmpty()) {
            jSONObject.put(atd.s0.a.a(-797831788816960L), b11);
        }
        jSONObject.put(atd.s0.a.a(-798123846593088L), aVar.g());
        atd.d0.d dVar = g.f6845b;
        atd.c0.b bVar = atd.c0.c.f6781a;
        f fVar = new f(dVar, bVar, jSONObject);
        byte[] a11 = aVar.a(null, null, b(), f());
        return new atd.f0.a(fVar, g.f6844a.a(bVar, a11), new e(b(), a11));
    }

    @Override // atd.g0.c
    /* renamed from: e */
    public ECPrivateKey d() {
        return this.f6864d;
    }

    public ECPublicKey f() {
        return this.f6863c;
    }

    public JSONObject g() {
        ECPoint w11 = this.f6863c.getW();
        atd.r0.a a11 = atd.r0.a.a();
        String d11 = a11.d(atd.i0.b.a(w11.getAffineX()));
        String d12 = a11.d(atd.i0.b.a(w11.getAffineY()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(atd.s0.a.a(-797758774372928L), atd.s0.a.a(-797775954242112L));
            jSONObject.put(atd.s0.a.a(-797797429078592L), this.f6862b.a());
            jSONObject.put(atd.s0.a.a(-797814608947776L), d11);
            jSONObject.put(atd.s0.a.a(-797806019013184L), d12);
            return jSONObject;
        } catch (JSONException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(JSONObject jSONObject) {
        super(jSONObject);
        atd.r0.a a11 = atd.r0.a.a();
        BigInteger a12 = atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-797707234765376L))));
        BigInteger a13 = atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-797698644830784L))));
        BigInteger a14 = jSONObject.has(atd.s0.a.a(-797724414634560L)) ? atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-797715824699968L)))) : null;
        atd.i0.d a15 = atd.i0.d.a(jSONObject.getString(atd.s0.a.a(-797741594503744L)));
        this.f6862b = a15;
        this.f6863c = atd.i0.e.a(a15, a12, a13);
        this.f6864d = a14 != null ? atd.i0.e.a(a15, a14) : null;
    }

    public byte[] a(String str, String str2, String str3, ECPublicKey eCPublicKey) {
        byte[] a11 = atd.i0.e.a(eCPublicKey, this.f6864d);
        return atd.i0.c.a(a11, a11.length * 8, str, str2, str3);
    }
}