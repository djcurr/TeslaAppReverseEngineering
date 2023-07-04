package n2;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import n2.a;
import n2.y;
import r2.l;
import s1.f;
import t1.a0;
import t1.a1;
import t2.e;
import t2.f;
import w2.a;
import w2.e;
import w2.g;
import w2.i;
import x2.r;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final l1.i<n2.a, Object> f40330a = l1.j.a(a.f40348a, b.f40350a);

    /* renamed from: b  reason: collision with root package name */
    private static final l1.i<List<a.b<? extends Object>>, Object> f40331b = l1.j.a(c.f40352a, d.f40354a);

    /* renamed from: c  reason: collision with root package name */
    private static final l1.i<a.b<? extends Object>, Object> f40332c = l1.j.a(e.f40356a, f.f40359a);

    /* renamed from: d  reason: collision with root package name */
    private static final l1.i<n2.d0, Object> f40333d = l1.j.a(i0.f40367a, j0.f40369a);

    /* renamed from: e  reason: collision with root package name */
    private static final l1.i<n2.n, Object> f40334e = l1.j.a(s.f40378a, t.f40379a);

    /* renamed from: f  reason: collision with root package name */
    private static final l1.i<n2.s, Object> f40335f = l1.j.a(w.f40382a, x.f40383a);

    /* renamed from: g  reason: collision with root package name */
    private static final l1.i<w2.e, Object> f40336g = l1.j.a(y.f40384a, z.f40385a);

    /* renamed from: h  reason: collision with root package name */
    private static final l1.i<w2.g, Object> f40337h = l1.j.a(a0.f40349a, b0.f40351a);

    /* renamed from: i  reason: collision with root package name */
    private static final l1.i<w2.i, Object> f40338i = l1.j.a(c0.f40353a, d0.f40355a);

    /* renamed from: j  reason: collision with root package name */
    private static final l1.i<r2.l, Object> f40339j = l1.j.a(k.f40370a, l.f40371a);

    /* renamed from: k  reason: collision with root package name */
    private static final l1.i<w2.a, Object> f40340k = l1.j.a(g.f40362a, h.f40364a);

    /* renamed from: l  reason: collision with root package name */
    private static final l1.i<n2.y, Object> f40341l = l1.j.a(e0.f40358a, f0.f40361a);

    /* renamed from: m  reason: collision with root package name */
    private static final l1.i<a1, Object> f40342m = l1.j.a(u.f40380a, v.f40381a);

    /* renamed from: n  reason: collision with root package name */
    private static final l1.i<t1.a0, Object> f40343n = l1.j.a(i.f40366a, j.f40368a);

    /* renamed from: o  reason: collision with root package name */
    private static final l1.i<x2.r, Object> f40344o = l1.j.a(g0.f40363a, h0.f40365a);

    /* renamed from: p  reason: collision with root package name */
    private static final l1.i<s1.f, Object> f40345p = l1.j.a(q.f40376a, C0789r.f40377a);

    /* renamed from: q  reason: collision with root package name */
    private static final l1.i<t2.f, Object> f40346q = l1.j.a(m.f40372a, n.f40373a);

    /* renamed from: r  reason: collision with root package name */
    private static final l1.i<t2.e, Object> f40347r = l1.j.a(o.f40374a, p.f40375a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<l1.k, n2.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40348a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, n2.a it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            e11 = wz.w.e(r.s(it2.g()), r.t(it2.e(), r.f40331b, Saver), r.t(it2.d(), r.f40331b, Saver), r.t(it2.b(), r.f40331b, Saver));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class a0 extends kotlin.jvm.internal.u implements h00.p<l1.k, w2.g, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a0 f40349a = new a0();

        a0() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, w2.g it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            e11 = wz.w.e(Float.valueOf(it2.b()), Float.valueOf(it2.c()));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Object, n2.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40350a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n2.a invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            List list2 = null;
            String str = obj == null ? null : (String) obj;
            kotlin.jvm.internal.s.e(str);
            Object obj2 = list.get(1);
            l1.i iVar = r.f40331b;
            Boolean bool = Boolean.FALSE;
            List list3 = (kotlin.jvm.internal.s.c(obj2, bool) || obj2 == null) ? null : (List) iVar.b(obj2);
            kotlin.jvm.internal.s.e(list3);
            Object obj3 = list.get(2);
            List list4 = (kotlin.jvm.internal.s.c(obj3, bool) || obj3 == null) ? null : (List) r.f40331b.b(obj3);
            kotlin.jvm.internal.s.e(list4);
            Object obj4 = list.get(3);
            l1.i iVar2 = r.f40331b;
            if (!kotlin.jvm.internal.s.c(obj4, bool) && obj4 != null) {
                list2 = (List) iVar2.b(obj4);
            }
            kotlin.jvm.internal.s.e(list2);
            return new n2.a(str, list3, list4, list2);
        }
    }

    /* loaded from: classes.dex */
    static final class b0 extends kotlin.jvm.internal.u implements h00.l<Object, w2.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b0 f40351a = new b0();

        b0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w2.g invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            return new w2.g(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.p<l1.k, List<? extends a.b<? extends Object>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f40352a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, List<? extends a.b<? extends Object>> it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            ArrayList arrayList = new ArrayList(it2.size());
            int size = it2.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(r.t(it2.get(i11), r.f40332c, Saver));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    static final class c0 extends kotlin.jvm.internal.u implements h00.p<l1.k, w2.i, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final c0 f40353a = new c0();

        c0() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, w2.i it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            x2.r b11 = x2.r.b(it2.b());
            r.a aVar = x2.r.f56957b;
            e11 = wz.w.e(r.t(b11, r.q(aVar), Saver), r.t(x2.r.b(it2.c()), r.q(aVar), Saver));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<Object, List<? extends a.b<? extends Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f40354a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final List<a.b<? extends Object>> invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Object obj = list.get(i11);
                l1.i iVar = r.f40332c;
                a.b bVar = null;
                if (!kotlin.jvm.internal.s.c(obj, Boolean.FALSE) && obj != null) {
                    bVar = (a.b) iVar.b(obj);
                }
                kotlin.jvm.internal.s.e(bVar);
                arrayList.add(bVar);
                i11 = i12;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    static final class d0 extends kotlin.jvm.internal.u implements h00.l<Object, w2.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d0 f40355a = new d0();

        d0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w2.i invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            r.a aVar = x2.r.f56957b;
            l1.i<x2.r, Object> q11 = r.q(aVar);
            Boolean bool = Boolean.FALSE;
            x2.r rVar = null;
            x2.r b11 = (kotlin.jvm.internal.s.c(obj, bool) || obj == null) ? null : q11.b(obj);
            kotlin.jvm.internal.s.e(b11);
            long k11 = b11.k();
            Object obj2 = list.get(1);
            l1.i<x2.r, Object> q12 = r.q(aVar);
            if (!kotlin.jvm.internal.s.c(obj2, bool) && obj2 != null) {
                rVar = q12.b(obj2);
            }
            kotlin.jvm.internal.s.e(rVar);
            return new w2.i(k11, rVar.k(), null);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.p<l1.k, a.b<? extends Object>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f40356a = new e();

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f40357a;

            static {
                int[] iArr = new int[n2.c.values().length];
                iArr[n2.c.Paragraph.ordinal()] = 1;
                iArr[n2.c.Span.ordinal()] = 2;
                iArr[n2.c.VerbatimTts.ordinal()] = 3;
                iArr[n2.c.String.ordinal()] = 4;
                f40357a = iArr;
            }
        }

        e() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, a.b<? extends Object> it2) {
            n2.c cVar;
            Object t11;
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            Object e12 = it2.e();
            if (e12 instanceof n2.n) {
                cVar = n2.c.Paragraph;
            } else if (e12 instanceof n2.s) {
                cVar = n2.c.Span;
            } else {
                cVar = e12 instanceof n2.d0 ? n2.c.VerbatimTts : n2.c.String;
            }
            int i11 = a.f40357a[cVar.ordinal()];
            if (i11 == 1) {
                t11 = r.t((n2.n) it2.e(), r.e(), Saver);
            } else if (i11 == 2) {
                t11 = r.t((n2.s) it2.e(), r.r(), Saver);
            } else if (i11 == 3) {
                t11 = r.t((n2.d0) it2.e(), r.f40333d, Saver);
            } else if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                t11 = r.s(it2.e());
            }
            e11 = wz.w.e(r.s(cVar), t11, r.s(Integer.valueOf(it2.f())), r.s(Integer.valueOf(it2.d())), r.s(it2.g()));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class e0 extends kotlin.jvm.internal.u implements h00.p<l1.k, n2.y, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f40358a = new e0();

        e0() {
            super(2);
        }

        public final Object a(l1.k Saver, long j11) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            e11 = wz.w.e((Integer) r.s(Integer.valueOf(n2.y.n(j11))), (Integer) r.s(Integer.valueOf(n2.y.i(j11))));
            return e11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(l1.k kVar, n2.y yVar) {
            return a(kVar, yVar.r());
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.l<Object, a.b<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f40359a = new f();

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f40360a;

            static {
                int[] iArr = new int[n2.c.values().length];
                iArr[n2.c.Paragraph.ordinal()] = 1;
                iArr[n2.c.Span.ordinal()] = 2;
                iArr[n2.c.VerbatimTts.ordinal()] = 3;
                iArr[n2.c.String.ordinal()] = 4;
                f40360a = iArr;
            }
        }

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final a.b<? extends Object> invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            n2.c cVar = obj == null ? null : (n2.c) obj;
            kotlin.jvm.internal.s.e(cVar);
            Object obj2 = list.get(2);
            Integer num = obj2 == null ? null : (Integer) obj2;
            kotlin.jvm.internal.s.e(num);
            int intValue = num.intValue();
            Object obj3 = list.get(3);
            Integer num2 = obj3 == null ? null : (Integer) obj3;
            kotlin.jvm.internal.s.e(num2);
            int intValue2 = num2.intValue();
            Object obj4 = list.get(4);
            String str = obj4 == null ? null : (String) obj4;
            kotlin.jvm.internal.s.e(str);
            int i11 = a.f40360a[cVar.ordinal()];
            if (i11 == 1) {
                Object obj5 = list.get(1);
                l1.i<n2.n, Object> e11 = r.e();
                if (!kotlin.jvm.internal.s.c(obj5, Boolean.FALSE) && obj5 != null) {
                    r1 = (n2.n) e11.b(obj5);
                }
                kotlin.jvm.internal.s.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            } else if (i11 == 2) {
                Object obj6 = list.get(1);
                l1.i<n2.s, Object> r11 = r.r();
                if (!kotlin.jvm.internal.s.c(obj6, Boolean.FALSE) && obj6 != null) {
                    r1 = (n2.s) r11.b(obj6);
                }
                kotlin.jvm.internal.s.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            } else if (i11 != 3) {
                if (i11 == 4) {
                    Object obj7 = list.get(1);
                    r1 = obj7 != null ? (String) obj7 : null;
                    kotlin.jvm.internal.s.e(r1);
                    return new a.b<>(r1, intValue, intValue2, str);
                }
                throw new NoWhenBranchMatchedException();
            } else {
                Object obj8 = list.get(1);
                l1.i iVar = r.f40333d;
                if (!kotlin.jvm.internal.s.c(obj8, Boolean.FALSE) && obj8 != null) {
                    r1 = (n2.d0) iVar.b(obj8);
                }
                kotlin.jvm.internal.s.e(r1);
                return new a.b<>(r1, intValue, intValue2, str);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class f0 extends kotlin.jvm.internal.u implements h00.l<Object, n2.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f40361a = new f0();

        f0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n2.y invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            Integer num = obj == null ? null : (Integer) obj;
            kotlin.jvm.internal.s.e(num);
            int intValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            kotlin.jvm.internal.s.e(num2);
            return n2.y.b(n2.z.b(intValue, num2.intValue()));
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.p<l1.k, w2.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f40362a = new g();

        g() {
            super(2);
        }

        public final Object a(l1.k Saver, float f11) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            return Float.valueOf(f11);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(l1.k kVar, w2.a aVar) {
            return a(kVar, aVar.h());
        }
    }

    /* loaded from: classes.dex */
    static final class g0 extends kotlin.jvm.internal.u implements h00.p<l1.k, x2.r, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final g0 f40363a = new g0();

        g0() {
            super(2);
        }

        public final Object a(l1.k Saver, long j11) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            e11 = wz.w.e(r.s(Float.valueOf(x2.r.h(j11))), r.s(x2.t.d(x2.r.g(j11))));
            return e11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(l1.k kVar, x2.r rVar) {
            return a(kVar, rVar.k());
        }
    }

    /* loaded from: classes.dex */
    static final class h extends kotlin.jvm.internal.u implements h00.l<Object, w2.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f40364a = new h();

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w2.a invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return w2.a.b(w2.a.c(((Float) it2).floatValue()));
        }
    }

    /* loaded from: classes.dex */
    static final class h0 extends kotlin.jvm.internal.u implements h00.l<Object, x2.r> {

        /* renamed from: a  reason: collision with root package name */
        public static final h0 f40365a = new h0();

        h0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final x2.r invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            Float f11 = obj == null ? null : (Float) obj;
            kotlin.jvm.internal.s.e(f11);
            float floatValue = f11.floatValue();
            Object obj2 = list.get(1);
            x2.t tVar = obj2 != null ? (x2.t) obj2 : null;
            kotlin.jvm.internal.s.e(tVar);
            return x2.r.b(x2.s.a(floatValue, tVar.j()));
        }
    }

    /* loaded from: classes.dex */
    static final class i extends kotlin.jvm.internal.u implements h00.p<l1.k, t1.a0, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f40366a = new i();

        i() {
            super(2);
        }

        public final Object a(l1.k Saver, long j11) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            return vz.y.a(j11);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(l1.k kVar, t1.a0 a0Var) {
            return a(kVar, a0Var.v());
        }
    }

    /* loaded from: classes.dex */
    static final class i0 extends kotlin.jvm.internal.u implements h00.p<l1.k, n2.d0, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final i0 f40367a = new i0();

        i0() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, n2.d0 it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            return r.s(it2.a());
        }
    }

    /* loaded from: classes.dex */
    static final class j extends kotlin.jvm.internal.u implements h00.l<Object, t1.a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f40368a = new j();

        j() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final t1.a0 invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return t1.a0.h(t1.a0.i(((vz.y) it2).f()));
        }
    }

    /* loaded from: classes.dex */
    static final class j0 extends kotlin.jvm.internal.u implements h00.l<Object, n2.d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final j0 f40369a = new j0();

        j0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n2.d0 invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new n2.d0((String) it2);
        }
    }

    /* loaded from: classes.dex */
    static final class k extends kotlin.jvm.internal.u implements h00.p<l1.k, r2.l, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f40370a = new k();

        k() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, r2.l it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.k());
        }
    }

    /* loaded from: classes.dex */
    static final class l extends kotlin.jvm.internal.u implements h00.l<Object, r2.l> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f40371a = new l();

        l() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final r2.l invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new r2.l(((Integer) it2).intValue());
        }
    }

    /* loaded from: classes.dex */
    static final class m extends kotlin.jvm.internal.u implements h00.p<l1.k, t2.f, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f40372a = new m();

        m() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, t2.f it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            List<t2.e> f11 = it2.f();
            ArrayList arrayList = new ArrayList(f11.size());
            int size = f11.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(r.t(f11.get(i11), r.k(t2.e.f51561b), Saver));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    static final class n extends kotlin.jvm.internal.u implements h00.l<Object, t2.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f40373a = new n();

        n() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final t2.f invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Object obj = list.get(i11);
                l1.i<t2.e, Object> k11 = r.k(t2.e.f51561b);
                t2.e eVar = null;
                if (!kotlin.jvm.internal.s.c(obj, Boolean.FALSE) && obj != null) {
                    eVar = k11.b(obj);
                }
                kotlin.jvm.internal.s.e(eVar);
                arrayList.add(eVar);
                i11 = i12;
            }
            return new t2.f(arrayList);
        }
    }

    /* loaded from: classes.dex */
    static final class o extends kotlin.jvm.internal.u implements h00.p<l1.k, t2.e, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f40374a = new o();

        o() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, t2.e it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.c();
        }
    }

    /* loaded from: classes.dex */
    static final class p extends kotlin.jvm.internal.u implements h00.l<Object, t2.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f40375a = new p();

        p() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final t2.e invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new t2.e((String) it2);
        }
    }

    /* loaded from: classes.dex */
    static final class q extends kotlin.jvm.internal.u implements h00.p<l1.k, s1.f, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f40376a = new q();

        q() {
            super(2);
        }

        public final Object a(l1.k Saver, long j11) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            if (s1.f.j(j11, s1.f.f49950b.b())) {
                return Boolean.FALSE;
            }
            e11 = wz.w.e((Float) r.s(Float.valueOf(s1.f.l(j11))), (Float) r.s(Float.valueOf(s1.f.m(j11))));
            return e11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(l1.k kVar, s1.f fVar) {
            return a(kVar, fVar.t());
        }
    }

    /* renamed from: n2.r$r  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0789r extends kotlin.jvm.internal.u implements h00.l<Object, s1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0789r f40377a = new C0789r();

        C0789r() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final s1.f invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, Boolean.FALSE)) {
                return s1.f.d(s1.f.f49950b.b());
            }
            List list = (List) it2;
            Object obj = list.get(0);
            Float f11 = obj == null ? null : (Float) obj;
            kotlin.jvm.internal.s.e(f11);
            float floatValue = f11.floatValue();
            Object obj2 = list.get(1);
            Float f12 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.s.e(f12);
            return s1.f.d(s1.g.a(floatValue, f12.floatValue()));
        }
    }

    /* loaded from: classes.dex */
    static final class s extends kotlin.jvm.internal.u implements h00.p<l1.k, n2.n, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f40378a = new s();

        s() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, n2.n it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            e11 = wz.w.e(r.s(it2.d()), r.s(it2.e()), r.t(x2.r.b(it2.c()), r.q(x2.r.f56957b), Saver), r.t(it2.f(), r.p(w2.i.f55424c), Saver));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class t extends kotlin.jvm.internal.u implements h00.l<Object, n2.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f40379a = new t();

        t() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n2.n invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            w2.i iVar = null;
            w2.d dVar = obj == null ? null : (w2.d) obj;
            Object obj2 = list.get(1);
            w2.f fVar = obj2 == null ? null : (w2.f) obj2;
            Object obj3 = list.get(2);
            l1.i<x2.r, Object> q11 = r.q(x2.r.f56957b);
            Boolean bool = Boolean.FALSE;
            x2.r b11 = (kotlin.jvm.internal.s.c(obj3, bool) || obj3 == null) ? null : q11.b(obj3);
            kotlin.jvm.internal.s.e(b11);
            long k11 = b11.k();
            Object obj4 = list.get(3);
            l1.i<w2.i, Object> p11 = r.p(w2.i.f55424c);
            if (!kotlin.jvm.internal.s.c(obj4, bool) && obj4 != null) {
                iVar = p11.b(obj4);
            }
            return new n2.n(dVar, fVar, k11, iVar, null);
        }
    }

    /* loaded from: classes.dex */
    static final class u extends kotlin.jvm.internal.u implements h00.p<l1.k, a1, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f40380a = new u();

        u() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, a1 it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            e11 = wz.w.e(r.t(t1.a0.h(it2.c()), r.i(t1.a0.f51365b), Saver), r.t(s1.f.d(it2.d()), r.h(s1.f.f49950b), Saver), r.s(Float.valueOf(it2.b())));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class v extends kotlin.jvm.internal.u implements h00.l<Object, a1> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f40381a = new v();

        v() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final a1 invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            l1.i<t1.a0, Object> i11 = r.i(t1.a0.f51365b);
            Boolean bool = Boolean.FALSE;
            t1.a0 b11 = (kotlin.jvm.internal.s.c(obj, bool) || obj == null) ? null : i11.b(obj);
            kotlin.jvm.internal.s.e(b11);
            long v11 = b11.v();
            Object obj2 = list.get(1);
            s1.f b12 = (kotlin.jvm.internal.s.c(obj2, bool) || obj2 == null) ? null : r.h(s1.f.f49950b).b(obj2);
            kotlin.jvm.internal.s.e(b12);
            long t11 = b12.t();
            Object obj3 = list.get(2);
            Float f11 = obj3 != null ? (Float) obj3 : null;
            kotlin.jvm.internal.s.e(f11);
            return new a1(v11, t11, f11.floatValue(), null);
        }
    }

    /* loaded from: classes.dex */
    static final class w extends kotlin.jvm.internal.u implements h00.p<l1.k, n2.s, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f40382a = new w();

        w() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, n2.s it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            t1.a0 h11 = t1.a0.h(it2.c());
            a0.a aVar = t1.a0.f51365b;
            x2.r b11 = x2.r.b(it2.f());
            r.a aVar2 = x2.r.f56957b;
            e11 = wz.w.e(r.t(h11, r.i(aVar), Saver), r.t(b11, r.q(aVar2), Saver), r.t(it2.i(), r.g(r2.l.f49091b), Saver), r.s(it2.g()), r.s(it2.h()), r.s(-1), r.s(it2.e()), r.t(x2.r.b(it2.j()), r.q(aVar2), Saver), r.t(it2.b(), r.m(w2.a.f55397b), Saver), r.t(it2.n(), r.o(w2.g.f55420c), Saver), r.t(it2.k(), r.l(t2.f.f51563c), Saver), r.t(t1.a0.h(it2.a()), r.i(aVar), Saver), r.t(it2.m(), r.n(w2.e.f55408b), Saver), r.t(it2.l(), r.j(a1.f51374d), Saver));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class x extends kotlin.jvm.internal.u implements h00.l<Object, n2.s> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f40383a = new x();

        x() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n2.s invoke(Object it2) {
            r2.l b11;
            w2.a b12;
            w2.g b13;
            t2.f b14;
            w2.e b15;
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            a0.a aVar = t1.a0.f51365b;
            l1.i<t1.a0, Object> i11 = r.i(aVar);
            Boolean bool = Boolean.FALSE;
            a1 a1Var = null;
            t1.a0 b16 = (kotlin.jvm.internal.s.c(obj, bool) || obj == null) ? null : i11.b(obj);
            kotlin.jvm.internal.s.e(b16);
            long v11 = b16.v();
            Object obj2 = list.get(1);
            r.a aVar2 = x2.r.f56957b;
            x2.r b17 = (kotlin.jvm.internal.s.c(obj2, bool) || obj2 == null) ? null : r.q(aVar2).b(obj2);
            kotlin.jvm.internal.s.e(b17);
            long k11 = b17.k();
            Object obj3 = list.get(2);
            l1.i<r2.l, Object> g11 = r.g(r2.l.f49091b);
            if (kotlin.jvm.internal.s.c(obj3, bool)) {
                b11 = null;
            } else {
                b11 = obj3 == null ? null : g11.b(obj3);
            }
            Object obj4 = list.get(3);
            r2.j jVar = obj4 == null ? null : (r2.j) obj4;
            Object obj5 = list.get(4);
            r2.k kVar = obj5 == null ? null : (r2.k) obj5;
            Object obj6 = list.get(6);
            String str = obj6 == null ? null : (String) obj6;
            Object obj7 = list.get(7);
            x2.r b18 = (kotlin.jvm.internal.s.c(obj7, bool) || obj7 == null) ? null : r.q(aVar2).b(obj7);
            kotlin.jvm.internal.s.e(b18);
            long k12 = b18.k();
            Object obj8 = list.get(8);
            l1.i<w2.a, Object> m11 = r.m(w2.a.f55397b);
            if (kotlin.jvm.internal.s.c(obj8, bool)) {
                b12 = null;
            } else {
                b12 = obj8 == null ? null : m11.b(obj8);
            }
            Object obj9 = list.get(9);
            l1.i<w2.g, Object> o11 = r.o(w2.g.f55420c);
            if (kotlin.jvm.internal.s.c(obj9, bool)) {
                b13 = null;
            } else {
                b13 = obj9 == null ? null : o11.b(obj9);
            }
            Object obj10 = list.get(10);
            l1.i<t2.f, Object> l11 = r.l(t2.f.f51563c);
            if (kotlin.jvm.internal.s.c(obj10, bool)) {
                b14 = null;
            } else {
                b14 = obj10 == null ? null : l11.b(obj10);
            }
            Object obj11 = list.get(11);
            t1.a0 b19 = (kotlin.jvm.internal.s.c(obj11, bool) || obj11 == null) ? null : r.i(aVar).b(obj11);
            kotlin.jvm.internal.s.e(b19);
            long v12 = b19.v();
            Object obj12 = list.get(12);
            l1.i<w2.e, Object> n11 = r.n(w2.e.f55408b);
            if (kotlin.jvm.internal.s.c(obj12, bool)) {
                b15 = null;
            } else {
                b15 = obj12 == null ? null : n11.b(obj12);
            }
            Object obj13 = list.get(13);
            l1.i<a1, Object> j11 = r.j(a1.f51374d);
            if (!kotlin.jvm.internal.s.c(obj13, bool) && obj13 != null) {
                a1Var = j11.b(obj13);
            }
            return new n2.s(v11, k11, b11, jVar, kVar, null, str, k12, b12, b13, b14, v12, b15, a1Var, 32, null);
        }
    }

    /* loaded from: classes.dex */
    static final class y extends kotlin.jvm.internal.u implements h00.p<l1.k, w2.e, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f40384a = new y();

        y() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, w2.e it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.e());
        }
    }

    /* loaded from: classes.dex */
    static final class z extends kotlin.jvm.internal.u implements h00.l<Object, w2.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f40385a = new z();

        z() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w2.e invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new w2.e(((Integer) it2).intValue());
        }
    }

    public static final l1.i<n2.a, Object> d() {
        return f40330a;
    }

    public static final l1.i<n2.n, Object> e() {
        return f40334e;
    }

    public static final l1.i<n2.y, Object> f(y.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40341l;
    }

    public static final l1.i<r2.l, Object> g(l.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40339j;
    }

    public static final l1.i<s1.f, Object> h(f.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40345p;
    }

    public static final l1.i<t1.a0, Object> i(a0.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40343n;
    }

    public static final l1.i<a1, Object> j(a1.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40342m;
    }

    public static final l1.i<t2.e, Object> k(e.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40347r;
    }

    public static final l1.i<t2.f, Object> l(f.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40346q;
    }

    public static final l1.i<w2.a, Object> m(a.C1261a c1261a) {
        kotlin.jvm.internal.s.g(c1261a, "<this>");
        return f40340k;
    }

    public static final l1.i<w2.e, Object> n(e.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40336g;
    }

    public static final l1.i<w2.g, Object> o(g.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40337h;
    }

    public static final l1.i<w2.i, Object> p(i.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40338i;
    }

    public static final l1.i<x2.r, Object> q(r.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f40344o;
    }

    public static final l1.i<n2.s, Object> r() {
        return f40335f;
    }

    public static final <T> T s(T t11) {
        return t11;
    }

    public static final <T extends l1.i<Original, Saveable>, Original, Saveable> Object t(Original original, T saver, l1.k scope) {
        Object a11;
        kotlin.jvm.internal.s.g(saver, "saver");
        kotlin.jvm.internal.s.g(scope, "scope");
        return (original == null || (a11 = saver.a(scope, original)) == null) ? Boolean.FALSE : a11;
    }
}