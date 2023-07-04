package org.bouncycastle.jcajce.provider.asymmetric.edec;

import h60.g;
import h60.v;
import j40.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import l60.b;
import n50.b0;
import n50.c0;
import n50.m;
import n50.n;
import org.bouncycastle.crypto.c;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import u50.f0;
import u50.i0;
import u50.r1;
import u50.u1;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private c generator;
    private SecureRandom secureRandom;

    /* loaded from: classes5.dex */
    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    /* loaded from: classes5.dex */
    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    /* loaded from: classes5.dex */
    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    /* loaded from: classes5.dex */
    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2);
        }
    }

    KeyPairGeneratorSpi(int i11) {
        this.algorithmDeclared = i11;
        if (getAlgorithmFamily(i11) != i11) {
            this.algorithmInitialized = i11;
        }
    }

    private static int getAlgorithmFamily(int i11) {
        if (i11 == 1 || i11 == 2) {
            return -1;
        }
        if (i11 == 3 || i11 == 4) {
            return -2;
        }
        return i11;
    }

    private static int getAlgorithmForName(String str) {
        if (str.equalsIgnoreCase("X25519") || str.equals(a.f33205b.t())) {
            return 3;
        }
        if (str.equalsIgnoreCase("Ed25519") || str.equals(a.f33207d.t())) {
            return 1;
        }
        if (str.equalsIgnoreCase("X448") || str.equals(a.f33206c.t())) {
            return 4;
        }
        if (str.equalsIgnoreCase("Ed448") || str.equals(a.f33208e.t())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: " + str);
    }

    private int getAlgorithmForStrength(int i11) {
        if (i11 == 255 || i11 == 256) {
            int i12 = this.algorithmDeclared;
            if (i12 != -2) {
                if (i12 == -1 || i12 == 1) {
                    return 1;
                }
                if (i12 != 3) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            return 3;
        } else if (i11 == 448) {
            int i13 = this.algorithmDeclared;
            if (i13 != -2) {
                if (i13 == -1 || i13 == 2) {
                    return 2;
                }
                if (i13 != 4) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            return 4;
        } else {
            throw new InvalidParameterException("unknown key size");
        }
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof b ? ((b) algorithmParameterSpec).a() : algorithmParameterSpec instanceof g ? ((g) algorithmParameterSpec).a() : algorithmParameterSpec instanceof v ? ((v) algorithmParameterSpec).a() : ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private c setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = k.b();
        }
        int i11 = this.algorithmInitialized;
        if (i11 == 1) {
            m mVar = new m();
            mVar.a(new f0(this.secureRandom));
            return mVar;
        } else if (i11 == 2) {
            n nVar = new n();
            nVar.a(new i0(this.secureRandom));
            return nVar;
        } else if (i11 == 3) {
            b0 b0Var = new b0();
            b0Var.a(new r1(this.secureRandom));
            return b0Var;
        } else if (i11 == 4) {
            c0 c0Var = new c0();
            c0Var.a(new u1(this.secureRandom));
            return c0Var;
        } else {
            throw new IllegalStateException("generator not correctly initialized");
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized != 0) {
            if (this.generator == null) {
                this.generator = setupGenerator();
            }
            org.bouncycastle.crypto.b generateKeyPair = this.generator.generateKeyPair();
            int i11 = this.algorithmInitialized;
            if (i11 == 1 || i11 == 2) {
                return new KeyPair(new BCEdDSAPublicKey(generateKeyPair.b()), new BCEdDSAPrivateKey(generateKeyPair.a()));
            }
            if (i11 == 3 || i11 == 4) {
                return new KeyPair(new BCXDHPublicKey(generateKeyPair.b()), new BCXDHPrivateKey(generateKeyPair.a()));
            }
            throw new IllegalStateException("generator not correctly initialized");
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i11);
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i11 = this.algorithmDeclared;
        if (i11 != algorithmForName && i11 != getAlgorithmFamily(algorithmForName)) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}