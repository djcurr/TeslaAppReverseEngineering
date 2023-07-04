package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class SelectionItemCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9616d;

    /* renamed from: e  reason: collision with root package name */
    private String f9617e;

    /* renamed from: f  reason: collision with root package name */
    private String f9618f;

    /* renamed from: g  reason: collision with root package name */
    private int f9619g = -1;

    public String getBorderColor() {
        return this.f9618f;
    }

    public int getBorderWidth() {
        return this.f9619g;
    }

    public String getHighlightedBackgroundColor() {
        return this.f9617e;
    }

    public String getSelectionIndicatorTintColor() {
        return this.f9616d;
    }

    public void setBorderColor(String str) {
        this.f9618f = a(str);
    }

    public void setBorderWidth(int i11) {
        this.f9619g = a("borderWidth", i11).intValue();
    }

    public void setHighlightedBackgroundColor(String str) {
        this.f9617e = a(str);
    }

    public void setSelectionIndicatorTintColor(String str) {
        this.f9616d = a(str);
    }
}