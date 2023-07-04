package com.wix.reactnativenotifications.core.notification;

import android.os.Bundle;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected Bundle f22953a;

    public c(Bundle bundle) {
        this.f22953a = bundle;
    }

    public Bundle a() {
        return com.wix.reactnativenotifications.a.a((Bundle) this.f22953a.clone());
    }

    public boolean b() {
        return this.f22953a.containsKey("google.message_id");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(1024);
        for (String str : this.f22953a.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(this.f22953a.get(str));
            sb2.append(", ");
        }
        return sb2.toString();
    }
}