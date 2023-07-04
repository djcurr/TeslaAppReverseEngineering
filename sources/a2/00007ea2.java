package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import k20.d0;
import k20.d1;
import w00.s0;

/* loaded from: classes5.dex */
public interface d extends e {
    boolean Y();

    w00.c Z();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, w00.j, w00.i
    w00.f b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, w00.p0
    d c(d1 d1Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    d0 getReturnType();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    List<s0> getTypeParameters();
}