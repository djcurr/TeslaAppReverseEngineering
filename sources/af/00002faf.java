package com.google.android.gms.measurement.internal;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.internal.measurement.zzoh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzy extends zzx {
    final /* synthetic */ zzz zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, String str, int i11, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i11);
        this.zza = zzzVar;
        this.zzh = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final int zza() {
        return this.zzh.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzc() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(Long l11, Long l12, com.google.android.gms.internal.measurement.zzgh zzghVar, boolean z11) {
        zzoh.zzc();
        boolean zzs = this.zza.zzs.zzf().zzs(this.zzb, zzdw.zzU);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        byte b11 = (zzg || zzh || zzi) ? (byte) 1 : (byte) 0;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z11 && b11 == 0) {
            this.zza.zzs.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzghVar.zzr()) {
            if (!zzb.zzi()) {
                this.zza.zzs.zzay().zzk().zzb("No number filter for long property. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
            } else {
                bool = zzx.zzj(zzx.zzh(zzghVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzghVar.zzq()) {
            if (!zzb.zzi()) {
                this.zza.zzs.zzay().zzk().zzb("No number filter for double property. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
            } else {
                bool = zzx.zzj(zzx.zzg(zzghVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzghVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.zza.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
                } else if (zzkt.zzx(zzghVar.zzg())) {
                    bool = zzx.zzj(zzx.zzi(zzghVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.zza.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzj().zzf(zzghVar.zzf()), zzghVar.zzg());
                }
            } else {
                bool = zzx.zzj(zzx.zzf(zzghVar.zzg(), zzb.zzd(), this.zza.zzs.zzay()), zzg2);
            }
        } else {
            this.zza.zzs.zzay().zzk().zzb("User property has no value, property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
        }
        this.zza.zzs.zzay().zzj().zzb("Property filter result", bool == null ? Address.ADDRESS_NULL_PLACEHOLDER : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z11 || this.zzh.zzg()) {
                this.zze = bool;
            }
            if (bool.booleanValue() && b11 != 0 && zzghVar.zzs()) {
                long zzc = zzghVar.zzc();
                if (l11 != null) {
                    zzc = l11.longValue();
                }
                if (zzs && this.zzh.zzg() && !this.zzh.zzh() && l12 != null) {
                    zzc = l12.longValue();
                }
                if (this.zzh.zzh()) {
                    this.zzg = Long.valueOf(zzc);
                } else {
                    this.zzf = Long.valueOf(zzc);
                }
            }
            return true;
        }
        return true;
    }
}