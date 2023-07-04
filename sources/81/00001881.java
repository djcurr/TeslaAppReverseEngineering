package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class e implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<MemoryPressureListener> f11841a = Collections.synchronizedSet(new LinkedHashSet());

    public e(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void c(int i11) {
        Set<MemoryPressureListener> set = this.f11841a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i11);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        this.f11841a.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f11841a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        c(i11);
    }
}