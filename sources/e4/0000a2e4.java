package org.spongycastle.openssl;

import java.io.IOException;
import org.spongycastle.operator.OperatorCreationException;

/* loaded from: classes4.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;

    /* renamed from: iv  reason: collision with root package name */
    private final byte[] f43749iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.f43749iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.f43749iv));
        } catch (IOException e11) {
            throw e11;
        } catch (OperatorCreationException e12) {
            throw new PEMException("cannot create extraction operator: " + e12.getMessage(), e12);
        } catch (Exception e13) {
            throw new PEMException("exception processing key pair: " + e13.getMessage(), e13);
        }
    }
}