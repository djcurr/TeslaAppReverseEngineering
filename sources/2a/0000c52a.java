package zs;

import android.content.Context;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import yu.z;
import zu.f0;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final com.tesla.logging.g f60707a = com.tesla.logging.g.g("Signing");

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, KeyPair> f60708b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, byte[]> f60709c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, byte[]> f60710d = new HashMap();

    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60711a;

        static {
            int[] iArr = new int[b.values().length];
            f60711a = iArr;
            try {
                iArr[b.VCSEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60711a[b.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum b {
        VCSEC,
        CAR,
        AUTHD
    }

    public static Map<String, Object> a(zs.a aVar, Context context, String str, String str2, String str3, b bVar) {
        KeyPair n11;
        byte[] bArr;
        Context applicationContext = context.getApplicationContext();
        z p11 = z.p(applicationContext);
        HashMap hashMap = new HashMap();
        hashMap.put("success", Boolean.FALSE);
        try {
            String h11 = p11.h();
            Map<String, KeyPair> map = f60708b;
            if (map.containsKey(h11)) {
                n11 = map.get(h11);
            } else {
                n11 = aVar.n(h11, applicationContext);
                map.put(h11, n11);
            }
            if (n11 == null) {
                f60707a.e("Failed to get key keyPair to sign with");
                hashMap.put("error", "failed to get local key keyPair");
                return hashMap;
            }
            PrivateKey privateKey = n11.getPrivate();
            int i11 = a.f60711a[bVar.ordinal()];
            if (i11 == 1) {
                Map<String, byte[]> map2 = f60709c;
                synchronized (map2) {
                    if (!map2.containsKey(str2)) {
                        map2.put(str2, zs.a.f(aVar.p(f0.a(str2)), privateKey));
                    }
                    bArr = map2.get(str2);
                }
            } else if (i11 != 2) {
                f60707a.e("Sign message called with invalid domain, no shared secret computed");
                bArr = null;
            } else {
                Map<String, byte[]> map3 = f60710d;
                synchronized (map3) {
                    if (!map3.containsKey(str2)) {
                        map3.put(str2, zs.a.f(aVar.p(f0.a(str2)), privateKey));
                    }
                    bArr = map3.get(str2);
                }
            }
            if (bArr == null) {
                f60707a.i("Failed to derive shared secret to sign message");
                hashMap.put("error", "failed to derive shared secret");
                return hashMap;
            }
            byte[] bArr2 = new byte[12];
            new SecureRandom().nextBytes(bArr2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
                messageDigest.update(f0.a(str3));
                byte[] h12 = zs.a.h(f0.a(str), bArr, bArr2, messageDigest.digest());
                if (h12 == null) {
                    f60707a.i("signed message is empty!");
                    hashMap.put("error", "empty signed message");
                    return hashMap;
                }
                f60707a.i(String.format("Signed message - message: %s, nonce: %s, additionalData: %s", f0.b(h12), f0.b(bArr2), str3));
                byte[] bArr3 = new byte[16];
                int length = h12.length - 16;
                byte[] bArr4 = new byte[length];
                System.arraycopy(h12, 0, bArr4, 0, length);
                System.arraycopy(h12, length, bArr3, 0, 16);
                hashMap.put("error", null);
                hashMap.put("success", Boolean.TRUE);
                hashMap.put("signedMessage", bArr4);
                hashMap.put("tag", bArr3);
                hashMap.put("nonce", bArr2);
                return hashMap;
            } catch (NoSuchAlgorithmException e11) {
                f60707a.f("Failed to get hash of additional data", e11);
                hashMap.put("error", "Failed to get hash of additional data");
                hashMap.put("success", Boolean.FALSE);
                return hashMap;
            }
        } catch (Exception e12) {
            f60707a.f("Failed to get key keyPair to sign with", e12);
            hashMap.put("error", "failed to get local key keyPair");
            return hashMap;
        }
    }
}