package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.zzdu;

/* loaded from: classes3.dex */
final class zza implements Runnable {
    private final /* synthetic */ int zzbr;
    private final /* synthetic */ zzdu zzbs;
    private final /* synthetic */ DynamiteClearcutLogger zzbt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(DynamiteClearcutLogger dynamiteClearcutLogger, int i11, zzdu zzduVar) {
        this.zzbt = dynamiteClearcutLogger;
        this.zzbr = i11;
        this.zzbs = zzduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        visionClearcutLogger = this.zzbt.zzbq;
        visionClearcutLogger.zzb(this.zzbr, this.zzbs);
    }
}