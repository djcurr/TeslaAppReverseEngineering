package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ReferenceQueue f17224a = new ReferenceQueue();

    /* renamed from: b  reason: collision with root package name */
    private final Set f17225b = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.google.mlkit.common.sdkinternal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0312a {
        @KeepForSdk
        void a();
    }

    private a() {
    }

    @KeepForSdk
    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.q
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f17224a;
        final Set set = aVar.f17225b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @KeepForSdk
    public InterfaceC0312a b(Object obj, Runnable runnable) {
        s sVar = new s(obj, this.f17224a, this.f17225b, runnable, null);
        this.f17225b.add(sVar);
        return sVar;
    }
}