package com.stripe.android.link.ui.verification;

import androidx.compose.ui.window.a;
import androidx.compose.ui.window.g;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import h00.l;
import h00.q;
import j1.c;
import kotlin.jvm.internal.u;
import p4.i;
import p4.s;
import q4.h;
import vz.b0;

/* loaded from: classes6.dex */
final class VerificationDialogKt$LinkVerificationDialog$1 extends u implements l<s, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LinkPaymentLauncher $linkLauncher;
    final /* synthetic */ l<Boolean, b0> $verificationCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements q<i, c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ LinkPaymentLauncher $linkLauncher;
        final /* synthetic */ l<Boolean, b0> $verificationCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LinkPaymentLauncher linkPaymentLauncher, l<? super Boolean, b0> lVar, int i11) {
            super(3);
            this.$linkLauncher = linkPaymentLauncher;
            this.$verificationCallback = lVar;
            this.$$dirty = i11;
        }

        /* renamed from: invoke$lambda-1  reason: not valid java name */
        private static final boolean m237invoke$lambda1(o0<Boolean> o0Var) {
            return o0Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-2  reason: not valid java name */
        public static final void m238invoke$lambda2(o0<Boolean> o0Var, boolean z11) {
            o0Var.setValue(Boolean.valueOf(z11));
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i it2, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(it2, "it");
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                y11 = s1.d(Boolean.TRUE, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o0 o0Var = (o0) y11;
            NonFallbackInjector injector$link_release = this.$linkLauncher.getInjector$link_release();
            if (injector$link_release != null) {
                LinkAccount linkAccount = (LinkAccount) n1.b(this.$linkLauncher.getLinkAccountManager$link_release().getLinkAccount(), null, iVar, 8, 1).getValue();
                if (linkAccount == null) {
                    return;
                }
                l<Boolean, b0> lVar = this.$verificationCallback;
                int i12 = this.$$dirty;
                if (m237invoke$lambda1(o0Var)) {
                    iVar.x(-3686552);
                    boolean O = iVar.O(o0Var) | iVar.O(lVar);
                    Object y12 = iVar.y();
                    if (O || y12 == aVar.a()) {
                        y12 = new VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1(lVar, o0Var);
                        iVar.p(y12);
                    }
                    iVar.N();
                    a.a((h00.a) y12, new g(false, false, null, false, 7, null), c.b(iVar, -819892457, true, new VerificationDialogKt$LinkVerificationDialog$1$1$1$2(linkAccount, o0Var, lVar, i12, injector$link_release)), iVar, 384, 0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$1(LinkPaymentLauncher linkPaymentLauncher, l<? super Boolean, b0> lVar, int i11) {
        super(1);
        this.$linkLauncher = linkPaymentLauncher;
        this.$verificationCallback = lVar;
        this.$$dirty = i11;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(s sVar) {
        invoke2(sVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(s NavHost) {
        kotlin.jvm.internal.s.g(NavHost, "$this$NavHost");
        h.b(NavHost, "dialog", null, null, c.c(-985532819, true, new AnonymousClass1(this.$linkLauncher, this.$verificationCallback, this.$$dirty)), 6, null);
    }
}