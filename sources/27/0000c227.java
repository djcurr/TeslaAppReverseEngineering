package y7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    private final A f59314i;

    public q(i8.c<A> cVar) {
        this(cVar, null);
    }

    @Override // y7.a
    float c() {
        return 1.0f;
    }

    @Override // y7.a
    public A h() {
        i8.c<A> cVar = this.f59262e;
        A a11 = this.f59314i;
        return cVar.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a11, a11, f(), f(), f());
    }

    @Override // y7.a
    A i(i8.a<K> aVar, float f11) {
        return h();
    }

    @Override // y7.a
    public void k() {
        if (this.f59262e != null) {
            super.k();
        }
    }

    @Override // y7.a
    public void m(float f11) {
        this.f59261d = f11;
    }

    public q(i8.c<A> cVar, A a11) {
        super(Collections.emptyList());
        n(cVar);
        this.f59314i = a11;
    }
}