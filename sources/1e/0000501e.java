package com.stripe.android.link.ui.signup;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import f2.z;
import h00.a;
import h00.p;
import h00.q;
import h2.a;
import j1.c;
import k0.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.e0;
import p0.h;
import p0.i;
import p0.j;
import vz.b0;
import w2.d;
import x2.g;
import y0.h0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SignUpScreenKt$SignUpBody$3 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isReadyToSignUp;
    final /* synthetic */ n1 $keyboardController;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ a<b0> $onSignUpClick;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ SignUpState $signUpState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldController textFieldController, SignUpState signUpState, int i11) {
            super(2);
            this.$emailController = textFieldController;
            this.$signUpState = signUpState;
            this.$$dirty = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                SignUpScreenKt.EmailCollectionSection(true, this.$emailController, this.$signUpState, iVar, ((this.$$dirty >> 3) & 896) | 70);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements q<d, c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ErrorMessage $errorMessage;
        final /* synthetic */ boolean $isReadyToSignUp;
        final /* synthetic */ n1 $keyboardController;
        final /* synthetic */ a<b0> $onSignUpClick;
        final /* synthetic */ PhoneNumberController $phoneNumberController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ErrorMessage errorMessage, boolean z11, a<b0> aVar, n1 n1Var, int i11, PhoneNumberController phoneNumberController) {
            super(3);
            this.$errorMessage = errorMessage;
            this.$isReadyToSignUp = z11;
            this.$onSignUpClick = aVar;
            this.$keyboardController = n1Var;
            this.$$dirty = i11;
            this.$phoneNumberController = phoneNumberController;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(d dVar, c1.i iVar, Integer num) {
            invoke(dVar, iVar, num.intValue());
            return b0.f54756a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [c1.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5 */
        public final void invoke(d AnimatedVisibility, c1.i iVar, int i11) {
            int i12;
            PrimaryButtonState primaryButtonState;
            s.g(AnimatedVisibility, "$this$AnimatedVisibility");
            f n11 = e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
            ErrorMessage errorMessage = this.$errorMessage;
            boolean z11 = this.$isReadyToSignUp;
            a<b0> aVar = this.$onSignUpClick;
            n1 n1Var = this.$keyboardController;
            int i13 = this.$$dirty;
            PhoneNumberController phoneNumberController = this.$phoneNumberController;
            iVar.x(-1113030915);
            z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar = (x2.q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            q<g1<h2.a>, c1.i, Integer, b0> b11 = f2.u.b(n11);
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
            c1.i a13 = a2.a(iVar);
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            j jVar = j.f45341a;
            ColorKt.PaymentsThemeForLink(c.b(iVar, -819891459, true, new SignUpScreenKt$SignUpBody$3$2$1$1(phoneNumberController, i13)), iVar, 6);
            iVar.x(167289569);
            if (errorMessage == null) {
                i12 = 0;
            } else {
                Resources resources = ((Context) iVar.A(androidx.compose.ui.platform.z.g())).getResources();
                s.f(resources, "LocalContext.current.resources");
                String message = errorMessage.getMessage(resources);
                i12 = 0;
                CommonKt.ErrorText(message, iVar, 0);
            }
            iVar.N();
            String b12 = k2.e.b(R.string.sign_up, iVar, i12);
            if (z11) {
                primaryButtonState = PrimaryButtonState.Enabled;
            } else {
                primaryButtonState = PrimaryButtonState.Disabled;
            }
            iVar.x(-3686552);
            boolean O = iVar.O(aVar) | iVar.O(n1Var);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new SignUpScreenKt$SignUpBody$3$2$1$3$1(aVar, n1Var);
                iVar.p(y11);
            }
            iVar.N();
            PrimaryButtonKt.PrimaryButton(b12, primaryButtonState, null, y11, iVar, 0, 4);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3(SignUpState signUpState, String str, TextFieldController textFieldController, int i11, ErrorMessage errorMessage, boolean z11, h00.a<b0> aVar, n1 n1Var, PhoneNumberController phoneNumberController) {
        super(3);
        this.$signUpState = signUpState;
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$$dirty = i11;
        this.$errorMessage = errorMessage;
        this.$isReadyToSignUp = z11;
        this.$onSignUpClick = aVar;
        this.$keyboardController = n1Var;
        this.$phoneNumberController = phoneNumberController;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i ScrollableTopLevelColumn, c1.i iVar, int i11) {
        int i12;
        int i13;
        s.g(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((i11 & 14) == 0) {
            i12 = i11 | (iVar.O(ScrollableTopLevelColumn) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        SignUpState signUpState = this.$signUpState;
        SignUpState signUpState2 = SignUpState.InputtingPhone;
        if (signUpState == signUpState2) {
            i13 = R.string.sign_up_header_new_user;
        } else {
            i13 = R.string.sign_up_header;
        }
        String b11 = k2.e.b(i13, iVar, 0);
        f.a aVar = f.f42062f1;
        float f11 = 4;
        f j11 = p0.u.j(aVar, BitmapDescriptorFactory.HUE_RED, g.f(f11), 1, null);
        d.a aVar2 = w2.d.f55400b;
        int a11 = aVar2.a();
        h0 h0Var = h0.f58131a;
        o1.b(b11, j11, h0Var.a(iVar, 8).g(), 0L, null, null, null, 0L, null, w2.d.g(a11), 0L, 0, false, 0, null, h0Var.c(iVar, 8).g(), iVar, 48, 0, 32248);
        o1.b(k2.e.c(R.string.sign_up_message, new Object[]{this.$merchantName}, iVar, 64), p0.u.l(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(f11), BitmapDescriptorFactory.HUE_RED, g.f(30), 5, null), h0Var.a(iVar, 8).h(), 0L, null, null, null, 0L, null, w2.d.g(aVar2.a()), 0L, 0, false, 0, null, h0Var.c(iVar, 8).c(), iVar, 48, 0, 32248);
        ColorKt.PaymentsThemeForLink(c.b(iVar, -819891076, true, new AnonymousClass1(this.$emailController, this.$signUpState, this.$$dirty)), iVar, 6);
        k0.c.b(ScrollableTopLevelColumn, this.$signUpState == signUpState2, null, null, null, null, c.b(iVar, -819891555, true, new AnonymousClass2(this.$errorMessage, this.$isReadyToSignUp, this.$onSignUpClick, this.$keyboardController, this.$$dirty, this.$phoneNumberController)), iVar, (i12 & 14) | 1572864, 30);
    }
}