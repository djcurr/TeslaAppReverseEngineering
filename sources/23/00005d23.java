package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class StripeColorUtils {
    public static final Companion Companion = new Companion(null);
    private final int colorAccent;
    private final int colorControlNormal;
    private final Context context;
    private final int textColorPrimary;
    private final int textColorSecondary;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isColorDark(int i11) {
            return (((((double) Color.red(i11)) * 0.299d) + (((double) Color.green(i11)) * 0.587d)) + (((double) Color.blue(i11)) * 0.114d)) / ((double) 255) <= 0.5d;
        }

        public final boolean isColorTransparent(int i11) {
            return Color.alpha(i11) < 16;
        }
    }

    public StripeColorUtils(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.context = context;
        this.colorAccent = getTypedValue(16843829).data;
        this.colorControlNormal = getTypedValue(16843817).data;
        this.textColorPrimary = getTypedValue(16842806).data;
        this.textColorSecondary = getTypedValue(16842808).data;
    }

    private final TypedValue getTypedValue(int i11) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue;
    }

    public final int getColorAccent() {
        return this.colorAccent;
    }

    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final Drawable getTintedIconWithAttribute(Resources.Theme theme, int i11, int i12) {
        kotlin.jvm.internal.s.g(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i11, typedValue, true);
        int i13 = typedValue.data;
        Drawable drawable = androidx.core.content.b.getDrawable(this.context, i12);
        kotlin.jvm.internal.s.e(drawable);
        Drawable compatIcon = n3.a.r(drawable);
        n3.a.n(compatIcon.mutate(), i13);
        kotlin.jvm.internal.s.f(compatIcon, "compatIcon");
        return compatIcon;
    }
}