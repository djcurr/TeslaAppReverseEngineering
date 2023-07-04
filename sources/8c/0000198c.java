package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class h implements d, LifecycleEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f12272a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<f> f12273b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> f12274c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final b f12275d = new b(this, null);

    /* renamed from: e  reason: collision with root package name */
    private volatile ReactEventEmitter f12276e;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.p();
        }
    }

    public h(ReactApplicationContext reactApplicationContext) {
        this.f12272a = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f12276e = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Iterator<com.facebook.react.uimanager.events.a> it2 = this.f12274c.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    private void o() {
        if (this.f12276e != null) {
            this.f12275d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        UiThreadUtil.assertOnUiThread();
        this.f12275d.d();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void a(int i11, RCTEventEmitter rCTEventEmitter) {
        this.f12276e.register(i11, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void b() {
        o();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void c(com.facebook.react.uimanager.events.a aVar) {
        this.f12274c.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void d() {
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.uimanager.events.d
    public void e(int i11) {
        this.f12276e.unregister(i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void f(f fVar) {
        this.f12273b.add(fVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void g(c cVar) {
        wf.a.b(cVar.isInitialized(), "Dispatched event hasn't been initialized");
        wf.a.c(this.f12276e);
        Iterator<f> it2 = this.f12273b.iterator();
        while (it2.hasNext()) {
            it2.next().onEventDispatch(cVar);
        }
        cVar.dispatchModern(this.f12276e);
        cVar.dispose();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void h(com.facebook.react.uimanager.events.a aVar) {
        this.f12274c.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void i(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f12276e.register(i11, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends a.AbstractC0228a {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f12278a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12279b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a();
            }
        }

        private b() {
            this.f12278a = false;
            this.f12279b = false;
        }

        private void c() {
            com.facebook.react.modules.core.g.i().m(g.c.TIMERS_EVENTS, h.this.f12275d);
        }

        public void a() {
            if (this.f12278a) {
                return;
            }
            this.f12278a = true;
            c();
        }

        public void b() {
            if (this.f12278a) {
                return;
            }
            if (!h.this.f12272a.isOnUiQueueThread()) {
                h.this.f12272a.runOnUiQueueThread(new a());
            } else {
                a();
            }
        }

        public void d() {
            this.f12279b = true;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            UiThreadUtil.assertOnUiThread();
            if (this.f12279b) {
                this.f12278a = false;
            } else {
                c();
            }
            h.this.n();
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }
    }
}