package a50;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class d extends e40.c {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f248d = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* renamed from: a  reason: collision with root package name */
    private k f249a;

    /* renamed from: b  reason: collision with root package name */
    private b f250b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f251c = f248d;

    public d(b bVar) {
        this.f250b = bVar;
    }

    public d(k kVar) {
        this.f249a = kVar;
    }

    public static byte[] f() {
        return org.bouncycastle.util.a.h(f248d);
    }

    public static d i(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            p p11 = p.p(obj);
            d dVar = p11.r(0) instanceof k ? new d(k.u(p11.r(0))) : new d(b.j(p11.r(0)));
            if (p11.size() == 2) {
                byte[] r11 = l.p(p11.r(1)).r();
                dVar.f251c = r11;
                if (r11.length != f248d.length) {
                    throw new IllegalArgumentException("object parse error");
                }
            }
            return dVar;
        }
        throw new IllegalArgumentException("object parse error");
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f251c);
    }

    public b h() {
        return this.f250b;
    }

    public k j() {
        return this.f249a;
    }

    public boolean k() {
        return this.f249a != null;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        e40.b bVar = this.f249a;
        if (bVar == null) {
            bVar = this.f250b;
        }
        dVar.a(bVar);
        if (!org.bouncycastle.util.a.c(this.f251c, f248d)) {
            dVar.a(new s0(this.f251c));
        }
        return new w0(dVar);
    }
}