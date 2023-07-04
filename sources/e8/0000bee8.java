package x20;

import v20.i0;
import v20.o0;
import vz.b0;

/* loaded from: classes5.dex */
public final class p {
    public static final <E> t<E> a(o0 o0Var, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, kotlinx.coroutines.a aVar2, h00.l<? super Throwable, b0> lVar, h00.p<? super r<? super E>, ? super zz.d<? super b0>, ? extends Object> pVar) {
        q qVar = new q(i0.d(o0Var, gVar), h.b(i11, aVar, null, 4, null));
        if (lVar != null) {
            qVar.p(lVar);
        }
        qVar.Z0(aVar2, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ t b(o0 o0Var, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, kotlinx.coroutines.a aVar2, h00.l lVar, h00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        zz.g gVar2 = gVar;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            aVar = kotlinx.coroutines.channels.a.SUSPEND;
        }
        kotlinx.coroutines.channels.a aVar3 = aVar;
        if ((i12 & 8) != 0) {
            aVar2 = kotlinx.coroutines.a.DEFAULT;
        }
        kotlinx.coroutines.a aVar4 = aVar2;
        if ((i12 & 16) != 0) {
            lVar = null;
        }
        return a(o0Var, gVar2, i13, aVar3, aVar4, lVar, pVar);
    }
}