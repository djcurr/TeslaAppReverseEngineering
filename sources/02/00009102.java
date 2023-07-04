package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t1 extends p {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f43105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(byte[] bArr) {
        this.f43105b = bArr;
    }

    private void u() {
        if (this.f43105b != null) {
            d dVar = new d();
            s1 s1Var = new s1(this.f43105b);
            while (s1Var.hasMoreElements()) {
                dVar.a((n) s1Var.nextElement());
            }
            this.f43074a = dVar.g();
            this.f43105b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public synchronized void f(m mVar, boolean z11) {
        byte[] bArr = this.f43105b;
        if (bArr != null) {
            mVar.n(z11, 48, bArr);
        } else {
            super.o().f(mVar, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public synchronized int h() {
        byte[] bArr = this.f43105b;
        if (bArr != null) {
            return v1.a(bArr.length) + 1 + this.f43105b.length;
        }
        return super.o().h();
    }

    @Override // org.bouncycastle.asn1.p, e40.c
    public synchronized int hashCode() {
        u();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.p, java.lang.Iterable
    public synchronized Iterator<e40.b> iterator() {
        u();
        return super.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public synchronized n n() {
        u();
        return super.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public synchronized n o() {
        u();
        return super.o();
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized e40.b r(int i11) {
        u();
        return super.r(i11);
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized Enumeration s() {
        byte[] bArr = this.f43105b;
        if (bArr != null) {
            return new s1(bArr);
        }
        return super.s();
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized int size() {
        u();
        return super.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p
    public e40.b[] t() {
        u();
        return super.t();
    }
}