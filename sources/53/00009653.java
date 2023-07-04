package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.p;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import r70.m;
import v40.b;
import w40.n;
import z50.a;

/* loaded from: classes5.dex */
public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set shake128 = new HashSet();
    private static Set shake256 = new HashSet();
    private static Map oids = new HashMap();

    static {
        md5.add("MD5");
        Set set = md5;
        k kVar = n.Z1;
        set.add(kVar.t());
        sha1.add("SHA1");
        sha1.add(McElieceCCA2KeyGenParameterSpec.SHA1);
        Set set2 = sha1;
        k kVar2 = b.f54051f;
        set2.add(kVar2.t());
        sha224.add("SHA224");
        sha224.add(McElieceCCA2KeyGenParameterSpec.SHA224);
        Set set3 = sha224;
        k kVar3 = r40.b.f49147f;
        set3.add(kVar3.t());
        sha256.add("SHA256");
        sha256.add(McElieceCCA2KeyGenParameterSpec.SHA256);
        Set set4 = sha256;
        k kVar4 = r40.b.f49141c;
        set4.add(kVar4.t());
        sha384.add("SHA384");
        sha384.add(McElieceCCA2KeyGenParameterSpec.SHA384);
        Set set5 = sha384;
        k kVar5 = r40.b.f49143d;
        set5.add(kVar5.t());
        sha512.add("SHA512");
        sha512.add(McElieceCCA2KeyGenParameterSpec.SHA512);
        Set set6 = sha512;
        k kVar6 = r40.b.f49145e;
        set6.add(kVar6.t());
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        Set set7 = sha512_224;
        k kVar7 = r40.b.f49149g;
        set7.add(kVar7.t());
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        Set set8 = sha512_256;
        k kVar8 = r40.b.f49151h;
        set8.add(kVar8.t());
        sha3_224.add("SHA3-224");
        Set set9 = sha3_224;
        k kVar9 = r40.b.f49153i;
        set9.add(kVar9.t());
        sha3_256.add(SPHINCS256KeyGenParameterSpec.SHA3_256);
        Set set10 = sha3_256;
        k kVar10 = r40.b.f49154j;
        set10.add(kVar10.t());
        sha3_384.add("SHA3-384");
        Set set11 = sha3_384;
        k kVar11 = r40.b.f49155k;
        set11.add(kVar11.t());
        sha3_512.add("SHA3-512");
        Set set12 = sha3_512;
        k kVar12 = r40.b.f49156l;
        set12.add(kVar12.t());
        shake128.add("SHAKE128");
        Set set13 = shake128;
        k kVar13 = r40.b.f49157m;
        set13.add(kVar13.t());
        shake256.add("SHAKE256");
        Set set14 = shake256;
        k kVar14 = r40.b.f49158n;
        set14.add(kVar14.t());
        oids.put("MD5", kVar);
        oids.put(kVar.t(), kVar);
        oids.put("SHA1", kVar2);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA1, kVar2);
        oids.put(kVar2.t(), kVar2);
        oids.put("SHA224", kVar3);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA224, kVar3);
        oids.put(kVar3.t(), kVar3);
        oids.put("SHA256", kVar4);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA256, kVar4);
        oids.put(kVar4.t(), kVar4);
        oids.put("SHA384", kVar5);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA384, kVar5);
        oids.put(kVar5.t(), kVar5);
        oids.put("SHA512", kVar6);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA512, kVar6);
        oids.put(kVar6.t(), kVar6);
        oids.put("SHA512(224)", kVar7);
        oids.put("SHA-512(224)", kVar7);
        oids.put(kVar7.t(), kVar7);
        oids.put("SHA512(256)", kVar8);
        oids.put("SHA-512(256)", kVar8);
        oids.put(kVar8.t(), kVar8);
        oids.put("SHA3-224", kVar9);
        oids.put(kVar9.t(), kVar9);
        oids.put(SPHINCS256KeyGenParameterSpec.SHA3_256, kVar10);
        oids.put(kVar10.t(), kVar10);
        oids.put("SHA3-384", kVar11);
        oids.put(kVar11.t(), kVar11);
        oids.put("SHA3-512", kVar12);
        oids.put(kVar12.t(), kVar12);
        oids.put("SHAKE128", kVar13);
        oids.put(kVar13.t(), kVar13);
        oids.put("SHAKE256", kVar14);
        oids.put(kVar14.t(), kVar14);
    }

    public static p getDigest(String str) {
        String k11 = m.k(str);
        if (sha1.contains(k11)) {
            return a.b();
        }
        if (md5.contains(k11)) {
            return a.a();
        }
        if (sha224.contains(k11)) {
            return a.c();
        }
        if (sha256.contains(k11)) {
            return a.d();
        }
        if (sha384.contains(k11)) {
            return a.e();
        }
        if (sha512.contains(k11)) {
            return a.j();
        }
        if (sha512_224.contains(k11)) {
            return a.k();
        }
        if (sha512_256.contains(k11)) {
            return a.l();
        }
        if (sha3_224.contains(k11)) {
            return a.f();
        }
        if (sha3_256.contains(k11)) {
            return a.g();
        }
        if (sha3_384.contains(k11)) {
            return a.h();
        }
        if (sha3_512.contains(k11)) {
            return a.i();
        }
        if (shake128.contains(k11)) {
            return a.m();
        }
        if (shake256.contains(k11)) {
            return a.n();
        }
        return null;
    }

    public static k getOID(String str) {
        return (k) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        return (sha1.contains(str) && sha1.contains(str2)) || (sha224.contains(str) && sha224.contains(str2)) || ((sha256.contains(str) && sha256.contains(str2)) || ((sha384.contains(str) && sha384.contains(str2)) || ((sha512.contains(str) && sha512.contains(str2)) || ((sha512_224.contains(str) && sha512_224.contains(str2)) || ((sha512_256.contains(str) && sha512_256.contains(str2)) || ((sha3_224.contains(str) && sha3_224.contains(str2)) || ((sha3_256.contains(str) && sha3_256.contains(str2)) || ((sha3_384.contains(str) && sha3_384.contains(str2)) || ((sha3_512.contains(str) && sha3_512.contains(str2)) || (md5.contains(str) && md5.contains(str2)))))))))));
    }
}