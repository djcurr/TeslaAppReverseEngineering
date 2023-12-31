package org.spongycastle.cms.jcajce;

import java.io.InputStream;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cms.RecipientOperator;
import org.spongycastle.jcajce.io.CipherInputStream;
import org.spongycastle.operator.InputDecryptor;

/* loaded from: classes4.dex */
public class JceKeyTransEnvelopedRecipient extends JceKeyTransRecipient {
    public JceKeyTransEnvelopedRecipient(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // org.spongycastle.cms.KeyTransRecipient
    public RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, final AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        final Cipher createContentCipher = this.contentHelper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new RecipientOperator(new InputDecryptor() { // from class: org.spongycastle.cms.jcajce.JceKeyTransEnvelopedRecipient.1
            @Override // org.spongycastle.operator.InputDecryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.spongycastle.operator.InputDecryptor
            public InputStream getInputStream(InputStream inputStream) {
                return new CipherInputStream(inputStream, createContentCipher);
            }
        });
    }
}