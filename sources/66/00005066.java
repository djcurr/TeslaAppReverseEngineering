package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.link.R;
import h00.p;
import k2.e;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.o1;

/* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletModalsKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$WalletModalsKt$lambda3$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$WalletModalsKt$lambda3$1 INSTANCE = new ComposableSingletons$WalletModalsKt$lambda3$1();

    ComposableSingletons$WalletModalsKt$lambda3$1() {
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
            o1.b(e.b(R.string.wallet_remove_confirmation, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65534);
        }
    }
}