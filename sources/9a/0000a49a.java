package org.spongycastle.tsp;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.tsp.MessageImprint;
import org.spongycastle.asn1.tsp.TimeStampReq;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.ExtensionsGenerator;

/* loaded from: classes4.dex */
public class TimeStampRequestGenerator {
    private ASN1Boolean certReq;
    private ExtensionsGenerator extGenerator = new ExtensionsGenerator();
    private ASN1ObjectIdentifier reqPolicy;

    public void addExtension(String str, boolean z11, ASN1Encodable aSN1Encodable) {
        addExtension(str, z11, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public TimeStampRequest generate(String str, byte[] bArr) {
        return generate(str, bArr, (BigInteger) null);
    }

    public void setCertReq(boolean z11) {
        this.certReq = ASN1Boolean.getInstance(z11);
    }

    public void setReqPolicy(String str) {
        this.reqPolicy = new ASN1ObjectIdentifier(str);
    }

    public void addExtension(String str, boolean z11, byte[] bArr) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(str), z11, bArr);
    }

    public TimeStampRequest generate(String str, byte[] bArr, BigInteger bigInteger) {
        if (str != null) {
            MessageImprint messageImprint = new MessageImprint(new AlgorithmIdentifier(new ASN1ObjectIdentifier(str), DERNull.INSTANCE), bArr);
            Extensions generate = this.extGenerator.isEmpty() ? null : this.extGenerator.generate();
            if (bigInteger != null) {
                return new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, new ASN1Integer(bigInteger), this.certReq, generate));
            }
            return new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, null, this.certReq, generate));
        }
        throw new IllegalArgumentException("No digest algorithm specified");
    }

    public void setReqPolicy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.reqPolicy = aSN1ObjectIdentifier;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) {
        TSPUtil.addExtension(this.extGenerator, aSN1ObjectIdentifier, z11, aSN1Encodable);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, byte[] bArr) {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z11, bArr);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        return generate(aSN1ObjectIdentifier.getId(), bArr);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, BigInteger bigInteger) {
        return generate(aSN1ObjectIdentifier.getId(), bArr, bigInteger);
    }
}