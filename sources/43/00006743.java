package e50;

/* loaded from: classes5.dex */
public class l0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24724a;

    public l0(byte[] bArr) {
        this.f24724a = org.bouncycastle.util.a.h(bArr);
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f24724a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new org.bouncycastle.asn1.s0(e());
    }
}