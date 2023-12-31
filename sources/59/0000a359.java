package org.spongycastle.operator.bc;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.signers.DSADigestSigner;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: classes4.dex */
public class BcECContentVerifierProviderBuilder extends BcContentVerifierProviderBuilder {
    private DigestAlgorithmIdentifierFinder digestAlgorithmFinder;

    public BcECContentVerifierProviderBuilder(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.digestAlgorithmFinder = digestAlgorithmIdentifierFinder;
    }

    @Override // org.spongycastle.operator.bc.BcContentVerifierProviderBuilder
    protected Signer createSigner(AlgorithmIdentifier algorithmIdentifier) {
        return new DSADigestSigner(new ECDSASigner(), this.digestProvider.get(this.digestAlgorithmFinder.find(algorithmIdentifier)));
    }

    @Override // org.spongycastle.operator.bc.BcContentVerifierProviderBuilder
    protected AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }
}