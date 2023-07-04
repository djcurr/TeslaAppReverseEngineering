package com.stripe.android.link.theme;

import c1.e1;
import c1.i;
import com.stripe.android.ui.core.PaymentsColors;
import com.stripe.android.ui.core.PaymentsShapes;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.PaymentsTypography;
import h00.p;
import j1.c;
import kotlin.jvm.internal.s;
import m0.j;
import t1.a0;
import t1.c0;
import vz.b0;
import y0.l;

/* loaded from: classes6.dex */
public final class ColorKt {
    private static final long ActionGreen;
    private static final long ButtonLabel;
    private static final long DarkBackground;
    private static final long DarkCloseButton;
    private static final long DarkComponentBackground;
    private static final long DarkComponentBorder;
    private static final long DarkComponentDivider;
    private static final long DarkFill;
    private static final long DarkLinkLogo;
    private static final long DarkSecondaryButtonLabel;
    private static final long DarkTextDisabled;
    private static final long DarkTextPrimary;
    private static final long DarkTextSecondary;
    private static final long ErrorBackground;
    private static final long ErrorText;
    private static final long LightBackground;
    private static final long LightCloseButton;
    private static final long LightComponentBackground;
    private static final long LightComponentBorder;
    private static final long LightComponentDivider;
    private static final long LightFill;
    private static final long LightLinkLogo;
    private static final long LightSecondaryButtonLabel;
    private static final long LightTextDisabled;
    private static final long LightTextPrimary;
    private static final long LightTextSecondary;
    private static final long LinkTeal = c0.c(4281589171L);

    static {
        long c11 = c0.c(4278560895L);
        ActionGreen = c11;
        ButtonLabel = c0.c(4280105284L);
        ErrorText = c0.c(4294913868L);
        ErrorBackground = c0.b(788432801);
        a0.a aVar = a0.f51365b;
        LightComponentBackground = aVar.g();
        LightComponentBorder = c0.c(4292929259L);
        LightComponentDivider = c0.c(4293915380L);
        LightTextPrimary = c0.c(4281348413L);
        LightTextSecondary = c0.c(4285166467L);
        LightTextDisabled = c0.c(4288916666L);
        LightBackground = aVar.g();
        LightFill = c0.c(4294375674L);
        LightCloseButton = c0.c(4281348413L);
        LightLinkLogo = c0.c(4280105284L);
        LightSecondaryButtonLabel = c0.c(4280105284L);
        DarkComponentBackground = c0.b(779383936);
        DarkComponentBorder = c0.b(1551399040);
        DarkComponentDivider = c0.b(863533184);
        DarkTextPrimary = aVar.g();
        DarkTextSecondary = c0.c(2582375413L);
        DarkTextDisabled = c0.b(1644167167);
        DarkBackground = c0.c(4280032286L);
        DarkFill = c0.b(863533184);
        DarkCloseButton = c0.c(2582375413L);
        DarkLinkLogo = aVar.g();
        DarkSecondaryButtonLabel = c11;
    }

    public static final void PaymentsThemeForLink(p<? super i, ? super Integer, b0> content, i iVar, int i11) {
        int i12;
        l a11;
        PaymentsColors m379copyKvvhxLA;
        s.g(content, "content");
        i h11 = iVar.h(827838035);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) == 0 && h11.i()) {
            h11.G();
        } else {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            PaymentsColors colors = paymentsThemeDefaults.colors(j.a(h11, 0));
            a11 = r23.a((r43 & 1) != 0 ? r23.j() : ActionGreen, (r43 & 2) != 0 ? r23.k() : 0L, (r43 & 4) != 0 ? r23.l() : 0L, (r43 & 8) != 0 ? r23.m() : 0L, (r43 & 16) != 0 ? r23.c() : 0L, (r43 & 32) != 0 ? r23.n() : 0L, (r43 & 64) != 0 ? r23.d() : 0L, (r43 & 128) != 0 ? r23.g() : 0L, (r43 & 256) != 0 ? r23.h() : 0L, (r43 & 512) != 0 ? r23.e() : 0L, (r43 & 1024) != 0 ? r23.i() : 0L, (r43 & 2048) != 0 ? r23.f() : 0L, (r43 & 4096) != 0 ? colors.getMaterialColors().o() : false);
            m379copyKvvhxLA = colors.m379copyKvvhxLA((r34 & 1) != 0 ? colors.component : 0L, (r34 & 2) != 0 ? colors.componentBorder : 0L, (r34 & 4) != 0 ? colors.componentDivider : 0L, (r34 & 8) != 0 ? colors.onComponent : 0L, (r34 & 16) != 0 ? colors.subtitle : 0L, (r34 & 32) != 0 ? colors.textCursor : 0L, (r34 & 64) != 0 ? colors.placeholderText : 0L, (r34 & 128) != 0 ? colors.appBarIcon : 0L, (r34 & 256) != 0 ? colors.materialColors : a11);
            PaymentsThemeKt.PaymentsTheme(m379copyKvvhxLA, paymentsThemeDefaults.getShapes(), paymentsThemeDefaults.getTypography(), c.b(h11, -819893094, true, new ColorKt$PaymentsThemeForLink$1(content, i12)), h11, PaymentsColors.$stable | 3072 | (PaymentsShapes.$stable << 3) | (PaymentsTypography.$stable << 6), 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new ColorKt$PaymentsThemeForLink$2(content, i11));
    }
}