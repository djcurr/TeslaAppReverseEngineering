package c1;

import c1.m0;
import zz.g;

/* loaded from: classes.dex */
final class f1 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f1 f8464a = new f1();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<R> extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super R>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Long, R> f8466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super Long, ? extends R> lVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f8466b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f8466b, dVar);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, Object obj) {
            return invoke(o0Var, (zz.d) ((zz.d) obj));
        }

        public final Object invoke(v20.o0 o0Var, zz.d<? super R> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f8465a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f8465a = 1;
                if (v20.y0.b(16L, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return this.f8466b.invoke(kotlin.coroutines.jvm.internal.b.d(System.nanoTime()));
        }
    }

    private f1() {
    }

    @Override // c1.m0
    public <R> Object e0(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        return v20.i.g(v20.e1.c(), new a(lVar, null), dVar);
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) m0.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) m0.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return m0.a.c(this);
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return m0.a.d(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return m0.a.e(this, gVar);
    }
}