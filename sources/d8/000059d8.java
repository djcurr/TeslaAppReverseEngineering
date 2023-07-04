package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.R;
import h00.a;
import h00.p;
import k2.c;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import m0.o;
import o1.f;
import p0.e0;
import t1.a0;
import t1.b0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
final class AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Context $context;
    final /* synthetic */ AfterpayClearpayHeaderElement $element;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements a<b0> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AfterpayClearpayHeaderElement $element;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, AfterpayClearpayHeaderElement afterpayClearpayHeaderElement) {
            super(0);
            this.$context = context;
            this.$element = afterpayClearpayHeaderElement;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo11invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.$element.getInfoUrl())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, Context context, boolean z11, int i11) {
        super(2);
        this.$element = afterpayClearpayHeaderElement;
        this.$context = context;
        this.$enabled = z11;
        this.$$dirty = i11;
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
            return;
        }
        AfterpayClearpayHeaderElement afterpayClearpayHeaderElement = this.$element;
        Resources resources = this.$context.getResources();
        s.f(resources, "context.resources");
        String label = afterpayClearpayHeaderElement.getLabel(resources);
        f.a aVar = f.f42062f1;
        float f11 = 4;
        f l11 = p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(f11), BitmapDescriptorFactory.HUE_RED, 11, null);
        h0 h0Var = h0.f58131a;
        o1.b(label, l11, PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m386getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 48, 0, 65528);
        o.a(c.c(R.drawable.stripe_ic_afterpay_clearpay_logo, iVar, 0), e.b(R.string.afterpay_clearpay_message, iVar, 0), null, null, null, BitmapDescriptorFactory.HUE_RED, PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(h0Var.a(iVar, 8).n()) ? null : b0.a.b(t1.b0.f51384b, a0.f51365b.g(), 0, 2, null), iVar, 8, 60);
        y0.f.c(new AnonymousClass1(this.$context, this.$element), e0.v(aVar, g.f(32)), this.$enabled, null, null, null, null, null, p0.u.a(g.f(f11)), ComposableSingletons$AfterpayClearpayElementUIKt.INSTANCE.m434getLambda1$payments_ui_core_release(), iVar, 905969712 | ((this.$$dirty << 6) & 896), 248);
    }
}