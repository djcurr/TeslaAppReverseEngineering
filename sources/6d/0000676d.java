package e60;

import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public class f implements SecretKey {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f24869a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.crypto.g f24870b;

    public f(char[] cArr, org.bouncycastle.crypto.g gVar) {
        char[] cArr2 = new char[cArr.length];
        this.f24869a = cArr2;
        this.f24870b = gVar;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f24870b.convert(this.f24869a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f24870b.getType();
    }

    public char[] getPassword() {
        return this.f24869a;
    }
}