package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import k20.d0;
import w00.j;
import w00.l0;
import w00.m;
import w00.p0;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public interface a extends j, m, p0<a> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC0649a<V> {
    }

    l0 J();

    l0 N();

    @Override // w00.i
    a a();

    boolean c0();

    Collection<? extends a> d();

    d0 getReturnType();

    List<s0> getTypeParameters();

    List<v0> h();

    <V> V p0(InterfaceC0649a<V> interfaceC0649a);
}