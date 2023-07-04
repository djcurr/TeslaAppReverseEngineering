package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.phenotype.PhenotypeFlag;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzs extends PhenotypeFlag<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(PhenotypeFlag.Factory factory, String str, String str2) {
        super(factory, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    /* renamed from: zzb */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzap, null);
        } catch (ClassCastException e11) {
            String valueOf = String.valueOf(this.zzap);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e11);
            return null;
        }
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    public final /* synthetic */ String zza(String str) {
        return str;
    }
}