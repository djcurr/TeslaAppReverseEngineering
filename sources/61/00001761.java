package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.jni.annotations.DoNotStrip;
import yg.a;

@DoNotStrip
/* loaded from: classes3.dex */
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    /* loaded from: classes3.dex */
    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        private volatile long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j11);

        @Override // com.facebook.jni.DestructorThread.Destructor
        protected final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        a.d("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}