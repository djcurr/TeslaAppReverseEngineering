package org.spongycastle.pkcs;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DLSequence;
import org.spongycastle.asn1.pkcs.AuthenticatedSafe;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.cms.CMSEncryptedDataGenerator;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.CMSProcessableByteArray;
import org.spongycastle.operator.OutputEncryptor;

/* loaded from: classes4.dex */
public class PKCS12PfxPduBuilder {
    private ASN1EncodableVector dataVector = new ASN1EncodableVector();

    public PKCS12PfxPduBuilder addData(PKCS12SafeBag pKCS12SafeBag) {
        this.dataVector.add(new ContentInfo(PKCSObjectIdentifiers.data, new DEROctetString(new DLSequence(pKCS12SafeBag.toASN1Structure()).getEncoded())));
        return this;
    }

    public PKCS12PfxPduBuilder addEncryptedData(OutputEncryptor outputEncryptor, PKCS12SafeBag pKCS12SafeBag) {
        return addEncryptedData(outputEncryptor, new DERSequence(pKCS12SafeBag.toASN1Structure()));
    }

    public PKCS12PfxPdu build(PKCS12MacCalculatorBuilder pKCS12MacCalculatorBuilder, char[] cArr) {
        try {
            byte[] encoded = AuthenticatedSafe.getInstance(new DLSequence(this.dataVector)).getEncoded();
            return new PKCS12PfxPdu(new Pfx(new ContentInfo(PKCSObjectIdentifiers.data, new DEROctetString(encoded)), pKCS12MacCalculatorBuilder != null ? new MacDataGenerator(pKCS12MacCalculatorBuilder).build(cArr, encoded) : null));
        } catch (IOException e11) {
            throw new PKCSException("unable to encode AuthenticatedSafe: " + e11.getMessage(), e11);
        }
    }

    public PKCS12PfxPduBuilder addEncryptedData(OutputEncryptor outputEncryptor, PKCS12SafeBag[] pKCS12SafeBagArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i11 = 0; i11 != pKCS12SafeBagArr.length; i11++) {
            aSN1EncodableVector.add(pKCS12SafeBagArr[i11].toASN1Structure());
        }
        return addEncryptedData(outputEncryptor, new DLSequence(aSN1EncodableVector));
    }

    private PKCS12PfxPduBuilder addEncryptedData(OutputEncryptor outputEncryptor, ASN1Sequence aSN1Sequence) {
        try {
            this.dataVector.add(new CMSEncryptedDataGenerator().generate(new CMSProcessableByteArray(aSN1Sequence.getEncoded()), outputEncryptor).toASN1Structure());
            return this;
        } catch (CMSException e11) {
            throw new PKCSIOException(e11.getMessage(), e11.getCause());
        }
    }
}