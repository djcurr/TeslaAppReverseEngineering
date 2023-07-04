package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Frame;

/* loaded from: classes3.dex */
public abstract class Detector<T> {
    private final Object zzad = new Object();
    private Processor<T> zzae;

    /* loaded from: classes3.dex */
    public static class Detections<T> {
        private final SparseArray<T> zzaf;
        private final Frame.Metadata zzag;
        private final boolean zzah;

        public Detections(SparseArray<T> sparseArray, Frame.Metadata metadata, boolean z11) {
            this.zzaf = sparseArray;
            this.zzag = metadata;
            this.zzah = z11;
        }

        public boolean detectorIsOperational() {
            return this.zzah;
        }

        public SparseArray<T> getDetectedItems() {
            return this.zzaf;
        }

        public Frame.Metadata getFrameMetadata() {
            return this.zzag;
        }
    }

    /* loaded from: classes3.dex */
    public interface Processor<T> {
        void receiveDetections(Detections<T> detections);

        void release();
    }

    public abstract SparseArray<T> detect(Frame frame);

    public boolean isOperational() {
        return true;
    }

    public void receiveFrame(Frame frame) {
        Frame.Metadata metadata = new Frame.Metadata(frame.getMetadata());
        metadata.zzd();
        Detections<T> detections = new Detections<>(detect(frame), metadata, isOperational());
        synchronized (this.zzad) {
            Processor<T> processor = this.zzae;
            if (processor != null) {
                processor.receiveDetections(detections);
            } else {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
        }
    }

    public void release() {
        synchronized (this.zzad) {
            Processor<T> processor = this.zzae;
            if (processor != null) {
                processor.release();
                this.zzae = null;
            }
        }
    }

    public boolean setFocus(int i11) {
        return true;
    }

    public void setProcessor(Processor<T> processor) {
        synchronized (this.zzad) {
            Processor<T> processor2 = this.zzae;
            if (processor2 != null) {
                processor2.release();
            }
            this.zzae = processor;
        }
    }
}