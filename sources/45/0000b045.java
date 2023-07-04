package r7;

import android.util.Base64;
import com.adyen.checkout.cse.exception.EncryptionException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Cipher f49272a;

    /* renamed from: b  reason: collision with root package name */
    private final Cipher f49273b;

    /* renamed from: c  reason: collision with root package name */
    private final SecureRandom f49274c;

    public b(String str) {
        if (f.a(str)) {
            this.f49274c = new SecureRandom();
            String[] split = str.split("\\|");
            try {
                try {
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(split[1].toLowerCase(Locale.getDefault()), 16), new BigInteger(split[0].toLowerCase(Locale.getDefault()), 16)));
                    try {
                        this.f49272a = Cipher.getInstance("AES/CCM/NoPadding");
                        try {
                            Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
                            this.f49273b = cipher;
                            cipher.init(1, generatePublic);
                            return;
                        } catch (InvalidKeyException e11) {
                            throw new EncryptionException("Invalid public key: " + str, e11);
                        } catch (NoSuchAlgorithmException e12) {
                            throw new EncryptionException("Problem instantiation RSA Cipher Algorithm", e12);
                        } catch (NoSuchPaddingException e13) {
                            throw new EncryptionException("Problem instantiation RSA Cipher Padding", e13);
                        }
                    } catch (NoSuchAlgorithmException e14) {
                        throw new EncryptionException("Problem instantiation AES Cipher Algorithm", e14);
                    } catch (NoSuchPaddingException e15) {
                        throw new EncryptionException("Problem instantiation AES Cipher Padding", e15);
                    }
                } catch (InvalidKeySpecException e16) {
                    throw new EncryptionException("Problem reading public key: " + str, e16);
                }
            } catch (NoSuchAlgorithmException e17) {
                throw new EncryptionException("RSA KeyFactory not found.", e17);
            }
        }
        throw new EncryptionException("Invalid public key: " + str, null);
    }

    private SecretKey b() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e11) {
            throw new EncryptionException("Unable to get AES algorithm", e11);
        }
    }

    private byte[] c() {
        byte[] bArr = new byte[12];
        this.f49274c.nextBytes(bArr);
        return bArr;
    }

    public String a(String str) {
        SecretKey b11 = b();
        byte[] c11 = c();
        try {
            this.f49272a.init(1, b11, new IvParameterSpec(c11));
            byte[] doFinal = this.f49272a.doFinal(str.getBytes(kotlin.text.d.f35187b));
            byte[] bArr = new byte[c11.length + doFinal.length];
            System.arraycopy(c11, 0, bArr, 0, c11.length);
            System.arraycopy(doFinal, 0, bArr, c11.length, doFinal.length);
            try {
                return String.format("%s%s%s%s%s%s", "adyenan", "0_1_1", "$", Base64.encodeToString(this.f49273b.doFinal(b11.getEncoded()), 2), "$", Base64.encodeToString(bArr, 2));
            } catch (BadPaddingException e11) {
                throw new EncryptionException("Incorrect RSA Padding", e11);
            } catch (IllegalBlockSizeException e12) {
                throw new EncryptionException("Incorrect RSA Block Size", e12);
            }
        } catch (InvalidAlgorithmParameterException e13) {
            throw new EncryptionException("Invalid AES Parameters", e13);
        } catch (InvalidKeyException e14) {
            throw new EncryptionException("Invalid AES Key", e14);
        } catch (BadPaddingException e15) {
            throw new EncryptionException("Incorrect AES Padding", e15);
        } catch (IllegalBlockSizeException e16) {
            throw new EncryptionException("Incorrect AES Block Size", e16);
        }
    }
}