package d5;

import androidx.lifecycle.f0;
import androidx.work.t;

/* loaded from: classes.dex */
public class c implements t {

    /* renamed from: c  reason: collision with root package name */
    private final f0<t.b> f23610c = new f0<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<t.b.c> f23611d = androidx.work.impl.utils.futures.c.t();

    public c() {
        a(t.f6704b);
    }

    public void a(t.b bVar) {
        this.f23610c.postValue(bVar);
        if (bVar instanceof t.b.c) {
            this.f23611d.p((t.b.c) bVar);
        } else if (bVar instanceof t.b.a) {
            this.f23611d.q(((t.b.a) bVar).a());
        }
    }
}