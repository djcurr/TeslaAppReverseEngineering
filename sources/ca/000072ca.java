package h70;

import e50.m0;
import e70.d;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import x60.g;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a  reason: collision with root package name */
    private transient g f28972a;

    public b(m0 m0Var) {
        a(m0Var);
    }

    private void a(m0 m0Var) {
        this.f28972a = (g) e70.c.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return org.bouncycastle.util.a.c(this.f28972a.getEncoded(), ((b) obj).f28972a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f28972a).getEncoded();
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
            return org.bouncycastle.util.a.F(this.f28972a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}