package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzge;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzha extends zzfu<zzha> implements Cloneable {
    private byte[] zzbjn;
    private zzge.zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzge.zzs zzbkb;
    public boolean zzbkc;
    public long zzbjf = 0;
    public long zzbjg = 0;
    private long zzbjh = 0;
    private String tag = "";
    public int zzbji = 0;
    private String zzbjj = "";
    private int zzbjk = 0;
    private boolean zzbjl = false;
    private zzhb[] zzbjm = zzhb.zzge();

    public zzha() {
        byte[] bArr = zzgb.zzse;
        this.zzbjn = bArr;
        this.zzbjo = null;
        this.zzbjp = bArr;
        this.zzbjq = "";
        this.zzbjr = "";
        this.zzbjs = null;
        this.zzbjt = "";
        this.zzbju = 180000L;
        this.zzbjv = null;
        this.zzbjw = bArr;
        this.zzbjx = "";
        this.zzbjy = 0;
        this.zzbjz = zzgb.zzrx;
        this.zzbka = 0L;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzgd */
    public final zzha clone() {
        try {
            zzha zzhaVar = (zzha) super.clone();
            zzhb[] zzhbVarArr = this.zzbjm;
            if (zzhbVarArr != null && zzhbVarArr.length > 0) {
                zzhaVar.zzbjm = new zzhb[zzhbVarArr.length];
                int i11 = 0;
                while (true) {
                    zzhb[] zzhbVarArr2 = this.zzbjm;
                    if (i11 >= zzhbVarArr2.length) {
                        break;
                    }
                    if (zzhbVarArr2[i11] != null) {
                        zzhaVar.zzbjm[i11] = (zzhb) zzhbVarArr2[i11].clone();
                    }
                    i11++;
                }
            }
            zzge.zzd zzdVar = this.zzbjo;
            if (zzdVar != null) {
                zzhaVar.zzbjo = zzdVar;
            }
            zzgy zzgyVar = this.zzbjs;
            if (zzgyVar != null) {
                zzhaVar.zzbjs = (zzgy) zzgyVar.clone();
            }
            zzgz zzgzVar = this.zzbjv;
            if (zzgzVar != null) {
                zzhaVar.zzbjv = (zzgz) zzgzVar.clone();
            }
            int[] iArr = this.zzbjz;
            if (iArr != null && iArr.length > 0) {
                zzhaVar.zzbjz = (int[]) iArr.clone();
            }
            zzge.zzs zzsVar = this.zzbkb;
            if (zzsVar != null) {
                zzhaVar.zzbkb = zzsVar;
            }
            return zzhaVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzha) {
            zzha zzhaVar = (zzha) obj;
            if (this.zzbjf == zzhaVar.zzbjf && this.zzbjg == zzhaVar.zzbjg) {
                String str = this.tag;
                if (str == null) {
                    if (zzhaVar.tag != null) {
                        return false;
                    }
                } else if (!str.equals(zzhaVar.tag)) {
                    return false;
                }
                if (this.zzbji != zzhaVar.zzbji) {
                    return false;
                }
                String str2 = this.zzbjj;
                if (str2 == null) {
                    if (zzhaVar.zzbjj != null) {
                        return false;
                    }
                } else if (!str2.equals(zzhaVar.zzbjj)) {
                    return false;
                }
                if (zzfy.equals(this.zzbjm, zzhaVar.zzbjm) && Arrays.equals(this.zzbjn, zzhaVar.zzbjn)) {
                    zzge.zzd zzdVar = this.zzbjo;
                    if (zzdVar == null) {
                        if (zzhaVar.zzbjo != null) {
                            return false;
                        }
                    } else if (!zzdVar.equals(zzhaVar.zzbjo)) {
                        return false;
                    }
                    if (Arrays.equals(this.zzbjp, zzhaVar.zzbjp)) {
                        String str3 = this.zzbjq;
                        if (str3 == null) {
                            if (zzhaVar.zzbjq != null) {
                                return false;
                            }
                        } else if (!str3.equals(zzhaVar.zzbjq)) {
                            return false;
                        }
                        String str4 = this.zzbjr;
                        if (str4 == null) {
                            if (zzhaVar.zzbjr != null) {
                                return false;
                            }
                        } else if (!str4.equals(zzhaVar.zzbjr)) {
                            return false;
                        }
                        zzgy zzgyVar = this.zzbjs;
                        if (zzgyVar == null) {
                            if (zzhaVar.zzbjs != null) {
                                return false;
                            }
                        } else if (!zzgyVar.equals(zzhaVar.zzbjs)) {
                            return false;
                        }
                        String str5 = this.zzbjt;
                        if (str5 == null) {
                            if (zzhaVar.zzbjt != null) {
                                return false;
                            }
                        } else if (!str5.equals(zzhaVar.zzbjt)) {
                            return false;
                        }
                        if (this.zzbju != zzhaVar.zzbju) {
                            return false;
                        }
                        zzgz zzgzVar = this.zzbjv;
                        if (zzgzVar == null) {
                            if (zzhaVar.zzbjv != null) {
                                return false;
                            }
                        } else if (!zzgzVar.equals(zzhaVar.zzbjv)) {
                            return false;
                        }
                        if (Arrays.equals(this.zzbjw, zzhaVar.zzbjw)) {
                            String str6 = this.zzbjx;
                            if (str6 == null) {
                                if (zzhaVar.zzbjx != null) {
                                    return false;
                                }
                            } else if (!str6.equals(zzhaVar.zzbjx)) {
                                return false;
                            }
                            if (zzfy.equals(this.zzbjz, zzhaVar.zzbjz)) {
                                zzge.zzs zzsVar = this.zzbkb;
                                if (zzsVar == null) {
                                    if (zzhaVar.zzbkb != null) {
                                        return false;
                                    }
                                } else if (!zzsVar.equals(zzhaVar.zzbkb)) {
                                    return false;
                                }
                                if (this.zzbkc != zzhaVar.zzbkc) {
                                    return false;
                                }
                                zzfw zzfwVar = this.zzrj;
                                if (zzfwVar == null || zzfwVar.isEmpty()) {
                                    zzfw zzfwVar2 = zzhaVar.zzrj;
                                    return zzfwVar2 == null || zzfwVar2.isEmpty();
                                }
                                return this.zzrj.equals(zzhaVar.zzrj);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.zzbjf;
        long j12 = this.zzbjg;
        int hashCode = (((((zzha.class.getName().hashCode() + 527) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31 * 31;
        String str = this.tag;
        int i11 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        String str2 = this.zzbjj;
        int hashCode3 = ((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31 * 31) + 1237) * 31) + zzfy.hashCode(this.zzbjm)) * 31) + Arrays.hashCode(this.zzbjn);
        zzge.zzd zzdVar = this.zzbjo;
        int hashCode4 = ((((hashCode3 * 31) + (zzdVar == null ? 0 : zzdVar.hashCode())) * 31) + Arrays.hashCode(this.zzbjp)) * 31;
        String str3 = this.zzbjq;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzbjr;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        zzgy zzgyVar = this.zzbjs;
        int hashCode7 = ((hashCode6 * 31) + (zzgyVar == null ? 0 : zzgyVar.hashCode())) * 31;
        String str5 = this.zzbjt;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j13 = this.zzbju;
        zzgz zzgzVar = this.zzbjv;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (zzgzVar == null ? 0 : zzgzVar.hashCode())) * 31) + Arrays.hashCode(this.zzbjw)) * 31;
        String str6 = this.zzbjx;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        zzge.zzs zzsVar = this.zzbkb;
        int hashCode11 = (((((((hashCode9 + hashCode10) * 31 * 31) + zzfy.hashCode(this.zzbjz)) * 31 * 31) + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31) + (this.zzbkc ? 1231 : 1237)) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            i11 = this.zzrj.hashCode();
        }
        return hashCode11 + i11;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) {
        long j11 = this.zzbjf;
        if (j11 != 0) {
            zzfsVar.zzi(1, j11);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(2, this.tag);
        }
        zzhb[] zzhbVarArr = this.zzbjm;
        int i11 = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i12 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i12];
                if (zzhbVar != null) {
                    zzfsVar.zza(3, zzhbVar);
                }
                i12++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzfsVar.zza(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzfsVar.zza(6, this.zzbjp);
        }
        zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            zzfsVar.zza(7, zzgyVar);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(8, this.zzbjq);
        }
        zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            zzfsVar.zze(9, zzdVar);
        }
        int i13 = this.zzbji;
        if (i13 != 0) {
            zzfsVar.zzc(11, i13);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzfsVar.zza(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzfsVar.zza(14, this.zzbjt);
        }
        long j12 = this.zzbju;
        if (j12 != 180000) {
            zzfsVar.zzb(15, 0);
            zzfsVar.zzn(zzfs.zzj(j12));
        }
        zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            zzfsVar.zza(16, zzgzVar);
        }
        long j13 = this.zzbjg;
        if (j13 != 0) {
            zzfsVar.zzi(17, j13);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzfsVar.zza(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.zzbjz;
                if (i11 >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(20, iArr2[i11]);
                i11++;
            }
        }
        zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            zzfsVar.zze(23, zzsVar);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzfsVar.zza(24, this.zzbjx);
        }
        boolean z11 = this.zzbkc;
        if (z11) {
            zzfsVar.zzb(25, z11);
        }
        String str6 = this.zzbjj;
        if (str6 != null && !str6.equals("")) {
            zzfsVar.zza(26, this.zzbjj);
        }
        super.zza(zzfsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int[] iArr;
        int zzen = super.zzen();
        long j11 = this.zzbjf;
        if (j11 != 0) {
            zzen += zzfs.zzd(1, j11);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            zzen += zzfs.zzb(2, this.tag);
        }
        zzhb[] zzhbVarArr = this.zzbjm;
        int i11 = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i12 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i12];
                if (zzhbVar != null) {
                    zzen += zzfs.zzb(3, zzhbVar);
                }
                i12++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzen += zzfs.zzb(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzen += zzfs.zzb(6, this.zzbjp);
        }
        zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            zzen += zzfs.zzb(7, zzgyVar);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzen += zzfs.zzb(8, this.zzbjq);
        }
        zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            zzen += zzbn.zzc(9, zzdVar);
        }
        int i13 = this.zzbji;
        if (i13 != 0) {
            zzen += zzfs.zzr(11) + zzfs.zzs(i13);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzen += zzfs.zzb(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzen += zzfs.zzb(14, this.zzbjt);
        }
        long j12 = this.zzbju;
        if (j12 != 180000) {
            zzen += zzfs.zzr(15) + zzfs.zzo(zzfs.zzj(j12));
        }
        zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            zzen += zzfs.zzb(16, zzgzVar);
        }
        long j13 = this.zzbjg;
        if (j13 != 0) {
            zzen += zzfs.zzd(17, j13);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzen += zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr2 = this.zzbjz;
        if (iArr2 != null && iArr2.length > 0) {
            int i14 = 0;
            while (true) {
                iArr = this.zzbjz;
                if (i11 >= iArr.length) {
                    break;
                }
                i14 += zzfs.zzs(iArr[i11]);
                i11++;
            }
            zzen = zzen + i14 + (iArr.length * 2);
        }
        zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            zzen += zzbn.zzc(23, zzsVar);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzen += zzfs.zzb(24, this.zzbjx);
        }
        if (this.zzbkc) {
            zzen += zzfs.zzr(25) + 1;
        }
        String str6 = this.zzbjj;
        return (str6 == null || str6.equals("")) ? zzen : zzen + zzfs.zzb(26, this.zzbjj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzha zzeo() {
        return (zzha) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final /* synthetic */ zzfz zzep() {
        return (zzha) clone();
    }
}