package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzafq extends zzafu {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzafq() {
        super(null);
    }

    public /* synthetic */ zzafq(zzafp zzafpVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzafu
    public final void zza(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) zzahs.zzf(obj, j11);
        if (list instanceof zzafo) {
            unmodifiableList = ((zzafo) list).zzd();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzagn) && (list instanceof zzafg)) {
                zzafg zzafgVar = (zzafg) list;
                if (zzafgVar.zzc()) {
                    zzafgVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzahs.zzs(obj, j11, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzafu
    public final void zzb(Object obj, Object obj2, long j11) {
        zzafn zzafnVar;
        List list = (List) zzahs.zzf(obj2, j11);
        int size = list.size();
        List list2 = (List) zzahs.zzf(obj, j11);
        if (list2.isEmpty()) {
            if (list2 instanceof zzafo) {
                list2 = new zzafn(size);
            } else if ((list2 instanceof zzagn) && (list2 instanceof zzafg)) {
                list2 = ((zzafg) list2).zzf(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzahs.zzs(obj, j11, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzahs.zzs(obj, j11, arrayList);
                zzafnVar = arrayList;
            } else if (list2 instanceof zzahn) {
                zzafn zzafnVar2 = new zzafn(list2.size() + size);
                zzafnVar2.addAll(zzafnVar2.size(), (zzahn) list2);
                zzahs.zzs(obj, j11, zzafnVar2);
                zzafnVar = zzafnVar2;
            } else if ((list2 instanceof zzagn) && (list2 instanceof zzafg)) {
                zzafg zzafgVar = (zzafg) list2;
                if (!zzafgVar.zzc()) {
                    list2 = zzafgVar.zzf(list2.size() + size);
                    zzahs.zzs(obj, j11, list2);
                }
            }
            list2 = zzafnVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzahs.zzs(obj, j11, list);
    }
}