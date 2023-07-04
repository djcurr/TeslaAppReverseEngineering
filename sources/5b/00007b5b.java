package j70;

import e50.m0;
import e70.d;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class b implements Key, PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private transient z60.b f33279a;

    public b(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        this.f33279a = (z60.b) e70.c.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return org.bouncycastle.util.a.c(this.f33279a.b(), ((b) obj).f33279a.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f33279a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f33279a.b());
    }
}