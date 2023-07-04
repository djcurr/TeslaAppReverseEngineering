package io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f31570a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f31571b = Charset.forName("UTF-8");

    public static <T> List<T> a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    private static <T> List<T> b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            int length = tArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    T t12 = tArr2[i11];
                    if (t11.equals(t12)) {
                        arrayList.add(t12);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b11 = b(tArr, tArr2);
        return (T[]) b11.toArray((Object[]) Array.newInstance((Class<?>) cls, b11.size()));
    }
}