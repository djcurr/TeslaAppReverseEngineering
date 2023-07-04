package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class MultiProcessor<T> implements Detector.Processor<T> {
    private int zzal;
    private Factory<T> zzaz;
    private SparseArray<zza> zzba;

    /* loaded from: classes3.dex */
    public static class Builder<T> {
        private MultiProcessor<T> zzbb;

        public Builder(Factory<T> factory) {
            MultiProcessor<T> multiProcessor = new MultiProcessor<>();
            this.zzbb = multiProcessor;
            if (factory != null) {
                ((MultiProcessor) multiProcessor).zzaz = factory;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        public MultiProcessor<T> build() {
            return this.zzbb;
        }

        public Builder<T> setMaxGapFrames(int i11) {
            if (i11 >= 0) {
                ((MultiProcessor) this.zzbb).zzal = i11;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Invalid max gap: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* loaded from: classes3.dex */
    public interface Factory<T> {
        Tracker<T> create(T t11);
    }

    /* loaded from: classes3.dex */
    class zza {
        private Tracker<T> zzak;
        private int zzao;

        private zza(MultiProcessor multiProcessor) {
            this.zzao = 0;
        }

        static /* synthetic */ int zzb(zza zzaVar) {
            int i11 = zzaVar.zzao;
            zzaVar.zzao = i11 + 1;
            return i11;
        }

        static /* synthetic */ int zza(zza zzaVar, int i11) {
            zzaVar.zzao = 0;
            return 0;
        }
    }

    private MultiProcessor() {
        this.zzba = new SparseArray<>();
        this.zzal = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i11 = 0; i11 < detectedItems.size(); i11++) {
            int keyAt = detectedItems.keyAt(i11);
            T valueAt = detectedItems.valueAt(i11);
            if (this.zzba.get(keyAt) == null) {
                zza zzaVar = new zza();
                zzaVar.zzak = this.zzaz.create(valueAt);
                zzaVar.zzak.onNewItem(keyAt, valueAt);
                this.zzba.append(keyAt, zzaVar);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet<Integer> hashSet = new HashSet();
        for (int i12 = 0; i12 < this.zzba.size(); i12++) {
            int keyAt2 = this.zzba.keyAt(i12);
            if (detectedItems2.get(keyAt2) == null) {
                zza valueAt2 = this.zzba.valueAt(i12);
                zza.zzb(valueAt2);
                if (valueAt2.zzao >= this.zzal) {
                    valueAt2.zzak.onDone();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    valueAt2.zzak.onMissing(detections);
                }
            }
        }
        for (Integer num : hashSet) {
            this.zzba.delete(num.intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i13 = 0; i13 < detectedItems3.size(); i13++) {
            int keyAt3 = detectedItems3.keyAt(i13);
            T valueAt3 = detectedItems3.valueAt(i13);
            zza zzaVar2 = this.zzba.get(keyAt3);
            zza.zza(zzaVar2, 0);
            zzaVar2.zzak.onUpdate(detections, valueAt3);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i11 = 0; i11 < this.zzba.size(); i11++) {
            this.zzba.valueAt(i11).zzak.onDone();
        }
        this.zzba.clear();
    }
}