package androidx.camera.core;

/* loaded from: classes.dex */
public interface CameraControl {

    /* loaded from: classes.dex */
    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }

    com.google.common.util.concurrent.c<Void> d(boolean z11);

    com.google.common.util.concurrent.c<z.s> i(z.r rVar);
}