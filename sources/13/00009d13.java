package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public abstract class DTLSProtocol {
    protected final SecureRandom secureRandom;

    /* JADX INFO: Access modifiers changed from: protected */
    public DTLSProtocol(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.secureRandom = secureRandom;
            return;
        }
        throw new IllegalArgumentException("'secureRandom' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void applyMaxFragmentLengthExtension(DTLSRecordLayer dTLSRecordLayer, short s11) {
        if (s11 >= 0) {
            if (MaxFragmentLength.isValid(s11)) {
                dTLSRecordLayer.setPlaintextLimit(1 << (s11 + 8));
                return;
            }
            throw new TlsFatalAlert((short) 80);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short evaluateMaxFragmentLengthExtension(boolean z11, Hashtable hashtable, Hashtable hashtable2, short s11) {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (z11 || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        throw new TlsFatalAlert(s11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] generateCertificate(Certificate certificate) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificate.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] generateSupplementalData(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsProtocol.writeSupplementalData(byteArrayOutputStream, vector);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void validateSelectedCipherSuite(int i11, short s11) {
        int encryptionAlgorithm = TlsUtils.getEncryptionAlgorithm(i11);
        if (encryptionAlgorithm == 1 || encryptionAlgorithm == 2) {
            throw new TlsFatalAlert(s11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void processFinished(byte[] bArr, byte[] bArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] readFully = TlsUtils.readFully(bArr2.length, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (!Arrays.constantTimeAreEqual(bArr2, readFully)) {
            throw new TlsFatalAlert((short) 40);
        }
    }
}