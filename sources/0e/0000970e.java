package org.godotengine.godot.xr.regular;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.godotengine.godot.utils.GLUtils;

/* loaded from: classes5.dex */
public class RegularFallbackConfigChooser extends RegularConfigChooser {
    private static final String TAG = RegularFallbackConfigChooser.class.getSimpleName();
    private RegularConfigChooser fallback;

    public RegularFallbackConfigChooser(int i11, int i12, int i13, int i14, int i15, int i16, RegularConfigChooser regularConfigChooser) {
        super(i11, i12, i13, i14, i15, i16);
        this.fallback = regularConfigChooser;
    }

    @Override // org.godotengine.godot.xr.regular.RegularConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        EGLConfig chooseConfig = super.chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        if (chooseConfig == null) {
            Log.w(TAG, "Trying ConfigChooser fallback");
            EGLConfig chooseConfig2 = this.fallback.chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            GLUtils.use_32 = false;
            return chooseConfig2;
        }
        return chooseConfig;
    }
}