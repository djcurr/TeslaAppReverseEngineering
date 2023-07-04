package com.stripe.android.link.ui.verification;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import h00.p;
import k2.e;
import kotlin.jvm.internal.u;
import o1.f;
import t1.a0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o;
import y0.o1;

/* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$VerificationScreenKt$lambda3$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$VerificationScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$VerificationScreenKt$lambda3$1();

    ComposableSingletons$VerificationScreenKt$lambda3$1() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        String b11 = e.b(R.string.verification_resend, iVar, 0);
        f i12 = p0.u.i(f.f42062f1, g.f(12), g.f(4));
        h0 h0Var = h0.f58131a;
        o1.b(b11, i12, a0.l(h0Var.a(iVar, 8).g(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(iVar, 8).e(), iVar, 48, 0, 32760);
    }
}