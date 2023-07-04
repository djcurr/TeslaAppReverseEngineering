package o70;

import e50.m0;
import f70.t;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private transient k f42307a;

    /* renamed from: b  reason: collision with root package name */
    private transient t f42308b;

    public b(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        t tVar = (t) e70.c.a(m0Var);
        this.f42308b = tVar;
        this.f42307a = e.a(tVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f42307a.j(bVar.f42307a) && org.bouncycastle.util.a.c(this.f42308b.f(), bVar.f42308b.f());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.d.a(this.f42308b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f42307a.hashCode() + (org.bouncycastle.util.a.F(this.f42308b.f()) * 37);
    }
}