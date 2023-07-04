package i70;

import e50.m0;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.crypto.i;

/* loaded from: classes5.dex */
public class b implements i, PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private y60.c f30184a;

    public b(y60.c cVar) {
        this.f30184a = cVar;
    }

    public q70.a a() {
        return this.f30184a.c();
    }

    public int b() {
        return this.f30184a.d();
    }

    public int c() {
        return this.f30184a.e();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30184a.d() == bVar.b() && this.f30184a.e() == bVar.c() && this.f30184a.c().equals(bVar.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new m0(new e50.b(w60.e.f55681d), new w60.b(this.f30184a.d(), this.f30184a.e(), this.f30184a.c(), g.a(this.f30184a.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f30184a.d() + (this.f30184a.e() * 37)) * 37) + this.f30184a.c().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f30184a.d() + "\n") + " error correction capability: " + this.f30184a.e() + "\n") + " generator matrix           : " + this.f30184a.c().toString();
    }
}