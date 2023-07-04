package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<double[]> f12388a = new a();

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<double[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d11;
        boolean z11 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z11 = false;
            }
            d11 = Float.parseFloat(string);
        } else {
            d11 = readableMap.getDouble(str);
        }
        return z11 ? d11 : j.l(d11);
    }

    public static void b(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = f12388a.get();
        j.r(dArr);
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                dArr[i11] = readableArray.getDouble(i11);
            }
            return;
        }
        int size = readableArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            ReadableMap map = readableArray.getMap(i12);
            String nextKey = map.keySetIterator().nextKey();
            j.r(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i13 = 0; i13 < 16; i13++) {
                    dArr2[i13] = array.getDouble(i13);
                }
            } else if ("perspective".equals(nextKey)) {
                j.a(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                j.b(dArr2, a(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                j.c(dArr2, a(map, nextKey));
            } else if (!"rotate".equals(nextKey) && !"rotateZ".equals(nextKey)) {
                if ("scale".equals(nextKey)) {
                    double d11 = map.getDouble(nextKey);
                    j.e(dArr2, d11);
                    j.f(dArr2, d11);
                } else if ("scaleX".equals(nextKey)) {
                    j.e(dArr2, map.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    j.f(dArr2, map.getDouble(nextKey));
                } else if ("translate".equals(nextKey)) {
                    ReadableArray array2 = map.getArray(nextKey);
                    j.j(dArr2, array2.getDouble(0), array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                } else if ("translateX".equals(nextKey)) {
                    j.i(dArr2, map.getDouble(nextKey), 0.0d);
                } else if ("translateY".equals(nextKey)) {
                    j.i(dArr2, 0.0d, map.getDouble(nextKey));
                } else if ("skewX".equals(nextKey)) {
                    j.g(dArr2, a(map, nextKey));
                } else if ("skewY".equals(nextKey)) {
                    j.h(dArr2, a(map, nextKey));
                } else {
                    throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                }
            } else {
                j.d(dArr2, a(map, nextKey));
            }
            j.p(dArr, dArr, dArr2);
        }
    }
}