package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import ch.qos.logback.core.joran.action.Action;
import e50.b;
import e50.l0;
import e50.m0;
import e50.r;
import e50.u;
import e50.y0;
import e60.i;
import h60.o;
import i60.a;
import i60.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.x0;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.cms.CMSEnvelopedGenerator;
import r70.f;
import r70.j;
import r70.m;
import w40.e;
import w40.l;
import w40.n;
import w40.v;

/* loaded from: classes5.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements n, y0 {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private k certAlgorithm;
    private CertificateFactory certFact;
    private k keyAlgorithm;
    private final c helper = new a();
    private IgnoresCaseHashtable keys = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable localIds = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable certs = new IgnoresCaseHashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = org.bouncycastle.crypto.k.b();
    private b macAlgorithm = new b(v40.b.f54051f, q0.f43085a);
    private int itCount = 102400;
    private int saltLength = 20;

    /* loaded from: classes5.dex */
    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new a(), new PKCS12KeyStoreSpi(new a(), n.X2, n.f55525a3));
        }
    }

    /* loaded from: classes5.dex */
    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BCPKCS12KeyStore3DES() {
            /*
                r4 = this;
                i60.a r0 = new i60.a
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                i60.a r2 = new i60.a
                r2.<init>()
                org.bouncycastle.asn1.k r3 = w40.n.X2
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.BCPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class CertId {

        /* renamed from: id  reason: collision with root package name */
        byte[] f43179id;

        CertId(PublicKey publicKey) {
            this.f43179id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).e();
        }

        CertId(byte[] bArr) {
            this.f43179id = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return org.bouncycastle.util.a.c(this.f43179id, ((CertId) obj).f43179id);
            }
            return false;
        }

        public int hashCode() {
            return org.bouncycastle.util.a.F(this.f43179id);
        }
    }

    /* loaded from: classes5.dex */
    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new i60.b(), new PKCS12KeyStoreSpi(new i60.b(), n.X2, n.f55525a3));
        }
    }

    /* loaded from: classes5.dex */
    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DefPKCS12KeyStore3DES() {
            /*
                r4 = this;
                i60.b r0 = new i60.b
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                i60.b r2 = new i60.b
                r2.<init>()
                org.bouncycastle.asn1.k r3 = w40.n.X2
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new k(CMSEnvelopedGenerator.CAST5_CBC), f.d(128));
            hashMap.put(n.S1, f.d(192));
            hashMap.put(r40.b.f49165u, f.d(128));
            hashMap.put(r40.b.C, f.d(192));
            hashMap.put(r40.b.K, f.d(256));
            hashMap.put(t40.a.f51628a, f.d(128));
            hashMap.put(t40.a.f51629b, f.d(192));
            hashMap.put(t40.a.f51630c, f.d(256));
            hashMap.put(i40.a.f29843f, f.d(256));
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(b bVar) {
            Integer num = (Integer) this.KEY_SIZES.get(bVar.e());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : m.g(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String g11 = str == null ? null : m.g(str);
            String str2 = (String) this.keys.get(g11);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(g11, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : m.g(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(c cVar, k kVar, k kVar2) {
        this.keyAlgorithm = kVar;
        this.certAlgorithm = kVar2;
        try {
            this.certFact = cVar.createCertificateFactory("X.509");
        } catch (Exception e11) {
            throw new IllegalArgumentException("can't create cert factory - " + e11.toString());
        }
    }

    private byte[] calculatePbeMac(k kVar, byte[] bArr, int i11, char[] cArr, boolean z11, byte[] bArr2) {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i11);
        Mac createMac = this.helper.createMac(kVar.t());
        createMac.init(new i(cArr, z11), pBEParameterSpec);
        createMac.update(bArr2);
        return createMac.doFinal();
    }

    private Cipher createCipher(int i11, char[] cArr, b bVar) {
        AlgorithmParameterSpec iVar;
        w40.k f11 = w40.k.f(bVar.i());
        l e11 = l.e(f11.h().h());
        b f12 = b.f(f11.e());
        SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory(f11.h().e().t());
        SecretKey generateSecret = e11.k() ? createSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, e11.j(), validateIterationCount(e11.f()), keySizeProvider.getKeySize(f12))) : createSecretKeyFactory.generateSecret(new o(cArr, e11.j(), validateIterationCount(e11.f()), keySizeProvider.getKeySize(f12), e11.i()));
        Cipher cipher = Cipher.getInstance(f11.e().e().t());
        e40.b h11 = f11.e().h();
        if (h11 instanceof org.bouncycastle.asn1.l) {
            iVar = new IvParameterSpec(org.bouncycastle.asn1.l.p(h11).r());
        } else {
            i40.c h12 = i40.c.h(h11);
            iVar = new h60.i(h12.e(), h12.f());
        }
        cipher.init(i11, generateSecret, iVar);
        return cipher;
    }

    private v createSafeBag(String str, Certificate certificate) {
        w40.b bVar = new w40.b(n.f55558w2, new s0(certificate.getEncoded()));
        d dVar = new d();
        boolean z11 = false;
        if (certificate instanceof k60.n) {
            k60.n nVar = (k60.n) certificate;
            k kVar = n.f55552t2;
            i0 i0Var = (i0) nVar.getBagAttribute(kVar);
            if ((i0Var == null || !i0Var.getString().equals(str)) && str != null) {
                nVar.setBagAttribute(kVar, new i0(str));
            }
            Enumeration bagAttributeKeys = nVar.getBagAttributeKeys();
            while (bagAttributeKeys.hasMoreElements()) {
                k kVar2 = (k) bagAttributeKeys.nextElement();
                if (!kVar2.j(n.f55554u2)) {
                    d dVar2 = new d();
                    dVar2.a(kVar2);
                    dVar2.a(new x0(nVar.getBagAttribute(kVar2)));
                    dVar.a(new w0(dVar2));
                    z11 = true;
                }
            }
        }
        if (!z11) {
            d dVar3 = new d();
            dVar3.a(n.f55552t2);
            dVar3.a(new x0(new i0(str)));
            dVar.a(new w0(dVar3));
        }
        return new v(n.T2, bVar.toASN1Primitive(), new x0(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 createSubjectKeyId(PublicKey publicKey) {
        try {
            return new l0(getDigest(m0.h(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    private void doStore(OutputStream outputStream, char[] cArr, boolean z11) {
        String str;
        boolean z12;
        boolean z13;
        int size = this.keys.size();
        String str2 = ASN1Encoding.BER;
        if (size != 0) {
            Objects.requireNonNull(cArr, "no password supplied for PKCS#12 KeyStore");
        } else if (cArr == null) {
            Enumeration keys = this.certs.keys();
            d dVar = new d();
            while (keys.hasMoreElements()) {
                try {
                    String str3 = (String) keys.nextElement();
                    dVar.a(createSafeBag(str3, (Certificate) this.certs.get(str3)));
                } catch (CertificateEncodingException e11) {
                    throw new IOException("Error encoding certificate: " + e11.toString());
                }
            }
            k kVar = n.f55534h2;
            if (z11) {
                new w40.o(new w40.c(kVar, new s0(new w0(new w40.c(kVar, new s0(new w0(dVar).getEncoded()))).getEncoded())), null).c(outputStream, ASN1Encoding.DER);
                return;
            } else {
                new w40.o(new w40.c(kVar, new x(new b0(new w40.c(kVar, new x(new b0(dVar).getEncoded()))).getEncoded())), null).c(outputStream, ASN1Encoding.BER);
                return;
            }
        }
        d dVar2 = new d();
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str4 = (String) keys2.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str4);
            w40.m mVar = new w40.m(bArr, MIN_ITERATIONS);
            w40.f fVar = new w40.f(new b(this.keyAlgorithm, mVar.toASN1Primitive()), wrapKey(this.keyAlgorithm.t(), privateKey, mVar, cArr));
            d dVar3 = new d();
            if (privateKey instanceof k60.n) {
                k60.n nVar = (k60.n) privateKey;
                k kVar2 = n.f55552t2;
                i0 i0Var = (i0) nVar.getBagAttribute(kVar2);
                if (i0Var == null || !i0Var.getString().equals(str4)) {
                    nVar.setBagAttribute(kVar2, new i0(str4));
                }
                k kVar3 = n.f55554u2;
                if (nVar.getBagAttribute(kVar3) == null) {
                    nVar.setBagAttribute(kVar3, createSubjectKeyId(engineGetCertificate(str4).getPublicKey()));
                }
                Enumeration bagAttributeKeys = nVar.getBagAttributeKeys();
                z13 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    k kVar4 = (k) bagAttributeKeys.nextElement();
                    d dVar4 = new d();
                    dVar4.a(kVar4);
                    dVar4.a(new x0(nVar.getBagAttribute(kVar4)));
                    dVar3.a(new w0(dVar4));
                    z13 = true;
                }
            } else {
                z13 = false;
            }
            if (!z13) {
                d dVar5 = new d();
                Certificate engineGetCertificate = engineGetCertificate(str4);
                dVar5.a(n.f55554u2);
                dVar5.a(new x0(createSubjectKeyId(engineGetCertificate.getPublicKey())));
                dVar3.a(new w0(dVar5));
                d dVar6 = new d();
                dVar6.a(n.f55552t2);
                dVar6.a(new x0(new i0(str4)));
                dVar3.a(new w0(dVar6));
            }
            dVar2.a(new v(n.S2, fVar.toASN1Primitive(), new x0(dVar3)));
        }
        x xVar = new x(new w0(dVar2).d(ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        d dVar7 = new d();
        b bVar = new b(this.certAlgorithm, new w40.m(bArr2, MIN_ITERATIONS).toASN1Primitive());
        Hashtable hashtable = new Hashtable();
        Enumeration keys3 = this.keys.keys();
        while (keys3.hasMoreElements()) {
            try {
                String str5 = (String) keys3.nextElement();
                Certificate engineGetCertificate2 = engineGetCertificate(str5);
                Enumeration enumeration = keys3;
                w40.b bVar2 = new w40.b(n.f55558w2, new s0(engineGetCertificate2.getEncoded()));
                d dVar8 = new d();
                if (engineGetCertificate2 instanceof k60.n) {
                    k60.n nVar2 = (k60.n) engineGetCertificate2;
                    k kVar5 = n.f55552t2;
                    i0 i0Var2 = (i0) nVar2.getBagAttribute(kVar5);
                    if (i0Var2 == null || !i0Var2.getString().equals(str5)) {
                        nVar2.setBagAttribute(kVar5, new i0(str5));
                    }
                    k kVar6 = n.f55554u2;
                    if (nVar2.getBagAttribute(kVar6) == null) {
                        nVar2.setBagAttribute(kVar6, createSubjectKeyId(engineGetCertificate2.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = nVar2.getBagAttributeKeys();
                    z12 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        k kVar7 = (k) bagAttributeKeys2.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys2;
                        d dVar9 = new d();
                        dVar9.a(kVar7);
                        dVar9.a(new x0(nVar2.getBagAttribute(kVar7)));
                        dVar8.a(new w0(dVar9));
                        bagAttributeKeys2 = enumeration2;
                        str2 = str2;
                        z12 = true;
                    }
                    str = str2;
                } else {
                    str = str2;
                    z12 = false;
                }
                if (!z12) {
                    d dVar10 = new d();
                    dVar10.a(n.f55554u2);
                    dVar10.a(new x0(createSubjectKeyId(engineGetCertificate2.getPublicKey())));
                    dVar8.a(new w0(dVar10));
                    d dVar11 = new d();
                    dVar11.a(n.f55552t2);
                    dVar11.a(new x0(new i0(str5)));
                    dVar8.a(new w0(dVar11));
                }
                dVar7.a(new v(n.T2, bVar2.toASN1Primitive(), new x0(dVar8)));
                hashtable.put(engineGetCertificate2, engineGetCertificate2);
                keys3 = enumeration;
                str2 = str;
            } catch (CertificateEncodingException e12) {
                throw new IOException("Error encoding certificate: " + e12.toString());
            }
        }
        String str6 = str2;
        Enumeration keys4 = this.certs.keys();
        while (keys4.hasMoreElements()) {
            try {
                String str7 = (String) keys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str7);
                if (this.keys.get(str7) == null) {
                    dVar7.a(createSafeBag(str7, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e13) {
                throw new IOException("Error encoding certificate: " + e13.toString());
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration keys5 = this.chainCerts.keys();
        while (keys5.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) keys5.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    w40.b bVar3 = new w40.b(n.f55558w2, new s0(certificate2.getEncoded()));
                    d dVar12 = new d();
                    if (certificate2 instanceof k60.n) {
                        k60.n nVar3 = (k60.n) certificate2;
                        Enumeration bagAttributeKeys3 = nVar3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            k kVar8 = (k) bagAttributeKeys3.nextElement();
                            if (!kVar8.j(n.f55554u2)) {
                                d dVar13 = new d();
                                dVar13.a(kVar8);
                                dVar13.a(new x0(nVar3.getBagAttribute(kVar8)));
                                dVar12.a(new w0(dVar13));
                                hashtable = hashtable;
                            }
                        }
                    }
                    Hashtable hashtable2 = hashtable;
                    dVar7.a(new v(n.T2, bVar3.toASN1Primitive(), new x0(dVar12)));
                    hashtable = hashtable2;
                }
            } catch (CertificateEncodingException e14) {
                throw new IOException("Error encoding certificate: " + e14.toString());
            }
        }
        byte[] cryptData = cryptData(true, bVar, cArr, false, new w0(dVar7).d(ASN1Encoding.DER));
        k kVar9 = n.f55534h2;
        w40.c cVar = new w40.c(kVar9, new x(new w40.a(new w40.c[]{new w40.c(kVar9, xVar), new w40.c(n.f55540m2, new e(kVar9, bVar, new x(cryptData)).toASN1Primitive())}).d(z11 ? ASN1Encoding.DER : str6)));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        try {
            new w40.o(cVar, new w40.i(new r(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.e(), bArr3, this.itCount, cArr, false, ((org.bouncycastle.asn1.l) cVar.e()).r())), bArr3, this.itCount)).c(outputStream, z11 ? ASN1Encoding.DER : str6);
        } catch (Exception e15) {
            throw new IOException("error constructing MAC: " + e15.toString());
        }
    }

    private static byte[] getDigest(m0 m0Var) {
        p b11 = z50.a.b();
        byte[] bArr = new byte[b11.getDigestSize()];
        byte[] q11 = m0Var.i().q();
        b11.update(q11, 0, q11.length);
        b11.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys = this.keys.keys();
        while (keys.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys.nextElement());
            for (int i11 = 0; i11 != engineGetCertificateChain.length; i11++) {
                hashSet.add(engineGetCertificateChain[i11]);
            }
        }
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys2.nextElement()));
        }
        return hashSet;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue >= 0) {
            BigInteger a11 = j.a(PKCS12_MAX_IT_COUNT_PROPERTY);
            if (a11 == null || a11.intValue() >= intValue) {
                return intValue;
            }
            throw new IllegalStateException("iteration count " + intValue + " greater than " + a11.intValue());
        }
        throw new IllegalStateException("negative iteration count found");
    }

    protected byte[] cryptData(boolean z11, b bVar, char[] cArr, boolean z12, byte[] bArr) {
        k e11 = bVar.e();
        int i11 = z11 ? 1 : 2;
        if (e11.z(n.U2)) {
            w40.m f11 = w40.m.f(bVar.i());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(f11.e(), f11.h().intValue());
                i iVar = new i(cArr, z12);
                Cipher createCipher = this.helper.createCipher(e11.t());
                createCipher.init(i11, iVar, pBEParameterSpec);
                return createCipher.doFinal(bArr);
            } catch (Exception e12) {
                throw new IOException("exception decrypting data - " + e12.toString());
            }
        } else if (!e11.j(n.O1)) {
            throw new IOException("unknown PBE algorithm: " + e11);
        } else {
            try {
                return createCipher(i11, cArr, bVar).doFinal(bArr);
            } catch (Exception e13) {
                throw new IOException("exception decrypting data - " + e13.toString());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate != null) {
                this.chainCerts.remove(new CertId(certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str != null) {
            Certificate certificate = (Certificate) this.certs.get(str);
            if (certificate == null) {
                String str2 = (String) this.localIds.get(str);
                return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
            }
            return certificate;
        }
        throw new IllegalArgumentException("null alias passed to getCertificate.");
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys = this.certs.keys();
        while (elements.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys2 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            String str2 = (String) keys2.nextElement();
            if (((Certificate) elements2.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        byte[] f11;
        if (str != null) {
            Certificate[] certificateArr = null;
            if (engineIsKeyEntry(str)) {
                Certificate engineGetCertificate = engineGetCertificate(str);
                if (engineGetCertificate != null) {
                    Vector vector = new Vector();
                    while (engineGetCertificate != null) {
                        X509Certificate x509Certificate = (X509Certificate) engineGetCertificate;
                        byte[] extensionValue = x509Certificate.getExtensionValue(u.f24794q.t());
                        X509Certificate x509Certificate2 = (extensionValue == null || (f11 = e50.i.e(org.bouncycastle.asn1.l.p(extensionValue).r()).f()) == null) ? null : (Certificate) this.chainCerts.get(new CertId(f11));
                        if (x509Certificate2 == null) {
                            Principal issuerDN = x509Certificate.getIssuerDN();
                            if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                                Enumeration keys = this.chainCerts.keys();
                                while (true) {
                                    if (!keys.hasMoreElements()) {
                                        break;
                                    }
                                    X509Certificate x509Certificate3 = (X509Certificate) this.chainCerts.get(keys.nextElement());
                                    if (x509Certificate3.getSubjectDN().equals(issuerDN)) {
                                        try {
                                            x509Certificate.verify(x509Certificate3.getPublicKey());
                                            x509Certificate2 = x509Certificate3;
                                            break;
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        if (!vector.contains(engineGetCertificate)) {
                            vector.addElement(engineGetCertificate);
                            if (x509Certificate2 != engineGetCertificate) {
                                engineGetCertificate = x509Certificate2;
                            }
                        }
                        engineGetCertificate = null;
                    }
                    int size = vector.size();
                    certificateArr = new Certificate[size];
                    for (int i11 = 0; i11 != size; i11++) {
                        certificateArr[i11] = (Certificate) vector.elementAt(i11);
                    }
                }
                return certificateArr;
            }
            return null;
        }
        throw new IllegalArgumentException("null alias passed to getCertificateChain.");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        Objects.requireNonNull(str, "alias == null");
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Type inference failed for: r17v15 */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineLoad(java.io.InputStream r23, char[] r24) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof e60.c) {
            engineLoad(((e60.c) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
    }

    public boolean engineProbe(InputStream inputStream) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
            return;
        }
        throw new KeyStoreException("There is a key entry with the name " + str + ".");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        boolean z11 = key instanceof PrivateKey;
        if (!z11) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (z11 && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i11 = 0; i11 != certificateArr.length; i11++) {
                this.chainCerts.put(new CertId(certificateArr[i11].getPublicKey()), certificateArr[i11]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        doStore(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        e60.k kVar;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z11 = loadStoreParameter instanceof e60.k;
        if (!z11 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        if (z11) {
            kVar = (e60.k) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            kVar = new e60.k(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
            throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
        } else {
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(kVar.getOutputStream(), password, kVar.isForDEREncoding());
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected PrivateKey unwrapKey(b bVar, byte[] bArr, char[] cArr, boolean z11) {
        k e11 = bVar.e();
        try {
            if (e11.z(n.U2)) {
                w40.m f11 = w40.m.f(bVar.i());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(f11.e(), validateIterationCount(f11.h()));
                Cipher createCipher = this.helper.createCipher(e11.t());
                createCipher.init(4, new i(cArr, z11), pBEParameterSpec);
                return (PrivateKey) createCipher.unwrap(bArr, "", 2);
            } else if (e11.j(n.O1)) {
                return (PrivateKey) createCipher(4, cArr, bVar).unwrap(bArr, "", 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + e11);
            }
        } catch (Exception e12) {
            throw new IOException("exception unwrapping private key - " + e12.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, w40.m mVar, char[] cArr) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(mVar.e(), mVar.h().intValue());
            Cipher createCipher = this.helper.createCipher(str);
            createCipher.init(3, createSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return createCipher.wrap(key);
        } catch (Exception e11) {
            throw new IOException("exception encrypting data - " + e11.toString());
        }
    }
}