package xa;

import bb.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<i> f57350a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.a<i, List<Class<?>>> f57351b = new androidx.collection.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.f57350a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f57351b) {
            list = this.f57351b.get(andSet);
        }
        this.f57350a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f57351b) {
            this.f57351b.put(new i(cls, cls2, cls3), list);
        }
    }
}