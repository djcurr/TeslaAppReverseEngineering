package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzgr extends zzgp {
    private static final Class<?> zzyp = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: private */
    public zzgr() {
        super();
    }

    private static <E> List<E> zzc(Object obj, long j11) {
        return (List) zziu.zzp(obj, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final <L> List<L> zza(Object obj, long j11) {
        return zza(obj, j11, 10);
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final void zzb(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) zziu.zzp(obj, j11);
        if (list instanceof zzgo) {
            unmodifiableList = ((zzgo) list).zzfu();
        } else if (zzyp.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzhr) && (list instanceof zzge)) {
                zzge zzgeVar = (zzge) list;
                if (zzgeVar.zzch()) {
                    zzgeVar.zzci();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zziu.zza(obj, j11, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j11, int i11) {
        zzgn zzgnVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j11);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzgo) {
                arrayList = new zzgn(i11);
            } else if ((zzc instanceof zzhr) && (zzc instanceof zzge)) {
                arrayList = ((zzge) zzc).zzah(i11);
            } else {
                arrayList = new ArrayList<>(i11);
            }
            zziu.zza(obj, j11, arrayList);
            return arrayList;
        }
        if (zzyp.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i11);
            arrayList2.addAll(zzc);
            zziu.zza(obj, j11, arrayList2);
            zzgnVar = arrayList2;
        } else if (zzc instanceof zzir) {
            zzgn zzgnVar2 = new zzgn(zzc.size() + i11);
            zzgnVar2.addAll((zzir) zzc);
            zziu.zza(obj, j11, zzgnVar2);
            zzgnVar = zzgnVar2;
        } else if ((zzc instanceof zzhr) && (zzc instanceof zzge)) {
            zzge zzgeVar = (zzge) zzc;
            if (zzgeVar.zzch()) {
                return zzc;
            }
            zzge zzah = zzgeVar.zzah(zzc.size() + i11);
            zziu.zza(obj, j11, zzah);
            return zzah;
        } else {
            return zzc;
        }
        return zzgnVar;
    }

    @Override // com.google.android.gms.internal.vision.zzgp
    public final <E> void zza(Object obj, Object obj2, long j11) {
        List zzc = zzc(obj2, j11);
        List zza = zza(obj, j11, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zziu.zza(obj, j11, zzc);
    }
}