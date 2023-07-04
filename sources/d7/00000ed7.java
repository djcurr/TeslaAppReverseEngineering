package c1;

import java.util.Arrays;
import v20.a2;
import v20.d2;
import v20.f2;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final z f8438a = new z();

    public static final void a(Object obj, h00.l<? super z, ? extends y> effect, i iVar, int i11) {
        kotlin.jvm.internal.s.g(effect, "effect");
        iVar.x(592131046);
        iVar.x(-3686930);
        boolean O = iVar.O(obj);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new x(effect));
        }
        iVar.N();
        iVar.N();
    }

    public static final void b(Object obj, Object obj2, h00.l<? super z, ? extends y> effect, i iVar, int i11) {
        kotlin.jvm.internal.s.g(effect, "effect");
        iVar.x(592132916);
        iVar.x(-3686552);
        boolean O = iVar.O(obj) | iVar.O(obj2);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new x(effect));
        }
        iVar.N();
        iVar.N();
    }

    public static final void c(Object obj, Object obj2, Object obj3, h00.l<? super z, ? extends y> effect, i iVar, int i11) {
        kotlin.jvm.internal.s.g(effect, "effect");
        iVar.x(592134824);
        iVar.x(-3686095);
        boolean O = iVar.O(obj) | iVar.O(obj2) | iVar.O(obj3);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new x(effect));
        }
        iVar.N();
        iVar.N();
    }

    public static final void d(Object obj, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block, i iVar, int i11) {
        kotlin.jvm.internal.s.g(block, "block");
        iVar.x(1036442245);
        zz.g n11 = iVar.n();
        iVar.x(-3686930);
        boolean O = iVar.O(obj);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new k0(n11, block));
        }
        iVar.N();
        iVar.N();
    }

    public static final void e(Object obj, Object obj2, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block, i iVar, int i11) {
        kotlin.jvm.internal.s.g(block, "block");
        iVar.x(1036443237);
        zz.g n11 = iVar.n();
        iVar.x(-3686552);
        boolean O = iVar.O(obj) | iVar.O(obj2);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new k0(n11, block));
        }
        iVar.N();
        iVar.N();
    }

    public static final void f(Object obj, Object obj2, Object obj3, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block, i iVar, int i11) {
        kotlin.jvm.internal.s.g(block, "block");
        iVar.x(1036444259);
        zz.g n11 = iVar.n();
        iVar.x(-3686095);
        boolean O = iVar.O(obj) | iVar.O(obj2) | iVar.O(obj3);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            iVar.p(new k0(n11, block));
        }
        iVar.N();
        iVar.N();
    }

    public static final void g(Object[] keys, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block, i iVar, int i11) {
        kotlin.jvm.internal.s.g(keys, "keys");
        kotlin.jvm.internal.s.g(block, "block");
        iVar.x(1036445312);
        zz.g n11 = iVar.n();
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        iVar.x(-3685570);
        int length = copyOf.length;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < length) {
            Object obj = copyOf[i12];
            i12++;
            z11 |= iVar.O(obj);
        }
        Object y11 = iVar.y();
        if (z11 || y11 == i.f8486a.a()) {
            iVar.p(new k0(n11, block));
        }
        iVar.N();
        iVar.N();
    }

    public static final void h(h00.a<vz.b0> effect, i iVar, int i11) {
        kotlin.jvm.internal.s.g(effect, "effect");
        iVar.x(-2102467972);
        iVar.j(effect);
        iVar.N();
    }

    public static final v20.o0 j(zz.g coroutineContext, i composer) {
        v20.a0 b11;
        kotlin.jvm.internal.s.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.s.g(composer, "composer");
        a2.b bVar = v20.a2.f53887l1;
        if (coroutineContext.get(bVar) != null) {
            b11 = f2.b(null, 1, null);
            b11.g(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return v20.p0.a(b11);
        }
        zz.g n11 = composer.n();
        return v20.p0.a(n11.plus(d2.a((v20.a2) n11.get(bVar))).plus(coroutineContext));
    }
}