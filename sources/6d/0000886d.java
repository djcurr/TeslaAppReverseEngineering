package n0;

import okhttp3.internal.http.StatusLine;
import v20.o0;
import v20.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<Float, vz.b0> f39758a;

    /* renamed from: b  reason: collision with root package name */
    private final l f39759b;

    /* renamed from: c  reason: collision with root package name */
    private final m0.w f39760c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39761a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0.v f39763c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<l, zz.d<? super vz.b0>, Object> f39764d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m0.v vVar, h00.p<? super l, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f39763c = vVar;
            this.f39764d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f39763c, this.f39764d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39761a;
            if (i11 == 0) {
                vz.r.b(obj);
                m0.w wVar = f.this.f39760c;
                l lVar = f.this.f39759b;
                m0.v vVar = this.f39763c;
                h00.p<l, zz.d<? super vz.b0>, Object> pVar = this.f39764d;
                this.f39761a = 1;
                if (wVar.d(lVar, vVar, pVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements l {
        b() {
        }

        @Override // n0.l
        public void a(float f11) {
            f.this.e().invoke(Float.valueOf(f11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h00.l<? super Float, vz.b0> onDelta) {
        kotlin.jvm.internal.s.g(onDelta, "onDelta");
        this.f39758a = onDelta;
        this.f39759b = new b();
        this.f39760c = new m0.w();
    }

    @Override // n0.n
    public Object a(m0.v vVar, h00.p<? super l, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(new a(vVar, pVar, null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }

    @Override // n0.n
    public void b(float f11) {
        this.f39758a.invoke(Float.valueOf(f11));
    }

    public final h00.l<Float, vz.b0> e() {
        return this.f39758a;
    }
}