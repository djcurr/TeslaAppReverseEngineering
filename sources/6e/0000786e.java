package io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final ReferenceQueue<h> f31931a;

    /* renamed from: b  reason: collision with root package name */
    private static final Thread f31932b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f31933c;

    static {
        ReferenceQueue<h> referenceQueue = new ReferenceQueue<>();
        f31931a = referenceQueue;
        Thread thread = new Thread(new e(referenceQueue));
        f31932b = thread;
        f31933c = new g();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(h hVar) {
        new NativeObjectReference(this, hVar, f31931a);
    }
}