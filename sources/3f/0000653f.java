package d5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import d5.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l5.l;

/* loaded from: classes.dex */
public class d implements b, j5.a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f23612l = q.f("Processor");

    /* renamed from: b  reason: collision with root package name */
    private Context f23614b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.b f23615c;

    /* renamed from: d  reason: collision with root package name */
    private m5.a f23616d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f23617e;

    /* renamed from: h  reason: collision with root package name */
    private List<e> f23620h;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, j> f23619g = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, j> f23618f = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f23621i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f23622j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f23613a = null;

    /* renamed from: k  reason: collision with root package name */
    private final Object f23623k = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f23624a;

        /* renamed from: b  reason: collision with root package name */
        private String f23625b;

        /* renamed from: c  reason: collision with root package name */
        private com.google.common.util.concurrent.c<Boolean> f23626c;

        a(b bVar, String str, com.google.common.util.concurrent.c<Boolean> cVar) {
            this.f23624a = bVar;
            this.f23625b = str;
            this.f23626c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                z11 = this.f23626c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z11 = true;
            }
            this.f23624a.e(this.f23625b, z11);
        }
    }

    public d(Context context, androidx.work.b bVar, m5.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f23614b = context;
        this.f23615c = bVar;
        this.f23616d = aVar;
        this.f23617e = workDatabase;
        this.f23620h = list;
    }

    private static boolean d(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            q.c().a(f23612l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        q.c().a(f23612l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.f23623k) {
            if (!(!this.f23618f.isEmpty())) {
                this.f23614b.startService(androidx.work.impl.foreground.a.d(this.f23614b));
                PowerManager.WakeLock wakeLock = this.f23613a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f23613a = null;
                }
            }
        }
    }

    @Override // j5.a
    public void a(String str) {
        synchronized (this.f23623k) {
            this.f23618f.remove(str);
            m();
        }
    }

    @Override // j5.a
    public void b(String str, androidx.work.i iVar) {
        synchronized (this.f23623k) {
            q.c().d(f23612l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.f23619g.remove(str);
            if (remove != null) {
                if (this.f23613a == null) {
                    PowerManager.WakeLock b11 = l.b(this.f23614b, "ProcessorForegroundLck");
                    this.f23613a = b11;
                    b11.acquire();
                }
                this.f23618f.put(str, remove);
                androidx.core.content.b.startForegroundService(this.f23614b, androidx.work.impl.foreground.a.c(this.f23614b, str, iVar));
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f23623k) {
            this.f23622j.add(bVar);
        }
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        synchronized (this.f23623k) {
            this.f23619g.remove(str);
            q.c().a(f23612l, String.format("%s %s executed; reschedule = %s", d.class.getSimpleName(), str, Boolean.valueOf(z11)), new Throwable[0]);
            for (b bVar : this.f23622j) {
                bVar.e(str, z11);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f23623k) {
            contains = this.f23621i.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z11;
        synchronized (this.f23623k) {
            z11 = this.f23619g.containsKey(str) || this.f23618f.containsKey(str);
        }
        return z11;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f23623k) {
            containsKey = this.f23618f.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f23623k) {
            this.f23622j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f23623k) {
            if (g(str)) {
                q.c().a(f23612l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a11 = new j.c(this.f23614b, this.f23615c, this.f23616d, this, this.f23617e, str).c(this.f23620h).b(aVar).a();
            com.google.common.util.concurrent.c<Boolean> b11 = a11.b();
            b11.a(new a(this, str, b11), this.f23616d.a());
            this.f23619g.put(str, a11);
            this.f23616d.c().execute(a11);
            q.c().a(f23612l, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean d11;
        synchronized (this.f23623k) {
            boolean z11 = true;
            q.c().a(f23612l, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f23621i.add(str);
            j remove = this.f23618f.remove(str);
            if (remove == null) {
                z11 = false;
            }
            if (remove == null) {
                remove = this.f23619g.remove(str);
            }
            d11 = d(str, remove);
            if (z11) {
                m();
            }
        }
        return d11;
    }

    public boolean n(String str) {
        boolean d11;
        synchronized (this.f23623k) {
            q.c().a(f23612l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            d11 = d(str, this.f23618f.remove(str));
        }
        return d11;
    }

    public boolean o(String str) {
        boolean d11;
        synchronized (this.f23623k) {
            q.c().a(f23612l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            d11 = d(str, this.f23619g.remove(str));
        }
        return d11;
    }
}