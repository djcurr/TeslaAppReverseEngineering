package e5;

import androidx.work.q;
import androidx.work.y;
import java.util.HashMap;
import java.util.Map;
import k5.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f24640d = q.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f24641a;

    /* renamed from: b  reason: collision with root package name */
    private final y f24642b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f24643c = new HashMap();

    /* renamed from: e5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0479a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f24644a;

        RunnableC0479a(p pVar) {
            this.f24644a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.c().a(a.f24640d, String.format("Scheduling work %s", this.f24644a.f34405a), new Throwable[0]);
            a.this.f24641a.c(this.f24644a);
        }
    }

    public a(b bVar, y yVar) {
        this.f24641a = bVar;
        this.f24642b = yVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f24643c.remove(pVar.f34405a);
        if (remove != null) {
            this.f24642b.a(remove);
        }
        RunnableC0479a runnableC0479a = new RunnableC0479a(pVar);
        this.f24643c.put(pVar.f34405a, runnableC0479a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f24642b.b(pVar.a() - currentTimeMillis, runnableC0479a);
    }

    public void b(String str) {
        Runnable remove = this.f24643c.remove(str);
        if (remove != null) {
            this.f24642b.a(remove);
        }
    }
}