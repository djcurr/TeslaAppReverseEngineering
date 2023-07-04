package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import c1.r;
import c1.v1;
import c1.w0;
import c1.y;
import c1.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.j0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.t;
import l2.v;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import v20.o0;
import vz.b0;
import x2.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final w0<String> f3233a = r.c(null, a.f3234a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3234a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.window.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0059b extends u implements h00.l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f3236b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f3237c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f3238d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f3239e;

        /* renamed from: androidx.compose.ui.window.b$b$a */
        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.window.i f3240a;

            public a(androidx.compose.ui.window.i iVar) {
                this.f3240a = iVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f3240a.disposeComposition();
                this.f3240a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0059b(androidx.compose.ui.window.i iVar, h00.a<b0> aVar, n nVar, String str, q qVar) {
            super(1);
            this.f3235a = iVar;
            this.f3236b = aVar;
            this.f3237c = nVar;
            this.f3238d = str;
            this.f3239e = qVar;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            this.f3235a.g();
            this.f3235a.i(this.f3236b, this.f3237c, this.f3238d, this.f3239e);
            return new a(this.f3235a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f3242b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f3243c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f3244d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f3245e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.window.i iVar, h00.a<b0> aVar, n nVar, String str, q qVar) {
            super(0);
            this.f3241a = iVar;
            this.f3242b = aVar;
            this.f3243c = nVar;
            this.f3244d = str;
            this.f3245e = qVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3241a.i(this.f3242b, this.f3243c, this.f3244d, this.f3245e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends u implements h00.l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f3247b;

        /* loaded from: classes.dex */
        public static final class a implements y {
            @Override // c1.y
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.window.i iVar, m mVar) {
            super(1);
            this.f3246a = iVar;
            this.f3247b = mVar;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            this.f3246a.setPositionProvider(this.f3247b);
            this.f3246a.l();
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {297}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3248a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3249b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.window.i iVar, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f3250c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            e eVar = new e(this.f3250c, dVar);
            eVar.f3249b = obj;
            return eVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r4.f3248a
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r4.f3249b
                v20.o0 r1 = (v20.o0) r1
                vz.r.b(r5)
                r5 = r4
                goto L36
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                vz.r.b(r5)
                java.lang.Object r5 = r4.f3249b
                v20.o0 r5 = (v20.o0) r5
                r1 = r5
                r5 = r4
            L25:
                boolean r3 = v20.p0.f(r1)
                if (r3 == 0) goto L3c
                r5.f3249b = r1
                r5.f3248a = r2
                java.lang.Object r3 = w20.e.e(r5)
                if (r3 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.i r3 = r5.f3250c
                r3.e()
                goto L25
            L3c:
                vz.b0 r5 = vz.b0.f54756a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends u implements h00.l<f2.o, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.window.i iVar) {
            super(1);
            this.f3251a = iVar;
        }

        public final void a(f2.o childCoordinates) {
            s.g(childCoordinates, "childCoordinates");
            f2.o Y = childCoordinates.Y();
            s.e(Y);
            this.f3251a.k(Y);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(f2.o oVar) {
            a(oVar);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f3253b;

        /* loaded from: classes.dex */
        static final class a extends u implements h00.l<m0.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f3254a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                s.g(layout, "$this$layout");
            }
        }

        g(androidx.compose.ui.window.i iVar, q qVar) {
            this.f3252a = iVar;
            this.f3253b = qVar;
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final a0 b(f2.b0 Layout, List<? extends f2.y> noName_0, long j11) {
            s.g(Layout, "$this$Layout");
            s.g(noName_0, "$noName_0");
            this.f3252a.setParentLayoutDirection(this.f3253b);
            return b0.a.b(Layout, 0, 0, null, a.f3254a, 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.b(this, kVar, list, i11);
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.a(this, kVar, list, i11);
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.c(this, kVar, list, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f3255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f3256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f3257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f3258d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3259e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f3260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(m mVar, h00.a<vz.b0> aVar, n nVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f3255a = mVar;
            this.f3256b = aVar;
            this.f3257c = nVar;
            this.f3258d = pVar;
            this.f3259e = i11;
            this.f3260f = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b.a(this.f3255a, this.f3256b, this.f3257c, this.f3258d, iVar, this.f3259e | 1, this.f3260f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends u implements h00.a<UUID> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f3261a = new i();

        i() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f3262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<h00.p<c1.i, Integer, vz.b0>> f3263b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends u implements h00.l<v, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f3264a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(v vVar) {
                invoke2(vVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(v semantics) {
                s.g(semantics, "$this$semantics");
                t.z(semantics);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.ui.window.b$j$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0060b extends u implements h00.l<x2.o, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.window.i f3265a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0060b(androidx.compose.ui.window.i iVar) {
                super(1);
                this.f3265a = iVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(x2.o oVar) {
                m1invokeozmzZPI(oVar.j());
                return vz.b0.f54756a;
            }

            /* renamed from: invoke-ozmzZPI  reason: not valid java name */
            public final void m1invokeozmzZPI(long j11) {
                this.f3265a.m3setPopupContentSizefhxjrPA(x2.o.b(j11));
                this.f3265a.l();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<h00.p<c1.i, Integer, vz.b0>> f3266a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(v1<? extends h00.p<? super c1.i, ? super Integer, vz.b0>> v1Var) {
                super(2);
                this.f3266a = v1Var;
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    b.b(this.f3266a).invoke(iVar, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(androidx.compose.ui.window.i iVar, v1<? extends h00.p<? super c1.i, ? super Integer, vz.b0>> v1Var) {
            super(2);
            this.f3262a = iVar;
            this.f3263b = v1Var;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            o1.f a11 = q1.a.a(j0.a(l2.o.b(o1.f.f42062f1, false, a.f3264a, 1, null), new C0060b(this.f3262a)), this.f3262a.getCanCalculatePosition() ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            j1.a b11 = j1.c.b(iVar, -819900466, true, new c(this.f3263b));
            iVar.x(1560115737);
            androidx.compose.ui.window.c cVar = androidx.compose.ui.window.c.f3267a;
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            q qVar = (q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b12 = f2.u.b(a11);
            if (!(iVar.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            c1.i a13 = a2.a(iVar);
            a2.c(a13, cVar, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            b11.invoke(iVar, 6);
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.window.m r27, h00.a<vz.b0> r28, androidx.compose.ui.window.n r29, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r30, c1.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.m, h00.a, androidx.compose.ui.window.n, h00.p, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.p<c1.i, Integer, vz.b0> b(v1<? extends h00.p<? super c1.i, ? super Integer, vz.b0>> v1Var) {
        return (h00.p) v1Var.getValue();
    }

    public static final boolean e(View view) {
        s.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x2.m f(Rect rect) {
        return new x2.m(rect.left, rect.top, rect.right, rect.bottom);
    }
}