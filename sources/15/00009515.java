package org.bouncycastle.jcajce.provider.symmetric;

import h60.i;
import i40.a;
import i40.c;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.spec.IvParameterSpec;
import l50.u;
import l50.v;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import r70.m;

/* loaded from: classes5.dex */
public final class GOST28147 {
    private static Map<k, String> oidMappings = new HashMap();
    private static Map<String, k> nameMappings = new HashMap();

    /* loaded from: classes5.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* renamed from: iv  reason: collision with root package name */
        byte[] f43181iv = new byte[8];
        byte[] sBox = u.f("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.k.b();
            }
            this.random.nextBytes(this.f43181iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new i(this.sBox, this.f43181iv));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            if (!(algorithmParameterSpec instanceof i)) {
                throw new InvalidAlgorithmParameterException("parameter spec not supported");
            }
            this.sBox = ((i) algorithmParameterSpec).c();
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParams extends BaseAlgParams {

        /* renamed from: iv  reason: collision with root package name */
        private byte[] f43182iv;
        private k sBox = a.f29845h;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f43182iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof i)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else {
                this.f43182iv = ((i) algorithmParameterSpec).a();
                try {
                    this.sBox = BaseAlgParams.getSBoxOID(((i) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e11) {
                    throw new InvalidParameterSpecException(e11.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f43182iv);
            }
            if (cls == i.class || cls == AlgorithmParameterSpec.class) {
                return new i(this.sBox, this.f43182iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected byte[] localGetEncoded() {
            return new c(this.f43182iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected void localInit(byte[] bArr) {
            n k11 = n.k(bArr);
            if (k11 instanceof l) {
                this.f43182iv = l.p(k11).r();
            } else if (!(k11 instanceof p)) {
                throw new IOException("Unable to recognize parameters");
            } else {
                c h11 = c.h(k11);
                this.sBox = h11.e();
                this.f43182iv = h11.f();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {

        /* renamed from: iv  reason: collision with root package name */
        private byte[] f43183iv;
        private k sBox = a.f29845h;

        protected static k getSBoxOID(String str) {
            k kVar = str != null ? (k) GOST28147.nameMappings.get(m.k(str)) : null;
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalArgumentException("Unknown SBOX name: " + str);
        }

        protected static k getSBoxOID(byte[] bArr) {
            return getSBoxOID(u.g(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException("Unknown parameter format: " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f43183iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof i)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else {
                this.f43183iv = ((i) algorithmParameterSpec).a();
                try {
                    this.sBox = getSBoxOID(((i) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e11) {
                    throw new InvalidParameterSpecException(e11.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr) {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr, String str) {
            Objects.requireNonNull(bArr, "Encoded parameters cannot be null");
            if (!isASN1FormatString(str)) {
                throw new IOException("Unknown parameter format: " + str);
            }
            try {
                localInit(bArr);
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new IOException("Parameter parsing failed: " + e12.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f43183iv);
            }
            if (cls == i.class || cls == AlgorithmParameterSpec.class) {
                return new i(this.sBox, this.f43183iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        protected byte[] localGetEncoded() {
            return new c(this.f43183iv, this.sBox).getEncoded();
        }

        abstract void localInit(byte[] bArr);
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new q50.c(new u()), 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new l50.n());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new u());
        }
    }

    /* loaded from: classes5.dex */
    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new f(new q50.m(new u())), 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new v());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i11) {
            super("GOST28147", i11, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new p50.f());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST28147", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cipher.");
            k kVar = a.f29843f;
            sb3.append(kVar);
            configurableProvider.addAlgorithm(sb3.toString(), str + "$GCFB");
            configurableProvider.addAlgorithm("KeyGenerator.GOST28147", str + "$KeyGen");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("AlgorithmParameters.GOST28147", str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("Cipher." + a.f29842e, str + "$CryptoProWrap");
            configurableProvider.addAlgorithm("Cipher." + a.f29841d, str + "$GostWrap");
            configurableProvider.addAlgorithm("Mac.GOST28147MAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(a.f29844g, "E-TEST");
        Map<k, String> map = oidMappings;
        k kVar = a.f29845h;
        map.put(kVar, "E-A");
        Map<k, String> map2 = oidMappings;
        k kVar2 = a.f29846i;
        map2.put(kVar2, "E-B");
        Map<k, String> map3 = oidMappings;
        k kVar3 = a.f29847j;
        map3.put(kVar3, "E-C");
        Map<k, String> map4 = oidMappings;
        k kVar4 = a.f29848k;
        map4.put(kVar4, "E-D");
        Map<k, String> map5 = oidMappings;
        k kVar5 = x40.a.f57046t;
        map5.put(kVar5, "PARAM-Z");
        nameMappings.put("E-A", kVar);
        nameMappings.put("E-B", kVar2);
        nameMappings.put("E-C", kVar3);
        nameMappings.put("E-D", kVar4);
        nameMappings.put("PARAM-Z", kVar5);
    }

    private GOST28147() {
    }
}