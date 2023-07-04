package com.airbnb.android.react.maps;

import com.facebook.react.uimanager.y0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;

/* loaded from: classes.dex */
public class u extends com.facebook.react.uimanager.i {
    @Override // com.facebook.react.uimanager.d0
    public void y0(y0 y0Var) {
        super.y0(y0Var);
        HashMap hashMap = new HashMap();
        hashMap.put(Snapshot.WIDTH, Float.valueOf(b0()));
        hashMap.put(Snapshot.HEIGHT, Float.valueOf(g()));
        y0Var.Q(L(), hashMap);
    }
}