package s0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l0.c0;
import l0.v0;
import v20.o0;
import vz.b0;
import wz.s0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f49781a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49782b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, e> f49783c;

    /* renamed from: d  reason: collision with root package name */
    private Map<Object, Integer> f49784d;

    /* renamed from: e  reason: collision with root package name */
    private int f49785e;

    /* renamed from: f  reason: collision with root package name */
    private int f49786f;

    /* renamed from: g  reason: collision with root package name */
    private int f49787g;

    /* renamed from: h  reason: collision with root package name */
    private int f49788h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<Object> f49789i;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {264}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f49791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f49791b = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f49791b, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f49790a;
            if (i11 == 0) {
                vz.r.b(obj);
                l0.a<x2.k, l0.n> a11 = this.f49791b.a();
                x2.k b11 = x2.k.b(this.f49791b.d());
                this.f49790a = 1;
                if (a11.v(b11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            this.f49791b.e(false);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", l = {357}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f49793b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0<x2.k> f49794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z zVar, c0<x2.k> c0Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f49793b = zVar;
            this.f49794c = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f49793b, this.f49794c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            l0.i iVar;
            d11 = a00.d.d();
            int i11 = this.f49792a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    if (this.f49793b.a().r()) {
                        c0<x2.k> c0Var = this.f49794c;
                        iVar = c0Var instanceof v0 ? (v0) c0Var : j.a();
                    } else {
                        iVar = this.f49794c;
                    }
                    l0.i iVar2 = iVar;
                    l0.a<x2.k, l0.n> a11 = this.f49793b.a();
                    x2.k b11 = x2.k.b(this.f49793b.d());
                    this.f49792a = 1;
                    if (l0.a.f(a11, b11, iVar2, null, null, this, 12, null) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                this.f49793b.e(false);
            } catch (CancellationException unused) {
            }
            return b0.f54756a;
        }
    }

    public i(o0 scope, boolean z11) {
        Map<Object, Integer> i11;
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f49781a = scope;
        this.f49782b = z11;
        this.f49783c = new LinkedHashMap();
        i11 = s0.i();
        this.f49784d = i11;
        this.f49785e = -1;
        this.f49787g = -1;
        this.f49789i = new LinkedHashSet();
    }

    private final int a(int i11, int i12, int i13, long j11, boolean z11, int i14, int i15) {
        boolean z12 = false;
        int i16 = this.f49787g;
        boolean z13 = z11 ? i16 > i11 : i16 < i11;
        int i17 = this.f49785e;
        if (z11 ? i17 < i11 : i17 > i11) {
            z12 = true;
        }
        if (z13) {
            return i14 + this.f49788h + (i13 * (((i11 - this.f49787g) * (z11 ? -1 : 1)) - 1)) + c(j11);
        } else if (z12) {
            return ((this.f49786f - i12) - (i13 * (((this.f49785e - i11) * (z11 ? -1 : 1)) - 1))) + c(j11);
        } else {
            return i15;
        }
    }

    private final int c(long j11) {
        return this.f49782b ? x2.k.i(j11) : x2.k.h(j11);
    }

    private final void f(r rVar, e eVar) {
        while (eVar.b().size() > rVar.i()) {
            wz.u.H(eVar.b());
        }
        while (eVar.b().size() < rVar.i()) {
            int size = eVar.b().size();
            long h11 = rVar.h(size);
            List<z> b11 = eVar.b();
            long a11 = eVar.a();
            b11.add(new z(x2.l.a(x2.k.h(h11) - x2.k.h(a11), x2.k.i(h11) - x2.k.i(a11)), rVar.e(size), null));
        }
        List<z> b12 = eVar.b();
        int i11 = 0;
        int size2 = b12.size();
        while (i11 < size2) {
            int i12 = i11 + 1;
            z zVar = b12.get(i11);
            long d11 = zVar.d();
            long a12 = eVar.a();
            long a13 = x2.l.a(x2.k.h(d11) + x2.k.h(a12), x2.k.i(d11) + x2.k.i(a12));
            long h12 = rVar.h(i11);
            zVar.f(rVar.e(i11));
            c0<x2.k> a14 = rVar.a(i11);
            if (!x2.k.g(a13, h12)) {
                long a15 = eVar.a();
                zVar.g(x2.l.a(x2.k.h(h12) - x2.k.h(a15), x2.k.i(h12) - x2.k.i(a15)));
                if (a14 != null) {
                    zVar.e(true);
                    v20.i.d(this.f49781a, null, null, new b(zVar, a14, null), 3, null);
                }
            }
            i11 = i12;
        }
    }

    private final long g(int i11) {
        boolean z11 = this.f49782b;
        int i12 = z11 ? 0 : i11;
        if (!z11) {
            i11 = 0;
        }
        return x2.l.a(i12, i11);
    }

    public final long b(Object key, int i11, int i12, int i13, long j11) {
        kotlin.jvm.internal.s.g(key, "key");
        e eVar = this.f49783c.get(key);
        if (eVar == null) {
            return j11;
        }
        z zVar = eVar.b().get(i11);
        long l11 = zVar.a().o().l();
        long a11 = eVar.a();
        long a12 = x2.l.a(x2.k.h(l11) + x2.k.h(a11), x2.k.i(l11) + x2.k.i(a11));
        long d11 = zVar.d();
        long a13 = eVar.a();
        long a14 = x2.l.a(x2.k.h(d11) + x2.k.h(a13), x2.k.i(d11) + x2.k.i(a13));
        if (zVar.b() && ((c(a14) < i12 && c(a12) < i12) || (c(a14) > i13 && c(a12) > i13))) {
            v20.i.d(this.f49781a, null, null, new a(zVar, null), 3, null);
        }
        return a12;
    }

    public final void d(int i11, int i12, int i13, boolean z11, List<r> positionedItems, v itemProvider) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int c11;
        long j11;
        e eVar;
        r rVar;
        int a11;
        long e11;
        kotlin.jvm.internal.s.g(positionedItems, "positionedItems");
        kotlin.jvm.internal.s.g(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                z12 = false;
                break;
            }
            int i17 = i16 + 1;
            if (positionedItems.get(i16).b()) {
                z12 = true;
                break;
            }
            i16 = i17;
        }
        if (!z12) {
            e();
            return;
        }
        int i18 = this.f49782b ? i13 : i12;
        int i19 = i11;
        if (z11) {
            i19 = -i19;
        }
        long g11 = g(i19);
        r rVar2 = (r) wz.u.b0(positionedItems);
        r rVar3 = (r) wz.u.n0(positionedItems);
        int size2 = positionedItems.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int i23 = i21 + 1;
            r rVar4 = positionedItems.get(i21);
            e eVar2 = this.f49783c.get(rVar4.c());
            if (eVar2 != null) {
                eVar2.c(rVar4.getIndex());
            }
            i22 += rVar4.k();
            i21 = i23;
        }
        int size3 = i22 / positionedItems.size();
        this.f49789i.clear();
        int size4 = positionedItems.size();
        int i24 = 0;
        while (i24 < size4) {
            int i25 = i24 + 1;
            r rVar5 = positionedItems.get(i24);
            this.f49789i.add(rVar5.c());
            e eVar3 = this.f49783c.get(rVar5.c());
            if (eVar3 == null) {
                if (rVar5.b()) {
                    e eVar4 = new e(rVar5.getIndex());
                    Integer num = this.f49784d.get(rVar5.c());
                    long h11 = rVar5.h(i15);
                    int e12 = rVar5.e(i15);
                    if (num == null) {
                        a11 = c(h11);
                        j11 = h11;
                        eVar = eVar4;
                        rVar = rVar5;
                        i14 = size4;
                    } else {
                        if (!z11) {
                            c11 = c(h11);
                        } else {
                            c11 = (c(h11) - rVar5.k()) + e12;
                        }
                        j11 = h11;
                        eVar = eVar4;
                        rVar = rVar5;
                        i14 = size4;
                        a11 = a(num.intValue(), rVar5.k(), size3, g11, z11, i18, c11) + (z11 ? rVar.j() - e12 : i15);
                    }
                    if (this.f49782b) {
                        e11 = x2.k.e(j11, 0, a11, 1, null);
                    } else {
                        e11 = x2.k.e(j11, a11, 0, 2, null);
                    }
                    int i26 = rVar.i();
                    int i27 = i15;
                    while (i27 < i26) {
                        int i28 = i27 + 1;
                        r rVar6 = rVar;
                        long h12 = rVar6.h(i27);
                        long a12 = x2.l.a(x2.k.h(h12) - x2.k.h(j11), x2.k.i(h12) - x2.k.i(j11));
                        eVar.b().add(new z(x2.l.a(x2.k.h(e11) + x2.k.h(a12), x2.k.i(e11) + x2.k.i(a12)), rVar6.e(i27), null));
                        b0 b0Var = b0.f54756a;
                        i27 = i28;
                    }
                    r rVar7 = rVar;
                    e eVar5 = eVar;
                    this.f49783c.put(rVar7.c(), eVar5);
                    f(rVar7, eVar5);
                } else {
                    i14 = size4;
                }
            } else {
                i14 = size4;
                if (rVar5.b()) {
                    long a13 = eVar3.a();
                    eVar3.d(x2.l.a(x2.k.h(a13) + x2.k.h(g11), x2.k.i(a13) + x2.k.i(g11)));
                    f(rVar5, eVar3);
                } else {
                    this.f49783c.remove(rVar5.c());
                }
            }
            i24 = i25;
            size4 = i14;
            i15 = 0;
        }
        if (!z11) {
            this.f49785e = rVar2.getIndex();
            this.f49786f = rVar2.g();
            this.f49787g = rVar3.getIndex();
            this.f49788h = (rVar3.g() + rVar3.k()) - i18;
        } else {
            this.f49785e = rVar3.getIndex();
            this.f49786f = (i18 - rVar3.g()) - rVar3.j();
            this.f49787g = rVar2.getIndex();
            this.f49788h = (-rVar2.g()) + (rVar2.k() - rVar2.j());
        }
        Iterator<Map.Entry<Object, e>> it2 = this.f49783c.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Object, e> next = it2.next();
            if (!this.f49789i.contains(next.getKey())) {
                e value = next.getValue();
                long a14 = value.a();
                value.d(x2.l.a(x2.k.h(a14) + x2.k.h(g11), x2.k.i(a14) + x2.k.i(g11)));
                Integer num2 = itemProvider.c().get(next.getKey());
                List<z> b11 = value.b();
                int size5 = b11.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size5) {
                        z13 = false;
                        break;
                    }
                    int i31 = i29 + 1;
                    z zVar = b11.get(i29);
                    long d11 = zVar.d();
                    long a15 = value.a();
                    List<z> list = b11;
                    long a16 = x2.l.a(x2.k.h(d11) + x2.k.h(a15), x2.k.i(d11) + x2.k.i(a15));
                    if (c(a16) + zVar.c() > 0 && c(a16) < i18) {
                        z13 = true;
                        break;
                    } else {
                        b11 = list;
                        i29 = i31;
                    }
                }
                List<z> b12 = value.b();
                int size6 = b12.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size6) {
                        z14 = false;
                        break;
                    }
                    int i33 = i32 + 1;
                    if (b12.get(i32).b()) {
                        z14 = true;
                        break;
                    }
                    i32 = i33;
                }
                boolean z15 = !z14;
                if ((z13 || !z15) && num2 != null && !value.b().isEmpty()) {
                    u a17 = itemProvider.a(s0.a.a(num2.intValue()));
                    int a18 = a(num2.intValue(), a17.e(), size3, g11, z11, i18, i18);
                    if (z11) {
                        a18 = (i18 - a18) - a17.d();
                    }
                    r f11 = a17.f(a18, i12, i13);
                    positionedItems.add(f11);
                    f(f11, value);
                } else {
                    it2.remove();
                }
            }
        }
        this.f49784d = itemProvider.c();
    }

    public final void e() {
        Map<Object, Integer> i11;
        this.f49783c.clear();
        i11 = s0.i();
        this.f49784d = i11;
        this.f49785e = -1;
        this.f49786f = 0;
        this.f49787g = -1;
        this.f49788h = 0;
    }
}