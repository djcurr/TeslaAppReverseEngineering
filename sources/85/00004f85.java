package com.stripe.android.link.ui;

import c1.e1;
import c1.i;
import com.stripe.android.link.R;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.HtmlKt;
import java.util.Map;
import k2.e;
import n2.s;
import o1.f;
import w2.d;
import wz.s0;
import y0.h0;

/* loaded from: classes6.dex */
public final class LinkTermsKt {
    /* renamed from: LinkTerms-5stqomU  reason: not valid java name */
    public static final void m200LinkTerms5stqomU(f fVar, int i11, i iVar, int i12, int i13) {
        Object obj;
        int i14;
        int i15;
        Object obj2;
        Map i16;
        i h11 = iVar.h(-1876304479);
        int i17 = i13 & 1;
        if (i17 != 0) {
            i14 = i12 | 6;
            obj = fVar;
        } else if ((i12 & 14) == 0) {
            obj = fVar;
            i14 = (h11.O(obj) ? 4 : 2) | i12;
        } else {
            obj = fVar;
            i14 = i12;
        }
        if ((2 ^ (i14 & 11)) == 0 && h11.i()) {
            h11.G();
            i15 = i11;
            obj2 = obj;
        } else {
            h11.B();
            if ((i12 & 1) != 0 && !h11.J()) {
                h11.G();
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                }
                i15 = i11;
                obj2 = obj;
            } else {
                Object obj3 = i17 != 0 ? f.f42062f1 : obj;
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                    obj2 = obj3;
                    i15 = d.f55400b.a();
                } else {
                    i15 = i11;
                    obj2 = obj3;
                }
            }
            h11.r();
            String b11 = e.b(R.string.sign_up_terms, h11, 0);
            i16 = s0.i();
            h0 h0Var = h0.f58131a;
            HtmlKt.m444HtmlFU0evQE(b11, i16, PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m385getPlaceholderText0d7_KjU(), h0Var.c(h11, 8).k(), obj2, new s(h0Var.a(h11, 8).j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382, null), h11, (57344 & (i14 << 12)) | 64, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkTermsKt$LinkTerms$1(obj2, i15, i12, i13));
    }
}