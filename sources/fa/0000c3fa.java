package z2;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60047a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] f60048b = {new h00.q[]{f.f60055a, g.f60056a}, new h00.q[]{h.f60057a, i.f60058a}};

    /* renamed from: c  reason: collision with root package name */
    private static final Function2<ConstraintReference, Object, ConstraintReference>[][] f60049c = {new h00.p[]{b.f60051a, c.f60052a}, new h00.p[]{d.f60053a, e.f60054a}};

    /* renamed from: z2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1371a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60050a;

        static {
            int[] iArr = new int[x2.q.values().length];
            iArr[x2.q.Ltr.ordinal()] = 1;
            iArr[x2.q.Rtl.ordinal()] = 2;
            f60050a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<d3.a, Object, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60051a = new b();

        b() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            arrayOf.E(null);
            arrayOf.f(null);
            d3.a F = arrayOf.F(other);
            kotlin.jvm.internal.s.f(F, "topToTop(other)");
            return F;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.p<d3.a, Object, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60052a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            arrayOf.F(null);
            arrayOf.f(null);
            d3.a E = arrayOf.E(other);
            kotlin.jvm.internal.s.f(E, "topToBottom(other)");
            return E;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.p<d3.a, Object, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60053a = new d();

        d() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            arrayOf.g(null);
            arrayOf.f(null);
            d3.a h11 = arrayOf.h(other);
            kotlin.jvm.internal.s.f(h11, "bottomToTop(other)");
            return h11;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.p<d3.a, Object, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f60054a = new e();

        e() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            arrayOf.h(null);
            arrayOf.f(null);
            d3.a g11 = arrayOf.g(other);
            kotlin.jvm.internal.s.f(g11, "bottomToBottom(other)");
            return g11;
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.q<d3.a, Object, x2.q, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f60055a = new f();

        f() {
            super(3);
        }

        @Override // h00.q
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            a.f60047a.c(arrayOf, layoutDirection);
            d3.a q11 = arrayOf.q(other);
            kotlin.jvm.internal.s.f(q11, "leftToLeft(other)");
            return q11;
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.q<d3.a, Object, x2.q, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f60056a = new g();

        g() {
            super(3);
        }

        @Override // h00.q
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            a.f60047a.c(arrayOf, layoutDirection);
            d3.a r11 = arrayOf.r(other);
            kotlin.jvm.internal.s.f(r11, "leftToRight(other)");
            return r11;
        }
    }

    /* loaded from: classes.dex */
    static final class h extends kotlin.jvm.internal.u implements h00.q<d3.a, Object, x2.q, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f60057a = new h();

        h() {
            super(3);
        }

        @Override // h00.q
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            a.f60047a.d(arrayOf, layoutDirection);
            d3.a w11 = arrayOf.w(other);
            kotlin.jvm.internal.s.f(w11, "rightToLeft(other)");
            return w11;
        }
    }

    /* loaded from: classes.dex */
    static final class i extends kotlin.jvm.internal.u implements h00.q<d3.a, Object, x2.q, d3.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f60058a = new i();

        i() {
            super(3);
        }

        @Override // h00.q
        /* renamed from: a */
        public final d3.a invoke(d3.a arrayOf, Object other, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(arrayOf, "$this$arrayOf");
            kotlin.jvm.internal.s.g(other, "other");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            a.f60047a.d(arrayOf, layoutDirection);
            d3.a x11 = arrayOf.x(other);
            kotlin.jvm.internal.s.f(x11, "rightToRight(other)");
            return x11;
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(d3.a aVar, x2.q qVar) {
        aVar.q(null);
        aVar.r(null);
        int i11 = C1371a.f60050a[qVar.ordinal()];
        if (i11 == 1) {
            aVar.D(null);
            aVar.C(null);
        } else if (i11 != 2) {
        } else {
            aVar.l(null);
            aVar.k(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(d3.a aVar, x2.q qVar) {
        aVar.w(null);
        aVar.x(null);
        int i11 = C1371a.f60050a[qVar.ordinal()];
        if (i11 == 1) {
            aVar.l(null);
            aVar.k(null);
        } else if (i11 != 2) {
        } else {
            aVar.D(null);
            aVar.C(null);
        }
    }

    public final Function2<ConstraintReference, Object, ConstraintReference>[][] e() {
        return f60049c;
    }

    public final Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] f() {
        return f60048b;
    }

    public final int g(int i11, x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        return i11 >= 0 ? i11 : layoutDirection == x2.q.Ltr ? i11 + 2 : (-i11) - 1;
    }
}