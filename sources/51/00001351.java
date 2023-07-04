package com.adyen.threeds2.customization;

/* loaded from: classes.dex */
public final class ToolbarCustomization extends Customization {

    /* renamed from: d  reason: collision with root package name */
    private String f9623d;

    /* renamed from: e  reason: collision with root package name */
    private String f9624e;

    /* renamed from: f  reason: collision with root package name */
    private String f9625f;

    public String getBackgroundColor() {
        return this.f9623d;
    }

    public String getButtonText() {
        return this.f9625f;
    }

    public String getHeaderText() {
        return this.f9624e;
    }

    public void setBackgroundColor(String str) {
        this.f9623d = a(str);
    }

    public void setButtonText(String str) {
        this.f9625f = a("buttonText", str);
    }

    public void setHeaderText(String str) {
        this.f9624e = a("headerText", str);
    }
}