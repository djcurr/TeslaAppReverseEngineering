package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f2675a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(Rect rect) {
        return b(new RectF(rect));
    }

    private static Matrix b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2675a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i11) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f2675a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i11);
        matrix.postConcat(b(rectF2));
        return matrix;
    }

    public static boolean d(int i11) {
        if (i11 == 90 || i11 == 270) {
            return true;
        }
        if (i11 == 0 || i11 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i11);
    }

    public static boolean e(Size size, boolean z11, Size size2, boolean z12) {
        float width;
        float width2;
        float width3;
        float f11;
        if (z11) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z12) {
            width3 = size2.getWidth() / size2.getHeight();
            f11 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f11 = width4;
        }
        return width >= width3 && f11 >= width2;
    }

    public static int f(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return 270;
                    }
                    throw new IllegalStateException("Unexpected rotation value " + i11);
                }
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            }
            return 90;
        }
        return 0;
    }
}