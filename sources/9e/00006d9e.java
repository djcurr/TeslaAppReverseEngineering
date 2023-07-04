package f70;

import i50.c0;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, org.bouncycastle.asn1.k> f25945a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<org.bouncycastle.asn1.k, String> f25946b = new HashMap();

    static {
        Map<String, org.bouncycastle.asn1.k> map = f25945a;
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        map.put(McElieceCCA2KeyGenParameterSpec.SHA256, kVar);
        Map<String, org.bouncycastle.asn1.k> map2 = f25945a;
        org.bouncycastle.asn1.k kVar2 = r40.b.f49145e;
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA512, kVar2);
        Map<String, org.bouncycastle.asn1.k> map3 = f25945a;
        org.bouncycastle.asn1.k kVar3 = r40.b.f49157m;
        map3.put("SHAKE128", kVar3);
        Map<String, org.bouncycastle.asn1.k> map4 = f25945a;
        org.bouncycastle.asn1.k kVar4 = r40.b.f49158n;
        map4.put("SHAKE256", kVar4);
        f25946b.put(kVar, McElieceCCA2KeyGenParameterSpec.SHA256);
        f25946b.put(kVar2, McElieceCCA2KeyGenParameterSpec.SHA512);
        f25946b.put(kVar3, "SHAKE128");
        f25946b.put(kVar4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static org.bouncycastle.crypto.p a(org.bouncycastle.asn1.k kVar) {
        if (kVar.j(r40.b.f49141c)) {
            return new i50.x();
        }
        if (kVar.j(r40.b.f49145e)) {
            return new i50.a0();
        }
        if (kVar.j(r40.b.f49157m)) {
            return new c0(128);
        }
        if (kVar.j(r40.b.f49158n)) {
            return new c0(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(org.bouncycastle.asn1.k kVar) {
        String str = f25946b.get(kVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static org.bouncycastle.asn1.k c(String str) {
        org.bouncycastle.asn1.k kVar = f25945a.get(str);
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}