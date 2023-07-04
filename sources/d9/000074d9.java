package i60;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import w40.n;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Map<k, String> f30171a;

    static {
        HashMap hashMap = new HashMap();
        f30171a = hashMap;
        hashMap.put(n.X1, "MD2");
        f30171a.put(n.Y1, "MD4");
        f30171a.put(n.Z1, "MD5");
        f30171a.put(v40.b.f54051f, McElieceCCA2KeyGenParameterSpec.SHA1);
        f30171a.put(r40.b.f49147f, McElieceCCA2KeyGenParameterSpec.SHA224);
        f30171a.put(r40.b.f49141c, McElieceCCA2KeyGenParameterSpec.SHA256);
        f30171a.put(r40.b.f49143d, McElieceCCA2KeyGenParameterSpec.SHA384);
        f30171a.put(r40.b.f49145e, McElieceCCA2KeyGenParameterSpec.SHA512);
        f30171a.put(r40.b.f49149g, "SHA-512(224)");
        f30171a.put(r40.b.f49151h, "SHA-512(256)");
        f30171a.put(z40.b.f60194c, "RIPEMD-128");
        f30171a.put(z40.b.f60193b, "RIPEMD-160");
        f30171a.put(z40.b.f60195d, "RIPEMD-128");
        f30171a.put(o40.a.f42271d, "RIPEMD-128");
        f30171a.put(o40.a.f42270c, "RIPEMD-160");
        f30171a.put(i40.a.f29839b, "GOST3411");
        f30171a.put(l40.a.f36576a, "Tiger");
        f30171a.put(o40.a.f42272e, "Whirlpool");
        f30171a.put(r40.b.f49153i, "SHA3-224");
        f30171a.put(r40.b.f49154j, SPHINCS256KeyGenParameterSpec.SHA3_256);
        f30171a.put(r40.b.f49155k, "SHA3-384");
        f30171a.put(r40.b.f49156l, "SHA3-512");
        f30171a.put(r40.b.f49157m, "SHAKE128");
        f30171a.put(r40.b.f49158n, "SHAKE256");
        f30171a.put(k40.b.f34376p, "SM3");
    }

    public static String a(k kVar) {
        String str = f30171a.get(kVar);
        return str != null ? str : kVar.t();
    }
}