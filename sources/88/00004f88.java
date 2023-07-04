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
import h00.a;
import h00.p;
import h2.a;
import kotlin.jvm.internal.u;
import o1.f;
import p0.c;
import p0.e0;
import t1.a0;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;
import y0.d0;
import y0.h0;
import y0.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PrimaryButtonKt$PrimaryButton$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $icon;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ String $label;
    final /* synthetic */ a<b0> $onButtonClick;
    final /* synthetic */ PrimaryButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$1(a<b0> aVar, boolean z11, int i11, Integer num, PrimaryButtonState primaryButtonState, String str) {
        super(2);
        this.$onButtonClick = aVar;
        this.$isEnabled = z11;
        this.$$dirty = i11;
        this.$icon = num;
        this.$state = primaryButtonState;
        this.$label = str;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        f.a aVar = f.f42062f1;
        float f11 = 16;
        f j11 = p0.u.j(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(f11), 1, null);
        o1.a e11 = o1.a.f42039a.e();
        a<b0> aVar2 = this.$onButtonClick;
        boolean z11 = this.$isEnabled;
        int i12 = this.$$dirty;
        Integer num = this.$icon;
        PrimaryButtonState primaryButtonState = this.$state;
        String str = this.$label;
        iVar.x(-1990474327);
        z i13 = c.i(e11, false, iVar, 6);
        iVar.x(1376089394);
        d dVar = (d) iVar.A(l0.d());
        q qVar = (q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(j11);
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
        a2.c(a12, i13, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar.c();
        b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-1253629305);
        p0.d dVar2 = p0.d.f45270a;
        f o11 = e0.o(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(56));
        h0 h0Var = h0.f58131a;
        y0.f.c(aVar2, o11, z11, null, null, h0Var.b(iVar, 8).d(), null, y0.d.f57958a.a(h0Var.a(iVar, 8).j(), 0L, h0Var.a(iVar, 8).j(), 0L, iVar, 32768, 10), null, j1.c.b(iVar, -819893558, true, new PrimaryButtonKt$PrimaryButton$1$1$1(primaryButtonState, str, i12)), iVar, ((i12 >> 9) & 14) | 805306416, 344);
        if (num != null && primaryButtonState != PrimaryButtonState.Processing) {
            d0.a(k2.c.c(num.intValue(), iVar, (i12 >> 6) & 14), null, p0.u.j(e0.z(e0.o(aVar, g.f(f11)), g.f(g.f(13) + g.f(40))), ThemeKt.getHorizontalPadding(), BitmapDescriptorFactory.HUE_RED, 2, null), a0.l(ThemeKt.getLinkColors(h0Var, iVar, 8).m187getButtonLabel0d7_KjU(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), iVar, 440, 0);
        }
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}