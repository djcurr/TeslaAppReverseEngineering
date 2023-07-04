package o70;

import f70.y;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import w40.p;
import w60.i;

/* loaded from: classes5.dex */
public class c implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private transient y f42309a;

    /* renamed from: b  reason: collision with root package name */
    private transient k f42310b;

    /* renamed from: c  reason: collision with root package name */
    private transient q f42311c;

    public c(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f42311c = pVar.e();
        this.f42310b = i.f(pVar.i().i()).h().e();
        this.f42309a = (y) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f42310b.j(cVar.f42310b) && org.bouncycastle.util.a.c(this.f42309a.d(), cVar.f42309a.d());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.b.a(this.f42309a, this.f42311c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f42310b.hashCode() + (org.bouncycastle.util.a.F(this.f42309a.d()) * 37);
    }
}