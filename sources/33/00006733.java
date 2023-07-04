package e50;

/* loaded from: classes5.dex */
public class d0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.j0 f24677a;

    private d0(org.bouncycastle.asn1.j0 j0Var) {
        this.f24677a = j0Var;
    }

    public static d0 e(Object obj) {
        if (obj instanceof d0) {
            return (d0) obj;
        }
        if (obj != null) {
            return new d0(org.bouncycastle.asn1.j0.v(obj));
        }
        return null;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24677a;
    }

    public String toString() {
        StringBuilder sb2;
        int i11;
        byte[] q11 = this.f24677a.q();
        if (q11.length == 1) {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i11 = q11[0] & 255;
        } else {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i11 = (q11[0] & 255) | ((q11[1] & 255) << 8);
        }
        sb2.append(Integer.toHexString(i11));
        return sb2.toString();
    }
}