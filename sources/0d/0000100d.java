package cg;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import dg.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f9075a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9076b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentLinkedQueue<dg.a> f9077c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<dg.d> f9078d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue<e> f9079e = new ConcurrentLinkedQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f9080f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f9081g = 0;

    /* renamed from: h  reason: collision with root package name */
    private long f9082h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f9083i = 0;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public b(c cVar, a aVar) {
        this.f9075a = cVar;
        this.f9076b = aVar;
    }

    private boolean f() {
        boolean isIgnorable;
        if (this.f9081g == 0) {
            this.f9082h = 0L;
        }
        this.f9083i = SystemClock.uptimeMillis();
        List<dg.a> l11 = l();
        List<dg.d> j11 = j();
        if (j11 == null && l11 == null) {
            return false;
        }
        if (l11 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews viewCommandMountItems to execute: " + l11.size());
            for (dg.a aVar : l11) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(aVar, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    i(aVar);
                } catch (RetryableMountingLayerException e11) {
                    if (aVar.c() == 0) {
                        aVar.d();
                        d(aVar);
                    } else {
                        ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + aVar.toString(), e11));
                    }
                } catch (Throwable th2) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new RuntimeException("Caught exception executing ViewCommand: " + aVar.toString(), th2));
                }
            }
            com.facebook.systrace.a.g(0L);
        }
        Collection<e> k11 = k();
        if (k11 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews preMountItems to execute: " + k11.size());
            for (e eVar : k11) {
                i(eVar);
            }
            com.facebook.systrace.a.g(0L);
        }
        if (j11 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews mountItems to execute: " + j11.size());
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<dg.d> it2 = j11.iterator();
            while (it2.hasNext()) {
                dg.d next = it2.next();
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(next, "dispatchMountItems: Executing mountItem");
                }
                try {
                    i(next);
                } finally {
                    if (isIgnorable) {
                    }
                }
            }
            this.f9082h += SystemClock.uptimeMillis() - uptimeMillis;
        }
        com.facebook.systrace.a.g(0L);
        return true;
    }

    private static <E extends dg.d> List<E> h(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        ArrayList arrayList = new ArrayList();
        while (!concurrentLinkedQueue.isEmpty()) {
            E poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void i(dg.d dVar) {
        if (this.f9075a.j(dVar.a())) {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                nd.a.l("MountItemDispatcher", "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(dVar.a()));
            }
            this.f9075a.d(dVar.a()).r(dVar);
            return;
        }
        dVar.b(this.f9075a);
    }

    private List<dg.d> j() {
        return h(this.f9078d);
    }

    private Collection<e> k() {
        return h(this.f9079e);
    }

    private List<dg.a> l() {
        return h(this.f9077c);
    }

    private static boolean o(long j11) {
        return 16 - ((System.nanoTime() - j11) / 1000000) < 8;
    }

    private static void p(dg.d dVar, String str) {
        String[] split;
        for (String str2 : dVar.toString().split("\n")) {
            nd.a.j("MountItemDispatcher", str + ": " + str2);
        }
    }

    public void a(dg.d dVar) {
        this.f9078d.add(dVar);
    }

    public void b(e eVar) {
        if (this.f9075a.r(eVar.a())) {
            return;
        }
        this.f9079e.add(eVar);
    }

    public void c(dg.a aVar) {
        this.f9077c.add(aVar);
    }

    public void d(dg.a aVar) {
        c(aVar);
    }

    public void e(Queue<dg.d> queue) {
        while (!queue.isEmpty()) {
            dg.d poll = queue.poll();
            try {
                poll.b(this.f9075a);
            } catch (RetryableMountingLayerException e11) {
                if (poll instanceof dg.a) {
                    dg.a aVar = (dg.a) poll;
                    if (aVar.c() == 0) {
                        aVar.d();
                        d(aVar);
                    }
                } else {
                    p(poll, "dispatchExternalMountItems: mounting failed with " + e11.getMessage());
                }
            }
        }
    }

    public void g(long j11) {
        e poll;
        com.facebook.systrace.a.c(0L, "FabricUIManager::premountViews");
        this.f9080f = true;
        while (!o(j11) && (poll = this.f9079e.poll()) != null) {
            try {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(poll, "dispatchPreMountItems: Dispatching PreAllocateViewMountItem");
                }
                i(poll);
            } catch (Throwable th2) {
                this.f9080f = false;
                throw th2;
            }
        }
        this.f9080f = false;
        com.facebook.systrace.a.g(0L);
    }

    public long m() {
        return this.f9082h;
    }

    public long n() {
        return this.f9083i;
    }

    public boolean q() {
        if (this.f9080f) {
            return false;
        }
        try {
            boolean f11 = f();
            this.f9080f = false;
            this.f9076b.a();
            int i11 = this.f9081g;
            if (i11 < 10 && f11) {
                if (i11 > 2) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Re-dispatched " + this.f9081g + " times. This indicates setState (?) is likely being called too many times during mounting."));
                }
                this.f9081g++;
                q();
            }
            this.f9081g = 0;
            return f11;
        } finally {
        }
    }
}