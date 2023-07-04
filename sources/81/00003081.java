package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzy;

/* loaded from: classes3.dex */
final class zzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect zza(Text text) {
        Point[] cornerPoints;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (Point point : text.getCornerPoints()) {
            i14 = Math.min(i14, point.x);
            i11 = Math.max(i11, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i14, i12, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Point[] zza(zzy zzyVar) {
        double sin = Math.sin(Math.toRadians(zzyVar.zzfb));
        double cos = Math.cos(Math.toRadians(zzyVar.zzfb));
        int i11 = zzyVar.width;
        int i12 = zzyVar.height;
        Point[] pointArr = {new Point(zzyVar.left, zzyVar.top), new Point((int) (zzyVar.left + (i11 * cos)), (int) (zzyVar.top + (i11 * sin))), new Point((int) (pointArr[1].x - (i12 * sin)), (int) (pointArr[1].y + (i12 * cos))), new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y))};
        return pointArr;
    }
}