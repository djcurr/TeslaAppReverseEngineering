package com.stripe.android.link.ui.cardedit;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.b1;

/* renamed from: com.stripe.android.link.ui.cardedit.ComposableSingletons$CardEditScreenKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$CardEditScreenKt$lambda3$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$CardEditScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$CardEditScreenKt$lambda3$1();

    ComposableSingletons$CardEditScreenKt$lambda3$1() {
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
            b1.b(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$CardEditScreenKt.INSTANCE.m210getLambda2$link_release(), iVar, 1572864, 63);
        }
    }
}