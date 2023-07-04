package org.bouncycastle.jcajce.provider.drbg;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import i50.a0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.a;
import r70.i;
import r70.j;
import r70.m;
import w50.c;
import w50.d;
import w50.f;
import w50.g;

/* loaded from: classes5.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    /* loaded from: classes5.dex */
    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i11) {
            return random.generateSeed(i11);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* loaded from: classes5.dex */
    private static class HybridRandomProvider extends Provider {
        protected HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class HybridSecureRandom extends SecureRandom {
        private final SecureRandom baseRandom;
        private final f drbg;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        /* loaded from: classes5.dex */
        private class SignallingEntropySource implements c {
            private final int byteLength;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            /* loaded from: classes5.dex */
            private class EntropyGatherer implements Runnable {
                private final int numBytes;

                EntropyGatherer(int i11) {
                    this.numBytes = i11;
                }

                private void sleep(long j11) {
                    try {
                        Thread.sleep(j11);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    String b11 = j.b("org.bouncycastle.drbg.gather_pause_secs");
                    long j11 = 5000;
                    if (b11 != null) {
                        try {
                            j11 = Long.parseLong(b11) * 1000;
                        } catch (Exception unused) {
                        }
                    }
                    int i11 = this.numBytes;
                    byte[] bArr = new byte[i11];
                    for (int i12 = 0; i12 < SignallingEntropySource.this.byteLength / 8; i12++) {
                        sleep(j11);
                        byte[] generateSeed = HybridSecureRandom.this.baseRandom.generateSeed(8);
                        System.arraycopy(generateSeed, 0, bArr, i12 * 8, generateSeed.length);
                    }
                    int i13 = SignallingEntropySource.this.byteLength - ((SignallingEntropySource.this.byteLength / 8) * 8);
                    if (i13 != 0) {
                        sleep(j11);
                        byte[] generateSeed2 = HybridSecureRandom.this.baseRandom.generateSeed(i13);
                        System.arraycopy(generateSeed2, 0, bArr, i11 - generateSeed2.length, generateSeed2.length);
                    }
                    SignallingEntropySource.this.entropy.set(bArr);
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            SignallingEntropySource(int i11) {
                this.byteLength = (i11 + 7) / 8;
            }

            @Override // w50.c
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // w50.c
            public byte[] getEntropy() {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    bArr = HybridSecureRandom.this.baseRandom.generateSeed(this.byteLength);
                } else {
                    this.scheduled.set(false);
                }
                if (!this.scheduled.getAndSet(true)) {
                    Thread thread = new Thread(new EntropyGatherer(this.byteLength));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArr;
            }

            public boolean isPredictionResistant() {
                return true;
            }
        }

        HybridSecureRandom() {
            super(null, new HybridRandomProvider());
            this.seedAvailable = new AtomicBoolean(false);
            this.samples = new AtomicInteger(0);
            SecureRandom access$400 = DRBG.access$400();
            this.baseRandom = access$400;
            this.drbg = new g(new d() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.1
                @Override // w50.d
                public c get(int i11) {
                    return new SignallingEntropySource(i11);
                }
            }).e(m.f("Bouncy Castle Hybrid Entropy Source")).b(new p50.g(new a0()), access$400.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i11) {
            byte[] bArr = new byte[i11];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                this.drbg.a(null);
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j11) {
            f fVar = this.drbg;
            if (fVar != null) {
                fVar.setSeed(j11);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            f fVar = this.drbg;
            if (fVar != null) {
                fVar.setSeed(bArr);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    /* loaded from: classes5.dex */
    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i11) {
            return random.generateSeed(i11);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class URLSeededSecureRandom extends SecureRandom {
        private final InputStream seedStream;

        URLSeededSecureRandom(final URL url) {
            super(null, new HybridRandomProvider());
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return FirebasePerfUrlConnection.openStream(url);
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        private int privilegedRead(final byte[] bArr, final int i11, final int i12) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededSecureRandom.this.seedStream.read(bArr, i11, i12));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i11) {
            byte[] bArr;
            synchronized (this) {
                bArr = new byte[i11];
                int i12 = 0;
                while (i12 != i11) {
                    int privilegedRead = privilegedRead(bArr, i12, i11 - i12);
                    if (privilegedRead <= -1) {
                        break;
                    }
                    i12 += privilegedRead;
                }
                if (i12 != i11) {
                    throw new InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j11) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }
    }

    static /* synthetic */ SecureRandom access$000() {
        return createCoreSecureRandom();
    }

    static /* synthetic */ SecureRandom access$400() {
        return createInitialEntropySource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z11) {
        if (j.b("org.bouncycastle.drbg.entropysource") == null) {
            HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
            byte[] generateSeed = hybridSecureRandom.generateSeed(16);
            return new g(hybridSecureRandom, true).e(z11 ? generateDefaultPersonalizationString(generateSeed) : generateNonceIVPersonalizationString(generateSeed)).c(new a0(), hybridSecureRandom.generateSeed(32), z11);
        }
        d createEntropySource = createEntropySource();
        c cVar = createEntropySource.get(128);
        byte[] entropy = cVar.getEntropy();
        return new g(createEntropySource).e(z11 ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)).c(new a0(), a.p(cVar.getEntropy(), cVar.getEntropy()), z11);
    }

    private static SecureRandom createCoreSecureRandom() {
        if (Security.getProperty("securerandom.source") == null) {
            return new CoreSecureRandom(findSource());
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new CoreSecureRandom(findSource());
        }
    }

    private static d createEntropySource() {
        final String b11 = j.b("org.bouncycastle.drbg.entropysource");
        return (d) AccessController.doPrivileged(new PrivilegedAction<d>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            @Override // java.security.PrivilegedAction
            public d run() {
                try {
                    return (d) ClassUtil.loadClass(DRBG.class, b11).newInstance();
                } catch (Exception e11) {
                    throw new IllegalStateException("entropy source " + b11 + " not created: " + e11.getMessage(), e11);
                }
            }
        });
    }

    private static SecureRandom createInitialEntropySource() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    return DRBG.access$000();
                }
            }
        }) : createCoreSecureRandom();
    }

    private static final Object[] findSource() {
        int i11 = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i11 >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i11];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i11++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return a.r(m.f("Default"), bArr, i.u(Thread.currentThread().getId()), i.u(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return a.r(m.f("Nonce"), bArr, i.y(Thread.currentThread().getId()), i.y(System.currentTimeMillis()));
    }
}