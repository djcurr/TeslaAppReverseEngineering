package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzik {
    private final zzhw zza;
    private final zzii zzb;

    private zzik(zzii zziiVar, byte[] bArr) {
        zzhv zzhvVar = zzhv.zza;
        this.zzb = zziiVar;
        this.zza = zzhvVar;
    }

    public static zzik zzb(char c11) {
        return new zzik(new zzii(new zzht(CoreConstants.DOT)), null);
    }

    public final List zzc(CharSequence charSequence) {
        zzih zzihVar = new zzih(this.zzb, this, "2.7.0");
        ArrayList arrayList = new ArrayList();
        while (zzihVar.hasNext()) {
            arrayList.add((String) zzihVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}