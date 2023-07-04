package x20;

import vz.b0;

/* loaded from: classes5.dex */
public final class h {
    public static final <E> e<E> a(int i11, kotlinx.coroutines.channels.a aVar, h00.l<? super E, b0> lVar) {
        if (i11 == -2) {
            return new d(aVar == kotlinx.coroutines.channels.a.SUSPEND ? e.f57005f3.a() : 1, aVar, lVar);
        } else if (i11 == -1) {
            if ((aVar != kotlinx.coroutines.channels.a.SUSPEND ? 0 : 1) != 0) {
                return new n(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i11 == 0) {
            if (aVar == kotlinx.coroutines.channels.a.SUSPEND) {
                return new v(lVar);
            }
            return new d(1, aVar, lVar);
        } else if (i11 != Integer.MAX_VALUE) {
            if (i11 == 1 && aVar == kotlinx.coroutines.channels.a.DROP_OLDEST) {
                return new n(lVar);
            }
            return new d(i11, aVar, lVar);
        } else {
            return new o(lVar);
        }
    }

    public static /* synthetic */ e b(int i11, kotlinx.coroutines.channels.a aVar, h00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            aVar = kotlinx.coroutines.channels.a.SUSPEND;
        }
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        return a(i11, aVar, lVar);
    }
}