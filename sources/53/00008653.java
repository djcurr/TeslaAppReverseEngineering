package m70;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s0;
import w40.p;
import w60.e;
import w60.h;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a  reason: collision with root package name */
    private transient k f38439a;

    /* renamed from: b  reason: collision with root package name */
    private transient d70.b f38440b;

    /* renamed from: c  reason: collision with root package name */
    private transient q f38441c;

    public a(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f38441c = pVar.e();
        this.f38439a = h.e(pVar.i().i()).f().e();
        this.f38440b = (d70.b) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f38439a.j(aVar.f38439a) && org.bouncycastle.util.a.c(this.f38440b.c(), aVar.f38440b.c());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f38440b.b() != null ? e70.b.a(this.f38440b, this.f38441c) : new p(new e50.b(e.f55682e, new h(new e50.b(this.f38439a))), new s0(this.f38440b.c()), this.f38441c)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f38439a.hashCode() + (org.bouncycastle.util.a.F(this.f38440b.c()) * 37);
    }
}