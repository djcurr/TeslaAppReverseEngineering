package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class c extends n {

    /* renamed from: b  reason: collision with root package name */
    public static final c f43023b = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final c f43024c = new c((byte) -1);

    /* renamed from: a  reason: collision with root package name */
    private final byte f43025a;

    private c(byte b11) {
        this.f43025a = b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c p(byte[] bArr) {
        if (bArr.length == 1) {
            byte b11 = bArr[0];
            return b11 != -1 ? b11 != 0 ? new c(b11) : f43023b : f43024c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static c q(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (c) n.k((byte[]) obj);
        } catch (IOException e11) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e11.getMessage());
        }
    }

    public static c r(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof c)) ? q(r11) : p(l.p(r11).r());
    }

    public static c s(boolean z11) {
        return z11 ? f43024c : f43023b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        return (nVar instanceof c) && t() == ((c) nVar).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.j(z11, 1, this.f43025a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return 3;
    }

    @Override // e40.c
    public int hashCode() {
        return t() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return t() ? f43024c : f43023b;
    }

    public boolean t() {
        return this.f43025a != 0;
    }

    public String toString() {
        return t() ? "TRUE" : "FALSE";
    }
}