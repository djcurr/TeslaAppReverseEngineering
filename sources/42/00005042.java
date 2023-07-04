package com.stripe.android.link.ui.verification;

import c1.e1;
import c1.i;
import com.stripe.android.link.LinkPaymentLauncher;
import h00.l;
import kotlin.jvm.internal.s;
import q4.j;
import vz.b0;

/* loaded from: classes6.dex */
public final class VerificationDialogKt {
    public static final void LinkVerificationDialog(LinkPaymentLauncher linkLauncher, l<? super Boolean, b0> verificationCallback, i iVar, int i11) {
        s.g(linkLauncher, "linkLauncher");
        s.g(verificationCallback, "verificationCallback");
        i h11 = iVar.h(1151409025);
        j.a(q4.i.d(new p4.b0[0], h11, 8), "dialog", null, null, new VerificationDialogKt$LinkVerificationDialog$1(linkLauncher, verificationCallback, i11), h11, 56, 12);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new VerificationDialogKt$LinkVerificationDialog$2(linkLauncher, verificationCallback, i11));
    }
}