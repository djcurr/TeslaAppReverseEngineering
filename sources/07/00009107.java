package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class v0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43110a;

    public v0(String str) {
        this(str, false);
    }

    public v0(String str, boolean z11) {
        if (z11 && !p(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.f43110a = r70.m.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(byte[] bArr) {
        this.f43110a = bArr;
    }

    public static boolean p(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                continue;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof v0) {
            return org.bouncycastle.util.a.c(this.f43110a, ((v0) nVar).f43110a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 19, this.f43110a);
    }

    @Override // e40.g
    public String getString() {
        return r70.m.b(this.f43110a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43110a.length) + 1 + this.f43110a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43110a);
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