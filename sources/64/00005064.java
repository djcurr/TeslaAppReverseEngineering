package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ThemeKt;
import h00.q;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.c0;
import vz.b0;
import y0.h0;
import y0.o1;

/* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletModalsKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$WalletModalsKt$lambda1$1 extends u implements q<c0, i, Integer, b0> {
    public static final ComposableSingletons$WalletModalsKt$lambda1$1 INSTANCE = new ComposableSingletons$WalletModalsKt$lambda1$1();

    ComposableSingletons$WalletModalsKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
        invoke(c0Var, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c0 TextButton, i iVar, int i11) {
        s.g(TextButton, "$this$TextButton");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        } else {
            o1.b(e.b(R.string.remove, iVar, 0), null, ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m192getDialogButtonLabel0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65530);
        }
    }
}