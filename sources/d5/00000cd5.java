package bo;

import bo.a.InterfaceC0154a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import yn.b;

/* loaded from: classes2.dex */
public class a<T extends InterfaceC0154a> {

    /* renamed from: a  reason: collision with root package name */
    private final yn.a f7891a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7892b;

    /* renamed from: c  reason: collision with root package name */
    private List<T> f7893c;

    /* renamed from: d  reason: collision with root package name */
    private List<a<T>> f7894d;

    /* renamed from: bo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0154a {
        b a();
    }

    public a(yn.a aVar) {
        this(aVar, 0);
    }

    private void b(double d11, double d12, T t11) {
        List<a<T>> list = this.f7894d;
        if (list != null) {
            yn.a aVar = this.f7891a;
            if (d12 < aVar.f59644f) {
                if (d11 < aVar.f59643e) {
                    list.get(0).b(d11, d12, t11);
                    return;
                } else {
                    list.get(1).b(d11, d12, t11);
                    return;
                }
            } else if (d11 < aVar.f59643e) {
                list.get(2).b(d11, d12, t11);
                return;
            } else {
                list.get(3).b(d11, d12, t11);
                return;
            }
        }
        if (this.f7893c == null) {
            this.f7893c = new ArrayList();
        }
        this.f7893c.add(t11);
        if (this.f7893c.size() <= 50 || this.f7892b >= 40) {
            return;
        }
        e();
    }

    private void d(yn.a aVar, Collection<T> collection) {
        if (this.f7891a.e(aVar)) {
            List<a<T>> list = this.f7894d;
            if (list != null) {
                for (a<T> aVar2 : list) {
                    aVar2.d(aVar, collection);
                }
            } else if (this.f7893c != null) {
                if (aVar.b(this.f7891a)) {
                    collection.addAll(this.f7893c);
                    return;
                }
                for (T t11 : this.f7893c) {
                    if (aVar.c(t11.a())) {
                        collection.add(t11);
                    }
                }
            }
        }
    }

    private void e() {
        ArrayList arrayList = new ArrayList(4);
        this.f7894d = arrayList;
        yn.a aVar = this.f7891a;
        arrayList.add(new a(aVar.f59639a, aVar.f59643e, aVar.f59640b, aVar.f59644f, this.f7892b + 1));
        List<a<T>> list = this.f7894d;
        yn.a aVar2 = this.f7891a;
        list.add(new a<>(aVar2.f59643e, aVar2.f59641c, aVar2.f59640b, aVar2.f59644f, this.f7892b + 1));
        List<a<T>> list2 = this.f7894d;
        yn.a aVar3 = this.f7891a;
        list2.add(new a<>(aVar3.f59639a, aVar3.f59643e, aVar3.f59644f, aVar3.f59642d, this.f7892b + 1));
        List<a<T>> list3 = this.f7894d;
        yn.a aVar4 = this.f7891a;
        list3.add(new a<>(aVar4.f59643e, aVar4.f59641c, aVar4.f59644f, aVar4.f59642d, this.f7892b + 1));
        List<T> list4 = this.f7893c;
        this.f7893c = null;
        for (T t11 : list4) {
            b(t11.a().f59645a, t11.a().f59646b, t11);
        }
    }

    public void a(T t11) {
        b a11 = t11.a();
        if (this.f7891a.a(a11.f59645a, a11.f59646b)) {
            b(a11.f59645a, a11.f59646b, t11);
        }
    }

    public Collection<T> c(yn.a aVar) {
        ArrayList arrayList = new ArrayList();
        d(aVar, arrayList);
        return arrayList;
    }

    private a(double d11, double d12, double d13, double d14, int i11) {
        this(new yn.a(d11, d12, d13, d14), i11);
    }

    private a(yn.a aVar, int i11) {
        this.f7894d = null;
        this.f7891a = aVar;
        this.f7892b = i11;
    }
}