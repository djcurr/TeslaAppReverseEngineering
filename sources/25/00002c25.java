package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfc implements zzhv {
    private int tag;
    private int zzru;
    private final zzez zzsp;
    private int zzsq = 0;

    private zzfc(zzez zzezVar) {
        zzez zzezVar2 = (zzez) zzga.zza(zzezVar, "input");
        this.zzsp = zzezVar2;
        zzezVar2.zzsi = this;
    }

    public static zzfc zza(zzez zzezVar) {
        zzfc zzfcVar = zzezVar.zzsi;
        return zzfcVar != null ? zzfcVar : new zzfc(zzezVar);
    }

    private final void zzab(int i11) {
        if ((this.tag & 7) != i11) {
            throw zzgf.zzfm();
        }
    }

    private static void zzac(int i11) {
        if ((i11 & 7) != 0) {
            throw zzgf.zzfo();
        }
    }

    private static void zzad(int i11) {
        if ((i11 & 3) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzae(int i11) {
        if (this.zzsp.zzds() != i11) {
            throw zzgf.zzfh();
        }
    }

    private final <T> T zzd(zzhw<T> zzhwVar, zzfk zzfkVar) {
        int i11 = this.zzru;
        this.zzru = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzhwVar.newInstance();
            zzhwVar.zza(newInstance, this, zzfkVar);
            zzhwVar.zze(newInstance);
            if (this.tag == this.zzru) {
                return newInstance;
            }
            throw zzgf.zzfo();
        } finally {
            this.zzru = i11;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final double readDouble() {
        zzab(1);
        return this.zzsp.readDouble();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final float readFloat() {
        zzab(5);
        return this.zzsp.readFloat();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String readString() {
        zzab(2);
        return this.zzsp.readString();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void readStringList(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzb(Class<T> cls, zzfk zzfkVar) {
        zzab(3);
        return (T) zzd(zzhs.zzgl().zzf(cls), zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzc(zzhw<T> zzhwVar, zzfk zzfkVar) {
        zzab(3);
        return (T) zzd(zzhwVar, zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcn() {
        int i11 = this.zzsq;
        if (i11 != 0) {
            this.tag = i11;
            this.zzsq = 0;
        } else {
            this.tag = this.zzsp.zzdq();
        }
        int i12 = this.tag;
        if (i12 == 0 || i12 == this.zzru) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzco() {
        int i11;
        if (this.zzsp.zzcm() || (i11 = this.tag) == this.zzru) {
            return false;
        }
        return this.zzsp.zzal(i11);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcp() {
        zzab(0);
        return this.zzsp.zzcp();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcq() {
        zzab(0);
        return this.zzsp.zzcq();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcr() {
        zzab(0);
        return this.zzsp.zzcr();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcs() {
        zzab(1);
        return this.zzsp.zzcs();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzct() {
        zzab(5);
        return this.zzsp.zzct();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzcu() {
        zzab(0);
        return this.zzsp.zzcu();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String zzcv() {
        zzab(2);
        return this.zzsp.zzcv();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final zzeo zzcw() {
        zzab(2);
        return this.zzsp.zzcw();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcx() {
        zzab(0);
        return this.zzsp.zzcx();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcy() {
        zzab(0);
        return this.zzsp.zzcy();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcz() {
        zzab(5);
        return this.zzsp.zzcz();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzda() {
        zzab(1);
        return this.zzsp.zzda();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzdb() {
        zzab(0);
        return this.zzsp.zzdb();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzdc() {
        zzab(0);
        return this.zzsp.zzdc();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zze(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzcr());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfzVar.zzbg(this.zzsp.zzcr());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcr()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcr()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzf(List<Long> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = this.tag & 7;
            if (i11 == 1) {
                do {
                    zzgtVar.zzp(this.zzsp.zzcs());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzgtVar.zzp(this.zzsp.zzcs());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcs()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzac(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Long.valueOf(this.zzsp.zzcs()));
            } while (this.zzsp.zzds() < zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzg(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfzVar.zzbg(this.zzsp.zzct());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i11 == 5) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzct());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzad(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Integer.valueOf(this.zzsp.zzct()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i12 == 5) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzct()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzh(List<Boolean> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzem) {
            zzem zzemVar = (zzem) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzemVar.addBoolean(this.zzsp.zzcu());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzemVar.addBoolean(this.zzsp.zzcu());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzsp.zzcu()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Boolean.valueOf(this.zzsp.zzcu()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzi(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzj(List<zzeo> list) {
        int zzdq;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzcw());
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzk(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzcx());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfzVar.zzbg(this.zzsp.zzcx());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcx()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcx()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzl(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzcy());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfzVar.zzbg(this.zzsp.zzcy());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcy()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcy()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzm(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfzVar.zzbg(this.zzsp.zzcz());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i11 == 5) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzcz());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzad(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Integer.valueOf(this.zzsp.zzcz()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i12 == 5) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcz()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzn(List<Long> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = this.tag & 7;
            if (i11 == 1) {
                do {
                    zzgtVar.zzp(this.zzsp.zzda());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzgtVar.zzp(this.zzsp.zzda());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.zzsp.zzda()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzac(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Long.valueOf(this.zzsp.zzda()));
            } while (this.zzsp.zzds() < zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzo(List<Integer> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzfzVar.zzbg(this.zzsp.zzdb());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfzVar.zzbg(this.zzsp.zzdb());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzdb()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzdb()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzp(List<Long> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzgtVar.zzp(this.zzsp.zzdc());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgtVar.zzp(this.zzsp.zzdc());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzdc()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzdc()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    private final <T> T zzb(zzhw<T> zzhwVar, zzfk zzfkVar) {
        zzez zzezVar;
        int zzcx = this.zzsp.zzcx();
        zzez zzezVar2 = this.zzsp;
        if (zzezVar2.zzsf < zzezVar2.zzsg) {
            int zzan = zzezVar2.zzan(zzcx);
            T newInstance = zzhwVar.newInstance();
            this.zzsp.zzsf++;
            zzhwVar.zza(newInstance, this, zzfkVar);
            zzhwVar.zze(newInstance);
            this.zzsp.zzak(0);
            zzezVar.zzsf--;
            this.zzsp.zzao(zzan);
            return newInstance;
        }
        throw zzgf.zzfn();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(Class<T> cls, zzfk zzfkVar) {
        zzab(2);
        return (T) zzb(zzhs.zzgl().zzf(cls), zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzc(List<Long> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzgtVar.zzp(this.zzsp.zzcp());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgtVar.zzp(this.zzsp.zzcp());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcp()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzcp()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(zzhw<T> zzhwVar, zzfk zzfkVar) {
        zzab(2);
        return (T) zzb(zzhwVar, zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zza(List<Double> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfh) {
            zzfh zzfhVar = (zzfh) list;
            int i11 = this.tag & 7;
            if (i11 == 1) {
                do {
                    zzfhVar.zzc(this.zzsp.readDouble());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfhVar.zzc(this.zzsp.readDouble());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 1) {
            do {
                list.add(Double.valueOf(this.zzsp.readDouble()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzac(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Double.valueOf(this.zzsp.readDouble()));
            } while (this.zzsp.zzds() < zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzd(List<Long> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i11 = this.tag & 7;
            if (i11 == 0) {
                do {
                    zzgtVar.zzp(this.zzsp.zzcq());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else if (i11 == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgtVar.zzp(this.zzsp.zzcq());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcq()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else if (i12 == 2) {
            int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzcq()));
            } while (this.zzsp.zzds() < zzds2);
            zzae(zzds2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzb(List<Float> list) {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i11 = this.tag & 7;
            if (i11 == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfvVar.zzh(this.zzsp.readFloat());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i11 == 5) {
                do {
                    zzfvVar.zzh(this.zzsp.readFloat());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i12 = this.tag & 7;
        if (i12 == 2) {
            int zzcx2 = this.zzsp.zzcx();
            zzad(zzcx2);
            int zzds2 = this.zzsp.zzds() + zzcx2;
            do {
                list.add(Float.valueOf(this.zzsp.readFloat()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i12 == 5) {
            do {
                list.add(Float.valueOf(this.zzsp.readFloat()));
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else {
            throw zzgf.zzfm();
        }
    }

    private final void zza(List<String> list, boolean z11) {
        int zzdq;
        int zzdq2;
        if ((this.tag & 7) == 2) {
            if ((list instanceof zzgo) && !z11) {
                zzgo zzgoVar = (zzgo) list;
                do {
                    zzgoVar.zzc(zzcw());
                    if (this.zzsp.zzcm()) {
                        return;
                    }
                    zzdq2 = this.zzsp.zzdq();
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
                return;
            }
            do {
                list.add(z11 ? zzcv() : readString());
                if (this.zzsp.zzcm()) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zzb(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar) {
        int zzdq;
        int i11 = this.tag;
        if ((i11 & 7) == 3) {
            do {
                list.add(zzd(zzhwVar, zzfkVar));
                if (this.zzsp.zzcm() || this.zzsq != 0) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == i11);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zza(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar) {
        int zzdq;
        int i11 = this.tag;
        if ((i11 & 7) == 2) {
            do {
                list.add(zzb(zzhwVar, zzfkVar));
                if (this.zzsp.zzcm() || this.zzsq != 0) {
                    return;
                }
                zzdq = this.zzsp.zzdq();
            } while (zzdq == i11);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.vision.zzgy<K, V> r9, com.google.android.gms.internal.vision.zzfk r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzab(r0)
            com.google.android.gms.internal.vision.zzez r1 = r7.zzsp
            int r1 = r1.zzcx()
            com.google.android.gms.internal.vision.zzez r2 = r7.zzsp
            int r1 = r2.zzan(r1)
            K r2 = r9.zzyw
            V r3 = r9.zzgq
        L14:
            int r4 = r7.zzcn()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.vision.zzez r5 = r7.zzsp     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzcm()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzco()     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.vision.zzgf r4 = new com.google.android.gms.internal.vision.zzgf     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.vision.zzjd r4 = r9.zzyx     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzgq     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.vision.zzjd r4 = r9.zzyv     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.vision.zzgg -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzco()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.vision.zzgf r8 = new com.google.android.gms.internal.vision.zzgf     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.vision.zzez r8 = r7.zzsp
            r8.zzao(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.vision.zzez r9 = r7.zzsp
            r9.zzao(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfc.zza(java.util.Map, com.google.android.gms.internal.vision.zzgy, com.google.android.gms.internal.vision.zzfk):void");
    }

    private final Object zza(zzjd zzjdVar, Class<?> cls, zzfk zzfkVar) {
        switch (zzfd.zzrr[zzjdVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzcu());
            case 2:
                return zzcw();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzcy());
            case 5:
                return Integer.valueOf(zzct());
            case 6:
                return Long.valueOf(zzcs());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzcr());
            case 9:
                return Long.valueOf(zzcq());
            case 10:
                return zza(cls, zzfkVar);
            case 11:
                return Integer.valueOf(zzcz());
            case 12:
                return Long.valueOf(zzda());
            case 13:
                return Integer.valueOf(zzdb());
            case 14:
                return Long.valueOf(zzdc());
            case 15:
                return zzcv();
            case 16:
                return Integer.valueOf(zzcx());
            case 17:
                return Long.valueOf(zzcp());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}