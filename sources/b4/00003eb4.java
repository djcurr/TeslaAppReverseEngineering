package com.ijzerenhein.sharedelement;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a */
    View f17749a;

    /* renamed from: b */
    RectF f17750b;

    public static RectF a(View view) {
        if (view instanceof com.facebook.drawee.view.d) {
            com.facebook.drawee.view.d dVar = (com.facebook.drawee.view.d) view;
            me.a controller = dVar.getController();
            ke.a hierarchy = dVar.getHierarchy();
            if (controller == null || controller.toString().contains("fetchedImage=0,")) {
                return null;
            }
            RectF rectF = new RectF();
            hierarchy.l(rectF);
            return rectF;
        } else if (view instanceof ImageView) {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                return null;
            }
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, intrinsicWidth, intrinsicHeight);
        } else {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        }
    }
}