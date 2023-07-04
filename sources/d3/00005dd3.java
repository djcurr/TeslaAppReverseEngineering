package com.swmansion.reanimated.layoutReanimation;

import java.util.HashMap;

/* loaded from: classes6.dex */
public interface NativeMethodsHolder {
    boolean isLayoutAnimationEnabled();

    void removeConfigForTag(int i11);

    void startAnimationForTag(int i11, String str, HashMap<String, Float> hashMap);
}