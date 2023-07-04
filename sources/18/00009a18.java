package org.spongycastle.cert.crmf.jcajce;

import java.security.cert.X509Certificate;
import org.spongycastle.asn1.crmf.EncryptedValue;
import org.spongycastle.cert.crmf.EncryptedValueBuilder;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.operator.KeyWrapper;
import org.spongycastle.operator.OutputEncryptor;

/* loaded from: classes5.dex */
public class JcaEncryptedValueBuilder extends EncryptedValueBuilder {
    public JcaEncryptedValueBuilder(KeyWrapper keyWrapper, OutputEncryptor outputEncryptor) {
        super(keyWrapper, outputEncryptor);
    }

    public EncryptedValue build(X509Certificate x509Certificate) {
        return build(new JcaX509CertificateHolder(x509Certificate));
    }
}