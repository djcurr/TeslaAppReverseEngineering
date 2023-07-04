package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f5485h = new c();

    /* renamed from: a  reason: collision with root package name */
    private final r f5486a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f5487b;

    /* renamed from: c  reason: collision with root package name */
    Executor f5488c;

    /* renamed from: e  reason: collision with root package name */
    private List<T> f5490e;

    /* renamed from: g  reason: collision with root package name */
    int f5492g;

    /* renamed from: d  reason: collision with root package name */
    private final List<b<T>> f5489d = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<T> f5491f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f5493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f5494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f5496d;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0092a extends h.b {
            C0092a() {
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i11, int i12) {
                Object obj = a.this.f5493a.get(i11);
                Object obj2 = a.this.f5494b.get(i12);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return d.this.f5487b.b().areContentsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i11, int i12) {
                Object obj = a.this.f5493a.get(i11);
                Object obj2 = a.this.f5494b.get(i12);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f5487b.b().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i11, int i12) {
                Object obj = a.this.f5493a.get(i11);
                Object obj2 = a.this.f5494b.get(i12);
                if (obj != null && obj2 != null) {
                    return d.this.f5487b.b().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f5494b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f5493a.size();
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.e f5499a;

            b(h.e eVar) {
                this.f5499a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f5492g == aVar.f5495c) {
                    dVar.c(aVar.f5494b, this.f5499a, aVar.f5496d);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f5493a = list;
            this.f5494b = list2;
            this.f5495c = i11;
            this.f5496d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f5488c.execute(new b(h.b(new C0092a())));
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* loaded from: classes.dex */
    private static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Handler f5501a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f5501a.post(runnable);
        }
    }

    public d(r rVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f5486a = rVar;
        this.f5487b = cVar;
        if (cVar.c() != null) {
            this.f5488c = cVar.c();
        } else {
            this.f5488c = f5485h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        for (b<T> bVar : this.f5489d) {
            bVar.a(list, this.f5491f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f5489d.add(bVar);
    }

    public List<T> b() {
        return this.f5491f;
    }

    void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f5491f;
        this.f5490e = list;
        this.f5491f = Collections.unmodifiableList(list);
        eVar.b(this.f5486a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i11 = this.f5492g + 1;
        this.f5492g = i11;
        List<T> list2 = this.f5490e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f5491f;
        if (list == null) {
            int size = list2.size();
            this.f5490e = null;
            this.f5491f = Collections.emptyList();
            this.f5486a.b(0, size);
            d(list3, runnable);
        } else if (list2 == null) {
            this.f5490e = list;
            this.f5491f = Collections.unmodifiableList(list);
            this.f5486a.a(0, list.size());
            d(list3, runnable);
        } else {
            this.f5487b.a().execute(new a(list2, list, i11, runnable));
        }
    }
}