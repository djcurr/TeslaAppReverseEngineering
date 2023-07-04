package e70;

import i50.a0;
import i50.c0;
import i50.x;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.crypto.p;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import r70.f;
import w60.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static final e50.b f24953a;

    /* renamed from: b  reason: collision with root package name */
    static final e50.b f24954b;

    /* renamed from: c  reason: collision with root package name */
    static final e50.b f24955c;

    /* renamed from: d  reason: collision with root package name */
    static final e50.b f24956d;

    /* renamed from: e  reason: collision with root package name */
    static final e50.b f24957e;

    /* renamed from: f  reason: collision with root package name */
    static final e50.b f24958f;

    /* renamed from: g  reason: collision with root package name */
    static final e50.b f24959g;

    /* renamed from: h  reason: collision with root package name */
    static final e50.b f24960h;

    /* renamed from: i  reason: collision with root package name */
    static final Map f24961i;

    static {
        k kVar = w60.e.f55694q;
        f24953a = new e50.b(kVar);
        k kVar2 = w60.e.f55695r;
        f24954b = new e50.b(kVar2);
        f24955c = new e50.b(r40.b.f49154j);
        f24956d = new e50.b(r40.b.f49151h);
        f24957e = new e50.b(r40.b.f49141c);
        f24958f = new e50.b(r40.b.f49145e);
        f24959g = new e50.b(r40.b.f49157m);
        f24960h = new e50.b(r40.b.f49158n);
        HashMap hashMap = new HashMap();
        f24961i = hashMap;
        hashMap.put(kVar, f.d(5));
        hashMap.put(kVar2, f.d(6));
    }

    public static e50.b a(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA1)) {
            return new e50.b(v40.b.f54051f, q0.f43085a);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
            return new e50.b(r40.b.f49147f);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA256)) {
            return new e50.b(r40.b.f49141c);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
            return new e50.b(r40.b.f49143d);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA512)) {
            return new e50.b(r40.b.f49145e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p b(k kVar) {
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

    public static String c(k kVar) {
        if (kVar.j(v40.b.f54051f)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (kVar.j(r40.b.f49147f)) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (kVar.j(r40.b.f49141c)) {
            return McElieceCCA2KeyGenParameterSpec.SHA256;
        }
        if (kVar.j(r40.b.f49143d)) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (kVar.j(r40.b.f49145e)) {
            return McElieceCCA2KeyGenParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e50.b d(int i11) {
        if (i11 != 5) {
            if (i11 == 6) {
                return f24954b;
            }
            throw new IllegalArgumentException("unknown security category: " + i11);
        }
        return f24953a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(e50.b bVar) {
        return ((Integer) f24961i.get(bVar.e())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e50.b f(String str) {
        if (str.equals(SPHINCS256KeyGenParameterSpec.SHA3_256)) {
            return f24955c;
        }
        if (str.equals("SHA-512/256")) {
            return f24956d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(h hVar) {
        e50.b f11 = hVar.f();
        if (f11.e().j(f24955c.e())) {
            return SPHINCS256KeyGenParameterSpec.SHA3_256;
        }
        if (f11.e().j(f24956d.e())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + f11.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e50.b h(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA256)) {
            return f24957e;
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA512)) {
            return f24958f;
        }
        if (str.equals("SHAKE128")) {
            return f24959g;
        }
        if (str.equals("SHAKE256")) {
            return f24960h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}