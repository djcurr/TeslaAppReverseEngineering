package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzho extends zzhu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzho(zzhr zzhrVar, String str, Boolean bool, boolean z11) {
        super(zzhrVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgv.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgv.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 28 + str.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(zzc);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}