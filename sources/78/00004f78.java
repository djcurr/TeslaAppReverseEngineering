package com.stripe.android.link.ui;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.theme.ThemeKt;
import f2.z;
import h00.q;
import h2.a;
import k0.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.a;
import p0.d0;
import p0.e0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkAppBarKt$LinkAppBar$2$2 extends u implements q<d, i, Integer, b0> {
    final /* synthetic */ String $email;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAppBarKt$LinkAppBar$2$2(String str) {
        super(3);
        this.$email = str;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(d dVar, i iVar, Integer num) {
        invoke(dVar, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(d AnimatedVisibility, i iVar, int i11) {
        s.g(AnimatedVisibility, "$this$AnimatedVisibility");
        f o11 = e0.o(p0.u.l(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(8), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), g.f(24));
        a.e b11 = a.f45228a.b();
        String str = this.$email;
        iVar.x(-1989997165);
        z b12 = p0.b0.b(b11, o1.a.f42039a.i(), iVar, 6);
        iVar.x(1376089394);
        x2.d dVar = (x2.d) iVar.A(l0.d());
        x2.q qVar = (x2.q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        q<g1<h2.a>, i, Integer, b0> b13 = f2.u.b(o11);
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
        a2.c(a12, b12, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar.c();
        b13.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-326682362);
        d0 d0Var = d0.f45271a;
        o1.b(str == null ? "" : str, null, ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m193getDisabledText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65530);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}