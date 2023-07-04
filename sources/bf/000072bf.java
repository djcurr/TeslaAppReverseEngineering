package h60;

import java.security.spec.EncodedKeySpec;

/* loaded from: classes5.dex */
public class n extends EncodedKeySpec {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f28953b = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* renamed from: a  reason: collision with root package name */
    private final String f28954a;

    public n(byte[] bArr) {
        super(bArr);
        int i11 = 0;
        int i12 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i12 >= bArr.length) {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        String b11 = r70.m.b(org.bouncycastle.util.a.w(bArr, 4, i12));
        this.f28954a = b11;
        if (b11.startsWith("ecdsa")) {
            return;
        }
        while (true) {
            String[] strArr = f28953b;
            if (i11 >= strArr.length) {
                throw new IllegalArgumentException("unrecognised public key type " + this.f28954a);
            } else if (strArr[i11].equals(this.f28954a)) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }
}