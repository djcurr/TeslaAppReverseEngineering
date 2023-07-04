package com.google.android.exoplayer2.util;

import ak.k0;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class PriorityTaskManager {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14710a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f14711b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f14712c = Integer.MIN_VALUE;

    /* loaded from: classes3.dex */
    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i11) {
        synchronized (this.f14710a) {
            this.f14711b.add(Integer.valueOf(i11));
            this.f14712c = Math.max(this.f14712c, i11);
        }
    }

    public void b(int i11) {
        synchronized (this.f14710a) {
            this.f14711b.remove(Integer.valueOf(i11));
            this.f14712c = this.f14711b.isEmpty() ? Integer.MIN_VALUE : ((Integer) k0.j(this.f14711b.peek())).intValue();
            this.f14710a.notifyAll();
        }
    }
}