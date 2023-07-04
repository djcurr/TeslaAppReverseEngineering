package com.stripe.android.ui.core;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.n1;
import c1.v1;
import com.stripe.android.ui.core.elements.AffirmElementUIKt;
import com.stripe.android.ui.core.elements.AffirmHeaderElement;
import com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt;
import com.stripe.android.ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUIKt;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateTextElement;
import com.stripe.android.ui.core.elements.BsbElement;
import com.stripe.android.ui.core.elements.BsbElementUIKt;
import com.stripe.android.ui.core.elements.CardDetailsSectionElement;
import com.stripe.android.ui.core.elements.CardDetailsSectionElementUIKt;
import com.stripe.android.ui.core.elements.EmptyFormElement;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.MandateTextElement;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.ui.core.elements.OTPElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.ui.core.elements.SectionElement;
import com.stripe.android.ui.core.elements.SectionElementUIKt;
import com.stripe.android.ui.core.elements.StaticTextElement;
import com.stripe.android.ui.core.elements.StaticTextElementUIKt;
import f2.u;
import f2.z;
import h00.q;
import h2.a;
import j1.c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import o1.f;
import p0.a;
import p0.e0;
import p0.h;
import p0.i;
import p0.j;
import vz.b0;
import wz.w;
import x2.d;

/* loaded from: classes6.dex */
public final class FormUIKt {
    public static final void FormUI(e<? extends List<IdentifierSpec>> hiddenIdentifiersFlow, e<Boolean> enabledFlow, e<? extends List<? extends FormElement>> elementsFlow, e<IdentifierSpec> lastTextFieldIdentifierFlow, q<? super i, ? super c1.i, ? super Integer, b0> loadingComposable, c1.i iVar, int i11) {
        List i12;
        Iterator it2;
        int i13;
        s.g(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        s.g(enabledFlow, "enabledFlow");
        s.g(elementsFlow, "elementsFlow");
        s.g(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        s.g(loadingComposable, "loadingComposable");
        c1.i h11 = iVar.h(263759814);
        i12 = w.i();
        v1 a11 = n1.a(hiddenIdentifiersFlow, i12, null, h11, 8, 2);
        v1 a12 = n1.a(enabledFlow, Boolean.TRUE, null, h11, 56, 2);
        v1 a13 = n1.a(elementsFlow, null, null, h11, 56, 2);
        v1 a14 = n1.a(lastTextFieldIdentifierFlow, null, null, h11, 56, 2);
        f m11 = e0.m(f.f42062f1, 1.0f);
        h11.x(-1113030915);
        z a15 = h.a(a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        x2.q qVar = (x2.q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a16 = c0551a.a();
        q<g1<h2.a>, c1.i, Integer, b0> b11 = u.b(m11);
        if (!(h11.k() instanceof c1.e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a16);
        } else {
            h11.o();
        }
        h11.E();
        c1.i a17 = a2.a(h11);
        a2.c(a17, a15, c0551a.d());
        a2.c(a17, dVar, c0551a.b());
        a2.c(a17, qVar, c0551a.c());
        a2.c(a17, y1Var, c0551a.f());
        h11.c();
        int i14 = 0;
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        List<FormElement> m366FormUI$lambda2 = m366FormUI$lambda2(a13);
        h11.x(2038516813);
        if (m366FormUI$lambda2 != null) {
            Iterator it3 = m366FormUI$lambda2.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    w.s();
                }
                FormElement formElement = (FormElement) next;
                if (m364FormUI$lambda0(a11).contains(formElement.getIdentifier())) {
                    it2 = it3;
                    i13 = i14;
                } else if (formElement instanceof SectionElement) {
                    h11.x(1292326108);
                    it2 = it3;
                    i13 = i14;
                    SectionElementUIKt.SectionElementUI(m365FormUI$lambda1(a12), (SectionElement) formElement, m364FormUI$lambda0(a11), m367FormUI$lambda3(a14), h11, 576);
                    h11.N();
                } else {
                    it2 = it3;
                    i13 = i14;
                    if (formElement instanceof StaticTextElement) {
                        h11.x(1292326373);
                        StaticTextElementUIKt.StaticElementUI((StaticTextElement) formElement, h11, i13);
                        h11.N();
                    } else if (formElement instanceof SaveForFutureUseElement) {
                        h11.x(1292326452);
                        SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(m365FormUI$lambda1(a12), (SaveForFutureUseElement) formElement, h11, 64);
                        h11.N();
                    } else if (formElement instanceof AfterpayClearpayHeaderElement) {
                        h11.x(1292326556);
                        AfterpayClearpayElementUIKt.AfterpayClearpayElementUI(m365FormUI$lambda1(a12), (AfterpayClearpayHeaderElement) formElement, h11, i13);
                        h11.N();
                    } else if (formElement instanceof AuBecsDebitMandateTextElement) {
                        h11.x(1292326742);
                        AuBecsDebitMandateElementUIKt.AuBecsDebitMandateElementUI((AuBecsDebitMandateTextElement) formElement, h11, i13);
                        h11.N();
                    } else if (formElement instanceof AffirmHeaderElement) {
                        h11.x(1292326829);
                        AffirmElementUIKt.AffirmElementUI(h11, i13);
                        h11.N();
                    } else if (formElement instanceof MandateTextElement) {
                        h11.x(1292326896);
                        MandateTextUIKt.MandateTextUI((MandateTextElement) formElement, h11, i13);
                        h11.N();
                    } else if (formElement instanceof CardDetailsSectionElement) {
                        h11.x(1292326975);
                        CardDetailsSectionElementUIKt.CardDetailsSectionElementUI(m365FormUI$lambda1(a12), ((CardDetailsSectionElement) formElement).getController(), m364FormUI$lambda0(a11), h11, 576);
                        h11.N();
                    } else if (formElement instanceof BsbElement) {
                        h11.x(1292327146);
                        BsbElementUIKt.BsbElementUI(m365FormUI$lambda1(a12), (BsbElement) formElement, m367FormUI$lambda3(a14), h11, 64);
                        h11.N();
                    } else if (formElement instanceof OTPElement) {
                        h11.x(1292327243);
                        PaymentsThemeKt.DefaultPaymentsTheme(c.b(h11, -819893837, true, new FormUIKt$FormUI$1$1$1$1(formElement, a12)), h11, 6);
                        h11.N();
                    } else if (formElement instanceof EmptyFormElement) {
                        h11.x(1292327398);
                        h11.N();
                    } else {
                        h11.x(1292327422);
                        h11.N();
                    }
                }
                i14 = i13;
                i15 = i16;
                it3 = it2;
            }
        }
        h11.N();
        b0 b0Var = b0.f54756a;
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new FormUIKt$FormUI$2(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, loadingComposable, i11));
    }

    /* renamed from: FormUI$lambda-0  reason: not valid java name */
    private static final List<IdentifierSpec> m364FormUI$lambda0(v1<? extends List<IdentifierSpec>> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FormUI$lambda-1  reason: not valid java name */
    public static final boolean m365FormUI$lambda1(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: FormUI$lambda-2  reason: not valid java name */
    private static final List<FormElement> m366FormUI$lambda2(v1<? extends List<? extends FormElement>> v1Var) {
        return (List) v1Var.getValue();
    }

    /* renamed from: FormUI$lambda-3  reason: not valid java name */
    private static final IdentifierSpec m367FormUI$lambda3(v1<IdentifierSpec> v1Var) {
        return v1Var.getValue();
    }
}