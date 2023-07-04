package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class zzek extends zzdf {
    private final Locale zza;
    private final String zzb;
    private final zzgf zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzek(zzft zzftVar, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(zzftVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzgfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzg(Map map, String str, Object obj, Object obj2) {
        String obj3 = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(obj3)) {
            return;
        }
        map.put(str, obj3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzdf
    public final String zzc() {
        zzew zzewVar = new zzew(zze(), this.zzb);
        zzewVar.zza(this.zza);
        zzewVar.zzb(zzf());
        return zzewVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzd() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzc.zza());
        hashMap.put("X-Places-Android-Sdk", "2.7.0");
        return hashMap;
    }

    protected abstract String zze();

    protected abstract Map zzf();
}