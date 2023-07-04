package k70;

import e50.m0;
import e70.d;
import java.io.IOException;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private transient a70.b f34480a;

    public b(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        this.f34480a = (a70.b) e70.c.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f34480a.c() == bVar.f34480a.c() && org.bouncycastle.util.a.c(this.f34480a.b(), bVar.f34480a.b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return a70.c.a(this.f34480a.c());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f34480a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f34480a.c() + (org.bouncycastle.util.a.F(this.f34480a.b()) * 37);
    }
}