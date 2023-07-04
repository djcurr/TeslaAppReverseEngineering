package androidx.camera.core.impl;

import androidx.camera.core.impl.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    private final int f2388c;

    /* renamed from: e  reason: collision with root package name */
    private int f2390e;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f2386a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private final Object f2387b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<z.b, a> f2389d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private s.a f2391a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f2392b;

        /* renamed from: c  reason: collision with root package name */
        private final b f2393c;

        a(s.a aVar, Executor executor, b bVar) {
            this.f2391a = aVar;
            this.f2392b = executor;
            this.f2393c = bVar;
        }

        s.a a() {
            return this.f2391a;
        }

        void b() {
            try {
                Executor executor = this.f2392b;
                final b bVar = this.f2393c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e11) {
                androidx.camera.core.n0.d("CameraStateRegistry", "Unable to notify camera.", e11);
            }
        }

        s.a c(s.a aVar) {
            s.a aVar2 = this.f2391a;
            this.f2391a = aVar;
            return aVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public x(int i11) {
        this.f2388c = i11;
        synchronized ("mLock") {
            this.f2390e = i11;
        }
    }

    private static boolean a(s.a aVar) {
        return aVar != null && aVar.holdsCameraSlot();
    }

    private void c() {
        if (androidx.camera.core.n0.g("CameraStateRegistry")) {
            this.f2386a.setLength(0);
            this.f2386a.append("Recalculating open cameras:\n");
            this.f2386a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f2386a.append("-------------------------------------------------------------------\n");
        }
        int i11 = 0;
        for (Map.Entry<z.b, a> entry : this.f2389d.entrySet()) {
            if (androidx.camera.core.n0.g("CameraStateRegistry")) {
                this.f2386a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (a(entry.getValue().a())) {
                i11++;
            }
        }
        if (androidx.camera.core.n0.g("CameraStateRegistry")) {
            this.f2386a.append("-------------------------------------------------------------------\n");
            this.f2386a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i11), Integer.valueOf(this.f2388c)));
            androidx.camera.core.n0.a("CameraStateRegistry", this.f2386a.toString());
        }
        this.f2390e = Math.max(this.f2388c - i11, 0);
    }

    private s.a f(z.b bVar) {
        a remove = this.f2389d.remove(bVar);
        if (remove != null) {
            c();
            return remove.a();
        }
        return null;
    }

    private s.a g(z.b bVar, s.a aVar) {
        s.a c11 = ((a) v3.h.g(this.f2389d.get(bVar), "Cannot update state of camera which has not yet been registered. Register with CameraAvailabilityRegistry.registerCamera()")).c(aVar);
        s.a aVar2 = s.a.OPENING;
        if (aVar == aVar2) {
            v3.h.i(a(aVar) || c11 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraAvailabilityRegistry.tryOpen()");
        }
        if (c11 != aVar) {
            c();
        }
        return c11;
    }

    public void b(z.b bVar, s.a aVar) {
        s.a g11;
        List<a> singletonList;
        synchronized (this.f2387b) {
            int i11 = this.f2390e;
            if (aVar == s.a.RELEASED) {
                g11 = f(bVar);
            } else {
                g11 = g(bVar, aVar);
            }
            if (g11 == aVar) {
                return;
            }
            if (i11 < 1 && this.f2390e > 0) {
                singletonList = new ArrayList();
                for (Map.Entry<z.b, a> entry : this.f2389d.entrySet()) {
                    if (entry.getValue().a() == s.a.PENDING_OPEN) {
                        singletonList.add(entry.getValue());
                    }
                }
            } else {
                singletonList = (aVar != s.a.PENDING_OPEN || this.f2390e <= 0) ? null : Collections.singletonList(this.f2389d.get(bVar));
            }
            if (singletonList != null) {
                for (a aVar2 : singletonList) {
                    aVar2.b();
                }
            }
        }
    }

    public void d(z.b bVar, Executor executor, b bVar2) {
        synchronized (this.f2387b) {
            boolean z11 = !this.f2389d.containsKey(bVar);
            v3.h.i(z11, "Camera is already registered: " + bVar);
            this.f2389d.put(bVar, new a(null, executor, bVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099, B:13:0x0063), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099, B:13:0x0063), top: B:28:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(z.b r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2387b
            monitor-enter(r0)
            java.util.Map<z.b, androidx.camera.core.impl.x$a> r1 = r9.f2389d     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.x$a r1 = (androidx.camera.core.impl.x.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = v3.h.g(r1, r2)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.x$a r1 = (androidx.camera.core.impl.x.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.n0.g(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.f2386a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f2386a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f2390e     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 2
            androidx.camera.core.impl.s$a r8 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = a(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            r10 = 3
            androidx.camera.core.impl.s$a r8 = r1.a()     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.f2390e     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            androidx.camera.core.impl.s$a r10 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = a(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = r4
            goto L69
        L63:
            androidx.camera.core.impl.s$a r10 = androidx.camera.core.impl.s.a.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.c(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.n0.g(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f2386a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f2386a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.n0.a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.c()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.x.e(z.b):boolean");
    }
}