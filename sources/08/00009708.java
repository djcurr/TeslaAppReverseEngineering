package org.godotengine.godot.xr;

/* loaded from: classes5.dex */
public enum XRMode {
    REGULAR(0, "Regular", "--xr_mode_regular", "Default Android Gamepad"),
    OVR(1, "Oculus Mobile VR", "--xr_mode_ovr", "");
    
    public final String cmdLineArg;
    final int index;
    public final String inputFallbackMapping;
    final String label;

    XRMode(int i11, String str, String str2, String str3) {
        this.index = i11;
        this.label = str;
        this.cmdLineArg = str2;
        this.inputFallbackMapping = str3;
    }
}