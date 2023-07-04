package k70;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.q;
import w40.p;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private transient a70.a f34478a;

    /* renamed from: b  reason: collision with root package name */
    private transient q f34479b;

    public a(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f34479b = pVar.e();
        this.f34478a = (a70.a) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f34478a.c() == aVar.f34478a.c() && org.bouncycastle.util.a.c(this.f34478a.b(), aVar.f34478a.b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return a70.c.a(this.f34478a.c());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.b.a(this.f34478a, this.f34479b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f34478a.c() + (org.bouncycastle.util.a.F(this.f34478a.b()) * 37);
    }
}