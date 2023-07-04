package com.stripe.android.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class ContextUtils {
    public static final ContextUtils INSTANCE = new ContextUtils();

    private ContextUtils() {
    }

    public final /* synthetic */ PackageInfo getPackageInfo$payments_core_release(Context context) {
        Object b11;
        s.g(context, "<this>");
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.g(b11)) {
            b11 = null;
        }
        return (PackageInfo) b11;
    }
}