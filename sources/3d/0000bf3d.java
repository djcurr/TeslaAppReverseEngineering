package xa;

import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import ua.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final q<?, ?, ?> f57347c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<bb.i, q<?, ?, ?>> f57348a = new androidx.collection.a<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<bb.i> f57349b = new AtomicReference<>();

    private bb.i b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        bb.i andSet = this.f57349b.getAndSet(null);
        if (andSet == null) {
            andSet = new bb.i();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        bb.i b11 = b(cls, cls2, cls3);
        synchronized (this.f57348a) {
            qVar = (q<Data, TResource, Transcode>) this.f57348a.get(b11);
        }
        this.f57349b.set(b11);
        return qVar;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f57347c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f57348a) {
            androidx.collection.a<bb.i, q<?, ?, ?>> aVar = this.f57348a;
            bb.i iVar = new bb.i(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f57347c;
            }
            aVar.put(iVar, qVar);
        }
    }
}