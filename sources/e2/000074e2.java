package i70;

import e50.m0;
import java.io.IOException;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private y60.g f30186a;

    public d(y60.g gVar) {
        this.f30186a = gVar;
    }

    public q70.a a() {
        return this.f30186a.b();
    }

    public int b() {
        return this.f30186a.c();
    }

    public int c() {
        return this.f30186a.d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f30186a.c() == dVar.b() && this.f30186a.d() == dVar.c() && this.f30186a.b().equals(dVar.a());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new m0(new e50.b(w60.e.f55680c), new w60.d(this.f30186a.c(), this.f30186a.d(), this.f30186a.b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f30186a.c() + (this.f30186a.d() * 37)) * 37) + this.f30186a.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f30186a.c() + "\n") + " error correction capability: " + this.f30186a.d() + "\n") + " generator matrix           : " + this.f30186a.b();
    }
}