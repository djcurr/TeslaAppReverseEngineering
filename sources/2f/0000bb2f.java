package w0;

import c1.i;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import l0.f1;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final l2.u<s1.f> f55110a = new l2.u<>("TextFieldMagnifier", null, 2, null);

    /* renamed from: b  reason: collision with root package name */
    private static final l0.n f55111b = new l0.n(Float.NaN, Float.NaN);

    /* renamed from: c  reason: collision with root package name */
    private static final l0.d1<s1.f, l0.n> f55112c = f1.a(a.f55114a, b.f55115a);

    /* renamed from: d  reason: collision with root package name */
    private static final long f55113d = s1.g.a(0.01f, 0.01f);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<s1.f, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55114a = new a();

        a() {
            super(1);
        }

        public final l0.n a(long j11) {
            if (!s1.g.c(j11)) {
                return m0.f55111b;
            }
            return new l0.n(s1.f.l(j11), s1.f.m(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(s1.f fVar) {
            return a(fVar.t());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<l0.n, s1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55115a = new b();

        b() {
            super(1);
        }

        public final long a(l0.n it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return s1.g.a(it2.f(), it2.g());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ s1.f invoke(l0.n nVar) {
            return s1.f.d(a(nVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1", f = "TextFieldMagnifier.kt", l = {CipherSuite.TLS_PSK_WITH_NULL_SHA384}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<T> f55117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0.a<T, V> f55118c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l0.i<T> f55119d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: classes.dex */
        public static final class a<T> extends kotlin.jvm.internal.u implements h00.a<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<T> f55120a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(v1<? extends T> v1Var) {
                super(0);
                this.f55120a = v1Var;
            }

            @Override // h00.a
            public final T invoke() {
                return (T) m0.h(this.f55120a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1$2", f = "TextFieldMagnifier.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<T, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f55121a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f55122b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l0.a<T, V> f55123c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ l0.i<T> f55124d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l0.a<T, V> aVar, l0.i<T> iVar, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f55123c = aVar;
                this.f55124d = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                b bVar = new b(this.f55123c, this.f55124d, dVar);
                bVar.f55122b = obj;
                return bVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(T t11, zz.d<? super vz.b0> dVar) {
                return ((b) create(t11, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f55121a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    Object obj2 = this.f55122b;
                    l0.a<T, V> aVar = this.f55123c;
                    l0.i<T> iVar = this.f55124d;
                    this.f55121a = 1;
                    if (l0.a.f(aVar, obj2, iVar, null, null, this, 12, null) == d11) {
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
        c(v1<? extends T> v1Var, l0.a<T, V> aVar, l0.i<T> iVar, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f55117b = v1Var;
            this.f55118c = aVar;
            this.f55119d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f55117b, this.f55118c, this.f55119d, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f55116a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e n11 = n1.n(new a(this.f55117b));
                b bVar = new b(this.f55118c, this.f55119d, null);
                this.f55116a = 1;
                if (kotlinx.coroutines.flow.g.g(n11, bVar, this) == d11) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55125a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t0 t0Var) {
            super(0);
            this.f55125a = t0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final i invoke() {
            return this.f55125a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<s2.a0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.t f55126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x0.t tVar) {
            super(0);
            this.f55126a = tVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final s2.a0 invoke() {
            return this.f55126a.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.t f55127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x0.t tVar) {
            super(1);
            this.f55127a = tVar;
        }

        public final Integer a(int i11) {
            return Integer.valueOf(this.f55127a.x().originalToTransformed(i11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<Integer, s1.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55128a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t0 t0Var) {
            super(1);
            this.f55128a = t0Var;
        }

        public final s1.h a(int i11) {
            n2.w i12;
            v0 g11 = this.f55128a.g();
            if (g11 == null || (i12 = g11.i()) == null) {
                return null;
            }
            return i12.d(i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ s1.h invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<h00.a<s1.f>, o1.f> f55129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f55130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.a<i> f55131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.a<s2.a0> f55132d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<Integer, Integer> f55133e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<Integer, s1.h> f55134f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<s1.f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<s1.f> f55135a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v1<s1.f> v1Var) {
                super(0);
                this.f55135a = v1Var;
            }

            public final long a() {
                return h.c(this.f55135a);
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ s1.f invoke() {
                return s1.f.d(a());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<s1.f> f55136a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v1<s1.f> v1Var) {
                super(1);
                this.f55136a = v1Var;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
                invoke2(vVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(l2.v semantics) {
                kotlin.jvm.internal.s.g(semantics, "$this$semantics");
                semantics.b(m0.f(), s1.f.d(h.c(this.f55136a)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.a<s1.f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.a<i> f55137a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.a<s2.a0> f55138b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.l<Integer, Integer> f55139c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.l<Integer, s1.h> f55140d;

            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f55141a;

                static {
                    int[] iArr = new int[i.values().length];
                    iArr[i.Cursor.ordinal()] = 1;
                    iArr[i.SelectionStart.ordinal()] = 2;
                    iArr[i.SelectionEnd.ordinal()] = 3;
                    f55141a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(h00.a<? extends i> aVar, h00.a<s2.a0> aVar2, h00.l<? super Integer, Integer> lVar, h00.l<? super Integer, s1.h> lVar2) {
                super(0);
                this.f55137a = aVar;
                this.f55138b = aVar2;
                this.f55139c = lVar;
                this.f55140d = lVar2;
            }

            public final long a() {
                int n11;
                i invoke = this.f55137a.invoke();
                int i11 = invoke == null ? -1 : a.f55141a[invoke.ordinal()];
                if (i11 != -1) {
                    if (i11 == 1 || i11 == 2) {
                        n11 = n2.y.n(this.f55138b.invoke().g());
                    } else if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        n11 = n2.y.i(this.f55138b.invoke().g());
                    }
                    s1.h invoke2 = this.f55140d.invoke(Integer.valueOf(this.f55139c.invoke(Integer.valueOf(n11)).intValue()));
                    s1.f d11 = invoke2 == null ? null : s1.f.d(invoke2.g());
                    return d11 == null ? s1.f.f49950b.b() : d11.t();
                }
                return s1.f.f49950b.b();
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ s1.f invoke() {
                return s1.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(h00.l<? super h00.a<s1.f>, ? extends o1.f> lVar, boolean z11, h00.a<? extends i> aVar, h00.a<s2.a0> aVar2, h00.l<? super Integer, Integer> lVar2, h00.l<? super Integer, s1.h> lVar3) {
            super(3);
            this.f55129a = lVar;
            this.f55130b = z11;
            this.f55131c = aVar;
            this.f55132d = aVar2;
            this.f55133e = lVar2;
            this.f55134f = lVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(v1<s1.f> v1Var) {
            return v1Var.getValue().t();
        }

        public final o1.f b(o1.f composed, c1.i iVar, int i11) {
            o1.f fVar;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(728603669);
            v1 g11 = m0.g(m0.f55112c, s1.f.d(m0.f55113d), null, new c(this.f55131c, this.f55132d, this.f55133e, this.f55134f), iVar, 56, 4);
            o1.f g02 = composed.g0(this.f55129a.invoke(new a(g11)));
            if (this.f55130b) {
                fVar = l2.o.b(o1.f.f42062f1, false, new b(g11), 1, null);
            } else {
                fVar = o1.f.f42062f1;
            }
            o1.f g03 = g02.g0(fVar);
            iVar.N();
            return g03;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return b(fVar, iVar, num.intValue());
        }
    }

    public static final l2.u<s1.f> f() {
        return f55110a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends l0.p> v1<T> g(l0.d1<T, V> d1Var, T t11, l0.i<T> iVar, h00.a<? extends T> aVar, c1.i iVar2, int i11, int i12) {
        iVar2.x(1513221697);
        if ((i12 & 2) != 0) {
            t11 = null;
        }
        if ((i12 & 4) != 0) {
            iVar = new l0.v0<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, t11, 3, null);
        }
        iVar2.x(-3687241);
        Object y11 = iVar2.y();
        i.a aVar2 = c1.i.f8486a;
        if (y11 == aVar2.a()) {
            y11 = n1.c(aVar);
            iVar2.p(y11);
        }
        iVar2.N();
        v1 v1Var = (v1) y11;
        iVar2.x(-3687241);
        Object y12 = iVar2.y();
        if (y12 == aVar2.a()) {
            y12 = new l0.a(h(v1Var), d1Var, t11);
            iVar2.p(y12);
        }
        iVar2.N();
        l0.a aVar3 = (l0.a) y12;
        c1.b0.d(vz.b0.f54756a, new c(v1Var, aVar3, iVar, null), iVar2, 0);
        v1<T> g11 = aVar3.g();
        iVar2.N();
        return g11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T h(v1<? extends T> v1Var) {
        return v1Var.getValue();
    }

    public static final o1.f i(o1.f fVar, h00.a<? extends i> draggingHandle, h00.a<s2.a0> fieldValue, h00.l<? super Integer, Integer> transformTextOffset, h00.l<? super Integer, s1.h> getCursorRect, h00.l<? super h00.a<s1.f>, ? extends o1.f> androidMagnifier, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(draggingHandle, "draggingHandle");
        kotlin.jvm.internal.s.g(fieldValue, "fieldValue");
        kotlin.jvm.internal.s.g(transformTextOffset, "transformTextOffset");
        kotlin.jvm.internal.s.g(getCursorRect, "getCursorRect");
        kotlin.jvm.internal.s.g(androidMagnifier, "androidMagnifier");
        return o1.e.b(fVar, null, new h(androidMagnifier, z11, draggingHandle, fieldValue, transformTextOffset, getCursorRect), 1, null);
    }

    public static final o1.f j(o1.f fVar, x0.t manager, h00.l<? super h00.a<s1.f>, ? extends o1.f> androidMagnifier, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(manager, "manager");
        kotlin.jvm.internal.s.g(androidMagnifier, "androidMagnifier");
        t0 z12 = manager.z();
        return z12 == null ? o1.f.f42062f1 : i(fVar, new d(z12), new e(manager), new f(manager), new g(z12), androidMagnifier, z11);
    }

    public static /* synthetic */ o1.f k(o1.f fVar, x0.t tVar, h00.l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return j(fVar, tVar, lVar, z11);
    }
}