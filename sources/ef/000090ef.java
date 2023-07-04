package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public abstract class o extends n {

    /* renamed from: a  reason: collision with root package name */
    protected final boolean f43070a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f43071b;

    /* renamed from: c  reason: collision with root package name */
    protected final byte[] f43072c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(boolean z11, int i11, byte[] bArr) {
        this.f43070a = z11;
        this.f43071b = i11;
        this.f43072c = org.bouncycastle.util.a.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            return this.f43070a == oVar.f43070a && this.f43071b == oVar.f43071b && org.bouncycastle.util.a.c(this.f43072c, oVar.f43072c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.m(z11, this.f43070a ? 224 : 192, this.f43071b, this.f43072c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.b(this.f43071b) + v1.a(this.f43072c.length) + this.f43072c.length;
    }

    @Override // e40.c
    public int hashCode() {
        boolean z11 = this.f43070a;
        return ((z11 ? 1 : 0) ^ this.f43071b) ^ org.bouncycastle.util.a.F(this.f43072c);
    }

    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return this.f43070a;
    }

    public int p() {
        return this.f43071b;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (m()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(p()));
        stringBuffer.append("]");
        if (this.f43072c != null) {
            stringBuffer.append(" #");
            str = org.bouncycastle.util.encoders.b.f(this.f43072c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}