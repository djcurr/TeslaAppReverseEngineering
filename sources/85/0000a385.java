package org.spongycastle.pkcs;

import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.cms.CMSEncryptedData;
import org.spongycastle.cms.CMSException;
import org.spongycastle.operator.InputDecryptorProvider;

/* loaded from: classes4.dex */
public class PKCS12SafeBagFactory {
    private ASN1Sequence safeBagSeq;

    public PKCS12SafeBagFactory(ContentInfo contentInfo) {
        if (!contentInfo.getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
            this.safeBagSeq = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
            return;
        }
        throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
    }

    public PKCS12SafeBag[] getSafeBags() {
        PKCS12SafeBag[] pKCS12SafeBagArr = new PKCS12SafeBag[this.safeBagSeq.size()];
        for (int i11 = 0; i11 != this.safeBagSeq.size(); i11++) {
            pKCS12SafeBagArr[i11] = new PKCS12SafeBag(SafeBag.getInstance(this.safeBagSeq.getObjectAt(i11)));
        }
        return pKCS12SafeBagArr;
    }

    public PKCS12SafeBagFactory(ContentInfo contentInfo, InputDecryptorProvider inputDecryptorProvider) {
        if (contentInfo.getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
            try {
                this.safeBagSeq = ASN1Sequence.getInstance(new CMSEncryptedData(org.spongycastle.asn1.cms.ContentInfo.getInstance(contentInfo)).getContent(inputDecryptorProvider));
                return;
            } catch (CMSException e11) {
                throw new PKCSException("unable to extract data: " + e11.getMessage(), e11);
            }
        }
        throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
    }
}