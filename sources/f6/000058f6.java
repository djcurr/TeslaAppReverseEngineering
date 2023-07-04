package com.stripe.android.stripe3ds2.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.d;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.Customization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class CustomizeUtils {
    private static final float DEFAULT_DARKEN_FACTOR = 0.8f;
    public static final CustomizeUtils INSTANCE = new CustomizeUtils();

    private CustomizeUtils() {
    }

    public static final String colorIntToHex(int i11) {
        int alpha = Color.alpha(i11);
        int blue = Color.blue(i11);
        int green = Color.green(i11);
        int red = Color.red(i11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        q0 q0Var = q0.f34921a;
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(alpha)}, 1));
        s.f(format, "format(locale, format, *args)");
        sb2.append(format);
        String format2 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(red)}, 1));
        s.f(format2, "format(locale, format, *args)");
        sb2.append(format2);
        String format3 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(green)}, 1));
        s.f(format3, "format(locale, format, *args)");
        sb2.append(format3);
        String format4 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(blue)}, 1));
        s.f(format4, "format(locale, format, *args)");
        sb2.append(format4);
        return sb2.toString();
    }

    public static final String requireValidColor(String hexColor) {
        Object b11;
        s.g(hexColor, "hexColor");
        try {
            q.a aVar = q.f54772b;
            Color.parseColor(hexColor);
            b11 = q.b(hexColor);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.e(b11) == null) {
            return (String) b11;
        }
        throw new InvalidInputException(s.p("Unable to parse color: ", hexColor), null, 2, null);
    }

    public static final int requireValidDimension(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new InvalidInputException("Dimension must be greater or equal to 0", null, 2, null);
    }

    public static final int requireValidFontSize(int i11) {
        if (i11 > 0) {
            return i11;
        }
        throw new InvalidInputException("Font size must be greater than 0", null, 2, null);
    }

    public static final String requireValidString(String string) {
        boolean w11;
        s.g(string, "string");
        w11 = v.w(string);
        if (w11) {
            throw new InvalidInputException("String must not be null or empty", null, 2, null);
        }
        return string;
    }

    public final void applyProgressBarColor$3ds2sdk_release(ProgressBar progressBar, UiCustomization uiCustomization) {
        String accentColor;
        s.g(progressBar, "progressBar");
        if (uiCustomization == null || (accentColor = uiCustomization.getAccentColor()) == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(accentColor)));
    }

    public final SpannableString buildStyledText(Context context, String text, Customization customization) {
        s.g(context, "context");
        s.g(text, "text");
        s.g(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String textColor = customization.getTextColor();
        if (textColor != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(textColor)), 0, spannableString.length(), 0);
        }
        Integer valueOf = Integer.valueOf(customization.getTextFontSize());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, valueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String textFontName = customization.getTextFontName();
        if (textFontName != null) {
            spannableString.setSpan(new TypefaceSpan(textFontName), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int darken$3ds2sdk_release(int i11, float f11) {
        return Color.argb(Color.alpha(i11), Math.min(Math.max((int) (Color.red(i11) * f11), 0), 255), Math.min(Math.max((int) (Color.green(i11) * f11), 0), 255), Math.min(Math.max((int) (Color.blue(i11) * f11), 0), 255));
    }

    public final void setStatusBarColor(d activity, int i11) {
        s.g(activity, "activity");
        activity.getWindow().setStatusBarColor(i11);
    }

    public final int darken$3ds2sdk_release(int i11) {
        return darken$3ds2sdk_release(i11, DEFAULT_DARKEN_FACTOR);
    }
}