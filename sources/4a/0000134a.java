package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class ButtonCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9596d;

    /* renamed from: e  reason: collision with root package name */
    private int f9597e = -1;

    public String getBackgroundColor() {
        return this.f9596d;
    }

    public int getCornerRadius() {
        return this.f9597e;
    }

    public void setBackgroundColor(String str) {
        this.f9596d = a(str);
    }

    public void setCornerRadius(int i11) {
        this.f9597e = a("cornerRadius", i11).intValue();
    }
}