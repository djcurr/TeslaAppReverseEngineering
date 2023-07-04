package lo;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
/* loaded from: classes2.dex */
public class b {
    @KeepForSdk
    public static int a(int i11) {
        if (i11 != 0) {
            if (i11 != 90) {
                if (i11 != 180) {
                    if (i11 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Invalid rotation: " + i11);
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @KeepForSdk
    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            int i12 = i11 + i11;
            fArr[i12] = pointArr[i11].x;
            fArr[i12 + 1] = pointArr[i11].y;
        }
        matrix.mapPoints(fArr);
        for (int i13 = 0; i13 < pointArr.length; i13++) {
            int i14 = i13 + i13;
            pointArr[i13].set((int) fArr[i14], (int) fArr[i14 + 1]);
        }
    }

    @KeepForSdk
    public static void c(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    @KeepForSdk
    public static void d(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = i11 + i11;
            fArr[i12] = list.get(i11).x;
            fArr[i12 + 1] = list.get(i11).y;
        }
        matrix.mapPoints(fArr);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int i14 = i13 + i13;
            list.get(i13).set(fArr[i14], fArr[i14 + 1]);
        }
    }

    @KeepForSdk
    public static void e(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}