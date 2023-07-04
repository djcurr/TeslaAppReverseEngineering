package c1;

import c1.m1;

/* loaded from: classes.dex */
final class b1 implements m1<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final b1 f8439a = new b1();

    private b1() {
    }

    @Override // c1.m1
    public Object a(Object obj, Object obj2, Object obj3) {
        return m1.a.a(this, obj, obj2, obj3);
    }

    @Override // c1.m1
    public boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}