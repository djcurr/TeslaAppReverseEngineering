package d2;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.y1;
import java.util.List;
import kotlin.jvm.internal.p0;
import v20.o0;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final m f23346a;

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f23347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p f23348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, h00.p pVar) {
            super(1);
            this.f23347a = obj;
            this.f23348b = pVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("pointerInput");
            y0Var.a().b("key1", this.f23347a);
            y0Var.a().b("block", this.f23348b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f23349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f23350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p f23351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, h00.p pVar) {
            super(1);
            this.f23349a = obj;
            this.f23350b = obj2;
            this.f23351c = pVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("pointerInput");
            y0Var.a().b("key1", this.f23349a);
            y0Var.a().b("key2", this.f23350b);
            y0Var.a().b("block", this.f23351c);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f23352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p f23353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object[] objArr, h00.p pVar) {
            super(1);
            this.f23352a = objArr;
            this.f23353b = pVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("pointerInput");
            y0Var.a().b("keys", this.f23352a);
            y0Var.a().b("block", this.f23353b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f23354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23355b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", f = "SuspendingPointerInputFilter.kt", l = {225}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23356a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f23357b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h0 f23358c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23359d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h0 f23360e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h0 h0Var, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, h0 h0Var2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f23358c = h0Var;
                this.f23359d = pVar;
                this.f23360e = h0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f23358c, this.f23359d, this.f23360e, dVar);
                aVar.f23357b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f23356a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    this.f23358c.E0((o0) this.f23357b);
                    h00.p<c0, zz.d<? super vz.b0>, Object> pVar = this.f23359d;
                    h0 h0Var = this.f23360e;
                    this.f23356a = 1;
                    if (pVar.invoke(h0Var, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
            super(3);
            this.f23354a = obj;
            this.f23355b = pVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(674421615);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            y1 y1Var = (y1) iVar.A(l0.m());
            iVar.x(-3686930);
            boolean O = iVar.O(dVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new h0(y1Var, dVar);
                iVar.p(y11);
            }
            iVar.N();
            h0 h0Var = (h0) y11;
            c1.b0.e(h0Var, this.f23354a, new a(h0Var, this.f23355b, h0Var, null), iVar, 64);
            iVar.N();
            return h0Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f23361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f23362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23363c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {257}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23364a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f23365b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h0 f23366c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23367d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h0 h0Var, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f23366c = h0Var;
                this.f23367d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f23366c, this.f23367d, dVar);
                aVar.f23365b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f23364a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    this.f23366c.E0((o0) this.f23365b);
                    h00.p<c0, zz.d<? super vz.b0>, Object> pVar = this.f23367d;
                    h0 h0Var = this.f23366c;
                    this.f23364a = 1;
                    if (pVar.invoke(h0Var, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Object obj, Object obj2, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
            super(3);
            this.f23361a = obj;
            this.f23362b = obj2;
            this.f23363c = pVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(674422863);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            y1 y1Var = (y1) iVar.A(l0.m());
            iVar.x(-3686930);
            boolean O = iVar.O(dVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new h0(y1Var, dVar);
                iVar.p(y11);
            }
            iVar.N();
            h0 h0Var = (h0) y11;
            c1.b0.f(composed, this.f23361a, this.f23362b, new a(h0Var, this.f23363c, null), iVar, (i11 & 14) | 576);
            iVar.N();
            return h0Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f23368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23369b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", f = "SuspendingPointerInputFilter.kt", l = {287}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23370a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f23371b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h0 f23372c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f23373d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h0 f23374e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h0 h0Var, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, h0 h0Var2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f23372c = h0Var;
                this.f23373d = pVar;
                this.f23374e = h0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f23372c, this.f23373d, this.f23374e, dVar);
                aVar.f23371b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f23370a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    this.f23372c.E0((o0) this.f23371b);
                    h00.p<c0, zz.d<? super vz.b0>, Object> pVar = this.f23373d;
                    h0 h0Var = this.f23374e;
                    this.f23370a = 1;
                    if (pVar.invoke(h0Var, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object[] objArr, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
            super(3);
            this.f23368a = objArr;
            this.f23369b = pVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(674424053);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            y1 y1Var = (y1) iVar.A(l0.m());
            iVar.x(-3686930);
            boolean O = iVar.O(dVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new h0(y1Var, dVar);
                iVar.p(y11);
            }
            iVar.N();
            Object[] objArr = this.f23368a;
            h00.p<c0, zz.d<? super vz.b0>, Object> pVar = this.f23369b;
            h0 h0Var = (h0) y11;
            p0 p0Var = new p0(2);
            p0Var.a(h0Var);
            p0Var.b(objArr);
            c1.b0.g(p0Var.d(new Object[p0Var.c()]), new a(h0Var, pVar, h0Var, null), iVar, 8);
            iVar.N();
            return h0Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        List i11;
        i11 = wz.w.i();
        f23346a = new m(i11);
    }

    public static final o1.f b(o1.f fVar, Object obj, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(block, "block");
        return o1.e.a(fVar, x0.c() ? new a(obj, block) : x0.a(), new d(obj, block));
    }

    public static final o1.f c(o1.f fVar, Object obj, Object obj2, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(block, "block");
        return o1.e.a(fVar, x0.c() ? new b(obj, obj2, block) : x0.a(), new e(obj, obj2, block));
    }

    public static final o1.f d(o1.f fVar, Object[] keys, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(keys, "keys");
        kotlin.jvm.internal.s.g(block, "block");
        return o1.e.a(fVar, x0.c() ? new c(keys, block) : x0.a(), new f(keys, block));
    }
}