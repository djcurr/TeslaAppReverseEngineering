package com.adyen.threeds2.customization;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.adyen.threeds2.util.Preconditions;

/* loaded from: classes.dex */
public class Customization {

    /* renamed from: a  reason: collision with root package name */
    private String f9598a;

    /* renamed from: b  reason: collision with root package name */
    private String f9599b;

    /* renamed from: c  reason: collision with root package name */
    private int f9600c = -1;

    public static Integer parseHexColorCode(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '#') {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Typeface parseTypeface(Context context, String str) {
        Typeface typeface;
        if (str == null) {
            return null;
        }
        try {
            typeface = Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            typeface = Typeface.createFromFile(str);
        } catch (Exception unused2) {
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            typeface = Typeface.create(str, 0);
        } catch (Exception unused3) {
        }
        if (typeface != null) {
            return typeface;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer a(String str, int i11) {
        Preconditions.requireNonNegative(str, i11);
        return Integer.valueOf(i11);
    }

    public String getTextColor() {
        return this.f9598a;
    }

    public String getTextFontName() {
        return this.f9599b;
    }

    public int getTextFontSize() {
        return this.f9600c;
    }

    public void setTextColor(String str) {
        this.f9598a = a(str);
    }

    public void setTextFontName(String str) {
        this.f9599b = a("fontName", str);
    }

    public void setTextFontSize(int i11) {
        this.f9600c = a("fontSize", i11).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        Preconditions.requireNonEmpty(str, str2);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        Preconditions.requireNonNull("hexColorCode", parseHexColorCode(str));
        return str;
    }
}