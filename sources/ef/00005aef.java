package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import c1.i;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import f2.z;
import h00.p;
import h00.q;
import h2.a;
import k0.c;
import k0.d;
import k0.j;
import k0.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import o1.a;
import o1.f;
import p0.d0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$2$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v1<String> $prefix$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$2$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements q<d, i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ PhoneNumberController $controller;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ v1<String> $prefix$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PhoneNumberController phoneNumberController, boolean z11, int i11, v1<String> v1Var) {
            super(3);
            this.$controller = phoneNumberController;
            this.$enabled = z11;
            this.$$dirty = i11;
            this.$prefix$delegate = v1Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(d dVar, i iVar, Integer num) {
            invoke(dVar, iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(d AnimatedVisibility, i iVar, int i11) {
            String m463PhoneNumberElementUI$lambda8;
            boolean w11;
            s.g(AnimatedVisibility, "$this$AnimatedVisibility");
            f l11 = p0.u.l(f.f42062f1, g.f(16), g.f(11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
            a.c g11 = a.f42039a.g();
            PhoneNumberController phoneNumberController = this.$controller;
            boolean z11 = this.$enabled;
            int i12 = this.$$dirty;
            v1<String> v1Var = this.$prefix$delegate;
            iVar.x(-1989997165);
            z b11 = p0.b0.b(p0.a.f45228a.g(), g11, iVar, 48);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar = (x2.q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(l11);
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
            DropdownFieldUIKt.DropDown(phoneNumberController.getCountryDropdownController(), z11, iVar, ((i12 << 3) & 112) | 8);
            m463PhoneNumberElementUI$lambda8 = PhoneNumberElementUIKt.m463PhoneNumberElementUI$lambda8(v1Var);
            w11 = v.w(m463PhoneNumberElementUI$lambda8);
            if (!(!w11)) {
                m463PhoneNumberElementUI$lambda8 = null;
            }
            String str = m463PhoneNumberElementUI$lambda8;
            if (str != null) {
                o1.b(str, null, PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m385getPlaceholderText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65530);
            }
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2$4(PhoneNumberController phoneNumberController, boolean z11, int i11, v1<String> v1Var) {
        super(2);
        this.$controller = phoneNumberController;
        this.$enabled = z11;
        this.$$dirty = i11;
        this.$prefix$delegate = v1Var;
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
        } else {
            c.c(true, null, j.t(null, BitmapDescriptorFactory.HUE_RED, 3, null), m.f34156a.a(), null, j1.c.b(iVar, -819890358, true, new AnonymousClass1(this.$controller, this.$enabled, this.$$dirty, this.$prefix$delegate)), iVar, 196998, 18);
        }
    }
}