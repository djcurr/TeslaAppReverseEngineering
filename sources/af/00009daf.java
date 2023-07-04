package org.spongycastle.dvcs;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cms.SignedData;
import org.spongycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.spongycastle.cms.CMSSignedData;

/* loaded from: classes4.dex */
public class DVCSResponse extends DVCSMessage {
    private org.spongycastle.asn1.dvcs.DVCSResponse asn1;

    public DVCSResponse(CMSSignedData cMSSignedData) {
        this(SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }

    @Override // org.spongycastle.dvcs.DVCSMessage
    public ASN1Encodable getContent() {
        return this.asn1;
    }

    public DVCSResponse(ContentInfo contentInfo) {
        super(contentInfo);
        if (DVCSObjectIdentifiers.id_ct_DVCSResponseData.equals(contentInfo.getContentType())) {
            try {
                if (contentInfo.getContent().toASN1Primitive() instanceof ASN1Sequence) {
                    this.asn1 = org.spongycastle.asn1.dvcs.DVCSResponse.getInstance(contentInfo.getContent());
                    return;
                } else {
                    this.asn1 = org.spongycastle.asn1.dvcs.DVCSResponse.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
                    return;
                }
            } catch (Exception e11) {
                throw new DVCSConstructionException("Unable to parse content: " + e11.getMessage(), e11);
            }
        }
        throw new DVCSConstructionException("ContentInfo not a DVCS Response");
    }
}