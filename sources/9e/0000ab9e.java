package pu;

import android.content.Context;
import android.util.Base64;
import com.tesla.logging.TeslaLog;
import ct.i;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import zt.g;
import zt.h;
import zt.k;
import zu.j;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f46927a = new a(null);

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final RSAPublicKey a(String str) {
            byte[] f11 = j.f(str);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            s.f(keyFactory, "getInstance(\"RSA\")");
            PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(f11));
            if (generatePublic instanceof RSAPublicKey) {
                return (RSAPublicKey) generatePublic;
            }
            return null;
        }

        private final X509Certificate b(String str) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            s.f(certificateFactory, "getInstance(\"X.509\")");
            Charset charset = kotlin.text.d.f35187b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(charset);
            s.f(bytes, "(this as java.lang.String).getBytes(charset)");
            Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
            if (generateCertificate instanceof X509Certificate) {
                return (X509Certificate) generateCertificate;
            }
            return null;
        }

        private final String c(String str) {
            try {
                byte[] decode = Base64.decode(str, 0);
                s.f(decode, "decode(rawBase64, Base64.DEFAULT)");
                MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
                s.f(messageDigest, "getInstance(\"SHA-256\")");
                messageDigest.update(decode);
                return Base64.encodeToString(messageDigest.digest(), 0);
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("VaultRewrapHelper", "Error generating key name", e11);
                return null;
            }
        }

        private final String d(String str, i iVar) {
            return iVar.g("CLOUD_PROFILE_KEY_NAME_" + str);
        }

        private final PrivateKey e(String str, Context context) {
            String str2 = "CLOUD_PROFILE_" + str + "_KEY_PAIR";
            Locale ENGLISH = Locale.ENGLISH;
            s.f(ENGLISH, "ENGLISH");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase(ENGLISH);
            s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            KeyPair o11 = zs.a.l().o(lowerCase, context.getApplicationContext());
            if (o11 == null) {
                return null;
            }
            return o11.getPrivate();
        }

        private final h g(h hVar, Map<String, zt.i> map, String str, PrivateKey privateKey) {
            byte[] unwrappedClassKeyBytes;
            byte[] h11;
            if (map.get(str) == null) {
                return null;
            }
            List<zt.j> f11 = hVar.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f11) {
                if (s.c(((zt.j) obj).getName(), str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(2, privateKey);
                unwrappedClassKeyBytes = cipher.doFinal(((zt.j) arrayList.get(0)).c().E());
            }
            List<zt.j> f12 = hVar.f();
            ArrayList arrayList2 = new ArrayList();
            for (zt.j jVar : f12) {
                zt.i iVar = map.get(jVar.getName());
                if (iVar == null) {
                    return null;
                }
                if (!s.c(jVar.getName(), str)) {
                    if (iVar.d() == k.VEHICLE_CERT) {
                        a aVar = f.f46927a;
                        s.f(unwrappedClassKeyBytes, "unwrappedClassKeyBytes");
                        h11 = aVar.i(unwrappedClassKeyBytes, iVar.c());
                    } else {
                        a aVar2 = f.f46927a;
                        s.f(unwrappedClassKeyBytes, "unwrappedClassKeyBytes");
                        h11 = aVar2.h(unwrappedClassKeyBytes, iVar.c());
                    }
                    jVar = h11 != null ? zt.j.b(jVar, null, okio.i.f42657e.g(h11, 0, h11.length), null, null, 13, null) : null;
                }
                if (jVar != null) {
                    arrayList2.add(jVar);
                }
            }
            return h.b(hVar, null, null, null, null, arrayList2, null, 47, null);
        }

        private final byte[] h(byte[] bArr, String str) {
            byte[] doFinal;
            RSAPublicKey a11 = a(str);
            if (a11 == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(1, a11);
                doFinal = cipher.doFinal(bArr);
            }
            return doFinal;
        }

        private final byte[] i(byte[] bArr, String str) {
            byte[] doFinal;
            X509Certificate b11 = b(str);
            if (b11 == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            synchronized (this) {
                cipher.init(1, b11.getPublicKey());
                doFinal = cipher.doFinal(bArr);
            }
            return doFinal;
        }

        public final g f(g vault, i realmHelper, Context applicationContext) {
            String d11;
            PrivateKey e11;
            List<zt.i> b11;
            s.g(vault, "vault");
            s.g(realmHelper, "realmHelper");
            s.g(applicationContext, "applicationContext");
            HashMap hashMap = new HashMap();
            zt.d e12 = vault.e();
            if (e12 != null && (b11 = e12.b()) != null) {
                for (zt.i iVar : b11) {
                    String c11 = f.f46927a.c(iVar.c());
                    if (c11 != null) {
                        hashMap.put(c11, iVar);
                    }
                }
            }
            String g11 = realmHelper.g("_ACCOUNT_EMAIL");
            if (g11 == null || (d11 = d(g11, realmHelper)) == null || (e11 = e(g11, applicationContext)) == null) {
                return null;
            }
            List<h> c12 = vault.c();
            ArrayList arrayList = new ArrayList();
            for (h hVar : c12) {
                h g12 = f.f46927a.g(hVar, hashMap, d11, e11);
                if (g12 != null) {
                    arrayList.add(g12);
                }
            }
            e11.destroy();
            return g.b(vault, null, arrayList, null, null, null, null, 61, null);
        }
    }
}