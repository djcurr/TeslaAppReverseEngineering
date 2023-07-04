package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzij extends zzhr {
    final CharSequence zzb;
    final zzhw zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzij(zzik zzikVar, CharSequence charSequence) {
        zzhw zzhwVar;
        zzhwVar = zzikVar.zza;
        this.zzc = zzhwVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = "2.7.0";
    }

    @Override // com.google.android.libraries.places.internal.zzhr
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i11 = this.zzd;
        while (true) {
            int i12 = this.zzd;
            if (i12 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i12);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc == i11) {
                int i13 = zzc + 1;
                this.zzd = i13;
                if (i13 > this.zzb.length()) {
                    this.zzd = -1;
                }
            } else {
                if (i11 < zzd) {
                    this.zzb.charAt(i11);
                }
                if (i11 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i14 = this.zze;
                if (i14 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i11) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i14 - 1;
                }
                return this.zzb.subSequence(i11, zzd).toString();
            }
        }
    }

    abstract int zzc(int i11);

    abstract int zzd(int i11);
}