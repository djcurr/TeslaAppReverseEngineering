package com.stripe.android.link.ui;

import c1.e1;
import c1.i;
import c1.n1;
import c1.r;
import c1.w0;
import c1.x0;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.LinkAccount;
import h00.a;
import j1.c;
import vz.b0;
import x2.g;
import y0.n;
import y0.o;

/* loaded from: classes6.dex */
public final class LinkButtonKt {
    private static final float LinkButtonVerticalPadding = g.f(6);
    private static final float LinkButtonHorizontalPadding = g.f(10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkButton(i iVar, int i11) {
        i h11 = iVar.h(-665953369);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            LinkButton(true, "example@stripe.com", (a<b0>) LinkButtonKt$LinkButton$1.INSTANCE, h11, 438);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkButtonKt$LinkButton$2(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkButton(LinkPaymentLauncher linkPaymentLauncher, boolean z11, a<b0> aVar, i iVar, int i11) {
        i h11 = iVar.h(-665953222);
        LinkAccount linkAccount = (LinkAccount) n1.b(linkPaymentLauncher.getLinkAccountManager$link_release().getLinkAccount(), null, h11, 8, 1).getValue();
        LinkButton(z11, linkAccount != null ? linkAccount.getEmail() : null, aVar, h11, ((i11 >> 3) & 14) | (i11 & 896));
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkButtonKt$LinkButton$3(linkPaymentLauncher, z11, aVar, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkButton(boolean z11, String str, a<b0> aVar, i iVar, int i11) {
        int i12;
        float b11;
        i h11 = iVar.h(-665952887);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(str) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(aVar) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            x0[] x0VarArr = new x0[1];
            w0<Float> a11 = o.a();
            if (z11) {
                h11.x(-665952710);
                b11 = n.f58482a.c(h11, 8);
            } else {
                h11.x(-665952687);
                b11 = n.f58482a.b(h11, 8);
            }
            h11.N();
            x0VarArr[0] = a11.c(Float.valueOf(b11));
            r.a(x0VarArr, c.b(h11, -819892280, true, new LinkButtonKt$LinkButton$4(aVar, z11, i12, str)), h11, 56);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkButtonKt$LinkButton$5(z11, str, aVar, i11));
    }
}