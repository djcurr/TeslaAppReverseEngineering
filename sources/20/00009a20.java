package org.spongycastle.cert.dane;

import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.util.Arrays;

/* loaded from: classes5.dex */
public class DANEEntry {
    static final int CERT_USAGE = 0;
    public static final int CERT_USAGE_ACCEPT = 3;
    public static final int CERT_USAGE_CA = 0;
    public static final int CERT_USAGE_PKIX_VALIDATE = 1;
    public static final int CERT_USAGE_TRUST_ANCHOR = 2;
    static final int MATCHING_TYPE = 2;
    static final int SELECTOR = 1;
    private final X509CertificateHolder certHolder;
    private final String domainName;
    private final byte[] flags;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DANEEntry(String str, byte[] bArr, X509CertificateHolder x509CertificateHolder) {
        this.flags = bArr;
        this.domainName = str;
        this.certHolder = x509CertificateHolder;
    }

    public static boolean isValidCertificate(byte[] bArr) {
        return (bArr[0] >= 0 || bArr[0] <= 3) && bArr[1] == 0 && bArr[2] == 0;
    }

    public X509CertificateHolder getCertificate() {
        return this.certHolder;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public byte[] getFlags() {
        return Arrays.clone(this.flags);
    }

    public byte[] getRDATA() {
        byte[] encoded = this.certHolder.getEncoded();
        byte[] bArr = this.flags;
        byte[] bArr2 = new byte[bArr.length + encoded.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(encoded, 0, bArr2, this.flags.length, encoded.length);
        return bArr2;
    }

    public DANEEntry(String str, byte[] bArr) {
        this(str, Arrays.copyOfRange(bArr, 0, 3), new X509CertificateHolder(Arrays.copyOfRange(bArr, 3, bArr.length)));
    }
}