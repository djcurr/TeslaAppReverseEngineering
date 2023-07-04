package or;

import h00.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import nr.u;
import v20.o0;
import vz.b0;
import vz.r;
import x20.t;

/* loaded from: classes2.dex */
public final class m<PropsT, OutputT, RenderingT> {

    /* renamed from: a  reason: collision with root package name */
    private final nr.k<PropsT, ?, OutputT, RenderingT> f42994a;

    /* renamed from: b  reason: collision with root package name */
    private final d f42995b;

    /* renamed from: c  reason: collision with root package name */
    private PropsT f42996c;

    /* renamed from: d  reason: collision with root package name */
    private final t<PropsT> f42997d;

    /* renamed from: e  reason: collision with root package name */
    private final j<PropsT, ? extends Object, OutputT, RenderingT> f42998e;

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<x20.i<? extends PropsT>, zz.d<? super u<? extends OutputT>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42999a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f43000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<PropsT, OutputT, RenderingT> f43001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<PropsT, OutputT, RenderingT> mVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f43001c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f43001c, dVar);
            aVar.f43000b = obj;
            return aVar;
        }

        public final Object e(Object obj, zz.d<? super u<? extends OutputT>> dVar) {
            return ((a) create(x20.i.b(obj), dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo160invoke(Object obj, Object obj2) {
            return e(((x20.i) obj).l(), (zz.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f42999a == 0) {
                r.b(obj);
                Object l11 = ((x20.i) this.f43000b).l();
                Throwable e11 = x20.i.e(l11);
                if (e11 == null) {
                    Object f11 = x20.i.f(l11);
                    if (f11 == null) {
                        return null;
                    }
                    m<PropsT, OutputT, RenderingT> mVar = this.f43001c;
                    if (s.c(((m) mVar).f42996c, f11)) {
                        return null;
                    }
                    ((m) mVar).f42996c = f11;
                    return null;
                }
                throw e11;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<PropsT, zz.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43002a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f43003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<PropsT, OutputT, RenderingT> f43004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<PropsT, OutputT, RenderingT> mVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f43004c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f43004c, dVar);
            bVar.f43003b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object mo160invoke(PropsT propst, zz.d<? super Boolean> dVar) {
            return ((b) create(propst, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f43002a == 0) {
                r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(s.c(this.f43003b, ((m) this.f43004c).f42996c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(o0 scope, nr.p<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, h0<? extends PropsT> props, nr.m mVar, nr.s interceptor) {
        s.g(scope, "scope");
        s.g(protoWorkflow, "protoWorkflow");
        s.g(props, "props");
        s.g(interceptor, "interceptor");
        nr.k kVar = (nr.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT>) protoWorkflow.b();
        this.f42994a = kVar;
        d dVar = new d();
        this.f42995b = dVar;
        this.f42996c = props.mo260getValue();
        this.f42997d = kotlinx.coroutines.flow.g.C(kotlinx.coroutines.flow.g.l(props, new b(this, null)), scope);
        this.f42998e = new j<>(l.b(kVar, null, 1, null), kVar, this.f42996c, mVar, scope.J(), null, null, interceptor, dVar, 96, null);
    }

    public final void e(CancellationException cancellationException) {
        this.f42998e.d(cancellationException);
    }

    public final Object f(zz.d<? super u<? extends OutputT>> dVar) {
        Object d11;
        kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(dVar);
        try {
            if (!this.f42997d.c()) {
                bVar.e(this.f42997d.i(), new a(this, null));
            }
            this.f42998e.o(bVar);
        } catch (Throwable th2) {
            bVar.c0(th2);
        }
        Object b02 = bVar.b0();
        d11 = a00.d.d();
        if (b02 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b02;
    }

    public final nr.g<RenderingT> g() {
        return new nr.g<>(this.f42998e.l(this.f42994a, this.f42996c), this.f42998e.n(this.f42994a));
    }
}