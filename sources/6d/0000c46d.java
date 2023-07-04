package z5;

import android.graphics.Bitmap;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.o;

/* loaded from: classes.dex */
public final class q implements w {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<l, ArrayList<c>> f60303a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f60304b;

    /* renamed from: c  reason: collision with root package name */
    private final g6.k f60305c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f60306a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f60307b;

        public b(Bitmap bitmap, boolean z11) {
            kotlin.jvm.internal.s.g(bitmap, "bitmap");
            this.f60306a = bitmap;
            this.f60307b = z11;
        }

        @Override // z5.o.a
        public boolean a() {
            return this.f60307b;
        }

        @Override // z5.o.a
        public Bitmap b() {
            return this.f60306a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f60308a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Bitmap> f60309b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f60310c;

        /* renamed from: d  reason: collision with root package name */
        private final int f60311d;

        public c(int i11, WeakReference<Bitmap> bitmap, boolean z11, int i12) {
            kotlin.jvm.internal.s.g(bitmap, "bitmap");
            this.f60308a = i11;
            this.f60309b = bitmap;
            this.f60310c = z11;
            this.f60311d = i12;
        }

        public final WeakReference<Bitmap> a() {
            return this.f60309b;
        }

        public final int b() {
            return this.f60308a;
        }

        public final int c() {
            return this.f60311d;
        }

        public final boolean d() {
            return this.f60310c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d<T> implements Predicate<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60312a = new d();

        d() {
        }

        @Override // java.util.function.Predicate
        /* renamed from: a */
        public final boolean test(c it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.a().get() == null;
        }
    }

    static {
        new a(null);
    }

    public q(g6.k kVar) {
        this.f60305c = kVar;
    }

    private final void f() {
        int i11 = this.f60304b;
        this.f60304b = i11 + 1;
        if (i11 >= 10) {
            e();
        }
    }

    @Override // z5.w
    public synchronized void a(int i11) {
        g6.k kVar = this.f60305c;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealWeakMemoryCache", 2, "trimMemory, level=" + i11, null);
        }
        if (i11 >= 10 && i11 != 20) {
            e();
        }
    }

    @Override // z5.w
    public synchronized o.a b(l key) {
        b bVar;
        kotlin.jvm.internal.s.g(key, "key");
        ArrayList<c> arrayList = this.f60303a.get(key);
        b bVar2 = null;
        if (arrayList != null) {
            kotlin.jvm.internal.s.f(arrayList, "cache[key] ?: return null");
            int i11 = 0;
            int size = arrayList.size();
            while (true) {
                if (i11 >= size) {
                    break;
                }
                c cVar = arrayList.get(i11);
                Bitmap it2 = cVar.a().get();
                if (it2 != null) {
                    kotlin.jvm.internal.s.f(it2, "it");
                    bVar = new b(it2, cVar.d());
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar2 = bVar;
                    break;
                }
                i11++;
            }
            f();
            return bVar2;
        }
        return null;
    }

    @Override // z5.w
    public synchronized boolean c(Bitmap bitmap) {
        boolean z11;
        kotlin.jvm.internal.s.g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        Collection<ArrayList<c>> values = this.f60303a.values();
        kotlin.jvm.internal.s.f(values, "cache.values");
        Iterator<T> it2 = values.iterator();
        loop0: while (true) {
            z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            ArrayList values2 = (ArrayList) it2.next();
            kotlin.jvm.internal.s.f(values2, "values");
            int size = values2.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((c) values2.get(i11)).b() == identityHashCode) {
                    values2.remove(i11);
                    z11 = true;
                    break loop0;
                }
            }
        }
        f();
        return z11;
    }

    @Override // z5.w
    public synchronized void d(l key, Bitmap bitmap, boolean z11, int i11) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(bitmap, "bitmap");
        HashMap<l, ArrayList<c>> hashMap = this.f60303a;
        ArrayList<c> arrayList = hashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hashMap.put(key, arrayList);
        }
        ArrayList<c> arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        c cVar = new c(identityHashCode, new WeakReference(bitmap), z11, i11);
        int i12 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i12 < size) {
                c cVar2 = arrayList2.get(i12);
                kotlin.jvm.internal.s.f(cVar2, "values[index]");
                c cVar3 = cVar2;
                if (i11 < cVar3.c()) {
                    i12++;
                } else if (cVar3.b() == identityHashCode && cVar3.a().get() == bitmap) {
                    arrayList2.set(i12, cVar);
                } else {
                    arrayList2.add(i12, cVar);
                }
            } else {
                arrayList2.add(cVar);
                break;
            }
        }
        f();
    }

    public final void e() {
        WeakReference<Bitmap> a11;
        this.f60304b = 0;
        Iterator<ArrayList<c>> it2 = this.f60303a.values().iterator();
        while (it2.hasNext()) {
            ArrayList<c> next = it2.next();
            kotlin.jvm.internal.s.f(next, "iterator.next()");
            ArrayList<c> arrayList = next;
            if (arrayList.size() <= 1) {
                c cVar = (c) wz.u.d0(arrayList);
                if (((cVar == null || (a11 = cVar.a()) == null) ? null : a11.get()) == null) {
                    it2.remove();
                }
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList.removeIf(d.f60312a);
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = i12 - i11;
                        if (arrayList.get(i13).a().get() == null) {
                            arrayList.remove(i13);
                            i11++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it2.remove();
                }
            }
        }
    }
}