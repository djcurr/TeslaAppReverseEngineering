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
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
public final class SectionUIKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Section(java.lang.Integer r16, java.lang.String r17, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r18, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r19, c1.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SectionUIKt.Section(java.lang.Integer, java.lang.String, h00.p, h00.p, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SectionCard(o1.f r18, boolean r19, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r20, c1.i r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SectionUIKt.SectionCard(o1.f, boolean, h00.p, c1.i, int, int):void");
    }

    public static final void SectionError(String error, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(error, "error");
        i h11 = iVar.h(1240332344);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(error) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            h0 h0Var = h0.f58131a;
            iVar2 = h11;
            o1.b(error, o.a(f.f42062f1, true, SectionUIKt$SectionError$1.INSTANCE), h0Var.a(h11, 8).d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(h11, 8).j(), iVar2, i12 & 14, 0, 32760);
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SectionUIKt$SectionError$2(error, i11));
    }

    public static final void SectionTitle(Integer num, i iVar, int i11) {
        int i12;
        i h11 = iVar.h(1661513108);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(num) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) == 0 && h11.i()) {
            h11.G();
        } else if (num != null) {
            num.intValue();
            H6TextKt.H6Text(e.b(num.intValue(), h11, i12 & 14), o.a(u.l(f.f42062f1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(4), 7, null), true, SectionUIKt$SectionTitle$1$1.INSTANCE), h11, 0, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SectionUIKt$SectionTitle$2(num, i11));
    }
}