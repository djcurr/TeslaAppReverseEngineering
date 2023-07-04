package i5;

import android.content.Context;
import androidx.work.q;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f29886f = q.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final m5.a f29887a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f29888b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f29889c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<g5.a<T>> f29890d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f29891e;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f29892a;

        a(List list) {
            this.f29892a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (g5.a aVar : this.f29892a) {
                aVar.a(d.this.f29891e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, m5.a aVar) {
        this.f29888b = context.getApplicationContext();
        this.f29887a = aVar;
    }

    public void a(g5.a<T> aVar) {
        synchronized (this.f29889c) {
            if (this.f29890d.add(aVar)) {
                if (this.f29890d.size() == 1) {
                    this.f29891e = b();
                    q.c().a(f29886f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f29891e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f29891e);
            }
        }
    }

    public abstract T b();

    public void c(g5.a<T> aVar) {
        synchronized (this.f29889c) {
            if (this.f29890d.remove(aVar) && this.f29890d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t11) {
        synchronized (this.f29889c) {
            T t12 = this.f29891e;
            if (t12 != t11 && (t12 == null || !t12.equals(t11))) {
                this.f29891e = t11;
                this.f29887a.a().execute(new a(new ArrayList(this.f29890d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}