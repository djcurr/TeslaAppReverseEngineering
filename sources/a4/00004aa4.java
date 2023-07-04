package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    final b f20699a;

    /* renamed from: b  reason: collision with root package name */
    final Context f20700b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f20701c;

    /* renamed from: d  reason: collision with root package name */
    final j f20702d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, com.squareup.picasso.c> f20703e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f20704f;

    /* renamed from: g  reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f20705g;

    /* renamed from: h  reason: collision with root package name */
    final Set<Object> f20706h;

    /* renamed from: i  reason: collision with root package name */
    final Handler f20707i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f20708j;

    /* renamed from: k  reason: collision with root package name */
    final d f20709k;

    /* renamed from: l  reason: collision with root package name */
    final a0 f20710l;

    /* renamed from: m  reason: collision with root package name */
    final List<com.squareup.picasso.c> f20711m;

    /* renamed from: n  reason: collision with root package name */
    final c f20712n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f20713o;

    /* renamed from: p  reason: collision with root package name */
    boolean f20714p;

    /* loaded from: classes2.dex */
    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final i f20715a;

        /* renamed from: com.squareup.picasso.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0364a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Message f20716a;

            RunnableC0364a(a aVar, Message message) {
                this.f20716a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f20716a.what);
            }
        }

        a(Looper looper, i iVar) {
            super(looper);
            this.f20715a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f20715a.v((com.squareup.picasso.a) message.obj);
                    return;
                case 2:
                    this.f20715a.o((com.squareup.picasso.a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    t.f20735p.post(new RunnableC0364a(this, message));
                    return;
                case 4:
                    this.f20715a.p((com.squareup.picasso.c) message.obj);
                    return;
                case 5:
                    this.f20715a.u((com.squareup.picasso.c) message.obj);
                    return;
                case 6:
                    this.f20715a.q((com.squareup.picasso.c) message.obj, false);
                    return;
                case 7:
                    this.f20715a.n();
                    return;
                case 9:
                    this.f20715a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    this.f20715a.m(message.arg1 == 1);
                    return;
                case 11:
                    this.f20715a.s(message.obj);
                    return;
                case 12:
                    this.f20715a.t(message.obj);
                    return;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* loaded from: classes2.dex */
    static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final i f20717a;

        c(i iVar) {
            this.f20717a = iVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f20717a.f20713o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f20717a.f20700b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f20717a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f20717a.f(((ConnectivityManager) d0.n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, a0 a0Var) {
        b bVar = new b();
        this.f20699a = bVar;
        bVar.start();
        d0.h(bVar.getLooper());
        this.f20700b = context;
        this.f20701c = executorService;
        this.f20703e = new LinkedHashMap();
        this.f20704f = new WeakHashMap();
        this.f20705g = new WeakHashMap();
        this.f20706h = new LinkedHashSet();
        this.f20707i = new a(bVar.getLooper(), this);
        this.f20702d = jVar;
        this.f20708j = handler;
        this.f20709k = dVar;
        this.f20710l = a0Var;
        this.f20711m = new ArrayList(4);
        this.f20714p = d0.p(context);
        this.f20713o = d0.o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f20712n = cVar;
        cVar.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        Bitmap bitmap = cVar.f20678m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f20711m.add(cVar);
        if (this.f20707i.hasMessages(7)) {
            return;
        }
        this.f20707i.sendEmptyMessageDelayed(7, 200L);
    }

    private void i() {
        if (this.f20704f.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it2 = this.f20704f.values().iterator();
        while (it2.hasNext()) {
            com.squareup.picasso.a next = it2.next();
            it2.remove();
            if (next.g().f20750n) {
                d0.s("Dispatcher", "replaying", next.i().d());
            }
            w(next, false);
        }
    }

    private void j(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).q().f20750n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(d0.j(cVar));
        }
        d0.s("Dispatcher", "delivered", sb2.toString());
    }

    private void k(com.squareup.picasso.a aVar) {
        Object k11 = aVar.k();
        if (k11 != null) {
            aVar.f20626k = true;
            this.f20704f.put(k11, aVar);
        }
    }

    private void l(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h11 = cVar.h();
        if (h11 != null) {
            k(h11);
        }
        List<com.squareup.picasso.a> i11 = cVar.i();
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                k(i11.get(i12));
            }
        }
    }

    void b(boolean z11) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(10, z11 ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(com.squareup.picasso.a aVar) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(com.squareup.picasso.c cVar) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(com.squareup.picasso.c cVar) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(com.squareup.picasso.c cVar) {
        Handler handler = this.f20707i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(com.squareup.picasso.a aVar) {
        Handler handler = this.f20707i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void m(boolean z11) {
        this.f20714p = z11;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f20711m);
        this.f20711m.clear();
        Handler handler = this.f20708j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(com.squareup.picasso.a aVar) {
        String d11 = aVar.d();
        com.squareup.picasso.c cVar = this.f20703e.get(d11);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f20703e.remove(d11);
                if (aVar.g().f20750n) {
                    d0.s("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f20706h.contains(aVar.j())) {
            this.f20705g.remove(aVar.k());
            if (aVar.g().f20750n) {
                d0.t("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a remove = this.f20704f.remove(aVar.k());
        if (remove == null || !remove.g().f20750n) {
            return;
        }
        d0.t("Dispatcher", "canceled", remove.i().d(), "from replaying");
    }

    void p(com.squareup.picasso.c cVar) {
        if (p.shouldWriteToMemoryCache(cVar.p())) {
            this.f20709k.set(cVar.n(), cVar.s());
        }
        this.f20703e.remove(cVar.n());
        a(cVar);
        if (cVar.q().f20750n) {
            d0.t("Dispatcher", "batched", d0.j(cVar), "for completion");
        }
    }

    void q(com.squareup.picasso.c cVar, boolean z11) {
        if (cVar.q().f20750n) {
            String j11 = d0.j(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z11 ? " (will replay)" : "");
            d0.t("Dispatcher", "batched", j11, sb2.toString());
        }
        this.f20703e.remove(cVar.n());
        a(cVar);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f20701c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.f20706h.add(obj)) {
            Iterator<com.squareup.picasso.c> it2 = this.f20703e.values().iterator();
            while (it2.hasNext()) {
                com.squareup.picasso.c next = it2.next();
                boolean z11 = next.q().f20750n;
                com.squareup.picasso.a h11 = next.h();
                List<com.squareup.picasso.a> i11 = next.i();
                boolean z12 = (i11 == null || i11.isEmpty()) ? false : true;
                if (h11 != null || z12) {
                    if (h11 != null && h11.j().equals(obj)) {
                        next.f(h11);
                        this.f20705g.put(h11.k(), h11);
                        if (z11) {
                            d0.t("Dispatcher", "paused", h11.f20617b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z12) {
                        for (int size = i11.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = i11.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f20705g.put(aVar.k(), aVar);
                                if (z11) {
                                    d0.t("Dispatcher", "paused", aVar.f20617b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it2.remove();
                        if (z11) {
                            d0.t("Dispatcher", "canceled", d0.j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.f20706h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<com.squareup.picasso.a> it2 = this.f20705g.values().iterator();
            while (it2.hasNext()) {
                com.squareup.picasso.a next = it2.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it2.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f20708j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void u(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        boolean z11 = false;
        if (this.f20701c.isShutdown()) {
            q(cVar, false);
            return;
        }
        if (cVar.w(this.f20714p, this.f20713o ? ((ConnectivityManager) d0.n(this.f20700b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.q().f20750n) {
                d0.s("Dispatcher", "retrying", d0.j(cVar));
            }
            if (cVar.k() instanceof r.a) {
                cVar.f20674i |= q.NO_CACHE.index;
            }
            cVar.f20679n = this.f20701c.submit(cVar);
            return;
        }
        if (this.f20713o && cVar.x()) {
            z11 = true;
        }
        q(cVar, z11);
        if (z11) {
            l(cVar);
        }
    }

    void v(com.squareup.picasso.a aVar) {
        w(aVar, true);
    }

    void w(com.squareup.picasso.a aVar, boolean z11) {
        if (this.f20706h.contains(aVar.j())) {
            this.f20705g.put(aVar.k(), aVar);
            if (aVar.g().f20750n) {
                String d11 = aVar.f20617b.d();
                d0.t("Dispatcher", "paused", d11, "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.f20703e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
        } else if (this.f20701c.isShutdown()) {
            if (aVar.g().f20750n) {
                d0.t("Dispatcher", "ignored", aVar.f20617b.d(), "because shut down");
            }
        } else {
            com.squareup.picasso.c g11 = com.squareup.picasso.c.g(aVar.g(), this, this.f20709k, this.f20710l, aVar);
            g11.f20679n = this.f20701c.submit(g11);
            this.f20703e.put(aVar.d(), g11);
            if (z11) {
                this.f20704f.remove(aVar.k());
            }
            if (aVar.g().f20750n) {
                d0.s("Dispatcher", "enqueued", aVar.f20617b.d());
            }
        }
    }
}