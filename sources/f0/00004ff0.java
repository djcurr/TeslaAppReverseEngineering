package com.stripe.android.link.ui.inline;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.elements.menu.CheckboxKt;
import f2.z;
import h00.a;
import h00.p;
import h2.a;
import k0.c;
import kotlin.jvm.internal.u;
import m0.b;
import m0.d;
import n2.a0;
import o1.a;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.a;
import p0.d0;
import p0.e0;
import p0.h;
import p0.j;
import r2.l;
import vz.b0;
import x2.g;
import x2.q;
import y0.h0;
import y0.o;
import y0.o1;

/* loaded from: classes6.dex */
final class LinkInlineSignupViewKt$LinkInlineSignup$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ a<b0> $onUserInteracted;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpState $signUpState;
    final /* synthetic */ a<b0> $toggleExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupViewKt$LinkInlineSignup$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ String $merchantName;
        final /* synthetic */ a<b0> $onUserInteracted;
        final /* synthetic */ PhoneNumberController $phoneNumberController;
        final /* synthetic */ SignUpState $signUpState;
        final /* synthetic */ a<b0> $toggleExpanded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<b0> aVar, a<b0> aVar2, int i11, boolean z11, boolean z12, String str, TextFieldController textFieldController, SignUpState signUpState, PhoneNumberController phoneNumberController) {
            super(2);
            this.$toggleExpanded = aVar;
            this.$onUserInteracted = aVar2;
            this.$$dirty = i11;
            this.$expanded = z11;
            this.$enabled = z12;
            this.$merchantName = str;
            this.$emailController = textFieldController;
            this.$signUpState = signUpState;
            this.$phoneNumberController = phoneNumberController;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r63v0, types: [c1.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        public final void invoke(i iVar, int i11) {
            a0 b11;
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            f.a aVar = f.f42062f1;
            f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
            h0 h0Var = h0.f58131a;
            f a11 = b.a(d.f(n11, PaymentsThemeKt.getBorderStroke(h0Var, false, iVar, 56), h0Var.b(iVar, 8).d()), PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m381getComponent0d7_KjU(), h0Var.b(iVar, 8).d());
            a<b0> aVar2 = this.$toggleExpanded;
            a<b0> aVar3 = this.$onUserInteracted;
            int i12 = this.$$dirty;
            boolean z11 = this.$expanded;
            boolean z12 = this.$enabled;
            String str = this.$merchantName;
            TextFieldController textFieldController = this.$emailController;
            SignUpState signUpState = this.$signUpState;
            PhoneNumberController phoneNumberController = this.$phoneNumberController;
            iVar.x(-1113030915);
            p0.a aVar4 = p0.a.f45228a;
            a.k h11 = aVar4.h();
            a.C0826a c0826a = o1.a.f42039a;
            z a12 = h.a(h11, c0826a.h(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            q qVar = (q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a13 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(a11);
            if (!(iVar.k() instanceof e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a13);
            } else {
                iVar.o();
            }
            iVar.E();
            i a14 = a2.a(iVar);
            a2.c(a14, a12, c0551a.d());
            a2.c(a14, dVar, c0551a.b());
            a2.c(a14, qVar, c0551a.c());
            a2.c(a14, y1Var, c0551a.f());
            iVar.c();
            b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            j jVar = j.f45341a;
            float f11 = 16;
            f h12 = p0.u.h(aVar, g.f(f11));
            iVar.x(-3686552);
            boolean O = iVar.O(aVar2) | iVar.O(aVar3);
            Object y11 = iVar.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$1$1(aVar2, aVar3);
                iVar.p(y11);
            }
            iVar.N();
            f e11 = m0.h.e(h12, false, null, null, y11, 7, null);
            iVar.x(-1989997165);
            z b13 = p0.b0.b(aVar4.g(), c0826a.i(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar2 = (x2.d) iVar.A(l0.d());
            q qVar2 = (q) iVar.A(l0.i());
            y1 y1Var2 = (y1) iVar.A(l0.m());
            h00.a<h2.a> a15 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b14 = f2.u.b(e11);
            if (!(iVar.k() instanceof e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a15);
            } else {
                iVar.o();
            }
            iVar.E();
            i a16 = a2.a(iVar);
            a2.c(a16, b13, c0551a.d());
            a2.c(a16, dVar2, c0551a.b());
            a2.c(a16, qVar2, c0551a.c());
            a2.c(a16, y1Var2, c0551a.f());
            iVar.c();
            b14.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-326682362);
            d0 d0Var = d0.f45271a;
            CheckboxKt.Checkbox(z11, null, p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(8), BitmapDescriptorFactory.HUE_RED, 11, null), z12, iVar, ((i12 >> 15) & 14) | 432 | ((i12 >> 3) & 7168), 0);
            iVar.x(-1113030915);
            z a17 = h.a(aVar4.h(), c0826a.h(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar3 = (x2.d) iVar.A(l0.d());
            q qVar3 = (q) iVar.A(l0.i());
            y1 y1Var3 = (y1) iVar.A(l0.m());
            h00.a<h2.a> a18 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b15 = f2.u.b(aVar);
            if (!(iVar.k() instanceof e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a18);
            } else {
                iVar.o();
            }
            iVar.E();
            i a19 = a2.a(iVar);
            a2.c(a19, a17, c0551a.d());
            a2.c(a19, dVar3, c0551a.b());
            a2.c(a19, qVar3, c0551a.c());
            a2.c(a19, y1Var3, c0551a.f());
            iVar.c();
            b15.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            String b16 = k2.e.b(R.string.inline_sign_up_header, iVar, 0);
            b11 = r35.b((r44 & 1) != 0 ? r35.f() : 0L, (r44 & 2) != 0 ? r35.i() : 0L, (r44 & 4) != 0 ? r35.f40266c : l.f49091b.a(), (r44 & 8) != 0 ? r35.j() : null, (r44 & 16) != 0 ? r35.k() : null, (r44 & 32) != 0 ? r35.f40269f : null, (r44 & 64) != 0 ? r35.f40270g : null, (r44 & 128) != 0 ? r35.m() : 0L, (r44 & 256) != 0 ? r35.e() : null, (r44 & 512) != 0 ? r35.f40273j : null, (r44 & 1024) != 0 ? r35.f40274k : null, (r44 & 2048) != 0 ? r35.d() : 0L, (r44 & 4096) != 0 ? r35.f40276m : null, (r44 & PKIFailureInfo.certRevoked) != 0 ? r35.f40277n : null, (r44 & 16384) != 0 ? r35.q() : null, (r44 & 32768) != 0 ? r35.s() : null, (r44 & 65536) != 0 ? r35.n() : 0L, (r44 & 131072) != 0 ? h0Var.c(iVar, 8).c().f40281r : null);
            o1.b(b16, null, t1.a0.l(h0Var.a(iVar, 8).i(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b11, iVar, 0, 0, 32762);
            o1.b(k2.e.c(R.string.sign_up_message, new Object[]{str}, iVar, 64), p0.u.l(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), t1.a0.l(h0Var.a(iVar, 8).i(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(iVar, 8).c(), iVar, 48, 0, 32760);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
            c.b(jVar, z11, p0.u.j(aVar, g.f(f11), BitmapDescriptorFactory.HUE_RED, 2, null), null, null, null, j1.c.b(iVar, -819888642, true, new LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3(z12, textFieldController, signUpState, i12, phoneNumberController)), iVar, 1573254 | ((i12 >> 12) & 112), 28);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupViewKt$LinkInlineSignup$4(h00.a<b0> aVar, h00.a<b0> aVar2, int i11, boolean z11, boolean z12, String str, TextFieldController textFieldController, SignUpState signUpState, PhoneNumberController phoneNumberController) {
        super(2);
        this.$toggleExpanded = aVar;
        this.$onUserInteracted = aVar2;
        this.$$dirty = i11;
        this.$expanded = z11;
        this.$enabled = z12;
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$phoneNumberController = phoneNumberController;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819891112, true, new AnonymousClass1(this.$toggleExpanded, this.$onUserInteracted, this.$$dirty, this.$expanded, this.$enabled, this.$merchantName, this.$emailController, this.$signUpState, this.$phoneNumberController)), iVar, 3072, 7);
        }
    }
}