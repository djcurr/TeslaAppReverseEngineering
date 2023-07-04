package e60;

import javax.crypto.SecretKey;
import org.bouncycastle.crypto.w;

/* loaded from: classes5.dex */
public class i implements SecretKey {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f24875a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24876b;

    public i(char[] cArr, boolean z11) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.f24875a = cArr2;
        this.f24876b = z11;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.f24876b && this.f24875a.length == 0) ? new byte[2] : w.PKCS12PasswordToBytes(this.f24875a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.f24875a;
    }
}