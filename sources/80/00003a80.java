package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.f;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* loaded from: classes2.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, u {

    /* renamed from: e */
    private static final GmsLogger f17327e = new GmsLogger("MobileVisionBase", "");

    /* renamed from: f */
    public static final /* synthetic */ int f17328f = 0;

    /* renamed from: a */
    private final AtomicBoolean f17329a = new AtomicBoolean(false);

    /* renamed from: b */
    private final f f17330b;

    /* renamed from: c */
    private final CancellationTokenSource f17331c;

    /* renamed from: d */
    private final Executor f17332d;

    @KeepForSdk
    public MobileVisionBase(f<DetectionResultT, ko.a> fVar, Executor executor) {
        this.f17330b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f17331c = cancellationTokenSource;
        this.f17332d = executor;
        fVar.c();
        fVar.a(executor, new Callable() { // from class: lo.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i11 = MobileVisionBase.f17328f;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.l(exc);
            }
        });
    }

    public static /* synthetic */ void l(Exception exc) {
        f17327e.e("MobileVisionBase", "Error preloading model resource", exc);
    }

    @KeepForSdk
    public synchronized Task<DetectionResultT> a(final ko.a aVar) {
        Preconditions.checkNotNull(aVar, "InputImage can not be null");
        if (this.f17329a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (aVar.k() >= 32 && aVar.g() >= 32) {
            return this.f17330b.a(this.f17332d, new Callable() { // from class: com.google.mlkit.vision.common.internal.b
                {
                    MobileVisionBase.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.j(aVar);
                }
            }, this.f17331c.getToken());
        } else {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    @h0(p.b.ON_DESTROY)
    public synchronized void close() {
        if (this.f17329a.getAndSet(true)) {
            return;
        }
        this.f17331c.cancel();
        this.f17330b.e(this.f17332d);
    }

    public final /* synthetic */ Object j(ko.a aVar) {
        zzkn zze = zzkn.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object i11 = this.f17330b.i(aVar);
            zze.close();
            return i11;
        } catch (Throwable th2) {
            try {
                zze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}