package w60;

import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f55727a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f55728b;

    public l(byte[] bArr, byte[] bArr2) {
        this.f55727a = org.bouncycastle.util.a.h(bArr);
        this.f55728b = org.bouncycastle.util.a.h(bArr2);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(0L));
        dVar.a(new s0(this.f55727a));
        dVar.a(new s0(this.f55728b));
        return new w0(dVar);
    }
}