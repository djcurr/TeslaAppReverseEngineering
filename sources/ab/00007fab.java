package kotlinx.coroutines.flow;

import v20.a2;
import y20.n;

/* loaded from: classes5.dex */
public final /* synthetic */ class k {
    public static final <T> e<T> a(e<? extends T> eVar, int i11, kotlinx.coroutines.channels.a aVar) {
        int i12;
        kotlinx.coroutines.channels.a aVar2;
        boolean z11 = true;
        if (i11 >= 0 || i11 == -2 || i11 == -1) {
            if (i11 == -1 && aVar != kotlinx.coroutines.channels.a.SUSPEND) {
                z11 = false;
            }
            if (z11) {
                if (i11 == -1) {
                    aVar2 = kotlinx.coroutines.channels.a.DROP_OLDEST;
                    i12 = 0;
                } else {
                    i12 = i11;
                    aVar2 = aVar;
                }
                return eVar instanceof y20.n ? n.a.a((y20.n) eVar, null, i12, aVar2, 1, null) : new y20.g(eVar, null, i12, aVar2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i11)).toString());
    }

    public static /* synthetic */ e b(e eVar, int i11, kotlinx.coroutines.channels.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        if ((i12 & 2) != 0) {
            aVar = kotlinx.coroutines.channels.a.SUSPEND;
        }
        return g.c(eVar, i11, aVar);
    }

    private static final void c(zz.g gVar) {
        if (!(gVar.get(a2.f53887l1) == null)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Flow context cannot contain job in it. Had ", gVar).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> d(e<? extends T> eVar, zz.g gVar) {
        c(gVar);
        return kotlin.jvm.internal.s.c(gVar, zz.h.f61280a) ? eVar : eVar instanceof y20.n ? n.a.a((y20.n) eVar, gVar, 0, null, 6, null) : new y20.g(eVar, gVar, 0, null, 12, null);
    }
}