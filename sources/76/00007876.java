package io.realm.internal;

import android.content.Context;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.File;

/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31946a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f31947b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f31948c;

    static {
        String str = File.separator;
        f31946a = str;
        String str2 = File.pathSeparator;
        f31947b = str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lib");
        sb2.append(str2);
        sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
        sb2.append(str);
        sb2.append("lib");
        f31948c = false;
    }

    public static synchronized void a(Context context) {
        synchronized (l.class) {
            if (f31948c) {
                return;
            }
            eh.b.a(context, "realm-jni", "10.7.0");
            f31948c = true;
        }
    }
}