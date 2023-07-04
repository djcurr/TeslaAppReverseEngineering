package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzfs {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;

    public final synchronized String zza() {
        zzig.zzi(zzf(), "ApiConfig must be initialized.");
        Objects.requireNonNull(this.zza);
        return this.zza;
    }

    public final synchronized Locale zzb() {
        zzig.zzi(zzf(), "ApiConfig must be initialized.");
        return this.zzb == null ? Locale.getDefault() : this.zzb;
    }

    public final synchronized void zzc() {
        this.zza = null;
        this.zzb = null;
    }

    public final synchronized void zzd(String str, Locale locale, boolean z11) {
        zzig.zzc(str, "API Key must not be null.");
        zzig.zze(!str.isEmpty(), "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final boolean zze() {
        return false;
    }

    public final synchronized boolean zzf() {
        return this.zza != null;
    }
}