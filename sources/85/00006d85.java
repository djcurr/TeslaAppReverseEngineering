package f50;

/* loaded from: classes5.dex */
public class g extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.n f25865a;

    public g(i iVar) {
        this.f25865a = null;
        this.f25865a = iVar.toASN1Primitive();
    }

    public g(org.bouncycastle.asn1.j jVar) {
        this.f25865a = null;
        this.f25865a = jVar;
    }

    public g(org.bouncycastle.asn1.k kVar) {
        this.f25865a = null;
        this.f25865a = kVar;
    }

    private g(org.bouncycastle.asn1.n nVar) {
        this.f25865a = null;
        this.f25865a = nVar;
    }

    public static g e(Object obj) {
        if (obj == null || (obj instanceof g)) {
            return (g) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.n) {
            return new g((org.bouncycastle.asn1.n) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new g(org.bouncycastle.asn1.n.k((byte[]) obj));
            } catch (Exception e11) {
                throw new IllegalArgumentException("unable to parse encoded data: " + e11.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance()");
    }

    public org.bouncycastle.asn1.n f() {
        return this.f25865a;
    }

    public boolean h() {
        return this.f25865a instanceof org.bouncycastle.asn1.j;
    }

    public boolean i() {
        return this.f25865a instanceof org.bouncycastle.asn1.k;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f25865a;
    }
}