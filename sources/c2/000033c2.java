package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class zzlk extends zzkz {
    private static final Set zza;
    private static final zzkr zzb;
    private static final zzlh zzc;
    private final String zzd;
    private final Level zze;
    private final Set zzf;
    private final zzkr zzg;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzjz.zza, zzkf.zza)));
        zza = unmodifiableSet;
        zzb = zzku.zza(unmodifiableSet).zzd();
        zzc = new zzlh();
    }

    public /* synthetic */ zzlk(String str, String str2, boolean z11, boolean z12, Level level, Set set, zzkr zzkrVar, zzlj zzljVar) {
        super(str2);
        if (str2.length() > 23) {
            int i11 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str2 = str2.substring(i11 + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        this.zzd = concat.substring(0, Math.min(concat.length(), 23));
        this.zze = level;
        this.zzf = set;
        this.zzg = zzkrVar;
    }
}