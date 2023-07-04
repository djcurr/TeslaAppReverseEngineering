package org.bouncycastle.jcajce.provider.keystore.bcfks;

import e50.b;
import e50.y0;
import e60.a;
import f50.o;
import g40.e;
import g40.i;
import i50.z;
import i60.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import n50.a0;
import n50.x;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.crypto.w;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;
import u50.b1;
import w40.f;
import w40.g;
import w40.h;
import w40.l;
import w40.n;
import w40.p;
import z50.d;
import z50.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, k> oidMap;
    private static final Map<k, String> publicAlgMap;
    private Date creationDate;
    private final c helper;
    private b hmacAlgorithm;
    private h hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private b signatureAlgorithm;
    private a.InterfaceC0480a validator;
    private PublicKey verificationKey;
    private final Map<String, e> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private k storeEncryptionAlgorithm = r40.b.P;

    /* loaded from: classes5.dex */
    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new i60.b());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes5.dex */
    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new i60.b(), new BcFKSKeyStoreSpi(new i60.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new i60.b());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes5.dex */
    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new i60.b(), new BcFKSKeyStoreSpi(new i60.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* loaded from: classes5.dex */
    private static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements n, y0 {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(c cVar) {
            super(cVar);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                cVar.createSecureRandom("DEFAULT").nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e11) {
                throw new IllegalArgumentException("can't create random - " + e11.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) {
            return a0.i(cArr != null ? org.bouncycastle.util.a.p(m.j(cArr), m.i(str)) : org.bouncycastle.util.a.p(this.seedKey, m.i(str)), this.seedKey, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) {
            try {
                byte[] calculateMac = calculateMac(str, cArr);
                if (!this.cache.containsKey(str) || org.bouncycastle.util.a.u(this.cache.get(str), calculateMac)) {
                    Key engineGetKey = super.engineGetKey(str, cArr);
                    if (engineGetKey != null && !this.cache.containsKey(str)) {
                        this.cache.put(str, calculateMac);
                    }
                    return engineGetKey;
                }
                throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
            } catch (InvalidKeyException e11) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e11.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    /* loaded from: classes5.dex */
    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new i60.a());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes5.dex */
    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new i60.b(), new BcFKSKeyStoreSpi(new i60.a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new i60.a());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes5.dex */
    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new i60.a(), new BcFKSKeyStoreSpi(new i60.a()));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        k kVar = v40.b.f54050e;
        hashMap.put("DESEDE", kVar);
        hashMap.put("TRIPLEDES", kVar);
        hashMap.put("TDEA", kVar);
        hashMap.put("HMACSHA1", n.f55524a2);
        hashMap.put("HMACSHA224", n.f55527c2);
        hashMap.put("HMACSHA256", n.f55529d2);
        hashMap.put("HMACSHA384", n.f55531e2);
        hashMap.put("HMACSHA512", n.f55533f2);
        hashMap.put("SEED", p40.a.f46196a);
        hashMap.put("CAMELLIA.128", t40.a.f51628a);
        hashMap.put("CAMELLIA.192", t40.a.f51629b);
        hashMap.put("CAMELLIA.256", t40.a.f51630c);
        hashMap.put("ARIA.128", s40.a.f50264e);
        hashMap.put("ARIA.192", s40.a.f50268i);
        hashMap.put("ARIA.256", s40.a.f50272m);
        hashMap2.put(n.f55541n1, "RSA");
        hashMap2.put(o.f25891h0, "EC");
        hashMap2.put(v40.b.f54054i, "DH");
        hashMap2.put(n.G1, "DH");
        hashMap2.put(o.N0, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(c cVar) {
        this.helper = cVar;
    }

    private byte[] calculateMac(byte[] bArr, b bVar, h hVar, char[] cArr) {
        String t11 = bVar.e().t();
        Mac createMac = this.helper.createMac(t11);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            createMac.init(new SecretKeySpec(generateKey(hVar, "INTEGRITY_CHECK", cArr, -1), t11));
            return createMac.doFinal(bArr);
        } catch (InvalidKeyException e11) {
            throw new IOException("Cannot set up MAC calculation: " + e11.getMessage());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) {
        Cipher createCipher = this.helper.createCipher(str);
        createCipher.init(1, new SecretKeySpec(bArr, "AES"));
        return createCipher;
    }

    private g40.c createPrivateKeySequence(f fVar, Certificate[] certificateArr) {
        e50.n[] nVarArr = new e50.n[certificateArr.length];
        for (int i11 = 0; i11 != certificateArr.length; i11++) {
            nVarArr[i11] = e50.n.f(certificateArr[i11].getEncoded());
        }
        return new g40.c(fVar, nVarArr);
    }

    private Certificate decodeCertificate(Object obj) {
        c cVar = this.helper;
        if (cVar != null) {
            try {
                return cVar.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(e50.n.f(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e50.n.f(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, b bVar, char[] cArr, byte[] bArr) {
        Cipher createCipher;
        AlgorithmParameters algorithmParameters;
        if (bVar.e().j(n.O1)) {
            w40.k f11 = w40.k.f(bVar.i());
            g e11 = f11.e();
            try {
                if (e11.e().j(r40.b.P)) {
                    createCipher = this.helper.createCipher("AES/CCM/NoPadding");
                    algorithmParameters = this.helper.createAlgorithmParameters("CCM");
                    algorithmParameters.init(b60.a.f(e11.h()).getEncoded());
                } else if (!e11.e().j(r40.b.Q)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                } else {
                    createCipher = this.helper.createCipher("AESKWP");
                    algorithmParameters = null;
                }
                h h11 = f11.h();
                if (cArr == null) {
                    cArr = new char[0];
                }
                createCipher.init(2, new SecretKeySpec(generateKey(h11, str, cArr, 32), "AES"), algorithmParameters);
                return createCipher.doFinal(bArr);
            } catch (IOException e12) {
                throw e12;
            } catch (Exception e13) {
                throw new IOException(e13.toString());
            }
        }
        throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
    }

    private Date extractCreationDate(e eVar, Date date) {
        try {
            return eVar.e().s();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(h hVar, String str, char[] cArr, int i11) {
        byte[] PKCS12PasswordToBytes = w.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = w.PKCS12PasswordToBytes(str.toCharArray());
        if (q40.c.f47479y.j(hVar.e())) {
            q40.f h11 = q40.f.h(hVar.h());
            if (h11.i() != null) {
                i11 = h11.i().intValue();
            } else if (i11 == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return a0.i(org.bouncycastle.util.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), h11.k(), h11.f().intValue(), h11.e().intValue(), h11.e().intValue(), i11);
        } else if (hVar.e().j(n.P1)) {
            l e11 = l.e(hVar.h());
            if (e11.h() != null) {
                i11 = e11.h().intValue();
            } else if (i11 == -1) {
                throw new IOException("no keyLength found in PBKDF2Params");
            }
            if (e11.i().e().j(n.f55533f2)) {
                x xVar = new x(new i50.a0());
                xVar.init(org.bouncycastle.util.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), e11.j(), e11.f().intValue());
                return ((b1) xVar.generateDerivedParameters(i11 * 8)).a();
            } else if (e11.i().e().j(r40.b.f49162r)) {
                x xVar2 = new x(new z(512));
                xVar2.init(org.bouncycastle.util.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), e11.j(), e11.f().intValue());
                return ((b1) xVar2.generateDerivedParameters(i11 * 8)).a();
            } else {
                throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + e11.i().e());
            }
        } else {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
    }

    private h generatePkbdAlgorithmIdentifier(k kVar, int i11) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        k kVar2 = n.P1;
        if (kVar2.j(kVar)) {
            return new h(kVar2, new l(bArr, 51200, i11, new b(n.f55533f2, q0.f43085a)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + kVar);
    }

    private h generatePkbdAlgorithmIdentifier(h hVar, int i11) {
        k kVar = q40.c.f47479y;
        boolean j11 = kVar.j(hVar.e());
        e40.b h11 = hVar.h();
        if (j11) {
            q40.f h12 = q40.f.h(h11);
            byte[] bArr = new byte[h12.k().length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new h(kVar, new q40.f(bArr, h12.f(), h12.e(), h12.j(), BigInteger.valueOf(i11)));
        }
        l e11 = l.e(h11);
        byte[] bArr2 = new byte[e11.j().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new h(n.P1, new l(bArr2, e11.f().intValue(), i11, e11.i()));
    }

    private h generatePkbdAlgorithmIdentifier(z50.e eVar, int i11) {
        k kVar = q40.c.f47479y;
        if (kVar.j(eVar.a())) {
            j jVar = (j) eVar;
            byte[] bArr = new byte[jVar.e()];
            getDefaultSecureRandom().nextBytes(bArr);
            return new h(kVar, new q40.f(bArr, jVar.c(), jVar.b(), jVar.d(), i11));
        }
        d dVar = (d) eVar;
        byte[] bArr2 = new byte[dVar.d()];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new h(n.P1, new l(bArr2, dVar.b(), i11, dVar.c()));
    }

    private b generateSignatureAlgId(Key key, a.d dVar) {
        if (key == null) {
            return null;
        }
        if (key instanceof k60.a) {
            if (dVar == a.d.SHA512withECDSA) {
                return new b(o.f25896m0);
            }
            if (dVar == a.d.SHA3_512withECDSA) {
                return new b(r40.b.f49144d0);
            }
        }
        if (key instanceof DSAKey) {
            if (dVar == a.d.SHA512withDSA) {
                return new b(r40.b.V);
            }
            if (dVar == a.d.SHA3_512withDSA) {
                return new b(r40.b.Z);
            }
        }
        if (key instanceof RSAKey) {
            if (dVar == a.d.SHA512withRSA) {
                return new b(n.B1, q0.f43085a);
            }
            if (dVar == a.d.SHA3_512withRSA) {
                return new b(r40.b.f49152h0, q0.f43085a);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        return org.bouncycastle.crypto.k.b();
    }

    private g40.b getEncryptedObjectStoreData(b bVar, char[] cArr) {
        e[] eVarArr = (e[]) this.entries.values().toArray(new e[this.entries.size()]);
        h generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        g40.h hVar = new g40.h(bVar, this.creationDate, this.lastModifiedDate, new g40.f(eVarArr), null);
        try {
            k kVar = this.storeEncryptionAlgorithm;
            k kVar2 = r40.b.P;
            if (!kVar.j(kVar2)) {
                return new g40.b(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier, new g(r40.b.Q))), createCipher("AESKWP", generateKey).doFinal(hVar.getEncoded()));
            }
            Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
            return new g40.b(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier, new g(kVar2, b60.a.f(createCipher.getParameters().getEncoded())))), createCipher.doFinal(hVar.getEncoded()));
        } catch (InvalidKeyException e11) {
            throw new IOException(e11.toString());
        } catch (NoSuchProviderException e12) {
            throw new IOException(e12.toString());
        } catch (BadPaddingException e13) {
            throw new IOException(e13.toString());
        } catch (IllegalBlockSizeException e14) {
            throw new IOException(e14.toString());
        } catch (NoSuchPaddingException e15) {
            throw new NoSuchAlgorithmException(e15.toString());
        }
    }

    private static String getPublicKeyAlg(k kVar) {
        String str = publicAlgMap.get(kVar);
        return str != null ? str : kVar.t();
    }

    private boolean isSimilarHmacPbkd(z50.e eVar, h hVar) {
        if (eVar.a().j(hVar.e())) {
            if (q40.c.f47479y.j(hVar.e())) {
                if (eVar instanceof j) {
                    j jVar = (j) eVar;
                    q40.f h11 = q40.f.h(hVar.h());
                    return jVar.e() == h11.k().length && jVar.b() == h11.e().intValue() && jVar.c() == h11.f().intValue() && jVar.d() == h11.j().intValue();
                }
                return false;
            } else if (eVar instanceof d) {
                d dVar = (d) eVar;
                l e11 = l.e(hVar.h());
                return dVar.d() == e11.j().length && dVar.b() == e11.f().intValue();
            } else {
                return false;
            }
        }
        return false;
    }

    private void verifyMac(byte[] bArr, g40.j jVar, char[] cArr) {
        if (!org.bouncycastle.util.a.u(calculateMac(bArr, jVar.h(), jVar.i(), cArr), jVar.f())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
        }
    }

    private void verifySig(e40.b bVar, g40.l lVar, PublicKey publicKey) {
        Signature createSignature = this.helper.createSignature(lVar.i().e().t());
        createSignature.initVerify(publicKey);
        createSignature.update(bVar.toASN1Primitive().d(ASN1Encoding.DER));
        if (!createSignature.verify(lVar.h().r())) {
            throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it2 = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it2.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it2.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        Objects.requireNonNull(str, "alias value is null");
        return this.entries.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (eVar.k().equals(PRIVATE_KEY) || eVar.k().equals(PROTECTED_PRIVATE_KEY)) {
                return decodeCertificate(g40.c.h(eVar.f()).e()[0]);
            }
            if (eVar.k().equals(CERTIFICATE)) {
                return decodeCertificate(eVar.f());
            }
            return null;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                e eVar = this.entries.get(str);
                if (eVar.k().equals(CERTIFICATE)) {
                    if (org.bouncycastle.util.a.c(eVar.f(), encoded)) {
                        return str;
                    }
                } else if (eVar.k().equals(PRIVATE_KEY) || eVar.k().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (org.bouncycastle.util.a.c(g40.c.h(eVar.f()).e()[0].toASN1Primitive().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (eVar.k().equals(PRIVATE_KEY) || eVar.k().equals(PROTECTED_PRIVATE_KEY)) {
                e50.n[] e11 = g40.c.h(eVar.f()).e();
                int length = e11.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i11 = 0; i11 != length; i11++) {
                    x509CertificateArr[i11] = decodeCertificate(e11[i11]);
                }
                return x509CertificateArr;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            try {
                return eVar.j().s();
            } catch (ParseException unused) {
                return new Date();
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (eVar.k().equals(PRIVATE_KEY) || eVar.k().equals(PROTECTED_PRIVATE_KEY)) {
                PrivateKey privateKey = this.privateKeyCache.get(str);
                if (privateKey != null) {
                    return privateKey;
                }
                f h11 = f.h(g40.c.h(eVar.f()).f());
                try {
                    p f11 = p.f(decryptData("PRIVATE_KEY_ENCRYPTION", h11.f(), cArr, h11.e()));
                    PrivateKey generatePrivate = this.helper.createKeyFactory(getPublicKeyAlg(f11.i().e())).generatePrivate(new PKCS8EncodedKeySpec(f11.getEncoded()));
                    this.privateKeyCache.put(str, generatePrivate);
                    return generatePrivate;
                } catch (Exception e11) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e11.getMessage());
                }
            } else if (!eVar.k().equals(SECRET_KEY) && !eVar.k().equals(PROTECTED_SECRET_KEY)) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
            } else {
                g40.d f12 = g40.d.f(eVar.f());
                try {
                    g40.k e12 = g40.k.e(decryptData("SECRET_KEY_ENCRYPTION", f12.h(), cArr, f12.e()));
                    return this.helper.createSecretKeyFactory(e12.f().t()).generateSecret(new SecretKeySpec(e12.h(), e12.f().t()));
                } catch (Exception e13) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e13.getMessage());
                }
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            return eVar.k().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            BigInteger k11 = eVar.k();
            return k11.equals(PRIVATE_KEY) || k11.equals(SECRET_KEY) || k11.equals(PROTECTED_PRIVATE_KEY) || k11.equals(PROTECTED_SECRET_KEY);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        b i11;
        e40.b h11;
        PublicKey publicKey;
        g40.h f11;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new b(n.f55533f2, q0.f43085a);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(n.P1, 64);
            return;
        }
        try {
            g40.g e11 = g40.g.e(new org.bouncycastle.asn1.h(inputStream).D());
            i f12 = e11.f();
            if (f12.h() == 0) {
                g40.j e12 = g40.j.e(f12.f());
                this.hmacAlgorithm = e12.h();
                this.hmacPkbdAlgorithm = e12.i();
                i11 = this.hmacAlgorithm;
                try {
                    verifyMac(e11.h().toASN1Primitive().getEncoded(), e12, cArr);
                } catch (NoSuchProviderException e13) {
                    throw new IOException(e13.getMessage());
                }
            } else if (f12.h() != 1) {
                throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
            } else {
                g40.l f13 = g40.l.f(f12.f());
                i11 = f13.i();
                try {
                    e50.n[] e14 = f13.e();
                    if (this.validator == null) {
                        h11 = e11.h();
                        publicKey = this.verificationKey;
                    } else if (e14 == null) {
                        throw new IOException("validator specified but no certifcates in store");
                    } else {
                        CertificateFactory createCertificateFactory = this.helper.createCertificateFactory("X.509");
                        int length = e14.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i12 = 0; i12 != length; i12++) {
                            x509CertificateArr[i12] = (X509Certificate) createCertificateFactory.generateCertificate(new ByteArrayInputStream(e14[i12].getEncoded()));
                        }
                        if (!this.validator.a(x509CertificateArr)) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        h11 = e11.h();
                        publicKey = x509CertificateArr[0].getPublicKey();
                    }
                    verifySig(h11, f13, publicKey);
                } catch (GeneralSecurityException e15) {
                    throw new IOException("error verifying signature: " + e15.getMessage(), e15);
                }
            }
            e40.b h12 = e11.h();
            if (h12 instanceof g40.b) {
                g40.b bVar = (g40.b) h12;
                f11 = g40.h.f(decryptData("STORE_ENCRYPTION", bVar.f(), cArr, bVar.e().r()));
            } else {
                f11 = g40.h.f(h12);
            }
            try {
                this.creationDate = f11.e().s();
                this.lastModifiedDate = f11.i().s();
                if (!f11.h().equals(i11)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<e40.b> it2 = f11.j().iterator();
                while (it2.hasNext()) {
                    e i13 = e.i(it2.next());
                    this.entries.put(i13.h(), i13);
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e16) {
            throw new IOException(e16.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (!(loadStoreParameter instanceof a)) {
            if (loadStoreParameter instanceof e60.c) {
                engineLoad(((e60.c) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        } else {
            a aVar = (a) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(aVar);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
            this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? r40.b.P : r40.b.Q;
            this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(n.f55533f2, q0.f43085a) : new b(r40.b.f49162r, q0.f43085a);
            this.verificationKey = (PublicKey) aVar.i();
            this.validator = aVar.c();
            this.signatureAlgorithm = generateSignatureAlgId(this.verificationKey, aVar.h());
            k kVar = this.storeEncryptionAlgorithm;
            InputStream a11 = aVar.a();
            engineLoad(a11, extractPassword);
            if (a11 != null) {
                if (!isSimilarHmacPbkd(aVar.g(), this.hmacPkbdAlgorithm) || !kVar.j(this.storeEncryptionAlgorithm)) {
                    throw new IOException("configuration parameters do not match existing store");
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        Date date;
        e eVar = this.entries.get(str);
        Date date2 = new Date();
        if (eVar == null) {
            date = date2;
        } else if (!eVar.k().equals(CERTIFICATE)) {
            throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
        } else {
            date = extractCreationDate(eVar, date2);
        }
        try {
            this.entries.put(str, new e(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e11) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e11.getMessage(), e11);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        g40.k kVar;
        g40.d dVar;
        f fVar;
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                h generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(n.P1, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                k kVar2 = this.storeEncryptionAlgorithm;
                k kVar3 = r40.b.P;
                if (kVar2.j(kVar3)) {
                    Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                    fVar = new f(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier, new g(kVar3, b60.a.f(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                } else {
                    fVar = new f(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier, new g(r40.b.Q))), createCipher("AESKWP", generateKey).doFinal(encoded));
                }
                this.entries.put(str, new e(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(fVar, certificateArr).getEncoded(), null));
            } catch (Exception e11) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e11.toString(), e11);
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else {
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                h generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(n.P1, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String k11 = m.k(key.getAlgorithm());
                if (k11.indexOf("AES") > -1) {
                    kVar = new g40.k(r40.b.f49163s, encoded2);
                } else {
                    Map<String, k> map = oidMap;
                    k kVar4 = map.get(k11);
                    if (kVar4 != null) {
                        kVar = new g40.k(kVar4, encoded2);
                    } else {
                        k kVar5 = map.get(k11 + "." + (encoded2.length * 8));
                        if (kVar5 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + k11 + ") for storage.");
                        }
                        kVar = new g40.k(kVar5, encoded2);
                    }
                }
                k kVar6 = this.storeEncryptionAlgorithm;
                k kVar7 = r40.b.P;
                if (kVar6.j(kVar7)) {
                    Cipher createCipher2 = createCipher("AES/CCM/NoPadding", generateKey2);
                    dVar = new g40.d(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier2, new g(kVar7, b60.a.f(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(kVar.getEncoded()));
                } else {
                    dVar = new g40.d(new b(n.O1, new w40.k(generatePkbdAlgorithmIdentifier2, new g(r40.b.Q))), createCipher("AESKWP", generateKey2).doFinal(kVar.getEncoded()));
                }
                this.entries.put(str, new e(SECRET_KEY, str, extractCreationDate, date, dVar.getEncoded(), null));
            } catch (Exception e12) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e12.toString(), e12);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        if (certificateArr != null) {
            try {
                f h11 = f.h(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new e(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(h11, certificateArr).getEncoded(), null));
                } catch (Exception e11) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e11.toString(), e11);
                }
            } catch (Exception e12) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e12);
            }
        } else {
            try {
                this.entries.put(str, new e(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, null));
            } catch (Exception e13) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e13.toString(), e13);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        h hVar;
        BigInteger h11;
        if (this.creationDate == null) {
            throw new IOException("KeyStore not initialized");
        }
        g40.b encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
        if (q40.c.f47479y.j(this.hmacPkbdAlgorithm.e())) {
            q40.f h12 = q40.f.h(this.hmacPkbdAlgorithm.h());
            hVar = this.hmacPkbdAlgorithm;
            h11 = h12.i();
        } else {
            l e11 = l.e(this.hmacPkbdAlgorithm.h());
            hVar = this.hmacPkbdAlgorithm;
            h11 = e11.h();
        }
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(hVar, h11.intValue());
        try {
            outputStream.write(new g40.g(encryptedObjectStoreData, new i(new g40.j(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchProviderException e12) {
            throw new IOException("cannot calculate mac: " + e12.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        g40.l lVar;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof e60.b) {
            e60.b bVar = (e60.b) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bVar.b(), 64);
            engineStore(bVar.a(), extractPassword);
        } else if (!(loadStoreParameter instanceof a)) {
            if (loadStoreParameter instanceof e60.c) {
                engineStore(((e60.c) loadStoreParameter).b(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        } else {
            a aVar = (a) loadStoreParameter;
            if (aVar.i() == null) {
                char[] extractPassword2 = ParameterUtil.extractPassword(aVar);
                this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
                this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? r40.b.P : r40.b.Q;
                this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(n.f55533f2, q0.f43085a) : new b(r40.b.f49162r, q0.f43085a);
                engineStore(aVar.b(), extractPassword2);
                return;
            }
            this.signatureAlgorithm = generateSignatureAlgId(aVar.i(), aVar.h());
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
            this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? r40.b.P : r40.b.Q;
            this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(n.f55533f2, q0.f43085a) : new b(r40.b.f49162r, q0.f43085a);
            g40.b encryptedObjectStoreData = getEncryptedObjectStoreData(this.signatureAlgorithm, ParameterUtil.extractPassword(aVar));
            try {
                Signature createSignature = this.helper.createSignature(this.signatureAlgorithm.e().t());
                createSignature.initSign((PrivateKey) aVar.i());
                createSignature.update(encryptedObjectStoreData.getEncoded());
                X509Certificate[] d11 = aVar.d();
                if (d11 != null) {
                    int length = d11.length;
                    e50.n[] nVarArr = new e50.n[length];
                    for (int i11 = 0; i11 != length; i11++) {
                        nVarArr[i11] = e50.n.f(d11[i11].getEncoded());
                    }
                    lVar = new g40.l(this.signatureAlgorithm, nVarArr, createSignature.sign());
                } else {
                    lVar = new g40.l(this.signatureAlgorithm, createSignature.sign());
                }
                aVar.b().write(new g40.g(encryptedObjectStoreData, new i(lVar)).getEncoded());
                aVar.b().flush();
            } catch (GeneralSecurityException e11) {
                throw new IOException("error creating signature: " + e11.getMessage(), e11);
            }
        }
    }
}