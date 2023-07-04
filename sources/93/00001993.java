package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f12290a = new SparseIntArray();

    public void a(long j11) {
        this.f12290a.put((int) j11, 0);
    }

    public short b(long j11) {
        int i11 = this.f12290a.get((int) j11, -1);
        if (i11 != -1) {
            return (short) (i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j11) {
        return this.f12290a.get((int) j11, -1) != -1;
    }

    public void d(long j11) {
        int i11 = (int) j11;
        int i12 = this.f12290a.get(i11, -1);
        if (i12 != -1) {
            this.f12290a.put(i11, i12 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    public void e(long j11) {
        this.f12290a.delete((int) j11);
    }
}