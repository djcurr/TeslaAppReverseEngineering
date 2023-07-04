package e5;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a0;
import androidx.work.q;
import d5.e;
import d5.i;
import g5.c;
import g5.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k5.p;
import l5.f;

/* loaded from: classes.dex */
public class b implements e, c, d5.b {

    /* renamed from: i  reason: collision with root package name */
    private static final String f24646i = q.f("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f24647a;

    /* renamed from: b  reason: collision with root package name */
    private final i f24648b;

    /* renamed from: c  reason: collision with root package name */
    private final d f24649c;

    /* renamed from: e  reason: collision with root package name */
    private a f24651e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24652f;

    /* renamed from: h  reason: collision with root package name */
    Boolean f24654h;

    /* renamed from: d  reason: collision with root package name */
    private final Set<p> f24650d = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f24653g = new Object();

    public b(Context context, androidx.work.b bVar, m5.a aVar, i iVar) {
        this.f24647a = context;
        this.f24648b = iVar;
        this.f24649c = new d(context, aVar, this);
        this.f24651e = new a(this, bVar.k());
    }

    private void g() {
        this.f24654h = Boolean.valueOf(f.b(this.f24647a, this.f24648b.p()));
    }

    private void h() {
        if (this.f24652f) {
            return;
        }
        this.f24648b.t().c(this);
        this.f24652f = true;
    }

    private void i(String str) {
        synchronized (this.f24653g) {
            Iterator<p> it2 = this.f24650d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                p next = it2.next();
                if (next.f34405a.equals(str)) {
                    q.c().a(f24646i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f24650d.remove(next);
                    this.f24649c.d(this.f24650d);
                    break;
                }
            }
        }
    }

    @Override // d5.e
    public void a(String str) {
        if (this.f24654h == null) {
            g();
        }
        if (!this.f24654h.booleanValue()) {
            q.c().d(f24646i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        q.c().a(f24646i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f24651e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f24648b.E(str);
    }

    @Override // g5.c
    public void b(List<String> list) {
        for (String str : list) {
            q.c().a(f24646i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f24648b.E(str);
        }
    }

    @Override // d5.e
    public void c(p... pVarArr) {
        if (this.f24654h == null) {
            g();
        }
        if (!this.f24654h.booleanValue()) {
            q.c().d(f24646i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a11 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f34406b == a0.a.ENQUEUED) {
                if (currentTimeMillis < a11) {
                    a aVar = this.f24651e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 23 && pVar.f34414j.h()) {
                        q.c().a(f24646i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i11 >= 24 && pVar.f34414j.e()) {
                        q.c().a(f24646i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f34405a);
                    }
                } else {
                    q.c().a(f24646i, String.format("Starting work for %s", pVar.f34405a), new Throwable[0]);
                    this.f24648b.B(pVar.f34405a);
                }
            }
        }
        synchronized (this.f24653g) {
            if (!hashSet.isEmpty()) {
                q.c().a(f24646i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f24650d.addAll(hashSet);
                this.f24649c.d(this.f24650d);
            }
        }
    }

    @Override // d5.e
    public boolean d() {
        return false;
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        i(str);
    }

    @Override // g5.c
    public void f(List<String> list) {
        for (String str : list) {
            q.c().a(f24646i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f24648b.B(str);
        }
    }
}