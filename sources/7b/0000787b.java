package io.realm.internal.objectstore;

import io.realm.internal.g;
import io.realm.internal.h;

/* loaded from: classes5.dex */
public class OsKeyPathMapping implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final long f31951b = nativeGetFinalizerMethodPtr();

    /* renamed from: a  reason: collision with root package name */
    public long f31952a;

    public OsKeyPathMapping(long j11) {
        this.f31952a = -1L;
        this.f31952a = nativeCreateMapping(j11);
        g.f31933c.a(this);
    }

    private static native long nativeCreateMapping(long j11);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31951b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31952a;
    }
}