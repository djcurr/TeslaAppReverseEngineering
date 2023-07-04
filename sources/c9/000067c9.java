package eg;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final WeakHashMap<ReactContext, b> f25079g = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ReactContext> f25080a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<eg.c> f25081b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f25082c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Integer> f25083d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, eg.a> f25084e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<Runnable> f25085f;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eg.a f25086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f25087b;

        a(eg.a aVar, int i11) {
            this.f25086a = aVar;
            this.f25087b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l(this.f25086a, this.f25087b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eg.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0484b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25089a;

        RunnableC0484b(int i11) {
            this.f25089a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (eg.c cVar : b.this.f25081b) {
                cVar.onHeadlessJsTaskFinish(this.f25089a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25091a;

        c(int i11) {
            this.f25091a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.f25091a);
        }
    }

    private b(ReactContext reactContext) {
        new AtomicInteger(0);
        this.f25082c = new Handler();
        this.f25083d = new CopyOnWriteArraySet();
        this.f25084e = new ConcurrentHashMap();
        this.f25085f = new SparseArray<>();
        this.f25080a = new WeakReference<>(reactContext);
    }

    public static b e(ReactContext reactContext) {
        WeakHashMap<ReactContext, b> weakHashMap = f25079g;
        b bVar = weakHashMap.get(reactContext);
        if (bVar == null) {
            b bVar2 = new b(reactContext);
            weakHashMap.put(reactContext, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private void i(int i11) {
        Runnable runnable = this.f25085f.get(i11);
        if (runnable != null) {
            this.f25082c.removeCallbacks(runnable);
            this.f25085f.remove(i11);
        }
    }

    private void k(int i11, long j11) {
        c cVar = new c(i11);
        this.f25085f.append(i11, cVar);
        this.f25082c.postDelayed(cVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(eg.a aVar, int i11) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) wf.a.d(this.f25080a.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !aVar.e()) {
            throw new IllegalStateException("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.");
        }
        this.f25083d.add(Integer.valueOf(i11));
        this.f25084e.put(Integer.valueOf(i11), new eg.a(aVar));
        if (reactContext.hasActiveReactInstance()) {
            ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i11, aVar.c(), aVar.a());
        } else {
            ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (aVar.d() > 0) {
            k(i11, aVar.d());
        }
        for (eg.c cVar : this.f25081b) {
            cVar.onHeadlessJsTaskStart(i11);
        }
    }

    public void c(eg.c cVar) {
        this.f25081b.add(cVar);
    }

    public synchronized void d(int i11) {
        boolean remove = this.f25083d.remove(Integer.valueOf(i11));
        wf.a.b(remove, "Tried to finish non-existent task with id " + i11 + ".");
        boolean z11 = this.f25084e.remove(Integer.valueOf(i11)) != null;
        wf.a.b(z11, "Tried to remove non-existent task config with id " + i11 + ".");
        i(i11);
        UiThreadUtil.runOnUiThread(new RunnableC0484b(i11));
    }

    public boolean f() {
        return this.f25083d.size() > 0;
    }

    public synchronized boolean g(int i11) {
        return this.f25083d.contains(Integer.valueOf(i11));
    }

    public void h(eg.c cVar) {
        this.f25081b.remove(cVar);
    }

    public synchronized boolean j(int i11) {
        eg.a aVar = this.f25084e.get(Integer.valueOf(i11));
        boolean z11 = aVar != null;
        wf.a.b(z11, "Tried to retrieve non-existent task config with id " + i11 + ".");
        d b11 = aVar.b();
        if (b11.a()) {
            i(i11);
            UiThreadUtil.runOnUiThread(new a(new eg.a(aVar.c(), aVar.a(), aVar.d(), aVar.e(), b11.update()), i11), b11.b());
            return true;
        }
        return false;
    }
}