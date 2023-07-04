package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class a1 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43017a;

    public a1(String str) {
        this.f43017a = r70.m.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(byte[] bArr) {
        this.f43017a = bArr;
    }

    public static a1 p(Object obj) {
        if (obj == null || (obj instanceof a1)) {
            return (a1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (a1) n.k((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof a1) {
            return org.bouncycastle.util.a.c(this.f43017a, ((a1) nVar).f43017a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 12, this.f43017a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.c(this.f43017a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43017a.length) + 1 + this.f43017a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43017a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public String toString() {
        return getString();
    }
}