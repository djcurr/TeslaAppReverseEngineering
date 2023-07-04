package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes.dex */
public final class o extends q implements Iterable<q>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f56848a;

    /* renamed from: b  reason: collision with root package name */
    private final float f56849b;

    /* renamed from: c  reason: collision with root package name */
    private final float f56850c;

    /* renamed from: d  reason: collision with root package name */
    private final float f56851d;

    /* renamed from: e  reason: collision with root package name */
    private final float f56852e;

    /* renamed from: f  reason: collision with root package name */
    private final float f56853f;

    /* renamed from: g  reason: collision with root package name */
    private final float f56854g;

    /* renamed from: h  reason: collision with root package name */
    private final float f56855h;

    /* renamed from: i  reason: collision with root package name */
    private final List<f> f56856i;

    /* renamed from: j  reason: collision with root package name */
    private final List<q> f56857j;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<q>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<q> f56858a;

        a() {
            this.f56858a = o.this.f56857j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public q next() {
            return this.f56858a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56858a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o() {
        this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
    }

    public /* synthetic */ o(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) == 0 ? f15 : 1.0f, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) == 0 ? f17 : BitmapDescriptorFactory.HUE_RED, (i11 & 256) != 0 ? p.e() : list, (i11 & 512) != 0 ? w.i() : list2);
    }

    public final List<f> c() {
        return this.f56856i;
    }

    public final String e() {
        return this.f56848a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.s.c(this.f56848a, oVar.f56848a)) {
            if (this.f56849b == oVar.f56849b) {
                if (this.f56850c == oVar.f56850c) {
                    if (this.f56851d == oVar.f56851d) {
                        if (this.f56852e == oVar.f56852e) {
                            if (this.f56853f == oVar.f56853f) {
                                if (this.f56854g == oVar.f56854g) {
                                    return ((this.f56855h > oVar.f56855h ? 1 : (this.f56855h == oVar.f56855h ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f56856i, oVar.f56856i) && kotlin.jvm.internal.s.c(this.f56857j, oVar.f56857j);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f56850c;
    }

    public final float h() {
        return this.f56851d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f56848a.hashCode() * 31) + Float.hashCode(this.f56849b)) * 31) + Float.hashCode(this.f56850c)) * 31) + Float.hashCode(this.f56851d)) * 31) + Float.hashCode(this.f56852e)) * 31) + Float.hashCode(this.f56853f)) * 31) + Float.hashCode(this.f56854g)) * 31) + Float.hashCode(this.f56855h)) * 31) + this.f56856i.hashCode()) * 31) + this.f56857j.hashCode();
    }

    public final float i() {
        return this.f56849b;
    }

    @Override // java.lang.Iterable
    public Iterator<q> iterator() {
        return new a();
    }

    public final float j() {
        return this.f56852e;
    }

    public final float k() {
        return this.f56853f;
    }

    public final float m() {
        return this.f56854g;
    }

    public final float n() {
        return this.f56855h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(String name, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends f> clipPathData, List<? extends q> children) {
        super(null);
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(clipPathData, "clipPathData");
        kotlin.jvm.internal.s.g(children, "children");
        this.f56848a = name;
        this.f56849b = f11;
        this.f56850c = f12;
        this.f56851d = f13;
        this.f56852e = f14;
        this.f56853f = f15;
        this.f56854g = f16;
        this.f56855h = f17;
        this.f56856i = clipPathData;
        this.f56857j = children;
    }
}