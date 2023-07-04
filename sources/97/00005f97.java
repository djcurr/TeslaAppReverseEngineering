package com.tesla.analytics;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import es.c;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import jt.d;
import jt.f;
import jt.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.r0;
import wz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\t"}, d2 = {"Lcom/tesla/analytics/TeslaAnalyticsService;", "Les/c;", "Landroidx/lifecycle/u;", "Lvz/b0;", "onResumed", "onAppBackgrounded", "<init>", "()V", "a", "analytics_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TeslaAnalyticsService implements c, u {

    /* renamed from: f  reason: collision with root package name */
    private static final g f21454f;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentLinkedDeque<jt.c> f21455a = new ConcurrentLinkedDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentLinkedDeque<es.a> f21456b = new ConcurrentLinkedDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f21457c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private Long f21458d;

    /* renamed from: e  reason: collision with root package name */
    private UUID f21459e;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f21454f = g.f21878b.a("TeslaAnalyticsService");
    }

    public TeslaAnalyticsService() {
        UUID randomUUID = UUID.randomUUID();
        s.f(randomUUID, "randomUUID()");
        this.f21459e = randomUUID;
    }

    private final void h() {
        Long l11 = this.f21458d;
        if (l11 == null) {
            return;
        }
        if (System.currentTimeMillis() - l11.longValue() > AbstractComponentTracker.LINGERING_TIMEOUT) {
            f21454f.i("We've been in the background for longer than 10 seconds, rotating session id.");
            UUID randomUUID = UUID.randomUUID();
            s.f(randomUUID, "randomUUID()");
            this.f21459e = randomUUID;
            i();
        }
    }

    private final void i() {
        List<f> d11;
        jt.g gVar = jt.g.FOREGROUND_SESSION_ID;
        String uuid = this.f21459e.toString();
        s.f(uuid, "sessionId.toString()");
        f fVar = new f(gVar, null, null, null, new h(uuid, null, 2, null), null, 46, null);
        g gVar2 = f21454f;
        gVar2.i("Setting default event parameter " + fVar);
        for (es.a aVar : this.f21456b) {
            d11 = v.d(fVar);
            aVar.b(d11);
        }
    }

    @Override // es.c
    public void a(d eventName, List<f> parameters) {
        s.g(eventName, "eventName");
        s.g(parameters, "parameters");
        f(new jt.c(eventName, parameters, null, 4, null));
    }

    @Override // es.c
    public void b(es.a destination) {
        Map f11;
        s.g(destination, "destination");
        if (this.f21457c.get()) {
            g gVar = f21454f;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, "Destination cannot be added because service is initialized"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Destination cannot be added because service is initialized"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("Destination cannot be added because service is initialized", new Object[0]);
            return;
        }
        this.f21456b.add(destination);
        i();
    }

    @Override // es.c
    public void d(d eventName) {
        s.g(eventName, "eventName");
        f(new jt.c(eventName, null, null, 6, null));
    }

    @Override // es.c
    public void e() {
        if (this.f21457c.getAndSet(true)) {
            return;
        }
        ProcessLifecycleOwner.h().getLifecycle().a(this);
        g gVar = f21454f;
        p.c b11 = ProcessLifecycleOwner.h().getLifecycle().b();
        gVar.i("currentState: " + b11);
        ConcurrentLinkedDeque<jt.c> concurrentLinkedDeque = this.f21455a;
        for (jt.c it2 : concurrentLinkedDeque) {
            s.f(it2, "it");
            f(it2);
        }
        concurrentLinkedDeque.clear();
    }

    public void f(jt.c event) {
        s.g(event, "event");
        synchronized (this) {
            try {
                if (this.f21457c.get()) {
                    for (es.a aVar : this.f21456b) {
                        aVar.a(event);
                    }
                    b0 b0Var = b0.f54756a;
                } else {
                    this.f21455a.add(event);
                }
            } catch (Exception e11) {
                f21454f.d("Error recording analytics event", e11);
                b0 b0Var2 = b0.f54756a;
            }
        }
    }

    @h0(p.b.ON_PAUSE)
    public final void onAppBackgrounded() {
        f21454f.i("ON_PAUSE");
        synchronized (this) {
            this.f21458d = Long.valueOf(System.currentTimeMillis());
            b0 b0Var = b0.f54756a;
        }
    }

    @h0(p.b.ON_RESUME)
    public final void onResumed() {
        f21454f.i("ON_RESUME");
        synchronized (this) {
            h();
            this.f21458d = null;
            b0 b0Var = b0.f54756a;
        }
    }
}