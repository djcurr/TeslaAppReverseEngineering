package org.spongycastle.cms.jcajce;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.cms.ecc.ECCCMSSharedInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
class RFC5753KeyMaterialGenerator implements KeyMaterialGenerator {
    @Override // org.spongycastle.cms.jcajce.KeyMaterialGenerator
    public byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i11, byte[] bArr) {
        try {
            return new ECCCMSSharedInfo(algorithmIdentifier, bArr, Pack.intToBigEndian(i11)).getEncoded(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new IllegalStateException("Unable to create KDF material: " + e11);
        }
    }
}