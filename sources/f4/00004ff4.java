package com.stripe.android.link.ui.inline;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.PhoneNumberElementUIKt;
import f2.z;
import h00.q;
import h2.a;
import k0.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.a;
import p0.e0;
import p0.h;
import p0.j;
import vz.b0;
import x2.g;

/* loaded from: classes6.dex */
final class LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3$1$1 extends u implements q<d, i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ PhoneNumberController $phoneNumberController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$3$1$1(boolean z11, PhoneNumberController phoneNumberController, int i11) {
        super(3);
        this.$enabled = z11;
        this.$phoneNumberController = phoneNumberController;
        this.$$dirty = i11;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(d dVar, i iVar, Integer num) {
        invoke(dVar, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(d AnimatedVisibility, i iVar, int i11) {
        s.g(AnimatedVisibility, "$this$AnimatedVisibility");
        f.a aVar = f.f42062f1;
        f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        boolean z11 = this.$enabled;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        int i12 = this.$$dirty;
        iVar.x(-1113030915);
        z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
        iVar.x(1376089394);
        x2.d dVar = (x2.d) iVar.A(l0.d());
        x2.q qVar = (x2.q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(iVar.k() instanceof e)) {
            c1.h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a12);
        } else {
            iVar.o();
        }
        iVar.E();
        i a13 = a2.a(iVar);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        iVar.c();
        b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(276693625);
        j jVar = j.f45341a;
        PhoneNumberElementUIKt.PhoneNumberCollectionSection(z11, phoneNumberController, null, true, iVar, ((i12 >> 12) & 14) | 3072 | (PhoneNumberController.$stable << 3) | ((i12 >> 3) & 112), 4);
        LinkTermsKt.m200LinkTerms5stqomU(p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(8), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), w2.d.f55400b.d(), iVar, 6, 0);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}