package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhp extends zzhu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhp(zzhr zzhrVar, String str, Double d11, boolean z11) {
        super(zzhrVar, "measurement.test.double_flag", d11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + str.length());
            sb2.append("Invalid double value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}