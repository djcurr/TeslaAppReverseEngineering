package f50;

import org.bouncycastle.asn1.s0;

/* loaded from: classes5.dex */
public class k extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f25877a;

    /* renamed from: b  reason: collision with root package name */
    private n60.e f25878b;

    /* renamed from: c  reason: collision with root package name */
    private n60.i f25879c;

    public k(n60.e eVar, org.bouncycastle.asn1.l lVar) {
        this(eVar, lVar.r());
    }

    public k(n60.e eVar, byte[] bArr) {
        this.f25878b = eVar;
        this.f25877a = new s0(org.bouncycastle.util.a.h(bArr));
    }

    public k(n60.i iVar, boolean z11) {
        this.f25879c = iVar.A();
        this.f25877a = new s0(iVar.l(z11));
    }

    public synchronized n60.i e() {
        if (this.f25879c == null) {
            this.f25879c = this.f25878b.j(this.f25877a.r()).A();
        }
        return this.f25879c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f25877a;
    }
}