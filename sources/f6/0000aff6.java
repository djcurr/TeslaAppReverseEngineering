package r2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h extends c implements List<d>, i00.a {

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f49080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends d> fonts) {
        super(null);
        s.g(fonts, "fonts");
        this.f49080c = fonts;
        if (!fonts.isEmpty()) {
            HashSet hashSet = new HashSet(fonts.size());
            ArrayList arrayList = new ArrayList(fonts.size());
            int size = fonts.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Object obj = fonts.get(i11);
                d dVar = (d) obj;
                if (hashSet.add(new vz.p(dVar.a(), j.c(dVar.c())))) {
                    arrayList.add(obj);
                }
                i11 = i12;
            }
            if (!(arrayList.size() == this.f49080c.size())) {
                throw new IllegalStateException("There cannot be two fonts with the same FontWeight and FontStyle in the same FontFamily".toString());
            }
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: c */
    public void add(int i11, d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return f((d) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        return this.f49080c.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: e */
    public boolean add(d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && s.c(this.f49080c, ((h) obj).f49080c);
    }

    public boolean f(d element) {
        s.g(element, "element");
        return this.f49080c.contains(element);
    }

    @Override // java.util.List
    /* renamed from: h */
    public d get(int i11) {
        return this.f49080c.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f49080c.hashCode();
    }

    public final List<d> i() {
        return this.f49080c;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof d) {
            return k((d) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f49080c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<d> iterator() {
        return this.f49080c.iterator();
    }

    public int j() {
        return this.f49080c.size();
    }

    public int k(d element) {
        s.g(element, "element");
        return this.f49080c.indexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof d) {
            return m((d) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<d> listIterator() {
        return this.f49080c.listIterator();
    }

    @Override // java.util.List
    public ListIterator<d> listIterator(int i11) {
        return this.f49080c.listIterator(i11);
    }

    public int m(d element) {
        s.g(element, "element");
        return this.f49080c.lastIndexOf(element);
    }

    @Override // java.util.List
    /* renamed from: n */
    public d set(int i11, d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ d remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.List
    public void sort(Comparator<? super d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<d> subList(int i11, int i12) {
        return this.f49080c.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.g(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f49080c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}