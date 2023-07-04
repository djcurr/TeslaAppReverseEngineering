package l2;

import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import n2.y;
import vz.b0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f36493a = {m0.f(new z(t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.f(new z(t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), m0.f(new z(t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.f(new z(t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.f(new z(t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), m0.f(new z(t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), m0.f(new z(t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), m0.f(new z(t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.f(new z(t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.f(new z(t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), m0.f(new z(t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), m0.f(new z(t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.f(new z(t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), m0.f(new z(t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), m0.f(new z(t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), m0.f(new z(t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), m0.f(new z(t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* renamed from: b  reason: collision with root package name */
    private static final u f36494b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f36495c;

    /* renamed from: d  reason: collision with root package name */
    private static final u f36496d;

    /* renamed from: e  reason: collision with root package name */
    private static final u f36497e;

    /* renamed from: f  reason: collision with root package name */
    private static final u f36498f;

    /* renamed from: g  reason: collision with root package name */
    private static final u f36499g;

    /* renamed from: h  reason: collision with root package name */
    private static final u f36500h;

    /* renamed from: i  reason: collision with root package name */
    private static final u f36501i;

    /* renamed from: j  reason: collision with root package name */
    private static final u f36502j;

    /* renamed from: k  reason: collision with root package name */
    private static final u f36503k;

    /* renamed from: l  reason: collision with root package name */
    private static final u f36504l;

    /* renamed from: m  reason: collision with root package name */
    private static final u f36505m;

    /* renamed from: n  reason: collision with root package name */
    private static final u f36506n;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.jvm.internal.u implements h00.p<l2.a<T>, l2.a<T>, l2.a<T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36507a = new a();

        a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [vz.g] */
        /* JADX WARN: Type inference failed for: r1v3, types: [vz.g] */
        /* JADX WARN: Type inference failed for: r1v4, types: [vz.g] */
        @Override // h00.p
        /* renamed from: a */
        public final l2.a<T> invoke(l2.a<T> aVar, l2.a<T> childValue) {
            kotlin.jvm.internal.s.g(childValue, "childValue");
            T t11 = (T) false;
            String b11 = aVar == null ? null : aVar.b();
            if (b11 == null) {
                b11 = childValue.b();
            }
            if (aVar != null) {
                t11 = aVar.a();
            }
            if (t11 == 0) {
                t11 = childValue.a();
            }
            return new l2.a<>(b11, t11);
        }
    }

    static {
        s sVar = s.f36459a;
        f36494b = sVar.v();
        f36495c = sVar.r();
        sVar.p();
        sVar.o();
        f36496d = sVar.g();
        f36497e = sVar.i();
        f36498f = sVar.A();
        f36499g = sVar.s();
        f36500h = sVar.w();
        f36501i = sVar.e();
        f36502j = sVar.y();
        f36503k = sVar.j();
        f36504l = sVar.u();
        f36505m = sVar.a();
        sVar.b();
        f36506n = sVar.z();
        j.f36419a.c();
    }

    public static final void A(v vVar, String str, h00.p<? super Float, ? super Float, Boolean> pVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.k(), new l2.a(str, pVar));
    }

    public static /* synthetic */ void B(v vVar, String str, h00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        A(vVar, str, pVar);
    }

    public static final void C(v vVar, String str, h00.l<? super Integer, Boolean> action) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(action, "action");
        vVar.b(j.f36419a.l(), new l2.a(str, action));
    }

    public static /* synthetic */ void D(v vVar, String str, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        C(vVar, str, lVar);
    }

    public static final void E(v vVar, b bVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(bVar, "<set-?>");
        f36505m.c(vVar, f36493a[13], bVar);
    }

    public static final void F(v vVar, String value) {
        List d11;
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        u<List<String>> c11 = s.f36459a.c();
        d11 = wz.v.d(value);
        vVar.b(c11, d11);
    }

    public static final void G(v vVar, n2.a aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        f36501i.c(vVar, f36493a[9], aVar);
    }

    public static final void H(v vVar, boolean z11) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        f36496d.c(vVar, f36493a[4], Boolean.valueOf(z11));
    }

    public static final void I(v vVar, i iVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(iVar, "<set-?>");
        f36497e.c(vVar, f36493a[5], iVar);
    }

    public static final void J(v imeAction, int i11) {
        kotlin.jvm.internal.s.g(imeAction, "$this$imeAction");
        f36503k.c(imeAction, f36493a[11], s2.l.i(i11));
    }

    public static final void K(v vVar, g gVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(gVar, "<set-?>");
        f36495c.c(vVar, f36493a[1], gVar);
    }

    public static final void L(v role, int i11) {
        kotlin.jvm.internal.s.g(role, "$this$role");
        f36499g.c(role, f36493a[7], h.g(i11));
    }

    public static final void M(v vVar, boolean z11) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        f36504l.c(vVar, f36493a[12], Boolean.valueOf(z11));
    }

    public static final void N(v vVar, String str, h00.q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.n(), new l2.a(str, qVar));
    }

    public static /* synthetic */ void O(v vVar, String str, h00.q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        N(vVar, str, qVar);
    }

    public static final void P(v vVar, String str) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(str, "<set-?>");
        f36494b.c(vVar, f36493a[0], str);
    }

    public static final void Q(v vVar, String str) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(str, "<set-?>");
        f36500h.c(vVar, f36493a[8], str);
    }

    public static final void R(v vVar, String str, h00.l<? super n2.a, Boolean> lVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.o(), new l2.a(str, lVar));
    }

    public static final void S(v vVar, n2.a value) {
        List d11;
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        u<List<n2.a>> x11 = s.f36459a.x();
        d11 = wz.v.d(value);
        vVar.b(x11, d11);
    }

    public static /* synthetic */ void T(v vVar, String str, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        R(vVar, str, lVar);
    }

    public static final void U(v textSelectionRange, long j11) {
        kotlin.jvm.internal.s.g(textSelectionRange, "$this$textSelectionRange");
        f36502j.c(textSelectionRange, f36493a[10], y.b(j11));
    }

    public static final void V(v vVar, m2.a aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        f36506n.c(vVar, f36493a[15], aVar);
    }

    public static final void W(v vVar, i iVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(iVar, "<set-?>");
        f36498f.c(vVar, f36493a[6], iVar);
    }

    public static final <T extends vz.g<? extends Boolean>> u<l2.a<T>> a(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        return new u<>(name, a.f36507a);
    }

    public static final void b(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.a(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void c(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        b(vVar, str, aVar);
    }

    public static final void d(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.b(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void e(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        d(vVar, str, aVar);
    }

    public static final void f(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.d(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void g(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        f(vVar, str, aVar);
    }

    public static final void h(v vVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(s.f36459a.m(), b0.f54756a);
    }

    public static final void i(v vVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(s.f36459a.d(), b0.f54756a);
    }

    public static final void j(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.e(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void k(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        j(vVar, str, aVar);
    }

    public static final void l(v vVar, String description) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(description, "description");
        vVar.b(s.f36459a.f(), description);
    }

    public static final void m(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.f(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void n(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        m(vVar, str, aVar);
    }

    public static final void o(v vVar, String str, h00.l<? super List<n2.w>, Boolean> lVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.g(), new l2.a(str, lVar));
    }

    public static /* synthetic */ void p(v vVar, String str, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        o(vVar, str, lVar);
    }

    public static final void q(v vVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(s.f36459a.h(), b0.f54756a);
    }

    public static final void r(v vVar, h00.l<Object, Integer> mapping) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        kotlin.jvm.internal.s.g(mapping, "mapping");
        vVar.b(s.f36459a.k(), mapping);
    }

    public static final void s(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.h(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void t(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        s(vVar, str, aVar);
    }

    public static final void u(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.i(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void v(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        u(vVar, str, aVar);
    }

    public static final void w(v vVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(s.f36459a.q(), b0.f54756a);
    }

    public static final void x(v vVar, String str, h00.a<Boolean> aVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(j.f36419a.j(), new l2.a(str, aVar));
    }

    public static /* synthetic */ void y(v vVar, String str, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        x(vVar, str, aVar);
    }

    public static final void z(v vVar) {
        kotlin.jvm.internal.s.g(vVar, "<this>");
        vVar.b(s.f36459a.n(), b0.f54756a);
    }
}