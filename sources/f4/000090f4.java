package org.bouncycastle.asn1;

import java.util.Objects;

/* loaded from: classes5.dex */
public class p0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43077a;

    public p0(String str) {
        this(str, false);
    }

    public p0(String str, boolean z11) {
        Objects.requireNonNull(str, "'string' cannot be null");
        if (z11 && !r(str)) {
            throw new IllegalArgumentException("'string' contains illegal characters");
        }
        this.f43077a = r70.m.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(byte[] bArr) {
        this.f43077a = bArr;
    }

    public static p0 p(Object obj) {
        if (obj == null || (obj instanceof p0)) {
            return (p0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (p0) n.k((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    public static p0 q(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof p0)) ? p(r11) : new p0(l.p(r11).r());
    }

    public static boolean r(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof p0) {
            return org.bouncycastle.util.a.c(this.f43077a, ((p0) nVar).f43077a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 22, this.f43077a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43077a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43077a.length) + 1 + this.f43077a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43077a);
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