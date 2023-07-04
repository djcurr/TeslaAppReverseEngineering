package com.stripe.android.ui.core.elements;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;
import wz.w;
import x2.g;
import y0.h0;

/* loaded from: classes6.dex */
final class SectionElementUIKt$SectionElementUI$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SectionElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ List<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionElementUIKt$SectionElementUI$1(SectionElement sectionElement, boolean z11, List<IdentifierSpec> list, IdentifierSpec identifierSpec, int i11) {
        super(2);
        this.$element = sectionElement;
        this.$enabled = z11;
        this.$hiddenIdentifiers = list;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$dirty = i11;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        int k11;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        List<SectionFieldElement> fields = this.$element.getFields();
        boolean z11 = this.$enabled;
        List<IdentifierSpec> list = this.$hiddenIdentifiers;
        IdentifierSpec identifierSpec = this.$lastTextFieldIdentifier;
        int i12 = this.$$dirty;
        SectionElement sectionElement = this.$element;
        int i13 = 0;
        for (Object obj : fields) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                w.s();
            }
            int i15 = i13;
            SectionFieldElementUIKt.SectionFieldElementUI(z11, (SectionFieldElement) obj, null, list, identifierSpec, iVar, (i12 & 14) | 4096 | (57344 & (i12 << 3)), 4);
            k11 = w.k(sectionElement.getFields());
            if (i15 != k11) {
                h0 h0Var = h0.f58131a;
                y0.w.a(p0.u.j(f.f42062f1, g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, iVar, 8).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, null), PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m383getComponentDivider0d7_KjU(), g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, iVar, 8).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, iVar, 0, 8);
            }
            i13 = i14;
        }
    }
}