package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k2.e;
import kotlin.jvm.internal.s;
import l2.o;
import o1.f;
import p0.u;
import x2.g;

/* loaded from: classes6.dex */
public final class StaticTextElementUIKt {
    public static final void StaticElementUI(StaticTextElement element, i iVar, int i11) {
        int i12;
        s.g(element, "element");
        i h11 = iVar.h(-612221958);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(element) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            H6TextKt.H6Text(e.b(element.getStringResId(), h11, 0), o.a(u.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(8), 1, null), true, StaticTextElementUIKt$StaticElementUI$1.INSTANCE), h11, 0, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new StaticTextElementUIKt$StaticElementUI$2(element, i11));
    }
}