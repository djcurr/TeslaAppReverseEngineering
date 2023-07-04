package org.spongycastle.cms.jcajce;

import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cms.IssuerAndSerialNumber;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.KeyTransRecipient;
import org.spongycastle.cms.KeyTransRecipientId;
import org.spongycastle.operator.OperatorException;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public abstract class JceKTSKeyTransRecipient implements KeyTransRecipient {
    private static final byte[] ANONYMOUS_SENDER = Hex.decode("0c14416e6f6e796d6f75732053656e64657220202020");
    protected EnvelopedDataHelper contentHelper;
    protected Map extraMappings;
    protected EnvelopedDataHelper helper;
    private final byte[] partyVInfo;
    private PrivateKey recipientKey;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public JceKTSKeyTransRecipient(PrivateKey privateKey, byte[] bArr) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new HashMap();
        this.validateKeySize = false;
        this.recipientKey = privateKey;
        this.partyVInfo = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getPartyVInfoFromRID(KeyTransRecipientId keyTransRecipientId) {
        if (keyTransRecipientId.getSerialNumber() != null) {
            return new IssuerAndSerialNumber(keyTransRecipientId.getIssuer(), keyTransRecipientId.getSerialNumber()).getEncoded(ASN1Encoding.DER);
        }
        return new DEROctetString(keyTransRecipientId.getSubjectKeyIdentifier()).getEncoded();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        try {
            Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), this.helper.createAsymmetricUnwrapper(algorithmIdentifier, this.recipientKey, ANONYMOUS_SENDER, this.partyVInfo).generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (this.validateKeySize) {
                this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            }
            return jceKey;
        } catch (OperatorException e11) {
            throw new CMSException("exception unwrapping key: " + e11.getMessage(), e11);
        }
    }

    public JceKTSKeyTransRecipient setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceKTSKeyTransRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKTSKeyTransRecipient setKeySizeValidation(boolean z11) {
        this.validateKeySize = z11;
        return this;
    }

    public JceKTSKeyTransRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public JceKTSKeyTransRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKTSKeyTransRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }
}