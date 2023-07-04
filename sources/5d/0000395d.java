package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<y0> f16887d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f16888a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f16889b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f16890c;

    private y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f16890c = executor;
        this.f16888a = sharedPreferences;
    }

    public static synchronized y0 a(Context context, Executor executor) {
        y0 y0Var;
        synchronized (y0.class) {
            WeakReference<y0> weakReference = f16887d;
            y0Var = weakReference != null ? weakReference.get() : null;
            if (y0Var == null) {
                y0Var = new y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                y0Var.c();
                f16887d = new WeakReference<>(y0Var);
            }
        }
        return y0Var;
    }

    private synchronized void c() {
        this.f16889b = u0.c(this.f16888a, "topic_operation_queue", ",", this.f16890c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized x0 b() {
        return x0.a(this.f16889b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(x0 x0Var) {
        return this.f16889b.f(x0Var.e());
    }
}