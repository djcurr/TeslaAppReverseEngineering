package com.stripe.android.paymentsheet;

import c1.e1;
import c1.i;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;
import v20.o0;

/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt {
    public static final float ADD_PM_DEFAULT_PADDING = 12.0f;
    public static final float CARD_HORIZONTAL_PADDING = 6.0f;
    public static final float PM_LIST_PADDING = 17.0f;
    public static final String TEST_TAG_LIST = "PaymentMethodsUITestTag";

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* renamed from: PaymentMethodUI-Z3Oy47U  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m297PaymentMethodUIZ3Oy47U(float r21, int r22, java.lang.String r23, boolean r24, boolean r25, boolean r26, int r27, o1.f r28, h00.l<? super java.lang.Integer, vz.b0> r29, c1.i r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentMethodsUIKt.m297PaymentMethodUIZ3Oy47U(float, int, java.lang.String, boolean, boolean, boolean, int, o1.f, h00.l, c1.i, int, int):void");
    }

    public static final void PaymentMethodsUI(List<? extends LpmRepository.SupportedPaymentMethod> paymentMethods, int i11, boolean z11, h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> onItemSelectedListener, c1.i iVar, int i12) {
        kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
        kotlin.jvm.internal.s.g(onItemSelectedListener, "onItemSelectedListener");
        c1.i h11 = iVar.h(-72766702);
        h11.x(-723524056);
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar = c1.i.f8486a;
        if (y11 == aVar.a()) {
            c1.s sVar = new c1.s(c1.b0.j(zz.h.f61280a, h11));
            h11.p(sVar);
            y11 = sVar;
        }
        h11.N();
        o0 a11 = ((c1.s) y11).a();
        h11.N();
        q0.h a12 = q0.i.a(0, 0, h11, 0, 3);
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i11);
        h11.x(-3686552);
        boolean O = h11.O(valueOf2) | h11.O(a12);
        Object y12 = h11.y();
        if (O || y12 == aVar.a()) {
            y12 = new PaymentMethodsUIKt$PaymentMethodsUI$1$1(a12, i11, null);
            h11.p(y12);
        }
        h11.N();
        c1.b0.d(valueOf, (h00.p) y12, h11, (i12 >> 3) & 14);
        c1.b0.d(Boolean.valueOf(z11), new PaymentMethodsUIKt$PaymentMethodsUI$2(z11, a12, a11, null), h11, (i12 >> 6) & 14);
        PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(h11, -819892650, true, new PaymentMethodsUIKt$PaymentMethodsUI$3(paymentMethods, a12, i11, z11, i12, onItemSelectedListener)), h11, 3072, 7);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PaymentMethodsUIKt$PaymentMethodsUI$4(paymentMethods, i11, z11, onItemSelectedListener, i12));
    }

    /* renamed from: calculateViewWidth-D5KLDUw  reason: not valid java name */
    public static final float m298calculateViewWidthD5KLDUw(float f11, int i11) {
        float f12;
        float f13 = x2.g.f(f11 - x2.g.f(x2.g.f(17.0f) * 2));
        float f14 = i11;
        if (x2.g.e(x2.g.f(x2.g.f(112.0f) * f14), f13) < 0) {
            return x2.g.f(f13 / f14);
        }
        return x2.g.f(f13 / ((int) (f13 / f12)));
    }

    public static /* synthetic */ void getTEST_TAG_LIST$annotations() {
    }
}