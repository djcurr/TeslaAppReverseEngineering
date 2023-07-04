package org.spongycastle.cms;

import java.io.InputStream;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cms.EncryptedContentInfo;
import org.spongycastle.asn1.cms.EnvelopedData;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cms.CMSEnvelopedHelper;
import org.spongycastle.util.Encodable;

/* loaded from: classes5.dex */
public class CMSEnvelopedData implements Encodable {
    ContentInfo contentInfo;
    private AlgorithmIdentifier encAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private ASN1Set unprotectedAttributes;

    public CMSEnvelopedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }

    private byte[] encodeObj(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive().getEncoded();
        }
        return null;
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.encAlg;
    }

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public String getEncryptionAlgOID() {
        return this.encAlg.getAlgorithm().getId();
    }

    public byte[] getEncryptionAlgParams() {
        try {
            return encodeObj(this.encAlg.getParameters());
        } catch (Exception e11) {
            throw new RuntimeException("exception getting encryption parameters " + e11);
        }
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnprotectedAttributes() {
        ASN1Set aSN1Set = this.unprotectedAttributes;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSEnvelopedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public CMSEnvelopedData(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        try {
            EnvelopedData envelopedData = EnvelopedData.getInstance(contentInfo.getContent());
            if (envelopedData.getOriginatorInfo() != null) {
                this.originatorInfo = new OriginatorInformation(envelopedData.getOriginatorInfo());
            }
            ASN1Set recipientInfos = envelopedData.getRecipientInfos();
            EncryptedContentInfo encryptedContentInfo = envelopedData.getEncryptedContentInfo();
            this.encAlg = encryptedContentInfo.getContentEncryptionAlgorithm();
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.encAlg, new CMSEnvelopedHelper.CMSEnvelopedSecureReadable(this.encAlg, new CMSProcessableByteArray(encryptedContentInfo.getEncryptedContent().getOctets())));
            this.unprotectedAttributes = envelopedData.getUnprotectedAttrs();
        } catch (ClassCastException e11) {
            throw new CMSException("Malformed content.", e11);
        } catch (IllegalArgumentException e12) {
            throw new CMSException("Malformed content.", e12);
        }
    }
}