package i70;

import org.bouncycastle.asn1.q0;
import org.bouncycastle.crypto.p;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
class g {
    /* JADX INFO: Access modifiers changed from: package-private */
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
    public static p b(e50.b bVar) {
        if (bVar.e().j(v40.b.f54051f)) {
            return z50.a.b();
        }
        if (bVar.e().j(r40.b.f49147f)) {
            return z50.a.c();
        }
        if (bVar.e().j(r40.b.f49141c)) {
            return z50.a.d();
        }
        if (bVar.e().j(r40.b.f49143d)) {
            return z50.a.e();
        }
        if (bVar.e().j(r40.b.f49145e)) {
            return z50.a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + bVar.e());
    }
}