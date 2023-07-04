package org.spongycastle.operator.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;

/* loaded from: classes4.dex */
public class JcaDigestCalculatorProviderBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());

    /* loaded from: classes4.dex */
    private class DigestOutputStream extends OutputStream {
        private MessageDigest dig;

        DigestOutputStream(MessageDigest messageDigest) {
            this.dig = messageDigest;
        }

        byte[] getDigest() {
            return this.dig.digest();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            this.dig.update(bArr, i11, i12);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.dig.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            this.dig.update((byte) i11);
        }
    }

    public DigestCalculatorProvider build() {
        return new DigestCalculatorProvider() { // from class: org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1
            @Override // org.spongycastle.operator.DigestCalculatorProvider
            public DigestCalculator get(final AlgorithmIdentifier algorithmIdentifier) {
                try {
                    final DigestOutputStream digestOutputStream = new DigestOutputStream(JcaDigestCalculatorProviderBuilder.this.helper.createDigest(algorithmIdentifier));
                    return new DigestCalculator() { // from class: org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1.1
                        @Override // org.spongycastle.operator.DigestCalculator
                        public AlgorithmIdentifier getAlgorithmIdentifier() {
                            return algorithmIdentifier;
                        }

                        @Override // org.spongycastle.operator.DigestCalculator
                        public byte[] getDigest() {
                            return digestOutputStream.getDigest();
                        }

                        @Override // org.spongycastle.operator.DigestCalculator
                        public OutputStream getOutputStream() {
                            return digestOutputStream;
                        }
                    };
                } catch (GeneralSecurityException e11) {
                    throw new OperatorCreationException("exception on setup: " + e11, e11);
                }
            }
        };
    }

    public JcaDigestCalculatorProviderBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcaDigestCalculatorProviderBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }
}