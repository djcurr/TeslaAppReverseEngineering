package e60;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.w0;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class d implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private final List<PrivateKey> f24867a;

    public d(PrivateKey... privateKeyArr) {
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (int i11 = 0; i11 != privateKeyArr.length; i11++) {
            arrayList.add(privateKeyArr[i11]);
        }
        this.f24867a = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f24867a.equals(((d) obj).f24867a);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "Composite";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        for (int i11 = 0; i11 != this.f24867a.size(); i11++) {
            dVar.a(w40.p.f(this.f24867a.get(i11).getEncoded()));
        }
        try {
            return new w40.p(new e50.b(q40.c.f47480z), new w0(dVar)).d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new IllegalStateException("unable to encode composite key: " + e11.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f24867a.hashCode();
    }
}