package com.stripe.android.link;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import c1.n1;
import c1.s1;
import c1.v1;
import c1.y;
import c1.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkAppBarKt;
import h00.l;
import h00.p;
import h00.q;
import h2.a;
import j1.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.a;
import p0.e0;
import p0.h;
import p0.j;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import y0.m0;
import y0.n0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkActivity$onCreate$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ LinkActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<z, y> {
        final /* synthetic */ o0 $coroutineScope;
        final /* synthetic */ n0 $sheetState;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.stripe.android.link.LinkActivity$onCreate$1$1$1", f = "LinkActivity.kt", l = {82}, m = "invokeSuspend")
        /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03701 extends kotlin.coroutines.jvm.internal.l implements p<o0, d<? super b0>, Object> {
            final /* synthetic */ n0 $sheetState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03701(n0 n0Var, d<? super C03701> dVar) {
                super(2, dVar);
                this.$sheetState = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<b0> create(Object obj, d<?> dVar) {
                return new C03701(this.$sheetState, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, d<? super b0> dVar) {
                return ((C03701) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.label;
                if (i11 == 0) {
                    r.b(obj);
                    n0 n0Var = this.$sheetState;
                    this.label = 1;
                    if (n0Var.Q(this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(o0 o0Var, n0 n0Var) {
            super(1);
            this.$coroutineScope = o0Var;
            this.$sheetState = n0Var;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            k.d(this.$coroutineScope, null, null, new C03701(this.$sheetState, null), 3, null);
            final o0 o0Var = this.$coroutineScope;
            final n0 n0Var = this.$sheetState;
            return new y() { // from class: com.stripe.android.link.LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1
                @Override // c1.y
                public void dispose() {
                    k.d(o0.this, null, null, new LinkActivity$onCreate$1$1$2$1(n0Var, null), 3, null);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements p<i, Integer, b0> {
        final /* synthetic */ c1.o0<q<p0.i, i, Integer, b0>> $bottomSheetContent$delegate;
        final /* synthetic */ o0 $coroutineScope;
        final /* synthetic */ n0 $sheetState;
        final /* synthetic */ LinkActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
            final /* synthetic */ c1.o0<q<p0.i, i, Integer, b0>> $bottomSheetContent$delegate;
            final /* synthetic */ o0 $coroutineScope;
            final /* synthetic */ n0 $sheetState;
            final /* synthetic */ LinkActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LinkActivity linkActivity, o0 o0Var, n0 n0Var, c1.o0<q<p0.i, i, Integer, b0>> o0Var2) {
                super(2);
                this.this$0 = linkActivity;
                this.$coroutineScope = o0Var;
                this.$sheetState = n0Var;
                this.$bottomSheetContent$delegate = o0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
            public static final LinkAccount m154invoke$lambda1$lambda0(v1<LinkAccount> v1Var) {
                return v1Var.getValue();
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(i iVar, int i11) {
                LinkActivityViewModel viewModel;
                LinkActivityViewModel viewModel2;
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                this.this$0.setNavController(q4.i.d(new p4.b0[0], iVar, 8));
                viewModel = this.this$0.getViewModel();
                viewModel.getNavigator().setNavigationController(this.this$0.getNavController());
                o1.f n11 = e0.n(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
                LinkActivity linkActivity = this.this$0;
                o0 o0Var = this.$coroutineScope;
                n0 n0Var = this.$sheetState;
                c1.o0<q<p0.i, i, Integer, b0>> o0Var2 = this.$bottomSheetContent$delegate;
                iVar.x(-1113030915);
                f2.z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
                iVar.x(1376089394);
                x2.d dVar = (x2.d) iVar.A(l0.d());
                x2.q qVar = (x2.q) iVar.A(l0.i());
                y1 y1Var = (y1) iVar.A(l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
                if (!(iVar.k() instanceof e)) {
                    c1.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a12);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a13 = a2.a(iVar);
                a2.c(a13, a11, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(276693625);
                j jVar = j.f45341a;
                viewModel2 = linkActivity.getViewModel();
                v1 a14 = n1.a(viewModel2.getLinkAccount(), null, null, iVar, 56, 2);
                LinkAccount m154invoke$lambda1$lambda0 = m154invoke$lambda1$lambda0(a14);
                LinkAppBarKt.LinkAppBar(m154invoke$lambda1$lambda0 != null ? m154invoke$lambda1$lambda0.getEmail() : null, new LinkActivity$onCreate$1$2$1$1$1(linkActivity), iVar, 0);
                q4.j.a(linkActivity.getNavController(), LinkScreen.Loading.INSTANCE.getRoute(), null, null, new LinkActivity$onCreate$1$2$1$1$2(linkActivity, a14, o0Var, n0Var, o0Var2), iVar, 8, 12);
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(n0 n0Var, c1.o0<q<p0.i, i, Integer, b0>> o0Var, LinkActivity linkActivity, o0 o0Var2) {
            super(2);
            this.$sheetState = n0Var;
            this.$bottomSheetContent$delegate = o0Var;
            this.this$0 = linkActivity;
            this.$coroutineScope = o0Var2;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
                q<p0.i, i, Integer, b0> m151invoke$lambda1 = LinkActivity$onCreate$1.m151invoke$lambda1(this.$bottomSheetContent$delegate);
                if (m151invoke$lambda1 == null) {
                    m151invoke$lambda1 = ComposableSingletons$LinkActivityKt.INSTANCE.m147getLambda1$link_release();
                }
                o1.f j11 = e0.j(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
                n0 n0Var = this.$sheetState;
                m0.a(m151invoke$lambda1, j11, n0Var, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, c.b(iVar, -819890480, true, new AnonymousClass1(this.this$0, this.$coroutineScope, n0Var, this.$bottomSheetContent$delegate)), iVar, 100663344, 248);
                return;
            }
            iVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1(LinkActivity linkActivity) {
        super(2);
        this.this$0 = linkActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final q<p0.i, i, Integer, b0> m151invoke$lambda1(c1.o0<q<p0.i, i, Integer, b0>> o0Var) {
        return o0Var.getValue();
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        iVar.x(-3687241);
        Object y11 = iVar.y();
        i.a aVar = i.f8486a;
        if (y11 == aVar.a()) {
            y11 = s1.d(null, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        c1.o0 o0Var = (c1.o0) y11;
        n0 h11 = m0.h(y0.o0.Hidden, null, null, iVar, 6, 6);
        iVar.x(-723524056);
        iVar.x(-3687241);
        Object y12 = iVar.y();
        if (y12 == aVar.a()) {
            c1.s sVar = new c1.s(c1.b0.j(zz.h.f61280a, iVar));
            iVar.p(sVar);
            y12 = sVar;
        }
        iVar.N();
        o0 a11 = ((c1.s) y12).a();
        iVar.N();
        iVar.x(-1455010306);
        if (m151invoke$lambda1(o0Var) != null) {
            c1.b0.a(m151invoke$lambda1(o0Var), new AnonymousClass1(a11, h11), iVar, 0);
        }
        iVar.N();
        ThemeKt.DefaultLinkTheme(false, c.b(iVar, -819894269, true, new AnonymousClass2(h11, o0Var, this.this$0, a11)), iVar, 48, 1);
    }
}