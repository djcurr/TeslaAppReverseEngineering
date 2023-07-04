package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public class a implements c0.c<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f2321a;

        /* renamed from: b */
        final /* synthetic */ b.a f2322b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f2323c;

        a(boolean z11, b.a aVar, ScheduledFuture scheduledFuture) {
            this.f2321a = z11;
            this.f2322b = aVar;
            this.f2323c = scheduledFuture;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f2321a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f2322b.c(arrayList);
            this.f2323c.cancel(true);
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            this.f2322b.c(Collections.unmodifiableList(Collections.emptyList()));
            this.f2323c.cancel(true);
        }
    }

    public static /* synthetic */ void a(com.google.common.util.concurrent.c cVar) {
        cVar.cancel(true);
    }

    public static /* synthetic */ void b(com.google.common.util.concurrent.c cVar, b.a aVar, long j11) {
        g(cVar, aVar, j11);
    }

    public static /* synthetic */ Object c(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j11, boolean z11, b.a aVar) {
        return j(list, scheduledExecutorService, executor, j11, z11, aVar);
    }

    public static /* synthetic */ void d(Executor executor, com.google.common.util.concurrent.c cVar, b.a aVar, long j11) {
        h(executor, cVar, aVar, j11);
    }

    public static void e(List<DeferrableSurface> list) {
        for (DeferrableSurface deferrableSurface : list) {
            deferrableSurface.d();
        }
    }

    public static void f(List<DeferrableSurface> list) {
        if (list.isEmpty()) {
            return;
        }
        int i11 = 0;
        do {
            try {
                list.get(i11).g();
                i11++;
            } catch (DeferrableSurface.SurfaceClosedException e11) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    list.get(i12).d();
                }
                throw e11;
            }
        } while (i11 < list.size());
    }

    public static /* synthetic */ void g(com.google.common.util.concurrent.c cVar, b.a aVar, long j11) {
        if (cVar.isDone()) {
            return;
        }
        aVar.f(new TimeoutException("Cannot complete surfaceList within " + j11));
        cVar.cancel(true);
    }

    public static /* synthetic */ void h(Executor executor, final com.google.common.util.concurrent.c cVar, final b.a aVar, final long j11) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.i0
            @Override // java.lang.Runnable
            public final void run() {
                k0.b(cVar, aVar, j11);
            }
        });
    }

    public static /* synthetic */ Object j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j11, boolean z11, final b.a aVar) {
        final com.google.common.util.concurrent.c n11 = c0.f.n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.j0
            @Override // java.lang.Runnable
            public final void run() {
                k0.d(executor, n11, aVar, j11);
            }
        }, j11, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: androidx.camera.core.impl.h0
            @Override // java.lang.Runnable
            public final void run() {
                k0.a(n11);
            }
        }, executor);
        c0.f.b(n11, new a(z11, aVar, schedule), executor);
        return "surfaceList";
    }

    public static com.google.common.util.concurrent.c<List<Surface>> k(Collection<DeferrableSurface> collection, final boolean z11, final long j11, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : collection) {
            arrayList.add(deferrableSurface.e());
        }
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.impl.g0
            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return k0.c(arrayList, scheduledExecutorService, executor, j11, z11, aVar);
            }
        });
    }
}