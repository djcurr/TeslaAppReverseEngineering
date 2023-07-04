package s20;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.p;
import wz.x0;

/* loaded from: classes5.dex */
public final class f<T> extends AbstractSet<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f50187c = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private Object f50188a;

    /* renamed from: b  reason: collision with root package name */
    private int f50189b;

    /* loaded from: classes5.dex */
    private static final class a<T> implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f50190a;

        public a(T[] array) {
            s.g(array, "array");
            this.f50190a = kotlin.jvm.internal.c.a(array);
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50190a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f50190a.next();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> f<T> a() {
            return new f<>(null);
        }

        public final <T> f<T> b(Collection<? extends T> set) {
            s.g(set, "set");
            f<T> fVar = new f<>(null);
            fVar.addAll(set);
            return fVar;
        }
    }

    /* loaded from: classes5.dex */
    private static final class c<T> implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final T f50191a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f50192b = true;

        public c(T t11) {
            this.f50191a = t11;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50192b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f50192b) {
                this.f50192b = false;
                return this.f50191a;
            }
            throw new NoSuchElementException();
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final <T> f<T> b() {
        return f50187c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t11) {
        boolean D;
        Object[] objArr;
        LinkedHashSet f11;
        if (size() == 0) {
            this.f50188a = t11;
        } else if (size() == 1) {
            if (s.c(this.f50188a, t11)) {
                return false;
            }
            this.f50188a = new Object[]{this.f50188a, t11};
        } else if (size() < 5) {
            Object obj = this.f50188a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            D = p.D(objArr2, t11);
            if (D) {
                return false;
            }
            if (size() == 4) {
                f11 = x0.f(Arrays.copyOf(objArr2, objArr2.length));
                f11.add(t11);
                b0 b0Var = b0.f54756a;
                objArr = f11;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                s.f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t11;
                b0 b0Var2 = b0.f54756a;
                objArr = copyOf;
            }
            this.f50188a = objArr;
        } else {
            Object obj2 = this.f50188a;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!r0.e(obj2).add(t11)) {
                return false;
            }
        }
        d(size() + 1);
        return true;
    }

    public int c() {
        return this.f50189b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f50188a = null;
        d(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean D;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return s.c(this.f50188a, obj);
        }
        if (size() >= 5) {
            Object obj2 = this.f50188a;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ((Set) obj2).contains(obj);
        }
        Object obj3 = this.f50188a;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        D = p.D((Object[]) obj3, obj);
        return D;
    }

    public void d(int i11) {
        this.f50189b = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f50188a);
        }
        if (size() < 5) {
            Object obj = this.f50188a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f50188a;
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return r0.e(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}