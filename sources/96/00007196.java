package gx;

import java.lang.ref.ReferenceQueue;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private Map f28512a = null;

    public void a() {
        Map map = this.f28512a;
        if (map != null) {
            synchronized (map) {
                this.f28512a.clear();
            }
        }
    }

    public synchronized void b(boolean z11) {
        if (z11) {
            this.f28512a = new d();
            new ReferenceQueue();
        } else {
            this.f28512a = null;
        }
    }
}