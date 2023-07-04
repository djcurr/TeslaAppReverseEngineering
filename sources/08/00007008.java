package g40;

import java.io.IOException;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class i extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f27757a;

    /* renamed from: b  reason: collision with root package name */
    private final e40.c f27758b;

    private i(e40.b bVar) {
        e40.c e11;
        if ((bVar instanceof p) || (bVar instanceof j)) {
            this.f27757a = 0;
            e11 = j.e(bVar);
        } else if (!(bVar instanceof s)) {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        } else {
            this.f27757a = 1;
            e11 = l.f(((s) bVar).r());
        }
        this.f27758b = e11;
    }

    public i(j jVar) {
        this((e40.b) jVar);
    }

    public i(l lVar) {
        this(new z0(0, lVar));
    }

    public static i e(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new i(n.k((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unable to parse integrity check details.");
            }
        } else if (obj != null) {
            return new i((e40.b) obj);
        } else {
            return null;
        }
    }

    public e40.c f() {
        return this.f27758b;
    }

    public int h() {
        return this.f27757a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        e40.c cVar = this.f27758b;
        return cVar instanceof l ? new z0(0, cVar) : cVar.toASN1Primitive();
    }
}