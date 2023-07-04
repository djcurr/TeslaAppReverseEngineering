package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.i;
import c1.n1;
import c1.v1;
import f2.u;
import f2.z;
import h2.a;
import j1.c;
import java.util.Arrays;
import k2.e;
import kotlin.jvm.internal.s;
import o1.f;
import p0.a;
import p0.h;
import p0.j;
import vz.b0;
import x2.d;
import x2.q;

/* loaded from: classes6.dex */
public final class BsbElementUIKt {
    public static final void BsbElementUI(boolean z11, BsbElement element, IdentifierSpec identifierSpec, i iVar, int i11) {
        s.g(element, "element");
        i h11 = iVar.h(537894678);
        v1 a11 = n1.a(element.getTextElement$payments_ui_core_release().getController().getError(), null, null, h11, 56, 2);
        v1 a12 = n1.a(element.getBankName(), null, null, h11, 56, 2);
        FieldError m427BsbElementUI$lambda0 = m427BsbElementUI$lambda0(a11);
        h11.x(537894961);
        if (m427BsbElementUI$lambda0 != null) {
            Object[] formatArgs = m427BsbElementUI$lambda0.getFormatArgs();
            h11.x(537894990);
            r2 = formatArgs != null ? e.c(m427BsbElementUI$lambda0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), h11, 64) : null;
            h11.N();
            if (r2 == null) {
                r2 = e.b(m427BsbElementUI$lambda0.getErrorMessage(), h11, 0);
            }
        }
        h11.N();
        h11.x(-1113030915);
        f.a aVar = f.f42062f1;
        z a13 = h.a(a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a14 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = u.b(aVar);
        if (!(h11.k() instanceof c1.e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a14);
        } else {
            h11.o();
        }
        h11.E();
        i a15 = a2.a(h11);
        a2.c(a15, a13, c0551a.d());
        a2.c(a15, dVar, c0551a.b());
        a2.c(a15, qVar, c0551a.c());
        a2.c(a15, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        SectionUIKt.Section(null, r2, c.b(h11, -819895436, true, new BsbElementUIKt$BsbElementUI$1$1(a12)), c.b(h11, -819895580, true, new BsbElementUIKt$BsbElementUI$1$2(element, identifierSpec, z11, i11)), h11, 3462, 0);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new BsbElementUIKt$BsbElementUI$2(z11, element, identifierSpec, i11));
    }

    /* renamed from: BsbElementUI$lambda-0  reason: not valid java name */
    private static final FieldError m427BsbElementUI$lambda0(v1<FieldError> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BsbElementUI$lambda-1  reason: not valid java name */
    public static final String m428BsbElementUI$lambda1(v1<String> v1Var) {
        return v1Var.getValue();
    }
}