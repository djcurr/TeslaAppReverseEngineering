package x60;

import i50.a0;
import i50.c0;
import i50.x;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.p;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, org.bouncycastle.asn1.k> f57136a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<org.bouncycastle.asn1.k, String> f57137b = new HashMap();

    static {
        Map<String, org.bouncycastle.asn1.k> map = f57136a;
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        map.put(McElieceCCA2KeyGenParameterSpec.SHA256, kVar);
        Map<String, org.bouncycastle.asn1.k> map2 = f57136a;
        org.bouncycastle.asn1.k kVar2 = r40.b.f49145e;
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA512, kVar2);
        Map<String, org.bouncycastle.asn1.k> map3 = f57136a;
        org.bouncycastle.asn1.k kVar3 = r40.b.f49157m;
        map3.put("SHAKE128", kVar3);
        Map<String, org.bouncycastle.asn1.k> map4 = f57136a;
        org.bouncycastle.asn1.k kVar4 = r40.b.f49158n;
        map4.put("SHAKE256", kVar4);
        f57137b.put(kVar, McElieceCCA2KeyGenParameterSpec.SHA256);
        f57137b.put(kVar2, McElieceCCA2KeyGenParameterSpec.SHA512);
        f57137b.put(kVar3, "SHAKE128");
        f57137b.put(kVar4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p a(org.bouncycastle.asn1.k kVar) {
        if (kVar.j(r40.b.f49141c)) {
            return new x();
        }
        if (kVar.j(r40.b.f49145e)) {
            return new a0();
        }
        if (kVar.j(r40.b.f49157m)) {
            return new c0(128);
        }
        if (kVar.j(r40.b.f49158n)) {
            return new c0(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + kVar);
    }
}