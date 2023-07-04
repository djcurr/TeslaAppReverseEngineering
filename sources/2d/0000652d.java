package d30;

import c30.b;
import g30.a1;
import g30.a2;
import g30.b2;
import g30.c1;
import g30.c2;
import g30.d2;
import g30.f;
import g30.h;
import g30.i;
import g30.j0;
import g30.k;
import g30.k0;
import g30.l;
import g30.o;
import g30.o0;
import g30.o1;
import g30.s1;
import g30.t;
import g30.t0;
import g30.t1;
import g30.u0;
import g30.u1;
import g30.v0;
import g30.x1;
import g30.z;
import g30.z1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import n00.d;
import vz.a0;
import vz.b0;
import vz.p;
import vz.u;
import vz.w;
import vz.x;
import vz.y;

/* loaded from: classes5.dex */
public final class a {
    public static final b<y> A(y.a aVar) {
        s.g(aVar, "<this>");
        return b2.f27563a;
    }

    public static final b<a0> B(a0.a aVar) {
        s.g(aVar, "<this>");
        return c2.f27568a;
    }

    public static final b<b0> C(b0 b0Var) {
        s.g(b0Var, "<this>");
        return d2.f27571b;
    }

    public static final <T, E extends T> b<E[]> a(d<T> kClass, b<E> elementSerializer) {
        s.g(kClass, "kClass");
        s.g(elementSerializer, "elementSerializer");
        return new o1(kClass, elementSerializer);
    }

    public static final b<boolean[]> b() {
        return h.f27595c;
    }

    public static final b<byte[]> c() {
        return k.f27605c;
    }

    public static final b<char[]> d() {
        return o.f27619c;
    }

    public static final b<double[]> e() {
        return t.f27639c;
    }

    public static final b<float[]> f() {
        return z.f27691c;
    }

    public static final b<int[]> g() {
        return j0.f27604c;
    }

    public static final <T> b<List<T>> h(b<T> elementSerializer) {
        s.g(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    public static final b<long[]> i() {
        return t0.f27640c;
    }

    public static final <K, V> b<Map.Entry<K, V>> j(b<K> keySerializer, b<V> valueSerializer) {
        s.g(keySerializer, "keySerializer");
        s.g(valueSerializer, "valueSerializer");
        return new v0(keySerializer, valueSerializer);
    }

    public static final <K, V> b<Map<K, V>> k(b<K> keySerializer, b<V> valueSerializer) {
        s.g(keySerializer, "keySerializer");
        s.g(valueSerializer, "valueSerializer");
        return new o0(keySerializer, valueSerializer);
    }

    public static final <K, V> b<p<K, V>> l(b<K> keySerializer, b<V> valueSerializer) {
        s.g(keySerializer, "keySerializer");
        s.g(valueSerializer, "valueSerializer");
        return new c1(keySerializer, valueSerializer);
    }

    public static final b<short[]> m() {
        return s1.f27638c;
    }

    public static final <A, B, C> b<u<A, B, C>> n(b<A> aSerializer, b<B> bSerializer, b<C> cSerializer) {
        s.g(aSerializer, "aSerializer");
        s.g(bSerializer, "bSerializer");
        s.g(cSerializer, "cSerializer");
        return new x1(aSerializer, bSerializer, cSerializer);
    }

    public static final <T> b<T> o(b<T> bVar) {
        s.g(bVar, "<this>");
        return bVar.getDescriptor().b() ? bVar : new a1(bVar);
    }

    public static final b<Boolean> p(kotlin.jvm.internal.d dVar) {
        s.g(dVar, "<this>");
        return i.f27597a;
    }

    public static final b<Byte> q(e eVar) {
        s.g(eVar, "<this>");
        return l.f27609a;
    }

    public static final b<Character> r(g gVar) {
        s.g(gVar, "<this>");
        return g30.p.f27623a;
    }

    public static final b<Double> s(kotlin.jvm.internal.k kVar) {
        s.g(kVar, "<this>");
        return g30.u.f27643a;
    }

    public static final b<Float> t(kotlin.jvm.internal.l lVar) {
        s.g(lVar, "<this>");
        return g30.a0.f27551a;
    }

    public static final b<Integer> u(r rVar) {
        s.g(rVar, "<this>");
        return k0.f27606a;
    }

    public static final b<Long> v(v vVar) {
        s.g(vVar, "<this>");
        return u0.f27645a;
    }

    public static final b<Short> w(kotlin.jvm.internal.o0 o0Var) {
        s.g(o0Var, "<this>");
        return t1.f27641a;
    }

    public static final b<String> x(q0 q0Var) {
        s.g(q0Var, "<this>");
        return u1.f27647a;
    }

    public static final b<w> y(w.a aVar) {
        s.g(aVar, "<this>");
        return z1.f27692a;
    }

    public static final b<x> z(x.a aVar) {
        s.g(aVar, "<this>");
        return a2.f27555a;
    }
}