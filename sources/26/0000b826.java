package uu;

import com.tesla.logging.TeslaLog;
import java.util.UUID;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import zu.j;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f53671a = new b();

    private b() {
    }

    public final ot.c a(String request) {
        s.g(request, "request");
        try {
            return ot.c.f44007i.decode(j.a(request));
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("CommandRequests", "Failed to decode CommandRequest", e11);
            return null;
        }
    }

    public final ot.c b() {
        String B;
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID()\n        .toString()");
        B = v.B(uuid, "-", "", false);
        return new ot.c(B, null, null, ot.d.SOURCE_APP_NATIVE, null, false, false, null, null, 502, null);
    }
}