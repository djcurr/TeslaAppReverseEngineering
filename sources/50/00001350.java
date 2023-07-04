package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class TextBoxCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9620d;

    /* renamed from: e  reason: collision with root package name */
    private int f9621e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f9622f = -1;

    public String getBorderColor() {
        return this.f9620d;
    }

    public int getBorderWidth() {
        return this.f9621e;
    }

    public int getCornerRadius() {
        return this.f9622f;
    }

    public void setBorderColor(String str) {
        this.f9620d = a(str);
    }

    public void setBorderWidth(int i11) {
        this.f9621e = a("borderWidth", i11).intValue();
    }

    public void setCornerRadius(int i11) {
        this.f9622f = a("cornerRadius", i11).intValue();
    }
}