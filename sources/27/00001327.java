package com.adyen.checkout.core.api;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f9590a = a();

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f9591b = Executors.newCachedThreadPool();

    private static Handler a() {
        try {
            return new Handler(Looper.getMainLooper());
        } catch (RuntimeException unused) {
            return new Handler();
        }
    }
}