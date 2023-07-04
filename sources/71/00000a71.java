package atd.d0;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c extends d {
    static {
        atd.s0.a.a(-799712984492608L);
    }

    @Override // atd.b0.a
    public String a() {
        return atd.s0.a.a(-799644265015872L);
    }

    @Override // atd.d0.f
    public atd.c0.d a(atd.f0.f fVar, atd.g0.b bVar) {
        atd.g0.b.a(bVar, atd.g0.a.class);
        atd.c0.b e11 = fVar.e();
        atd.g0.a aVar = new atd.g0.a(null, atd.i0.d.P256);
        ECPublicKey f11 = ((atd.g0.a) bVar).f();
        ECPrivateKey d11 = aVar.d();
        JSONObject d12 = fVar.d();
        return a(e11, d12.optString(atd.s0.a.a(-799678624754240L), null), d12.optString(atd.s0.a.a(-799695804623424L), null), f11, d11);
    }

    public atd.c0.d a(atd.c0.b bVar, String str, String str2, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        return new atd.c0.d(atd.i0.c.a(atd.i0.e.a(eCPublicKey, eCPrivateKey), bVar.f(), bVar.a(), str, str2), bVar);
    }
}