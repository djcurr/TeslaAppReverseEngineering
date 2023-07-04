package com.google.android.libraries.places.internal;

import com.google.gson.JsonSyntaxException;
import com.google.gson.c;
import com.google.gson.e;
import com.google.gson.f;

/* loaded from: classes3.dex */
public final class zzej {
    private final e zza = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b();

    public final Object zza(String str, Class cls) {
        try {
            return this.zza.h(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            throw new zzdh("Could not convert JSON string to " + name + " due to syntax errors.");
        }
    }
}