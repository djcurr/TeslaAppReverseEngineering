package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhn extends zzhu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhn(zzhr zzhrVar, String str, Long l11, boolean z11) {
        super(zzhrVar, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}