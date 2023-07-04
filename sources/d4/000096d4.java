package org.godotengine.godot;

import android.app.Activity;

/* loaded from: classes5.dex */
public class GodotLib {

    /* renamed from: io  reason: collision with root package name */
    public static GodotIO f43238io;

    static {
        System.loadLibrary("godot_android");
    }

    public static native void accelerometer(float f11, float f12, float f13);

    public static native void audio();

    public static native void back();

    public static native void calldeferred(long j11, String str, Object[] objArr);

    public static native void callobject(long j11, String str, Object[] objArr);

    public static native void doubletap(int i11, int i12);

    public static native void focusin();

    public static native void focusout();

    public static native String getGlobal(String str);

    public static native void gravity(float f11, float f12, float f13);

    public static native void gyroscope(float f11, float f12, float f13);

    public static native void hover(int i11, int i12, int i13);

    public static native void initialize(Activity activity, Godot godot, Object obj, boolean z11);

    public static native void joyaxis(int i11, int i12, float f11);

    public static native void joybutton(int i11, int i12, boolean z11);

    public static native void joyconnectionchanged(int i11, boolean z11, String str);

    public static native void joyhat(int i11, int i12, int i13);

    public static native void key(int i11, int i12, boolean z11);

    public static native void magnetometer(float f11, float f12, float f13);

    public static native void newcontext(boolean z11);

    public static native void onRendererPaused();

    public static native void onRendererResumed();

    public static native void ondestroy();

    public static native void requestPermissionResult(String str, boolean z11);

    public static native void resize(int i11, int i12);

    public static native void scroll(int i11, int i12);

    public static native void setVirtualKeyboardHeight(int i11);

    public static native void setup(String[] strArr);

    public static native void step();

    public static native void touch(int i11, int i12, int i13, int[] iArr);
}