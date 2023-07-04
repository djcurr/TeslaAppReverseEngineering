package com.adyen.threeds2.internal;

import android.os.Handler;
import android.os.Looper;
import com.adyen.threeds2.CompletionEvent;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f implements atd.a.c<atd.d.j> {

    /* renamed from: i  reason: collision with root package name */
    private static f f9633i;

    /* renamed from: a  reason: collision with root package name */
    private atd.b.b f9634a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f9635b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f9636c;

    /* renamed from: d  reason: collision with root package name */
    private atd.d.i f9637d;

    /* renamed from: e  reason: collision with root package name */
    private atd.d.j f9638e;

    /* renamed from: f  reason: collision with root package name */
    private com.adyen.threeds2.internal.a f9639f;

    /* renamed from: g  reason: collision with root package name */
    private atd.d.b f9640g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9641h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v3.a<atd.d.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.d.e f9642a;

        a(atd.d.e eVar) {
            this.f9642a = eVar;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            f.this.a((ProtocolErrorEvent) new atd.z.c(iVar.f(), new atd.z.b(iVar.f(), this.f9642a.g(), this.f9642a.h(), this.f9642a.i())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9644a;

        static {
            int[] iArr = new int[atd.e.d.values().length];
            f9644a = iArr;
            try {
                iArr[atd.e.d.CHALLENGE_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9644a[atd.e.d.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements v3.a<atd.d.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.e.c f9645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9646b;

        c(atd.e.c cVar, String str) {
            this.f9645a = cVar;
            this.f9646b = str;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            f.this.a((atd.d.i) this.f9645a.a(iVar, this.f9646b));
        }
    }

    /* loaded from: classes.dex */
    class d implements v3.a<atd.d.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.e.c f9648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9649b;

        d(atd.e.c cVar, String str) {
            this.f9648a = cVar;
            this.f9649b = str;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            f.this.a(this.f9648a.a(iVar.f(), this.f9649b));
        }
    }

    /* loaded from: classes.dex */
    class e implements v3.a<atd.d.j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.c.c f9651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9652b;

        e(atd.c.c cVar, String str) {
            this.f9651a = cVar;
            this.f9652b = str;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.j jVar) {
            f.this.a((atd.d.i) new atd.d.b(f.this.f9640g.d(), f.this.f9640g.h(), f.this.f9640g.b(), f.this.f9640g.f(), f.this.f9640g.g(), this.f9651a, this.f9652b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adyen.threeds2.internal.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0185f implements v3.a<atd.d.i> {
        C0185f() {
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            f.this.a((atd.d.i) atd.e.c.TRANSACTION_TIMED_OUT.a(iVar, atd.s0.a.a(-103975527180864L)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements v3.a<AtomicInteger> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.d.i f9655a;

        g(f fVar, atd.d.i iVar) {
            this.f9655a = iVar;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(AtomicInteger atomicInteger) {
            this.f9655a.a(atomicInteger.getAndIncrement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements v3.a<atd.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.d.i f9656a;

        h(f fVar, atd.d.i iVar) {
            this.f9656a = iVar;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.b.b bVar) {
            bVar.a(this.f9656a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements v3.a<atd.d.i> {
        i() {
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            f.this.a(atd.e.c.MESSAGE_RECEIVED_INVALID.a(iVar.f(), atd.s0.a.a(-104233225218624L)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements v3.a<atd.d.i> {
        j() {
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            if (atd.e.d.ERROR.equals(iVar.c())) {
                f.this.a((CompletionEvent) new atd.z.a(iVar.f(), atd.e.e.Y.a()));
            } else {
                f.this.a(atd.e.c.MESSAGE_RECEIVED_INVALID.a(iVar.f(), atd.s0.a.a(-103357051890240L)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements v3.a<atd.d.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.d.c f9659a;

        k(atd.d.c cVar) {
            this.f9659a = cVar;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(atd.d.i iVar) {
            if (!iVar.d().equals(this.f9659a.c())) {
                f.this.a(atd.y.b.MESSAGE_VERSIONS_MISMATCH.a());
            } else if (iVar.e() != this.f9659a.g()) {
                f.this.a(atd.y.b.MESSAGE_INDICES_MISMATCH.a());
            } else if (this.f9659a.j()) {
                if (f.this.g()) {
                    f.this.a();
                } else {
                    f.this.a((CompletionEvent) new atd.z.a(this.f9659a.d(), this.f9659a.i()));
                }
            } else {
                f.this.a(this.f9659a.h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class l extends TimerTask {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a(l lVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.d().h();
            }
        }

        l() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            new Handler(Looper.getMainLooper()).post(new a(this));
        }
    }

    private f() {
    }

    private com.adyen.threeds2.internal.a c() {
        if (this.f9641h) {
            return this.f9639f;
        }
        return null;
    }

    public static synchronized f d() {
        f fVar;
        synchronized (f.class) {
            if (f9633i == null) {
                f9633i = new f();
            }
            fVar = f9633i;
        }
        return fVar;
    }

    private void e() {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.a();
        }
    }

    private void f() {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.timedout();
        }
    }

    private boolean i() {
        if (this.f9641h) {
            return false;
        }
        atd.s0.a.a(-103666289535552L);
        return true;
    }

    @Override // atd.a.c
    /* renamed from: b */
    public void a(atd.d.j jVar) {
        a2(jVar);
    }

    boolean g() {
        atd.d.i iVar = this.f9637d;
        if (iVar instanceof atd.d.b) {
            return ((atd.d.b) iVar).j() instanceof atd.c.b;
        }
        return false;
    }

    void h() {
        if (i()) {
            return;
        }
        a((f) this.f9637d, (v3.a<f>) new C0185f());
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        if (i()) {
            return;
        }
        this.f9634a = null;
        this.f9635b = null;
        Timer timer = this.f9636c;
        if (timer != null) {
            timer.cancel();
            this.f9636c = null;
        }
        this.f9637d = null;
        this.f9638e = null;
        if (this.f9639f != null) {
            this.f9639f = null;
        }
        this.f9640g = null;
        this.f9641h = false;
    }

    @Override // atd.a.c
    public void a(Throwable th2, String str) {
        if (th2 instanceof atd.a0.a) {
            atd.a0.a aVar = (atd.a0.a) th2;
            atd.e.c b11 = aVar.b();
            String a11 = aVar.a();
            atd.e.c cVar = atd.e.c.SYSTEM_CONNECTION_FAILURE;
            if (!cVar.equals(b11) && !a(aVar)) {
                a((f) this.f9637d, (v3.a<f>) new c(b11, a11));
            }
            if (!atd.e.c.TRANSACTION_TIMED_OUT.equals(b11) && !cVar.equals(b11)) {
                a((f) this.f9637d, (v3.a<f>) new d(b11, a11));
                return;
            } else {
                a(b11.a(a11));
                return;
            }
        }
        a(atd.y.b.UNKNOWN.a(str + atd.s0.a.a(-103829498292800L) + th2.getLocalizedMessage()));
    }

    private boolean a(atd.a0.a aVar) {
        return aVar.b().equals(atd.e.c.DATA_ELEMENT_INVALID_FORMAT) && aVar.a().contains(atd.s0.a.a(-103820908358208L));
    }

    public void a(atd.c.c cVar, String str) {
        if (i()) {
            return;
        }
        a((f) this.f9638e, (v3.a<f>) new e(cVar, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, atd.f0.a aVar, atd.d.b bVar, int i11, com.adyen.threeds2.internal.a aVar2) {
        a(str, aVar, i11, aVar2);
        this.f9640g = bVar;
        a((atd.d.i) bVar);
    }

    private <T> void a(T t11, v3.a<T> aVar) {
        if (t11 != null) {
            aVar.accept(t11);
        }
    }

    private synchronized void a(String str, atd.f0.a aVar, int i11, com.adyen.threeds2.internal.a aVar2) {
        this.f9634a = new atd.b.b(str, aVar, this);
        this.f9639f = aVar2;
        this.f9635b = new AtomicInteger();
        Timer timer = new Timer();
        this.f9636c = timer;
        timer.schedule(new l(), TimeUnit.MINUTES.toMillis(i11));
        this.f9641h = true;
    }

    void a() {
        com.adyen.threeds2.internal.a c11;
        if (i() || (c11 = c()) == null) {
            return;
        }
        c11.cancelled();
    }

    void a(atd.d.i iVar) {
        if (i()) {
            return;
        }
        if (iVar instanceof atd.d.b) {
            e();
        }
        a((f) this.f9635b, (v3.a<f>) new g(this, iVar));
        this.f9637d = iVar;
        a((f) this.f9634a, (v3.a<f>) new h(this, iVar));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(atd.d.j jVar) {
        if (i()) {
            return;
        }
        if (jVar != null) {
            this.f9638e = jVar;
            int i11 = b.f9644a[jVar.b().ordinal()];
            if (i11 == 1) {
                a((atd.d.c) jVar);
                return;
            } else if (i11 != 2) {
                a((f) this.f9637d, (v3.a<f>) new i());
                return;
            } else {
                a((atd.d.e) jVar);
                return;
            }
        }
        a((f) this.f9637d, (v3.a<f>) new j());
    }

    private void a(atd.d.c cVar) {
        a((f) this.f9637d, (v3.a<f>) new k(cVar));
    }

    private void a(atd.d.e eVar) {
        a((f) this.f9637d, (v3.a<f>) new a(eVar));
    }

    void a(atd.d.a aVar) {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.a(aVar);
        }
    }

    void a(CompletionEvent completionEvent) {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.completed(completionEvent);
        }
    }

    void a(ProtocolErrorEvent protocolErrorEvent) {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.protocolError(protocolErrorEvent);
        }
    }

    void a(RuntimeErrorEvent runtimeErrorEvent) {
        com.adyen.threeds2.internal.a c11 = c();
        if (c11 != null) {
            c11.runtimeError(runtimeErrorEvent);
        }
    }
}