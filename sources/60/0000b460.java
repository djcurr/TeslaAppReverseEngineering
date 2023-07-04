package t2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f implements Collection<e>, i00.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f51563c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f51564a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51565b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            List<g> a11 = i.a().a();
            ArrayList arrayList = new ArrayList(a11.size());
            int size = a11.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new e(a11.get(i11)));
            }
            return new f(arrayList);
        }
    }

    public f(List<e> localeList) {
        s.g(localeList, "localeList");
        this.f51564a = localeList;
        this.f51565b = localeList.size();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* renamed from: b */
    public boolean add(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(e element) {
        s.g(element, "element");
        return this.f51564a.contains(element);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return c((e) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        return this.f51564a.containsAll(elements);
    }

    public final e e(int i11) {
        return this.f51564a.get(i11);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && s.c(this.f51564a, ((f) obj).f51564a);
    }

    public final List<e> f() {
        return this.f51564a;
    }

    public int h() {
        return this.f51565b;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f51564a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f51564a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<e> iterator() {
        return this.f51564a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.g(array, "array");
        return (T[]) j.b(this, array);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f51564a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}