package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import yf.i;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f11945a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.c f11946b;

    /* renamed from: c  reason: collision with root package name */
    private final g f11947c;

    /* renamed from: d  reason: collision with root package name */
    private final bg.d f11948d;

    /* renamed from: m  reason: collision with root package name */
    private c f11957m;

    /* renamed from: e  reason: collision with root package name */
    private final Object f11949e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f11950f = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f11953i = new AtomicBoolean(true);

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f11954j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    private final f f11955k = new f(this, null);

    /* renamed from: l  reason: collision with root package name */
    private final C0230d f11956l = new C0230d(this, null);

    /* renamed from: n  reason: collision with root package name */
    private boolean f11958n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11959o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11960p = false;

    /* renamed from: g  reason: collision with root package name */
    private final PriorityQueue<e> f11951g = new PriorityQueue<>(11, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<e> f11952h = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Comparator<e> {
        a(d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            int i11 = ((eVar.f11970d - eVar2.f11970d) > 0L ? 1 : ((eVar.f11970d - eVar2.f11970d) == 0L ? 0 : -1));
            if (i11 == 0) {
                return 0;
            }
            return i11 < 0 ? -1 : 1;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11961a;

        b(boolean z11) {
            this.f11961a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f11950f) {
                if (this.f11961a) {
                    d.this.C();
                } else {
                    d.this.o();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f11963a = false;

        /* renamed from: b  reason: collision with root package name */
        private final long f11964b;

        public c(long j11) {
            this.f11964b = j11;
        }

        public void a() {
            this.f11963a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            if (this.f11963a) {
                return;
            }
            long c11 = i.c() - (this.f11964b / 1000000);
            long a11 = i.a() - c11;
            if (16.666666f - ((float) c11) < 1.0f) {
                return;
            }
            synchronized (d.this.f11950f) {
                z11 = d.this.f11960p;
            }
            if (z11) {
                d.this.f11946b.callIdleCallbacks(a11);
            }
            d.this.f11957m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0230d extends a.AbstractC0228a {
        private C0230d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            if (!d.this.f11953i.get() || d.this.f11954j.get()) {
                if (d.this.f11957m != null) {
                    d.this.f11957m.a();
                }
                d dVar = d.this;
                dVar.f11957m = new c(j11);
                d.this.f11945a.runOnJSQueueThread(d.this.f11957m);
                d.this.f11947c.m(g.c.IDLE_EVENT, this);
            }
        }

        /* synthetic */ C0230d(d dVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f11967a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f11968b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11969c;

        /* renamed from: d  reason: collision with root package name */
        private long f11970d;

        /* synthetic */ e(int i11, long j11, int i12, boolean z11, a aVar) {
            this(i11, j11, i12, z11);
        }

        private e(int i11, long j11, int i12, boolean z11) {
            this.f11967a = i11;
            this.f11970d = j11;
            this.f11969c = i12;
            this.f11968b = z11;
        }
    }

    public d(ReactApplicationContext reactApplicationContext, com.facebook.react.modules.core.c cVar, g gVar, bg.d dVar) {
        this.f11945a = reactApplicationContext;
        this.f11946b = cVar;
        this.f11947c = gVar;
        this.f11948d = dVar;
    }

    private void B() {
        if (this.f11958n) {
            return;
        }
        this.f11947c.m(g.c.TIMERS_EVENTS, this.f11955k);
        this.f11958n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f11959o) {
            return;
        }
        this.f11947c.m(g.c.IDLE_EVENT, this.f11956l);
        this.f11959o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f11959o) {
            this.f11947c.o(g.c.IDLE_EVENT, this.f11956l);
            this.f11959o = false;
        }
    }

    private void p() {
        eg.b e11 = eg.b.e(this.f11945a);
        if (this.f11958n && this.f11953i.get() && !e11.f()) {
            this.f11947c.o(g.c.TIMERS_EVENTS, this.f11955k);
            this.f11958n = false;
        }
    }

    private static boolean s(e eVar, long j11) {
        return !eVar.f11968b && ((long) eVar.f11969c) < j11;
    }

    private void t() {
        if (!this.f11953i.get() || this.f11954j.get()) {
            return;
        }
        p();
    }

    private void u() {
        synchronized (this.f11950f) {
            if (this.f11960p) {
                C();
            }
        }
    }

    public void A() {
        p();
        o();
    }

    @xf.a
    public void createTimer(int i11, long j11, boolean z11) {
        e eVar = new e(i11, (i.b() / 1000000) + j11, (int) j11, z11, null);
        synchronized (this.f11949e) {
            this.f11951g.add(eVar);
            this.f11952h.put(i11, eVar);
        }
    }

    @xf.a
    public void deleteTimer(int i11) {
        synchronized (this.f11949e) {
            e eVar = this.f11952h.get(i11);
            if (eVar == null) {
                return;
            }
            this.f11952h.remove(i11);
            this.f11951g.remove(eVar);
        }
    }

    public void q(int i11, int i12, double d11, boolean z11) {
        long a11 = i.a();
        long j11 = (long) d11;
        if (this.f11948d.e() && Math.abs(j11 - a11) > 60000) {
            this.f11946b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j11 - a11) + i12);
        if (i12 == 0 && !z11) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i11);
            this.f11946b.callTimers(createArray);
            return;
        }
        createTimer(i11, max, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(long j11) {
        synchronized (this.f11949e) {
            e peek = this.f11951g.peek();
            if (peek == null) {
                return false;
            }
            if (s(peek, j11)) {
                return true;
            }
            Iterator<e> it2 = this.f11951g.iterator();
            while (it2.hasNext()) {
                if (s(it2.next(), j11)) {
                    return true;
                }
            }
            return false;
        }
    }

    @xf.a
    public void setSendIdleEvents(boolean z11) {
        synchronized (this.f11950f) {
            this.f11960p = z11;
        }
        UiThreadUtil.runOnUiThread(new b(z11));
    }

    public void v(int i11) {
        if (eg.b.e(this.f11945a).f()) {
            return;
        }
        this.f11954j.set(false);
        p();
        t();
    }

    public void w(int i11) {
        if (this.f11954j.getAndSet(true)) {
            return;
        }
        B();
        u();
    }

    public void x() {
        p();
        t();
    }

    public void y() {
        this.f11953i.set(true);
        p();
        t();
    }

    public void z() {
        this.f11953i.set(false);
        B();
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f extends a.AbstractC0228a {

        /* renamed from: a  reason: collision with root package name */
        private WritableArray f11971a;

        private f() {
            this.f11971a = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            if (!d.this.f11953i.get() || d.this.f11954j.get()) {
                long j12 = j11 / 1000000;
                synchronized (d.this.f11949e) {
                    while (!d.this.f11951g.isEmpty() && ((e) d.this.f11951g.peek()).f11970d < j12) {
                        e eVar = (e) d.this.f11951g.poll();
                        if (this.f11971a == null) {
                            this.f11971a = Arguments.createArray();
                        }
                        this.f11971a.pushInt(eVar.f11967a);
                        if (eVar.f11968b) {
                            eVar.f11970d = eVar.f11969c + j12;
                            d.this.f11951g.add(eVar);
                        } else {
                            d.this.f11952h.remove(eVar.f11967a);
                        }
                    }
                }
                if (this.f11971a != null) {
                    d.this.f11946b.callTimers(this.f11971a);
                    this.f11971a = null;
                }
                d.this.f11947c.m(g.c.TIMERS_EVENTS, this);
            }
        }

        /* synthetic */ f(d dVar, a aVar) {
            this();
        }
    }
}