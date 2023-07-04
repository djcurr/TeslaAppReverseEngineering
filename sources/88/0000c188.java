package y20;

import java.util.ArrayList;
import v20.o0;
import v20.p0;
import v20.r0;
import v20.s0;
import vz.b0;
import wz.e0;

/* loaded from: classes5.dex */
public abstract class d<T> implements n<T> {

    /* renamed from: a  reason: collision with root package name */
    public final zz.g f58996a;

    /* renamed from: b  reason: collision with root package name */
    public final int f58997b;

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.channels.a f58998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58999a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<T> f59001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d<T> f59002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.f<? super T> fVar, d<T> dVar, zz.d<? super a> dVar2) {
            super(2, dVar2);
            this.f59001c = fVar;
            this.f59002d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f59001c, this.f59002d, dVar);
            aVar.f59000b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58999a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.f<T> fVar = this.f59001c;
                x20.t<T> l11 = this.f59002d.l((o0) this.f59000b);
                this.f58999a = 1;
                if (kotlinx.coroutines.flow.g.n(fVar, l11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<x20.r<? super T>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59003a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d<T> f59005c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, zz.d<? super b> dVar2) {
            super(2, dVar2);
            this.f59005c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f59005c, dVar);
            bVar.f59004b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(x20.r<? super T> rVar, zz.d<? super b0> dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f59003a;
            if (i11 == 0) {
                vz.r.b(obj);
                d<T> dVar = this.f59005c;
                this.f59003a = 1;
                if (dVar.g((x20.r) this.f59004b, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    public d(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        this.f58996a = gVar;
        this.f58997b = i11;
        this.f58998c = aVar;
        if (r0.a()) {
            if (!(i11 != -1)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ Object f(d dVar, kotlinx.coroutines.flow.f fVar, zz.d dVar2) {
        Object d11;
        Object e11 = p0.e(new a(fVar, dVar, null), dVar2);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : b0.f54756a;
    }

    @Override // y20.n
    public kotlinx.coroutines.flow.e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        if (r0.a()) {
            if (!(i11 != -1)) {
                throw new AssertionError();
            }
        }
        zz.g plus = gVar.plus(this.f58996a);
        if (aVar == kotlinx.coroutines.channels.a.SUSPEND) {
            int i12 = this.f58997b;
            if (i12 != -3) {
                if (i11 != -3) {
                    if (i12 != -2) {
                        if (i11 != -2) {
                            if (r0.a()) {
                                if (!(this.f58997b >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (r0.a()) {
                                if (!(i11 >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i12 = this.f58997b + i11;
                            if (i12 < 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            aVar = this.f58998c;
        }
        return (kotlin.jvm.internal.s.c(plus, this.f58996a) && i11 == this.f58997b && aVar == this.f58998c) ? this : h(plus, i11, aVar);
    }

    @Override // kotlinx.coroutines.flow.e
    public Object collect(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super b0> dVar) {
        return f(this, fVar, dVar);
    }

    protected String e() {
        return null;
    }

    protected abstract Object g(x20.r<? super T> rVar, zz.d<? super b0> dVar);

    protected abstract d<T> h(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar);

    public kotlinx.coroutines.flow.e<T> i() {
        return null;
    }

    public final h00.p<x20.r<? super T>, zz.d<? super b0>, Object> j() {
        return new b(this, null);
    }

    public final int k() {
        int i11 = this.f58997b;
        if (i11 == -3) {
            return -2;
        }
        return i11;
    }

    public x20.t<T> l(o0 o0Var) {
        return x20.p.b(o0Var, this.f58996a, k(), this.f58998c, kotlinx.coroutines.a.ATOMIC, null, j(), 16, null);
    }

    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList(4);
        String e11 = e();
        if (e11 != null) {
            arrayList.add(e11);
        }
        zz.g gVar = this.f58996a;
        if (gVar != zz.h.f61280a) {
            arrayList.add(kotlin.jvm.internal.s.p("context=", gVar));
        }
        int i11 = this.f58997b;
        if (i11 != -3) {
            arrayList.add(kotlin.jvm.internal.s.p("capacity=", Integer.valueOf(i11)));
        }
        kotlinx.coroutines.channels.a aVar = this.f58998c;
        if (aVar != kotlinx.coroutines.channels.a.SUSPEND) {
            arrayList.add(kotlin.jvm.internal.s.p("onBufferOverflow=", aVar));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s0.a(this));
        sb2.append('[');
        l02 = e0.l0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(l02);
        sb2.append(']');
        return sb2.toString();
    }
}