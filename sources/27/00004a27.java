package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.util.List;

/* loaded from: classes2.dex */
public final class y {
    public static final ReadableArray a(List<String> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        WritableArray createArray = Arguments.createArray();
        kotlin.jvm.internal.s.f(createArray, "createArray()");
        for (String str : list) {
            createArray.pushString(str);
        }
        return createArray;
    }
}