package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzael extends zzadt {
    private static final Logger zzb = Logger.getLogger(zzael.class.getName());
    private static final boolean zzc = zzahs.zzx();
    zzaem zza;

    private zzael() {
    }

    public /* synthetic */ zzael(zzaek zzaekVar) {
    }

    public static int zzA(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzB(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            j11 >>>= 28;
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    public static zzael zzC(byte[] bArr) {
        return new zzaei(bArr, 0, bArr.length);
    }

    public static int zzt(zzaed zzaedVar) {
        int zzd = zzaedVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i11, zzagg zzaggVar, zzagr zzagrVar) {
        int zzA = zzA(i11 << 3);
        return zzA + zzA + ((zzadq) zzaggVar).zzr(zzagrVar);
    }

    public static int zzv(int i11) {
        if (i11 >= 0) {
            return zzA(i11);
        }
        return 10;
    }

    public static int zzw(zzafm zzafmVar) {
        int zza = zzafmVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzagg zzaggVar, zzagr zzagrVar) {
        int zzr = ((zzadq) zzaggVar).zzr(zzagrVar);
        return zzA(zzr) + zzr;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzahw.zzc(str);
        } catch (zzahv unused) {
            length = str.getBytes(zzafh.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i11) {
        return zzA(i11 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzahv zzahvVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzahvVar);
        byte[] bytes = str.getBytes(zzafh.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzaej(e11);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b11);

    public abstract void zzd(int i11, boolean z11);

    public abstract void zze(int i11, zzaed zzaedVar);

    public abstract void zzf(int i11, int i12);

    public abstract void zzg(int i11);

    public abstract void zzh(int i11, long j11);

    public abstract void zzi(long j11);

    public abstract void zzj(int i11, int i12);

    public abstract void zzk(int i11);

    public abstract void zzl(byte[] bArr, int i11, int i12);

    public abstract void zzm(int i11, String str);

    public abstract void zzo(int i11, int i12);

    public abstract void zzp(int i11, int i12);

    public abstract void zzq(int i11);

    public abstract void zzr(int i11, long j11);

    public abstract void zzs(long j11);
}