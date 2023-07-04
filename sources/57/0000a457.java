package org.spongycastle.pqc.jcajce.provider.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;

/* loaded from: classes4.dex */
public abstract class CipherSpiExt extends CipherSpi {
    public static final int DECRYPT_MODE = 2;
    public static final int ENCRYPT_MODE = 1;
    protected int opMode;

    public abstract int doFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public final byte[] doFinal() {
        return doFinal(null, 0, 0);
    }

    public abstract byte[] doFinal(byte[] bArr, int i11, int i12);

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        return doFinal(bArr, i11, i12);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetBlockSize() {
        return getBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineGetIV() {
        return getIV();
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetKeySize(Key key) {
        if (key instanceof Key) {
            return getKeySize(key);
        }
        throw new InvalidKeyException("Unsupported key.");
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetOutputSize(int i11) {
        return getOutputSize(i11);
    }

    @Override // javax.crypto.CipherSpi
    protected final AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidParameterException(e11.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineSetMode(String str) {
        setMode(str);
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineSetPadding(String str) {
        setPadding(str);
    }

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        return update(bArr, i11, i12);
    }

    public abstract int getBlockSize();

    public abstract byte[] getIV();

    public abstract int getKeySize(Key key);

    public abstract String getName();

    public abstract int getOutputSize(int i11);

    public abstract AlgorithmParameterSpec getParameters();

    public abstract void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec);

    public abstract void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    protected abstract void setMode(String str);

    protected abstract void setPadding(String str);

    public abstract int update(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public final byte[] update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public abstract byte[] update(byte[] bArr, int i11, int i12);

    public final byte[] doFinal(byte[] bArr) {
        return doFinal(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return doFinal(bArr, i11, i12, bArr2, i13);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return update(bArr, i11, i12, bArr2, i13);
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters == null) {
            engineInit(i11, key, secureRandom);
        } else {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (key != null) {
            this.opMode = i11;
            if (i11 == 1) {
                initEncrypt(key, algorithmParameterSpec, secureRandom);
                return;
            } else if (i11 == 2) {
                initDecrypt(key, algorithmParameterSpec);
                return;
            } else {
                return;
            }
        }
        throw new InvalidKeyException();
    }
}