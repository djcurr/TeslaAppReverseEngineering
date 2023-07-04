package androidx.lifecycle;

/* loaded from: classes.dex */
public final class g {
    public static final <T> LiveData<T> a(zz.g context, long j11, h00.p<? super b0<T>, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(block, "block");
        return new f(context, j11, block);
    }

    public static /* synthetic */ LiveData b(zz.g gVar, long j11, h00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return a(gVar, j11, pVar);
    }
}