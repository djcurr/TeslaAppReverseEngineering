package io;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public interface a {
    @KeepForSdk
    String a();

    @KeepForSdk
    int b();

    @KeepForSdk
    Rect getBoundingBox();

    @KeepForSdk
    Point[] getCornerPoints();

    @KeepForSdk
    int getFormat();
}