package com.stripe.android.link.ui.signup;

import androidx.compose.ui.platform.d1;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.elements.TextFieldUIKt;
import f2.z;
import h2.a;
import kotlin.jvm.internal.s;
import l2.o;
import m4.b;
import o1.a;
import o1.f;
import p0.c;
import p0.e0;
import p0.u;
import s2.l;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;
import y0.s0;

/* loaded from: classes6.dex */
public final class SignUpScreenKt {
    public static final void EmailCollectionSection(boolean z11, TextFieldController emailController, SignUpState signUpState, i iVar, int i11) {
        int b11;
        s.g(emailController, "emailController");
        s.g(signUpState, "signUpState");
        i h11 = iVar.h(1828858418);
        f.a aVar = f.f42062f1;
        float f11 = 0;
        f h12 = u.h(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(f11));
        a e11 = a.f42039a.e();
        h11.x(-1990474327);
        z i12 = c.i(e11, false, h11, 6);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(h12);
        if (!(h11.k() instanceof e)) {
            h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a11);
        } else {
            h11.o();
        }
        h11.E();
        i a12 = a2.a(h11);
        a2.c(a12, i12, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        h11.c();
        b12.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-1253629305);
        p0.d dVar2 = p0.d.f45270a;
        if (signUpState == SignUpState.InputtingPhone) {
            b11 = l.f50115b.d();
        } else {
            b11 = l.f50115b.b();
        }
        TextFieldUIKt.m478TextFieldSectionVyDzSTg(emailController, null, null, b11, z11 && signUpState != SignUpState.VerifyingEmail, null, h11, 8, 38);
        if (signUpState == SignUpState.VerifyingEmail) {
            float f12 = 8;
            s0.a(o.b(u.k(e0.v(aVar, g.f(32)), g.f(f11), g.f(f12), g.f(16), g.f(f12)), false, SignUpScreenKt$EmailCollectionSection$1$1.INSTANCE, 1, null), ThemeKt.getLinkColors(h0.f58131a, h11, 8).m187getButtonLabel0d7_KjU(), g.f(2), h11, 384, 0);
        }
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SignUpScreenKt$EmailCollectionSection$2(z11, emailController, signUpState, i11));
    }

    public static final void SignUpBody(NonFallbackInjector injector, String str, i iVar, int i11) {
        int i12;
        s.g(injector, "injector");
        i h11 = iVar.h(-1702343249);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(injector) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(str) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            SignUpViewModel.Factory factory = new SignUpViewModel.Factory(injector, str);
            h11.x(564614654);
            u0 a11 = m4.a.f38401a.a(h11, 0);
            if (a11 != null) {
                p0 b11 = b.b(SignUpViewModel.class, a11, null, factory, h11, 4168, 0);
                h11.N();
                SignUpViewModel signUpViewModel = (SignUpViewModel) b11;
                SignUpBody(signUpViewModel.getMerchantName(), signUpViewModel.getEmailController(), signUpViewModel.getPhoneController(), m230SignUpBody$lambda0(n1.b(signUpViewModel.getSignUpState(), null, h11, 8, 1)), m231SignUpBody$lambda1(n1.a(signUpViewModel.isReadyToSignUp(), Boolean.FALSE, null, h11, 56, 2)), m232SignUpBody$lambda2(n1.b(signUpViewModel.getErrorMessage(), null, h11, 8, 1)), new SignUpScreenKt$SignUpBody$1(signUpViewModel), h11, (PhoneNumberController.$stable << 6) | 64);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SignUpScreenKt$SignUpBody$2(injector, str, i11));
    }

    /* renamed from: SignUpBody$lambda-0  reason: not valid java name */
    private static final SignUpState m230SignUpBody$lambda0(v1<? extends SignUpState> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: SignUpBody$lambda-1  reason: not valid java name */
    private static final boolean m231SignUpBody$lambda1(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: SignUpBody$lambda-2  reason: not valid java name */
    private static final ErrorMessage m232SignUpBody$lambda2(v1<? extends ErrorMessage> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignUpBodyPreview(i iVar, int i11) {
        i h11 = iVar.h(1307137757);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$SignUpScreenKt.INSTANCE.m229getLambda2$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SignUpScreenKt$SignUpBodyPreview$1(i11));
    }

    public static final void SignUpBody(String merchantName, TextFieldController emailController, PhoneNumberController phoneNumberController, SignUpState signUpState, boolean z11, ErrorMessage errorMessage, h00.a<b0> onSignUpClick, i iVar, int i11) {
        s.g(merchantName, "merchantName");
        s.g(emailController, "emailController");
        s.g(phoneNumberController, "phoneNumberController");
        s.g(signUpState, "signUpState");
        s.g(onSignUpClick, "onSignUpClick");
        i h11 = iVar.h(-1702342408);
        CommonKt.ScrollableTopLevelColumn(j1.c.b(h11, -819893767, true, new SignUpScreenKt$SignUpBody$3(signUpState, merchantName, emailController, i11, errorMessage, z11, onSignUpClick, d1.f2888a.b(h11, 8), phoneNumberController)), h11, 6);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SignUpScreenKt$SignUpBody$4(merchantName, emailController, phoneNumberController, signUpState, z11, errorMessage, onSignUpClick, i11));
    }
}