package com.reactnativecommunity.picker;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f20132a;

    public i(int i11) {
        this.f20132a = i11;
    }

    public int a() {
        return this.f20132a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && this.f20132a == ((i) obj).f20132a;
    }

    public int hashCode() {
        return this.f20132a + 31;
    }

    public String toString() {
        return "RectPickerLocalData{height=" + this.f20132a + CoreConstants.CURLY_RIGHT;
    }
}