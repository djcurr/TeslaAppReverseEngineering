package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(List list) {
        Iterator it2 = list.iterator();
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (it2.hasNext()) {
            Point point = (Point) it2.next();
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
        }
        return new Rect(i12, i13, i11, i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        int i11 = zzfVar.zza;
        double d11 = zzfVar.zzc;
        Point point = new Point((int) (i11 + (d11 * cos)), (int) (zzfVar.zzb + (d11 * sin)));
        int i12 = zzfVar.zzd;
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (point.x - (i12 * sin)), (int) (pointArr[1].y + (i12 * cos))), new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y))};
        return Arrays.asList(pointArr);
    }
}