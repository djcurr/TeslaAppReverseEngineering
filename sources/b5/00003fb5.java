package com.plaid.internal;

import android.os.Build;
import android.webkit.WebResourceError;

/* loaded from: classes2.dex */
public final class ad {
    public static final String a(WebResourceError webResourceError) {
        kotlin.jvm.internal.s.g(webResourceError, "<this>");
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder a11 = g4.a("WebResourceError { Error Code: ");
            a11.append(webResourceError.getErrorCode());
            a11.append(" ; Description: ");
            a11.append((Object) webResourceError.getDescription());
            a11.append(" }");
            return a11.toString();
        }
        return "Could not get description, SDK is less than 23";
    }
}