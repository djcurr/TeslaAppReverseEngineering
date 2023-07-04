package j6;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.openssl.PEMParser;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemReader;
import org.spongycastle.util.io.pem.PemWriter;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    public static Charset f33239e;

    /* renamed from: a  reason: collision with root package name */
    private String f33240a;

    /* renamed from: b  reason: collision with root package name */
    private PublicKey f33241b;

    /* renamed from: c  reason: collision with root package name */
    private PrivateKey f33242c;

    /* renamed from: d  reason: collision with root package name */
    private PKCS10CertificationRequest f33243d;

    public c() {
        x();
    }

    private boolean C(byte[] bArr, byte[] bArr2, String str) {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(this.f33241b);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    private String a(String str, byte[] bArr) {
        PemObject pemObject = new PemObject(str, bArr);
        StringWriter stringWriter = new StringWriter();
        PemWriter pemWriter = new PemWriter(stringWriter);
        pemWriter.writeObject(pemObject);
        pemWriter.close();
        return stringWriter.toString();
    }

    private byte[] c(byte[] bArr) {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(2, this.f33242c);
        return cipher.doFinal(bArr);
    }

    private byte[] g(byte[] bArr) {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(1, this.f33241b);
        return cipher.doFinal(bArr);
    }

    private byte[] q(String str) {
        return new PemReader(new StringReader(str)).readPemObject().getContent();
    }

    private PrivateKey r(byte[] bArr) {
        RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(new ASN1InputStream(bArr).readObject());
        return KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent()));
    }

    private PublicKey s(String str) {
        StringReader stringReader;
        StringReader stringReader2 = null;
        try {
            stringReader = new StringReader(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(((SubjectPublicKeyInfo) new PEMParser(stringReader).readObject()).getEncoded()));
            stringReader.close();
            return generatePublic;
        } catch (Throwable th3) {
            th = th3;
            stringReader2 = stringReader;
            if (stringReader2 != null) {
                stringReader2.close();
            }
            throw th;
        }
    }

    private byte[] t(PrivateKey privateKey) {
        return PrivateKeyInfo.getInstance(privateKey.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded();
    }

    private byte[] u(PublicKey publicKey) {
        return SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).parsePublicKey().getEncoded();
    }

    private void x() {
        if (Build.VERSION.SDK_INT >= 19) {
            f33239e = StandardCharsets.UTF_8;
        } else {
            f33239e = Charset.forName("UTF-8");
        }
    }

    private String z(byte[] bArr, String str) {
        Signature signature = Signature.getInstance(str);
        signature.initSign(this.f33242c);
        signature.update(bArr);
        return Base64.encodeToString(signature.sign(), 0);
    }

    public String A(String str, String str2) {
        return z(Base64.decode(str, 0), str2);
    }

    public boolean B(String str, String str2, String str3) {
        Signature.getInstance(str3).initVerify(this.f33241b);
        return C(Base64.decode(str, 0), str2.getBytes(f33239e), str3);
    }

    public boolean D(String str, String str2, String str3) {
        Signature.getInstance(str3).initVerify(this.f33241b);
        return C(Base64.decode(str, 0), Base64.decode(str2, 0), str3);
    }

    public String b(String str) {
        return new String(c(Base64.decode(str, 0)), f33239e);
    }

    public String d(String str) {
        return Base64.encodeToString(c(Base64.decode(str, 0)), 0);
    }

    public void e() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f33240a);
        this.f33242c = null;
        this.f33241b = null;
    }

    public String f(String str) {
        return Base64.encodeToString(g(str.getBytes(f33239e)), 0);
    }

    public String h(String str) {
        return Base64.encodeToString(g(Base64.decode(str, 0)), 0);
    }

    public void i(int i11) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i11);
        KeyPair genKeyPair = keyPairGenerator.genKeyPair();
        this.f33241b = genKeyPair.getPublic();
        this.f33242c = genKeyPair.getPrivate();
    }

    public void j(String str, int i11, Context context) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 15).setKeySize(i11).setDigests(McElieceCCA2KeyGenParameterSpec.SHA256, McElieceCCA2KeyGenParameterSpec.SHA512, McElieceCCA2KeyGenParameterSpec.SHA1).setEncryptionPaddings("PKCS1Padding").setSignaturePaddings("PKCS1").build());
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            KeyPairGeneratorSpec.Builder endDate = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal(String.format("CN=%s, OU=%s", str, context.getPackageName()))).setSerialNumber(BigInteger.ONE).setStartDate(Calendar.getInstance().getTime()).setEndDate(calendar.getTime());
            if (i12 >= 19) {
                endDate.setKeySize(i11).setKeyType("RSA");
            }
            keyPairGenerator.initialize(endDate.build());
        }
        this.f33241b = keyPairGenerator.genKeyPair().getPublic();
    }

    public void k(String str, String str2, Context context) {
        this.f33243d = a.a(this.f33241b, str, this.f33240a, str2);
    }

    public void l(String str, String str2, int i11, Context context) {
        e();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str2, 12).setDigests(McElieceCCA2KeyGenParameterSpec.SHA256, McElieceCCA2KeyGenParameterSpec.SHA512, McElieceCCA2KeyGenParameterSpec.SHA384, "NONE").setKeySize(i11).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setEncryptionPaddings("PKCS7Padding").build());
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            KeyPairGeneratorSpec.Builder endDate = new KeyPairGeneratorSpec.Builder(context).setAlias(str2).setSubject(new X500Principal(String.format("CN=%s", str2, context.getPackageName()))).setSerialNumber(BigInteger.ONE).setStartDate(Calendar.getInstance().getTime()).setEndDate(calendar.getTime());
            if (i12 >= 19) {
                endDate.setKeySize(i11).setKeyType("EC");
            }
            keyPairGenerator.initialize(endDate.build());
        }
        PublicKey publicKey = keyPairGenerator.genKeyPair().getPublic();
        this.f33241b = publicKey;
        try {
            this.f33243d = a.b(publicKey, str, str2);
        } catch (OperatorCreationException e11) {
            e11.printStackTrace();
        }
    }

    public String m() {
        return a("CERTIFICATE REQUEST", this.f33243d.getEncoded());
    }

    public String n() {
        return a("RSA PRIVATE KEY", t(this.f33242c));
    }

    public String o() {
        return a("RSA PUBLIC KEY", u(this.f33241b));
    }

    public void p() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(this.f33240a, null);
        if (privateKeyEntry != null) {
            this.f33242c = privateKeyEntry.getPrivateKey();
            this.f33241b = privateKeyEntry.getCertificate().getPublicKey();
        }
    }

    public void v(String str) {
        this.f33242c = r(q(str));
    }

    public void w(String str) {
        this.f33241b = s(str);
    }

    public String y(String str, String str2) {
        return z(str.getBytes(f33239e), str2);
    }

    public c(String str) {
        x();
        this.f33240a = str;
        p();
    }
}