package com.plaid.internal.core.crashreporting.internal.models;

import android.content.res.Resources;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CrashApiOptionsKt {
    public static final CrashApiOptions toCrashOptions(SentryProject sentryProject, Resources resources, String str) {
        s.g(sentryProject, "<this>");
        s.g(resources, "resources");
        int projectNumber = sentryProject.getProjectNumber();
        String string = resources.getString(sentryProject.getKeyResId());
        s.f(string, "resources.getString(this.keyResId)");
        return new CrashApiOptions(projectNumber, string, str);
    }
}