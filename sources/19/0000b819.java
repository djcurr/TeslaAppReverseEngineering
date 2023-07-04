package us;

import j$.time.Instant;
import java.util.UUID;
import kotlin.jvm.internal.s;
import okio.i;
import qt.g;

/* loaded from: classes6.dex */
public final class b {
    public static final qt.d a(qt.c cVar) {
        s.g(cVar, "<this>");
        i.a aVar = i.f42657e;
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        byte[] bytes = uuid.getBytes(kotlin.text.d.f35187b);
        s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        i h11 = i.a.h(aVar, bytes, 0, 0, 3, null);
        i n11 = cVar.n();
        i i11 = cVar.i();
        return new qt.d(new qt.c(h11, cVar.m(), Instant.EPOCH, null, 0, n11, g.STATUS_CODE_CLIENT_ACK.getValue(), null, null, i11, null, cVar.f(), null, 5528, null), null, null, null, 14, null);
    }

    public static final qt.a b(qt.c cVar) {
        s.g(cVar, "<this>");
        return qt.a.Companion.a(cVar.c());
    }

    public static final g c(qt.c cVar) {
        s.g(cVar, "<this>");
        return g.Companion.a(cVar.l());
    }
}