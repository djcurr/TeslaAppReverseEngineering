package com.google.android.gms.internal.mlkit_common;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzp {
    final long zza;
    final long zzb;
    final boolean zzc;

    private zzp(long j11, long j12, boolean z11) {
        this.zza = j11;
        this.zzb = j12;
        this.zzc = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzp zza(final FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Os.fstat(fileDescriptor);
                }
            });
            return new zzp(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
        }
        return zzn.zza(fileDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzp zzb(final String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Os.lstat(str);
                }
            });
            return new zzp(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
        }
        return zzn.zzd(str);
    }

    private static Object zzc(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}