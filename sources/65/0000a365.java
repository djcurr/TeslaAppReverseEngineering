package org.spongycastle.operator.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OperatorStreamException;
import org.spongycastle.operator.RuntimeOperatorException;

/* loaded from: classes4.dex */
public class JcaContentSignerBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private SecureRandom random;
    private AlgorithmIdentifier sigAlgId;
    private String signatureAlgorithm;

    public JcaContentSignerBuilder(String str) {
        this.signatureAlgorithm = str;
        this.sigAlgId = new DefaultSignatureAlgorithmIdentifierFinder().find(str);
    }

    public ContentSigner build(PrivateKey privateKey) {
        try {
            Signature createSignature = this.helper.createSignature(this.sigAlgId);
            AlgorithmIdentifier algorithmIdentifier = this.sigAlgId;
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                createSignature.initSign(privateKey, secureRandom);
            } else {
                createSignature.initSign(privateKey);
            }
            return new ContentSigner(createSignature, algorithmIdentifier) { // from class: org.spongycastle.operator.jcajce.JcaContentSignerBuilder.1
                private SignatureOutputStream stream;
                final /* synthetic */ Signature val$sig;
                final /* synthetic */ AlgorithmIdentifier val$signatureAlgId;

                {
                    this.val$sig = createSignature;
                    this.val$signatureAlgId = algorithmIdentifier;
                    this.stream = new SignatureOutputStream(createSignature);
                }

                @Override // org.spongycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.val$signatureAlgId;
                }

                @Override // org.spongycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.spongycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.stream.getSignature();
                    } catch (SignatureException e11) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e11.getMessage(), e11);
                    }
                }
            };
        } catch (GeneralSecurityException e11) {
            throw new OperatorCreationException("cannot create signer: " + e11.getMessage(), e11);
        }
    }

    public JcaContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcaContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    /* loaded from: classes4.dex */
    private class SignatureOutputStream extends OutputStream {
        private Signature sig;

        SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        byte[] getSignature() {
            return this.sig.sign();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            try {
                this.sig.update(bArr, i11, i12);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            try {
                this.sig.update((byte) i11);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }
    }

    public JcaContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }
}