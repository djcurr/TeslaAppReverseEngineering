package com.stripe.android.ui.core.elements.menu;

import p0.u;
import p0.w;
import x2.g;

/* loaded from: classes6.dex */
public final class MenuDefaults {
    public static final MenuDefaults INSTANCE = new MenuDefaults();
    private static final w DropdownMenuItemContentPadding = u.b(MenuKt.getDropdownMenuItemHorizontalPadding(), g.f(0));

    private MenuDefaults() {
    }

    public final w getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }
}