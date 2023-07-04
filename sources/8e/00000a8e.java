package atd.g0;

import atd.f0.f;
import atd.i0.g;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    private final RSAPublicKey f6866b;

    /* renamed from: c  reason: collision with root package name */
    private final RSAPrivateKey f6867c;

    static {
        atd.s0.a.a(-798080896920128L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(JSONObject jSONObject) {
        super(jSONObject);
        atd.r0.a a11 = atd.r0.a.a();
        BigInteger a12 = atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-797977817705024L))));
        BigInteger a13 = atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-798003587508800L))));
        BigInteger a14 = jSONObject.has(atd.s0.a.a(-797994997574208L)) ? atd.i0.b.a(a11.a(jSONObject.getString(atd.s0.a.a(-798020767377984L)))) : null;
        this.f6866b = g.b(a12, a13);
        this.f6867c = a14 != null ? g.a(a12, a14) : null;
    }

    @Override // atd.f0.b
    public atd.f0.a a() {
        JSONObject jSONObject = new JSONObject();
        String b11 = b();
        if (b11 != null && !b11.isEmpty()) {
            jSONObject.put(atd.s0.a.a(-798063717050944L), b11);
        }
        f fVar = new f(atd.d0.g.f6846c, atd.c0.c.f6781a, jSONObject);
        return new atd.f0.a(fVar, fVar.f().a(fVar, this), this);
    }

    @Override // atd.g0.c
    /* renamed from: e */
    public RSAPrivateKey d() {
        return this.f6867c;
    }

    public RSAPublicKey f() {
        return this.f6866b;
    }
}