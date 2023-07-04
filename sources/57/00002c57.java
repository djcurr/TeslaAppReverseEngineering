package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public class zzgm {
    private static final zzfk zzrk = zzfk.zzek();
    private zzeo zzyh;
    private volatile zzhf zzyi;
    private volatile zzeo zzyj;

    private final zzhf zzh(zzhf zzhfVar) {
        if (this.zzyi == null) {
            synchronized (this) {
                if (this.zzyi == null) {
                    try {
                        this.zzyi = zzhfVar;
                        this.zzyj = zzeo.zzrx;
                    } catch (zzgf unused) {
                        this.zzyi = zzhfVar;
                        this.zzyj = zzeo.zzrx;
                    }
                }
            }
        }
        return this.zzyi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgm) {
            zzgm zzgmVar = (zzgm) obj;
            zzhf zzhfVar = this.zzyi;
            zzhf zzhfVar2 = zzgmVar.zzyi;
            if (zzhfVar == null && zzhfVar2 == null) {
                return zzce().equals(zzgmVar.zzce());
            }
            if (zzhfVar == null || zzhfVar2 == null) {
                if (zzhfVar != null) {
                    return zzhfVar.equals(zzgmVar.zzh(zzhfVar.zzfb()));
                }
                return zzh(zzhfVar2.zzfb()).equals(zzhfVar2);
            }
            return zzhfVar.equals(zzhfVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final zzeo zzce() {
        if (this.zzyj != null) {
            return this.zzyj;
        }
        synchronized (this) {
            if (this.zzyj != null) {
                return this.zzyj;
            }
            if (this.zzyi == null) {
                this.zzyj = zzeo.zzrx;
            } else {
                this.zzyj = this.zzyi.zzce();
            }
            return this.zzyj;
        }
    }

    public final int zzeq() {
        if (this.zzyj != null) {
            return this.zzyj.size();
        }
        if (this.zzyi != null) {
            return this.zzyi.zzeq();
        }
        return 0;
    }

    public final zzhf zzi(zzhf zzhfVar) {
        zzhf zzhfVar2 = this.zzyi;
        this.zzyh = null;
        this.zzyj = null;
        this.zzyi = zzhfVar;
        return zzhfVar2;
    }
}