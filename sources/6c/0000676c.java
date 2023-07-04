package e60;

import e50.m0;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.w0;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class e implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private final List<PublicKey> f24868a;

    public e(PublicKey... publicKeyArr) {
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (int i11 = 0; i11 != publicKeyArr.length; i11++) {
            arrayList.add(publicKeyArr[i11]);
        }
        this.f24868a = Collections.unmodifiableList(arrayList);
    }

    public List<PublicKey> a() {
        return this.f24868a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f24868a.equals(((e) obj).f24868a);
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
        for (int i11 = 0; i11 != this.f24868a.size(); i11++) {
            dVar.a(m0.h(this.f24868a.get(i11).getEncoded()));
        }
        try {
            return new m0(new e50.b(q40.c.f47480z), new w0(dVar)).d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new IllegalStateException("unable to encode composite key: " + e11.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f24868a.hashCode();
    }
}