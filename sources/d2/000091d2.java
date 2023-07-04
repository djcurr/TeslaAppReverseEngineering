package org.bouncycastle.jcajce.provider.asymmetric.ec;

import f50.n;
import g50.c;
import g50.d;
import g50.f;
import h60.e;
import h60.l;
import h60.u;
import i50.s;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import k60.b;
import k60.m;
import n50.t;
import org.bouncycastle.crypto.i;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import u50.c1;
import u50.d0;
import u50.d1;
import u50.e0;
import u50.w;
import u50.x;
import u50.y;
import z50.a;

/* loaded from: classes5.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final n converter = new n();
    private Object agreement;
    private e dheParameters;
    private String kaAlgorithm;
    private l mqvParameters;
    private y parameters;
    private byte[] result;

    /* loaded from: classes5.dex */
    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new d(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new d(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new d(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new d(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new d(), new t(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new c(), (org.bouncycastle.crypto.n) null);
        }
    }

    /* loaded from: classes5.dex */
    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new d(), (org.bouncycastle.crypto.n) null);
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new g50.e(), (org.bouncycastle.crypto.n) null);
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new g50.e(), new h50.a(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new g50.e(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new g50.e(), new h50.a(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new g50.e(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new g50.e(), new h50.a(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new g50.e(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new g50.e(), new h50.a(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new g50.e(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new g50.e(), new h50.a(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new g50.e(), new t(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new d(), new h50.a(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new c(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new d(), new h50.a(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new c(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new d(), new h50.a(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new c(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new d(), new h50.a(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new c(), new t(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new c(), new t(new s()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new c(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new c(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new c(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new c(), new t(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new f(), (org.bouncycastle.crypto.n) null);
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new f(), new h50.a(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new f(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new f(), new t(a.b()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new f(), new h50.a(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new f(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new f(), new t(a.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new f(), new h50.a(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new f(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new f(), new t(a.d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new f(), new h50.a(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new f(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new f(), new t(a.e()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new f(), new h50.a(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new f(), new t(a.j()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new f(), new t(a.j()));
        }
    }

    protected KeyAgreementSpi(String str, g50.e eVar, org.bouncycastle.crypto.n nVar) {
        super(str, nVar);
        this.kaAlgorithm = str;
        this.agreement = eVar;
    }

    protected KeyAgreementSpi(String str, org.bouncycastle.crypto.d dVar, org.bouncycastle.crypto.n nVar) {
        super(str, nVar);
        this.kaAlgorithm = str;
        this.agreement = dVar;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        d0 d0Var;
        d0 d0Var2;
        Object obj = this.agreement;
        e0 e0Var = null;
        if (obj instanceof f) {
            this.mqvParameters = null;
            boolean z11 = key instanceof k60.l;
            if (!z11 && !(algorithmParameterSpec instanceof l)) {
                throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement requires " + getSimpleName(l.class) + " for initialisation");
            }
            if (z11) {
                k60.l lVar = (k60.l) key;
                d0Var2 = (d0) ECUtil.generatePrivateKeyParameter(lVar.getStaticPrivateKey());
                d0Var = (d0) ECUtil.generatePrivateKeyParameter(lVar.getEphemeralPrivateKey());
                if (lVar.getEphemeralPublicKey() != null) {
                    e0Var = (e0) ECUtils.generatePublicKeyParameter(lVar.getEphemeralPublicKey());
                }
            } else {
                l lVar2 = (l) algorithmParameterSpec;
                d0 d0Var3 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                d0Var = (d0) ECUtil.generatePrivateKeyParameter(lVar2.a());
                e0Var = lVar2.b() != null ? (e0) ECUtils.generatePublicKeyParameter(lVar2.b()) : null;
                this.mqvParameters = lVar2;
                this.ukmParameters = lVar2.d();
                d0Var2 = d0Var3;
            }
            c1 c1Var = new c1(d0Var2, d0Var, e0Var);
            this.parameters = d0Var2.b();
            ((f) this.agreement).init(c1Var);
        } else if (!(algorithmParameterSpec instanceof e)) {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(b.class) + " for initialisation");
            } else if (this.kdf == null && (algorithmParameterSpec instanceof u)) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            } else {
                d0 d0Var4 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                this.parameters = d0Var4.b();
                this.ukmParameters = algorithmParameterSpec instanceof u ? ((u) algorithmParameterSpec).a() : null;
                ((org.bouncycastle.crypto.d) this.agreement).init(d0Var4);
            }
        } else if (!(obj instanceof g50.e)) {
            throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement cannot be used with " + getSimpleName(e.class));
        } else {
            e eVar = (e) algorithmParameterSpec;
            d0 d0Var5 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            d0 d0Var6 = (d0) ECUtil.generatePrivateKeyParameter(eVar.a());
            e0 e0Var2 = eVar.b() != null ? (e0) ECUtils.generatePublicKeyParameter(eVar.b()) : null;
            this.dheParameters = eVar;
            this.ukmParameters = eVar.d();
            w wVar = new w(d0Var5, d0Var6, e0Var2);
            this.parameters = d0Var5.b();
            ((g50.e) this.agreement).c(wVar);
        }
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        n nVar = converter;
        return nVar.c(bigInteger, nVar.a(this.parameters.a()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return org.bouncycastle.util.a.h(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z11) {
        i generatePublicKeyParameter;
        if (this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        } else if (!z11) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        } else {
            Object obj = this.agreement;
            if (obj instanceof f) {
                if (key instanceof m) {
                    m mVar = (m) key;
                    generatePublicKeyParameter = new d1((e0) ECUtils.generatePublicKeyParameter(mVar.getStaticKey()), (e0) ECUtils.generatePublicKeyParameter(mVar.getEphemeralKey()));
                } else {
                    generatePublicKeyParameter = new d1((e0) ECUtils.generatePublicKeyParameter((PublicKey) key), (e0) ECUtils.generatePublicKeyParameter(this.mqvParameters.c()));
                }
            } else if (obj instanceof g50.e) {
                generatePublicKeyParameter = new x((e0) ECUtils.generatePublicKeyParameter((PublicKey) key), (e0) ECUtils.generatePublicKeyParameter(this.dheParameters.c()));
            } else if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(k60.c.class) + " for doPhase");
            } else {
                generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
            }
            try {
                Object obj2 = this.agreement;
                if (obj2 instanceof org.bouncycastle.crypto.d) {
                    this.result = bigIntToBytes(((org.bouncycastle.crypto.d) obj2).a(generatePublicKeyParameter));
                    return null;
                }
                this.result = ((g50.e) obj2).a(generatePublicKeyParameter);
                return null;
            } catch (Exception e11) {
                throw new InvalidKeyException("calculation failed: " + e11.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e11;
                    }
                };
            }
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        try {
            initFromKey(key, null);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidKeyException(e11.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof l) && !(algorithmParameterSpec instanceof u) && !(algorithmParameterSpec instanceof e)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        initFromKey(key, algorithmParameterSpec);
    }
}