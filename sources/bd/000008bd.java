package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f5953a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5954a;

        static {
            int[] iArr = new int[c.values().length];
            f5954a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.security.crypto.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0101b {

        /* renamed from: a  reason: collision with root package name */
        private final String f5955a;

        /* renamed from: b  reason: collision with root package name */
        private KeyGenParameterSpec f5956b;

        /* renamed from: c  reason: collision with root package name */
        private c f5957c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5958d;

        /* renamed from: e  reason: collision with root package name */
        private int f5959e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5960f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f5961g;

        public C0101b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        private b b() {
            c cVar = this.f5957c;
            if (cVar == null && this.f5956b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (cVar == c.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f5955a, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.f5958d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f5959e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f5960f && this.f5961g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.f5956b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f5956b;
            Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
            return new b(androidx.security.crypto.c.c(keyGenParameterSpec), this.f5956b);
        }

        public b a() {
            if (Build.VERSION.SDK_INT >= 23) {
                return b();
            }
            return new b(this.f5955a, null);
        }

        public C0101b c(c cVar) {
            if (a.f5954a[cVar.ordinal()] == 1) {
                if (Build.VERSION.SDK_INT >= 23 && this.f5956b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f5957c = cVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }

        public C0101b(Context context, String str) {
            this.f5961g = context.getApplicationContext();
            this.f5955a = str;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f5953a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f5953a;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f5953a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f5953a + ", isKeyStoreBacked=" + b() + "}";
    }
}