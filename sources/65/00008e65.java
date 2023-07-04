package okhttp3;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okio.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lokhttp3/Credentials;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "basic", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static final String basic(String username, String password, Charset charset) {
        s.g(username, "username");
        s.g(password, "password");
        s.g(charset, "charset");
        String a11 = i.f42657e.c(username + CoreConstants.COLON_CHAR + password, charset).a();
        return "Basic " + a11;
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            s.f(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }
}