package com.stripe.android.link.ui.wallet;

import a1.c;
import c1.i;
import com.stripe.android.link.R;
import h00.p;
import k2.e;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.d0;
import y0.h0;
import z0.a;

/* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$WalletScreenKt$lambda3$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$WalletScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$WalletScreenKt$lambda3$1();

    ComposableSingletons$WalletScreenKt$lambda3$1() {
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
            d0.b(c.a(a.f60037a), e.b(R.string.edit, iVar, 0), null, h0.f58131a.a(iVar, 8).j(), iVar, 0, 4);
        }
    }
}