package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private FrameMetricsAggregator f32053a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32054b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<io.sentry.protocol.o, Map<String, io.sentry.protocol.g>> f32055c = new ConcurrentHashMap();

    public c(i0 i0Var, io.sentry.d0 d0Var) {
        this.f32053a = null;
        this.f32054b = true;
        boolean a11 = i0Var.a("androidx.core.app.FrameMetricsAggregator", d0Var);
        this.f32054b = a11;
        if (a11) {
            this.f32053a = new FrameMetricsAggregator();
        }
    }

    private boolean b() {
        return this.f32054b && this.f32053a != null;
    }

    public synchronized void a(Activity activity) {
        if (b()) {
            this.f32053a.a(activity);
        }
    }

    public synchronized void c(Activity activity, io.sentry.protocol.o oVar) {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (b()) {
            SparseIntArray[] sparseIntArrayArr = null;
            try {
                sparseIntArrayArr = this.f32053a.c(activity);
            } catch (Throwable unused) {
            }
            int i13 = 0;
            if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
                i11 = 0;
                i12 = 0;
            } else {
                int i14 = 0;
                i11 = 0;
                i12 = 0;
                while (i13 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    i14 += valueAt;
                    if (keyAt > 700) {
                        i12 += valueAt;
                    } else if (keyAt > 16) {
                        i11 += valueAt;
                    }
                    i13++;
                }
                i13 = i14;
            }
            if (i13 == 0 && i11 == 0 && i12 == 0) {
                return;
            }
            io.sentry.protocol.g gVar = new io.sentry.protocol.g(i13);
            io.sentry.protocol.g gVar2 = new io.sentry.protocol.g(i11);
            io.sentry.protocol.g gVar3 = new io.sentry.protocol.g(i12);
            HashMap hashMap = new HashMap();
            hashMap.put("frames_total", gVar);
            hashMap.put("frames_slow", gVar2);
            hashMap.put("frames_frozen", gVar3);
            this.f32055c.put(oVar, hashMap);
        }
    }

    public synchronized void d() {
        if (b()) {
            this.f32053a.e();
        }
        this.f32055c.clear();
    }

    public synchronized Map<String, io.sentry.protocol.g> e(io.sentry.protocol.o oVar) {
        if (b()) {
            Map<String, io.sentry.protocol.g> map = this.f32055c.get(oVar);
            this.f32055c.remove(oVar);
            return map;
        }
        return null;
    }
}