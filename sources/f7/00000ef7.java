package c1;

import androidx.compose.runtime.ProvidedValue;
import e1.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: V
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class j implements c1.i {
    private m1.h A;
    private final u1<z0> B;
    private boolean C;
    private h1 D;
    private final i1 E;
    private k1 F;
    private boolean G;
    private c1.d H;
    private final List<h00.q<c1.e<?>, k1, c1, vz.b0>> I;
    private boolean J;
    private int K;
    private int L;
    private u1<Object> M;
    private int N;
    private boolean O;
    private final e0 P;
    private final u1<h00.q<c1.e<?>, k1, c1, vz.b0>> Q;
    private int R;
    private int S;
    private int T;
    private int U;

    /* renamed from: b  reason: collision with root package name */
    private final c1.e<?> f8501b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.m f8502c;

    /* renamed from: d  reason: collision with root package name */
    private final i1 f8503d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<d1> f8504e;

    /* renamed from: f  reason: collision with root package name */
    private final List<h00.q<c1.e<?>, k1, c1, vz.b0>> f8505f;

    /* renamed from: g  reason: collision with root package name */
    private final c1.t f8506g;

    /* renamed from: h  reason: collision with root package name */
    private final u1<t0> f8507h;

    /* renamed from: i  reason: collision with root package name */
    private t0 f8508i;

    /* renamed from: j  reason: collision with root package name */
    private int f8509j;

    /* renamed from: k  reason: collision with root package name */
    private e0 f8510k;

    /* renamed from: l  reason: collision with root package name */
    private int f8511l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f8512m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f8513n;

    /* renamed from: o  reason: collision with root package name */
    private HashMap<Integer, Integer> f8514o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8515p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f8516q;

    /* renamed from: r  reason: collision with root package name */
    private final List<f0> f8517r;

    /* renamed from: s  reason: collision with root package name */
    private final e0 f8518s;

    /* renamed from: t  reason: collision with root package name */
    private e1.f<c1.q<Object>, ? extends v1<? extends Object>> f8519t;

    /* renamed from: u  reason: collision with root package name */
    private final HashMap<Integer, e1.f<c1.q<Object>, v1<Object>>> f8520u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f8521v;

    /* renamed from: w  reason: collision with root package name */
    private final e0 f8522w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f8523x;

    /* renamed from: y  reason: collision with root package name */
    private int f8524y;

    /* renamed from: z  reason: collision with root package name */
    private int f8525z;

    /* loaded from: classes.dex */
    private static final class a implements d1 {

        /* renamed from: a  reason: collision with root package name */
        private final b f8526a;

        public a(b ref) {
            kotlin.jvm.internal.s.g(ref, "ref");
            this.f8526a = ref;
        }

        public final b a() {
            return this.f8526a;
        }

        @Override // c1.d1
        public void b() {
        }

        @Override // c1.d1
        public void d() {
            this.f8526a.m();
        }

        @Override // c1.d1
        public void e() {
            this.f8526a.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends c1.m {

        /* renamed from: a  reason: collision with root package name */
        private final int f8527a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8528b;

        /* renamed from: c  reason: collision with root package name */
        private Set<Set<n1.a>> f8529c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<j> f8530d;

        /* renamed from: e  reason: collision with root package name */
        private final o0 f8531e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f8532f;

        public b(j this$0, int i11, boolean z11) {
            o0 d11;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f8532f = this$0;
            this.f8527a = i11;
            this.f8528b = z11;
            this.f8530d = new LinkedHashSet();
            d11 = s1.d(e1.a.a(), null, 2, null);
            this.f8531e = d11;
        }

        private final e1.f<c1.q<Object>, v1<Object>> o() {
            return (e1.f) this.f8531e.getValue();
        }

        private final void p(e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar) {
            this.f8531e.setValue(fVar);
        }

        @Override // c1.m
        public void a(c1.t composition, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
            kotlin.jvm.internal.s.g(composition, "composition");
            kotlin.jvm.internal.s.g(content, "content");
            this.f8532f.f8502c.a(composition, content);
        }

        @Override // c1.m
        public void b() {
            j jVar = this.f8532f;
            jVar.f8525z--;
        }

        @Override // c1.m
        public boolean c() {
            return this.f8528b;
        }

        @Override // c1.m
        public e1.f<c1.q<Object>, v1<Object>> d() {
            return o();
        }

        @Override // c1.m
        public int e() {
            return this.f8527a;
        }

        @Override // c1.m
        public zz.g f() {
            return this.f8532f.f8502c.f();
        }

        @Override // c1.m
        public void g(c1.t composition) {
            kotlin.jvm.internal.s.g(composition, "composition");
            this.f8532f.f8502c.g(this.f8532f.n0());
            this.f8532f.f8502c.g(composition);
        }

        @Override // c1.m
        public void h(Set<n1.a> table) {
            kotlin.jvm.internal.s.g(table, "table");
            Set<Set<n1.a>> set = this.f8529c;
            if (set == null) {
                set = new HashSet<>();
                q(set);
            }
            set.add(table);
        }

        @Override // c1.m
        public void i(c1.i composer) {
            kotlin.jvm.internal.s.g(composer, "composer");
            super.i((j) composer);
            this.f8530d.add(composer);
        }

        @Override // c1.m
        public void j() {
            this.f8532f.f8525z++;
        }

        @Override // c1.m
        public void k(c1.i composer) {
            kotlin.jvm.internal.s.g(composer, "composer");
            Set<Set<n1.a>> set = this.f8529c;
            if (set != null) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    ((Set) it2.next()).remove(((j) composer).f8503d);
                }
            }
            this.f8530d.remove(composer);
        }

        @Override // c1.m
        public void l(c1.t composition) {
            kotlin.jvm.internal.s.g(composition, "composition");
            this.f8532f.f8502c.l(composition);
        }

        public final void m() {
            if (!this.f8530d.isEmpty()) {
                Set<Set<n1.a>> set = this.f8529c;
                if (set != null) {
                    for (j jVar : n()) {
                        for (Set<n1.a> set2 : set) {
                            set2.remove(jVar.f8503d);
                        }
                    }
                }
                this.f8530d.clear();
            }
        }

        public final Set<j> n() {
            return this.f8530d;
        }

        public final void q(Set<Set<n1.a>> set) {
            this.f8529c = set;
        }

        public final void r(e1.f<c1.q<Object>, ? extends v1<? extends Object>> scope) {
            kotlin.jvm.internal.s.g(scope, "scope");
            p(scope);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<T, V, vz.b0> f8533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ V f8534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super T, ? super V, vz.b0> pVar, V v11) {
            super(3);
            this.f8533a = pVar;
            this.f8534b = v11;
        }

        public final void a(c1.e<?> applier, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            this.f8533a.mo160invoke(applier.a(), this.f8534b);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<T> f8535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.d f8536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.a<? extends T> aVar, c1.d dVar, int i11) {
            super(3);
            this.f8535a = aVar;
            this.f8536b = dVar;
            this.f8537c = i11;
        }

        public final void a(c1.e<?> applier, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            Object mo11invoke = this.f8535a.mo11invoke();
            slots.n0(this.f8536b, mo11invoke);
            applier.d(this.f8537c, mo11invoke);
            applier.g(mo11invoke);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.d f8538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c1.d dVar, int i11) {
            super(3);
            this.f8538a = dVar;
            this.f8539b = i11;
        }

        public final void a(c1.e<?> applier, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            Object M = slots.M(this.f8538a);
            applier.i();
            applier.f(this.f8539b, M);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<v1<?>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f8540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(j jVar) {
            super(1);
            this.f8540a = jVar;
        }

        public final void a(v1<?> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f8540a.f8525z++;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1<?> v1Var) {
            a(v1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<v1<?>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f8541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j jVar) {
            super(1);
            this.f8541a = jVar;
        }

        public final void a(v1<?> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            j jVar = this.f8541a;
            jVar.f8525z--;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1<?> v1Var) {
            a(v1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f8542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f8543b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, j jVar) {
            super(0);
            this.f8542a = pVar;
            this.f8543b = jVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f8542a != null) {
                this.f8543b.e1(200, c1.k.y());
                c1.k.G(this.f8543b, this.f8542a);
                this.f8543b.g0();
                return;
            }
            this.f8543b.Z0();
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> implements Comparator {
        public i() {
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((f0) t11).b()), Integer.valueOf(((f0) t12).b()));
            return a11;
        }
    }

    /* renamed from: c1.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0164j extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<c1.l, vz.b0> f8544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f8545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0164j(h00.l<? super c1.l, vz.b0> lVar, j jVar) {
            super(3);
            this.f8544a = lVar;
            this.f8545b = jVar;
        }

        public final void a(c1.e<?> noName_0, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            this.f8544a.mo12invoke(this.f8545b.n0());
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f8546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Object[] objArr) {
            super(3);
            this.f8546a = objArr;
        }

        public final void a(c1.e<?> applier, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            int length = this.f8546a.length;
            for (int i11 = 0; i11 < length; i11++) {
                applier.g(this.f8546a[i11]);
            }
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i11, int i12) {
            super(3);
            this.f8547a = i11;
            this.f8548b = i12;
        }

        public final void a(c1.e<?> applier, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            applier.c(this.f8547a, this.f8548b);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i11, int i12, int i13) {
            super(3);
            this.f8549a = i11;
            this.f8550b = i12;
            this.f8551c = i13;
        }

        public final void a(c1.e<?> applier, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            applier.b(this.f8549a, this.f8550b, this.f8551c);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i11) {
            super(3);
            this.f8552a = i11;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.c(this.f8552a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8553a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i11) {
            super(3);
            this.f8553a = i11;
        }

        public final void a(c1.e<?> applier, k1 noName_1, c1 noName_2) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            int i11 = this.f8553a;
            int i12 = 0;
            while (i12 < i11) {
                i12++;
                applier.i();
            }
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f8554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.d f8555b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(i1 i1Var, c1.d dVar) {
            super(3);
            this.f8554a = i1Var;
            this.f8555b = dVar;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.g();
            i1 i1Var = this.f8554a;
            slots.H(i1Var, this.f8555b.d(i1Var));
            slots.o();
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f8556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.d f8557b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<h00.q<c1.e<?>, k1, c1, vz.b0>> f8558c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(i1 i1Var, c1.d dVar, List<h00.q<c1.e<?>, k1, c1, vz.b0>> list) {
            super(3);
            this.f8556a = i1Var;
            this.f8557b = dVar;
            this.f8558c = list;
        }

        public final void a(c1.e<?> applier, k1 slots, c1 rememberManager) {
            kotlin.jvm.internal.s.g(applier, "applier");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
            i1 i1Var = this.f8556a;
            List<h00.q<c1.e<?>, k1, c1, vz.b0>> list = this.f8558c;
            k1 p11 = i1Var.p();
            try {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invoke(applier, p11, rememberManager);
                }
                vz.b0 b0Var = vz.b0.f54756a;
                p11.h();
                slots.g();
                i1 i1Var2 = this.f8556a;
                slots.H(i1Var2, this.f8557b.d(i1Var2));
                slots.o();
            } catch (Throwable th2) {
                p11.h();
                throw th2;
            }
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class r extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f8559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(h00.a<vz.b0> aVar) {
            super(3);
            this.f8559a = aVar;
        }

        public final void a(c1.e<?> noName_0, k1 noName_1, c1 rememberManager) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
            rememberManager.b(this.f8559a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class s extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.d f8560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(c1.d dVar) {
            super(3);
            this.f8560a = dVar;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.q(this.f8560a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class t extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i11) {
            super(3);
            this.f8561a = i11;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.I(this.f8561a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class u extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, e1.f<c1.q<Object>, ? extends v1<? extends Object>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProvidedValue<?>[] f8562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1.f<c1.q<Object>, v1<Object>> f8563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ProvidedValue<?>[] providedValueArr, e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar) {
            super(2);
            this.f8562a = providedValueArr;
            this.f8563b = fVar;
        }

        public final e1.f<c1.q<Object>, v1<Object>> a(c1.i iVar, int i11) {
            e1.f<c1.q<Object>, v1<Object>> s11;
            iVar.x(2083456980);
            s11 = c1.k.s(this.f8562a, this.f8563b, iVar, 8);
            iVar.N();
            return s11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ e1.f<c1.q<Object>, ? extends v1<? extends Object>> mo160invoke(c1.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class v extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f8564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Object obj) {
            super(3);
            this.f8564a = obj;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.l0(this.f8564a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class w extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f8565a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Object obj) {
            super(3);
            this.f8565a = obj;
        }

        public final void a(c1.e<?> noName_0, k1 noName_1, c1 rememberManager) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
            rememberManager.a((d1) this.f8565a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class x extends kotlin.jvm.internal.u implements h00.q<c1.e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f8566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Object obj, int i11) {
            super(3);
            this.f8566a = obj;
            this.f8567b = i11;
        }

        public final void a(c1.e<?> noName_0, k1 slots, c1 rememberManager) {
            z0 z0Var;
            c1.o j11;
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
            Object obj = this.f8566a;
            if (obj instanceof d1) {
                rememberManager.a((d1) obj);
            }
            Object Y = slots.Y(this.f8567b, this.f8566a);
            if (Y instanceof d1) {
                rememberManager.c((d1) Y);
            } else if (!(Y instanceof z0) || (j11 = (z0Var = (z0) Y).j()) == null) {
            } else {
                z0Var.x(null);
                j11.w(true);
            }
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    public j(c1.e<?> applier, c1.m parentContext, i1 slotTable, Set<d1> abandonSet, List<h00.q<c1.e<?>, k1, c1, vz.b0>> changes, c1.t composition) {
        kotlin.jvm.internal.s.g(applier, "applier");
        kotlin.jvm.internal.s.g(parentContext, "parentContext");
        kotlin.jvm.internal.s.g(slotTable, "slotTable");
        kotlin.jvm.internal.s.g(abandonSet, "abandonSet");
        kotlin.jvm.internal.s.g(changes, "changes");
        kotlin.jvm.internal.s.g(composition, "composition");
        this.f8501b = applier;
        this.f8502c = parentContext;
        this.f8503d = slotTable;
        this.f8504e = abandonSet;
        this.f8505f = changes;
        this.f8506g = composition;
        this.f8507h = new u1<>();
        this.f8510k = new e0();
        this.f8512m = new e0();
        this.f8517r = new ArrayList();
        this.f8518s = new e0();
        this.f8519t = e1.a.a();
        this.f8520u = new HashMap<>();
        this.f8522w = new e0();
        this.f8524y = -1;
        this.A = m1.l.y();
        this.B = new u1<>();
        h1 o11 = slotTable.o();
        o11.d();
        this.D = o11;
        i1 i1Var = new i1();
        this.E = i1Var;
        k1 p11 = i1Var.p();
        p11.h();
        this.F = p11;
        h1 o12 = i1Var.o();
        try {
            c1.d a11 = o12.a(0);
            o12.d();
            this.H = a11;
            this.I = new ArrayList();
            this.M = new u1<>();
            this.P = new e0();
            this.Q = new u1<>();
            this.R = -1;
            this.S = -1;
            this.T = -1;
        } catch (Throwable th2) {
            o12.d();
            throw th2;
        }
    }

    private final void A0(boolean z11) {
        int p11 = z11 ? this.D.p() : this.D.h();
        int i11 = p11 - this.N;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Tried to seek backward".toString());
        }
        if (i11 > 0) {
            F0(new n(i11));
            this.N = p11;
        }
    }

    static /* synthetic */ void B0(j jVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        jVar.A0(z11);
    }

    private final void C0() {
        int i11 = this.L;
        if (i11 > 0) {
            this.L = 0;
            F0(new o(i11));
        }
    }

    private final void E0() {
        f0 w11;
        boolean z11 = this.C;
        this.C = true;
        int p11 = this.D.p();
        int x11 = this.D.x(p11) + p11;
        int i11 = this.f8509j;
        int K = K();
        int i12 = this.f8511l;
        w11 = c1.k.w(this.f8517r, this.D.h(), x11);
        boolean z12 = false;
        int i13 = p11;
        while (w11 != null) {
            int b11 = w11.b();
            c1.k.O(this.f8517r, b11);
            if (w11.d()) {
                this.D.I(b11);
                int h11 = this.D.h();
                W0(i13, h11, p11);
                this.f8509j = v0(b11, h11, p11, i11);
                this.K = a0(this.D.H(h11), p11, K);
                w11.c().g(this);
                this.D.J(p11);
                i13 = h11;
                z12 = true;
            } else {
                this.B.h(w11.c());
                w11.c().u();
                this.B.g();
            }
            w11 = c1.k.w(this.f8517r, this.D.h(), x11);
        }
        if (z12) {
            W0(i13, p11, p11);
            this.D.L();
            int q12 = q1(p11);
            this.f8509j = i11 + q12;
            this.f8511l = i12 + q12;
        } else {
            b1();
        }
        this.K = K;
        this.C = z11;
    }

    private final void F0(h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        this.f8505f.add(qVar);
    }

    private final void G0(h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        C0();
        x0();
        F0(qVar);
    }

    private final void H0() {
        h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar;
        qVar = c1.k.f8574a;
        S0(qVar);
        this.N += this.D.m();
    }

    private final void I0(Object obj) {
        this.M.h(obj);
    }

    private final void J0() {
        h00.q qVar;
        int p11 = this.D.p();
        if (this.P.e(-1) <= p11) {
            if (this.P.e(-1) == p11) {
                this.P.f();
                qVar = c1.k.f8575b;
                U0(this, false, qVar, 1, null);
                return;
            }
            return;
        }
        c1.k.r("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    private final void K0() {
        h00.q qVar;
        if (this.O) {
            qVar = c1.k.f8575b;
            U0(this, false, qVar, 1, null);
            this.O = false;
        }
    }

    private final void L0(h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        this.I.add(qVar);
    }

    private final void M0(c1.d dVar) {
        List Q0;
        if (this.I.isEmpty()) {
            S0(new p(this.E, dVar));
            return;
        }
        Q0 = wz.e0.Q0(this.I);
        this.I.clear();
        C0();
        x0();
        S0(new q(this.E, dVar, Q0));
    }

    private final void N0(h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        this.Q.h(qVar);
    }

    private final void O0(int i11, int i12, int i13) {
        if (i13 > 0) {
            int i14 = this.U;
            if (i14 > 0 && this.S == i11 - i14 && this.T == i12 - i14) {
                this.U = i14 + i13;
                return;
            }
            z0();
            this.S = i11;
            this.T = i12;
            this.U = i13;
        }
    }

    private final void P() {
        X();
        this.f8507h.a();
        this.f8510k.a();
        this.f8512m.a();
        this.f8518s.a();
        this.f8522w.a();
        this.D.d();
        this.K = 0;
        this.f8525z = 0;
        this.f8516q = false;
        this.C = false;
    }

    private final void P0(int i11) {
        this.N = i11 - (this.D.h() - this.N);
    }

    private final void Q0(int i11, int i12) {
        if (i12 > 0) {
            if (i11 >= 0) {
                if (this.R == i11) {
                    this.U += i12;
                    return;
                }
                z0();
                this.R = i11;
                this.U = i12;
                return;
            }
            c1.k.r(kotlin.jvm.internal.s.p("Invalid remove index ", Integer.valueOf(i11)).toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void R0() {
        h1 h1Var;
        int p11;
        h00.q qVar;
        if (this.f8503d.isEmpty() || this.P.e(-1) == (p11 = (h1Var = this.D).p())) {
            return;
        }
        if (!this.O) {
            qVar = c1.k.f8576c;
            U0(this, false, qVar, 1, null);
            this.O = true;
        }
        c1.d a11 = h1Var.a(p11);
        this.P.g(p11);
        U0(this, false, new s(a11), 1, null);
    }

    private final void S0(h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        B0(this, false, 1, null);
        R0();
        F0(qVar);
    }

    private final void T0(boolean z11, h00.q<? super c1.e<?>, ? super k1, ? super c1, vz.b0> qVar) {
        A0(z11);
        F0(qVar);
    }

    static /* synthetic */ void U0(j jVar, boolean z11, h00.q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        jVar.T0(z11, qVar);
    }

    private final void V0() {
        if (this.M.d()) {
            this.M.g();
        } else {
            this.L++;
        }
    }

    private final void W() {
        f0 O;
        if (!f()) {
            O = c1.k.O(this.f8517r, this.D.p());
            Object C = this.D.C();
            Objects.requireNonNull(C, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            z0 z0Var = (z0) C;
            z0Var.A(O != null);
            this.B.h(z0Var);
            z0Var.E(this.A.d());
            return;
        }
        z0 z0Var2 = new z0((c1.o) n0());
        this.B.h(z0Var2);
        p1(z0Var2);
        z0Var2.E(this.A.d());
    }

    private final void W0(int i11, int i12, int i13) {
        int J;
        h1 h1Var = this.D;
        J = c1.k.J(h1Var, i11, i12, i13);
        while (i11 > 0 && i11 != J) {
            if (h1Var.B(i11)) {
                V0();
            }
            i11 = h1Var.H(i11);
        }
        e0(i12, J);
    }

    private final void X() {
        this.f8508i = null;
        this.f8509j = 0;
        this.f8511l = 0;
        this.N = 0;
        this.K = 0;
        this.f8516q = false;
        this.O = false;
        this.P.a();
        this.B.a();
        Y();
    }

    private final void X0() {
        this.I.add(this.Q.g());
    }

    private final void Y() {
        this.f8513n = null;
        this.f8514o = null;
    }

    private final <T> T Y0(c1.q<T> qVar, e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar) {
        if (c1.k.t(fVar, qVar)) {
            return (T) c1.k.E(fVar, qVar);
        }
        return qVar.a().getValue();
    }

    private final int a0(int i11, int i12, int i13) {
        return i11 == i12 ? i13 : Integer.rotateLeft(a0(this.D.H(i11), i12, i13), 3) ^ q0(this.D, i11);
    }

    private final void a1() {
        this.f8511l += this.D.K();
    }

    private final e1.f<c1.q<Object>, v1<Object>> b0() {
        if (f() && this.G) {
            int v11 = this.F.v();
            while (v11 > 0) {
                if (this.F.A(v11) == 202 && kotlin.jvm.internal.s.c(this.F.B(v11), c1.k.x())) {
                    Object y11 = this.F.y(v11);
                    Objects.requireNonNull(y11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (e1.f) y11;
                }
                v11 = this.F.O(v11);
            }
        }
        if (this.f8503d.i() > 0) {
            int p11 = this.D.p();
            while (p11 > 0) {
                if (this.D.v(p11) == 202 && kotlin.jvm.internal.s.c(this.D.w(p11), c1.k.x())) {
                    e1.f<c1.q<Object>, v1<Object>> fVar = this.f8520u.get(Integer.valueOf(p11));
                    if (fVar == null) {
                        Object t11 = this.D.t(p11);
                        Objects.requireNonNull(t11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        return (e1.f) t11;
                    }
                    return fVar;
                }
                p11 = this.D.H(p11);
            }
        }
        return this.f8519t;
    }

    private final void b1() {
        this.f8511l = this.D.q();
        this.D.L();
    }

    private final void c1(int i11, Object obj, boolean z11, Object obj2) {
        s1();
        i1(i11, obj, obj2);
        t0 t0Var = null;
        if (f()) {
            this.D.c();
            int u11 = this.F.u();
            if (z11) {
                this.F.i0(c1.i.f8486a.a());
            } else if (obj2 != null) {
                k1 k1Var = this.F;
                if (obj == null) {
                    obj = c1.i.f8486a.a();
                }
                k1Var.e0(i11, obj, obj2);
            } else {
                k1 k1Var2 = this.F;
                if (obj == null) {
                    obj = c1.i.f8486a.a();
                }
                k1Var2.g0(i11, obj);
            }
            t0 t0Var2 = this.f8508i;
            if (t0Var2 != null) {
                i0 i0Var = new i0(i11, -1, r0(u11), -1, 0);
                t0Var2.i(i0Var, this.f8509j - t0Var2.e());
                t0Var2.h(i0Var);
            }
            j0(z11, null);
            return;
        }
        if (this.f8508i == null) {
            if (this.D.k() == i11 && kotlin.jvm.internal.s.c(obj, this.D.l())) {
                f1(z11, obj2);
            } else {
                this.f8508i = new t0(this.D.g(), this.f8509j);
            }
        }
        t0 t0Var3 = this.f8508i;
        if (t0Var3 != null) {
            i0 d11 = t0Var3.d(i11, obj);
            if (d11 != null) {
                t0Var3.h(d11);
                int b11 = d11.b();
                this.f8509j = t0Var3.g(d11) + t0Var3.e();
                int m11 = t0Var3.m(d11);
                int a11 = m11 - t0Var3.a();
                t0Var3.k(m11, t0Var3.a());
                P0(b11);
                this.D.I(b11);
                if (a11 > 0) {
                    S0(new t(a11));
                }
                f1(z11, obj2);
            } else {
                this.D.c();
                this.J = true;
                i0();
                this.F.g();
                int u12 = this.F.u();
                if (z11) {
                    this.F.i0(c1.i.f8486a.a());
                } else if (obj2 != null) {
                    k1 k1Var3 = this.F;
                    if (obj == null) {
                        obj = c1.i.f8486a.a();
                    }
                    k1Var3.e0(i11, obj, obj2);
                } else {
                    k1 k1Var4 = this.F;
                    if (obj == null) {
                        obj = c1.i.f8486a.a();
                    }
                    k1Var4.g0(i11, obj);
                }
                this.H = this.F.d(u12);
                i0 i0Var2 = new i0(i11, -1, r0(u12), -1, 0);
                t0Var3.i(i0Var2, this.f8509j - t0Var3.e());
                t0Var3.h(i0Var2);
                t0Var = new t0(new ArrayList(), z11 ? 0 : this.f8509j);
            }
        }
        j0(z11, t0Var);
    }

    private final void d0(d1.b<z0, d1.c<Object>> bVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
        if (!this.C) {
            Object a11 = z1.f8727a.a("Compose:recompose");
            try {
                this.A = m1.l.y();
                int f11 = bVar.f();
                int i11 = 0;
                while (i11 < f11) {
                    int i12 = i11 + 1;
                    Object obj = bVar.e()[i11];
                    if (obj != null) {
                        d1.c cVar = (d1.c) bVar.g()[i11];
                        z0 z0Var = (z0) obj;
                        c1.d i13 = z0Var.i();
                        Integer valueOf = i13 == null ? null : Integer.valueOf(i13.a());
                        if (valueOf == null) {
                            return;
                        }
                        this.f8517r.add(new f0(z0Var, valueOf.intValue(), cVar));
                        i11 = i12;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                List<f0> list = this.f8517r;
                if (list.size() > 1) {
                    wz.a0.y(list, new i());
                }
                this.f8509j = 0;
                this.C = true;
                g1();
                n1.i(new f(this), new g(this), new h(pVar, this));
                h0();
                this.C = false;
                this.f8517r.clear();
                this.f8520u.clear();
                vz.b0 b0Var = vz.b0.f54756a;
                return;
            } finally {
                z1.f8727a.b(a11);
            }
        }
        c1.k.r("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    private final void d1(int i11) {
        c1(i11, null, false, null);
    }

    private final void e0(int i11, int i12) {
        if (i11 <= 0 || i11 == i12) {
            return;
        }
        e0(this.D.H(i11), i12);
        if (this.D.B(i11)) {
            I0(u0(this.D, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(int i11, Object obj) {
        c1(i11, obj, false, null);
    }

    private final void f0(boolean z11) {
        List<i0> list;
        if (f()) {
            int v11 = this.F.v();
            k1(this.F.A(v11), this.F.B(v11), this.F.y(v11));
        } else {
            int p11 = this.D.p();
            k1(this.D.v(p11), this.D.w(p11), this.D.t(p11));
        }
        int i11 = this.f8511l;
        t0 t0Var = this.f8508i;
        int i12 = 0;
        if (t0Var != null && t0Var.b().size() > 0) {
            List<i0> b11 = t0Var.b();
            List<i0> f11 = t0Var.f();
            Set e11 = m1.b.e(f11);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f11.size();
            int size2 = b11.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < size2) {
                i0 i0Var = b11.get(i13);
                if (!e11.contains(i0Var)) {
                    Q0(t0Var.g(i0Var) + t0Var.e(), i0Var.c());
                    t0Var.n(i0Var.b(), i12);
                    P0(i0Var.b());
                    this.D.I(i0Var.b());
                    H0();
                    this.D.K();
                    c1.k.P(this.f8517r, i0Var.b(), i0Var.b() + this.D.x(i0Var.b()));
                } else if (!linkedHashSet.contains(i0Var)) {
                    if (i14 < size) {
                        i0 i0Var2 = f11.get(i14);
                        if (i0Var2 != i0Var) {
                            int g11 = t0Var.g(i0Var2);
                            linkedHashSet.add(i0Var2);
                            if (g11 != i15) {
                                int o11 = t0Var.o(i0Var2);
                                list = f11;
                                O0(t0Var.e() + g11, i15 + t0Var.e(), o11);
                                t0Var.j(g11, i15, o11);
                            } else {
                                list = f11;
                            }
                        } else {
                            list = f11;
                            i13++;
                        }
                        i14++;
                        i15 += t0Var.o(i0Var2);
                        f11 = list;
                    }
                    i12 = 0;
                }
                i13++;
                i12 = 0;
            }
            z0();
            if (b11.size() > 0) {
                P0(this.D.j());
                this.D.L();
            }
        }
        int i16 = this.f8509j;
        while (!this.D.z()) {
            int h11 = this.D.h();
            H0();
            Q0(i16, this.D.K());
            c1.k.P(this.f8517r, h11, this.D.h());
        }
        boolean f12 = f();
        if (f12) {
            if (z11) {
                X0();
                i11 = 1;
            }
            this.D.e();
            int v12 = this.F.v();
            this.F.n();
            if (!this.D.o()) {
                int r02 = r0(v12);
                this.F.o();
                this.F.h();
                M0(this.H);
                this.J = false;
                if (!this.f8503d.isEmpty()) {
                    m1(r02, 0);
                    n1(r02, i11);
                }
            }
        } else {
            if (z11) {
                V0();
            }
            J0();
            int p12 = this.D.p();
            if (i11 != q1(p12)) {
                n1(p12, i11);
            }
            if (z11) {
                i11 = 1;
            }
            this.D.f();
            z0();
        }
        k0(i11, f12);
    }

    private final void f1(boolean z11, Object obj) {
        if (z11) {
            this.D.N();
            return;
        }
        if (obj != null && this.D.i() != obj) {
            U0(this, false, new v(obj), 1, null);
        }
        this.D.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        f0(false);
    }

    private final void g1() {
        int q11;
        this.D = this.f8503d.o();
        d1(100);
        this.f8502c.j();
        this.f8519t = this.f8502c.d();
        e0 e0Var = this.f8522w;
        q11 = c1.k.q(this.f8521v);
        e0Var.g(q11);
        this.f8521v = O(this.f8519t);
        if (!this.f8515p) {
            this.f8515p = this.f8502c.c();
        }
        Set<n1.a> set = (Set) Y0(n1.c.a(), this.f8519t);
        if (set != null) {
            set.add(this.f8503d);
            this.f8502c.h(set);
        }
        d1(this.f8502c.e());
    }

    private final void h0() {
        g0();
        this.f8502c.b();
        g0();
        K0();
        l0();
        this.D.d();
    }

    private final void i0() {
        if (this.F.t()) {
            k1 p11 = this.E.p();
            this.F = p11;
            p11.c0();
            this.G = false;
        }
    }

    private final void i1(int i11, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i11 == 207 && !kotlin.jvm.internal.s.c(obj2, c1.i.f8486a.a())) {
                j1(obj2.hashCode());
            } else {
                j1(i11);
            }
        } else if (obj instanceof Enum) {
            j1(((Enum) obj).ordinal());
        } else {
            j1(obj.hashCode());
        }
    }

    private final void j0(boolean z11, t0 t0Var) {
        this.f8507h.h(this.f8508i);
        this.f8508i = t0Var;
        this.f8510k.g(this.f8509j);
        if (z11) {
            this.f8509j = 0;
        }
        this.f8512m.g(this.f8511l);
        this.f8511l = 0;
    }

    private final void j1(int i11) {
        this.K = i11 ^ Integer.rotateLeft(K(), 3);
    }

    private final void k0(int i11, boolean z11) {
        t0 g11 = this.f8507h.g();
        if (g11 != null && !z11) {
            g11.l(g11.a() + 1);
        }
        this.f8508i = g11;
        this.f8509j = this.f8510k.f() + i11;
        this.f8511l = this.f8512m.f() + i11;
    }

    private final void k1(int i11, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i11 == 207 && !kotlin.jvm.internal.s.c(obj2, c1.i.f8486a.a())) {
                l1(obj2.hashCode());
            } else {
                l1(i11);
            }
        } else if (obj instanceof Enum) {
            l1(((Enum) obj).ordinal());
        } else {
            l1(obj.hashCode());
        }
    }

    private final void l0() {
        C0();
        if (this.f8507h.c()) {
            if (this.P.c()) {
                X();
                return;
            } else {
                c1.k.r("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        c1.k.r("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    private final void l1(int i11) {
        this.K = Integer.rotateRight(Integer.hashCode(i11) ^ K(), 3);
    }

    private final void m1(int i11, int i12) {
        if (q1(i11) != i12) {
            if (i11 < 0) {
                HashMap<Integer, Integer> hashMap = this.f8514o;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f8514o = hashMap;
                }
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(i12));
                return;
            }
            int[] iArr = this.f8513n;
            if (iArr == null) {
                iArr = new int[this.D.r()];
                wz.o.u(iArr, -1, 0, 0, 6, null);
                this.f8513n = iArr;
            }
            iArr[i11] = i12;
        }
    }

    private final void n1(int i11, int i12) {
        int q12 = q1(i11);
        if (q12 != i12) {
            int i13 = i12 - q12;
            int b11 = this.f8507h.b() - 1;
            while (i11 != -1) {
                int q13 = q1(i11) + i13;
                m1(i11, q13);
                if (b11 >= 0) {
                    int i14 = b11;
                    while (true) {
                        int i15 = i14 - 1;
                        t0 f11 = this.f8507h.f(i14);
                        if (f11 != null && f11.n(i11, q13)) {
                            b11 = i14 - 1;
                            break;
                        } else if (i15 < 0) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                if (i11 < 0) {
                    i11 = this.D.p();
                } else if (this.D.B(i11)) {
                    return;
                } else {
                    i11 = this.D.H(i11);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final e1.f<c1.q<Object>, v1<Object>> o1(e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar, e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar2) {
        f.a<c1.q<Object>, ? extends v1<? extends Object>> g11 = fVar.g();
        g11.putAll(fVar2);
        e1.f build = g11.build();
        e1(204, c1.k.B());
        O(build);
        O(fVar2);
        g0();
        return build;
    }

    private final Object p0(h1 h1Var) {
        return h1Var.D(h1Var.p());
    }

    private final int q0(h1 h1Var, int i11) {
        Object t11;
        if (h1Var.y(i11)) {
            Object w11 = h1Var.w(i11);
            if (w11 == null) {
                return 0;
            }
            return w11 instanceof Enum ? ((Enum) w11).ordinal() : w11.hashCode();
        }
        int v11 = h1Var.v(i11);
        if (v11 == 207 && (t11 = h1Var.t(i11)) != null && !kotlin.jvm.internal.s.c(t11, c1.i.f8486a.a())) {
            v11 = t11.hashCode();
        }
        return v11;
    }

    private final int q1(int i11) {
        int i12;
        Integer num;
        if (i11 < 0) {
            HashMap<Integer, Integer> hashMap = this.f8514o;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i11))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f8513n;
        return (iArr == null || (i12 = iArr[i11]) < 0) ? this.D.F(i11) : i12;
    }

    private final int r0(int i11) {
        return (-2) - i11;
    }

    private final void r1() {
        if (this.f8516q) {
            this.f8516q = false;
        } else {
            c1.k.r("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void s1() {
        if (!this.f8516q) {
            return;
        }
        c1.k.r("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final Object u0(h1 h1Var, int i11) {
        return h1Var.D(i11);
    }

    private final int v0(int i11, int i12, int i13, int i14) {
        int H = this.D.H(i12);
        while (H != i13 && !this.D.B(H)) {
            H = this.D.H(H);
        }
        if (this.D.B(H)) {
            i14 = 0;
        }
        if (H == i12) {
            return i14;
        }
        int q12 = (q1(H) - this.D.F(i12)) + i14;
        loop1: while (i14 < q12 && H != i11) {
            H++;
            while (H < i11) {
                int x11 = this.D.x(H) + H;
                if (i11 < x11) {
                    break;
                }
                i14 += q1(H);
                H = x11;
            }
            break loop1;
        }
        return i14;
    }

    private final void x0() {
        if (this.M.d()) {
            y0(this.M.i());
            this.M.a();
        }
    }

    private final void y0(Object[] objArr) {
        F0(new k(objArr));
    }

    private final void z0() {
        int i11 = this.U;
        this.U = 0;
        if (i11 > 0) {
            int i12 = this.R;
            if (i12 >= 0) {
                this.R = -1;
                G0(new l(i12, i11));
                return;
            }
            int i13 = this.S;
            this.S = -1;
            int i14 = this.T;
            this.T = -1;
            G0(new m(i13, i14, i11));
        }
    }

    @Override // c1.i
    public <T> T A(c1.q<T> key) {
        kotlin.jvm.internal.s.g(key, "key");
        return (T) Y0(key, b0());
    }

    @Override // c1.i
    public void B() {
        c1(-127, null, false, null);
    }

    @Override // c1.i
    public void C(int i11, Object obj) {
        c1(i11, obj, false, null);
    }

    @Override // c1.i
    public void D() {
        c1(125, null, true, null);
        this.f8516q = true;
    }

    public final boolean D0(d1.b<z0, d1.c<Object>> invalidationsRequested) {
        kotlin.jvm.internal.s.g(invalidationsRequested, "invalidationsRequested");
        if (this.f8505f.isEmpty()) {
            if (invalidationsRequested.h() || (!this.f8517r.isEmpty())) {
                d0(invalidationsRequested, null);
                return !this.f8505f.isEmpty();
            }
            return false;
        }
        c1.k.r("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    @Override // c1.i
    public void E() {
        this.f8523x = false;
    }

    @Override // c1.i
    public void F(int i11, Object obj) {
        if (this.D.k() == i11 && !kotlin.jvm.internal.s.c(this.D.i(), obj) && this.f8524y < 0) {
            this.f8524y = this.D.h();
            this.f8523x = true;
        }
        c1(i11, null, false, obj);
    }

    @Override // c1.i
    public void G() {
        if (this.f8511l == 0) {
            z0 o02 = o0();
            if (o02 != null) {
                o02.v();
            }
            if (this.f8517r.isEmpty()) {
                b1();
                return;
            } else {
                E0();
                return;
            }
        }
        c1.k.r("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // c1.i
    public void H(ProvidedValue<?>[] values) {
        e1.f<c1.q<Object>, v1<Object>> o12;
        boolean z11;
        int q11;
        kotlin.jvm.internal.s.g(values, "values");
        e1.f<c1.q<Object>, v1<Object>> b02 = b0();
        e1(201, c1.k.A());
        e1(203, c1.k.C());
        e1.f<c1.q<Object>, ? extends v1<? extends Object>> fVar = (e1.f) c1.k.H(this, new u(values, b02));
        g0();
        if (f()) {
            o12 = o1(b02, fVar);
            this.G = true;
        } else {
            Object u11 = this.D.u(0);
            Objects.requireNonNull(u11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            e1.f<c1.q<Object>, v1<Object>> fVar2 = (e1.f) u11;
            Object u12 = this.D.u(1);
            Objects.requireNonNull(u12, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            e1.f fVar3 = (e1.f) u12;
            if (i() && kotlin.jvm.internal.s.c(fVar3, fVar)) {
                a1();
                o12 = fVar2;
            } else {
                o12 = o1(b02, fVar);
                z11 = !kotlin.jvm.internal.s.c(o12, fVar2);
                if (z11 && !f()) {
                    this.f8520u.put(Integer.valueOf(this.D.h()), o12);
                }
                e0 e0Var = this.f8522w;
                q11 = c1.k.q(this.f8521v);
                e0Var.g(q11);
                this.f8521v = z11;
                c1(202, c1.k.x(), false, o12);
            }
        }
        z11 = false;
        if (z11) {
            this.f8520u.put(Integer.valueOf(this.D.h()), o12);
        }
        e0 e0Var2 = this.f8522w;
        q11 = c1.k.q(this.f8521v);
        e0Var2.g(q11);
        this.f8521v = z11;
        c1(202, c1.k.x(), false, o12);
    }

    @Override // c1.i
    public void I() {
        boolean p11;
        g0();
        g0();
        p11 = c1.k.p(this.f8522w.f());
        this.f8521v = p11;
    }

    @Override // c1.i
    public boolean J() {
        if (!this.f8521v) {
            z0 o02 = o0();
            if (!(o02 != null && o02.l())) {
                return false;
            }
        }
        return true;
    }

    @Override // c1.i
    public int K() {
        return this.K;
    }

    @Override // c1.i
    public c1.m L() {
        e1(206, c1.k.D());
        Object t02 = t0();
        a aVar = t02 instanceof a ? (a) t02 : null;
        if (aVar == null) {
            aVar = new a(new b(this, K(), this.f8515p));
            p1(aVar);
        }
        aVar.a().r(b0());
        g0();
        return aVar.a();
    }

    @Override // c1.i
    public void M() {
        g0();
    }

    @Override // c1.i
    public void N() {
        g0();
    }

    @Override // c1.i
    public boolean O(Object obj) {
        if (kotlin.jvm.internal.s.c(t0(), obj)) {
            return false;
        }
        p1(obj);
        return true;
    }

    public final void Z(d1.b<z0, d1.c<Object>> invalidationsRequested, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(invalidationsRequested, "invalidationsRequested");
        kotlin.jvm.internal.s.g(content, "content");
        if (this.f8505f.isEmpty()) {
            d0(invalidationsRequested, content);
        } else {
            c1.k.r("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public void Z0() {
        if (this.f8517r.isEmpty()) {
            a1();
            return;
        }
        h1 h1Var = this.D;
        int k11 = h1Var.k();
        Object l11 = h1Var.l();
        Object i11 = h1Var.i();
        i1(k11, l11, i11);
        f1(h1Var.A(), null);
        E0();
        h1Var.f();
        k1(k11, l11, i11);
    }

    @Override // c1.i
    public boolean a(boolean z11) {
        Object t02 = t0();
        if ((t02 instanceof Boolean) && z11 == ((Boolean) t02).booleanValue()) {
            return false;
        }
        p1(Boolean.valueOf(z11));
        return true;
    }

    @Override // c1.i
    public boolean b(float f11) {
        Object t02 = t0();
        if (t02 instanceof Float) {
            if (f11 == ((Number) t02).floatValue()) {
                return false;
            }
        }
        p1(Float.valueOf(f11));
        return true;
    }

    @Override // c1.i
    public void c() {
        this.f8523x = this.f8524y >= 0;
    }

    public final void c0() {
        z1 z1Var = z1.f8727a;
        Object a11 = z1Var.a("Compose:Composer.dispose");
        try {
            this.f8502c.k(this);
            this.B.a();
            this.f8517r.clear();
            this.f8505f.clear();
            k().clear();
            vz.b0 b0Var = vz.b0.f54756a;
            z1Var.b(a11);
        } catch (Throwable th2) {
            z1.f8727a.b(a11);
            throw th2;
        }
    }

    @Override // c1.i
    public boolean d(int i11) {
        Object t02 = t0();
        if ((t02 instanceof Integer) && i11 == ((Number) t02).intValue()) {
            return false;
        }
        p1(Integer.valueOf(i11));
        return true;
    }

    @Override // c1.i
    public boolean e(long j11) {
        Object t02 = t0();
        if ((t02 instanceof Long) && j11 == ((Number) t02).longValue()) {
            return false;
        }
        p1(Long.valueOf(j11));
        return true;
    }

    @Override // c1.i
    public boolean f() {
        return this.J;
    }

    @Override // c1.i
    public void g(y0 scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        z0 z0Var = scope instanceof z0 ? (z0) scope : null;
        if (z0Var == null) {
            return;
        }
        z0Var.D(true);
    }

    @Override // c1.i
    public c1.i h(int i11) {
        c1(i11, null, false, null);
        W();
        return this;
    }

    public final boolean h1(z0 scope, Object obj) {
        kotlin.jvm.internal.s.g(scope, "scope");
        c1.d i11 = scope.i();
        if (i11 == null) {
            return false;
        }
        int d11 = i11.d(this.f8503d);
        if (!this.C || d11 < this.D.h()) {
            return false;
        }
        c1.k.F(this.f8517r, d11, scope, obj);
        return true;
    }

    @Override // c1.i
    public boolean i() {
        if (!f() && !this.f8523x && !this.f8521v) {
            z0 o02 = o0();
            if ((o02 == null || o02.m()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Override // c1.i
    public void j(h00.a<vz.b0> effect) {
        kotlin.jvm.internal.s.g(effect, "effect");
        F0(new r(effect));
    }

    @Override // c1.i
    public c1.e<?> k() {
        return this.f8501b;
    }

    @Override // c1.i
    public e1 l() {
        c1.d a11;
        h00.l<c1.l, vz.b0> h11;
        z0 z0Var = null;
        z0 g11 = this.B.d() ? this.B.g() : null;
        if (g11 != null) {
            g11.A(false);
        }
        if (g11 != null && (h11 = g11.h(this.A.d())) != null) {
            F0(new C0164j(h11, this));
        }
        if (g11 != null && !g11.o() && (g11.p() || this.f8515p)) {
            if (g11.i() == null) {
                if (f()) {
                    k1 k1Var = this.F;
                    a11 = k1Var.d(k1Var.v());
                } else {
                    h1 h1Var = this.D;
                    a11 = h1Var.a(h1Var.p());
                }
                g11.w(a11);
            }
            g11.z(false);
            z0Var = g11;
        }
        f0(false);
        return z0Var;
    }

    @Override // c1.i
    public void m() {
        int i11 = 126;
        if (f() || (!this.f8523x ? this.D.k() != 126 : this.D.k() != 125)) {
            i11 = 125;
        }
        c1(i11, null, true, null);
        this.f8516q = true;
    }

    public final boolean m0() {
        return this.f8525z > 0;
    }

    @Override // c1.i
    public zz.g n() {
        return this.f8502c.f();
    }

    public c1.t n0() {
        return this.f8506g;
    }

    @Override // c1.i
    public void o() {
        r1();
        if (!f()) {
            I0(p0(this.D));
        } else {
            c1.k.r("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final z0 o0() {
        u1<z0> u1Var = this.B;
        if (this.f8525z == 0 && u1Var.d()) {
            return u1Var.e();
        }
        return null;
    }

    @Override // c1.i
    public void p(Object obj) {
        p1(obj);
    }

    public final void p1(Object obj) {
        if (f()) {
            this.F.j0(obj);
            if (obj instanceof d1) {
                F0(new w(obj));
                this.f8504e.add(obj);
                return;
            }
            return;
        }
        int n11 = this.D.n() - 1;
        if (obj instanceof d1) {
            this.f8504e.add(obj);
        }
        T0(true, new x(obj, n11));
    }

    @Override // c1.i
    public void q() {
        f0(true);
    }

    @Override // c1.i
    public void r() {
        g0();
        z0 o02 = o0();
        if (o02 == null || !o02.p()) {
            return;
        }
        o02.y(true);
    }

    @Override // c1.i
    public <T> void s(h00.a<? extends T> factory) {
        kotlin.jvm.internal.s.g(factory, "factory");
        r1();
        if (f()) {
            int d11 = this.f8510k.d();
            k1 k1Var = this.F;
            c1.d d12 = k1Var.d(k1Var.v());
            this.f8511l++;
            L0(new d(factory, d12, d11));
            N0(new e(d12, d11));
            return;
        }
        c1.k.r("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean s0() {
        return this.C;
    }

    @Override // c1.i
    public <V, T> void t(V v11, h00.p<? super T, ? super V, vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        c cVar = new c(block, v11);
        if (f()) {
            L0(cVar);
        } else {
            G0(cVar);
        }
    }

    public final Object t0() {
        if (!f()) {
            return this.f8523x ? c1.i.f8486a.a() : this.D.C();
        }
        s1();
        return c1.i.f8486a.a();
    }

    @Override // c1.i
    public void u() {
        this.f8515p = true;
    }

    @Override // c1.i
    public y0 v() {
        return o0();
    }

    @Override // c1.i
    public void w() {
        if (this.f8523x && this.D.p() == this.f8524y) {
            this.f8524y = -1;
            this.f8523x = false;
        }
        f0(false);
    }

    public final void w0(h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        if (!this.C) {
            this.C = true;
            try {
                block.mo11invoke();
                return;
            } finally {
                this.C = false;
            }
        }
        c1.k.r("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    @Override // c1.i
    public void x(int i11) {
        c1(i11, null, false, null);
    }

    @Override // c1.i
    public Object y() {
        return t0();
    }

    @Override // c1.i
    public n1.a z() {
        return this.f8503d;
    }
}