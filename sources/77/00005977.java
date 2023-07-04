package com.stripe.android.ui.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import r2.l;
import t1.a0;
import t1.c0;
import x2.s;
import y0.m;

/* loaded from: classes6.dex */
public final class PaymentsThemeDefaults {
    public static final int $stable = 0;
    public static final PaymentsThemeDefaults INSTANCE;
    private static final PaymentsColors colorsDark;
    private static final PaymentsColors colorsLight;
    private static final PrimaryButtonStyle primaryButtonStyle;
    private static final PaymentsShapes shapes;
    private static final PaymentsTypography typography;

    static {
        PaymentsThemeDefaults paymentsThemeDefaults = new PaymentsThemeDefaults();
        INSTANCE = paymentsThemeDefaults;
        a0.a aVar = a0.f51365b;
        colorsLight = new PaymentsColors(aVar.g(), c0.b(863533184), c0.b(863533184), aVar.a(), c0.c(2566914048L), aVar.a(), c0.c(2570861635L), c0.c(2566914048L), m.g(c0.c(4278221567L), 0L, 0L, 0L, 0L, aVar.g(), aVar.d(), 0L, 0L, 0L, aVar.a(), 0L, 2974, null), null);
        colorsDark = new PaymentsColors(aVar.c(), c0.c(4286085248L), c0.c(4286085248L), aVar.g(), c0.c(2583691263L), aVar.g(), c0.b(1644167167), aVar.g(), m.d(c0.c(4278219988L), 0L, 0L, 0L, 0L, c0.c(4281216558L), aVar.d(), 0L, 0L, 0L, aVar.g(), 0L, 2974, null), null);
        PaymentsShapes paymentsShapes = new PaymentsShapes(6.0f, 1.0f, 2.0f);
        shapes = paymentsShapes;
        l.a aVar2 = l.f49091b;
        PaymentsTypography paymentsTypography = new PaymentsTypography(aVar2.d().k(), aVar2.c().k(), aVar2.a().k(), 1.0f, s.f(9), s.f(12), s.f(13), s.f(14), s.f(16), s.f(20), null, null);
        typography = paymentsTypography;
        primaryButtonStyle = new PrimaryButtonStyle(new PrimaryButtonColors(paymentsThemeDefaults.colors(false).getMaterialColors().j(), aVar.g(), aVar.e(), null), new PrimaryButtonColors(paymentsThemeDefaults.colors(true).getMaterialColors().j(), aVar.g(), aVar.e(), null), new PrimaryButtonShape(paymentsShapes.getCornerRadius(), BitmapDescriptorFactory.HUE_RED), new PrimaryButtonTypography(paymentsTypography.getFontFamily(), paymentsTypography.m405getLargeFontSizeXSAIIZE(), null));
    }

    private PaymentsThemeDefaults() {
    }

    public final PaymentsColors colors(boolean z11) {
        return z11 ? colorsDark : colorsLight;
    }

    public final PaymentsColors getColorsDark() {
        return colorsDark;
    }

    public final PaymentsColors getColorsLight() {
        return colorsLight;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final PaymentsShapes getShapes() {
        return shapes;
    }

    public final PaymentsTypography getTypography() {
        return typography;
    }
}