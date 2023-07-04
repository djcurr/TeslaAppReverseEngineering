package org.godotengine.godot.xr.regular;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.godotengine.godot.utils.GLUtils;

/* loaded from: classes5.dex */
public class RegularConfigChooser implements GLSurfaceView.EGLConfigChooser {
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue = new int[1];
    private static final String TAG = RegularConfigChooser.class.getSimpleName();
    private static int EGL_OPENGL_ES2_BIT = 4;
    private static int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    private static int[] s_configAttribs3 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    public RegularConfigChooser(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.mRedSize = i11;
        this.mGreenSize = i12;
        this.mBlueSize = i13;
        this.mAlphaSize = i14;
        this.mDepthSize = i15;
        this.mStencilSize = i16;
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, this.mValue) ? this.mValue[0] : i12;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, GLUtils.use_gl3 ? s_configAttribs3 : s_configAttribs2, null, 0, iArr);
        int i11 = iArr[0];
        if (i11 > 0) {
            EGLConfig[] eGLConfigArr = new EGLConfig[i11];
            egl10.eglChooseConfig(eGLDisplay, GLUtils.use_gl3 ? s_configAttribs3 : s_configAttribs2, eGLConfigArr, i11, iArr);
            return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        }
        throw new IllegalArgumentException("No configs match configSpec");
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}