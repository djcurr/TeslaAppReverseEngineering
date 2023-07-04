package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;

/* loaded from: classes3.dex */
public final class zzdm extends zzjn<zzdm> {
    private static volatile zzdm[] zzoo;
    private zzcz.zzd.zzb zzor;
    public String name = null;
    private String zzop = null;
    private String[] zzoq = zzjw.zzady;
    public String zzos = null;
    public Long zzot = null;
    public Long zzou = null;
    public zzdt[] zzov = zzdt.zzcd();

    public zzdm() {
        this.zzadp = -1;
    }

    public static zzdm[] zzcb() {
        if (zzoo == null) {
            synchronized (zzjr.zzado) {
                if (zzoo == null) {
                    zzoo = new zzdm[0];
                }
            }
        }
        return zzoo;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        String str = this.name;
        if (str != null) {
            zzjlVar.zza(1, str);
        }
        String str2 = this.zzop;
        if (str2 != null) {
            zzjlVar.zza(2, str2);
        }
        String[] strArr = this.zzoq;
        int i11 = 0;
        if (strArr != null && strArr.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.zzoq;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i12];
                if (str3 != null) {
                    zzjlVar.zza(3, str3);
                }
                i12++;
            }
        }
        zzcz.zzd.zzb zzbVar = this.zzor;
        if (zzbVar != null && zzbVar != null) {
            zzjlVar.zze(4, zzbVar.zzr());
        }
        String str4 = this.zzos;
        if (str4 != null) {
            zzjlVar.zza(5, str4);
        }
        Long l11 = this.zzot;
        if (l11 != null) {
            zzjlVar.zzi(6, l11.longValue());
        }
        Long l12 = this.zzou;
        if (l12 != null) {
            zzjlVar.zzi(7, l12.longValue());
        }
        zzdt[] zzdtVarArr = this.zzov;
        if (zzdtVarArr != null && zzdtVarArr.length > 0) {
            while (true) {
                zzdt[] zzdtVarArr2 = this.zzov;
                if (i11 >= zzdtVarArr2.length) {
                    break;
                }
                zzdt zzdtVar = zzdtVarArr2[i11];
                if (zzdtVar != null) {
                    zzjlVar.zza(8, zzdtVar);
                }
                i11++;
            }
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.name;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        String str2 = this.zzop;
        if (str2 != null) {
            zzt += zzjl.zzb(2, str2);
        }
        String[] strArr = this.zzoq;
        int i11 = 0;
        if (strArr != null && strArr.length > 0) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.zzoq;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i12];
                if (str3 != null) {
                    i14++;
                    i13 += zzjl.zzn(str3);
                }
                i12++;
            }
            zzt = zzt + i13 + (i14 * 1);
        }
        zzcz.zzd.zzb zzbVar = this.zzor;
        if (zzbVar != null && zzbVar != null) {
            zzt += zzjl.zzi(4, zzbVar.zzr());
        }
        String str4 = this.zzos;
        if (str4 != null) {
            zzt += zzjl.zzb(5, str4);
        }
        Long l11 = this.zzot;
        if (l11 != null) {
            zzt += zzjl.zzd(6, l11.longValue());
        }
        Long l12 = this.zzou;
        if (l12 != null) {
            zzt += zzjl.zzd(7, l12.longValue());
        }
        zzdt[] zzdtVarArr = this.zzov;
        if (zzdtVarArr != null && zzdtVarArr.length > 0) {
            while (true) {
                zzdt[] zzdtVarArr2 = this.zzov;
                if (i11 >= zzdtVarArr2.length) {
                    break;
                }
                zzdt zzdtVar = zzdtVarArr2[i11];
                if (zzdtVar != null) {
                    zzt += zzjl.zzb(8, zzdtVar);
                }
                i11++;
            }
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                this.name = zzjkVar.readString();
            } else if (zzdq == 18) {
                this.zzop = zzjkVar.readString();
            } else if (zzdq == 26) {
                int zzb = zzjw.zzb(zzjkVar, 26);
                String[] strArr = this.zzoq;
                int length = strArr == null ? 0 : strArr.length;
                int i11 = zzb + length;
                String[] strArr2 = new String[i11];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i11 - 1) {
                    strArr2[length] = zzjkVar.readString();
                    zzjkVar.zzdq();
                    length++;
                }
                strArr2[length] = zzjkVar.readString();
                this.zzoq = strArr2;
            } else if (zzdq == 32) {
                int position = zzjkVar.getPosition();
                int zzdt = zzjkVar.zzdt();
                if (zzdt != 0 && zzdt != 1 && zzdt != 2 && zzdt != 3) {
                    zzjkVar.zzbt(position);
                    zza(zzjkVar, zzdq);
                } else {
                    this.zzor = zzcz.zzd.zzb.zzt(zzdt);
                }
            } else if (zzdq == 42) {
                this.zzos = zzjkVar.readString();
            } else if (zzdq == 48) {
                this.zzot = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 56) {
                this.zzou = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq != 66) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                int zzb2 = zzjw.zzb(zzjkVar, 66);
                zzdt[] zzdtVarArr = this.zzov;
                int length2 = zzdtVarArr == null ? 0 : zzdtVarArr.length;
                int i12 = zzb2 + length2;
                zzdt[] zzdtVarArr2 = new zzdt[i12];
                if (length2 != 0) {
                    System.arraycopy(zzdtVarArr, 0, zzdtVarArr2, 0, length2);
                }
                while (length2 < i12 - 1) {
                    zzdtVarArr2[length2] = new zzdt();
                    zzjkVar.zza(zzdtVarArr2[length2]);
                    zzjkVar.zzdq();
                    length2++;
                }
                zzdtVarArr2[length2] = new zzdt();
                zzjkVar.zza(zzdtVarArr2[length2]);
                this.zzov = zzdtVarArr2;
            }
        }
    }
}