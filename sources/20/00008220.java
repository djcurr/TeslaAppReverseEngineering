package l2;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(p pVar) {
        return pVar.i() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2.k f(h2.k kVar, h00.l<? super h2.k, Boolean> lVar) {
        for (h2.k e02 = kVar.e0(); e02 != null; e02 = e02.e0()) {
            if (lVar.invoke(e02).booleanValue()) {
                return e02;
            }
        }
        return null;
    }

    private static final List<x> g(h2.k kVar, List<x> list) {
        d1.e<h2.k> i02 = kVar.i0();
        int l11 = i02.l();
        if (l11 > 0) {
            int i11 = 0;
            h2.k[] k11 = i02.k();
            do {
                h2.k kVar2 = k11[i11];
                x j11 = j(kVar2);
                if (j11 != null) {
                    list.add(j11);
                } else {
                    g(kVar2, list);
                }
                i11++;
            } while (i11 < l11);
            return list;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List h(h2.k kVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return g(kVar, list);
    }

    public static final x i(h2.k kVar) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        for (h2.o c02 = kVar.c0(); c02 != null; c02 = c02.v1()) {
            if (c02 instanceof x) {
                x xVar = (x) c02;
                if (xVar.a2().r0().m()) {
                    return xVar;
                }
            }
        }
        return null;
    }

    public static final x j(h2.k kVar) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        for (h2.o c02 = kVar.c0(); c02 != null; c02 = c02.v1()) {
            if (c02 instanceof x) {
                return (x) c02;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h k(p pVar) {
        return (h) l.a(pVar.t(), s.f36459a.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(p pVar) {
        return pVar.i() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}