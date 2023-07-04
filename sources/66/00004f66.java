package com.stripe.android.link.theme;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ThemeKt$LocalColors$1 extends u implements a<LinkColors> {
    public static final ThemeKt$LocalColors$1 INSTANCE = new ThemeKt$LocalColors$1();

    ThemeKt$LocalColors$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final LinkColors invoke() {
        return LinkThemeConfig.INSTANCE.colors(false);
    }
}