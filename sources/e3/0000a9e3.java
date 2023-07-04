package p4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.p;
import androidx.lifecycle.t0;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j0;
import kotlinx.coroutines.flow.h0;
import p4.b0;
import p4.i;
import p4.m;
import p4.o;
import p4.p;

/* loaded from: classes.dex */
public class l {
    private static boolean G;
    private final Map<p4.i, Boolean> A;
    private int B;
    private final List<p4.i> C;
    private final vz.k D;
    private final kotlinx.coroutines.flow.t<p4.i> E;
    private final kotlinx.coroutines.flow.e<p4.i> F;

    /* renamed from: a */
    private final Context f46026a;

    /* renamed from: b */
    private Activity f46027b;

    /* renamed from: c */
    private v f46028c;

    /* renamed from: d */
    private r f46029d;

    /* renamed from: e */
    private Bundle f46030e;

    /* renamed from: f */
    private Parcelable[] f46031f;

    /* renamed from: g */
    private boolean f46032g;

    /* renamed from: h */
    private final wz.k<p4.i> f46033h;

    /* renamed from: i */
    private final kotlinx.coroutines.flow.u<List<p4.i>> f46034i;

    /* renamed from: j */
    private final h0<List<p4.i>> f46035j;

    /* renamed from: k */
    private final Map<p4.i, p4.i> f46036k;

    /* renamed from: l */
    private final Map<p4.i, AtomicInteger> f46037l;

    /* renamed from: m */
    private final Map<Integer, String> f46038m;

    /* renamed from: n */
    private final Map<String, wz.k<p4.j>> f46039n;

    /* renamed from: o */
    private androidx.lifecycle.v f46040o;

    /* renamed from: p */
    private OnBackPressedDispatcher f46041p;

    /* renamed from: q */
    private p4.m f46042q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<c> f46043r;

    /* renamed from: s */
    private p.c f46044s;

    /* renamed from: t */
    private final androidx.lifecycle.u f46045t;

    /* renamed from: u */
    private final androidx.activity.e f46046u;

    /* renamed from: v */
    private boolean f46047v;

    /* renamed from: w */
    private c0 f46048w;

    /* renamed from: x */
    private final Map<b0<? extends p>, b> f46049x;

    /* renamed from: y */
    private h00.l<? super p4.i, vz.b0> f46050y;

    /* renamed from: z */
    private h00.l<? super p4.i, vz.b0> f46051z;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class b extends d0 {

        /* renamed from: g */
        private final b0<? extends p> f46052g;

        /* renamed from: h */
        final /* synthetic */ l f46053h;

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: b */
            final /* synthetic */ p4.i f46055b;

            /* renamed from: c */
            final /* synthetic */ boolean f46056c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p4.i iVar, boolean z11) {
                super(0);
                b.this = r1;
                this.f46055b = iVar;
                this.f46056c = z11;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                b.super.g(this.f46055b, this.f46056c);
            }
        }

        public b(l this$0, b0<? extends p> navigator) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(navigator, "navigator");
            this.f46053h = this$0;
            this.f46052g = navigator;
        }

        @Override // p4.d0
        public p4.i a(p destination, Bundle bundle) {
            kotlin.jvm.internal.s.g(destination, "destination");
            return i.a.b(p4.i.f46004n, this.f46053h.x(), destination, bundle, this.f46053h.C(), this.f46053h.f46042q, null, null, 96, null);
        }

        @Override // p4.d0
        public void e(p4.i entry) {
            p4.m mVar;
            kotlin.jvm.internal.s.g(entry, "entry");
            boolean c11 = kotlin.jvm.internal.s.c(this.f46053h.A.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f46053h.A.remove(entry);
            if (!this.f46053h.v().contains(entry)) {
                this.f46053h.i0(entry);
                if (entry.getLifecycle().b().isAtLeast(p.c.CREATED)) {
                    entry.n(p.c.DESTROYED);
                }
                wz.k<p4.i> v11 = this.f46053h.v();
                boolean z11 = true;
                if (!(v11 instanceof Collection) || !v11.isEmpty()) {
                    Iterator<p4.i> it2 = v11.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (kotlin.jvm.internal.s.c(it2.next().g(), entry.g())) {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (z11 && !c11 && (mVar = this.f46053h.f46042q) != null) {
                    mVar.h(entry.g());
                }
                this.f46053h.j0();
                this.f46053h.f46034i.b(this.f46053h.Z());
            } else if (d()) {
            } else {
                this.f46053h.j0();
                this.f46053h.f46034i.b(this.f46053h.Z());
            }
        }

        @Override // p4.d0
        public void g(p4.i popUpTo, boolean z11) {
            kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
            b0 e11 = this.f46053h.f46048w.e(popUpTo.f().n());
            if (kotlin.jvm.internal.s.c(e11, this.f46052g)) {
                h00.l lVar = this.f46053h.f46051z;
                if (lVar != null) {
                    lVar.invoke(popUpTo);
                    super.g(popUpTo, z11);
                    return;
                }
                this.f46053h.T(popUpTo, new a(popUpTo, z11));
                return;
            }
            Object obj = this.f46053h.f46049x.get(e11);
            kotlin.jvm.internal.s.e(obj);
            ((b) obj).g(popUpTo, z11);
        }

        @Override // p4.d0
        public void h(p4.i popUpTo, boolean z11) {
            kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
            super.h(popUpTo, z11);
            this.f46053h.A.put(popUpTo, Boolean.valueOf(z11));
        }

        @Override // p4.d0
        public void i(p4.i backStackEntry) {
            kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
            b0 e11 = this.f46053h.f46048w.e(backStackEntry.f().n());
            if (kotlin.jvm.internal.s.c(e11, this.f46052g)) {
                h00.l lVar = this.f46053h.f46050y;
                if (lVar != null) {
                    lVar.invoke(backStackEntry);
                    m(backStackEntry);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.f() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f46053h.f46049x.get(e11);
            if (obj != null) {
                ((b) obj).i(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.f().n() + " should already be created").toString());
        }

        public final void m(p4.i backStackEntry) {
            kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
            super.i(backStackEntry);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(l lVar, p pVar, Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Context, Context> {

        /* renamed from: a */
        public static final d f46057a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Context invoke(Context it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof ContextWrapper) {
                return ((ContextWrapper) it2).getBaseContext();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<x, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ p f46058a;

        /* renamed from: b */
        final /* synthetic */ l f46059b;

        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<p4.b, vz.b0> {

            /* renamed from: a */
            public static final a f46060a = new a();

            a() {
                super(1);
            }

            public final void a(p4.b anim) {
                kotlin.jvm.internal.s.g(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(p4.b bVar) {
                a(bVar);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<e0, vz.b0> {

            /* renamed from: a */
            public static final b f46061a = new b();

            b() {
                super(1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(e0 e0Var) {
                invoke2(e0Var);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke */
            public final void invoke2(e0 popUpTo) {
                kotlin.jvm.internal.s.g(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p pVar, l lVar) {
            super(1);
            this.f46058a = pVar;
            this.f46059b = lVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(x xVar) {
            invoke2(xVar);
            return vz.b0.f54756a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
            if (r0 != false) goto L14;
         */
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(p4.x r7) {
            /*
                r6 = this;
                java.lang.String r0 = "$this$navOptions"
                kotlin.jvm.internal.s.g(r7, r0)
                p4.l$e$a r0 = p4.l.e.a.f46060a
                r7.a(r0)
                p4.p r0 = r6.f46058a
                boolean r1 = r0 instanceof p4.r
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L42
                p4.p$a r1 = p4.p.f46114j
                u20.h r0 = r1.c(r0)
                p4.l r1 = r6.f46059b
                java.util.Iterator r0 = r0.iterator()
            L1e:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L3e
                java.lang.Object r4 = r0.next()
                p4.p r4 = (p4.p) r4
                p4.p r5 = r1.z()
                if (r5 != 0) goto L32
                r5 = 0
                goto L36
            L32:
                p4.r r5 = r5.o()
            L36:
                boolean r4 = kotlin.jvm.internal.s.c(r4, r5)
                if (r4 == 0) goto L1e
                r0 = r3
                goto L3f
            L3e:
                r0 = r2
            L3f:
                if (r0 == 0) goto L42
                goto L43
            L42:
                r2 = r3
            L43:
                if (r2 == 0) goto L60
                boolean r0 = p4.l.e()
                if (r0 == 0) goto L60
                p4.r$a r0 = p4.r.f46137o
                p4.l r1 = r6.f46059b
                p4.r r1 = r1.B()
                p4.p r0 = r0.a(r1)
                int r0 = r0.m()
                p4.l$e$b r1 = p4.l.e.b.f46061a
                r7.g(r0, r1)
            L60:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.l.e.invoke2(p4.x):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<v> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            l.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final v invoke() {
            v vVar = l.this.f46028c;
            return vVar == null ? new v(l.this.x(), l.this.f46048w) : vVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<p4.i, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.h0 f46063a;

        /* renamed from: b */
        final /* synthetic */ l f46064b;

        /* renamed from: c */
        final /* synthetic */ p f46065c;

        /* renamed from: d */
        final /* synthetic */ Bundle f46066d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.h0 h0Var, l lVar, p pVar, Bundle bundle) {
            super(1);
            this.f46063a = h0Var;
            this.f46064b = lVar;
            this.f46065c = pVar;
            this.f46066d = bundle;
        }

        public final void a(p4.i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f46063a.f34902a = true;
            l.o(this.f46064b, this.f46065c, this.f46066d, it2, null, 8, null);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(p4.i iVar) {
            a(iVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends androidx.activity.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(false);
            l.this = r1;
        }

        @Override // androidx.activity.e
        public void handleOnBackPressed() {
            l.this.Q();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<p4.i, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.h0 f46068a;

        /* renamed from: b */
        final /* synthetic */ kotlin.jvm.internal.h0 f46069b;

        /* renamed from: c */
        final /* synthetic */ l f46070c;

        /* renamed from: d */
        final /* synthetic */ boolean f46071d;

        /* renamed from: e */
        final /* synthetic */ wz.k<p4.j> f46072e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, l lVar, boolean z11, wz.k<p4.j> kVar) {
            super(1);
            this.f46068a = h0Var;
            this.f46069b = h0Var2;
            this.f46070c = lVar;
            this.f46071d = z11;
            this.f46072e = kVar;
        }

        public final void a(p4.i entry) {
            kotlin.jvm.internal.s.g(entry, "entry");
            this.f46068a.f34902a = true;
            this.f46069b.f34902a = true;
            this.f46070c.X(entry, this.f46071d, this.f46072e);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(p4.i iVar) {
            a(iVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<p, p> {

        /* renamed from: a */
        public static final j f46073a = new j();

        j() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final p invoke(p destination) {
            kotlin.jvm.internal.s.g(destination, "destination");
            r o11 = destination.o();
            boolean z11 = false;
            if (o11 != null && o11.F() == destination.m()) {
                z11 = true;
            }
            if (z11) {
                return destination.o();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<p, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(1);
            l.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(p destination) {
            kotlin.jvm.internal.s.g(destination, "destination");
            return Boolean.valueOf(!l.this.f46038m.containsKey(Integer.valueOf(destination.m())));
        }
    }

    /* renamed from: p4.l$l */
    /* loaded from: classes.dex */
    public static final class C0980l extends kotlin.jvm.internal.u implements h00.l<p, p> {

        /* renamed from: a */
        public static final C0980l f46075a = new C0980l();

        C0980l() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final p invoke(p destination) {
            kotlin.jvm.internal.s.g(destination, "destination");
            r o11 = destination.o();
            boolean z11 = false;
            if (o11 != null && o11.F() == destination.m()) {
                z11 = true;
            }
            if (z11) {
                return destination.o();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.l<p, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m() {
            super(1);
            l.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(p destination) {
            kotlin.jvm.internal.s.g(destination, "destination");
            return Boolean.valueOf(!l.this.f46038m.containsKey(Integer.valueOf(destination.m())));
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f46077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(1);
            this.f46077a = str;
        }

        @Override // h00.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(kotlin.jvm.internal.s.c(str, this.f46077a));
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.l<p4.i, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.h0 f46078a;

        /* renamed from: b */
        final /* synthetic */ List<p4.i> f46079b;

        /* renamed from: c */
        final /* synthetic */ j0 f46080c;

        /* renamed from: d */
        final /* synthetic */ l f46081d;

        /* renamed from: e */
        final /* synthetic */ Bundle f46082e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(kotlin.jvm.internal.h0 h0Var, List<p4.i> list, j0 j0Var, l lVar, Bundle bundle) {
            super(1);
            this.f46078a = h0Var;
            this.f46079b = list;
            this.f46080c = j0Var;
            this.f46081d = lVar;
            this.f46082e = bundle;
        }

        public final void a(p4.i entry) {
            List<p4.i> i11;
            kotlin.jvm.internal.s.g(entry, "entry");
            this.f46078a.f34902a = true;
            int indexOf = this.f46079b.indexOf(entry);
            if (indexOf != -1) {
                int i12 = indexOf + 1;
                i11 = this.f46079b.subList(this.f46080c.f34912a, i12);
                this.f46080c.f34912a = i12;
            } else {
                i11 = wz.w.i();
            }
            this.f46081d.n(entry.f(), this.f46082e, entry, i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(p4.i iVar) {
            a(iVar);
            return vz.b0.f54756a;
        }
    }

    static {
        new a(null);
        G = true;
    }

    public l(Context context) {
        u20.h k11;
        Object obj;
        List i11;
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        this.f46026a = context;
        k11 = u20.n.k(context, d.f46057a);
        Iterator it2 = k11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f46027b = (Activity) obj;
        this.f46033h = new wz.k<>();
        i11 = wz.w.i();
        kotlinx.coroutines.flow.u<List<p4.i>> a12 = kotlinx.coroutines.flow.j0.a(i11);
        this.f46034i = a12;
        this.f46035j = kotlinx.coroutines.flow.g.b(a12);
        this.f46036k = new LinkedHashMap();
        this.f46037l = new LinkedHashMap();
        this.f46038m = new LinkedHashMap();
        this.f46039n = new LinkedHashMap();
        this.f46043r = new CopyOnWriteArrayList<>();
        this.f46044s = p.c.INITIALIZED;
        this.f46045t = new androidx.lifecycle.s() { // from class: p4.k
            @Override // androidx.lifecycle.s
            public final void g(androidx.lifecycle.v vVar, p.b bVar) {
                l.a(l.this, vVar, bVar);
            }
        };
        this.f46046u = new h();
        this.f46047v = true;
        this.f46048w = new c0();
        this.f46049x = new LinkedHashMap();
        this.A = new LinkedHashMap();
        c0 c0Var = this.f46048w;
        c0Var.c(new t(c0Var));
        this.f46048w.c(new p4.a(this.f46026a));
        this.C = new ArrayList();
        a11 = vz.m.a(new f());
        this.D = a11;
        kotlinx.coroutines.flow.t<p4.i> b11 = kotlinx.coroutines.flow.a0.b(1, 0, kotlinx.coroutines.channels.a.DROP_OLDEST, 2, null);
        this.E = b11;
        this.F = kotlinx.coroutines.flow.g.a(b11);
    }

    private final int A() {
        wz.k<p4.i> v11 = v();
        int i11 = 0;
        if (!(v11 instanceof Collection) || !v11.isEmpty()) {
            for (p4.i iVar : v11) {
                if ((!(iVar.f() instanceof r)) && (i11 = i11 + 1) < 0) {
                    wz.w.r();
                }
            }
        }
        return i11;
    }

    private final List<p4.i> G(wz.k<p4.j> kVar) {
        ArrayList arrayList = new ArrayList();
        p4.i m11 = v().m();
        p f11 = m11 == null ? null : m11.f();
        if (f11 == null) {
            f11 = B();
        }
        if (kVar != null) {
            for (p4.j jVar : kVar) {
                p t11 = t(f11, jVar.a());
                if (t11 != null) {
                    arrayList.add(jVar.b(x(), t11, C(), this.f46042q));
                    f11 = t11;
                } else {
                    String b11 = p.f46114j.b(x(), jVar.a());
                    throw new IllegalStateException(("Restore State failed: destination " + b11 + " cannot be found from the current destination " + f11).toString());
                }
            }
        }
        return arrayList;
    }

    public static final void H(l this$0, androidx.lifecycle.v noName_0, p.b event) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(noName_0, "$noName_0");
        kotlin.jvm.internal.s.g(event, "event");
        p.c targetState = event.getTargetState();
        kotlin.jvm.internal.s.f(targetState, "event.targetState");
        this$0.f46044s = targetState;
        if (this$0.f46029d != null) {
            Iterator<p4.i> it2 = this$0.v().iterator();
            while (it2.hasNext()) {
                it2.next().k(event);
            }
        }
    }

    private final void I(p4.i iVar, p4.i iVar2) {
        this.f46036k.put(iVar, iVar2);
        if (this.f46037l.get(iVar2) == null) {
            this.f46037l.put(iVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f46037l.get(iVar2);
        kotlin.jvm.internal.s.e(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x011a A[LOOP:1: B:106:0x0114->B:108:0x011a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M(p4.p r21, android.os.Bundle r22, p4.w r23, p4.b0.a r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l.M(p4.p, android.os.Bundle, p4.w, p4.b0$a):void");
    }

    public static /* synthetic */ void N(l lVar, String str, w wVar, b0.a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i11 & 2) != 0) {
            wVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        lVar.K(str, wVar, aVar);
    }

    private final void O(b0<? extends p> b0Var, List<p4.i> list, w wVar, b0.a aVar, h00.l<? super p4.i, vz.b0> lVar) {
        this.f46050y = lVar;
        b0Var.e(list, wVar, aVar);
        this.f46050y = null;
    }

    private final void P(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f46030e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it2 = stringArrayList.iterator();
            while (it2.hasNext()) {
                String name = it2.next();
                c0 c0Var = this.f46048w;
                kotlin.jvm.internal.s.f(name, "name");
                b0 e11 = c0Var.e(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    e11.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f46031f;
        boolean z11 = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i11 = 0;
            while (i11 < length) {
                Parcelable parcelable = parcelableArr[i11];
                i11++;
                p4.j jVar = (p4.j) parcelable;
                p s11 = s(jVar.a());
                if (s11 != null) {
                    p4.i b11 = jVar.b(x(), s11, C(), this.f46042q);
                    b0<? extends p> e12 = this.f46048w.e(s11.n());
                    Map<b0<? extends p>, b> map = this.f46049x;
                    b bVar = map.get(e12);
                    if (bVar == null) {
                        bVar = new b(this, e12);
                        map.put(e12, bVar);
                    }
                    v().add(b11);
                    bVar.m(b11);
                    r o11 = b11.f().o();
                    if (o11 != null) {
                        I(b11, w(o11.m()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + p.f46114j.b(x(), jVar.a()) + " cannot be found from the current destination " + z());
                }
            }
            k0();
            this.f46031f = null;
        }
        Collection<b0<? extends p>> values = this.f46048w.f().values();
        ArrayList<b0<? extends p>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((b0) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (b0<? extends p> b0Var : arrayList) {
            Map<b0<? extends p>, b> map2 = this.f46049x;
            b bVar2 = map2.get(b0Var);
            if (bVar2 == null) {
                bVar2 = new b(this, b0Var);
                map2.put(b0Var, bVar2);
            }
            b0Var.f(bVar2);
        }
        if (this.f46029d != null && v().isEmpty()) {
            if (!this.f46032g && (activity = this.f46027b) != null) {
                kotlin.jvm.internal.s.e(activity);
                if (F(activity.getIntent())) {
                    z11 = true;
                }
            }
            if (z11) {
                return;
            }
            r rVar = this.f46029d;
            kotlin.jvm.internal.s.e(rVar);
            M(rVar, bundle, null, null);
            return;
        }
        q();
    }

    private final void U(b0<? extends p> b0Var, p4.i iVar, boolean z11, h00.l<? super p4.i, vz.b0> lVar) {
        this.f46051z = lVar;
        b0Var.j(iVar, z11);
        this.f46051z = null;
    }

    private final boolean V(int i11, boolean z11, boolean z12) {
        List A0;
        p pVar;
        u20.h k11;
        u20.h<p> G2;
        u20.h k12;
        u20.h<p> G3;
        if (v().isEmpty()) {
            return false;
        }
        ArrayList<b0<? extends p>> arrayList = new ArrayList();
        A0 = wz.e0.A0(v());
        Iterator it2 = A0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                pVar = null;
                break;
            }
            p f11 = ((p4.i) it2.next()).f();
            b0 e11 = this.f46048w.e(f11.n());
            if (z11 || f11.m() != i11) {
                arrayList.add(e11);
            }
            if (f11.m() == i11) {
                pVar = f11;
                break;
            }
        }
        if (pVar == null) {
            String b11 = p.f46114j.b(this.f46026a, i11);
            Log.i("NavController", "Ignoring popBackStack to destination " + b11 + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        wz.k<p4.j> kVar = new wz.k<>();
        for (b0<? extends p> b0Var : arrayList) {
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            U(b0Var, v().last(), z12, new i(h0Var2, h0Var, this, z12, kVar));
            if (!h0Var2.f34902a) {
                break;
            }
        }
        if (z12) {
            if (!z11) {
                k12 = u20.n.k(pVar, j.f46073a);
                G3 = u20.p.G(k12, new k());
                for (p pVar2 : G3) {
                    Map<Integer, String> map = this.f46038m;
                    Integer valueOf = Integer.valueOf(pVar2.m());
                    p4.j j11 = kVar.j();
                    map.put(valueOf, j11 == null ? null : j11.getId());
                }
            }
            if (!kVar.isEmpty()) {
                p4.j first = kVar.first();
                k11 = u20.n.k(s(first.a()), C0980l.f46075a);
                G2 = u20.p.G(k11, new m());
                for (p pVar3 : G2) {
                    this.f46038m.put(Integer.valueOf(pVar3.m()), first.getId());
                }
                this.f46039n.put(first.getId(), kVar);
            }
        }
        k0();
        return h0Var.f34902a;
    }

    static /* synthetic */ boolean W(l lVar, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            return lVar.V(i11, z11, z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    public final void X(p4.i iVar, boolean z11, wz.k<p4.j> kVar) {
        h0<Set<p4.i>> c11;
        Set<p4.i> value;
        p4.m mVar;
        p4.i last = v().last();
        if (kotlin.jvm.internal.s.c(last, iVar)) {
            v().removeLast();
            b bVar = this.f46049x.get(D().e(last.f().n()));
            boolean z12 = true;
            if (!((bVar == null || (c11 = bVar.c()) == null || (value = c11.getValue()) == null || !value.contains(last)) ? false : true) && !this.f46037l.containsKey(last)) {
                z12 = false;
            }
            p.c b11 = last.getLifecycle().b();
            p.c cVar = p.c.CREATED;
            if (b11.isAtLeast(cVar)) {
                if (z11) {
                    last.n(cVar);
                    kVar.addFirst(new p4.j(last));
                }
                if (!z12) {
                    last.n(p.c.DESTROYED);
                    i0(last);
                } else {
                    last.n(cVar);
                }
            }
            if (z11 || z12 || (mVar = this.f46042q) == null) {
                return;
            }
            mVar.h(last.g());
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + iVar.f() + ", which is not the top of the back stack (" + last.f() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void Y(l lVar, p4.i iVar, boolean z11, wz.k kVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            kVar = new wz.k();
        }
        lVar.X(iVar, z11, kVar);
    }

    public static /* synthetic */ void a(l lVar, androidx.lifecycle.v vVar, p.b bVar) {
        H(lVar, vVar, bVar);
    }

    private final boolean b0(int i11, Bundle bundle, w wVar, b0.a aVar) {
        List o11;
        p4.i iVar;
        p f11;
        if (this.f46038m.containsKey(Integer.valueOf(i11))) {
            String str = this.f46038m.get(Integer.valueOf(i11));
            wz.b0.D(this.f46038m.values(), new n(str));
            List<p4.i> G2 = G(this.f46039n.remove(str));
            ArrayList<List<p4.i>> arrayList = new ArrayList();
            ArrayList<p4.i> arrayList2 = new ArrayList();
            for (Object obj : G2) {
                if (!(((p4.i) obj).f() instanceof r)) {
                    arrayList2.add(obj);
                }
            }
            for (p4.i iVar2 : arrayList2) {
                List list = (List) wz.u.p0(arrayList);
                String str2 = null;
                if (list != null && (iVar = (p4.i) wz.u.n0(list)) != null && (f11 = iVar.f()) != null) {
                    str2 = f11.n();
                }
                if (kotlin.jvm.internal.s.c(str2, iVar2.f().n())) {
                    list.add(iVar2);
                } else {
                    o11 = wz.w.o(iVar2);
                    arrayList.add(o11);
                }
            }
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            for (List<p4.i> list2 : arrayList) {
                O(this.f46048w.e(((p4.i) wz.u.b0(list2)).f().n()), list2, wVar, aVar, new o(h0Var, G2, new j0(), this, bundle));
            }
            return h0Var.f34902a;
        }
        return false;
    }

    private final void k0() {
        boolean z11 = true;
        this.f46046u.setEnabled((!this.f46047v || A() <= 1) ? false : false);
    }

    public final void n(p pVar, Bundle bundle, p4.i iVar, List<p4.i> list) {
        wz.k<p4.i> kVar;
        p pVar2;
        List<p4.i> list2;
        p4.i iVar2;
        Bundle bundle2;
        List<p4.i> z02;
        p4.i iVar3;
        r rVar;
        p4.i iVar4;
        List<p4.i> list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        p4.i iVar5 = iVar;
        List<p4.i> list4 = list;
        p f11 = iVar.f();
        if (!(f11 instanceof p4.c)) {
            while (!v().isEmpty() && (v().last().f() instanceof p4.c) && W(this, v().last().f().m(), true, false, 4, null)) {
            }
        }
        wz.k kVar2 = new wz.k();
        p4.i iVar6 = null;
        if (pVar instanceof r) {
            p pVar3 = f11;
            while (true) {
                kotlin.jvm.internal.s.e(pVar3);
                r o11 = pVar3.o();
                if (o11 != null) {
                    ListIterator<p4.i> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iVar4 = null;
                            break;
                        }
                        iVar4 = listIterator.previous();
                        if (kotlin.jvm.internal.s.c(iVar4.f(), o11)) {
                            break;
                        }
                    }
                    p4.i iVar7 = iVar4;
                    if (iVar7 == null) {
                        pVar2 = f11;
                        list3 = list4;
                        bundle3 = bundle4;
                        iVar2 = iVar5;
                        iVar7 = i.a.b(p4.i.f46004n, this.f46026a, o11, bundle, C(), this.f46042q, null, null, 96, null);
                    } else {
                        pVar2 = f11;
                        list3 = list4;
                        iVar2 = iVar5;
                        bundle3 = bundle4;
                    }
                    kVar2.addFirst(iVar7);
                    if ((!v().isEmpty()) && v().last().f() == o11) {
                        list2 = list3;
                        bundle2 = bundle3;
                        rVar = o11;
                        kVar = kVar2;
                        Y(this, v().last(), false, null, 6, null);
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        rVar = o11;
                        kVar = kVar2;
                    }
                } else {
                    rVar = o11;
                    kVar = kVar2;
                    pVar2 = f11;
                    list2 = list4;
                    iVar2 = iVar5;
                    bundle2 = bundle4;
                }
                if (rVar == null || rVar == pVar) {
                    break;
                }
                iVar5 = iVar2;
                pVar3 = rVar;
                kVar2 = kVar;
                bundle4 = bundle2;
                list4 = list2;
                f11 = pVar2;
            }
        } else {
            kVar = kVar2;
            pVar2 = f11;
            list2 = list4;
            iVar2 = iVar5;
            bundle2 = bundle4;
        }
        r f12 = kVar.isEmpty() ? pVar2 : ((p4.i) kVar.first()).f();
        while (f12 != null && s(f12.m()) == null) {
            f12 = f12.o();
            if (f12 != null) {
                ListIterator<p4.i> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        iVar3 = null;
                        break;
                    }
                    iVar3 = listIterator2.previous();
                    if (kotlin.jvm.internal.s.c(iVar3.f(), f12)) {
                        break;
                    }
                }
                p4.i iVar8 = iVar3;
                if (iVar8 == null) {
                    iVar8 = i.a.b(p4.i.f46004n, this.f46026a, f12, f12.f(bundle2), C(), this.f46042q, null, null, 96, null);
                }
                kVar.addFirst(iVar8);
            }
        }
        if (!kVar.isEmpty()) {
            pVar2 = ((p4.i) kVar.last()).f();
        }
        while (!v().isEmpty() && (v().last().f() instanceof r) && ((r) v().last().f()).A(pVar2.m(), false) == null) {
            Y(this, v().last(), false, null, 6, null);
        }
        p4.i j11 = v().j();
        if (j11 == null) {
            j11 = (p4.i) kVar.j();
        }
        if (!kotlin.jvm.internal.s.c(j11 == null ? null : j11.f(), this.f46029d)) {
            ListIterator<p4.i> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                p4.i previous = listIterator3.previous();
                p f13 = previous.f();
                r rVar2 = this.f46029d;
                kotlin.jvm.internal.s.e(rVar2);
                if (kotlin.jvm.internal.s.c(f13, rVar2)) {
                    iVar6 = previous;
                    break;
                }
            }
            p4.i iVar9 = iVar6;
            if (iVar9 == null) {
                i.a aVar = p4.i.f46004n;
                Context context = this.f46026a;
                r rVar3 = this.f46029d;
                kotlin.jvm.internal.s.e(rVar3);
                r rVar4 = this.f46029d;
                kotlin.jvm.internal.s.e(rVar4);
                iVar9 = i.a.b(aVar, context, rVar3, rVar4.f(bundle2), C(), this.f46042q, null, null, 96, null);
            }
            kVar.addFirst(iVar9);
        }
        for (p4.i iVar10 : kVar) {
            b bVar = this.f46049x.get(this.f46048w.e(iVar10.f().n()));
            if (bVar != null) {
                bVar.m(iVar10);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + pVar.n() + " should already be created").toString());
            }
        }
        v().addAll(kVar);
        v().add(iVar2);
        z02 = wz.e0.z0(kVar, iVar2);
        for (p4.i iVar11 : z02) {
            r o12 = iVar11.f().o();
            if (o12 != null) {
                I(iVar11, w(o12.m()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void o(l lVar, p pVar, Bundle bundle, p4.i iVar, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i11 & 8) != 0) {
            list = wz.w.i();
        }
        lVar.n(pVar, bundle, iVar, list);
    }

    private final boolean p(int i11) {
        for (b bVar : this.f46049x.values()) {
            bVar.k(true);
        }
        boolean b02 = b0(i11, null, null, null);
        for (b bVar2 : this.f46049x.values()) {
            bVar2.k(false);
        }
        return b02 && V(i11, true, false);
    }

    private final boolean q() {
        List<p4.i> Q0;
        while (!v().isEmpty() && (v().last().f() instanceof r)) {
            Y(this, v().last(), false, null, 6, null);
        }
        p4.i m11 = v().m();
        if (m11 != null) {
            this.C.add(m11);
        }
        this.B++;
        j0();
        int i11 = this.B - 1;
        this.B = i11;
        if (i11 == 0) {
            Q0 = wz.e0.Q0(this.C);
            this.C.clear();
            for (p4.i iVar : Q0) {
                Iterator<c> it2 = this.f46043r.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, iVar.f(), iVar.d());
                }
                this.E.b(iVar);
            }
            this.f46034i.b(Z());
        }
        return m11 != null;
    }

    private final p t(p pVar, int i11) {
        r o11;
        if (pVar.m() == i11) {
            return pVar;
        }
        if (pVar instanceof r) {
            o11 = (r) pVar;
        } else {
            o11 = pVar.o();
            kotlin.jvm.internal.s.e(o11);
        }
        return o11.z(i11);
    }

    private final String u(int[] iArr) {
        r rVar = this.f46029d;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            p pVar = null;
            if (i11 >= length) {
                return null;
            }
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            if (i11 == 0) {
                r rVar2 = this.f46029d;
                kotlin.jvm.internal.s.e(rVar2);
                if (rVar2.m() == i13) {
                    pVar = this.f46029d;
                }
            } else {
                kotlin.jvm.internal.s.e(rVar);
                pVar = rVar.z(i13);
            }
            if (pVar == null) {
                return p.f46114j.b(this.f46026a, i13);
            }
            if (i11 != iArr.length - 1 && (pVar instanceof r)) {
                rVar = (r) pVar;
                while (true) {
                    kotlin.jvm.internal.s.e(rVar);
                    if (rVar.z(rVar.F()) instanceof r) {
                        rVar = (r) rVar.z(rVar.F());
                    }
                }
            }
            i11 = i12;
        }
    }

    public r B() {
        r rVar = this.f46029d;
        if (rVar != null) {
            Objects.requireNonNull(rVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return rVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final p.c C() {
        if (this.f46040o == null) {
            return p.c.CREATED;
        }
        return this.f46044s;
    }

    public c0 D() {
        return this.f46048w;
    }

    public p4.i E() {
        List A0;
        u20.h c11;
        Object obj;
        A0 = wz.e0.A0(v());
        Iterator it2 = A0.iterator();
        if (it2.hasNext()) {
            it2.next();
        }
        c11 = u20.n.c(it2);
        Iterator it3 = c11.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (!(((p4.i) obj).f() instanceof r)) {
                break;
            }
        }
        return (p4.i) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x003e, code lost:
        if ((r2.length == 0) != false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F(android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l.F(android.content.Intent):boolean");
    }

    public final void J(String route, h00.l<? super x, vz.b0> builder) {
        kotlin.jvm.internal.s.g(route, "route");
        kotlin.jvm.internal.s.g(builder, "builder");
        N(this, route, y.a(builder), null, 4, null);
    }

    public final void K(String route, w wVar, b0.a aVar) {
        kotlin.jvm.internal.s.g(route, "route");
        o.a.C0982a c0982a = o.a.f46110d;
        Uri parse = Uri.parse(p.f46114j.a(route));
        kotlin.jvm.internal.s.d(parse, "Uri.parse(this)");
        L(c0982a.a(parse).a(), wVar, aVar);
    }

    public void L(p4.o request, w wVar, b0.a aVar) {
        kotlin.jvm.internal.s.g(request, "request");
        r rVar = this.f46029d;
        kotlin.jvm.internal.s.e(rVar);
        p.b q11 = rVar.q(request);
        if (q11 != null) {
            Bundle f11 = q11.b().f(q11.c());
            if (f11 == null) {
                f11 = new Bundle();
            }
            p b11 = q11.b();
            Intent intent = new Intent();
            intent.setDataAndType(request.c(), request.b());
            intent.setAction(request.a());
            f11.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            M(b11, f11, wVar, aVar);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f46029d);
    }

    public boolean Q() {
        if (v().isEmpty()) {
            return false;
        }
        p z11 = z();
        kotlin.jvm.internal.s.e(z11);
        return R(z11.m(), true);
    }

    public boolean R(int i11, boolean z11) {
        return S(i11, z11, false);
    }

    public boolean S(int i11, boolean z11, boolean z12) {
        return V(i11, z11, z12) && q();
    }

    public final void T(p4.i popUpTo, h00.a<vz.b0> onComplete) {
        kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
        kotlin.jvm.internal.s.g(onComplete, "onComplete");
        int indexOf = v().indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i11 = indexOf + 1;
        if (i11 != v().size()) {
            V(v().get(i11).f().m(), true, false);
        }
        Y(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        k0();
        q();
    }

    public final List<p4.i> Z() {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f46049x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : bVar.c().getValue()) {
                p4.i iVar = (p4.i) obj;
                if ((arrayList.contains(iVar) || iVar.getLifecycle().b().isAtLeast(p.c.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            wz.b0.z(arrayList, arrayList2);
        }
        wz.k<p4.i> v11 = v();
        ArrayList arrayList3 = new ArrayList();
        for (p4.i iVar2 : v11) {
            p4.i iVar3 = iVar2;
            if (!arrayList.contains(iVar3) && iVar3.getLifecycle().b().isAtLeast(p.c.STARTED)) {
                arrayList3.add(iVar2);
            }
        }
        wz.b0.z(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((p4.i) obj2).f() instanceof r)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void a0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f46026a.getClassLoader());
        this.f46030e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f46031f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f46039n.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = intArray[i11];
                i11++;
                this.f46038m.put(Integer.valueOf(i13), stringArrayList.get(i12));
                i12++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(kotlin.jvm.internal.s.p("android-support-nav:controller:backStackStates:", id2));
                if (parcelableArray != null) {
                    Map<String, wz.k<p4.j>> map = this.f46039n;
                    kotlin.jvm.internal.s.f(id2, "id");
                    wz.k<p4.j> kVar = new wz.k<>(parcelableArray.length);
                    Iterator a11 = kotlin.jvm.internal.c.a(parcelableArray);
                    while (a11.hasNext()) {
                        Parcelable parcelable = (Parcelable) a11.next();
                        Objects.requireNonNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        kVar.add((p4.j) parcelable);
                    }
                    vz.b0 b0Var = vz.b0.f54756a;
                    map.put(id2, kVar);
                }
            }
        }
        this.f46032g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle c0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, b0<? extends p>> entry : this.f46048w.f().entrySet()) {
            String key = entry.getKey();
            Bundle i11 = entry.getValue().i();
            if (i11 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i11);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!v().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[v().size()];
            Iterator<p4.i> it2 = v().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                parcelableArr[i12] = new p4.j(it2.next());
                i12++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f46038m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f46038m.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i13 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f46038m.entrySet()) {
                iArr[i13] = entry2.getKey().intValue();
                arrayList2.add(entry2.getValue());
                i13++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f46039n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, wz.k<p4.j>> entry3 : this.f46039n.entrySet()) {
                String key2 = entry3.getKey();
                wz.k<p4.j> value = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value.size()];
                int i14 = 0;
                for (p4.j jVar : value) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        wz.w.s();
                    }
                    parcelableArr2[i14] = jVar;
                    i14 = i15;
                }
                bundle.putParcelableArray(kotlin.jvm.internal.s.p("android-support-nav:controller:backStackStates:", key2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f46032g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f46032g);
        }
        return bundle;
    }

    public void d0(r graph) {
        kotlin.jvm.internal.s.g(graph, "graph");
        e0(graph, null);
    }

    public void e0(r graph, Bundle bundle) {
        kotlin.jvm.internal.s.g(graph, "graph");
        if (!kotlin.jvm.internal.s.c(this.f46029d, graph)) {
            r rVar = this.f46029d;
            if (rVar != null) {
                for (Integer id2 : new ArrayList(this.f46038m.keySet())) {
                    kotlin.jvm.internal.s.f(id2, "id");
                    p(id2.intValue());
                }
                W(this, rVar.m(), true, false, 4, null);
            }
            this.f46029d = graph;
            P(bundle);
            return;
        }
        int p11 = graph.D().p();
        int i11 = 0;
        while (i11 < p11) {
            int i12 = i11 + 1;
            p newDestination = graph.D().q(i11);
            r rVar2 = this.f46029d;
            kotlin.jvm.internal.s.e(rVar2);
            rVar2.D().o(i11, newDestination);
            wz.k<p4.i> v11 = v();
            ArrayList<p4.i> arrayList = new ArrayList();
            for (p4.i iVar : v11) {
                if (newDestination != null && iVar.f().m() == newDestination.m()) {
                    arrayList.add(iVar);
                }
            }
            for (p4.i iVar2 : arrayList) {
                kotlin.jvm.internal.s.f(newDestination, "newDestination");
                iVar2.m(newDestination);
            }
            i11 = i12;
        }
    }

    public void f0(androidx.lifecycle.v owner) {
        androidx.lifecycle.p lifecycle;
        kotlin.jvm.internal.s.g(owner, "owner");
        if (kotlin.jvm.internal.s.c(owner, this.f46040o)) {
            return;
        }
        androidx.lifecycle.v vVar = this.f46040o;
        if (vVar != null && (lifecycle = vVar.getLifecycle()) != null) {
            lifecycle.c(this.f46045t);
        }
        this.f46040o = owner;
        owner.getLifecycle().a(this.f46045t);
    }

    public void g0(OnBackPressedDispatcher dispatcher) {
        kotlin.jvm.internal.s.g(dispatcher, "dispatcher");
        if (kotlin.jvm.internal.s.c(dispatcher, this.f46041p)) {
            return;
        }
        androidx.lifecycle.v vVar = this.f46040o;
        if (vVar != null) {
            this.f46046u.remove();
            this.f46041p = dispatcher;
            dispatcher.b(vVar, this.f46046u);
            androidx.lifecycle.p lifecycle = vVar.getLifecycle();
            lifecycle.c(this.f46045t);
            lifecycle.a(this.f46045t);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    public void h0(t0 viewModelStore) {
        kotlin.jvm.internal.s.g(viewModelStore, "viewModelStore");
        p4.m mVar = this.f46042q;
        m.b bVar = p4.m.f46083b;
        if (kotlin.jvm.internal.s.c(mVar, bVar.a(viewModelStore))) {
            return;
        }
        if (v().isEmpty()) {
            this.f46042q = bVar.a(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    public final p4.i i0(p4.i child) {
        kotlin.jvm.internal.s.g(child, "child");
        p4.i remove = this.f46036k.remove(child);
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f46037l.get(remove);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            b bVar = this.f46049x.get(this.f46048w.e(remove.f().n()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.f46037l.remove(remove);
        }
        return remove;
    }

    public final void j0() {
        List<p4.i> Q0;
        p pVar;
        List<p4.i> A0;
        h0<Set<p4.i>> c11;
        Set<p4.i> value;
        List<p4.i> A02;
        Q0 = wz.e0.Q0(v());
        if (Q0.isEmpty()) {
            return;
        }
        p f11 = ((p4.i) wz.u.n0(Q0)).f();
        if (f11 instanceof p4.c) {
            A02 = wz.e0.A0(Q0);
            for (p4.i iVar : A02) {
                pVar = iVar.f();
                if (!(pVar instanceof r) && !(pVar instanceof p4.c)) {
                    break;
                }
            }
        }
        pVar = null;
        HashMap hashMap = new HashMap();
        A0 = wz.e0.A0(Q0);
        for (p4.i iVar2 : A0) {
            p.c h11 = iVar2.h();
            p f12 = iVar2.f();
            if (f11 != null && f12.m() == f11.m()) {
                p.c cVar = p.c.RESUMED;
                if (h11 != cVar) {
                    b bVar = this.f46049x.get(D().e(iVar2.f().n()));
                    if (!kotlin.jvm.internal.s.c((bVar == null || (c11 = bVar.c()) == null || (value = c11.getValue()) == null) ? null : Boolean.valueOf(value.contains(iVar2)), Boolean.TRUE)) {
                        AtomicInteger atomicInteger = this.f46037l.get(iVar2);
                        boolean z11 = false;
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z11 = true;
                        }
                        if (!z11) {
                            hashMap.put(iVar2, cVar);
                        }
                    }
                    hashMap.put(iVar2, p.c.STARTED);
                }
                f11 = f11.o();
            } else if (pVar != null && f12.m() == pVar.m()) {
                if (h11 == p.c.RESUMED) {
                    iVar2.n(p.c.STARTED);
                } else {
                    p.c cVar2 = p.c.STARTED;
                    if (h11 != cVar2) {
                        hashMap.put(iVar2, cVar2);
                    }
                }
                pVar = pVar.o();
            } else {
                iVar2.n(p.c.CREATED);
            }
        }
        for (p4.i iVar3 : Q0) {
            p.c cVar3 = (p.c) hashMap.get(iVar3);
            if (cVar3 != null) {
                iVar3.n(cVar3);
            } else {
                iVar3.o();
            }
        }
    }

    public void r(boolean z11) {
        this.f46047v = z11;
        k0();
    }

    public final p s(int i11) {
        r rVar = this.f46029d;
        if (rVar == null) {
            return null;
        }
        kotlin.jvm.internal.s.e(rVar);
        if (rVar.m() == i11) {
            return this.f46029d;
        }
        p4.i m11 = v().m();
        p f11 = m11 != null ? m11.f() : null;
        if (f11 == null) {
            f11 = this.f46029d;
            kotlin.jvm.internal.s.e(f11);
        }
        return t(f11, i11);
    }

    public wz.k<p4.i> v() {
        return this.f46033h;
    }

    public p4.i w(int i11) {
        p4.i iVar;
        boolean z11;
        wz.k<p4.i> v11 = v();
        ListIterator<p4.i> listIterator = v11.listIterator(v11.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iVar = null;
                break;
            }
            iVar = listIterator.previous();
            if (iVar.f().m() == i11) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        p4.i iVar2 = iVar;
        if (iVar2 != null) {
            return iVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i11 + " is on the NavController's back stack. The current destination is " + z()).toString());
    }

    public final Context x() {
        return this.f46026a;
    }

    public p4.i y() {
        return v().m();
    }

    public p z() {
        p4.i y11 = y();
        if (y11 == null) {
            return null;
        }
        return y11.f();
    }
}