package org.bouncycastle.asn1;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class e extends n {

    /* renamed from: c  reason: collision with root package name */
    private static e[] f43033c = new e[12];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43034a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43035b;

    public e(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f43034a = BigInteger.valueOf(i11).toByteArray();
        this.f43035b = 0;
    }

    public e(byte[] bArr) {
        if (i.y(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f43034a = org.bouncycastle.util.a.h(bArr);
        this.f43035b = i.B(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e p(byte[] bArr) {
        if (bArr.length > 1) {
            return new e(bArr);
        }
        if (bArr.length != 0) {
            int i11 = bArr[0] & 255;
            e[] eVarArr = f43033c;
            if (i11 >= eVarArr.length) {
                return new e(bArr);
            }
            e eVar = eVarArr[i11];
            if (eVar == null) {
                e eVar2 = new e(bArr);
                eVarArr[i11] = eVar2;
                return eVar2;
            }
            return eVar;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    public static e q(Object obj) {
        if (obj == null || (obj instanceof e)) {
            return (e) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (e) n.k((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    public static e r(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof e)) ? q(r11) : p(l.p(r11).r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof e) {
            return org.bouncycastle.util.a.c(this.f43034a, ((e) nVar).f43034a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 10, this.f43034a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43034a.length) + 1 + this.f43034a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43034a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public BigInteger s() {
        return new BigInteger(this.f43034a);
    }

    public int t() {
        byte[] bArr = this.f43034a;
        int length = bArr.length;
        int i11 = this.f43035b;
        if (length - i11 <= 4) {
            return i.w(bArr, i11, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }
}