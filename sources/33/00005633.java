package com.stripe.android.paymentsheet.forms;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import f2.u;
import f2.z;
import h2.a;
import java.util.List;
import k2.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import o1.a;
import o1.f;
import p0.a;
import p0.b0;
import p0.d0;
import p0.e0;
import t1.a0;
import x2.q;
import y0.h0;
import y0.s0;

/* loaded from: classes6.dex */
public final class FormUIKt {
    public static final void Form(FormViewModel formViewModel, i iVar, int i11) {
        s.g(formViewModel, "formViewModel");
        i h11 = iVar.h(912692810);
        FormInternal(formViewModel.getHiddenIdentifiers$paymentsheet_release(), formViewModel.getEnabled$paymentsheet_release(), formViewModel.getElements$paymentsheet_release(), formViewModel.getLastTextFieldIdentifier(), h11, 4680);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new FormUIKt$Form$1(formViewModel, i11));
    }

    public static final void FormInternal(e<? extends List<IdentifierSpec>> hiddenIdentifiersFlow, e<Boolean> enabledFlow, e<? extends List<? extends FormElement>> elementsFlow, e<IdentifierSpec> lastTextFieldIdentifierFlow, i iVar, int i11) {
        s.g(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        s.g(enabledFlow, "enabledFlow");
        s.g(elementsFlow, "elementsFlow");
        s.g(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        i h11 = iVar.h(1241586940);
        com.stripe.android.ui.core.FormUIKt.FormUI(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, ComposableSingletons$FormUIKt.INSTANCE.m325getLambda1$paymentsheet_release(), h11, 29256);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new FormUIKt$FormInternal$1(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(i iVar, int i11) {
        i h11 = iVar.h(-60335772);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            f.a aVar = f.f42062f1;
            f n11 = e0.n(e0.o(aVar, d.a(R.dimen.stripe_paymentsheet_loading_container_height, h11, 0)), BitmapDescriptorFactory.HUE_RED, 1, null);
            a.c g11 = a.f42039a.g();
            a.e b11 = p0.a.f45228a.b();
            h11.x(-1989997165);
            z b12 = b0.b(b11, g11, h11, 54);
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b13 = u.b(n11);
            if (!(h11.k() instanceof c1.e)) {
                h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            i a12 = a2.a(h11);
            a2.c(a12, b12, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b13.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            boolean m396shouldUseDarkDynamicColor8_81llA = PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(h0.f58131a.a(h11, 8).n());
            s0.a(e0.v(aVar, d.a(R.dimen.stripe_paymentsheet_loading_indicator_size, h11, 0)), m396shouldUseDarkDynamicColor8_81llA ? a0.f51365b.a() : a0.f51365b.g(), d.a(R.dimen.stripe_paymentsheet_loading_indicator_stroke_width, h11, 0), h11, 0, 0);
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new FormUIKt$Loading$2(i11));
    }
}