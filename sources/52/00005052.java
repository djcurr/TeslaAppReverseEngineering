package com.stripe.android.link.ui.verification;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import c1.h;
import c1.r;
import c1.w0;
import c1.x0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.OTPElement;
import com.stripe.android.ui.core.elements.OTPElementUIKt;
import f2.z;
import h00.a;
import h00.p;
import h00.q;
import h2.a;
import j1.c;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import n2.a0;
import o1.f;
import p0.a;
import p0.d0;
import p0.e0;
import p0.i;
import vz.b0;
import w2.d;
import x2.g;
import y0.h0;
import y0.n;
import y0.o;
import y0.o1;

/* loaded from: classes6.dex */
final class VerificationScreenKt$VerificationBody$7 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $email;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ a<b0> $onChangeEmailClick;
    final /* synthetic */ a<b0> $onResendCodeClick;
    final /* synthetic */ OTPElement $otpElement;
    final /* synthetic */ String $redactedPhoneNumber;
    final /* synthetic */ boolean $showChangeEmailMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$7$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $isProcessing;
        final /* synthetic */ OTPElement $otpElement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z11, OTPElement oTPElement, int i11) {
            super(2);
            this.$isProcessing = z11;
            this.$otpElement = oTPElement;
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
                OTPElementUIKt.OTPElementUI(!this.$isProcessing, this.$otpElement, p0.u.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(10), 1, null), iVar, (OTPElement.$stable << 3) | 384 | ((this.$$dirty >> 12) & 112), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$7(int i11, int i12, int i13, String str, boolean z11, ErrorMessage errorMessage, boolean z12, a<b0> aVar, OTPElement oTPElement, String str2, a<b0> aVar2) {
        super(3);
        this.$headerStringResId = i11;
        this.$$dirty = i12;
        this.$messageStringResId = i13;
        this.$redactedPhoneNumber = str;
        this.$showChangeEmailMessage = z11;
        this.$errorMessage = errorMessage;
        this.$isProcessing = z12;
        this.$onResendCodeClick = aVar;
        this.$otpElement = oTPElement;
        this.$email = str2;
        this.$onChangeEmailClick = aVar2;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public final void invoke(i ScrollableTopLevelColumn, c1.i iVar, int i11) {
        h0 h0Var;
        f.a aVar;
        ?? r102;
        float c11;
        s.g(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        String b11 = e.b(this.$headerStringResId, iVar, this.$$dirty & 14);
        f.a aVar2 = f.f42062f1;
        float f11 = 4;
        f j11 = p0.u.j(aVar2, BitmapDescriptorFactory.HUE_RED, g.f(f11), 1, null);
        d.a aVar3 = d.f55400b;
        int a11 = aVar3.a();
        h0 h0Var2 = h0.f58131a;
        o1.b(b11, j11, h0Var2.a(iVar, 8).g(), 0L, null, null, null, 0L, null, d.g(a11), 0L, 0, false, 0, null, h0Var2.c(iVar, 8).g(), iVar, 48, 0, 32248);
        o1.b(e.c(this.$messageStringResId, new Object[]{this.$redactedPhoneNumber}, iVar, ((this.$$dirty >> 3) & 14) | 64), p0.u.l(e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(f11), BitmapDescriptorFactory.HUE_RED, g.f(20), 5, null), h0Var2.a(iVar, 8).h(), 0L, null, null, null, 0L, null, d.g(aVar3.a()), 0L, 0, false, 0, null, h0Var2.c(iVar, 8).c(), iVar, 48, 0, 32248);
        PaymentsThemeKt.DefaultPaymentsTheme(c.b(iVar, -819892150, true, new AnonymousClass1(this.$isProcessing, this.$otpElement, this.$$dirty)), iVar, 6);
        iVar.x(-2101866153);
        if (this.$showChangeEmailMessage) {
            f j12 = p0.u.j(e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(14), 1, null);
            a.e b12 = p0.a.f45228a.b();
            String str = this.$email;
            boolean z11 = this.$isProcessing;
            h00.a<b0> aVar4 = this.$onChangeEmailClick;
            iVar.x(-1989997165);
            z b13 = p0.b0.b(b12, o1.a.f42039a.i(), iVar, 6);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar = (x2.q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            q<g1<h2.a>, c1.i, Integer, b0> b14 = f2.u.b(j12);
            if (!(iVar.k() instanceof c1.e)) {
                h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            c1.i a13 = a2.a(iVar);
            a2.c(a13, b13, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b14.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-326682362);
            d0 d0Var = d0.f45271a;
            aVar = aVar2;
            o1.b(e.c(R.string.verification_not_email, new Object[]{str}, iVar, 64), null, h0Var2.a(iVar, 8).h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var2.c(iVar, 8).d(), iVar, 0, 0, 32762);
            h0Var = h0Var2;
            o1.b(e.b(R.string.verification_change_email, iVar, 0), m0.h.e(p0.u.l(aVar, g.f(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), !z11, null, null, aVar4, 6, null), h0Var2.a(iVar, 8).h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var2.c(iVar, 8).d().w(new a0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, w2.e.f55408b.d(), null, null, null, 0L, null, 258047, null)), iVar, 0, 0, 32760);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        } else {
            h0Var = h0Var2;
            aVar = aVar2;
        }
        iVar.N();
        ErrorMessage errorMessage = this.$errorMessage;
        iVar.x(-2101865026);
        if (errorMessage == null) {
            r102 = 0;
        } else {
            Resources resources = ((Context) iVar.A(androidx.compose.ui.platform.z.g())).getResources();
            s.f(resources, "LocalContext.current.resources");
            r102 = 0;
            CommonKt.ErrorText(errorMessage.getMessage(resources), iVar, 0);
            b0 b0Var = b0.f54756a;
        }
        iVar.N();
        h0 h0Var3 = h0Var;
        f e11 = m0.h.e(m0.d.g(p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(12), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), g.f(1), ThemeKt.getLinkColors(h0Var3, iVar, 8).m190getComponentBorder0d7_KjU(), h0Var3.b(iVar, 8).e()), !this.$isProcessing, null, null, this.$onResendCodeClick, 6, null);
        o1.a d11 = o1.a.f42039a.d();
        boolean z12 = this.$isProcessing;
        iVar.x(-1990474327);
        z i12 = p0.c.i(d11, r102, iVar, 6);
        iVar.x(1376089394);
        x2.d dVar2 = (x2.d) iVar.A(l0.d());
        x2.q qVar2 = (x2.q) iVar.A(l0.i());
        y1 y1Var2 = (y1) iVar.A(l0.m());
        a.C0551a c0551a2 = h2.a.Y0;
        h00.a<h2.a> a14 = c0551a2.a();
        q<g1<h2.a>, c1.i, Integer, b0> b15 = f2.u.b(e11);
        if (!(iVar.k() instanceof c1.e)) {
            h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a14);
        } else {
            iVar.o();
        }
        iVar.E();
        c1.i a15 = a2.a(iVar);
        a2.c(a15, i12, c0551a2.d());
        a2.c(a15, dVar2, c0551a2.b());
        a2.c(a15, qVar2, c0551a2.c());
        a2.c(a15, y1Var2, c0551a2.f());
        iVar.c();
        b15.invoke(g1.a(g1.b(iVar)), iVar, Integer.valueOf((int) r102));
        iVar.x(2058660585);
        iVar.x(-1253629305);
        p0.d dVar3 = p0.d.f45270a;
        x0[] x0VarArr = new x0[1];
        w0<Float> a16 = o.a();
        if (z12) {
            iVar.x(-2048607344);
            c11 = n.f58482a.b(iVar, 8);
        } else {
            iVar.x(-2048607317);
            c11 = n.f58482a.c(iVar, 8);
        }
        iVar.N();
        x0VarArr[r102] = a16.c(Float.valueOf(c11));
        r.a(x0VarArr, ComposableSingletons$VerificationScreenKt.INSTANCE.m235getLambda3$link_release(), iVar, 56);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}