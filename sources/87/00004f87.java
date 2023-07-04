package com.stripe.android.link.ui;

import android.content.res.Resources;
import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.R;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.Amount;
import h00.a;
import j1.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import o1.f;
import p0.e0;
import vz.b0;
import x2.g;
import y0.d;
import y0.h0;

/* loaded from: classes6.dex */
public final class PrimaryButtonKt {
    public static final String progressIndicatorTestTag = "CircularProgressIndicator";

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PrimaryButton(java.lang.String r16, com.stripe.android.link.ui.PrimaryButtonState r17, java.lang.Integer r18, h00.a<vz.b0> r19, c1.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.PrimaryButtonKt.PrimaryButton(java.lang.String, com.stripe.android.link.ui.PrimaryButtonState, java.lang.Integer, h00.a, c1.i, int, int):void");
    }

    public static final void SecondaryButton(boolean z11, String label, a<b0> onClick, i iVar, int i11) {
        int i12;
        i iVar2;
        int i13;
        s.g(label, "label");
        s.g(onClick, "onClick");
        i h11 = iVar.h(375093686);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(label) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(onClick) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
            i13 = i11;
        } else {
            f o11 = e0.o(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(56));
            h0 h0Var = h0.f58131a;
            iVar2 = h11;
            i13 = i11;
            y0.f.c(onClick, o11, z11, null, null, h0Var.b(h11, 8).d(), null, d.f57958a.a(h0Var.a(h11, 8).l(), 0L, 0L, 0L, h11, 32768, 14), null, c.b(h11, -819890735, true, new PrimaryButtonKt$SecondaryButton$1(label, i12)), h11, 805306416 | ((i12 >> 6) & 14) | ((i12 << 6) & 896), 344);
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PrimaryButtonKt$SecondaryButton$2(z11, label, onClick, i13));
    }

    public static final String primaryButtonLabel(LinkActivityContract.Args args, Resources resources) {
        s.g(args, "args");
        s.g(resources, "resources");
        if (args.getCompletePayment$link_release()) {
            StripeIntent stripeIntent$link_release = args.getStripeIntent$link_release();
            if (stripeIntent$link_release instanceof PaymentIntent) {
                Long amount = ((PaymentIntent) args.getStripeIntent$link_release()).getAmount();
                if (amount != null) {
                    long longValue = amount.longValue();
                    String currency = ((PaymentIntent) args.getStripeIntent$link_release()).getCurrency();
                    if (currency != null) {
                        return new Amount(longValue, currency).buildPayButtonLabel(resources);
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (stripeIntent$link_release instanceof SetupIntent) {
                String string = resources.getString(R.string.stripe_setup_button_label);
                s.f(string, "resources.getString(R.st…tripe_setup_button_label)");
                return string;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        String string2 = resources.getString(R.string.stripe_continue_button_label);
        s.f(string2, "{\n    resources.getStrin…_continue_button_label)\n}");
        return string2;
    }
}