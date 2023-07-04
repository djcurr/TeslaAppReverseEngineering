package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;

/* loaded from: classes.dex */
public abstract class c extends com.facebook.react.views.view.g {
    public c(Context context) {
        super(context);
    }

    public abstract void c(GoogleMap googleMap);

    public abstract Object getFeature();
}