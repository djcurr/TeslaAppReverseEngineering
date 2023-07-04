package o70;

import org.bouncycastle.asn1.k;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA256)) {
            return r40.b.f49141c;
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA512)) {
            return r40.b.f49145e;
        }
        if (str.equals("SHAKE128")) {
            return r40.b.f49157m;
        }
        if (str.equals("SHAKE256")) {
            return r40.b.f49158n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}