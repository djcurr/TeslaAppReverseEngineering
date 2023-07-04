package j70;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.q;
import w40.p;

/* loaded from: classes5.dex */
public class a implements Key, PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private transient z60.a f33277a;

    /* renamed from: b  reason: collision with root package name */
    private transient q f33278b;

    public a(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f33278b = pVar.e();
        this.f33277a = (z60.a) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return org.bouncycastle.util.a.f(this.f33277a.b(), ((a) obj).f33277a.b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.b.a(this.f33277a, this.f33278b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return org.bouncycastle.util.a.L(this.f33277a.b());
    }
}