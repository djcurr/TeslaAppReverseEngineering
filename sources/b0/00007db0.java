package ka;

import java.util.Queue;
import ka.m;

/* loaded from: classes.dex */
abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<T> f34511a = bb.k.f(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.f34511a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t11) {
        if (this.f34511a.size() < 20) {
            this.f34511a.offer(t11);
        }
    }
}