package org.spongycastle.cert.crmf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.crmf.EncryptedValue;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.KeyWrapper;
import org.spongycastle.operator.OperatorException;
import org.spongycastle.operator.OutputEncryptor;
import org.spongycastle.util.Strings;

/* loaded from: classes5.dex */
public class EncryptedValueBuilder {
    private OutputEncryptor encryptor;
    private EncryptedValuePadder padder;
    private KeyWrapper wrapper;

    public EncryptedValueBuilder(KeyWrapper keyWrapper, OutputEncryptor outputEncryptor) {
        this(keyWrapper, outputEncryptor, null);
    }

    private EncryptedValue encryptData(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream = this.encryptor.getOutputStream(byteArrayOutputStream);
        try {
            outputStream.write(bArr);
            outputStream.close();
            AlgorithmIdentifier algorithmIdentifier = this.encryptor.getAlgorithmIdentifier();
            try {
                this.wrapper.generateWrappedKey(this.encryptor.getKey());
                return new EncryptedValue(null, algorithmIdentifier, new DERBitString(this.wrapper.generateWrappedKey(this.encryptor.getKey())), this.wrapper.getAlgorithmIdentifier(), null, new DERBitString(byteArrayOutputStream.toByteArray()));
            } catch (OperatorException e11) {
                throw new CRMFException("cannot wrap key: " + e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new CRMFException("cannot process data: " + e12.getMessage(), e12);
        }
    }

    private byte[] padData(byte[] bArr) {
        EncryptedValuePadder encryptedValuePadder = this.padder;
        return encryptedValuePadder != null ? encryptedValuePadder.getPaddedData(bArr) : bArr;
    }

    public EncryptedValue build(char[] cArr) {
        return encryptData(padData(Strings.toUTF8ByteArray(cArr)));
    }

    public EncryptedValueBuilder(KeyWrapper keyWrapper, OutputEncryptor outputEncryptor, EncryptedValuePadder encryptedValuePadder) {
        this.wrapper = keyWrapper;
        this.encryptor = outputEncryptor;
        this.padder = encryptedValuePadder;
    }

    public EncryptedValue build(X509CertificateHolder x509CertificateHolder) {
        try {
            return encryptData(padData(x509CertificateHolder.getEncoded()));
        } catch (IOException e11) {
            throw new CRMFException("cannot encode certificate: " + e11.getMessage(), e11);
        }
    }
}