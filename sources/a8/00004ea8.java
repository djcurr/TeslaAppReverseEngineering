package com.stripe.android.link;

import android.os.Bundle;
import c1.o0;
import c1.v1;
import com.stripe.android.link.LinkActivity$onCreate$1;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.cardedit.CardEditScreenKt;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodScreenKt;
import com.stripe.android.link.ui.signup.SignUpScreenKt;
import com.stripe.android.link.ui.verification.VerificationScreenKt;
import com.stripe.android.link.ui.wallet.WalletScreenKt;
import com.stripe.android.model.ConsumerSession;
import h00.l;
import h00.q;
import j1.c;
import java.util.List;
import kotlin.jvm.internal.u;
import p0.i;
import p4.e;
import p4.h;
import p4.s;
import p4.z;
import vz.b0;
import wz.v;
import y0.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkActivity$onCreate$1$2$1$1$2 extends u implements l<s, b0> {
    final /* synthetic */ o0<q<i, c1.i, Integer, b0>> $bottomSheetContent$delegate;
    final /* synthetic */ v20.o0 $coroutineScope;
    final /* synthetic */ v1<LinkAccount> $linkAccount$delegate;
    final /* synthetic */ n0 $sheetState;
    final /* synthetic */ LinkActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<h, b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(h hVar) {
            invoke2(hVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(h navArgument) {
            kotlin.jvm.internal.s.g(navArgument, "$this$navArgument");
            navArgument.c(z.f46187l);
            navArgument.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements q<p4.i, c1.i, Integer, b0> {
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LinkActivity linkActivity) {
            super(3);
            this.this$0 = linkActivity;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i backStackEntry, c1.i iVar, int i11) {
            LinkActivityViewModel viewModel;
            kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
            Bundle d11 = backStackEntry.d();
            String string = d11 == null ? null : d11.getString("email");
            viewModel = this.this$0.getViewModel();
            SignUpScreenKt.SignUpBody(viewModel.getInjector(), string, iVar, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements q<p4.i, c1.i, Integer, b0> {
        final /* synthetic */ v1<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(v1<LinkAccount> v1Var, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = v1Var;
            this.this$0 = linkActivity;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i it2, c1.i iVar, int i11) {
            LinkAccount m154invoke$lambda1$lambda0;
            LinkActivityViewModel viewModel;
            kotlin.jvm.internal.s.g(it2, "it");
            m154invoke$lambda1$lambda0 = LinkActivity$onCreate$1.AnonymousClass2.AnonymousClass1.m154invoke$lambda1$lambda0(this.$linkAccount$delegate);
            if (m154invoke$lambda1$lambda0 == null) {
                return;
            }
            viewModel = this.this$0.getViewModel();
            VerificationScreenKt.VerificationBodyFullFlow(m154invoke$lambda1$lambda0, viewModel.getInjector(), iVar, ConsumerSession.$stable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements q<p4.i, c1.i, Integer, b0> {
        final /* synthetic */ o0<q<i, c1.i, Integer, b0>> $bottomSheetContent$delegate;
        final /* synthetic */ v20.o0 $coroutineScope;
        final /* synthetic */ v1<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ n0 $sheetState;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(v1<LinkAccount> v1Var, LinkActivity linkActivity, v20.o0 o0Var, n0 n0Var, o0<q<i, c1.i, Integer, b0>> o0Var2) {
            super(3);
            this.$linkAccount$delegate = v1Var;
            this.this$0 = linkActivity;
            this.$coroutineScope = o0Var;
            this.$sheetState = n0Var;
            this.$bottomSheetContent$delegate = o0Var2;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i it2, c1.i iVar, int i11) {
            LinkAccount m154invoke$lambda1$lambda0;
            LinkActivityViewModel viewModel;
            kotlin.jvm.internal.s.g(it2, "it");
            m154invoke$lambda1$lambda0 = LinkActivity$onCreate$1.AnonymousClass2.AnonymousClass1.m154invoke$lambda1$lambda0(this.$linkAccount$delegate);
            if (m154invoke$lambda1$lambda0 == null) {
                return;
            }
            LinkActivity linkActivity = this.this$0;
            v20.o0 o0Var = this.$coroutineScope;
            n0 n0Var = this.$sheetState;
            o0<q<i, c1.i, Integer, b0>> o0Var2 = this.$bottomSheetContent$delegate;
            viewModel = linkActivity.getViewModel();
            WalletScreenKt.WalletBody(m154invoke$lambda1$lambda0, viewModel.getInjector(), new LinkActivity$onCreate$1$2$1$1$2$4$1$1(o0Var, n0Var, o0Var2), iVar, ConsumerSession.$stable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends u implements q<p4.i, c1.i, Integer, b0> {
        final /* synthetic */ v1<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(v1<LinkAccount> v1Var, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = v1Var;
            this.this$0 = linkActivity;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i it2, c1.i iVar, int i11) {
            LinkAccount m154invoke$lambda1$lambda0;
            LinkActivityViewModel viewModel;
            kotlin.jvm.internal.s.g(it2, "it");
            m154invoke$lambda1$lambda0 = LinkActivity$onCreate$1.AnonymousClass2.AnonymousClass1.m154invoke$lambda1$lambda0(this.$linkAccount$delegate);
            if (m154invoke$lambda1$lambda0 == null) {
                return;
            }
            viewModel = this.this$0.getViewModel();
            PaymentMethodScreenKt.PaymentMethodBody(m154invoke$lambda1$lambda0, viewModel.getInjector(), iVar, ConsumerSession.$stable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass6 extends u implements l<h, b0> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(h hVar) {
            invoke2(hVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(h navArgument) {
            kotlin.jvm.internal.s.g(navArgument, "$this$navArgument");
            navArgument.c(z.f46187l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass7 extends u implements q<p4.i, c1.i, Integer, b0> {
        final /* synthetic */ v1<LinkAccount> $linkAccount$delegate;
        final /* synthetic */ LinkActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(v1<LinkAccount> v1Var, LinkActivity linkActivity) {
            super(3);
            this.$linkAccount$delegate = v1Var;
            this.this$0 = linkActivity;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i backStackEntry, c1.i iVar, int i11) {
            LinkAccount m154invoke$lambda1$lambda0;
            LinkActivityViewModel viewModel;
            kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
            Bundle d11 = backStackEntry.d();
            String string = d11 == null ? null : d11.getString("id");
            m154invoke$lambda1$lambda0 = LinkActivity$onCreate$1.AnonymousClass2.AnonymousClass1.m154invoke$lambda1$lambda0(this.$linkAccount$delegate);
            if (m154invoke$lambda1$lambda0 == null) {
                return;
            }
            viewModel = this.this$0.getViewModel();
            NonFallbackInjector injector = viewModel.getInjector();
            if (string != null) {
                CardEditScreenKt.CardEditBody(m154invoke$lambda1$lambda0, injector, string, iVar, ConsumerSession.$stable);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$2$1$1$2(LinkActivity linkActivity, v1<LinkAccount> v1Var, v20.o0 o0Var, n0 n0Var, o0<q<i, c1.i, Integer, b0>> o0Var2) {
        super(1);
        this.this$0 = linkActivity;
        this.$linkAccount$delegate = v1Var;
        this.$coroutineScope = o0Var;
        this.$sheetState = n0Var;
        this.$bottomSheetContent$delegate = o0Var2;
    }

    @Override // h00.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo12invoke(s sVar) {
        invoke2(sVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(s NavHost) {
        List d11;
        List d12;
        kotlin.jvm.internal.s.g(NavHost, "$this$NavHost");
        q4.h.b(NavHost, LinkScreen.Loading.INSTANCE.getRoute(), null, null, ComposableSingletons$LinkActivityKt.INSTANCE.m148getLambda2$link_release(), 6, null);
        d11 = v.d(e.a("email", AnonymousClass1.INSTANCE));
        q4.h.b(NavHost, LinkScreen.SignUp.route, d11, null, c.c(-985536763, true, new AnonymousClass2(this.this$0)), 4, null);
        q4.h.b(NavHost, LinkScreen.Verification.INSTANCE.getRoute(), null, null, c.c(-985536810, true, new AnonymousClass3(this.$linkAccount$delegate, this.this$0)), 6, null);
        q4.h.b(NavHost, LinkScreen.Wallet.INSTANCE.getRoute(), null, null, c.c(-985536411, true, new AnonymousClass4(this.$linkAccount$delegate, this.this$0, this.$coroutineScope, this.$sheetState, this.$bottomSheetContent$delegate)), 6, null);
        q4.h.b(NavHost, LinkScreen.PaymentMethod.INSTANCE.getRoute(), null, null, c.c(-985534996, true, new AnonymousClass5(this.$linkAccount$delegate, this.this$0)), 6, null);
        d12 = v.d(e.a("id", AnonymousClass6.INSTANCE));
        q4.h.b(NavHost, LinkScreen.CardEdit.route, d12, null, c.c(-985534778, true, new AnonymousClass7(this.$linkAccount$delegate, this.this$0)), 4, null);
    }
}