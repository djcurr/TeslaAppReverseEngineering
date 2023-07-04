package org.spongycastle.pkcs;

import java.io.ByteArrayInputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.operator.InputDecryptorProvider;
import org.spongycastle.util.io.Streams;

/* loaded from: classes4.dex */
public class PKCS8EncryptedPrivateKeyInfo {
    private EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;

    public PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
        this.encryptedPrivateKeyInfo = encryptedPrivateKeyInfo;
    }

    private static EncryptedPrivateKeyInfo parseBytes(byte[] bArr) {
        try {
            return EncryptedPrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e11) {
            throw new PKCSIOException("malformed data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new PKCSIOException("malformed data: " + e12.getMessage(), e12);
        }
    }

    public PrivateKeyInfo decryptPrivateKeyInfo(InputDecryptorProvider inputDecryptorProvider) {
        try {
            return PrivateKeyInfo.getInstance(Streams.readAll(inputDecryptorProvider.get(this.encryptedPrivateKeyInfo.getEncryptionAlgorithm()).getInputStream(new ByteArrayInputStream(this.encryptedPrivateKeyInfo.getEncryptedData()))));
        } catch (Exception e11) {
            throw new PKCSException("unable to read encrypted data: " + e11.getMessage(), e11);
        }
    }

    public byte[] getEncoded() {
        return this.encryptedPrivateKeyInfo.getEncoded();
    }

    public EncryptedPrivateKeyInfo toASN1Structure() {
        return this.encryptedPrivateKeyInfo;
    }

    public PKCS8EncryptedPrivateKeyInfo(byte[] bArr) {
        this(parseBytes(bArr));
    }
}