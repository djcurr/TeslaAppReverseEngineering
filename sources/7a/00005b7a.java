package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import c1.n1;
import c1.o0;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import j1.c;
import java.util.List;
import k0.h;
import k2.e;
import kotlin.jvm.internal.s;
import m0.o;
import t1.a0;
import w1.b;
import wz.u;
import y0.d0;
import y0.g1;
import y0.h0;
import y0.i1;
import y0.s0;

/* loaded from: classes6.dex */
public final class TextFieldUIKt {
    public static final void AnimatedIcons(List<TextFieldIcon.Trailing> icons, boolean z11, i iVar, int i11) {
        s.g(icons, "icons");
        i h11 = iVar.h(1307785121);
        if (icons.isEmpty()) {
            e1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new TextFieldUIKt$AnimatedIcons$1(icons, z11, i11));
            return;
        }
        h.a(m476AnimatedIcons$lambda16(n1.j(u.b0(icons), new TextFieldUIKt$AnimatedIcons$target$2(icons, null), h11, 0)), null, null, c.b(h11, -819889883, true, new TextFieldUIKt$AnimatedIcons$2(z11, i11)), h11, 3072, 6);
        e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new TextFieldUIKt$AnimatedIcons$3(icons, z11, i11));
    }

    /* renamed from: AnimatedIcons$lambda-16  reason: not valid java name */
    private static final TextFieldIcon.Trailing m476AnimatedIcons$lambda16(v1<TextFieldIcon.Trailing> v1Var) {
        return v1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: TextField-PwfN4xk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m477TextFieldPwfN4xk(com.stripe.android.ui.core.elements.TextFieldController r44, o1.f r45, int r46, boolean r47, h00.l<? super com.stripe.android.ui.core.elements.TextFieldState, vz.b0> r48, c1.i r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.TextFieldUIKt.m477TextFieldPwfN4xk(com.stripe.android.ui.core.elements.TextFieldController, o1.f, int, boolean, h00.l, c1.i, int, int):void");
    }

    public static final g1 TextFieldColors(boolean z11, i iVar, int i11, int i12) {
        long m384getOnComponent0d7_KjU;
        iVar.x(-1196269054);
        boolean z12 = (i12 & 1) != 0 ? false : z11;
        i1 i1Var = i1.f58144a;
        if (z12) {
            iVar.x(-1196268920);
            m384getOnComponent0d7_KjU = h0.f58131a.a(iVar, 8).d();
            iVar.N();
        } else {
            iVar.x(-1196268872);
            m384getOnComponent0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m384getOnComponent0d7_KjU();
            iVar.N();
        }
        long j11 = m384getOnComponent0d7_KjU;
        h0 h0Var = h0.f58131a;
        long m385getPlaceholderText0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m385getPlaceholderText0d7_KjU();
        long m385getPlaceholderText0d7_KjU2 = PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m385getPlaceholderText0d7_KjU();
        long m385getPlaceholderText0d7_KjU3 = PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m385getPlaceholderText0d7_KjU();
        long m381getComponent0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m381getComponent0d7_KjU();
        a0.a aVar = a0.f51365b;
        g1 c11 = i1Var.c(j11, 0L, m381getComponent0d7_KjU, PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m387getTextCursor0d7_KjU(), 0L, aVar.e(), aVar.e(), aVar.e(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, m385getPlaceholderText0d7_KjU2, m385getPlaceholderText0d7_KjU, 0L, 0L, m385getPlaceholderText0d7_KjU3, 0L, iVar, 14352384, 0, 64, 1474322);
        iVar.N();
        return c11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: TextFieldSection-VyDzSTg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m478TextFieldSectionVyDzSTg(com.stripe.android.ui.core.elements.TextFieldController r19, o1.f r20, java.lang.Integer r21, int r22, boolean r23, h00.l<? super com.stripe.android.ui.core.elements.TextFieldState, vz.b0> r24, c1.i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.TextFieldUIKt.m478TextFieldSectionVyDzSTg(com.stripe.android.ui.core.elements.TextFieldController, o1.f, java.lang.Integer, int, boolean, h00.l, c1.i, int, int):void");
    }

    /* renamed from: TextFieldSection_VyDzSTg$lambda-0  reason: not valid java name */
    private static final FieldError m479TextFieldSection_VyDzSTg$lambda0(v1<FieldError> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: TextField_PwfN4xk$lambda-10  reason: not valid java name */
    private static final TextFieldState m480TextField_PwfN4xk$lambda10(v1<? extends TextFieldState> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-11  reason: not valid java name */
    public static final Integer m481TextField_PwfN4xk$lambda11(v1<Integer> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: TextField_PwfN4xk$lambda-12  reason: not valid java name */
    private static final boolean m482TextField_PwfN4xk$lambda12(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* renamed from: TextField_PwfN4xk$lambda-13  reason: not valid java name */
    private static final void m483TextField_PwfN4xk$lambda13(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-3  reason: not valid java name */
    public static final String m484TextField_PwfN4xk$lambda3(v1<String> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: TextField_PwfN4xk$lambda-4  reason: not valid java name */
    private static final TextFieldIcon m485TextField_PwfN4xk$lambda4(v1<? extends TextFieldIcon> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: TextField_PwfN4xk$lambda-5  reason: not valid java name */
    private static final boolean m486TextField_PwfN4xk$lambda5(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-6  reason: not valid java name */
    public static final boolean m487TextField_PwfN4xk$lambda6(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-7  reason: not valid java name */
    public static final String m488TextField_PwfN4xk$lambda7(v1<String> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-8  reason: not valid java name */
    public static final boolean m489TextField_PwfN4xk$lambda8(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TextField_PwfN4xk$lambda-9  reason: not valid java name */
    public static final void m490TextField_PwfN4xk$lambda9(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    public static final void TrailingIcon(TextFieldIcon.Trailing trailingIcon, boolean z11, i iVar, int i11) {
        int i12;
        s.g(trailingIcon, "trailingIcon");
        i h11 = iVar.h(2026351439);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(trailingIcon) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else if (z11) {
            h11.x(2026351541);
            s0.a(null, 0L, BitmapDescriptorFactory.HUE_RED, h11, 0, 7);
            h11.N();
        } else {
            String str = null;
            if (trailingIcon.isTintable()) {
                h11.x(2026351619);
                b c11 = k2.c.c(trailingIcon.getIdRes(), h11, 0);
                Integer contentDescription = trailingIcon.getContentDescription();
                if (contentDescription != null) {
                    contentDescription.intValue();
                    str = e.b(trailingIcon.getContentDescription().intValue(), h11, 0);
                }
                d0.a(c11, str, null, 0L, h11, 8, 12);
                h11.N();
            } else {
                h11.x(2026351870);
                b c12 = k2.c.c(trailingIcon.getIdRes(), h11, 0);
                Integer contentDescription2 = trailingIcon.getContentDescription();
                if (contentDescription2 != null) {
                    contentDescription2.intValue();
                    str = e.b(trailingIcon.getContentDescription().intValue(), h11, 0);
                }
                o.a(c12, str, null, null, null, BitmapDescriptorFactory.HUE_RED, null, h11, 8, 124);
                h11.N();
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new TextFieldUIKt$TrailingIcon$3(trailingIcon, z11, i11));
    }
}