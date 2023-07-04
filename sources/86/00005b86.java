package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import c1.i;
import c1.v1;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import f2.z;
import h00.p;
import h2.a;
import java.util.List;
import kotlin.jvm.internal.u;
import o1.a;
import o1.f;
import p0.a;
import p0.d0;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextField$7$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ TextFieldIcon $it;
    final /* synthetic */ v1<Boolean> $loading$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$7$1(TextFieldIcon textFieldIcon, v1<Boolean> v1Var) {
        super(2);
        this.$it = textFieldIcon;
        this.$loading$delegate = v1Var;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        boolean m487TextField_PwfN4xk$lambda6;
        boolean m487TextField_PwfN4xk$lambda62;
        boolean m487TextField_PwfN4xk$lambda63;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        TextFieldIcon textFieldIcon = this.$it;
        v1<Boolean> v1Var = this.$loading$delegate;
        iVar.x(-1989997165);
        f.a aVar = f.f42062f1;
        a aVar2 = a.f45228a;
        a.d g11 = aVar2.g();
        a.C0826a c0826a = o1.a.f42039a;
        z b11 = p0.b0.b(g11, c0826a.i(), iVar, 0);
        iVar.x(1376089394);
        d dVar = (d) iVar.A(l0.d());
        q qVar = (q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(aVar);
        if (!(iVar.k() instanceof e)) {
            h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a11);
        } else {
            iVar.o();
        }
        iVar.E();
        i a12 = a2.a(iVar);
        a2.c(a12, b11, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar.c();
        b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-326682362);
        d0 d0Var = d0.f45271a;
        if (textFieldIcon instanceof TextFieldIcon.Trailing) {
            iVar.x(385256823);
            m487TextField_PwfN4xk$lambda63 = TextFieldUIKt.m487TextField_PwfN4xk$lambda6(v1Var);
            TextFieldUIKt.TrailingIcon((TextFieldIcon.Trailing) textFieldIcon, m487TextField_PwfN4xk$lambda63, iVar, 0);
            iVar.N();
        } else if (textFieldIcon instanceof TextFieldIcon.MultiTrailing) {
            iVar.x(385256963);
            f h11 = p0.u.h(aVar, g.f(10));
            iVar.x(-1989997165);
            z b13 = p0.b0.b(aVar2.g(), c0826a.i(), iVar, 0);
            iVar.x(1376089394);
            d dVar2 = (d) iVar.A(l0.d());
            q qVar2 = (q) iVar.A(l0.i());
            y1 y1Var2 = (y1) iVar.A(l0.m());
            h00.a<h2.a> a13 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b14 = f2.u.b(h11);
            if (!(iVar.k() instanceof e)) {
                h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a13);
            } else {
                iVar.o();
            }
            iVar.E();
            i a14 = a2.a(iVar);
            a2.c(a14, b13, c0551a.d());
            a2.c(a14, dVar2, c0551a.b());
            a2.c(a14, qVar2, c0551a.c());
            a2.c(a14, y1Var2, c0551a.f());
            iVar.c();
            b14.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-326682362);
            iVar.x(1175314715);
            TextFieldIcon.MultiTrailing multiTrailing = (TextFieldIcon.MultiTrailing) textFieldIcon;
            for (TextFieldIcon.Trailing trailing : multiTrailing.getStaticIcons()) {
                m487TextField_PwfN4xk$lambda62 = TextFieldUIKt.m487TextField_PwfN4xk$lambda6(v1Var);
                TextFieldUIKt.TrailingIcon(trailing, m487TextField_PwfN4xk$lambda62, iVar, 0);
            }
            iVar.N();
            List<TextFieldIcon.Trailing> animatedIcons = multiTrailing.getAnimatedIcons();
            m487TextField_PwfN4xk$lambda6 = TextFieldUIKt.m487TextField_PwfN4xk$lambda6(v1Var);
            TextFieldUIKt.AnimatedIcons(animatedIcons, m487TextField_PwfN4xk$lambda6, iVar, 8);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
            iVar.N();
        } else {
            iVar.x(385257356);
            iVar.N();
        }
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}