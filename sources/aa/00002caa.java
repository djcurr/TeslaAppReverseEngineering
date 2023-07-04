package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzjk {
    private final byte[] buffer;
    private final int zzacz;
    private final int zzada;
    private int zzadb;
    private int zzadc;
    private zzez zzadd;
    private int zzsf;
    private int zzsl;
    private int zzsn;
    private int zzso = Integer.MAX_VALUE;
    private int zzsg = 64;
    private int zzsh = 67108864;

    private zzjk(byte[] bArr, int i11, int i12) {
        this.buffer = bArr;
        this.zzacz = i11;
        int i13 = i12 + i11;
        this.zzadb = i13;
        this.zzada = i13;
        this.zzadc = i11;
    }

    private final void zzap(int i11) {
        if (i11 >= 0) {
            int i12 = this.zzadc;
            int i13 = i12 + i11;
            int i14 = this.zzso;
            if (i13 <= i14) {
                if (i11 <= this.zzadb - i12) {
                    this.zzadc = i12 + i11;
                    return;
                }
                throw zzjs.zzht();
            }
            zzap(i14 - i12);
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    private final void zzdx() {
        int i11 = this.zzadb + this.zzsl;
        this.zzadb = i11;
        int i12 = this.zzso;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzsl = i13;
            this.zzadb = i11 - i13;
            return;
        }
        this.zzsl = 0;
    }

    private final byte zzdy() {
        int i11 = this.zzadc;
        if (i11 != this.zzadb) {
            byte[] bArr = this.buffer;
            this.zzadc = i11 + 1;
            return bArr[i11];
        }
        throw zzjs.zzht();
    }

    public static zzjk zzk(byte[] bArr, int i11, int i12) {
        return new zzjk(bArr, 0, i12);
    }

    public final int getPosition() {
        return this.zzadc - this.zzacz;
    }

    public final String readString() {
        int zzdt = zzdt();
        if (zzdt >= 0) {
            int i11 = this.zzadb;
            int i12 = this.zzadc;
            if (zzdt <= i11 - i12) {
                String str = new String(this.buffer, i12, zzdt, zzjr.UTF_8);
                this.zzadc += zzdt;
                return str;
            }
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    public final void zza(zzjt zzjtVar) {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            int zzan = zzan(zzdt);
            this.zzsf++;
            zzjtVar.zza(this);
            zzak(0);
            this.zzsf--;
            zzao(zzan);
            return;
        }
        throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void zzak(int i11) {
        if (this.zzsn != i11) {
            throw new zzjs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzal(int i11) {
        int zzdq;
        int i12 = i11 & 7;
        if (i12 == 0) {
            zzdt();
            return true;
        } else if (i12 == 1) {
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            return true;
        } else if (i12 == 2) {
            zzap(zzdt());
            return true;
        } else if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 5) {
                    zzdv();
                    return true;
                }
                throw new zzjs("Protocol message tag had invalid wire type.");
            }
            return false;
        } else {
            do {
                zzdq = zzdq();
                if (zzdq == 0) {
                    break;
                }
            } while (zzal(zzdq));
            zzak(((i11 >>> 3) << 3) | 4);
            return true;
        }
    }

    public final int zzan(int i11) {
        if (i11 >= 0) {
            int i12 = i11 + this.zzadc;
            int i13 = this.zzso;
            if (i12 <= i13) {
                this.zzso = i12;
                zzdx();
                return i13;
            }
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    public final void zzao(int i11) {
        this.zzso = i11;
        zzdx();
    }

    public final void zzbt(int i11) {
        zzw(i11, this.zzsn);
    }

    public final boolean zzcu() {
        return zzdt() != 0;
    }

    public final int zzdq() {
        if (this.zzadc == this.zzadb) {
            this.zzsn = 0;
            return 0;
        }
        int zzdt = zzdt();
        this.zzsn = zzdt;
        if (zzdt != 0) {
            return zzdt;
        }
        throw new zzjs("Protocol message contained an invalid tag (zero).");
    }

    public final int zzdt() {
        int i11;
        byte zzdy = zzdy();
        if (zzdy >= 0) {
            return zzdy;
        }
        int i12 = zzdy & Byte.MAX_VALUE;
        byte zzdy2 = zzdy();
        if (zzdy2 >= 0) {
            i11 = zzdy2 << 7;
        } else {
            i12 |= (zzdy2 & Byte.MAX_VALUE) << 7;
            byte zzdy3 = zzdy();
            if (zzdy3 >= 0) {
                i11 = zzdy3 << 14;
            } else {
                i12 |= (zzdy3 & Byte.MAX_VALUE) << 14;
                byte zzdy4 = zzdy();
                if (zzdy4 < 0) {
                    int i13 = i12 | ((zzdy4 & Byte.MAX_VALUE) << 21);
                    byte zzdy5 = zzdy();
                    int i14 = i13 | (zzdy5 << 28);
                    if (zzdy5 < 0) {
                        for (int i15 = 0; i15 < 5; i15++) {
                            if (zzdy() >= 0) {
                                return i14;
                            }
                        }
                        throw zzjs.zzhv();
                    }
                    return i14;
                }
                i11 = zzdy4 << 21;
            }
        }
        return i12 | i11;
    }

    public final long zzdu() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte zzdy = zzdy();
            j11 |= (zzdy & Byte.MAX_VALUE) << i11;
            if ((zzdy & 128) == 0) {
                return j11;
            }
        }
        throw zzjs.zzhv();
    }

    public final int zzdv() {
        return (zzdy() & 255) | ((zzdy() & 255) << 8) | ((zzdy() & 255) << 16) | ((zzdy() & 255) << 24);
    }

    public final int zzhq() {
        int i11 = this.zzso;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - this.zzadc;
    }

    public final byte[] zzv(int i11, int i12) {
        if (i12 == 0) {
            return zzjw.zzaea;
        }
        byte[] bArr = new byte[i12];
        System.arraycopy(this.buffer, this.zzacz + i11, bArr, 0, i12);
        return bArr;
    }

    public final void zzw(int i11, int i12) {
        int i13 = this.zzadc;
        int i14 = this.zzacz;
        if (i11 > i13 - i14) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Position ");
            sb2.append(i11);
            sb2.append(" is beyond current ");
            sb2.append(this.zzadc - this.zzacz);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 >= 0) {
            this.zzadc = i14 + i11;
            this.zzsn = i12;
        } else {
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("Bad position ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final <T extends zzfy<T, ?>> T zza(zzhq<T> zzhqVar) {
        try {
            if (this.zzadd == null) {
                this.zzadd = zzez.zze(this.buffer, this.zzacz, this.zzada);
            }
            int zzds = this.zzadd.zzds();
            int i11 = this.zzadc - this.zzacz;
            if (zzds <= i11) {
                this.zzadd.zzap(i11 - zzds);
                this.zzadd.zzam(this.zzsg - this.zzsf);
                T t11 = (T) this.zzadd.zza(zzhqVar, zzfk.zzel());
                zzal(this.zzsn);
                return t11;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(zzds), Integer.valueOf(i11)));
        } catch (zzgf e11) {
            throw new zzjs("", e11);
        }
    }
}