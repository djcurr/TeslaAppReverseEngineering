package org.spongycastle.cert.cmp;

import org.spongycastle.asn1.cmp.CertConfirmContent;
import org.spongycastle.asn1.cmp.CertStatus;
import org.spongycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: classes5.dex */
public class CertificateConfirmationContent {
    private CertConfirmContent content;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateConfirmationContent(CertConfirmContent certConfirmContent) {
        this(certConfirmContent, new DefaultDigestAlgorithmIdentifierFinder());
    }

    public CertificateStatus[] getStatusMessages() {
        CertStatus[] certStatusArray = this.content.toCertStatusArray();
        int length = certStatusArray.length;
        CertificateStatus[] certificateStatusArr = new CertificateStatus[length];
        for (int i11 = 0; i11 != length; i11++) {
            certificateStatusArr[i11] = new CertificateStatus(this.digestAlgFinder, certStatusArray[i11]);
        }
        return certificateStatusArr;
    }

    public CertConfirmContent toASN1Structure() {
        return this.content;
    }

    public CertificateConfirmationContent(CertConfirmContent certConfirmContent, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
        this.content = certConfirmContent;
    }
}