package q4;

import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.p;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import c1.e1;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import c1.y;
import c1.z;
import h00.l;
import h00.p;
import h00.q;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.u;
import o1.f;
import p4.r;
import p4.s;
import q4.d;
import q4.j;
import vz.b0;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ p4.u f47408a;

        /* renamed from: b */
        final /* synthetic */ String f47409b;

        /* renamed from: c */
        final /* synthetic */ o1.f f47410c;

        /* renamed from: d */
        final /* synthetic */ String f47411d;

        /* renamed from: e */
        final /* synthetic */ l<s, b0> f47412e;

        /* renamed from: f */
        final /* synthetic */ int f47413f;

        /* renamed from: g */
        final /* synthetic */ int f47414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p4.u uVar, String str, o1.f fVar, String str2, l<? super s, b0> lVar, int i11, int i12) {
            super(2);
            this.f47408a = uVar;
            this.f47409b = str;
            this.f47410c = fVar;
            this.f47411d = str2;
            this.f47412e = lVar;
            this.f47413f = i11;
            this.f47414g = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j.a(this.f47408a, this.f47409b, this.f47410c, this.f47411d, this.f47412e, iVar, this.f47413f | 1, this.f47414g);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u implements l<z, y> {

        /* renamed from: a */
        final /* synthetic */ p4.u f47415a;

        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a */
            final /* synthetic */ p4.u f47416a;

            public a(p4.u uVar) {
                this.f47416a = uVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f47416a.r(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p4.u uVar) {
            super(1);
            this.f47415a = uVar;
        }

        @Override // h00.l
        public final y mo12invoke(z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            this.f47415a.r(true);
            return new a(this.f47415a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u implements q<String, c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ l1.c f47417a;

        /* renamed from: b */
        final /* synthetic */ o0<Boolean> f47418b;

        /* renamed from: c */
        final /* synthetic */ v1<Set<p4.i>> f47419c;

        /* renamed from: d */
        final /* synthetic */ q4.d f47420d;

        /* renamed from: e */
        final /* synthetic */ v1<List<p4.i>> f47421e;

        /* loaded from: classes.dex */
        public static final class a extends u implements p<c1.i, Integer, b0> {

            /* renamed from: a */
            final /* synthetic */ p4.i f47422a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p4.i iVar) {
                super(2);
                this.f47422a = iVar;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    ((d.b) this.f47422a.f()).x().invoke(this.f47422a, iVar, 8);
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends u implements l<z, y> {

            /* renamed from: a */
            final /* synthetic */ o0<Boolean> f47423a;

            /* renamed from: b */
            final /* synthetic */ v1<Set<p4.i>> f47424b;

            /* renamed from: c */
            final /* synthetic */ q4.d f47425c;

            /* loaded from: classes.dex */
            public static final class a implements y {

                /* renamed from: a */
                final /* synthetic */ v1 f47426a;

                /* renamed from: b */
                final /* synthetic */ q4.d f47427b;

                public a(v1 v1Var, q4.d dVar) {
                    this.f47426a = v1Var;
                    this.f47427b = dVar;
                }

                @Override // c1.y
                public void dispose() {
                    for (p4.i iVar : j.d(this.f47426a)) {
                        this.f47427b.o(iVar);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(o0<Boolean> o0Var, v1<? extends Set<p4.i>> v1Var, q4.d dVar) {
                super(1);
                this.f47423a = o0Var;
                this.f47424b = v1Var;
                this.f47425c = dVar;
            }

            @Override // h00.l
            public final y mo12invoke(z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                if (j.e(this.f47423a)) {
                    Set<p4.i> d11 = j.d(this.f47424b);
                    q4.d dVar = this.f47425c;
                    for (p4.i iVar : d11) {
                        dVar.o(iVar);
                    }
                    j.f(this.f47423a, false);
                }
                return new a(this.f47424b, this.f47425c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l1.c cVar, o0<Boolean> o0Var, v1<? extends Set<p4.i>> v1Var, q4.d dVar, v1<? extends List<p4.i>> v1Var2) {
            super(3);
            this.f47417a = cVar;
            this.f47418b = o0Var;
            this.f47419c = v1Var;
            this.f47420d = dVar;
            this.f47421e = v1Var2;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(String str, c1.i iVar, Integer num) {
            invoke(str, iVar, num.intValue());
            return b0.f54756a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(String it2, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(it2, "it");
            if ((i11 & 14) == 0) {
                i11 |= iVar.O(it2) ? 4 : 2;
            }
            if (((i11 & 91) ^ 18) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            p4.i iVar2 = null;
            Object obj = null;
            for (Object obj2 : j.d(this.f47419c)) {
                if (kotlin.jvm.internal.s.c(it2, ((p4.i) obj2).g())) {
                    obj = obj2;
                }
            }
            p4.i iVar3 = (p4.i) obj;
            if (iVar3 == null) {
                List c11 = j.c(this.f47421e);
                ListIterator listIterator = c11.listIterator(c11.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    if (kotlin.jvm.internal.s.c(it2, ((p4.i) previous).g())) {
                        iVar2 = previous;
                        break;
                    }
                }
                iVar3 = iVar2;
            }
            iVar.x(1915606363);
            if (iVar3 != null) {
                q4.g.a(iVar3, this.f47417a, j1.c.b(iVar, -819891757, true, new a(iVar3)), iVar, 456);
            }
            iVar.N();
            o0<Boolean> o0Var = this.f47418b;
            v1<Set<p4.i>> v1Var = this.f47419c;
            q4.d dVar = this.f47420d;
            iVar.x(-3686095);
            boolean O = iVar.O(o0Var) | iVar.O(v1Var) | iVar.O(dVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new b(o0Var, v1Var, dVar);
                iVar.p(y11);
            }
            iVar.N();
            c1.b0.a(iVar3, (l) y11, iVar, 8);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ p4.u f47428a;

        /* renamed from: b */
        final /* synthetic */ r f47429b;

        /* renamed from: c */
        final /* synthetic */ o1.f f47430c;

        /* renamed from: d */
        final /* synthetic */ int f47431d;

        /* renamed from: e */
        final /* synthetic */ int f47432e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p4.u uVar, r rVar, o1.f fVar, int i11, int i12) {
            super(2);
            this.f47428a = uVar;
            this.f47429b = rVar;
            this.f47430c = fVar;
            this.f47431d = i11;
            this.f47432e = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j.b(this.f47428a, this.f47429b, this.f47430c, iVar, this.f47431d | 1, this.f47432e);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ p4.u f47433a;

        /* renamed from: b */
        final /* synthetic */ r f47434b;

        /* renamed from: c */
        final /* synthetic */ o1.f f47435c;

        /* renamed from: d */
        final /* synthetic */ int f47436d;

        /* renamed from: e */
        final /* synthetic */ int f47437e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p4.u uVar, r rVar, o1.f fVar, int i11, int i12) {
            super(2);
            this.f47433a = uVar;
            this.f47434b = rVar;
            this.f47435c = fVar;
            this.f47436d = i11;
            this.f47437e = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j.b(this.f47433a, this.f47434b, this.f47435c, iVar, this.f47436d | 1, this.f47437e);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ p4.u f47438a;

        /* renamed from: b */
        final /* synthetic */ r f47439b;

        /* renamed from: c */
        final /* synthetic */ o1.f f47440c;

        /* renamed from: d */
        final /* synthetic */ int f47441d;

        /* renamed from: e */
        final /* synthetic */ int f47442e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p4.u uVar, r rVar, o1.f fVar, int i11, int i12) {
            super(2);
            this.f47438a = uVar;
            this.f47439b = rVar;
            this.f47440c = fVar;
            this.f47441d = i11;
            this.f47442e = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j.b(this.f47438a, this.f47439b, this.f47440c, iVar, this.f47441d | 1, this.f47442e);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends u implements l<z, y> {

        /* renamed from: a */
        final /* synthetic */ p4.i f47443a;

        /* renamed from: b */
        final /* synthetic */ List<p4.i> f47444b;

        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a */
            final /* synthetic */ p4.i f47445a;

            /* renamed from: b */
            final /* synthetic */ androidx.lifecycle.s f47446b;

            public a(p4.i iVar, androidx.lifecycle.s sVar) {
                this.f47445a = iVar;
                this.f47446b = sVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f47445a.getLifecycle().c(this.f47446b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p4.i iVar, List<p4.i> list) {
            super(1);
            this.f47443a = iVar;
            this.f47444b = list;
        }

        public static /* synthetic */ void a(List list, p4.i iVar, v vVar, p.b bVar) {
            b(list, iVar, vVar, bVar);
        }

        public static final void b(List this_PopulateVisibleList, p4.i entry, v noName_0, p.b event) {
            kotlin.jvm.internal.s.g(this_PopulateVisibleList, "$this_PopulateVisibleList");
            kotlin.jvm.internal.s.g(entry, "$entry");
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(event, "event");
            if (event == p.b.ON_START && !this_PopulateVisibleList.contains(entry)) {
                this_PopulateVisibleList.add(entry);
            }
            if (event == p.b.ON_STOP) {
                this_PopulateVisibleList.remove(entry);
            }
        }

        @Override // h00.l
        public final y mo12invoke(z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            final List<p4.i> list = this.f47444b;
            final p4.i iVar = this.f47443a;
            androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: q4.k
                @Override // androidx.lifecycle.s
                public final void g(v vVar, p.b bVar) {
                    j.g.a(list, iVar, vVar, bVar);
                }
            };
            this.f47443a.getLifecycle().a(sVar);
            return new a(this.f47443a, sVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a */
        final /* synthetic */ List<p4.i> f47447a;

        /* renamed from: b */
        final /* synthetic */ Collection<p4.i> f47448b;

        /* renamed from: c */
        final /* synthetic */ int f47449c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List<p4.i> list, Collection<p4.i> collection, int i11) {
            super(2);
            this.f47447a = list;
            this.f47448b = collection;
            this.f47449c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j.g(this.f47447a, this.f47448b, iVar, this.f47449c | 1);
        }
    }

    public static final void a(p4.u navController, String startDestination, o1.f fVar, String str, l<? super s, b0> builder, c1.i iVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(navController, "navController");
        kotlin.jvm.internal.s.g(startDestination, "startDestination");
        kotlin.jvm.internal.s.g(builder, "builder");
        c1.i h11 = iVar.h(1822170819);
        o1.f fVar2 = (i12 & 4) != 0 ? o1.f.f42062f1 : fVar;
        String str2 = (i12 & 8) != 0 ? null : str;
        h11.x(-3686095);
        boolean O = h11.O(str2) | h11.O(startDestination) | h11.O(builder);
        Object y11 = h11.y();
        if (O || y11 == c1.i.f8486a.a()) {
            s sVar = new s(navController.D(), startDestination, str2);
            builder.mo12invoke(sVar);
            y11 = sVar.f();
            h11.p(y11);
        }
        h11.N();
        b(navController, (r) y11, fVar2, h11, (i11 & 896) | 72, 0);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(navController, startDestination, fVar2, str2, builder, i11, i12));
    }

    public static final void b(p4.u navController, r graph, o1.f fVar, c1.i iVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(navController, "navController");
        kotlin.jvm.internal.s.g(graph, "graph");
        c1.i h11 = iVar.h(1822171735);
        f.a aVar = (i12 & 4) != 0 ? o1.f.f42062f1 : fVar;
        v vVar = (v) h11.A(androidx.compose.ui.platform.z.i());
        u0 a11 = m4.a.f38401a.a(h11, 8);
        if (a11 != null) {
            androidx.activity.f a12 = d.f.f23241a.a(h11, 8);
            OnBackPressedDispatcher onBackPressedDispatcher = a12 == null ? null : a12.getOnBackPressedDispatcher();
            navController.f0(vVar);
            t0 viewModelStore = a11.getViewModelStore();
            kotlin.jvm.internal.s.f(viewModelStore, "viewModelStoreOwner.viewModelStore");
            navController.h0(viewModelStore);
            if (onBackPressedDispatcher != null) {
                navController.g0(onBackPressedDispatcher);
            }
            c1.b0.a(navController, new b(navController), h11, 8);
            navController.d0(graph);
            l1.c a13 = l1.e.a(h11, 0);
            p4.b0 e11 = navController.D().e("composable");
            q4.d dVar = e11 instanceof q4.d ? (q4.d) e11 : null;
            if (dVar == null) {
                e1 l11 = h11.l();
                if (l11 == null) {
                    return;
                }
                l11.a(new e(navController, graph, aVar, i11, i12));
                return;
            }
            v1 b11 = n1.b(dVar.m(), null, h11, 8, 1);
            v1 b12 = n1.b(dVar.n(), null, h11, 8, 1);
            m1.r<p4.i> l12 = l(d(b12), h11, 8);
            m1.r<p4.i> l13 = l(c(b11), h11, 8);
            g(l12, d(b12), h11, 64);
            g(l13, c(b11), h11, 64);
            p4.i iVar2 = (p4.i) wz.u.p0(l12);
            if (iVar2 == null) {
                iVar2 = (p4.i) wz.u.p0(l13);
            }
            h11.x(-3687241);
            Object y11 = h11.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = s1.d(Boolean.TRUE, null, 2, null);
                h11.p(y11);
            }
            h11.N();
            o0 o0Var = (o0) y11;
            h11.x(1822173827);
            if (iVar2 != null) {
                k0.h.a(iVar2.g(), aVar, null, j1.c.b(h11, -819892005, true, new c(a13, o0Var, b12, dVar, b11)), h11, ((i11 >> 3) & 112) | 3072, 4);
            }
            h11.N();
            p4.b0 e12 = navController.D().e("dialog");
            q4.f fVar2 = e12 instanceof q4.f ? (q4.f) e12 : null;
            if (fVar2 == null) {
                e1 l14 = h11.l();
                if (l14 == null) {
                    return;
                }
                l14.a(new f(navController, graph, aVar, i11, i12));
                return;
            }
            q4.e.a(fVar2, h11, 0);
            e1 l15 = h11.l();
            if (l15 == null) {
                return;
            }
            l15.a(new d(navController, graph, aVar, i11, i12));
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }

    public static final List<p4.i> c(v1<? extends List<p4.i>> v1Var) {
        return v1Var.getValue();
    }

    public static final Set<p4.i> d(v1<? extends Set<p4.i>> v1Var) {
        return v1Var.getValue();
    }

    public static final boolean e(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    public static final void f(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    public static final void g(List<p4.i> list, Collection<p4.i> transitionsInProgress, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(list, "<this>");
        kotlin.jvm.internal.s.g(transitionsInProgress, "transitionsInProgress");
        c1.i h11 = iVar.h(2019779279);
        for (p4.i iVar2 : transitionsInProgress) {
            c1.b0.a(iVar2.getLifecycle(), new g(iVar2, list), h11, 8);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new h(list, transitionsInProgress, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0021, code lost:
        if (r0 == c1.i.f8486a.a()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final m1.r<p4.i> l(java.util.Collection<p4.i> r4, c1.i r5, int r6) {
        /*
            java.lang.String r6 = "transitionsInProgress"
            kotlin.jvm.internal.s.g(r4, r6)
            r6 = -151235577(0xfffffffff6fc5407, float:-2.5589123E33)
            r5.x(r6)
            r6 = -3686930(0xffffffffffc7bdee, float:NaN)
            r5.x(r6)
            boolean r6 = r5.O(r4)
            java.lang.Object r0 = r5.y()
            if (r6 != 0) goto L23
            c1.i$a r6 = c1.i.f8486a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L57
        L23:
            m1.r r0 = c1.n1.d()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r4.next()
            r2 = r1
            p4.i r2 = (p4.i) r2
            androidx.lifecycle.p r2 = r2.getLifecycle()
            androidx.lifecycle.p$c r2 = r2.b()
            androidx.lifecycle.p$c r3 = androidx.lifecycle.p.c.STARTED
            boolean r2 = r2.isAtLeast(r3)
            if (r2 == 0) goto L30
            r6.add(r1)
            goto L30
        L51:
            r0.addAll(r6)
            r5.p(r0)
        L57:
            r5.N()
            m1.r r0 = (m1.r) r0
            r5.N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.l(java.util.Collection, c1.i, int):m1.r");
    }
}