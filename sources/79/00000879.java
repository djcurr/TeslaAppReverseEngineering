package androidx.room;

import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.a2;
import v20.t1;
import vz.q;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5795a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [R] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0096a<R> extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super R>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f5796a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Callable<R> f5797b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0096a(Callable<R> callable, zz.d<? super C0096a> dVar) {
                super(2, dVar);
                this.f5797b = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0096a(this.f5797b, dVar);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, Object obj) {
                return invoke(o0Var, (zz.d) ((zz.d) obj));
            }

            public final Object invoke(v20.o0 o0Var, zz.d<? super R> dVar) {
                return ((C0096a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f5796a == 0) {
                    vz.r.b(obj);
                    return this.f5797b.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CancellationSignal f5798a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a2 f5799b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CancellationSignal cancellationSignal, a2 a2Var) {
                super(1);
                this.f5798a = cancellationSignal;
                this.f5799b = a2Var;
            }

            public final void a(Throwable th2) {
                if (Build.VERSION.SDK_INT >= 16) {
                    v4.b.a(this.f5798a);
                }
                a2.a.a(this.f5799b, null, 1, null);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
                a(th2);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f5800a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Callable<R> f5801b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v20.o<R> f5802c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Callable<R> callable, v20.o<? super R> oVar, zz.d<? super c> dVar) {
                super(2, dVar);
                this.f5801b = callable;
                this.f5802c = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new c(this.f5801b, this.f5802c, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f5800a == 0) {
                    vz.r.b(obj);
                    try {
                        Object call = this.f5801b.call();
                        zz.d dVar = this.f5802c;
                        q.a aVar = vz.q.f54772b;
                        dVar.resumeWith(vz.q.b(call));
                    } catch (Throwable th2) {
                        zz.d dVar2 = this.f5802c;
                        q.a aVar2 = vz.q.f54772b;
                        dVar2.resumeWith(vz.q.b(vz.r.a(th2)));
                    }
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> Object a(t0 t0Var, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, zz.d<? super R> dVar) {
            zz.d c11;
            a2 d11;
            Object d12;
            if (t0Var.isOpen() && t0Var.inTransaction()) {
                return callable.call();
            }
            a1 a1Var = (a1) dVar.getContext().get(a1.f5739b);
            v20.j0 b11 = a1Var == null ? null : a1Var.b();
            if (b11 == null) {
                b11 = z11 ? o.b(t0Var) : o.a(t0Var);
            }
            c11 = a00.c.c(dVar);
            v20.p pVar = new v20.p(c11, 1);
            pVar.y();
            d11 = v20.k.d(t1.f54002a, b11, null, new c(callable, pVar, null), 2, null);
            pVar.T(new b(cancellationSignal, d11));
            Object s11 = pVar.s();
            d12 = a00.d.d();
            if (s11 == d12) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return s11;
        }

        public final <R> Object b(t0 t0Var, boolean z11, Callable<R> callable, zz.d<? super R> dVar) {
            if (t0Var.isOpen() && t0Var.inTransaction()) {
                return callable.call();
            }
            a1 a1Var = (a1) dVar.getContext().get(a1.f5739b);
            v20.j0 b11 = a1Var == null ? null : a1Var.b();
            if (b11 == null) {
                b11 = z11 ? o.b(t0Var) : o.a(t0Var);
            }
            return v20.i.g(b11, new C0096a(callable, null), dVar);
        }
    }

    public static final <R> Object a(t0 t0Var, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, zz.d<? super R> dVar) {
        return f5795a.a(t0Var, z11, cancellationSignal, callable, dVar);
    }

    public static final <R> Object b(t0 t0Var, boolean z11, Callable<R> callable, zz.d<? super R> dVar) {
        return f5795a.b(t0Var, z11, callable, dVar);
    }
}