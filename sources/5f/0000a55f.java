package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

/* loaded from: classes4.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = configBuilder().createConfigAttributes();
    public static final int[] CONFIG_RGBA = configBuilder().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = configBuilder().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = configBuilder().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = configBuilder().setIsRecordable(true).createConfigAttributes();

    /* loaded from: classes4.dex */
    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i11 = this.openGlesVersion;
            if (i11 == 2 || i11 == 3) {
                arrayList.add(12352);
                arrayList.add(Integer.valueOf(this.openGlesVersion == 3 ? 64 : 4));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.isRecordable) {
                arrayList.add(Integer.valueOf((int) EglBase.EGL_RECORDABLE_ANDROID));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z11) {
            this.hasAlphaChannel = z11;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z11) {
            this.isRecordable = z11;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i11) {
            if (i11 >= 1 && i11 <= 3) {
                this.openGlesVersion = i11;
                return this;
            }
            throw new IllegalArgumentException("OpenGL ES version " + i11 + " not supported");
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z11) {
            this.supportsPixelBuffer = z11;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    static ConfigBuilder configBuilder() {
        return new ConfigBuilder();
    }

    static EglBase create(Context context, int[] iArr) {
        if (context == null) {
            return createEgl14(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return createEgl14((EglBase14.Context) context, iArr);
        }
        if (context instanceof EglBase10.Context) {
            return createEgl10((EglBase10.Context) context, iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    static EglBase10 createEgl10(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    static EglBase14 createEgl14(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    static int getOpenGlesVersionFromConfig(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length - 1; i11++) {
            if (iArr[i11] == 12352) {
                int i12 = iArr[i11 + 1];
                if (i12 != 4) {
                    return i12 != 64 ? 1 : 3;
                }
                return 2;
            }
        }
        return 1;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i11, int i12);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j11);

    static EglBase10 createEgl10(EglBase10.Context context, int[] iArr) {
        return new EglBase10Impl(context == null ? null : context.getRawContext(), iArr);
    }

    static EglBase14 createEgl14(EglBase14.Context context, int[] iArr) {
        return new EglBase14Impl(context == null ? null : context.getRawContext(), iArr);
    }

    static EglBase10 createEgl10(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    static EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    static EglBase create() {
        return create(null, CONFIG_PLAIN);
    }

    static EglBase create(Context context) {
        return create(context, CONFIG_PLAIN);
    }
}