package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class ExpandableInfoCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9601d;

    /* renamed from: e  reason: collision with root package name */
    private String f9602e;

    /* renamed from: g  reason: collision with root package name */
    private String f9604g;

    /* renamed from: i  reason: collision with root package name */
    private String f9606i;

    /* renamed from: j  reason: collision with root package name */
    private String f9607j;

    /* renamed from: f  reason: collision with root package name */
    private int f9603f = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f9605h = -1;

    public String getBorderColor() {
        return this.f9604g;
    }

    public int getBorderWidth() {
        return this.f9605h;
    }

    public String getExpandedStateIndicatorColor() {
        return this.f9606i;
    }

    public String getHeadingTextColor() {
        return this.f9601d;
    }

    public String getHeadingTextFontName() {
        return this.f9602e;
    }

    public int getHeadingTextFontSize() {
        return this.f9603f;
    }

    public String getHighlightedBackgroundColor() {
        return this.f9607j;
    }

    public void setBorderColor(String str) {
        this.f9604g = a(str);
    }

    public void setBorderWidth(int i11) {
        this.f9605h = a("borderWidth", i11).intValue();
    }

    public void setExpandStateIndicatorColor(String str) {
        this.f9606i = a(str);
    }

    public void setHeadingTextColor(String str) {
        this.f9601d = a(str);
    }

    public void setHeadingTextFontName(String str) {
        this.f9602e = a("fontName", str);
    }

    public void setHeadingTextFontSize(int i11) {
        this.f9603f = a("fontSize", i11).intValue();
    }

    public void setHighlightedBackgroundColor(String str) {
        this.f9607j = a(str);
    }
}