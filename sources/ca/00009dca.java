package org.spongycastle.eac.operator.jcajce;

import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.eac.operator.EACSigner;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OperatorStreamException;
import org.spongycastle.operator.RuntimeOperatorException;

/* loaded from: classes4.dex */
public class JcaEACSignerBuilder {
    private static final Hashtable sigNames;
    private EACHelper helper = new DefaultEACHelper();

    static {
        Hashtable hashtable = new Hashtable();
        sigNames = hashtable;
        hashtable.put("SHA1withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1);
        hashtable.put("SHA256withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256);
        hashtable.put("SHA1withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1);
        hashtable.put("SHA256withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256);
        hashtable.put("SHA512withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512);
        hashtable.put("SHA512withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512);
        hashtable.put("SHA1withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        hashtable.put("SHA224withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        hashtable.put("SHA256withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        hashtable.put("SHA384withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        hashtable.put("SHA512withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
    }

    private static void copyUnsignedInt(byte[] bArr, byte[] bArr2, int i11) {
        int length = bArr.length;
        int i12 = 0;
        if (bArr[0] == 0) {
            length--;
            i12 = 1;
        }
        System.arraycopy(bArr, i12, bArr2, i11, length);
    }

    public static int max(int i11, int i12) {
        return i11 > i12 ? i11 : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] reencode(byte[] bArr) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        BigInteger value = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        BigInteger value2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        byte[] byteArray = value.toByteArray();
        byte[] byteArray2 = value2.toByteArray();
        int unsignedIntLength = unsignedIntLength(byteArray);
        int unsignedIntLength2 = unsignedIntLength(byteArray2);
        int max = max(unsignedIntLength, unsignedIntLength2);
        int i11 = max * 2;
        byte[] bArr2 = new byte[i11];
        Arrays.fill(bArr2, (byte) 0);
        copyUnsignedInt(byteArray, bArr2, max - unsignedIntLength);
        copyUnsignedInt(byteArray2, bArr2, i11 - unsignedIntLength2);
        return bArr2;
    }

    private static int unsignedIntLength(byte[] bArr) {
        int length = bArr.length;
        return bArr[0] == 0 ? length - 1 : length;
    }

    public EACSigner build(String str, PrivateKey privateKey) {
        return build((ASN1ObjectIdentifier) sigNames.get(str), privateKey);
    }

    public JcaEACSignerBuilder setProvider(String str) {
        this.helper = new NamedEACHelper(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class SignatureOutputStream extends OutputStream {
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

    public EACSigner build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey) {
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initSign(privateKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            return new EACSigner() { // from class: org.spongycastle.eac.operator.jcajce.JcaEACSignerBuilder.1
                @Override // org.spongycastle.eac.operator.EACSigner
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                @Override // org.spongycastle.eac.operator.EACSigner
                public byte[] getSignature() {
                    try {
                        byte[] signature2 = signatureOutputStream.getSignature();
                        return aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA) ? JcaEACSignerBuilder.reencode(signature2) : signature2;
                    } catch (SignatureException e11) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e11.getMessage(), e11);
                    }
                }

                @Override // org.spongycastle.eac.operator.EACSigner
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }
            };
        } catch (InvalidKeyException e11) {
            throw new OperatorCreationException("invalid key: " + e11.getMessage(), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new OperatorCreationException("unable to find algorithm: " + e12.getMessage(), e12);
        } catch (NoSuchProviderException e13) {
            throw new OperatorCreationException("unable to find provider: " + e13.getMessage(), e13);
        }
    }

    public JcaEACSignerBuilder setProvider(Provider provider) {
        this.helper = new ProviderEACHelper(provider);
        return this;
    }
}