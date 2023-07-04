package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static g f11973g;

    /* renamed from: a  reason: collision with root package name */
    private volatile com.facebook.react.modules.core.a f11974a;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11976c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f11978e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11979f = false;

    /* renamed from: b  reason: collision with root package name */
    private final d f11975b = new d(this, null);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<a.AbstractC0228a>[] f11977d = new ArrayDeque[c.values().length];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f11981a;

        b(Runnable runnable) {
            this.f11981a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.class) {
                if (g.this.f11974a == null) {
                    g.this.f11974a = com.facebook.react.modules.core.a.d();
                }
            }
            Runnable runnable = this.f11981a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int mOrder;

        c(int i11) {
            this.mOrder = i11;
        }

        int getOrder() {
            return this.mOrder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends a.AbstractC0228a {
        private d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            synchronized (g.this.f11976c) {
                g.this.f11979f = false;
                for (int i11 = 0; i11 < g.this.f11977d.length; i11++) {
                    ArrayDeque arrayDeque = g.this.f11977d[i11];
                    int size = arrayDeque.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        a.AbstractC0228a abstractC0228a = (a.AbstractC0228a) arrayDeque.pollFirst();
                        if (abstractC0228a != null) {
                            abstractC0228a.doFrame(j11);
                            g.g(g.this);
                        } else {
                            nd.a.j("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                g.this.l();
            }
        }

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }
    }

    private g() {
        int i11 = 0;
        while (true) {
            ArrayDeque<a.AbstractC0228a>[] arrayDequeArr = this.f11977d;
            if (i11 < arrayDequeArr.length) {
                arrayDequeArr[i11] = new ArrayDeque<>();
                i11++;
            } else {
                k(null);
                return;
            }
        }
    }

    static /* synthetic */ int g(g gVar) {
        int i11 = gVar.f11978e;
        gVar.f11978e = i11 - 1;
        return i11;
    }

    public static g i() {
        wf.a.d(f11973g, "ReactChoreographer needs to be initialized.");
        return f11973g;
    }

    public static void j() {
        if (f11973g == null) {
            f11973g = new g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        wf.a.a(this.f11978e >= 0);
        if (this.f11978e == 0 && this.f11979f) {
            if (this.f11974a != null) {
                this.f11974a.f(this.f11975b);
            }
            this.f11979f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f11974a.e(this.f11975b);
        this.f11979f = true;
    }

    public void k(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new b(runnable));
    }

    public void m(c cVar, a.AbstractC0228a abstractC0228a) {
        synchronized (this.f11976c) {
            this.f11977d[cVar.getOrder()].addLast(abstractC0228a);
            boolean z11 = true;
            int i11 = this.f11978e + 1;
            this.f11978e = i11;
            if (i11 <= 0) {
                z11 = false;
            }
            wf.a.a(z11);
            if (!this.f11979f) {
                if (this.f11974a == null) {
                    k(new a());
                } else {
                    n();
                }
            }
        }
    }

    public void o(c cVar, a.AbstractC0228a abstractC0228a) {
        synchronized (this.f11976c) {
            if (this.f11977d[cVar.getOrder()].removeFirstOccurrence(abstractC0228a)) {
                this.f11978e--;
                l();
            } else {
                nd.a.j("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }
}