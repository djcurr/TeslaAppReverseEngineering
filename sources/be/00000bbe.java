package b10;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7284a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static C0141a f7285b;

    /* renamed from: b10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0141a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f7286a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f7287b;

        public C0141a(Method method, Method method2) {
            this.f7286a = method;
            this.f7287b = method2;
        }

        public final Method a() {
            return this.f7287b;
        }

        public final Method b() {
            return this.f7286a;
        }
    }

    private a() {
    }

    public final C0141a a(Member member) {
        kotlin.jvm.internal.s.g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C0141a(cls.getMethod("getParameters", new Class[0]), b.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C0141a(null, null);
        }
    }

    public final List<String> b(Member member) {
        Method a11;
        kotlin.jvm.internal.s.g(member, "member");
        C0141a c0141a = f7285b;
        if (c0141a == null) {
            c0141a = a(member);
            f7285b = c0141a;
        }
        Method b11 = c0141a.b();
        if (b11 == null || (a11 = c0141a.a()) == null) {
            return null;
        }
        Object invoke = b11.invoke(member, new Object[0]);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a11.invoke(obj, new Object[0]);
            Objects.requireNonNull(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}