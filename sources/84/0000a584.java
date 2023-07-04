package org.webrtc;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes4.dex */
public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.program);
            Logging.e(TAG, "Could not link program: " + glGetProgramInfoLog);
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        int glGetError = GLES20.glGetError();
        throw new RuntimeException("glCreateProgram() failed. GLES20 error: " + glGetError);
    }

    private static int compileShader(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            Logging.e(TAG, "Compile error " + glGetShaderInfoLog + " in shader:\n" + str);
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int glGetError = GLES20.glGetError();
        throw new RuntimeException("glCreateShader() failed. GLES20 error: " + glGetError);
    }

    public int getAttribLocation(String str) {
        int i11 = this.program;
        if (i11 != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i11, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            throw new RuntimeException("Could not locate '" + str + "' in program");
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i11 = this.program;
        if (i11 != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i11, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException("Could not locate uniform '" + str + "' in program");
        }
        throw new RuntimeException("The program has been released");
    }

    public void release() {
        Logging.d(TAG, "Deleting shader.");
        int i11 = this.program;
        if (i11 != -1) {
            GLES20.glDeleteProgram(i11);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i11, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i11, 0, floatBuffer);
    }

    public void useProgram() {
        if (this.program != -1) {
            synchronized (EglBase.lock) {
                GLES20.glUseProgram(this.program);
            }
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public void setVertexAttribArray(String str, int i11, int i12, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i11, 5126, false, i12, (Buffer) floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}