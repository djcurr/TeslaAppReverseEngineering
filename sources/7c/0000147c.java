package com.android.volley;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f10276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10277b;

    public e(String str, String str2) {
        this.f10276a = str;
        this.f10277b = str2;
    }

    public final String a() {
        return this.f10276a;
    }

    public final String b() {
        return this.f10277b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return TextUtils.equals(this.f10276a, eVar.f10276a) && TextUtils.equals(this.f10277b, eVar.f10277b);
    }

    public int hashCode() {
        return (this.f10276a.hashCode() * 31) + this.f10277b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f10276a + ",value=" + this.f10277b + "]";
    }
}