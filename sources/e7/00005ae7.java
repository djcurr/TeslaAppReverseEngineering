package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import c1.n1;
import c1.o0;
import c1.v1;
import j1.c;
import java.util.Arrays;
import k2.e;
import kotlin.jvm.internal.s;
import s2.k0;

/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt {
    public static final void PhoneNumberCollectionSection(boolean z11, PhoneNumberController phoneNumberController, Integer num, boolean z12, i iVar, int i11, int i12) {
        s.g(phoneNumberController, "phoneNumberController");
        i h11 = iVar.h(-1601258975);
        Integer num2 = (i12 & 4) != 0 ? null : num;
        boolean z13 = (i12 & 8) != 0 ? false : z12;
        FieldError m455PhoneNumberCollectionSection$lambda0 = m455PhoneNumberCollectionSection$lambda0(n1.a(phoneNumberController.getError(), null, null, h11, 56, 2));
        h11.x(-1601258677);
        if (m455PhoneNumberCollectionSection$lambda0 != null) {
            Object[] formatArgs = m455PhoneNumberCollectionSection$lambda0.getFormatArgs();
            h11.x(-1601258648);
            r3 = formatArgs != null ? e.c(m455PhoneNumberCollectionSection$lambda0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), h11, 64) : null;
            h11.N();
            if (r3 == null) {
                r3 = e.b(m455PhoneNumberCollectionSection$lambda0.getErrorMessage(), h11, 0);
            }
        }
        String str = r3;
        h11.N();
        SectionUIKt.Section(num2, str, null, c.b(h11, -819892714, true, new PhoneNumberElementUIKt$PhoneNumberCollectionSection$1(z11, phoneNumberController, z13, i11)), h11, ((i11 >> 6) & 14) | 3072, 4);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PhoneNumberElementUIKt$PhoneNumberCollectionSection$2(z11, phoneNumberController, num2, z13, i11, i12));
    }

    /* renamed from: PhoneNumberCollectionSection$lambda-0  reason: not valid java name */
    private static final FieldError m455PhoneNumberCollectionSection$lambda0(v1<FieldError> v1Var) {
        return v1Var.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0295, code lost:
        if ((!r3) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PhoneNumberElementUI(boolean r49, com.stripe.android.ui.core.elements.PhoneNumberController r50, boolean r51, c1.i r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberElementUIKt.PhoneNumberElementUI(boolean, com.stripe.android.ui.core.elements.PhoneNumberController, boolean, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-11  reason: not valid java name */
    public static final boolean m456PhoneNumberElementUI$lambda11(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-12  reason: not valid java name */
    public static final void m457PhoneNumberElementUI$lambda12(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: PhoneNumberElementUI$lambda-3  reason: not valid java name */
    private static final int m458PhoneNumberElementUI$lambda3(v1<Integer> v1Var) {
        return v1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-4  reason: not valid java name */
    public static final String m459PhoneNumberElementUI$lambda4(v1<String> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: PhoneNumberElementUI$lambda-5  reason: not valid java name */
    private static final FieldError m460PhoneNumberElementUI$lambda5(v1<FieldError> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-6  reason: not valid java name */
    public static final int m461PhoneNumberElementUI$lambda6(v1<Integer> v1Var) {
        return v1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-7  reason: not valid java name */
    public static final String m462PhoneNumberElementUI$lambda7(v1<String> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PhoneNumberElementUI$lambda-8  reason: not valid java name */
    public static final String m463PhoneNumberElementUI$lambda8(v1<String> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: PhoneNumberElementUI$lambda-9  reason: not valid java name */
    private static final k0 m464PhoneNumberElementUI$lambda9(v1<? extends k0> v1Var) {
        return v1Var.getValue();
    }
}