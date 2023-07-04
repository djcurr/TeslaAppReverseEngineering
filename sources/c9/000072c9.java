package h70;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.q;
import w40.p;
import x60.g;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a  reason: collision with root package name */
    private transient g f28970a;

    /* renamed from: b  reason: collision with root package name */
    private transient q f28971b;

    public a(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f28971b = pVar.e();
        this.f28970a = (g) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            try {
                return org.bouncycastle.util.a.c(this.f28970a.getEncoded(), ((a) obj).f28970a.getEncoded());
            } catch (IOException unused) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.b.a(this.f28970a, this.f28971b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.a.F(this.f28970a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}