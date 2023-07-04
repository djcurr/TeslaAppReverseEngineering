package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class NativeObjectReference extends PhantomReference<h> {

    /* renamed from: f  reason: collision with root package name */
    private static b f31826f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final long f31827a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31828b;

    /* renamed from: c  reason: collision with root package name */
    private final g f31829c;

    /* renamed from: d  reason: collision with root package name */
    private NativeObjectReference f31830d;

    /* renamed from: e  reason: collision with root package name */
    private NativeObjectReference f31831e;

    /* loaded from: classes5.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        NativeObjectReference f31832a;

        private b() {
        }

        synchronized void a(NativeObjectReference nativeObjectReference) {
            nativeObjectReference.f31830d = null;
            nativeObjectReference.f31831e = this.f31832a;
            NativeObjectReference nativeObjectReference2 = this.f31832a;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f31830d = nativeObjectReference;
            }
            this.f31832a = nativeObjectReference;
        }

        synchronized void b(NativeObjectReference nativeObjectReference) {
            NativeObjectReference nativeObjectReference2 = nativeObjectReference.f31831e;
            NativeObjectReference nativeObjectReference3 = nativeObjectReference.f31830d;
            nativeObjectReference.f31831e = null;
            nativeObjectReference.f31830d = null;
            if (nativeObjectReference3 != null) {
                nativeObjectReference3.f31831e = nativeObjectReference2;
            } else {
                this.f31832a = nativeObjectReference2;
            }
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f31830d = nativeObjectReference3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeObjectReference(g gVar, h hVar, ReferenceQueue<? super h> referenceQueue) {
        super(hVar, referenceQueue);
        this.f31827a = hVar.getNativePtr();
        this.f31828b = hVar.getNativeFinalizerPtr();
        this.f31829c = gVar;
        f31826f.a(this);
    }

    private static native void nativeCleanUp(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f31829c) {
            nativeCleanUp(this.f31828b, this.f31827a);
        }
        f31826f.b(this);
    }
}