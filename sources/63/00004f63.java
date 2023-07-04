package com.stripe.android.link.theme;

import c1.i;
import c1.r;
import c1.w0;
import kotlin.jvm.internal.s;
import x2.g;
import y0.h0;

/* loaded from: classes6.dex */
public final class ThemeKt {
    private static final float CloseIconWidth = g.f(24);
    private static final float AppBarHeight = g.f(56);
    private static final float HorizontalPadding = g.f(20);
    private static final w0<LinkColors> LocalColors = r.d(ThemeKt$LocalColors$1.INSTANCE);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if ((r10 & 1) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DefaultLinkTheme(boolean r6, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r7, c1.i r8, int r9, int r10) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.s.g(r7, r0)
            r0 = -1354421338(0xffffffffaf452ba6, float:-1.7932553E-10)
            c1.i r8 = r8.h(r0)
            r0 = r9 & 14
            if (r0 != 0) goto L1f
            r0 = r10 & 1
            if (r0 != 0) goto L1c
            boolean r0 = r8.a(r6)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r9
            goto L20
        L1f:
            r0 = r9
        L20:
            r1 = r10 & 2
            if (r1 == 0) goto L27
            r0 = r0 | 48
            goto L37
        L27:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L37
            boolean r1 = r8.O(r7)
            if (r1 == 0) goto L34
            r1 = 32
            goto L36
        L34:
            r1 = 16
        L36:
            r0 = r0 | r1
        L37:
            r1 = r0 & 91
            r1 = r1 ^ 18
            if (r1 != 0) goto L48
            boolean r1 = r8.i()
            if (r1 != 0) goto L44
            goto L48
        L44:
            r8.G()
            goto L8e
        L48:
            r8.B()
            r1 = r9 & 1
            r2 = 0
            if (r1 == 0) goto L5f
            boolean r1 = r8.J()
            if (r1 == 0) goto L57
            goto L5f
        L57:
            r8.G()
            r1 = r10 & 1
            if (r1 == 0) goto L69
            goto L67
        L5f:
            r1 = r10 & 1
            if (r1 == 0) goto L69
            boolean r6 = m0.j.a(r8, r2)
        L67:
            r0 = r0 & (-15)
        L69:
            r8.r()
            com.stripe.android.link.theme.LinkThemeConfig r1 = com.stripe.android.link.theme.LinkThemeConfig.INSTANCE
            com.stripe.android.link.theme.LinkColors r1 = r1.colors(r6)
            r3 = 1
            c1.x0[] r4 = new c1.x0[r3]
            c1.w0<com.stripe.android.link.theme.LinkColors> r5 = com.stripe.android.link.theme.ThemeKt.LocalColors
            c1.x0 r5 = r5.c(r1)
            r4[r2] = r5
            r2 = -819894856(0xffffffffcf2165b8, float:-2.70779802E9)
            com.stripe.android.link.theme.ThemeKt$DefaultLinkTheme$1 r5 = new com.stripe.android.link.theme.ThemeKt$DefaultLinkTheme$1
            r5.<init>(r1, r7, r0)
            j1.a r0 = j1.c.b(r8, r2, r3, r5)
            r1 = 56
            c1.r.a(r4, r0, r8, r1)
        L8e:
            c1.e1 r8 = r8.l()
            if (r8 != 0) goto L95
            goto L9d
        L95:
            com.stripe.android.link.theme.ThemeKt$DefaultLinkTheme$2 r0 = new com.stripe.android.link.theme.ThemeKt$DefaultLinkTheme$2
            r0.<init>(r6, r7, r9, r10)
            r8.a(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.theme.ThemeKt.DefaultLinkTheme(boolean, h00.p, c1.i, int, int):void");
    }

    public static final float getAppBarHeight() {
        return AppBarHeight;
    }

    public static final float getCloseIconWidth() {
        return CloseIconWidth;
    }

    public static final float getHorizontalPadding() {
        return HorizontalPadding;
    }

    public static final LinkColors getLinkColors(h0 h0Var, i iVar, int i11) {
        s.g(h0Var, "<this>");
        return (LinkColors) iVar.A(LocalColors);
    }
}