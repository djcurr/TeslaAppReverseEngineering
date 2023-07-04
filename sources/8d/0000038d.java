package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import androidx.camera.core.f1;
import java.util.Collection;

/* loaded from: classes.dex */
public interface s extends z.b, f1.d {

    /* loaded from: classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        a(boolean z11) {
            this.mHoldsCameraSlot = z11;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // z.b
    default CameraControl a() {
        return e();
    }

    @Override // z.b
    default z.d b() {
        return i();
    }

    CameraControlInternal e();

    void f(Collection<androidx.camera.core.f1> collection);

    void h(Collection<androidx.camera.core.f1> collection);

    r i();

    z0<a> j();

    com.google.common.util.concurrent.c<Void> release();
}