package g5;

import android.content.Context;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.q;
import h5.c;
import h5.e;
import h5.f;
import h5.g;
import h5.h;
import java.util.ArrayList;
import java.util.List;
import k5.p;

/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f27771d = q.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f27772a;

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintController<?>[] f27773b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f27774c;

    public d(Context context, m5.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f27772a = cVar;
        this.f27773b = new h5.c[]{new h5.a(applicationContext, aVar), new h5.b(applicationContext, aVar), new h(applicationContext, aVar), new h5.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f27774c = new Object();
    }

    @Override // h5.c.a
    public void a(List<String> list) {
        synchronized (this.f27774c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    q.c().a(f27771d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f27772a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // h5.c.a
    public void b(List<String> list) {
        synchronized (this.f27774c) {
            c cVar = this.f27772a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        h5.c[] cVarArr;
        synchronized (this.f27774c) {
            for (h5.c cVar : this.f27773b) {
                if (cVar.d(str)) {
                    q.c().a(f27771d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f27774c) {
            for (h5.c cVar : this.f27773b) {
                cVar.g(null);
            }
            for (h5.c cVar2 : this.f27773b) {
                cVar2.e(iterable);
            }
            for (h5.c cVar3 : this.f27773b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f27774c) {
            for (h5.c cVar : this.f27773b) {
                cVar.f();
            }
        }
    }
}