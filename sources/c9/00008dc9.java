package o70;

import e50.m0;
import f70.z;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private transient z f42312a;

    /* renamed from: b  reason: collision with root package name */
    private transient k f42313b;

    public d(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        z zVar = (z) e70.c.a(m0Var);
        this.f42312a = zVar;
        this.f42313b = e.a(zVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f42313b.j(dVar.f42313b)) {
                    if (org.bouncycastle.util.a.c(this.f42312a.getEncoded(), dVar.f42312a.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.d.a(this.f42312a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return this.f42313b.hashCode() + (org.bouncycastle.util.a.F(this.f42312a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f42313b.hashCode();
        }
    }
}