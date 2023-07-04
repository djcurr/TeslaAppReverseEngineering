package org.spongycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes4.dex */
public class DSADigestSigner implements Signer {
    private final Digest digest;
    private final DSA dsaSigner;
    private boolean forSigning;

    public DSADigestSigner(DSA dsa, Digest digest) {
        this.digest = digest;
        this.dsaSigner = dsa;
    }

    private BigInteger[] derDecode(byte[] bArr) {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) ASN1Primitive.fromByteArray(bArr);
        return new BigInteger[]{((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue(), ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue()};
    }

    private byte[] derEncode(BigInteger bigInteger, BigInteger bigInteger2) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        aSN1EncodableVector.add(new ASN1Integer(bigInteger2));
        return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        if (this.forSigning) {
            byte[] bArr = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr, 0);
            BigInteger[] generateSignature = this.dsaSigner.generateSignature(bArr);
            try {
                return derEncode(generateSignature[0], generateSignature[1]);
            } catch (IOException unused) {
                throw new IllegalStateException("unable to encode signature");
            }
        }
        throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        this.forSigning = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            asymmetricKeyParameter = (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        }
        if (z11 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!z11 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
        reset();
        this.dsaSigner.init(z11, cipherParameters);
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        this.digest.update(b11);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (!this.forSigning) {
            byte[] bArr2 = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr2, 0);
            try {
                BigInteger[] derDecode = derDecode(bArr);
                return this.dsaSigner.verifySignature(bArr2, derDecode[0], derDecode[1]);
            } catch (IOException unused) {
                return false;
            }
        }
        throw new IllegalStateException("DSADigestSigner not initialised for verification");
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }
}