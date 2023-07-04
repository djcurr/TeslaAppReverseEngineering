package u40;

import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class c extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    private int f53143a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f53144b;

    public c() {
        this.f53143a = 0;
        this.f53144b = q0.f43085a;
    }

    private c(s sVar) {
        e40.b bVar;
        this.f53143a = sVar.s();
        int s11 = sVar.s();
        if (s11 != 0) {
            if (s11 == 1) {
                bVar = l.f(sVar, false);
                this.f53144b = bVar;
            } else if (s11 != 2) {
                throw new IllegalArgumentException("Unknown tag encountered: " + sVar.s());
            }
        }
        bVar = q0.f43085a;
        this.f53144b = bVar;
    }

    public static c e(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof s) {
            return new c((s) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public e40.b f() {
        return this.f53144b;
    }

    public int h() {
        return this.f53143a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new z0(false, this.f53143a, this.f53144b);
    }
}