package c1;

import c1.m1;

/* loaded from: classes.dex */
final class y1 implements m1<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final y1 f8716a = new y1();

    private y1() {
    }

    @Override // c1.m1
    public Object a(Object obj, Object obj2, Object obj3) {
        return m1.a.a(this, obj, obj2, obj3);
    }

    @Override // c1.m1
    public boolean b(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}