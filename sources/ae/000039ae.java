package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f17037a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        fn.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f17037a == null) {
            f17037a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f17037a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}