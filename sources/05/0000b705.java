package u20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import wz.e0;
import wz.w;
import wz.x0;

/* loaded from: classes5.dex */
public class p extends o {

    /* loaded from: classes5.dex */
    public static final class a<T> implements Iterable<T>, i00.a {

        /* renamed from: a */
        final /* synthetic */ h f53070a;

        public a(h hVar) {
            this.f53070a = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f53070a.iterator();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<T> extends u implements h00.l<T, Boolean> {

        /* renamed from: a */
        public static final b f53071a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(t11 == null);
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class c<R> extends kotlin.jvm.internal.p implements h00.l<h<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final c f53072a = new c();

        c() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Iterator<R> invoke(h<? extends R> p02) {
            s.g(p02, "p0");
            return (Iterator<? extends R>) p02.iterator();
        }
    }

    public static <T> T A(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        return null;
    }

    public static <T, R> h<R> B(h<? extends T> hVar, h00.l<? super T, ? extends R> transform) {
        s.g(hVar, "<this>");
        s.g(transform, "transform");
        return new r(hVar, transform);
    }

    public static <T, R> h<R> C(h<? extends T> hVar, h00.l<? super T, ? extends R> transform) {
        h<R> s11;
        s.g(hVar, "<this>");
        s.g(transform, "transform");
        s11 = s(new r(hVar, transform));
        return s11;
    }

    public static <T extends Comparable<? super T>> T D(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
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

    public static <T> h<T> E(h<? extends T> hVar, Iterable<? extends T> elements) {
        h S;
        h l11;
        s.g(hVar, "<this>");
        s.g(elements, "elements");
        S = e0.S(elements);
        l11 = n.l(hVar, S);
        return n.f(l11);
    }

    public static <T> h<T> F(h<? extends T> hVar, T t11) {
        h l11;
        h l12;
        s.g(hVar, "<this>");
        l11 = n.l(t11);
        l12 = n.l(hVar, l11);
        return n.f(l12);
    }

    public static <T> h<T> G(h<? extends T> hVar, h00.l<? super T, Boolean> predicate) {
        s.g(hVar, "<this>");
        s.g(predicate, "predicate");
        return new q(hVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C H(h<? extends T> hVar, C destination) {
        s.g(hVar, "<this>");
        s.g(destination, "destination");
        for (T t11 : hVar) {
            destination.add(t11);
        }
        return destination;
    }

    public static <T> List<T> I(h<? extends T> hVar) {
        List J;
        List<T> p11;
        s.g(hVar, "<this>");
        J = J(hVar);
        p11 = w.p(J);
        return p11;
    }

    public static <T> List<T> J(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        return (List) H(hVar, new ArrayList());
    }

    public static <T> Set<T> K(h<? extends T> hVar) {
        Set<T> h11;
        s.g(hVar, "<this>");
        h11 = x0.h((Set) H(hVar, new LinkedHashSet()));
        return h11;
    }

    public static <T> boolean m(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        return hVar.iterator().hasNext();
    }

    public static <T> Iterable<T> n(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        return new a(hVar);
    }

    public static <T> int o(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            it2.next();
            i11++;
            if (i11 < 0) {
                w.r();
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h<T> p(h<? extends T> hVar, int i11) {
        s.g(hVar, "<this>");
        if (i11 >= 0) {
            return i11 == 0 ? hVar : hVar instanceof u20.c ? ((u20.c) hVar).a(i11) : new u20.b(hVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static <T> h<T> q(h<? extends T> hVar, h00.l<? super T, Boolean> predicate) {
        s.g(hVar, "<this>");
        s.g(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static <T> h<T> r(h<? extends T> hVar, h00.l<? super T, Boolean> predicate) {
        s.g(hVar, "<this>");
        s.g(predicate, "predicate");
        return new e(hVar, false, predicate);
    }

    public static <T> h<T> s(h<? extends T> hVar) {
        h<T> r11;
        s.g(hVar, "<this>");
        r11 = r(hVar, b.f53071a);
        return r11;
    }

    public static <T> T t(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T> T u(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    public static <T, R> h<R> v(h<? extends T> hVar, h00.l<? super T, ? extends h<? extends R>> transform) {
        s.g(hVar, "<this>");
        s.g(transform, "transform");
        return new f(hVar, transform, c.f53072a);
    }

    public static final <T, A extends Appendable> A w(h<? extends T> hVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        s.g(hVar, "<this>");
        s.g(buffer, "buffer");
        s.g(separator, "separator");
        s.g(prefix, "prefix");
        s.g(postfix, "postfix");
        s.g(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : hVar) {
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

    public static final <T> String x(h<? extends T> hVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        s.g(hVar, "<this>");
        s.g(separator, "separator");
        s.g(prefix, "prefix");
        s.g(postfix, "postfix");
        s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) w(hVar, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        s.f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String y(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
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
        return x(hVar, charSequence, str, str2, i13, charSequence5, lVar);
    }

    public static <T> T z(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        Iterator<? extends T> it2 = hVar.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }
}