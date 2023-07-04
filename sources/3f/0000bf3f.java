package xa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f57352a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f57353b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f57354a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f57355b;

        /* renamed from: c  reason: collision with root package name */
        final ha.f<T, R> f57356c;

        public a(Class<T> cls, Class<R> cls2, ha.f<T, R> fVar) {
            this.f57354a = cls;
            this.f57355b = cls2;
            this.f57356c = fVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f57354a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f57355b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.f57352a.contains(str)) {
            this.f57352a.add(str);
        }
        list = this.f57353b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f57353b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(String str, ha.f<T, R> fVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, fVar));
    }

    public synchronized <T, R> List<ha.f<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f57352a) {
            List<a<?, ?>> list = this.f57353b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f57356c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f57352a) {
            List<a<?, ?>> list = this.f57353b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f57355b)) {
                        arrayList.add(aVar.f57355b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f57352a);
        this.f57352a.clear();
        for (String str : list) {
            this.f57352a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f57352a.add(str2);
            }
        }
    }
}