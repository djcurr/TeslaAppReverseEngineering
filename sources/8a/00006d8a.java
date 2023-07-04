package f50;

import org.bouncycastle.asn1.s0;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: b  reason: collision with root package name */
    private static n f25880b = new n();

    /* renamed from: a  reason: collision with root package name */
    protected n60.f f25881a;

    public l(n60.f fVar) {
        this.f25881a = fVar;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new s0(f25880b.c(this.f25881a.t(), f25880b.b(this.f25881a)));
    }
}