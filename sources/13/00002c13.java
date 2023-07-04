package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzel extends zzej {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private int tag;
    private final boolean zzrs;
    private final int zzrt;
    private int zzru;

    public zzel(ByteBuffer byteBuffer, boolean z11) {
        super(null);
        this.zzrs = true;
        this.buffer = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.pos = arrayOffset;
        this.zzrt = arrayOffset;
        this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte readByte() {
        int i11 = this.pos;
        if (i11 != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i11 + 1;
            return bArr[i11];
        }
        throw zzgf.zzfh();
    }

    private final void zzaa(int i11) {
        if (i11 < 0 || i11 > this.limit - this.pos) {
            throw zzgf.zzfh();
        }
    }

    private final void zzab(int i11) {
        if ((this.tag & 7) != i11) {
            throw zzgf.zzfm();
        }
    }

    private final void zzac(int i11) {
        zzaa(i11);
        if ((i11 & 7) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzad(int i11) {
        zzaa(i11);
        if ((i11 & 3) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzae(int i11) {
        if (this.pos != i11) {
            throw zzgf.zzfh();
        }
    }

    private final <T> T zzb(zzhw<T> zzhwVar, zzfk zzfkVar) {
        int zzdd = zzdd();
        zzaa(zzdd);
        int i11 = this.limit;
        int i12 = this.pos + zzdd;
        this.limit = i12;
        try {
            T newInstance = zzhwVar.newInstance();
            zzhwVar.zza(newInstance, this, zzfkVar);
            zzhwVar.zze(newInstance);
            if (this.pos == i12) {
                return newInstance;
            }
            throw zzgf.zzfo();
        } finally {
            this.limit = i11;
        }
    }

    private final boolean zzcm() {
        return this.pos == this.limit;
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

    private final int zzdd() {
        int i11;
        int i12 = this.pos;
        int i13 = this.limit;
        if (i13 != i12) {
            byte[] bArr = this.buffer;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.pos = i14;
                return b11;
            } else if (i13 - i14 < 9) {
                return (int) zzdf();
            } else {
                int i15 = i14 + 1;
                int i16 = b11 ^ (bArr[i14] << 7);
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i15 + 1;
                    int i18 = i16 ^ (bArr[i15] << 14);
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        i15 = i17 + 1;
                        int i19 = i18 ^ (bArr[i17] << 21);
                        if (i19 < 0) {
                            i11 = i19 ^ (-2080896);
                        } else {
                            i17 = i15 + 1;
                            byte b12 = bArr[i15];
                            i11 = (i19 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i15 = i17 + 1;
                                if (bArr[i17] < 0) {
                                    i17 = i15 + 1;
                                    if (bArr[i15] < 0) {
                                        i15 = i17 + 1;
                                        if (bArr[i17] < 0) {
                                            i17 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                i15 = i17 + 1;
                                                if (bArr[i17] < 0) {
                                                    throw zzgf.zzfj();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i15 = i17;
                }
                this.pos = i15;
                return i11;
            }
        }
        throw zzgf.zzfh();
    }

    private final long zzde() {
        long j11;
        long j12;
        long j13;
        int i11;
        int i12 = this.pos;
        int i13 = this.limit;
        if (i13 != i12) {
            byte[] bArr = this.buffer;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.pos = i14;
                return b11;
            } else if (i13 - i14 < 9) {
                return zzdf();
            } else {
                int i15 = i14 + 1;
                int i16 = b11 ^ (bArr[i14] << 7);
                if (i16 >= 0) {
                    int i17 = i15 + 1;
                    int i18 = i16 ^ (bArr[i15] << 14);
                    if (i18 >= 0) {
                        i15 = i17;
                        j11 = i18 ^ 16256;
                    } else {
                        i15 = i17 + 1;
                        int i19 = i18 ^ (bArr[i17] << 21);
                        if (i19 < 0) {
                            i11 = i19 ^ (-2080896);
                        } else {
                            long j14 = i19;
                            int i21 = i15 + 1;
                            long j15 = j14 ^ (bArr[i15] << 28);
                            if (j15 >= 0) {
                                j13 = 266354560;
                            } else {
                                i15 = i21 + 1;
                                long j16 = j15 ^ (bArr[i21] << 35);
                                if (j16 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i21 = i15 + 1;
                                    j15 = j16 ^ (bArr[i15] << 42);
                                    if (j15 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i15 = i21 + 1;
                                        j16 = j15 ^ (bArr[i21] << 49);
                                        if (j16 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            int i22 = i15 + 1;
                                            long j17 = (j16 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i15 = i22 + 1;
                                                if (bArr[i22] < 0) {
                                                    throw zzgf.zzfj();
                                                }
                                            } else {
                                                i15 = i22;
                                            }
                                            j11 = j17;
                                        }
                                    }
                                }
                                j11 = j16 ^ j12;
                            }
                            j11 = j15 ^ j13;
                            i15 = i21;
                        }
                    }
                    this.pos = i15;
                    return j11;
                }
                i11 = i16 ^ (-128);
                j11 = i11;
                this.pos = i15;
                return j11;
            }
        }
        throw zzgf.zzfh();
    }

    private final long zzdf() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte readByte = readByte();
            j11 |= (readByte & Byte.MAX_VALUE) << i11;
            if ((readByte & 128) == 0) {
                return j11;
            }
        }
        throw zzgf.zzfj();
    }

    private final int zzdg() {
        zzaa(4);
        return zzdi();
    }

    private final long zzdh() {
        zzaa(8);
        return zzdj();
    }

    private final int zzdi() {
        int i11 = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private final long zzdj() {
        int i11 = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    private final String zzg(boolean z11) {
        zzab(2);
        int zzdd = zzdd();
        if (zzdd == 0) {
            return "";
        }
        zzaa(zzdd);
        if (z11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            if (!zziw.zzg(bArr, i11, i11 + zzdd)) {
                throw zzgf.zzfp();
            }
        }
        String str = new String(this.buffer, this.pos, zzdd, zzga.UTF_8);
        this.pos += zzdd;
        return str;
    }

    private final void zzz(int i11) {
        zzaa(i11);
        this.pos += i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final double readDouble() {
        zzab(1);
        return Double.longBitsToDouble(zzdh());
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final float readFloat() {
        zzab(5);
        return Float.intBitsToFloat(zzdg());
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String readString() {
        return zzg(false);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void readStringList(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(Class<T> cls, zzfk zzfkVar) {
        zzab(2);
        return (T) zzb(zzhs.zzgl().zzf(cls), zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzc(zzhw<T> zzhwVar, zzfk zzfkVar) {
        zzab(3);
        return (T) zzd(zzhwVar, zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcn() {
        if (zzcm()) {
            return Integer.MAX_VALUE;
        }
        int zzdd = zzdd();
        this.tag = zzdd;
        if (zzdd == this.zzru) {
            return Integer.MAX_VALUE;
        }
        return zzdd >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzco() {
        int i11;
        int i12;
        if (zzcm() || (i11 = this.tag) == (i12 = this.zzru)) {
            return false;
        }
        int i13 = i11 & 7;
        if (i13 == 0) {
            int i14 = this.limit;
            int i15 = this.pos;
            if (i14 - i15 >= 10) {
                byte[] bArr = this.buffer;
                int i16 = 0;
                while (i16 < 10) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        this.pos = i17;
                        break;
                    }
                    i16++;
                    i15 = i17;
                }
            }
            for (int i18 = 0; i18 < 10; i18++) {
                if (readByte() >= 0) {
                    return true;
                }
            }
            throw zzgf.zzfj();
        } else if (i13 == 1) {
            zzz(8);
            return true;
        } else if (i13 == 2) {
            zzz(zzdd());
            return true;
        } else if (i13 != 3) {
            if (i13 == 5) {
                zzz(4);
                return true;
            }
            throw zzgf.zzfm();
        } else {
            this.zzru = ((i11 >>> 3) << 3) | 4;
            while (zzcn() != Integer.MAX_VALUE && zzco()) {
            }
            if (this.tag == this.zzru) {
                this.zzru = i12;
                return true;
            }
            throw zzgf.zzfo();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcp() {
        zzab(0);
        return zzde();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcq() {
        zzab(0);
        return zzde();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcr() {
        zzab(0);
        return zzdd();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcs() {
        zzab(1);
        return zzdh();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzct() {
        zzab(5);
        return zzdg();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzcu() {
        zzab(0);
        return zzdd() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String zzcv() {
        return zzg(true);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final zzeo zzcw() {
        zzeo zzb;
        zzab(2);
        int zzdd = zzdd();
        if (zzdd == 0) {
            return zzeo.zzrx;
        }
        zzaa(zzdd);
        if (this.zzrs) {
            zzb = zzeo.zzc(this.buffer, this.pos, zzdd);
        } else {
            zzb = zzeo.zzb(this.buffer, this.pos, zzdd);
        }
        this.pos += zzdd;
        return zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcx() {
        zzab(0);
        return zzdd();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcy() {
        zzab(0);
        return zzdd();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcz() {
        zzab(5);
        return zzdg();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzda() {
        zzab(1);
        return zzdh();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzdb() {
        zzab(0);
        return zzez.zzaq(zzdd());
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzdc() {
        zzab(0);
        return zzez.zzd(zzde());
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zze(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 == 0) {
                do {
                    zzfzVar.zzbg(zzcr());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzfzVar.zzbg(zzdd());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i14 = this.tag & 7;
        if (i14 == 0) {
            do {
                list.add(Integer.valueOf(zzcr()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i14 == 2) {
            int zzdd2 = this.pos + zzdd();
            while (this.pos < zzdd2) {
                list.add(Integer.valueOf(zzdd()));
            }
            zzae(zzdd2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzf(List<Long> list) {
        int i11;
        int i12;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i13 = this.tag & 7;
            if (i13 == 1) {
                do {
                    zzgtVar.zzp(zzcs());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = zzdd();
                zzac(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzgtVar.zzp(zzdj());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(zzcs()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i15 == 2) {
            int zzdd2 = zzdd();
            zzac(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Long.valueOf(zzdj()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzh(List<Boolean> list) {
        int i11;
        int i12;
        if (list instanceof zzem) {
            zzem zzemVar = (zzem) list;
            int i13 = this.tag & 7;
            if (i13 != 0) {
                if (i13 == 2) {
                    int zzdd = this.pos + zzdd();
                    while (this.pos < zzdd) {
                        zzemVar.addBoolean(zzdd() != 0);
                    }
                    zzae(zzdd);
                    return;
                }
                throw zzgf.zzfm();
            }
            do {
                zzemVar.addBoolean(zzcu());
                if (zzcm()) {
                    return;
                }
                i12 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i12;
            return;
        }
        int i14 = this.tag & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int zzdd2 = this.pos + zzdd();
                while (this.pos < zzdd2) {
                    list.add(Boolean.valueOf(zzdd() != 0));
                }
                zzae(zzdd2);
                return;
            }
            throw zzgf.zzfm();
        }
        do {
            list.add(Boolean.valueOf(zzcu()));
            if (zzcm()) {
                return;
            }
            i11 = this.pos;
        } while (zzdd() == this.tag);
        this.pos = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzi(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzj(List<zzeo> list) {
        int i11;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzcw());
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
            return;
        }
        throw zzgf.zzfm();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzk(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 != 0) {
                if (i13 == 2) {
                    int zzdd = this.pos + zzdd();
                    while (this.pos < zzdd) {
                        zzfzVar.zzbg(zzdd());
                    }
                    return;
                }
                throw zzgf.zzfm();
            }
            do {
                zzfzVar.zzbg(zzcx());
                if (zzcm()) {
                    return;
                }
                i12 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i12;
            return;
        }
        int i14 = this.tag & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int zzdd2 = this.pos + zzdd();
                while (this.pos < zzdd2) {
                    list.add(Integer.valueOf(zzdd()));
                }
                return;
            }
            throw zzgf.zzfm();
        }
        do {
            list.add(Integer.valueOf(zzcx()));
            if (zzcm()) {
                return;
            }
            i11 = this.pos;
        } while (zzdd() == this.tag);
        this.pos = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzl(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 != 0) {
                if (i13 == 2) {
                    int zzdd = this.pos + zzdd();
                    while (this.pos < zzdd) {
                        zzfzVar.zzbg(zzdd());
                    }
                    return;
                }
                throw zzgf.zzfm();
            }
            do {
                zzfzVar.zzbg(zzcy());
                if (zzcm()) {
                    return;
                }
                i12 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i12;
            return;
        }
        int i14 = this.tag & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int zzdd2 = this.pos + zzdd();
                while (this.pos < zzdd2) {
                    list.add(Integer.valueOf(zzdd()));
                }
                return;
            }
            throw zzgf.zzfm();
        }
        do {
            list.add(Integer.valueOf(zzcy()));
            if (zzcm()) {
                return;
            }
            i11 = this.pos;
        } while (zzdd() == this.tag);
        this.pos = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzm(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 == 2) {
                int zzdd = zzdd();
                zzad(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzfzVar.zzbg(zzdi());
                }
                return;
            } else if (i13 == 5) {
                do {
                    zzfzVar.zzbg(zzcz());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 2) {
            int zzdd2 = zzdd();
            zzad(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Integer.valueOf(zzdi()));
            }
        } else if (i15 == 5) {
            do {
                list.add(Integer.valueOf(zzcz()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzn(List<Long> list) {
        int i11;
        int i12;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i13 = this.tag & 7;
            if (i13 == 1) {
                do {
                    zzgtVar.zzp(zzda());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = zzdd();
                zzac(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzgtVar.zzp(zzdj());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(zzda()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i15 == 2) {
            int zzdd2 = zzdd();
            zzac(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Long.valueOf(zzdj()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzo(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 != 0) {
                if (i13 == 2) {
                    int zzdd = this.pos + zzdd();
                    while (this.pos < zzdd) {
                        zzfzVar.zzbg(zzez.zzaq(zzdd()));
                    }
                    return;
                }
                throw zzgf.zzfm();
            }
            do {
                zzfzVar.zzbg(zzdb());
                if (zzcm()) {
                    return;
                }
                i12 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i12;
            return;
        }
        int i14 = this.tag & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int zzdd2 = this.pos + zzdd();
                while (this.pos < zzdd2) {
                    list.add(Integer.valueOf(zzez.zzaq(zzdd())));
                }
                return;
            }
            throw zzgf.zzfm();
        }
        do {
            list.add(Integer.valueOf(zzdb()));
            if (zzcm()) {
                return;
            }
            i11 = this.pos;
        } while (zzdd() == this.tag);
        this.pos = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzp(List<Long> list) {
        int i11;
        int i12;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i13 = this.tag & 7;
            if (i13 != 0) {
                if (i13 == 2) {
                    int zzdd = this.pos + zzdd();
                    while (this.pos < zzdd) {
                        zzgtVar.zzp(zzez.zzd(zzde()));
                    }
                    return;
                }
                throw zzgf.zzfm();
            }
            do {
                zzgtVar.zzp(zzdc());
                if (zzcm()) {
                    return;
                }
                i12 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i12;
            return;
        }
        int i14 = this.tag & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int zzdd2 = this.pos + zzdd();
                while (this.pos < zzdd2) {
                    list.add(Long.valueOf(zzez.zzd(zzde())));
                }
                return;
            }
            throw zzgf.zzfm();
        }
        do {
            list.add(Long.valueOf(zzdc()));
            if (zzcm()) {
                return;
            }
            i11 = this.pos;
        } while (zzdd() == this.tag);
        this.pos = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(zzhw<T> zzhwVar, zzfk zzfkVar) {
        zzab(2);
        return (T) zzb(zzhwVar, zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzc(List<Long> list) {
        int i11;
        int i12;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i13 = this.tag & 7;
            if (i13 == 0) {
                do {
                    zzgtVar.zzp(zzcp());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzgtVar.zzp(zzde());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i14 = this.tag & 7;
        if (i14 == 0) {
            do {
                list.add(Long.valueOf(zzcp()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i14 == 2) {
            int zzdd2 = this.pos + zzdd();
            while (this.pos < zzdd2) {
                list.add(Long.valueOf(zzde()));
            }
            zzae(zzdd2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zza(List<Double> list) {
        int i11;
        int i12;
        if (list instanceof zzfh) {
            zzfh zzfhVar = (zzfh) list;
            int i13 = this.tag & 7;
            if (i13 == 1) {
                do {
                    zzfhVar.zzc(readDouble());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = zzdd();
                zzac(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzfhVar.zzc(Double.longBitsToDouble(zzdj()));
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 1) {
            do {
                list.add(Double.valueOf(readDouble()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i15 == 2) {
            int zzdd2 = zzdd();
            zzac(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzdj())));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzg(List<Integer> list) {
        int i11;
        int i12;
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            int i13 = this.tag & 7;
            if (i13 == 2) {
                int zzdd = zzdd();
                zzad(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzfzVar.zzbg(zzdi());
                }
                return;
            } else if (i13 == 5) {
                do {
                    zzfzVar.zzbg(zzct());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 2) {
            int zzdd2 = zzdd();
            zzad(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Integer.valueOf(zzdi()));
            }
        } else if (i15 == 5) {
            do {
                list.add(Integer.valueOf(zzct()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzd(List<Long> list) {
        int i11;
        int i12;
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            int i13 = this.tag & 7;
            if (i13 == 0) {
                do {
                    zzgtVar.zzp(zzcq());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else if (i13 == 2) {
                int zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzgtVar.zzp(zzde());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i14 = this.tag & 7;
        if (i14 == 0) {
            do {
                list.add(Long.valueOf(zzcq()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else if (i14 == 2) {
            int zzdd2 = this.pos + zzdd();
            while (this.pos < zzdd2) {
                list.add(Long.valueOf(zzde()));
            }
            zzae(zzdd2);
        } else {
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzb(Class<T> cls, zzfk zzfkVar) {
        zzab(3);
        return (T) zzd(zzhs.zzgl().zzf(cls), zzfkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzb(List<Float> list) {
        int i11;
        int i12;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i13 = this.tag & 7;
            if (i13 == 2) {
                int zzdd = zzdd();
                zzad(zzdd);
                int i14 = this.pos + zzdd;
                while (this.pos < i14) {
                    zzfvVar.zzh(Float.intBitsToFloat(zzdi()));
                }
                return;
            } else if (i13 == 5) {
                do {
                    zzfvVar.zzh(readFloat());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i15 = this.tag & 7;
        if (i15 == 2) {
            int zzdd2 = zzdd();
            zzad(zzdd2);
            int i16 = this.pos + zzdd2;
            while (this.pos < i16) {
                list.add(Float.valueOf(Float.intBitsToFloat(zzdi())));
            }
        } else if (i15 == 5) {
            do {
                list.add(Float.valueOf(readFloat()));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
        } else {
            throw zzgf.zzfm();
        }
    }

    private final void zza(List<String> list, boolean z11) {
        int i11;
        int i12;
        if ((this.tag & 7) == 2) {
            if ((list instanceof zzgo) && !z11) {
                zzgo zzgoVar = (zzgo) list;
                do {
                    zzgoVar.zzc(zzcw());
                    if (zzcm()) {
                        return;
                    }
                    i12 = this.pos;
                } while (zzdd() == this.tag);
                this.pos = i12;
                return;
            }
            do {
                list.add(zzg(z11));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == this.tag);
            this.pos = i11;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zzb(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar) {
        int i11;
        int i12 = this.tag;
        if ((i12 & 7) == 3) {
            do {
                list.add(zzd(zzhwVar, zzfkVar));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == i12);
            this.pos = i11;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zza(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar) {
        int i11;
        int i12 = this.tag;
        if ((i12 & 7) == 2) {
            do {
                list.add(zzb(zzhwVar, zzfkVar));
                if (zzcm()) {
                    return;
                }
                i11 = this.pos;
            } while (zzdd() == i12);
            this.pos = i11;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <K, V> void zza(Map<K, V> map, zzgy<K, V> zzgyVar, zzfk zzfkVar) {
        zzab(2);
        int zzdd = zzdd();
        zzaa(zzdd);
        int i11 = this.limit;
        this.limit = this.pos + zzdd;
        try {
            Object obj = zzgyVar.zzyw;
            Object obj2 = zzgyVar.zzgq;
            while (true) {
                int zzcn = zzcn();
                if (zzcn == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    return;
                } else if (zzcn == 1) {
                    obj = zza(zzgyVar.zzyv, (Class<?>) null, (zzfk) null);
                } else if (zzcn != 2) {
                    try {
                        if (!zzco()) {
                            throw new zzgf("Unable to parse map entry.");
                            break;
                        }
                    } catch (zzgg unused) {
                        if (!zzco()) {
                            throw new zzgf("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = zza(zzgyVar.zzyx, zzgyVar.zzgq.getClass(), zzfkVar);
                }
            }
        } finally {
            this.limit = i11;
        }
    }

    private final Object zza(zzjd zzjdVar, Class<?> cls, zzfk zzfkVar) {
        switch (zzek.zzrr[zzjdVar.ordinal()]) {
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
                return zzg(true);
            case 16:
                return Integer.valueOf(zzcx());
            case 17:
                return Long.valueOf(zzcp());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}