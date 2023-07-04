package qm;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import qm.k;
import r3.n;
import ul.q;

/* loaded from: classes3.dex */
public class g implements j, k {

    /* renamed from: f */
    private static final ThreadFactory f48367f = new ThreadFactory() { // from class: qm.d
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return g.f(runnable);
        }
    };

    /* renamed from: a */
    private final sm.b<l> f48368a;

    /* renamed from: b */
    private final Context f48369b;

    /* renamed from: c */
    private final sm.b<ln.i> f48370c;

    /* renamed from: d */
    private final Set<h> f48371d;

    /* renamed from: e */
    private final Executor f48372e;

    private g(final Context context, final String str, Set<h> set, sm.b<ln.i> bVar) {
        this(new sm.b() { // from class: qm.e
            @Override // sm.b
            public final Object get() {
                return g.c(context, str);
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f48367f), bVar, context);
    }

    public static /* synthetic */ l c(Context context, String str) {
        return k(context, str);
    }

    public static /* synthetic */ g d(ul.e eVar) {
        return i(eVar);
    }

    public static /* synthetic */ String e(g gVar) {
        return gVar.j();
    }

    public static /* synthetic */ Thread f(Runnable runnable) {
        return m(runnable);
    }

    public static /* synthetic */ Void g(g gVar) {
        return gVar.l();
    }

    public static ul.d<g> h() {
        return ul.d.d(g.class, j.class, k.class).b(q.j(Context.class)).b(q.j(com.google.firebase.d.class)).b(q.l(h.class)).b(q.k(ln.i.class)).f(new ul.h() { // from class: qm.f
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return g.d(eVar);
            }
        }).d();
    }

    public static /* synthetic */ g i(ul.e eVar) {
        return new g((Context) eVar.a(Context.class), ((com.google.firebase.d) eVar.a(com.google.firebase.d.class)).n(), eVar.c(h.class), eVar.d(ln.i.class));
    }

    public /* synthetic */ String j() {
        String byteArrayOutputStream;
        synchronized (this) {
            l lVar = this.f48368a.get();
            List<m> c11 = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < c11.size(); i11++) {
                m mVar = c11.get(i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ l k(Context context, String str) {
        return new l(context, str);
    }

    public /* synthetic */ Void l() {
        synchronized (this) {
            this.f48368a.get().k(System.currentTimeMillis(), this.f48370c.get().a());
        }
        return null;
    }

    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // qm.j
    public Task<String> a() {
        if (!n.a(this.f48369b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f48372e, new Callable() { // from class: qm.b
            {
                g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.e(g.this);
            }
        });
    }

    @Override // qm.k
    public synchronized k.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.f48368a.get();
        if (lVar.i(currentTimeMillis)) {
            lVar.g();
            return k.a.GLOBAL;
        }
        return k.a.NONE;
    }

    public Task<Void> n() {
        if (this.f48371d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!n.a(this.f48369b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f48372e, new Callable() { // from class: qm.c
            {
                g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.g(g.this);
            }
        });
    }

    g(sm.b<l> bVar, Set<h> set, Executor executor, sm.b<ln.i> bVar2, Context context) {
        this.f48368a = bVar;
        this.f48371d = set;
        this.f48372e = executor;
        this.f48370c = bVar2;
        this.f48369b = context;
    }
}