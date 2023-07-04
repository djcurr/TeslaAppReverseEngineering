package ll;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import hl.m;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: c  reason: collision with root package name */
    private static final String f37225c = "c";

    /* renamed from: a  reason: collision with root package name */
    private final String f37226a;

    /* renamed from: b  reason: collision with root package name */
    private KeyStore f37227b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f37228a = null;

        /* renamed from: b  reason: collision with root package name */
        KeyStore f37229b;

        public b() {
            this.f37229b = null;
            if (c.c()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.f37229b = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        public c a() {
            return new c(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f37229b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    static /* synthetic */ boolean c() {
        return f();
    }

    public static void d(String str) {
        if (!new c().e(str)) {
            String b11 = w.b("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(b11, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    private static boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static hl.a g(hl.a aVar) {
        byte[] c11 = u.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c11, aVar.decrypt(aVar.a(c11, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L14;
     */
    @Override // hl.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f37226a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.f37226a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.c.a(java.lang.String):boolean");
    }

    @Override // hl.m
    public synchronized hl.a b(String str) {
        String str2 = this.f37226a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f37226a, str));
        }
        return g(new ll.b(w.b("android-keystore://", str), this.f37227b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(f37225c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f37227b = keyStore;
                keyStore.load(null);
            } catch (IOException e11) {
                throw new GeneralSecurityException(e11);
            } catch (InterruptedException unused2) {
            }
            return this.f37227b.containsAlias(str2);
        }
        return this.f37227b.containsAlias(w.b("android-keystore://", str));
    }

    public c() {
        this(new b());
    }

    private c(b bVar) {
        this.f37226a = bVar.f37228a;
        this.f37227b = bVar.f37229b;
    }
}