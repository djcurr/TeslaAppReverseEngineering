package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.internal.zzja;
import com.google.android.libraries.places.internal.zzjb;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbe {
    private static final zzjb zza;
    private static final LocalTime zzb;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza(1, DayOfWeek.SUNDAY);
        zzjaVar.zza(2, DayOfWeek.MONDAY);
        zzjaVar.zza(3, DayOfWeek.TUESDAY);
        zzjaVar.zza(4, DayOfWeek.WEDNESDAY);
        zzjaVar.zza(5, DayOfWeek.THURSDAY);
        zzjaVar.zza(6, DayOfWeek.FRIDAY);
        zzjaVar.zza(7, DayOfWeek.SATURDAY);
        zza = zzjaVar.zzb();
        zzb = LocalTime.newInstance(23, 59);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean zza(com.google.android.libraries.places.api.model.Place r12, long r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzbe.zza(com.google.android.libraries.places.api.model.Place, long):java.lang.Boolean");
    }

    private static Object zzb(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }
}