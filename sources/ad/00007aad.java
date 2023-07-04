package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f32932a = new s('0', '+', CoreConstants.DASH_CHAR, CoreConstants.DOT);

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private s(char c11, char c12, char c13, char c14) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        return str;
    }

    public char b() {
        return CoreConstants.DOT;
    }

    public char c() {
        return CoreConstants.DASH_CHAR;
    }

    public char d() {
        return '+';
    }

    public char e() {
        return '0';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            Objects.requireNonNull((s) obj);
            return true;
        }
        return false;
    }

    public int hashCode() {
        return CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
    }

    public String toString() {
        return "DecimalStyle[0+-.]";
    }
}