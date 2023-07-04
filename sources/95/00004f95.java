package com.stripe.android.link.ui.cardedit;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import f2.z;
import h00.a;
import h00.l;
import h00.p;
import h00.q;
import h2.a;
import j1.c;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import m0.h;
import o1.f;
import p0.d0;
import p0.e0;
import p0.i;
import vz.b0;
import w2.d;
import x2.g;
import y0.h0;
import y0.j;
import y0.k;
import y0.o1;

/* loaded from: classes6.dex */
final class CardEditScreenKt$CardEditBody$4 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ q<i, c1.i, Integer, b0> $formContent;
    final /* synthetic */ boolean $isDefault;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ a<b0> $onCancelClick;
    final /* synthetic */ a<b0> $onPrimaryButtonClick;
    final /* synthetic */ l<Boolean, b0> $onSetAsDefaultClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ boolean $setAsDefaultChecked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ q<i, c1.i, Integer, b0> $formContent;
        final /* synthetic */ i $this_ScrollableTopLevelColumn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super i, ? super c1.i, ? super Integer, b0> qVar, i iVar, int i11, int i12) {
            super(2);
            this.$formContent = qVar;
            this.$this_ScrollableTopLevelColumn = iVar;
            this.$$dirty = i11;
            this.$$dirty$1 = i12;
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
                this.$formContent.invoke(this.$this_ScrollableTopLevelColumn, iVar, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 21) & 112)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$4(boolean z11, l<? super Boolean, b0> lVar, boolean z12, int i11, ErrorMessage errorMessage, boolean z13, boolean z14, a<b0> aVar, a<b0> aVar2, q<? super i, ? super c1.i, ? super Integer, b0> qVar) {
        super(3);
        this.$isDefault = z11;
        this.$onSetAsDefaultClick = lVar;
        this.$setAsDefaultChecked = z12;
        this.$$dirty = i11;
        this.$errorMessage = errorMessage;
        this.$isProcessing = z13;
        this.$primaryButtonEnabled = z14;
        this.$onPrimaryButtonClick = aVar;
        this.$onCancelClick = aVar2;
        this.$formContent = qVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i ScrollableTopLevelColumn, c1.i iVar, int i11) {
        int i12;
        c1.i iVar2;
        int i13;
        CardEditScreenKt$CardEditBody$4 cardEditScreenKt$CardEditBody$4;
        PrimaryButtonState primaryButtonState;
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
        int i14 = R.string.wallet_update_card;
        String b11 = e.b(i14, iVar, 0);
        f.a aVar = f.f42062f1;
        f l11 = p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(4), BitmapDescriptorFactory.HUE_RED, g.f(32), 5, null);
        int a11 = d.f55400b.a();
        h0 h0Var = h0.f58131a;
        o1.b(b11, l11, h0Var.a(iVar, 8).g(), 0L, null, null, null, 0L, null, d.g(a11), 0L, 0, false, 0, null, h0Var.c(iVar, 8).g(), iVar, 48, 0, 32248);
        ColorKt.PaymentsThemeForLink(c.b(iVar, -819891124, true, new AnonymousClass1(this.$formContent, ScrollableTopLevelColumn, i12, this.$$dirty)), iVar, 6);
        float f11 = 8;
        p0.h0.a(e0.o(aVar, g.f(f11)), iVar, 6);
        if (this.$isDefault) {
            iVar.x(-923311750);
            o1.b(e.b(R.string.pm_your_default, iVar, 0), p0.u.j(aVar, BitmapDescriptorFactory.HUE_RED, g.f(16), 1, null), ThemeKt.getLinkColors(h0Var, iVar, 8).m193getDisabledText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(iVar, 8).j(), iVar, 48, 0, 32760);
            iVar.N();
            cardEditScreenKt$CardEditBody$4 = this;
            i13 = 0;
            iVar2 = iVar;
        } else {
            iVar.x(-923311458);
            f j11 = p0.u.j(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(16), 1, null);
            l<Boolean, b0> lVar = this.$onSetAsDefaultClick;
            Boolean valueOf = Boolean.valueOf(this.$setAsDefaultChecked);
            l<Boolean, b0> lVar2 = this.$onSetAsDefaultClick;
            boolean z11 = this.$setAsDefaultChecked;
            iVar.x(-3686552);
            boolean O = iVar.O(lVar) | iVar.O(valueOf);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new CardEditScreenKt$CardEditBody$4$2$1(lVar2, z11);
                iVar.p(y11);
            }
            iVar.N();
            f e11 = h.e(j11, false, null, null, (a) y11, 7, null);
            boolean z12 = this.$setAsDefaultChecked;
            boolean z13 = this.$isProcessing;
            int i15 = this.$$dirty;
            iVar.x(-1989997165);
            z b12 = p0.b0.b(p0.a.f45228a.g(), o1.a.f42039a.i(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar = (x2.q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            q<g1<h2.a>, c1.i, Integer, b0> b13 = f2.u.b(e11);
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
            a2.c(a13, b12, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b13.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-326682362);
            d0 d0Var = d0.f45271a;
            k.a(z12, null, p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(f11), BitmapDescriptorFactory.HUE_RED, 11, null), !z13, null, j.f58147a.a(h0Var.a(iVar, 8).j(), ThemeKt.getLinkColors(h0Var, iVar, 8).m193getDisabledText0d7_KjU(), 0L, 0L, 0L, iVar, 262144, 28), iVar, ((i15 >> 6) & 14) | 432, 16);
            iVar2 = iVar;
            o1.b(e.b(R.string.pm_set_as_default, iVar, 0), null, h0Var.a(iVar, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(iVar, 8).j(), iVar, 0, 0, 32762);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
            iVar.N();
            i13 = 0;
            cardEditScreenKt$CardEditBody$4 = this;
        }
        ErrorMessage errorMessage = cardEditScreenKt$CardEditBody$4.$errorMessage;
        iVar2.x(-923310382);
        if (errorMessage != null) {
            Resources resources = ((Context) iVar2.A(androidx.compose.ui.platform.z.g())).getResources();
            s.f(resources, "LocalContext.current.resources");
            CommonKt.ErrorText(errorMessage.getMessage(resources), iVar2, i13);
            b0 b0Var = b0.f54756a;
        }
        iVar.N();
        String b14 = e.b(i14, iVar2, i13);
        if (cardEditScreenKt$CardEditBody$4.$isProcessing) {
            primaryButtonState = PrimaryButtonState.Processing;
        } else {
            primaryButtonState = cardEditScreenKt$CardEditBody$4.$primaryButtonEnabled ? PrimaryButtonState.Enabled : PrimaryButtonState.Disabled;
        }
        PrimaryButtonKt.PrimaryButton(b14, primaryButtonState, null, cardEditScreenKt$CardEditBody$4.$onPrimaryButtonClick, iVar, (cardEditScreenKt$CardEditBody$4.$$dirty >> 9) & 7168, 4);
        PrimaryButtonKt.SecondaryButton(!cardEditScreenKt$CardEditBody$4.$isProcessing, e.b(R.string.cancel, iVar2, i13), cardEditScreenKt$CardEditBody$4.$onCancelClick, iVar2, (cardEditScreenKt$CardEditBody$4.$$dirty >> 15) & 896);
    }
}