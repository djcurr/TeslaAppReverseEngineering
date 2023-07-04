package com.stripe.android.link.ui.inline;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.ui.signup.SignUpScreenKt;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import f2.z;
import h00.q;
import h2.a;
import k0.c;
import k0.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.a;
import p0.e0;
import p0.h;
import p0.j;
import vz.b0;
import x2.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3 extends u implements q<d, i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3(boolean z11, TextFieldController textFieldController, SignUpState signUpState, int i11, PhoneNumberController phoneNumberController) {
        super(3);
        this.$enabled = z11;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$$dirty = i11;
        this.$phoneNumberController = phoneNumberController;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(d dVar, i iVar, Integer num) {
        invoke(dVar, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(d AnimatedVisibility, i iVar, int i11) {
        s.g(AnimatedVisibility, "$this$AnimatedVisibility");
        f l11 = p0.u.l(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(16), 7, null);
        boolean z11 = this.$enabled;
        TextFieldController textFieldController = this.$emailController;
        SignUpState signUpState = this.$signUpState;
        int i12 = this.$$dirty;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        iVar.x(-1113030915);
        z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
        iVar.x(1376089394);
        x2.d dVar = (x2.d) iVar.A(l0.d());
        x2.q qVar = (x2.q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(l11);
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
        SignUpScreenKt.EmailCollectionSection(z11, textFieldController, signUpState, iVar, ((i12 >> 12) & 14) | 64 | ((i12 >> 3) & 896));
        c.b(jVar, signUpState == SignUpState.InputtingPhone, null, null, null, null, j1.c.b(iVar, -819889354, true, new LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3$1$1(z11, phoneNumberController, i12)), iVar, 1572870, 30);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}