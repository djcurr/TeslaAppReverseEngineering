package com.facebook.react.bridge;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public interface ReadableArray {
    ReadableArray getArray(int i11);

    boolean getBoolean(int i11);

    double getDouble(int i11);

    Dynamic getDynamic(int i11);

    int getInt(int i11);

    ReadableMap getMap(int i11);

    String getString(int i11);

    ReadableType getType(int i11);

    boolean isNull(int i11);

    int size();

    ArrayList<Object> toArrayList();
}