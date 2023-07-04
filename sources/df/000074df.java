package i70;

import java.io.IOException;
import java.security.PrivateKey;
import q70.h;
import q70.i;
import w40.p;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private y60.b f30183a;

    public a(y60.b bVar) {
        this.f30183a = bVar;
    }

    public q70.b a() {
        return this.f30183a.c();
    }

    public i b() {
        return this.f30183a.d();
    }

    public q70.a c() {
        return this.f30183a.e();
    }

    public int d() {
        return this.f30183a.f();
    }

    public int e() {
        return this.f30183a.g();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e() == aVar.e() && d() == aVar.d() && a().equals(aVar.a()) && b().equals(aVar.b()) && f().equals(aVar.f()) && c().equals(aVar.c());
    }

    public h f() {
        return this.f30183a.h();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new p(new e50.b(w60.e.f55681d), new w60.a(e(), d(), a(), b(), f(), g.a(this.f30183a.b()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f30183a.f() * 37) + this.f30183a.g()) * 37) + this.f30183a.c().hashCode()) * 37) + this.f30183a.d().hashCode()) * 37) + this.f30183a.h().hashCode()) * 37) + this.f30183a.e().hashCode();
    }
}