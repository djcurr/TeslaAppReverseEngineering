package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import c1.n1;
import c1.v1;
import j1.c;
import java.util.Arrays;
import java.util.List;
import k2.e;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class SectionElementUIKt {
    public static final void SectionElementUI(boolean z11, SectionElement element, List<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, i iVar, int i11) {
        s.g(element, "element");
        s.g(hiddenIdentifiers, "hiddenIdentifiers");
        i h11 = iVar.h(1964617366);
        if (!hiddenIdentifiers.contains(element.getIdentifier())) {
            SectionController controller = element.getController();
            FieldError m475SectionElementUI$lambda0 = m475SectionElementUI$lambda0(n1.a(controller.getError(), null, null, h11, 56, 2));
            h11.x(1964617736);
            if (m475SectionElementUI$lambda0 != null) {
                Object[] formatArgs = m475SectionElementUI$lambda0.getFormatArgs();
                h11.x(1964617769);
                r2 = formatArgs != null ? e.c(m475SectionElementUI$lambda0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), h11, 64) : null;
                h11.N();
                if (r2 == null) {
                    r2 = e.b(m475SectionElementUI$lambda0.getErrorMessage(), h11, 0);
                }
            }
            String str = r2;
            h11.N();
            SectionUIKt.Section(controller.getLabel(), str, null, c.b(h11, -819895686, true, new SectionElementUIKt$SectionElementUI$1(element, z11, hiddenIdentifiers, identifierSpec, i11)), h11, 3072, 4);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SectionElementUIKt$SectionElementUI$2(z11, element, hiddenIdentifiers, identifierSpec, i11));
    }

    /* renamed from: SectionElementUI$lambda-0  reason: not valid java name */
    private static final FieldError m475SectionElementUI$lambda0(v1<FieldError> v1Var) {
        return v1Var.getValue();
    }
}