package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class v extends com.facebook.react.views.view.g {
    public v(Context context) {
        super(context);
        setWillNotDraw(true);
        setVisibility(0);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setRemoveClippedSubviews(false);
        if (Build.VERSION.SDK_INT >= 18) {
            setClipBounds(new Rect(0, 0, 0, 0));
        }
        setOverflow("hidden");
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}