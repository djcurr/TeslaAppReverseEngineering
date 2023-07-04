package zs;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import com.tesla.logging.TeslaLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.ECPointUtil;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.x509.X509V3CertificateGenerator;
import yu.z;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static String f60693c = "keys.store";

    /* renamed from: d  reason: collision with root package name */
    private static a f60694d;

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f60695a = com.tesla.logging.g.g("Crypto");

    /* renamed from: b  reason: collision with root package name */
    private KeyStore f60696b;

    static {
        Security.addProvider(new BouncyCastleProvider());
        f60694d = null;
    }

    private a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f60696b = keyStore;
            keyStore.load(null);
        } catch (Exception e11) {
            this.f60695a.d("Could not create key store", e11);
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private void b(Context context) {
        if (this.f60696b.containsAlias("KeyStorePassKey")) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 30);
        KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias("KeyStorePassKey").setSubject(new X500Principal("CN=localhost")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setKeySize(2048).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(build);
        keyPairGenerator.generateKeyPair();
    }

    private String c(String str) {
        PrivateKey privateKey;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                privateKey = (PrivateKey) this.f60696b.getKey("KeyStorePassKey", null);
            } else {
                privateKey = ((KeyStore.PrivateKeyEntry) this.f60696b.getEntry("KeyStorePassKey", null)).getPrivateKey();
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            synchronized (this) {
                cipher.init(2, privateKey);
                CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(b.a(str)), cipher);
                while (true) {
                    int read = cipherInputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            }
            return byteArrayOutputStream.toString("UTF-8");
        } catch (Exception e11) {
            this.f60695a.d("Failed to decrypt text", e11);
            return null;
        }
    }

    public static void d(Context context) {
        try {
            context.deleteFile(f60693c);
        } catch (Exception unused) {
        }
    }

    public static byte[] f(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            byte[] encoded = keyAgreement.generateSecret("AES").getEncoded();
            if (encoded != null) {
                MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
                messageDigest.update(encoded);
                return Arrays.copyOfRange(messageDigest.digest(), 0, 16);
            }
            return null;
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("Crypto", "Failed to do key exchange / generate shared secret", e11);
            return null;
        }
    }

    private String g(String str) {
        RSAPublicKey rSAPublicKey;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                rSAPublicKey = (RSAPublicKey) this.f60696b.getCertificate("KeyStorePassKey").getPublicKey();
            } else {
                rSAPublicKey = (RSAPublicKey) ((KeyStore.PrivateKeyEntry) this.f60696b.getEntry("KeyStorePassKey", null)).getCertificate().getPublicKey();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            synchronized (this) {
                cipher.init(1, rSAPublicKey);
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
                cipherOutputStream.write(str.getBytes("UTF-8"));
                cipherOutputStream.close();
            }
            return b.c(byteArrayOutputStream.toByteArray(), false);
        } catch (Exception e11) {
            this.f60695a.d("Failed to encrypt text", e11);
            return null;
        }
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        System.currentTimeMillis();
        try {
            AEADParameters aEADParameters = new AEADParameters(new KeyParameter(bArr2), 128, bArr3, bArr4);
            GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(new AESEngine());
            gCMBlockCipher.init(true, aEADParameters);
            byte[] bArr5 = new byte[gCMBlockCipher.getOutputSize(bArr.length)];
            gCMBlockCipher.doFinal(bArr5, gCMBlockCipher.processBytes(bArr, 0, bArr.length, bArr5, 0));
            return bArr5;
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("Crypto", "Failed to encrypt message", e11);
            return null;
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        try {
            byte[] bArr3 = new byte[4];
            new SecureRandom().nextBytes(bArr3);
            bArr2[0] = bArr3[0];
            bArr2[1] = bArr3[1];
            bArr2[2] = bArr3[2];
            bArr2[3] = bArr3[3];
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            synchronized (a.class) {
                cipher.init(1, secretKeySpec);
                doFinal = cipher.doFinal(bArr2);
            }
            return doFinal;
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("Crypto", "encryptWithSharedSecret : Failed to encrypt message", e11);
            return null;
        }
    }

    private static X509Certificate j(KeyPair keyPair, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(1, 30);
        X509V3CertificateGenerator x509V3CertificateGenerator = new X509V3CertificateGenerator();
        x509V3CertificateGenerator.setSerialNumber(BigInteger.valueOf(1L));
        x509V3CertificateGenerator.setSubjectDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setIssuerDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setPublicKey(keyPair.getPublic());
        x509V3CertificateGenerator.setNotBefore(new Date());
        x509V3CertificateGenerator.setNotAfter(calendar.getTime());
        x509V3CertificateGenerator.setSignatureAlgorithm(str);
        try {
            return x509V3CertificateGenerator.generate(keyPair.getPrivate(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("Crypto", "Failed to generate certificate for key", e11);
            return null;
        }
    }

    public static KeyPair k() {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("prime256v1");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(eCGenParameterSpec, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }

    public static a l() {
        if (f60694d == null) {
            synchronized (a.class) {
                if (f60694d == null) {
                    f60694d = new a();
                }
            }
        }
        return f60694d;
    }

    private String m(Context context) {
        b(context);
        String q11 = z.p(context).q();
        if (q11 == null) {
            String bigInteger = new BigInteger((int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, new SecureRandom()).toString();
            z.p(context).K(g(bigInteger));
            return bigInteger;
        }
        return c(q11);
    }

    public static byte[] q(PublicKey publicKey, int i11) {
        try {
            return Arrays.copyOf(MessageDigest.getInstance("SHA1").digest(t(publicKey)), i11);
        } catch (NoSuchAlgorithmException e11) {
            TeslaLog.INSTANCE.e("Crypto", "Failed to compute SHA1 hash of public key", e11);
            return null;
        }
    }

    public static FileInputStream r(Context context) {
        try {
            File fileStreamPath = context.getFileStreamPath(f60693c);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                return context.openFileInput(f60693c);
            }
        } catch (FileNotFoundException unused) {
        }
        return null;
    }

    public static FileOutputStream s(Context context) {
        try {
            return context.openFileOutput(f60693c, 0);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static byte[] t(PublicKey publicKey) {
        byte[] encoded = publicKey.getEncoded();
        return Arrays.copyOfRange(encoded, 26, encoded.length);
    }

    private String u(String str) {
        return String.format("PHONE_AUTH_%s_KEY_PAIR", str).toLowerCase(Locale.US);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    public boolean e(String str, Context context) {
        FileOutputStream fileOutputStream;
        char[] charArray;
        ?? keyStore;
        ?? r11;
        FileOutputStream fileOutputStream2 = null;
        try {
            charArray = m(context).toCharArray();
            keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            r11 = r(context);
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            keyStore.load(r11, charArray);
            keyStore.deleteEntry(str);
            fileOutputStream2 = s(context);
            keyStore.store(fileOutputStream2, charArray);
            a(r11);
            a(fileOutputStream2);
            return true;
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = r11;
            try {
                this.f60695a.d("Failed to delete RSA keystore", e);
                a(fileOutputStream2);
                a(fileOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = r11;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
    }

    public KeyPair n(String str, Context context) {
        FileInputStream fileInputStream;
        String u11 = u(str);
        System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
        char[] charArray = m(context).toCharArray();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = r(context);
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a(fileInputStream2);
            throw th;
        }
        try {
            try {
                keyStore.load(fileInputStream, charArray);
                Key key = keyStore.getKey(u11, charArray);
                if (key == null) {
                    a(fileInputStream);
                    return null;
                }
                KeyPair keyPair = new KeyPair(keyStore.getCertificate(u11).getPublicKey(), (PrivateKey) key);
                a(fileInputStream);
                return keyPair;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                a(fileInputStream2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            this.f60695a.d("Failed to get local keypair -deleting", e);
            d(context);
            a(fileInputStream);
            return null;
        }
    }

    public KeyPair o(String str, Context context) {
        FileInputStream fileInputStream;
        System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
        char[] charArray = m(context).toCharArray();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = r(context);
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a(fileInputStream2);
            throw th;
        }
        try {
            try {
                keyStore.load(fileInputStream, charArray);
                Key key = keyStore.getKey(str, charArray);
                if (key == null) {
                    a(fileInputStream);
                    return null;
                }
                KeyPair keyPair = new KeyPair(keyStore.getCertificate(str).getPublicKey(), (PrivateKey) key);
                a(fileInputStream);
                return keyPair;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                a(fileInputStream2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            this.f60695a.d("Failed to get local RSA keypair -deleting", e);
            d(context);
            a(fileInputStream);
            return null;
        }
    }

    public PublicKey p(byte[] bArr) {
        try {
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
            KeyFactory keyFactory = KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
            ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec("prime256v1", parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN());
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(ECPointUtil.decodePoint(eCNamedCurveSpec.getCurve(), bArr), eCNamedCurveSpec));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    public boolean v(KeyPair keyPair, String str, Context context) {
        FileOutputStream fileOutputStream;
        String u11 = u(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            X509Certificate j11 = j(keyPair, "ECDSAWITHSHA1");
            if (j11 == null) {
                a(null);
                a(null);
                return false;
            }
            char[] charArray = m(context).toCharArray();
            ?? keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            ?? r11 = r(context);
            try {
                keyStore.load(r11, charArray);
                keyStore.setKeyEntry(u11, keyPair.getPrivate(), charArray, new Certificate[]{j11});
                fileOutputStream2 = s(context);
                keyStore.store(fileOutputStream2, charArray);
                a(r11);
                a(fileOutputStream2);
                return true;
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = r11;
                try {
                    this.f60695a.d("Failed to store keystore", e);
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = r11;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    public boolean w(KeyPair keyPair, String str, Context context) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            X509Certificate j11 = j(keyPair, "SHA512WithRSAEncryption");
            if (j11 == null) {
                a(null);
                a(null);
                return false;
            }
            char[] charArray = m(context).toCharArray();
            ?? keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            ?? r11 = r(context);
            try {
                keyStore.load(r11, charArray);
                keyStore.setKeyEntry(str, keyPair.getPrivate(), charArray, new Certificate[]{j11});
                fileOutputStream2 = s(context);
                keyStore.store(fileOutputStream2, charArray);
                a(r11);
                a(fileOutputStream2);
                return true;
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = r11;
                try {
                    this.f60695a.d("Failed to store RSA keystore", e);
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = r11;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}