package ct;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final com.tesla.logging.g f23072a;

    /* renamed from: b  reason: collision with root package name */
    private static final b f23073b;

    /* renamed from: ct.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static final class C0438a implements b {

        /* renamed from: a  reason: collision with root package name */
        private SecretKey f23074a;

        /* renamed from: ct.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0439a {
            private C0439a() {
            }

            public /* synthetic */ C0439a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0439a(null);
        }

        public C0438a() {
            try {
                b();
            } catch (Exception e11) {
                a.f23072a.d("[Realm] unable to generate Cipher", e11);
                throw e11;
            }
        }

        private final synchronized SecretKey a() {
            SecretKey generateKey;
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("tm_master_key", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(false).build();
                s.f(build, "Builder(MASTER_KEY_ALIAS…false)\n          .build()");
                keyGenerator.init(build);
                generateKey = keyGenerator.generateKey();
                this.f23074a = generateKey;
            } catch (Exception e11) {
                a.f23072a.d("[Realm] unable to create master key", e11);
                throw e11;
            }
            return generateKey;
        }

        private final SecretKey b() {
            try {
                if (this.f23074a == null) {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    SecretKey secretKey = (SecretKey) keyStore.getKey("tm_master_key", null);
                    this.f23074a = secretKey;
                    if (secretKey == null) {
                        a();
                    }
                }
                return this.f23074a;
            } catch (Exception e11) {
                a.f23072a.d("[Realm] unable to retrieve master key", e11);
                throw e11;
            }
        }

        @Override // ct.b
        public byte[] decrypt(byte[] iv2, byte[] encryptedData) {
            byte[] doFinal;
            s.g(iv2, "iv");
            s.g(encryptedData, "encryptedData");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(iv2);
                synchronized (this) {
                    cipher.init(2, this.f23074a, ivParameterSpec);
                    doFinal = cipher.doFinal(encryptedData);
                }
                s.f(doFinal, "{\n        val cipher = C…edData)\n        }\n      }");
                return doFinal;
            } catch (Exception e11) {
                a.f23072a.d("[Realm] unable to decrypt", e11);
                throw e11;
            }
        }

        @Override // ct.b
        public c encrypt(byte[] rawData) {
            c cVar;
            s.g(rawData, "rawData");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                synchronized (this) {
                    cipher.init(1, this.f23074a);
                    byte[] iv2 = cipher.getIV();
                    s.f(iv2, "cipher.iv");
                    byte[] doFinal = cipher.doFinal(rawData);
                    s.f(doFinal, "cipher.doFinal(rawData)");
                    cVar = new c(iv2, doFinal);
                }
                return cVar;
            } catch (Exception e11) {
                a.f23072a.d("[Realm] unable to encrypt", e11);
                throw e11;
            }
        }
    }

    static {
        new a();
        f23072a = com.tesla.logging.g.f21878b.a("Encryption");
        f23073b = new C0438a();
    }

    private a() {
    }

    public static final b b() {
        return f23073b;
    }
}