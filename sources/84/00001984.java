package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public class e implements com.facebook.react.uimanager.events.d, LifecycleEventListener {

    /* renamed from: q  reason: collision with root package name */
    private static final Comparator<com.facebook.react.uimanager.events.c> f12249q = new a();

    /* renamed from: c  reason: collision with root package name */
    private final ReactApplicationContext f12252c;

    /* renamed from: n  reason: collision with root package name */
    private volatile ReactEventEmitter f12263n;

    /* renamed from: a  reason: collision with root package name */
    private final Object f12250a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f12251b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LongSparseArray<Integer> f12253d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Short> f12254e = yf.c.b();

    /* renamed from: f  reason: collision with root package name */
    private final c f12255f = new c(this, null);

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<com.facebook.react.uimanager.events.c> f12256g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<f> f12257h = new CopyOnWriteArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> f12258i = new CopyOnWriteArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private final d f12259j = new d(this, null);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f12260k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private com.facebook.react.uimanager.events.c[] f12261l = new com.facebook.react.uimanager.events.c[16];

    /* renamed from: m  reason: collision with root package name */
    private int f12262m = 0;

    /* renamed from: o  reason: collision with root package name */
    private short f12264o = 0;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f12265p = false;

    /* loaded from: classes3.dex */
    class a implements Comparator<com.facebook.react.uimanager.events.c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(com.facebook.react.uimanager.events.c cVar, com.facebook.react.uimanager.events.c cVar2) {
            if (cVar == null && cVar2 == null) {
                return 0;
            }
            if (cVar == null) {
                return -1;
            }
            if (cVar2 == null) {
                return 1;
            }
            int i11 = ((cVar.getTimestampMs() - cVar2.getTimestampMs()) > 0L ? 1 : ((cVar.getTimestampMs() - cVar2.getTimestampMs()) == 0L ? 0 : -1));
            if (i11 == 0) {
                return 0;
            }
            return i11 < 0 ? -1 : 1;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.F();
        }
    }

    /* loaded from: classes3.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.c(0L, "DispatchEventsRunnable");
            try {
                com.facebook.systrace.a.d(0L, "ScheduleDispatchFrameCallback", e.this.f12260k.getAndIncrement());
                e.this.f12265p = false;
                wf.a.c(e.this.f12263n);
                synchronized (e.this.f12251b) {
                    if (e.this.f12262m > 0) {
                        if (e.this.f12262m > 1) {
                            Arrays.sort(e.this.f12261l, 0, e.this.f12262m, e.f12249q);
                        }
                        for (int i11 = 0; i11 < e.this.f12262m; i11++) {
                            com.facebook.react.uimanager.events.c cVar = e.this.f12261l[i11];
                            if (cVar != null) {
                                com.facebook.systrace.a.d(0L, cVar.getEventName(), cVar.getUniqueID());
                                cVar.dispatchModern(e.this.f12263n);
                                cVar.dispose();
                            }
                        }
                        e.this.A();
                        e.this.f12253d.clear();
                    }
                }
                Iterator it2 = e.this.f12258i.iterator();
                while (it2.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it2.next()).a();
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }

        /* synthetic */ c(e eVar, a aVar) {
            this();
        }
    }

    public e(ReactApplicationContext reactApplicationContext) {
        this.f12252c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f12263n = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Arrays.fill(this.f12261l, 0, this.f12262m, (Object) null);
        this.f12262m = 0;
    }

    private long B(int i11, String str, short s11) {
        short s12;
        Short sh2 = this.f12254e.get(str);
        if (sh2 != null) {
            s12 = sh2.shortValue();
        } else {
            short s13 = this.f12264o;
            this.f12264o = (short) (s13 + 1);
            this.f12254e.put(str, Short.valueOf(s13));
            s12 = s13;
        }
        return C(i11, s12, s11);
    }

    private static long C(int i11, short s11, short s12) {
        return ((s11 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | i11 | ((s12 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    private void D() {
        if (this.f12263n != null) {
            this.f12259j.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        synchronized (this.f12250a) {
            synchronized (this.f12251b) {
                for (int i11 = 0; i11 < this.f12256g.size(); i11++) {
                    com.facebook.react.uimanager.events.c cVar = this.f12256g.get(i11);
                    if (!cVar.canCoalesce()) {
                        z(cVar);
                    } else {
                        long B = B(cVar.getViewTag(), cVar.getEventName(), cVar.getCoalescingKey());
                        Integer num = this.f12253d.get(B);
                        com.facebook.react.uimanager.events.c cVar2 = null;
                        if (num == null) {
                            this.f12253d.put(B, Integer.valueOf(this.f12262m));
                        } else {
                            com.facebook.react.uimanager.events.c cVar3 = this.f12261l[num.intValue()];
                            com.facebook.react.uimanager.events.c coalesce = cVar.coalesce(cVar3);
                            if (coalesce != cVar3) {
                                this.f12253d.put(B, Integer.valueOf(this.f12262m));
                                this.f12261l[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = coalesce;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            z(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                    }
                }
            }
            this.f12256g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        UiThreadUtil.assertOnUiThread();
        this.f12259j.d();
    }

    private void z(com.facebook.react.uimanager.events.c cVar) {
        int i11 = this.f12262m;
        com.facebook.react.uimanager.events.c[] cVarArr = this.f12261l;
        if (i11 == cVarArr.length) {
            this.f12261l = (com.facebook.react.uimanager.events.c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.c[] cVarArr2 = this.f12261l;
        int i12 = this.f12262m;
        this.f12262m = i12 + 1;
        cVarArr2[i12] = cVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void a(int i11, RCTEventEmitter rCTEventEmitter) {
        this.f12263n.register(i11, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void b() {
        D();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void c(com.facebook.react.uimanager.events.a aVar) {
        this.f12258i.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void d() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.d
    public void e(int i11) {
        this.f12263n.unregister(i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void f(f fVar) {
        this.f12257h.add(fVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void g(com.facebook.react.uimanager.events.c cVar) {
        wf.a.b(cVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<f> it2 = this.f12257h.iterator();
        while (it2.hasNext()) {
            it2.next().onEventDispatch(cVar);
        }
        synchronized (this.f12250a) {
            this.f12256g.add(cVar);
            com.facebook.systrace.a.j(0L, cVar.getEventName(), cVar.getUniqueID());
        }
        D();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void h(com.facebook.react.uimanager.events.a aVar) {
        this.f12258i.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void i(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f12263n.register(i11, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends a.AbstractC0228a {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f12268a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12269b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
            }
        }

        private d() {
            this.f12268a = false;
            this.f12269b = false;
        }

        private void c() {
            com.facebook.react.modules.core.g.i().m(g.c.TIMERS_EVENTS, e.this.f12259j);
        }

        public void a() {
            if (this.f12268a) {
                return;
            }
            this.f12268a = true;
            c();
        }

        public void b() {
            if (this.f12268a) {
                return;
            }
            if (!e.this.f12252c.isOnUiQueueThread()) {
                e.this.f12252c.runOnUiQueueThread(new a());
            } else {
                a();
            }
        }

        public void d() {
            this.f12269b = true;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            UiThreadUtil.assertOnUiThread();
            if (this.f12269b) {
                this.f12268a = false;
            } else {
                c();
            }
            com.facebook.systrace.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                e.this.E();
                if (!e.this.f12265p) {
                    e.this.f12265p = true;
                    com.facebook.systrace.a.j(0L, "ScheduleDispatchFrameCallback", e.this.f12260k.get());
                    e.this.f12252c.runOnJSQueueThread(e.this.f12255f);
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }

        /* synthetic */ d(e eVar, a aVar) {
            this();
        }
    }
}