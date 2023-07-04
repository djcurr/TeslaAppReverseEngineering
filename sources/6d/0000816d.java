package l0;

/* loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<R> extends kotlin.coroutines.jvm.internal.l implements h00.l<zz.d<? super R>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Long, R> f36152b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super Long, ? extends R> lVar, zz.d<? super a> dVar) {
            super(1, dVar);
            this.f36152b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(zz.d<?> dVar) {
            return new a(this.f36152b, dVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((zz.d) ((zz.d) obj));
        }

        public final Object invoke(zz.d<? super R> dVar) {
            return ((a) create(dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f36151a;
            if (i11 == 0) {
                vz.r.b(obj);
                h00.l<Long, R> lVar = this.f36152b;
                this.f36151a = 1;
                obj = c1.n0.b(lVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return obj;
        }
    }

    public static final <R> Object a(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        androidx.compose.ui.platform.v0 v0Var = (androidx.compose.ui.platform.v0) dVar.getContext().get(androidx.compose.ui.platform.v0.f3121r);
        if (v0Var == null) {
            return c1.n0.b(lVar, dVar);
        }
        return v0Var.C0(new a(lVar, null), dVar);
    }
}