package o30;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f42223k = {-1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private FloatBuffer f42224a;

    /* renamed from: d  reason: collision with root package name */
    private int f42227d;

    /* renamed from: f  reason: collision with root package name */
    private int f42229f;

    /* renamed from: g  reason: collision with root package name */
    private int f42230g;

    /* renamed from: h  reason: collision with root package name */
    private int f42231h;

    /* renamed from: i  reason: collision with root package name */
    private int f42232i;

    /* renamed from: j  reason: collision with root package name */
    private int f42233j;

    /* renamed from: b  reason: collision with root package name */
    private float[] f42225b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private float[] f42226c = new float[16];

    /* renamed from: e  reason: collision with root package name */
    private int f42228e = -12345;

    public f(int i11) {
        this.f42233j = 0;
        this.f42233j = i11;
        float[] fArr = f42223k;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f42224a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f42226c, 0);
    }

    private int b(String str, String str2) {
        int e11;
        int e12 = e(35633, str);
        if (e12 == 0 || (e11 = e(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, e12);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, e11);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    private int e(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        a("glCreateShader type=" + i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    public void c(SurfaceTexture surfaceTexture, boolean z11) {
        a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f42226c);
        if (z11) {
            float[] fArr = this.f42226c;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.f42227d);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f42228e);
        this.f42224a.position(0);
        GLES20.glVertexAttribPointer(this.f42231h, 3, 5126, false, 20, (Buffer) this.f42224a);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f42231h);
        a("glEnableVertexAttribArray maPositionHandle");
        this.f42224a.position(3);
        GLES20.glVertexAttribPointer(this.f42232i, 2, 5126, false, 20, (Buffer) this.f42224a);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f42232i);
        a("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(this.f42230g, 1, false, this.f42226c, 0);
        GLES20.glUniformMatrix4fv(this.f42229f, 1, false, this.f42225b, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    public int d() {
        return this.f42228e;
    }

    public void f() {
        int b11 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f42227d = b11;
        if (b11 != 0) {
            this.f42231h = GLES20.glGetAttribLocation(b11, "aPosition");
            a("glGetAttribLocation aPosition");
            if (this.f42231h != -1) {
                this.f42232i = GLES20.glGetAttribLocation(this.f42227d, "aTextureCoord");
                a("glGetAttribLocation aTextureCoord");
                if (this.f42232i != -1) {
                    this.f42229f = GLES20.glGetUniformLocation(this.f42227d, "uMVPMatrix");
                    a("glGetUniformLocation uMVPMatrix");
                    if (this.f42229f != -1) {
                        this.f42230g = GLES20.glGetUniformLocation(this.f42227d, "uSTMatrix");
                        a("glGetUniformLocation uSTMatrix");
                        if (this.f42230g != -1) {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            int i11 = iArr[0];
                            this.f42228e = i11;
                            GLES20.glBindTexture(36197, i11);
                            a("glBindTexture mTextureID");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            a("glTexParameter");
                            Matrix.setIdentityM(this.f42225b, 0);
                            int i12 = this.f42233j;
                            if (i12 != 0) {
                                Matrix.rotateM(this.f42225b, 0, i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        throw new RuntimeException("failed creating program");
    }
}