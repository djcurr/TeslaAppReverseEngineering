package org.spongycastle.crypto.tls;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.agreement.DHBasicAgreement;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.util.BigIntegers;

/* loaded from: classes4.dex */
public class DefaultTlsAgreementCredentials extends AbstractTlsAgreementCredentials {
    protected BasicAgreement basicAgreement;
    protected Certificate certificate;
    protected AsymmetricKeyParameter privateKey;
    protected boolean truncateAgreement;

    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
        if (certificate != null) {
            if (certificate.isEmpty()) {
                throw new IllegalArgumentException("'certificate' cannot be empty");
            }
            if (asymmetricKeyParameter != null) {
                if (asymmetricKeyParameter.isPrivate()) {
                    if (asymmetricKeyParameter instanceof DHPrivateKeyParameters) {
                        this.basicAgreement = new DHBasicAgreement();
                        this.truncateAgreement = true;
                    } else if (asymmetricKeyParameter instanceof ECPrivateKeyParameters) {
                        this.basicAgreement = new ECDHBasicAgreement();
                        this.truncateAgreement = false;
                    } else {
                        throw new IllegalArgumentException("'privateKey' type not supported: " + asymmetricKeyParameter.getClass().getName());
                    }
                    this.certificate = certificate;
                    this.privateKey = asymmetricKeyParameter;
                    return;
                }
                throw new IllegalArgumentException("'privateKey' must be private");
            }
            throw new IllegalArgumentException("'privateKey' cannot be null");
        }
        throw new IllegalArgumentException("'certificate' cannot be null");
    }

    @Override // org.spongycastle.crypto.tls.TlsAgreementCredentials
    public byte[] generateAgreement(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.basicAgreement.init(this.privateKey);
        BigInteger calculateAgreement = this.basicAgreement.calculateAgreement(asymmetricKeyParameter);
        if (this.truncateAgreement) {
            return BigIntegers.asUnsignedByteArray(calculateAgreement);
        }
        return BigIntegers.asUnsignedByteArray(this.basicAgreement.getFieldSize(), calculateAgreement);
    }

    @Override // org.spongycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return this.certificate;
    }
}