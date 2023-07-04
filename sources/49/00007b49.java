package j6;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;

/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0611a implements ContentSigner {

        /* renamed from: d  reason: collision with root package name */
        private static Map<String, AlgorithmIdentifier> f33235d;

        /* renamed from: a  reason: collision with root package name */
        private String f33236a;

        /* renamed from: b  reason: collision with root package name */
        private Signature f33237b;

        /* renamed from: c  reason: collision with root package name */
        private ByteArrayOutputStream f33238c;

        static {
            HashMap hashMap = new HashMap();
            f33235d = hashMap;
            hashMap.put("SHA256withECDSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10045.4.3.2")));
            f33235d.put("SHA256withRSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.1.11")));
            f33235d.put("SHA1withRSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5")));
        }

        public C0611a(String str, String str2) {
            this.f33236a = str.toLowerCase();
            try {
                KeyStore.Entry a11 = a(str2);
                this.f33238c = new ByteArrayOutputStream();
                this.f33237b = Signature.getInstance(str);
                this.f33237b.initSign(((KeyStore.PrivateKeyEntry) a11).getPrivateKey());
            } catch (IOException e11) {
                Log.e("generateCSR", "IOException: " + e11.getMessage());
                throw new IllegalArgumentException(e11.getMessage());
            } catch (GeneralSecurityException e12) {
                Log.e("generateCSR", "generateCSR: " + e12.getMessage());
                throw new IllegalArgumentException(e12.getMessage());
            }
        }

        public KeyStore.Entry a(String str) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        }

        @Override // org.spongycastle.operator.ContentSigner
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            AlgorithmIdentifier algorithmIdentifier = f33235d.get(this.f33236a);
            if (algorithmIdentifier != null) {
                return algorithmIdentifier;
            }
            throw new IllegalArgumentException("Does not support algo: " + this.f33236a);
        }

        @Override // org.spongycastle.operator.ContentSigner
        public OutputStream getOutputStream() {
            return this.f33238c;
        }

        @Override // org.spongycastle.operator.ContentSigner
        public byte[] getSignature() {
            try {
                this.f33237b.update(this.f33238c.toByteArray());
                return this.f33237b.sign();
            } catch (GeneralSecurityException e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    public static PKCS10CertificationRequest a(PublicKey publicKey, String str, String str2, String str3) {
        String format = String.format("CN=%s", str);
        C0611a c0611a = new C0611a(str3, str2);
        JcaPKCS10CertificationRequestBuilder jcaPKCS10CertificationRequestBuilder = new JcaPKCS10CertificationRequestBuilder(new X500Name(format), publicKey);
        jcaPKCS10CertificationRequestBuilder.addAttribute(PKCSObjectIdentifiers.pkcs_9_at_extensionRequest, new ExtensionsGenerator().generate());
        return jcaPKCS10CertificationRequestBuilder.build(c0611a);
    }

    public static PKCS10CertificationRequest b(PublicKey publicKey, String str, String str2) {
        return a(publicKey, str, str2, "SHA256withECDSA");
    }
}