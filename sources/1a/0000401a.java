package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CrashContextTypeAdapter implements q<CrashContext> {
    @Override // com.google.gson.q
    public k serialize(CrashContext crashContext, Type type, p pVar) {
        if (crashContext == null) {
            return new m();
        }
        Map<String, String> tags$crash_reporting_release = crashContext.getTags$crash_reporting_release();
        if (tags$crash_reporting_release == null) {
            new m();
        }
        m mVar = new m();
        s.e(tags$crash_reporting_release);
        for (Map.Entry<String, String> entry : tags$crash_reporting_release.entrySet()) {
            mVar.n(entry.getKey(), entry.getValue());
        }
        return mVar;
    }
}