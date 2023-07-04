package os;

import java.util.Locale;
import java.util.Objects;
import jt.e;
import jt.f;
import jt.g;
import jt.h;
import kotlin.jvm.internal.s;
import ot.m;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f43973a = new b();

    private b() {
    }

    public final f a(String commandId) {
        s.g(commandId, "commandId");
        return new f(g.COMMAND_ID, null, null, null, new h(commandId, null, 2, null), null, 46, null);
    }

    public final f b(ot.c request) {
        s.g(request, "request");
        return new f(g.COMMAND, null, null, null, new h(uu.c.b(request), null, 2, null), null, 46, null);
    }

    public final f c(String requestId) {
        s.g(requestId, "requestId");
        return new f(g.RESPONSE_REQUEST_ID, null, null, null, new h(requestId, null, 2, null), null, 46, null);
    }

    public final f d(int i11) {
        return new f(g.RESPONSE_STATUS_CODE, null, new e(i11, null, 2, null), null, null, null, 58, null);
    }

    public final f e(m transport) {
        s.g(transport, "transport");
        g gVar = g.TRANSPORT;
        String name = transport.name();
        Locale US = Locale.US;
        s.f(US, "US");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(US);
        s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return new f(gVar, null, null, null, new h(lowerCase, null, 2, null), null, 46, null);
    }
}