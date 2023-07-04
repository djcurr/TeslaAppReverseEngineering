package h60;

import java.security.spec.EncodedKeySpec;

/* loaded from: classes5.dex */
public class m extends EncodedKeySpec {

    /* renamed from: a  reason: collision with root package name */
    private final String f28952a;

    public m(byte[] bArr) {
        super(bArr);
        String str;
        if (bArr[0] == 48) {
            str = "ASN.1";
        } else if (bArr[0] != 111) {
            throw new IllegalArgumentException("unknown byte encoding");
        } else {
            str = "OpenSSH";
        }
        this.f28952a = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f28952a;
    }
}