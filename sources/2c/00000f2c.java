package c1;

import c1.m1;

/* loaded from: classes.dex */
final class p0 implements m1<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f8643a = new p0();

    private p0() {
    }

    @Override // c1.m1
    public Object a(Object obj, Object obj2, Object obj3) {
        return m1.a.a(this, obj, obj2, obj3);
    }

    @Override // c1.m1
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}