package y7;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    private final d<K> f59260c;

    /* renamed from: e  reason: collision with root package name */
    protected i8.c<A> f59262e;

    /* renamed from: a  reason: collision with root package name */
    final List<b> f59258a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f59259b = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f59261d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f  reason: collision with root package name */
    private A f59263f = null;

    /* renamed from: g  reason: collision with root package name */
    private float f59264g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f59265h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // y7.a.d
        public boolean a(float f11) {
            throw new IllegalStateException("not implemented");
        }

        @Override // y7.a.d
        public i8.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // y7.a.d
        public boolean c(float f11) {
            return false;
        }

        @Override // y7.a.d
        public float d() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // y7.a.d
        public float e() {
            return 1.0f;
        }

        @Override // y7.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f11);

        i8.a<T> b();

        boolean c(float f11);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends i8.a<T>> f59266a;

        /* renamed from: c  reason: collision with root package name */
        private i8.a<T> f59268c = null;

        /* renamed from: d  reason: collision with root package name */
        private float f59269d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        private i8.a<T> f59267b = f(BitmapDescriptorFactory.HUE_RED);

        e(List<? extends i8.a<T>> list) {
            this.f59266a = list;
        }

        private i8.a<T> f(float f11) {
            List<? extends i8.a<T>> list = this.f59266a;
            i8.a<T> aVar = list.get(list.size() - 1);
            if (f11 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f59266a.size() - 2; size >= 1; size--) {
                i8.a<T> aVar2 = this.f59266a.get(size);
                if (this.f59267b != aVar2 && aVar2.a(f11)) {
                    return aVar2;
                }
            }
            return this.f59266a.get(0);
        }

        @Override // y7.a.d
        public boolean a(float f11) {
            i8.a<T> aVar = this.f59268c;
            i8.a<T> aVar2 = this.f59267b;
            if (aVar == aVar2 && this.f59269d == f11) {
                return true;
            }
            this.f59268c = aVar2;
            this.f59269d = f11;
            return false;
        }

        @Override // y7.a.d
        public i8.a<T> b() {
            return this.f59267b;
        }

        @Override // y7.a.d
        public boolean c(float f11) {
            if (this.f59267b.a(f11)) {
                return !this.f59267b.h();
            }
            this.f59267b = f(f11);
            return true;
        }

        @Override // y7.a.d
        public float d() {
            return this.f59266a.get(0).e();
        }

        @Override // y7.a.d
        public float e() {
            List<? extends i8.a<T>> list = this.f59266a;
            return list.get(list.size() - 1).b();
        }

        @Override // y7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final i8.a<T> f59270a;

        /* renamed from: b  reason: collision with root package name */
        private float f59271b = -1.0f;

        f(List<? extends i8.a<T>> list) {
            this.f59270a = list.get(0);
        }

        @Override // y7.a.d
        public boolean a(float f11) {
            if (this.f59271b == f11) {
                return true;
            }
            this.f59271b = f11;
            return false;
        }

        @Override // y7.a.d
        public i8.a<T> b() {
            return this.f59270a;
        }

        @Override // y7.a.d
        public boolean c(float f11) {
            return !this.f59270a.h();
        }

        @Override // y7.a.d
        public float d() {
            return this.f59270a.e();
        }

        @Override // y7.a.d
        public float e() {
            return this.f59270a.b();
        }

        @Override // y7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends i8.a<K>> list) {
        this.f59260c = o(list);
    }

    private float g() {
        if (this.f59264g == -1.0f) {
            this.f59264g = this.f59260c.d();
        }
        return this.f59264g;
    }

    private static <T> d<T> o(List<? extends i8.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f59258a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i8.a<K> b() {
        v7.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        i8.a<K> b11 = this.f59260c.b();
        v7.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b11;
    }

    float c() {
        if (this.f59265h == -1.0f) {
            this.f59265h = this.f59260c.e();
        }
        return this.f59265h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        i8.a<K> b11 = b();
        return b11.h() ? BitmapDescriptorFactory.HUE_RED : b11.f30190d.getInterpolation(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f59259b) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        i8.a<K> b11 = b();
        return b11.h() ? BitmapDescriptorFactory.HUE_RED : (this.f59261d - b11.e()) / (b11.b() - b11.e());
    }

    public float f() {
        return this.f59261d;
    }

    public A h() {
        A i11;
        float e11 = e();
        if (this.f59262e == null && this.f59260c.a(e11)) {
            return this.f59263f;
        }
        i8.a<K> b11 = b();
        Interpolator interpolator = b11.f30191e;
        if (interpolator != null && b11.f30192f != null) {
            i11 = j(b11, e11, interpolator.getInterpolation(e11), b11.f30192f.getInterpolation(e11));
        } else {
            i11 = i(b11, d());
        }
        this.f59263f = i11;
        return i11;
    }

    abstract A i(i8.a<K> aVar, float f11);

    protected A j(i8.a<K> aVar, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i11 = 0; i11 < this.f59258a.size(); i11++) {
            this.f59258a.get(i11).a();
        }
    }

    public void l() {
        this.f59259b = true;
    }

    public void m(float f11) {
        if (this.f59260c.isEmpty()) {
            return;
        }
        if (f11 < g()) {
            f11 = g();
        } else if (f11 > c()) {
            f11 = c();
        }
        if (f11 == this.f59261d) {
            return;
        }
        this.f59261d = f11;
        if (this.f59260c.c(f11)) {
            k();
        }
    }

    public void n(i8.c<A> cVar) {
        i8.c<A> cVar2 = this.f59262e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f59262e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}