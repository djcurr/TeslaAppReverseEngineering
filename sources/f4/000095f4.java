package org.bouncycastle.jcajce.provider.symmetric;

import h60.t;
import i50.a0;
import i50.x;
import i50.y;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.v;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.util.a;
import p50.g;
import r70.m;
import u50.b1;

/* loaded from: classes5.dex */
public class TLSKDF {

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$TLS10");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS10KDF", sb2.toString());
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS11KDF", str + "$TLS11");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA256KDF", str + "$TLS12withSHA256");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", str + "$TLS12withSHA384");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", str + "$TLS12withSHA512");
        }
    }

    /* loaded from: classes5.dex */
    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((t) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes5.dex */
    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((t) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes5.dex */
    public static class TLS12 extends TLSKeyMaterialFactory {
        private final v prf;

        protected TLS12(String str, v vVar) {
            super(str);
            this.prf = vVar;
        }

        private byte[] PRF(t tVar, v vVar) {
            byte[] p11 = a.p(m.f(tVar.a()), tVar.d());
            byte[] c11 = tVar.c();
            byte[] bArr = new byte[tVar.b()];
            TLSKDF.hmac_hash(vVar, c11, p11, bArr);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(PRF((t) keySpec, this.prf), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes5.dex */
    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new g(new x()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new g(new y()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new g(new a0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        protected TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PRF_legacy(t tVar) {
        g gVar = new g(z50.a.a());
        g gVar2 = new g(z50.a.b());
        byte[] p11 = a.p(m.f(tVar.a()), tVar.d());
        byte[] c11 = tVar.c();
        int length = (c11.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(c11, 0, bArr, 0, length);
        System.arraycopy(c11, c11.length - length, bArr2, 0, length);
        int b11 = tVar.b();
        byte[] bArr3 = new byte[b11];
        byte[] bArr4 = new byte[b11];
        hmac_hash(gVar, bArr, p11, bArr3);
        hmac_hash(gVar2, bArr2, p11, bArr4);
        for (int i11 = 0; i11 < b11; i11++) {
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr4[i11]);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hmac_hash(v vVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        vVar.init(new b1(bArr));
        int macSize = vVar.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = vVar.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[vVar.getMacSize()];
        byte[] bArr6 = bArr2;
        int i11 = 0;
        while (i11 < length) {
            vVar.update(bArr6, 0, bArr6.length);
            vVar.doFinal(bArr4, 0);
            vVar.update(bArr4, 0, macSize2);
            vVar.update(bArr2, 0, bArr2.length);
            vVar.doFinal(bArr5, 0);
            int i12 = macSize * i11;
            System.arraycopy(bArr5, 0, bArr3, i12, Math.min(macSize, bArr3.length - i12));
            i11++;
            bArr6 = bArr4;
        }
    }
}