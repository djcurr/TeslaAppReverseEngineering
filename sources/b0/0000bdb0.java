package wz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes5.dex */
public class e0 extends d0 {

    /* loaded from: classes5.dex */
    public static final class a<T> implements u20.h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f56476a;

        public a(Iterable iterable) {
            this.f56476a = iterable;
        }

        @Override // u20.h
        public Iterator<T> iterator() {
            return this.f56476a.iterator();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<T> extends kotlin.jvm.internal.u implements h00.a<Iterator<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Iterable<T> f56477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Iterable<? extends T> iterable) {
            super(0);
            this.f56477a = iterable;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.f56477a.iterator();
        }
    }

    public static <T> List<T> A0(Iterable<? extends T> iterable) {
        List<T> O0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            O0 = O0(iterable);
            return O0;
        }
        List<T> P0 = P0(iterable);
        d0.P(P0);
        return P0;
    }

    public static <T> T B0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) u.C0((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            if (it2.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T C0(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T D0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            if (it2.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static <T> T E0(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> List<T> F0(Iterable<? extends T> iterable) {
        List<T> e11;
        List<T> O0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                O0 = O0(iterable);
                return O0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Comparable[] comparableArr = (Comparable[]) array;
            o.x(comparableArr);
            e11 = o.e(comparableArr);
            return e11;
        }
        List<T> P0 = P0(iterable);
        a0.x(P0);
        return P0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> G0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> e11;
        List<T> O0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                O0 = O0(iterable);
                return O0;
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            o.y(array, comparator);
            e11 = o.e(array);
            return e11;
        }
        List<T> P0 = P0(iterable);
        a0.y(P0, comparator);
        return P0;
    }

    public static <T> List<T> H0(Iterable<? extends T> iterable, int i11) {
        List<T> p11;
        List<T> d11;
        List<T> O0;
        List<T> i12;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        int i13 = 0;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        } else if (i11 == 0) {
            i12 = w.i();
            return i12;
        } else {
            if (iterable instanceof Collection) {
                if (i11 >= ((Collection) iterable).size()) {
                    O0 = O0(iterable);
                    return O0;
                } else if (i11 == 1) {
                    d11 = v.d(u.a0(iterable));
                    return d11;
                }
            }
            ArrayList arrayList = new ArrayList(i11);
            for (T t11 : iterable) {
                arrayList.add(t11);
                i13++;
                if (i13 == i11) {
                    break;
                }
            }
            p11 = w.p(arrayList);
            return p11;
        }
    }

    public static <T> List<T> I0(List<? extends T> list, int i11) {
        List<T> d11;
        List<T> O0;
        List<T> i12;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        } else if (i11 == 0) {
            i12 = w.i();
            return i12;
        } else {
            int size = list.size();
            if (i11 >= size) {
                O0 = O0(list);
                return O0;
            } else if (i11 == 1) {
                d11 = v.d(u.n0(list));
                return d11;
            } else {
                ArrayList arrayList = new ArrayList(i11);
                if (list instanceof RandomAccess) {
                    for (int i13 = size - i11; i13 < size; i13++) {
                        arrayList.add(list.get(i13));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i11);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }

    public static boolean[] J0(Collection<Boolean> collection) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i11 = 0;
        for (Boolean bool : collection) {
            zArr[i11] = bool.booleanValue();
            i11++;
        }
        return zArr;
    }

    public static <T, C extends Collection<? super T>> C K0(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        for (T t11 : iterable) {
            destination.add(t11);
        }
        return destination;
    }

    public static float[] L0(Collection<Float> collection) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i11 = 0;
        for (Float f11 : collection) {
            fArr[i11] = f11.floatValue();
            i11++;
        }
        return fArr;
    }

    public static <T> HashSet<T> M0(Iterable<? extends T> iterable) {
        int t11;
        int e11;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        t11 = x.t(iterable, 12);
        e11 = r0.e(t11);
        return (HashSet) u.K0(iterable, new HashSet(e11));
    }

    public static int[] N0(Collection<Integer> collection) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i11 = 0;
        for (Integer num : collection) {
            iArr[i11] = num.intValue();
            i11++;
        }
        return iArr;
    }

    public static <T> List<T> O0(Iterable<? extends T> iterable) {
        List<T> p11;
        List<T> i11;
        List<T> d11;
        List<T> Q0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                i11 = w.i();
                return i11;
            } else if (size != 1) {
                Q0 = Q0(collection);
                return Q0;
            } else {
                d11 = v.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return d11;
            }
        }
        p11 = w.p(P0(iterable));
        return p11;
    }

    public static final <T> List<T> P0(Iterable<? extends T> iterable) {
        List<T> Q0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Q0 = Q0((Collection) iterable);
            return Q0;
        }
        return (List) u.K0(iterable, new ArrayList());
    }

    public static <T> boolean Q(Iterable<? extends T> iterable, h00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!predicate.invoke((T) it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static <T> List<T> Q0(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> boolean R(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> Set<T> R0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) u.K0(iterable, new LinkedHashSet());
    }

    public static <T> u20.h<T> S(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> Set<T> S0(Iterable<? extends T> iterable) {
        Set<T> h11;
        Set<T> d11;
        Set<T> c11;
        int e11;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                d11 = x0.d();
                return d11;
            } else if (size != 1) {
                e11 = r0.e(collection.size());
                return (Set) u.K0(iterable, new LinkedHashSet(e11));
            } else {
                c11 = w0.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return c11;
            }
        }
        h11 = x0.h((Set) u.K0(iterable, new LinkedHashSet()));
        return h11;
    }

    public static <T> boolean T(Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t11);
        }
        return f0(iterable, t11) >= 0;
    }

    public static <T> Set<T> T0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> R0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        R0 = R0(iterable);
        b0.z(R0, other);
        return R0;
    }

    public static <T> List<T> U(Iterable<? extends T> iterable) {
        Set R0;
        List<T> O0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        R0 = R0(iterable);
        O0 = O0(R0);
        return O0;
    }

    public static <T> Iterable<k0<T>> U0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return new l0(new b(iterable));
    }

    public static <T> List<T> V(Iterable<? extends T> iterable, int i11) {
        ArrayList arrayList;
        List<T> p11;
        List<T> d11;
        List<T> i12;
        List<T> O0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        int i13 = 0;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        } else if (i11 == 0) {
            O0 = O0(iterable);
            return O0;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i11;
                if (size <= 0) {
                    i12 = w.i();
                    return i12;
                } else if (size == 1) {
                    d11 = v.d(u.m0(iterable));
                    return d11;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i11 < size2) {
                                arrayList.add(((List) iterable).get(i11));
                                i11++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i11);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t11 : iterable) {
                if (i13 >= i11) {
                    arrayList.add(t11);
                } else {
                    i13++;
                }
            }
            p11 = w.p(arrayList);
            return p11;
        }
    }

    public static <T, R> List<vz.p<T, R>> V0(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int t11;
        int t12;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        Iterator<? extends T> it2 = iterable.iterator();
        Iterator<? extends R> it3 = other.iterator();
        t11 = x.t(iterable, 10);
        t12 = x.t(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(t11, t12));
        while (it2.hasNext() && it3.hasNext()) {
            arrayList.add(vz.v.a(it2.next(), it3.next()));
        }
        return arrayList;
    }

    public static <T> List<T> W(List<? extends T> list, int i11) {
        int d11;
        List<T> H0;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (i11 >= 0) {
            d11 = m00.l.d(list.size() - i11, 0);
            H0 = H0(list, d11);
            return H0;
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static <T> List<T> X(Iterable<? extends T> iterable, h00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            Object obj = (T) it2.next();
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> List<T> Y(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return (List) Z(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C Z(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        for (T t11 : iterable) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    public static <T> T a0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) u.b0((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T b0(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T c0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    public static <T> T d0(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T e0(List<? extends T> list, int i11) {
        int k11;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (i11 >= 0) {
            k11 = w.k(list);
            if (i11 <= k11) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final <T> int f0(Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t11);
        }
        int i11 = 0;
        for (T t12 : iterable) {
            if (i11 < 0) {
                w.s();
            }
            if (kotlin.jvm.internal.s.c(t11, t12)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static <T> int g0(List<? extends T> list, T t11) {
        kotlin.jvm.internal.s.g(list, "<this>");
        return list.indexOf(t11);
    }

    public static <T> Set<T> h0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> R0;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        R0 = R0(iterable);
        b0.J(R0, other);
        return R0;
    }

    public static final <T, A extends Appendable> A i0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(buffer, "buffer");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : iterable) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            kotlin.text.n.a(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable j0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        return i0(iterable, appendable, (i12 & 2) != 0 ? ", " : charSequence, (i12 & 4) != 0 ? "" : charSequence2, (i12 & 8) == 0 ? charSequence3 : "", (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? "..." : charSequence4, (i12 & 64) != 0 ? null : lVar);
    }

    public static <T> String k0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) i0(iterable, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        kotlin.jvm.internal.s.f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String l0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        String k02;
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i12 & 2) != 0 ? "" : charSequence2;
        String str2 = (i12 & 4) == 0 ? charSequence3 : "";
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        k02 = k0(iterable, charSequence, str, str2, i13, charSequence5, lVar);
        return k02;
    }

    public static <T> T m0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) u.n0((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T n0(List<? extends T> list) {
        int k11;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (!list.isEmpty()) {
            k11 = w.k(list);
            return list.get(k11);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T o0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        return null;
    }

    public static <T> T p0(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> q0(Iterable<? extends T> iterable, h00.l<? super T, ? extends R> transform) {
        int t11;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(transform, "transform");
        t11 = x.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(transform.invoke((T) it2.next()));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T r0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                T next2 = it2.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static Float s0(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        Iterator<Float> it2 = iterable.iterator();
        if (it2.hasNext()) {
            float floatValue = it2.next().floatValue();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, it2.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> T t0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                T next2 = it2.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static Float u0(Iterable<Float> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        Iterator<Float> it2 = iterable.iterator();
        if (it2.hasNext()) {
            float floatValue = it2.next().floatValue();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, it2.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static <T> List<T> v0(Iterable<? extends T> iterable, T t11) {
        int t12;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        t12 = x.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t12);
        boolean z11 = false;
        for (T t13 : iterable) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.s.c(t13, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(t13);
            }
        }
        return arrayList;
    }

    public static <T> List<T> w0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> y02;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        if (iterable instanceof Collection) {
            y02 = y0((Collection) iterable, elements);
            return y02;
        }
        ArrayList arrayList = new ArrayList();
        b0.z(arrayList, iterable);
        b0.z(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> x0(Iterable<? extends T> iterable, T t11) {
        List<T> z02;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            z02 = z0((Collection) iterable, t11);
            return z02;
        }
        ArrayList arrayList = new ArrayList();
        b0.z(arrayList, iterable);
        arrayList.add(t11);
        return arrayList;
    }

    public static <T> List<T> y0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        b0.z(arrayList2, elements);
        return arrayList2;
    }

    public static <T> List<T> z0(Collection<? extends T> collection, T t11) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t11);
        return arrayList;
    }
}