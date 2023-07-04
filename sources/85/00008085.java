package kq;

import ch.qos.logback.core.CoreConstants;
import hq.g;
import hq.h;
import java.io.IOException;

/* loaded from: classes2.dex */
public class c implements e<Object> {
    @Override // kq.e
    public <E> void a(E e11, Appendable appendable, g gVar) {
        gq.b[] d11;
        try {
            gq.d b11 = gq.d.b(e11.getClass(), h.f29394a);
            appendable.append(CoreConstants.CURLY_LEFT);
            boolean z11 = false;
            for (gq.b bVar : b11.d()) {
                Object c11 = b11.c(e11, bVar.a());
                if (c11 != null || !gVar.g()) {
                    if (z11) {
                        appendable.append(CoreConstants.COMMA_CHAR);
                    } else {
                        z11 = true;
                    }
                    hq.d.j(bVar.b(), c11, appendable, gVar);
                }
            }
            appendable.append(CoreConstants.CURLY_RIGHT);
        } catch (IOException e12) {
            throw e12;
        }
    }
}