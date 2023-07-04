package com.plaid.internal;

import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class na {

    /* renamed from: a  reason: collision with root package name */
    public final Application f19081a;

    public na(Application application) {
        kotlin.jvm.internal.s.g(application, "application");
        this.f19081a = application;
    }

    public final String a() {
        Bundle bundle = this.f19081a.getPackageManager().getApplicationInfo(this.f19081a.getPackageName(), 128).metaData;
        if (bundle == null) {
            return null;
        }
        return bundle.getString("com.plaid.link.react_native");
    }
}