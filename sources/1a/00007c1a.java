package js;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import okhttp3.Request;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f33945a = new c();

    private c() {
    }

    private final String a(String str) {
        return "Bearer " + str;
    }

    public final String b(Request request) {
        String P0;
        s.g(request, "request");
        String header = request.header(NetworkConstantsKt.HEADER_AUTHORIZATION);
        if (header == null) {
            return null;
        }
        P0 = w.P0(header, "Bearer ", null, 2, null);
        return P0;
    }

    public final Request c(Request.Builder builder, String token) {
        s.g(builder, "builder");
        s.g(token, "token");
        return builder.header(NetworkConstantsKt.HEADER_AUTHORIZATION, a(token)).build();
    }

    public final void d(Map<String, String> headers, String token) {
        s.g(headers, "headers");
        s.g(token, "token");
        headers.put(NetworkConstantsKt.HEADER_AUTHORIZATION, a(token));
    }
}