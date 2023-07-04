package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector;

/* loaded from: classes3.dex */
public abstract class FocusingProcessor<T> implements Detector.Processor<T> {
    private Tracker<T> zzak;
    private int zzan;
    private Detector<T> zzr;
    private int zzal = 3;
    private boolean zzam = false;
    private int zzao = 0;

    public FocusingProcessor(Detector<T> detector, Tracker<T> tracker) {
        this.zzr = detector;
        this.zzak = tracker;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.zzao == this.zzal) {
                this.zzak.onDone();
                this.zzam = false;
            } else {
                this.zzak.onMissing(detections);
            }
            this.zzao++;
            return;
        }
        this.zzao = 0;
        if (this.zzam) {
            T t11 = detectedItems.get(this.zzan);
            if (t11 != null) {
                this.zzak.onUpdate(detections, t11);
                return;
            } else {
                this.zzak.onDone();
                this.zzam = false;
            }
        }
        int selectFocus = selectFocus(detections);
        T t12 = detectedItems.get(selectFocus);
        if (t12 == null) {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Invalid focus selected: ");
            sb2.append(selectFocus);
            Log.w("FocusingProcessor", sb2.toString());
            return;
        }
        this.zzam = true;
        this.zzan = selectFocus;
        this.zzr.setFocus(selectFocus);
        this.zzak.onNewItem(this.zzan, t12);
        this.zzak.onUpdate(detections, t12);
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        this.zzak.onDone();
    }

    public abstract int selectFocus(Detector.Detections<T> detections);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i11) {
        if (i11 >= 0) {
            this.zzal = i11;
            return;
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("Invalid max gap: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}