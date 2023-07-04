package c1;

import androidx.compose.runtime.ProvidedValue;
import e1.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.q<e<?>, k1, c1, vz.b0> f8574a = b.f8584a;

    /* renamed from: b  reason: collision with root package name */
    private static final h00.q<e<?>, k1, c1, vz.b0> f8575b = a.f8583a;

    /* renamed from: c  reason: collision with root package name */
    private static final h00.q<e<?>, k1, c1, vz.b0> f8576c = c.f8585a;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f8577d = new q0("provider");

    /* renamed from: e  reason: collision with root package name */
    private static final Object f8578e = new q0("provider");

    /* renamed from: f  reason: collision with root package name */
    private static final Object f8579f = new q0("compositionLocalMap");

    /* renamed from: g  reason: collision with root package name */
    private static final Object f8580g = new q0("providerValues");

    /* renamed from: h  reason: collision with root package name */
    private static final Object f8581h = new q0("providers");

    /* renamed from: i  reason: collision with root package name */
    private static final Object f8582i = new q0("reference");

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8583a = new a();

        a() {
            super(3);
        }

        public final void a(e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.n();
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.q<e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8584a = new b();

        b() {
            super(3);
        }

        public final void a(e<?> noName_0, k1 slots, c1 rememberManager) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
            k.N(slots, rememberManager);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.q<e<?>, k1, c1, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8585a = new c();

        c() {
            super(3);
        }

        public final void a(e<?> noName_0, k1 slots, c1 noName_2) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(slots, "slots");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            slots.p(0);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(e<?> eVar, k1 k1Var, c1 c1Var) {
            a(eVar, k1Var, c1Var);
            return vz.b0.f54756a;
        }
    }

    public static final Object A() {
        return f8578e;
    }

    public static final Object B() {
        return f8581h;
    }

    public static final Object C() {
        return f8580g;
    }

    public static final Object D() {
        return f8582i;
    }

    public static final <T> T E(e1.f<q<Object>, ? extends v1<? extends Object>> fVar, q<T> key) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(key, "key");
        v1<? extends Object> v1Var = fVar.get(key);
        if (v1Var == null) {
            return null;
        }
        return (T) v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List<f0> list, int i11, z0 z0Var, Object obj) {
        int v11 = v(list, i11);
        d1.c cVar = null;
        if (v11 < 0) {
            int i12 = -(v11 + 1);
            if (obj != null) {
                cVar = new d1.c();
                cVar.add(obj);
            }
            list.add(i12, new f0(z0Var, i11, cVar));
        } else if (obj == null) {
            list.get(v11).e(null);
        } else {
            d1.c<Object> a11 = list.get(v11).a();
            if (a11 == null) {
                return;
            }
            a11.add(obj);
        }
    }

    public static final void G(i composer, h00.p<? super i, ? super Integer, vz.b0> composable) {
        kotlin.jvm.internal.s.g(composer, "composer");
        kotlin.jvm.internal.s.g(composable, "composable");
        ((h00.p) kotlin.jvm.internal.r0.f(composable, 2)).invoke(composer, 1);
    }

    public static final <T> T H(i composer, h00.p<? super i, ? super Integer, ? extends T> composable) {
        kotlin.jvm.internal.s.g(composer, "composer");
        kotlin.jvm.internal.s.g(composable, "composable");
        return (T) ((h00.p) kotlin.jvm.internal.r0.f(composable, 2)).invoke(composer, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> I() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(h1 h1Var, int i11, int i12, int i13) {
        if (i11 == i12) {
            return i11;
        }
        if (i11 == i13 || i12 == i13) {
            return i13;
        }
        if (h1Var.H(i11) == i12) {
            return i12;
        }
        if (h1Var.H(i12) == i11) {
            return i11;
        }
        if (h1Var.H(i11) == h1Var.H(i12)) {
            return h1Var.H(i11);
        }
        int u11 = u(h1Var, i11, i13);
        int u12 = u(h1Var, i12, i13);
        int i14 = u11 - u12;
        int i15 = 0;
        int i16 = 0;
        while (i16 < i14) {
            i16++;
            i11 = h1Var.H(i11);
        }
        int i17 = u12 - u11;
        while (i15 < i17) {
            i15++;
            i12 = h1Var.H(i12);
        }
        while (i11 != i12) {
            i11 = h1Var.H(i11);
            i12 = h1Var.H(i12);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V K(HashMap<K, LinkedHashSet<V>> hashMap, K k11) {
        V v11;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null || (v11 = (V) wz.u.c0(linkedHashSet)) == null) {
            return null;
        }
        M(hashMap, k11, v11);
        return v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean L(HashMap<K, LinkedHashSet<V>> hashMap, K k11, V v11) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k11, linkedHashSet);
        }
        return linkedHashSet.add(v11);
    }

    private static final <K, V> vz.b0 M(HashMap<K, LinkedHashSet<V>> hashMap, K k11, V v11) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v11);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k11);
        }
        return vz.b0.f54756a;
    }

    public static final void N(k1 k1Var, c1 rememberManager) {
        z0 z0Var;
        o j11;
        kotlin.jvm.internal.s.g(k1Var, "<this>");
        kotlin.jvm.internal.s.g(rememberManager, "rememberManager");
        Iterator<Object> D = k1Var.D();
        while (D.hasNext()) {
            Object next = D.next();
            if (next instanceof d1) {
                rememberManager.c((d1) next);
            } else if ((next instanceof z0) && (j11 = (z0Var = (z0) next).j()) != null) {
                j11.w(true);
                z0Var.x(null);
            }
        }
        k1Var.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 O(List<f0> list, int i11) {
        int v11 = v(list, i11);
        if (v11 >= 0) {
            return list.remove(v11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(List<f0> list, int i11, int i12) {
        int v11 = v(list, i11);
        if (v11 < 0) {
            v11 = -(v11 + 1);
        }
        while (v11 < list.size() && list.get(v11).b() < i12) {
            list.remove(v11);
        }
    }

    public static final void Q(boolean z11) {
        if (z11) {
            return;
        }
        r("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(int i11) {
        return i11 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(boolean z11) {
        return z11 ? 1 : 0;
    }

    public static final Void r(String message) {
        kotlin.jvm.internal.s.g(message, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1.f<q<Object>, v1<Object>> s(ProvidedValue<?>[] providedValueArr, e1.f<q<Object>, ? extends v1<? extends Object>> fVar, i iVar, int i11) {
        iVar.x(680852469);
        f.a g11 = e1.a.a().g();
        int length = providedValueArr.length;
        int i12 = 0;
        while (i12 < length) {
            ProvidedValue<?> providedValue = providedValueArr[i12];
            i12++;
            if (providedValue.a() || !t(fVar, providedValue.b())) {
                g11.put(providedValue.b(), providedValue.b().b(providedValue.c(), iVar, 72));
            }
        }
        e1.f<q<Object>, v1<Object>> build = g11.build();
        iVar.N();
        return build;
    }

    public static final <T> boolean t(e1.f<q<Object>, ? extends v1<? extends Object>> fVar, q<T> key) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(key, "key");
        return fVar.containsKey(key);
    }

    private static final int u(h1 h1Var, int i11, int i12) {
        int i13 = 0;
        while (i11 > 0 && i11 != i12) {
            i11 = h1Var.H(i11);
            i13++;
        }
        return i13;
    }

    private static final int v(List<f0> list, int i11) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = kotlin.jvm.internal.s.i(list.get(i13).b(), i11);
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 w(List<f0> list, int i11, int i12) {
        int v11 = v(list, i11);
        if (v11 < 0) {
            v11 = -(v11 + 1);
        }
        if (v11 < list.size()) {
            f0 f0Var = list.get(v11);
            if (f0Var.b() < i12) {
                return f0Var;
            }
            return null;
        }
        return null;
    }

    public static final Object x() {
        return f8579f;
    }

    public static final Object y() {
        return f8577d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object z(i0 i0Var) {
        return i0Var.d() != null ? new h0(Integer.valueOf(i0Var.a()), i0Var.d()) : Integer.valueOf(i0Var.a());
    }
}