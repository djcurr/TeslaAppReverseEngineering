package org.godotengine.godot.xr.ovr;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes5.dex */
public class OvrConfigChooser implements GLSurfaceView.EGLConfigChooser {
    private static final int[] CONFIG_ATTRIBS = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12337, 0, 12344};

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr;
        int[] iArr2 = new int[1];
        if (egl10.eglGetConfigs(eGLDisplay, null, 0, iArr2)) {
            int i11 = iArr2[0];
            if (i11 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                if (egl10.eglGetConfigs(eGLDisplay, eGLConfigArr, i11, iArr2)) {
                    int[] iArr3 = new int[1];
                    for (int i12 = 0; i12 < i11; i12++) {
                        EGLConfig eGLConfig = eGLConfigArr[i12];
                        egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12352, iArr3);
                        if ((iArr3[0] & 64) == 64) {
                            egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12339, iArr3);
                            if ((iArr3[0] & 5) != 5) {
                                continue;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    iArr = CONFIG_ATTRIBS;
                                    if (iArr[i13] == 12344) {
                                        break;
                                    }
                                    egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, iArr[i13], iArr3);
                                    if (iArr3[0] != iArr[i13 + 1]) {
                                        break;
                                    }
                                    i13 += 2;
                                }
                                if (iArr[i13] == 12344) {
                                    return eGLConfig;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalArgumentException("eglGetConfigs #2 failed.");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
        throw new IllegalArgumentException("eglGetConfigs failed.");
    }
}