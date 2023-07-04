package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.q;
import d5.i;
import java.util.ArrayList;
import java.util.List;
import l5.g;
import l5.l;
import l5.p;

/* loaded from: classes.dex */
public class e implements d5.b {

    /* renamed from: k  reason: collision with root package name */
    static final String f6596k = q.f("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f6597a;

    /* renamed from: b  reason: collision with root package name */
    private final m5.a f6598b;

    /* renamed from: c  reason: collision with root package name */
    private final p f6599c;

    /* renamed from: d  reason: collision with root package name */
    private final d5.d f6600d;

    /* renamed from: e  reason: collision with root package name */
    private final i f6601e;

    /* renamed from: f  reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f6602f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f6603g;

    /* renamed from: h  reason: collision with root package name */
    final List<Intent> f6604h;

    /* renamed from: i  reason: collision with root package name */
    Intent f6605i;

    /* renamed from: j  reason: collision with root package name */
    private c f6606j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f6604h) {
                e eVar2 = e.this;
                eVar2.f6605i = eVar2.f6604h.get(0);
            }
            Intent intent = e.this.f6605i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f6605i.getIntExtra("KEY_START_ID", 0);
                q c11 = q.c();
                String str = e.f6596k;
                c11.a(str, String.format("Processing command %s, %s", e.this.f6605i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b11 = l.b(e.this.f6597a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    q.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b11), new Throwable[0]);
                    b11.acquire();
                    e eVar3 = e.this;
                    eVar3.f6602f.p(eVar3.f6605i, intExtra, eVar3);
                    q.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b11), new Throwable[0]);
                    b11.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th2) {
                    try {
                        q c12 = q.c();
                        String str2 = e.f6596k;
                        c12.b(str2, "Unexpected error in onHandleIntent", th2);
                        q.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b11), new Throwable[0]);
                        b11.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th3) {
                        q.c().a(e.f6596k, String.format("Releasing operation wake lock (%s) %s", action, b11), new Throwable[0]);
                        b11.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th3;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f6608a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f6609b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6610c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(e eVar, Intent intent, int i11) {
            this.f6608a = eVar;
            this.f6609b = intent;
            this.f6610c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6608a.a(this.f6609b, this.f6610c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f6611a;

        d(e eVar) {
            this.f6611a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6611a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f6603g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f6604h) {
            for (Intent intent : this.f6604h) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b11 = l.b(this.f6597a, "ProcessCommand");
        try {
            b11.acquire();
            this.f6601e.w().b(new a());
        } finally {
            b11.release();
        }
    }

    public boolean a(Intent intent, int i11) {
        q c11 = q.c();
        String str = f6596k;
        c11.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i11)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i11);
            synchronized (this.f6604h) {
                boolean z11 = this.f6604h.isEmpty() ? false : true;
                this.f6604h.add(intent);
                if (!z11) {
                    l();
                }
            }
            return true;
        }
    }

    void c() {
        q c11 = q.c();
        String str = f6596k;
        c11.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f6604h) {
            if (this.f6605i != null) {
                q.c().a(str, String.format("Removing command %s", this.f6605i), new Throwable[0]);
                if (this.f6604h.remove(0).equals(this.f6605i)) {
                    this.f6605i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c12 = this.f6598b.c();
            if (!this.f6602f.o() && this.f6604h.isEmpty() && !c12.a()) {
                q.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f6606j;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f6604h.isEmpty()) {
                l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5.d d() {
        return this.f6600d;
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f6597a, str, z11), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m5.a f() {
        return this.f6598b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i g() {
        return this.f6601e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p h() {
        return this.f6599c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        q.c().a(f6596k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f6600d.i(this);
        this.f6599c.a();
        this.f6606j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f6603g.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f6606j != null) {
            q.c().b(f6596k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f6606j = cVar;
        }
    }

    e(Context context, d5.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6597a = applicationContext;
        this.f6602f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f6599c = new p();
        iVar = iVar == null ? i.r(context) : iVar;
        this.f6601e = iVar;
        dVar = dVar == null ? iVar.t() : dVar;
        this.f6600d = dVar;
        this.f6598b = iVar.w();
        dVar.c(this);
        this.f6604h = new ArrayList();
        this.f6605i = null;
        this.f6603g = new Handler(Looper.getMainLooper());
    }
}