package org.spongycastle.openssl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.operator.OutputEncryptor;
import org.spongycastle.util.io.pem.PemGenerationException;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemObjectGenerator;

/* loaded from: classes4.dex */
public class PKCS8Generator implements PemObjectGenerator {
    private PrivateKeyInfo key;
    private OutputEncryptor outputEncryptor;
    public static final ASN1ObjectIdentifier AES_128_CBC = NISTObjectIdentifiers.id_aes128_CBC;
    public static final ASN1ObjectIdentifier AES_192_CBC = NISTObjectIdentifiers.id_aes192_CBC;
    public static final ASN1ObjectIdentifier AES_256_CBC = NISTObjectIdentifiers.id_aes256_CBC;
    public static final ASN1ObjectIdentifier DES3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final ASN1ObjectIdentifier PBE_SHA1_RC4_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4;
    public static final ASN1ObjectIdentifier PBE_SHA1_RC4_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4;
    public static final ASN1ObjectIdentifier PBE_SHA1_3DES = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
    public static final ASN1ObjectIdentifier PBE_SHA1_2DES = PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC;
    public static final ASN1ObjectIdentifier PBE_SHA1_RC2_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC;
    public static final ASN1ObjectIdentifier PBE_SHA1_RC2_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC;

    public PKCS8Generator(PrivateKeyInfo privateKeyInfo, OutputEncryptor outputEncryptor) {
        this.key = privateKeyInfo;
        this.outputEncryptor = outputEncryptor;
    }

    @Override // org.spongycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() {
        OutputEncryptor outputEncryptor = this.outputEncryptor;
        if (outputEncryptor != null) {
            return generate(this.key, outputEncryptor);
        }
        return generate(this.key, null);
    }

    private PemObject generate(PrivateKeyInfo privateKeyInfo, OutputEncryptor outputEncryptor) {
        try {
            byte[] encoded = privateKeyInfo.getEncoded();
            if (outputEncryptor == null) {
                return new PemObject("PRIVATE KEY", encoded);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            outputStream.write(privateKeyInfo.getEncoded());
            outputStream.close();
            return new PemObject("ENCRYPTED PRIVATE KEY", new EncryptedPrivateKeyInfo(outputEncryptor.getAlgorithmIdentifier(), byteArrayOutputStream.toByteArray()).getEncoded());
        } catch (IOException e11) {
            throw new PemGenerationException("unable to process encoded key data: " + e11.getMessage(), e11);
        }
    }
}