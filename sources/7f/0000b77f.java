package u50;

/* loaded from: classes5.dex */
public class z extends c0 {

    /* renamed from: n  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f53323n;

    /* renamed from: o  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f53324o;

    /* renamed from: p  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f53325p;

    public z(y yVar, org.bouncycastle.asn1.k kVar, org.bouncycastle.asn1.k kVar2, org.bouncycastle.asn1.k kVar3) {
        super(kVar, yVar);
        if ((yVar instanceof c0) && !kVar.j(((c0) yVar).j())) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.f53323n = kVar;
        this.f53324o = kVar2;
        this.f53325p = kVar3;
    }

    public org.bouncycastle.asn1.k k() {
        return this.f53324o;
    }

    public org.bouncycastle.asn1.k l() {
        return this.f53325p;
    }

    public org.bouncycastle.asn1.k m() {
        return this.f53323n;
    }
}