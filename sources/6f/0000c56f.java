package zu;

import com.tesla.logging.TeslaLog;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f60788a = new s();

    private s() {
    }

    private final byte[] a(String str, byte[] bArr, byte[] bArr2) {
        Mac mac = Mac.getInstance(str);
        kotlin.jvm.internal.s.f(mac, "getInstance(algorithm)");
        mac.init(new SecretKeySpec(bArr, str));
        byte[] doFinal = mac.doFinal(bArr2);
        kotlin.jvm.internal.s.f(doFinal, "mac.doFinal(message)");
        return doFinal;
    }

    public final byte[] b(byte[] key, byte[] message) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(message, "message");
        try {
            return a("HmacSHA256", key, message);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("HMAC", "Failed to hmac", e11);
            throw e11;
        }
    }
}