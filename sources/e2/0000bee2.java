package x20;

import v20.o0;
import vz.b0;
import vz.q;
import x20.i;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
final /* synthetic */ class k {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super i<? extends b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57013a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f57014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x<E> f57015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E f57016d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(x<? super E> xVar, E e11, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f57015c = xVar;
            this.f57016d = e11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f57015c, this.f57016d, dVar);
            aVar.f57014b = obj;
            return aVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, zz.d<? super i<? extends b0>> dVar) {
            return invoke2(o0Var, (zz.d<? super i<b0>>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, zz.d<? super i<b0>> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object b11;
            d11 = a00.d.d();
            int i11 = this.f57013a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    o0 o0Var = (o0) this.f57014b;
                    x<E> xVar = this.f57015c;
                    E e11 = this.f57016d;
                    q.a aVar = vz.q.f54772b;
                    this.f57013a = 1;
                    if (xVar.b(e11, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                b11 = vz.q.b(b0.f54756a);
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            return i.b(vz.q.h(b11) ? i.f57009b.c(b0.f54756a) : i.f57009b.a(vz.q.e(b11)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(x<? super E> xVar, E e11) {
        Object b11;
        Object d11 = xVar.d(e11);
        if (d11 instanceof i.c) {
            b11 = v20.j.b(null, new a(xVar, e11, null), 1, null);
            return ((i) b11).l();
        }
        b0 b0Var = (b0) d11;
        return i.f57009b.c(b0.f54756a);
    }
}