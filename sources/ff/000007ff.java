package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    final androidx.collection.g<RecyclerView.e0, a> f5470a = new androidx.collection.g<>();

    /* renamed from: b  reason: collision with root package name */
    final androidx.collection.d<RecyclerView.e0> f5471b = new androidx.collection.d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static v3.f<a> f5472d = new Pools$SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f5473a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f5474b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f5475c;

        private a() {
        }

        static void a() {
            do {
            } while (f5472d.b() != null);
        }

        static a b() {
            a b11 = f5472d.b();
            return b11 == null ? new a() : b11;
        }

        static void c(a aVar) {
            aVar.f5473a = 0;
            aVar.f5474b = null;
            aVar.f5475c = null;
            f5472d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.e0 e0Var);

        void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    private RecyclerView.m.c l(RecyclerView.e0 e0Var, int i11) {
        a o11;
        RecyclerView.m.c cVar;
        int h11 = this.f5470a.h(e0Var);
        if (h11 >= 0 && (o11 = this.f5470a.o(h11)) != null) {
            int i12 = o11.f5473a;
            if ((i12 & i11) != 0) {
                int i13 = (~i11) & i12;
                o11.f5473a = i13;
                if (i11 == 4) {
                    cVar = o11.f5474b;
                } else if (i11 == 8) {
                    cVar = o11.f5475c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i13 & 12) == 0) {
                    this.f5470a.m(h11);
                    a.c(o11);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f5470a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5470a.put(e0Var, aVar);
        }
        aVar.f5473a |= 2;
        aVar.f5474b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.e0 e0Var) {
        a aVar = this.f5470a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5470a.put(e0Var, aVar);
        }
        aVar.f5473a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j11, RecyclerView.e0 e0Var) {
        this.f5471b.j(j11, e0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f5470a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5470a.put(e0Var, aVar);
        }
        aVar.f5475c = cVar;
        aVar.f5473a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f5470a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5470a.put(e0Var, aVar);
        }
        aVar.f5474b = cVar;
        aVar.f5473a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f5470a.clear();
        this.f5471b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.e0 g(long j11) {
        return this.f5471b.f(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f5470a.get(e0Var);
        return (aVar == null || (aVar.f5473a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f5470a.get(e0Var);
        return (aVar == null || (aVar.f5473a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f5470a.size() - 1; size >= 0; size--) {
            RecyclerView.e0 k11 = this.f5470a.k(size);
            a m11 = this.f5470a.m(size);
            int i11 = m11.f5473a;
            if ((i11 & 3) == 3) {
                bVar.b(k11);
            } else if ((i11 & 1) != 0) {
                RecyclerView.m.c cVar = m11.f5474b;
                if (cVar == null) {
                    bVar.b(k11);
                } else {
                    bVar.c(k11, cVar, m11.f5475c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.a(k11, m11.f5474b, m11.f5475c);
            } else if ((i11 & 12) == 12) {
                bVar.d(k11, m11.f5474b, m11.f5475c);
            } else if ((i11 & 4) != 0) {
                bVar.c(k11, m11.f5474b, null);
            } else if ((i11 & 8) != 0) {
                bVar.a(k11, m11.f5474b, m11.f5475c);
            }
            a.c(m11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.e0 e0Var) {
        a aVar = this.f5470a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.f5473a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.e0 e0Var) {
        int m11 = this.f5471b.m() - 1;
        while (true) {
            if (m11 < 0) {
                break;
            } else if (e0Var == this.f5471b.n(m11)) {
                this.f5471b.l(m11);
                break;
            } else {
                m11--;
            }
        }
        a remove = this.f5470a.remove(e0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}