package s0;

import c1.n1;
import c1.s1;
import c1.v1;
import h2.j0;
import java.util.HashMap;
import java.util.Map;
import v20.o0;
import vz.b0;
import wz.s0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final int f49800a = 30;

    /* renamed from: b  reason: collision with root package name */
    private static final int f49801b = 100;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.list.LazyListItemsProviderImplKt$rememberStateOfItemsProvider$1", f = "LazyListItemsProviderImpl.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q0.h f49803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<m00.i> f49804c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s0.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1091a extends kotlin.jvm.internal.u implements h00.a<m00.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0.h f49805a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1091a(q0.h hVar) {
                super(0);
                this.f49805a = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final m00.i invoke() {
                return m.b(this.f49805a.g());
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements kotlinx.coroutines.flow.f<m00.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.o0 f49806a;

            public b(c1.o0 o0Var) {
                this.f49806a = o0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(m00.i iVar, zz.d<? super b0> dVar) {
                this.f49806a.setValue(iVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q0.h hVar, c1.o0<m00.i> o0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f49803b = hVar;
            this.f49804c = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f49803b, this.f49804c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f49802a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e n11 = n1.n(new C1091a(this.f49803b));
                b bVar = new b(this.f49804c);
                this.f49802a = 1;
                if (n11.collect(bVar, this) == d11) {
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

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<h00.l<q0.g, b0>> f49807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0<f> f49808b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<m00.i> f49809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(v1<? extends h00.l<? super q0.g, b0>> v1Var, j0<f> j0Var, c1.o0<m00.i> o0Var) {
            super(0);
            this.f49807a = v1Var;
            this.f49808b = j0Var;
            this.f49809c = o0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final k invoke() {
            s sVar = new s();
            this.f49807a.getValue().invoke(sVar);
            return new l(this.f49808b, sVar.c(), sVar.b(), this.f49809c.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m00.i b(int i11) {
        m00.i r11;
        int i12 = f49800a;
        int i13 = (i11 / i12) * i12;
        int i14 = f49801b;
        r11 = m00.l.r(Math.max(i13 - i14, 0), i13 + i12 + i14);
        return r11;
    }

    public static final Map<Object, Integer> c(m00.i range, c<h> list) {
        Map<Object, Integer> i11;
        kotlin.jvm.internal.s.g(range, "range");
        kotlin.jvm.internal.s.g(list, "list");
        int c11 = range.c();
        if (c11 >= 0) {
            int min = Math.min(range.e(), list.b() - 1);
            if (min < c11) {
                i11 = s0.i();
                return i11;
            }
            HashMap hashMap = new HashMap();
            int c12 = d.c(list, c11);
            while (c11 <= min) {
                s0.b<h> bVar = list.a().get(c12);
                h00.l<Integer, Object> b11 = bVar.a().b();
                if (b11 != null) {
                    int c13 = c11 - bVar.c();
                    if (c13 == bVar.b()) {
                        c12++;
                    } else {
                        hashMap.put(b11.invoke(Integer.valueOf(c13)), Integer.valueOf(c11));
                        c11++;
                    }
                } else {
                    c12++;
                    c11 = bVar.c() + bVar.b();
                }
            }
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final v1<k> d(q0.h state, h00.l<? super q0.g, b0> content, j0<f> itemScope, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(content, "content");
        kotlin.jvm.internal.s.g(itemScope, "itemScope");
        iVar.x(112461157);
        v1 m11 = n1.m(content, iVar, (i11 >> 3) & 14);
        iVar.x(-3686930);
        boolean O = iVar.O(state);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = s1.d(b(state.h()), null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        c1.o0 o0Var = (c1.o0) y11;
        c1.b0.d(o0Var, new a(state, o0Var, null), iVar, 0);
        iVar.x(-3686930);
        boolean O2 = iVar.O(o0Var);
        Object y12 = iVar.y();
        if (O2 || y12 == c1.i.f8486a.a()) {
            y12 = n1.c(new b(m11, itemScope, o0Var));
            iVar.p(y12);
        }
        iVar.N();
        v1<k> v1Var = (v1) y12;
        iVar.N();
        return v1Var;
    }
}