package com.stripe.android.ui.core;

import c1.e1;
import c1.i;
import f2.t0;
import h00.p;
import h00.q;
import kotlin.jvm.internal.s;
import vz.b0;
import x2.g;

/* loaded from: classes6.dex */
public final class MeasureComposableWidthKt {
    public static final void MeasureComposableWidth(p<? super i, ? super Integer, b0> composable, q<? super g, ? super i, ? super Integer, b0> content, i iVar, int i11) {
        int i12;
        s.g(composable, "composable");
        s.g(content, "content");
        i h11 = iVar.h(-1317093860);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(composable) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(content) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            h11.x(-3686552);
            boolean O = h11.O(composable) | h11.O(content);
            Object y11 = h11.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new MeasureComposableWidthKt$MeasureComposableWidth$1$1(composable, i12, content);
                h11.p(y11);
            }
            h11.N();
            t0.b(null, (p) y11, h11, 0, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new MeasureComposableWidthKt$MeasureComposableWidth$2(composable, content, i11));
    }
}