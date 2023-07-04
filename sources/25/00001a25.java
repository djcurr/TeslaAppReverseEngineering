package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Point f12550a = new Point();

    /* renamed from: b  reason: collision with root package name */
    private static final Point f12551b = new Point();

    /* renamed from: c  reason: collision with root package name */
    private static final Point f12552c = new Point();

    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) wf.a.c((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        Point point = f12550a;
        Point point2 = f12551b;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = f12552c;
        defaultDisplay.getSize(point3);
        int i11 = 0;
        boolean z11 = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z11 && identifier > 0) {
            i11 = (int) resources.getDimension(identifier);
        }
        if (point3.x < point3.y) {
            return new Point(point.x, point2.y + i11);
        }
        return new Point(point2.x, point.y + i11);
    }
}