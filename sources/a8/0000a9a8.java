package p20;

import k20.d0;
import kotlin.jvm.internal.s;
import p20.b;
import t00.j;
import w00.v0;

/* loaded from: classes5.dex */
final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f45909a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f45910b = "second parameter must be of type KProperty<*> or its supertype";

    private e() {
    }

    @Override // p20.b
    public String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // p20.b
    public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        s.g(functionDescriptor, "functionDescriptor");
        v0 secondParameter = functionDescriptor.h().get(1);
        j.b bVar = t00.j.f51299d;
        s.f(secondParameter, "secondParameter");
        d0 a11 = bVar.a(a20.a.l(secondParameter));
        if (a11 == null) {
            return false;
        }
        d0 type = secondParameter.getType();
        s.f(type, "secondParameter.type");
        return n20.a.m(a11, n20.a.p(type));
    }

    @Override // p20.b
    public String getDescription() {
        return f45910b;
    }
}