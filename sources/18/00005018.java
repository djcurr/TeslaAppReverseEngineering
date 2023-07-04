package com.stripe.android.link.ui.signup;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.b1;

/* renamed from: com.stripe.android.link.ui.signup.ComposableSingletons$SignUpScreenKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$SignUpScreenKt$lambda2$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$SignUpScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$SignUpScreenKt$lambda2$1();

    ComposableSingletons$SignUpScreenKt$lambda2$1() {
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
        } else {
            b1.b(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$SignUpScreenKt.INSTANCE.m228getLambda1$link_release(), iVar, 1572864, 63);
        }
    }
}