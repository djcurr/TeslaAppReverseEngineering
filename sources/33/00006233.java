package com.th3rdwave.safeareacontext;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(ViewGroup viewGroup, View view) {
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static a b(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            return new a(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return new a(rect.top, view.getWidth() - rect.right, view.getHeight() - rect.bottom, rect.left);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(View view) {
        View rootView;
        a b11;
        if (view.getHeight() == 0 || (b11 = b((rootView = view.getRootView()))) == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        b11.f22263a = Math.max(b11.f22263a - rect.top, (float) BitmapDescriptorFactory.HUE_RED);
        b11.f22266d = Math.max(b11.f22266d - rect.left, (float) BitmapDescriptorFactory.HUE_RED);
        b11.f22265c = Math.max(Math.min((rect.top + view.getHeight()) - rootView.getHeight(), (float) BitmapDescriptorFactory.HUE_RED) + b11.f22265c, (float) BitmapDescriptorFactory.HUE_RED);
        b11.f22264b = Math.max(Math.min((rect.left + view.getWidth()) - rootView.getWidth(), (float) BitmapDescriptorFactory.HUE_RED) + b11.f22264b, (float) BitmapDescriptorFactory.HUE_RED);
        return b11;
    }
}