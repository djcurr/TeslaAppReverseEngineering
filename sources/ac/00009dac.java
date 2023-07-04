package org.spongycastle.dvcs;

import java.io.IOException;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.spongycastle.asn1.dvcs.DVCSRequestInformationBuilder;
import org.spongycastle.asn1.dvcs.Data;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.cms.CMSSignedDataGenerator;

/* loaded from: classes4.dex */
public abstract class DVCSRequestBuilder {
    protected final DVCSRequestInformationBuilder requestInformationBuilder;
    private final ExtensionsGenerator extGenerator = new ExtensionsGenerator();
    private final CMSSignedDataGenerator signedDataGen = new CMSSignedDataGenerator();

    /* JADX INFO: Access modifiers changed from: protected */
    public DVCSRequestBuilder(DVCSRequestInformationBuilder dVCSRequestInformationBuilder) {
        this.requestInformationBuilder = dVCSRequestInformationBuilder;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) {
        try {
            this.extGenerator.addExtension(aSN1ObjectIdentifier, z11, aSN1Encodable);
        } catch (IOException e11) {
            throw new DVCSException("cannot encode extension: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DVCSRequest createDVCRequest(Data data) {
        if (!this.extGenerator.isEmpty()) {
            this.requestInformationBuilder.setExtensions(this.extGenerator.generate());
        }
        return new DVCSRequest(new ContentInfo(DVCSObjectIdentifiers.id_ct_DVCSRequestData, new org.spongycastle.asn1.dvcs.DVCSRequest(this.requestInformationBuilder.build(), data)));
    }

    public void setDVCS(GeneralName generalName) {
        this.requestInformationBuilder.setDVCS(generalName);
    }

    public void setDataLocations(GeneralName generalName) {
        this.requestInformationBuilder.setDataLocations(generalName);
    }

    public void setNonce(BigInteger bigInteger) {
        this.requestInformationBuilder.setNonce(bigInteger);
    }

    public void setRequester(GeneralName generalName) {
        this.requestInformationBuilder.setRequester(generalName);
    }

    public void setDVCS(GeneralNames generalNames) {
        this.requestInformationBuilder.setDVCS(generalNames);
    }

    public void setDataLocations(GeneralNames generalNames) {
        this.requestInformationBuilder.setDataLocations(generalNames);
    }
}