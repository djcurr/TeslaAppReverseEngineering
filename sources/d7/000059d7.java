package com.stripe.android.ui.core.elements;

import android.content.Context;
import androidx.compose.ui.platform.z;
import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j1.c;
import kh.a;
import kh.b;
import kotlin.jvm.internal.s;
import o1.f;
import p0.u;
import x2.g;

/* loaded from: classes6.dex */
public final class AfterpayClearpayElementUIKt {
    public static final void AfterpayClearpayElementUI(boolean z11, AfterpayClearpayHeaderElement element, i iVar, int i11) {
        int i12;
        s.g(element, "element");
        i h11 = iVar.h(1439399776);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(element) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            float f11 = 4;
            b.b(u.k(f.f42062f1, g.f(f11), g.f(8), g.f(f11), g.f(f11)), null, null, BitmapDescriptorFactory.HUE_RED, a.Center, BitmapDescriptorFactory.HUE_RED, null, c.b(h11, -819895457, true, new AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1(element, (Context) h11.A(z.g()), z11, i12)), h11, 12607494, 110);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$2(z11, element, i11));
    }
}