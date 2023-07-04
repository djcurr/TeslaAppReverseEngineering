package i70;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.crypto.i;
import q70.h;
import w40.p;

/* loaded from: classes5.dex */
public class c implements i, PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private y60.f f30185a;

    public c(y60.f fVar) {
        this.f30185a = fVar;
    }

    public q70.b a() {
        return this.f30185a.b();
    }

    public q70.i b() {
        return this.f30185a.c();
    }

    public int c() {
        return this.f30185a.d();
    }

    public int d() {
        return this.f30185a.e();
    }

    public h e() {
        return this.f30185a.f();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return d() == cVar.d() && c() == cVar.c() && a().equals(cVar.a()) && b().equals(cVar.b()) && g().equals(cVar.g()) && e().equals(cVar.e()) && f().equals(cVar.f());
        }
        return false;
    }

    public h f() {
        return this.f30185a.g();
    }

    public q70.a g() {
        return this.f30185a.h();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new p(new e50.b(w60.e.f55680c), new w60.c(this.f30185a.e(), this.f30185a.d(), this.f30185a.b(), this.f30185a.c(), this.f30185a.f(), this.f30185a.g(), this.f30185a.h())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f30185a.d() * 37) + this.f30185a.e()) * 37) + this.f30185a.b().hashCode()) * 37) + this.f30185a.c().hashCode()) * 37) + this.f30185a.f().hashCode()) * 37) + this.f30185a.g().hashCode()) * 37) + this.f30185a.h().hashCode();
    }
}