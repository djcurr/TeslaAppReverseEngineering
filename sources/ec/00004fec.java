package com.stripe.android.link.ui.inline;

import androidx.compose.ui.platform.d1;
import androidx.compose.ui.platform.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import c1.e1;
import c1.i;
import c1.n1;
import c1.r;
import c1.v1;
import c1.w0;
import c1.x0;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.SimpleTextFieldController;
import com.stripe.android.ui.core.elements.TextFieldController;
import h00.a;
import h00.l;
import j1.c;
import kotlin.jvm.internal.s;
import m4.b;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import r1.g;
import vz.b0;
import y0.n;
import y0.o;

/* loaded from: classes6.dex */
public final class LinkInlineSignupViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkInlineSignup(NonFallbackInjector nonFallbackInjector, boolean z11, a<b0> aVar, l<? super Boolean, b0> lVar, l<? super UserInput, b0> lVar2, i iVar, int i11) {
        int i12;
        i h11 = iVar.h(-2081383711);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(nonFallbackInjector) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(aVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.O(lVar) ? 2048 : 1024;
        }
        if ((i11 & 57344) == 0) {
            i12 |= h11.O(lVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (((46811 & i12) ^ 9362) == 0 && h11.i()) {
            h11.G();
        } else {
            InlineSignupViewModel.Factory factory = new InlineSignupViewModel.Factory(nonFallbackInjector);
            h11.x(564614654);
            u0 a11 = m4.a.f38401a.a(h11, 0);
            if (a11 != null) {
                p0 b11 = b.b(InlineSignupViewModel.class, a11, null, factory, h11, 4168, 0);
                h11.N();
                InlineSignupViewModel inlineSignupViewModel = (InlineSignupViewModel) b11;
                v1 a12 = n1.a(inlineSignupViewModel.getSignUpState(), SignUpState.InputtingEmail, null, h11, 56, 2);
                v1 a13 = n1.a(inlineSignupViewModel.isExpanded(), Boolean.FALSE, null, h11, 56, 2);
                v1 b12 = n1.b(inlineSignupViewModel.getUserInput(), null, h11, 8, 1);
                lVar.invoke(Boolean.valueOf(m216LinkInlineSignup$lambda1(a13)));
                lVar2.invoke(m217LinkInlineSignup$lambda2(b12));
                c1.b0.d(m215LinkInlineSignup$lambda0(a12), new LinkInlineSignupViewKt$LinkInlineSignup$1((g) h11.A(l0.e()), d1.f2888a.b(h11, 8), a12, b12, null), h11, 0);
                LinkInlineSignup(inlineSignupViewModel.getMerchantName(), inlineSignupViewModel.getEmailController(), inlineSignupViewModel.getPhoneController(), m215LinkInlineSignup$lambda0(a12), z11, m216LinkInlineSignup$lambda1(a13), new LinkInlineSignupViewKt$LinkInlineSignup$2(inlineSignupViewModel), aVar, h11, (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | ((i12 << 9) & 57344) | ((i12 << 15) & 29360128));
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkInlineSignupViewKt$LinkInlineSignup$3(nonFallbackInjector, z11, aVar, lVar, lVar2, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinkInlineSignup$lambda-0  reason: not valid java name */
    public static final SignUpState m215LinkInlineSignup$lambda0(v1<? extends SignUpState> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: LinkInlineSignup$lambda-1  reason: not valid java name */
    private static final boolean m216LinkInlineSignup$lambda1(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinkInlineSignup$lambda-2  reason: not valid java name */
    public static final UserInput m217LinkInlineSignup$lambda2(v1<? extends UserInput> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(i iVar, int i11) {
        i h11 = iVar.h(498935496);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkInlineSignupViewKt.INSTANCE.m214getLambda2$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkInlineSignupViewKt$Preview$1(i11));
    }

    public static final void LinkInlineSignup(String merchantName, TextFieldController emailController, PhoneNumberController phoneNumberController, SignUpState signUpState, boolean z11, boolean z12, a<b0> toggleExpanded, a<b0> onUserInteracted, i iVar, int i11) {
        float b11;
        s.g(merchantName, "merchantName");
        s.g(emailController, "emailController");
        s.g(phoneNumberController, "phoneNumberController");
        s.g(signUpState, "signUpState");
        s.g(toggleExpanded, "toggleExpanded");
        s.g(onUserInteracted, "onUserInteracted");
        i h11 = iVar.h(-2081382407);
        x0[] x0VarArr = new x0[1];
        w0<Float> a11 = o.a();
        if (z11) {
            h11.x(-2081382032);
            b11 = n.f58482a.c(h11, 8);
        } else {
            h11.x(-2081382009);
            b11 = n.f58482a.b(h11, 8);
        }
        h11.N();
        x0VarArr[0] = a11.c(Float.valueOf(b11));
        r.a(x0VarArr, c.b(h11, -819891152, true, new LinkInlineSignupViewKt$LinkInlineSignup$4(toggleExpanded, onUserInteracted, i11, z12, z11, merchantName, emailController, signUpState, phoneNumberController)), h11, 56);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkInlineSignupViewKt$LinkInlineSignup$5(merchantName, emailController, phoneNumberController, signUpState, z11, z12, toggleExpanded, onUserInteracted, i11));
    }
}