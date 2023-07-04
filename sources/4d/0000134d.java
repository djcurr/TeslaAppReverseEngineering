package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class LabelCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9608d;

    /* renamed from: e  reason: collision with root package name */
    private String f9609e;

    /* renamed from: g  reason: collision with root package name */
    private String f9611g;

    /* renamed from: h  reason: collision with root package name */
    private String f9612h;

    /* renamed from: f  reason: collision with root package name */
    private int f9610f = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f9613i = -1;

    public String getHeadingTextColor() {
        return this.f9608d;
    }

    public String getHeadingTextFontName() {
        return this.f9609e;
    }

    public int getHeadingTextFontSize() {
        return this.f9610f;
    }

    public String getInputLabelTextColor() {
        return this.f9611g;
    }

    public String getInputLabelTextFontName() {
        return this.f9612h;
    }

    public int getInputLabelTextFontSize() {
        return this.f9613i;
    }

    public void setHeadingTextColor(String str) {
        this.f9608d = a(str);
    }

    public void setHeadingTextFontName(String str) {
        this.f9609e = a("fontName", str);
    }

    public void setHeadingTextFontSize(int i11) {
        this.f9610f = a("fontSize", i11).intValue();
    }

    public void setInputLabelTextColor(String str) {
        this.f9611g = a(str);
    }

    public void setInputLabelTextFontName(String str) {
        this.f9612h = a("fontName", str);
    }

    public void setInputLabelTextFontSize(int i11) {
        this.f9613i = a("fontSize", i11).intValue();
    }
}