package m70;

import e50.m0;
import e70.d;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;
import w60.e;
import w60.h;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a  reason: collision with root package name */
    private transient k f38442a;

    /* renamed from: b  reason: collision with root package name */
    private transient d70.c f38443b;

    public b(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        this.f38442a = h.e(m0Var.e().i()).f().e();
        this.f38443b = (d70.c) e70.c.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f38442a.j(bVar.f38442a) && org.bouncycastle.util.a.c(this.f38443b.c(), bVar.f38443b.c());
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
            return (this.f38443b.b() != null ? d.a(this.f38443b) : new m0(new e50.b(e.f55682e, new h(new e50.b(this.f38442a))), this.f38443b.c())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f38442a.hashCode() + (org.bouncycastle.util.a.F(this.f38443b.c()) * 37);
    }
}