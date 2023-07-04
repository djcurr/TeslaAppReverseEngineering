package com.stripe.android.link.theme;

import y0.m;

/* loaded from: classes6.dex */
public final class LinkThemeConfig {
    public static final LinkThemeConfig INSTANCE = new LinkThemeConfig();
    private static final LinkColors colorsDark;
    private static final LinkColors colorsLight;

    static {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        j11 = ColorKt.LightComponentBackground;
        j12 = ColorKt.LightComponentBorder;
        j13 = ColorKt.LightComponentDivider;
        j14 = ColorKt.ButtonLabel;
        j15 = ColorKt.ActionGreen;
        j16 = ColorKt.LightTextDisabled;
        j17 = ColorKt.LightCloseButton;
        j18 = ColorKt.LightLinkLogo;
        j19 = ColorKt.ErrorText;
        j21 = ColorKt.ErrorBackground;
        j22 = ColorKt.LightSecondaryButtonLabel;
        j23 = ColorKt.LinkTeal;
        j24 = ColorKt.LightFill;
        j25 = ColorKt.LightBackground;
        j26 = ColorKt.LightBackground;
        j27 = ColorKt.LightTextPrimary;
        j28 = ColorKt.LightTextSecondary;
        colorsLight = new LinkColors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, m.g(j23, 0L, j24, 0L, j25, j26, 0L, j27, j28, 0L, 0L, 0L, 3658, null), null);
        j29 = ColorKt.DarkComponentBackground;
        j31 = ColorKt.DarkComponentBorder;
        j32 = ColorKt.DarkComponentDivider;
        j33 = ColorKt.ButtonLabel;
        j34 = ColorKt.ActionGreen;
        j35 = ColorKt.DarkTextDisabled;
        j36 = ColorKt.DarkCloseButton;
        j37 = ColorKt.DarkLinkLogo;
        j38 = ColorKt.ErrorText;
        j39 = ColorKt.ErrorBackground;
        j41 = ColorKt.DarkSecondaryButtonLabel;
        j42 = ColorKt.LinkTeal;
        j43 = ColorKt.DarkFill;
        j44 = ColorKt.DarkBackground;
        j45 = ColorKt.DarkBackground;
        j46 = ColorKt.DarkTextPrimary;
        j47 = ColorKt.DarkTextSecondary;
        colorsDark = new LinkColors(j29, j31, j32, j33, j34, j35, j36, j37, j38, j39, j41, m.d(j42, 0L, j43, 0L, j44, j45, 0L, j46, j47, 0L, 0L, 0L, 3658, null), null);
    }

    private LinkThemeConfig() {
    }

    public final LinkColors colors(boolean z11) {
        return z11 ? colorsDark : colorsLight;
    }
}