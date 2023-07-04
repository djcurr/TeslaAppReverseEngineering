package e60;

import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public class h implements SecretKey {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f24873a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.crypto.g f24874b;

    public h(char[] cArr, org.bouncycastle.crypto.g gVar) {
        this.f24873a = org.bouncycastle.util.a.j(cArr);
        this.f24874b = gVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f24874b.convert(this.f24873a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f24874b.getType();
    }
}