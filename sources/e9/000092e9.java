package org.bouncycastle.jcajce.provider.asymmetric.util;

import i60.a;
import i60.c;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.c0;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import w40.p;

/* loaded from: classes5.dex */
public abstract class BaseCipherSpi extends CipherSpi {

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43175iv;
    private int ivSize;
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private final c helper = new a();
    protected AlgorithmParameters engineParams = null;
    protected c0 wrapEngine = null;

    /* loaded from: classes5.dex */
    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            org.bouncycastle.util.a.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i11) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i11) {
        try {
            c0 c0Var = this.wrapEngine;
            byte[] engineDoFinal = c0Var == null ? engineDoFinal(bArr, 0, bArr.length) : c0Var.unwrap(bArr, 0, bArr.length);
            if (i11 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i11 == 2) {
                try {
                    p f11 = p.f(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(f11);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + f11.i().e() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory createKeyFactory = this.helper.createKeyFactory(str);
                if (i11 == 1) {
                    return createKeyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i11 == 2) {
                    return createKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i11);
            } catch (NoSuchAlgorithmException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (NoSuchProviderException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            } catch (InvalidKeySpecException e13) {
                throw new InvalidKeyException("Unknown key type " + e13.getMessage());
            }
        } catch (BadPaddingException e14) {
            throw new InvalidKeyException("unable to unwrap") { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.1
                @Override // java.lang.Throwable
                public synchronized Throwable getCause() {
                    return e14;
                }
            };
        } catch (IllegalBlockSizeException e15) {
            throw new InvalidKeyException(e15.getMessage());
        } catch (InvalidCipherTextException e16) {
            throw new InvalidKeyException(e16.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                c0 c0Var = this.wrapEngine;
                return c0Var == null ? engineDoFinal(encoded, 0, encoded.length) : c0Var.wrap(encoded, 0, encoded.length);
            } catch (BadPaddingException e11) {
                throw new IllegalBlockSizeException(e11.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }
}