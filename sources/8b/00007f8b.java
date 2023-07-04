package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a */
    public static final kotlinx.coroutines.internal.f0 f35234a = new kotlinx.coroutines.internal.f0("NO_VALUE");

    public static final <T> t<T> a(int i11, int i12, kotlinx.coroutines.channels.a aVar) {
        boolean z11 = true;
        if (i11 >= 0) {
            if (i12 >= 0) {
                if (i11 <= 0 && i12 <= 0 && aVar != kotlinx.coroutines.channels.a.SUSPEND) {
                    z11 = false;
                }
                if (z11) {
                    int i13 = i12 + i11;
                    if (i13 < 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    return new z(i11, i13, aVar);
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", aVar).toString());
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i12)).toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("replay cannot be negative, but was ", Integer.valueOf(i11)).toString());
    }

    public static /* synthetic */ t b(int i11, int i12, kotlinx.coroutines.channels.a aVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            aVar = kotlinx.coroutines.channels.a.SUSPEND;
        }
        return a(i11, i12, aVar);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j11) {
        return f(objArr, j11);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j11, Object obj) {
        g(objArr, j11, obj);
    }

    public static final <T> e<T> e(y<? extends T> yVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return ((i11 == 0 || i11 == -3) && aVar == kotlinx.coroutines.channels.a.SUSPEND) ? yVar : new y20.g(yVar, gVar, i11, aVar);
    }

    public static final Object f(Object[] objArr, long j11) {
        return objArr[((int) j11) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j11, Object obj) {
        objArr[((int) j11) & (objArr.length - 1)] = obj;
    }
}