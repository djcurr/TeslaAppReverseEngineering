package org.godotengine.godot.input;

import android.content.Context;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;

/* loaded from: classes5.dex */
public interface InputManagerCompat {

    /* loaded from: classes5.dex */
    public static class Factory {
        public static InputManagerCompat getInputManager(Context context) {
            return new InputManagerV16(context);
        }
    }

    /* loaded from: classes5.dex */
    public interface InputDeviceListener {
        void onInputDeviceAdded(int i11);

        void onInputDeviceChanged(int i11);

        void onInputDeviceRemoved(int i11);
    }

    InputDevice getInputDevice(int i11);

    int[] getInputDeviceIds();

    void onGenericMotionEvent(MotionEvent motionEvent);

    void onPause();

    void onResume();

    void registerInputDeviceListener(InputDeviceListener inputDeviceListener, Handler handler);

    void unregisterInputDeviceListener(InputDeviceListener inputDeviceListener);
}