package r00;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import r00.d;
import wz.e0;
import wz.s0;
import wz.x;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List<Type> f48924a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Class<?>> f48925b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f48926c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f48927d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f48928e;

    /* renamed from: f  reason: collision with root package name */
    private final EnumC1061a f48929f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Method> f48930g;

    /* renamed from: r00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1061a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* loaded from: classes5.dex */
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class<?> jClass, List<String> parameterNames, EnumC1061a callMode, b origin, List<Method> methods) {
        int t11;
        int t12;
        int t13;
        List v02;
        s.g(jClass, "jClass");
        s.g(parameterNames, "parameterNames");
        s.g(callMode, "callMode");
        s.g(origin, "origin");
        s.g(methods, "methods");
        this.f48927d = jClass;
        this.f48928e = parameterNames;
        this.f48929f = callMode;
        this.f48930g = methods;
        t11 = x.t(methods, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Method method : methods) {
            arrayList.add(method.getGenericReturnType());
        }
        this.f48924a = arrayList;
        List<Method> list = this.f48930g;
        t12 = x.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (Method method2 : list) {
            Class<?> it2 = method2.getReturnType();
            s.f(it2, "it");
            Class<?> g11 = b10.b.g(it2);
            if (g11 != null) {
                it2 = g11;
            }
            arrayList2.add(it2);
        }
        this.f48925b = arrayList2;
        List<Method> list2 = this.f48930g;
        t13 = x.t(list2, 10);
        ArrayList arrayList3 = new ArrayList(t13);
        for (Method method3 : list2) {
            arrayList3.add(method3.getDefaultValue());
        }
        this.f48926c = arrayList3;
        if (this.f48929f == EnumC1061a.POSITIONAL_CALL && origin == b.JAVA) {
            v02 = e0.v0(this.f48928e, "value");
            if (!v02.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // r00.d
    public List<Type> a() {
        return this.f48924a;
    }

    @Override // r00.d
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] args) {
        s.g(args, "args");
        d.a.a(this, args);
    }

    @Override // r00.d
    public Object call(Object[] args) {
        List V0;
        Map t11;
        s.g(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Object obj = args[i11];
            int i13 = i12 + 1;
            Object f11 = (obj == null && this.f48929f == EnumC1061a.CALL_BY_NAME) ? this.f48926c.get(i12) : r00.b.f(obj, this.f48925b.get(i12));
            if (f11 == null) {
                r00.b.e(i12, this.f48928e.get(i12), this.f48925b.get(i12));
                throw null;
            }
            arrayList.add(f11);
            i11++;
            i12 = i13;
        }
        Class<?> cls = this.f48927d;
        V0 = e0.V0(this.f48928e, arrayList);
        t11 = s0.t(V0);
        return r00.b.c(cls, t11, this.f48930g);
    }

    public Void d() {
        return null;
    }

    @Override // r00.d
    public Type getReturnType() {
        return this.f48927d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, r00.a.EnumC1061a r9, r00.a.b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = wz.u.t(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r00.a.<init>(java.lang.Class, java.util.List, r00.a$a, r00.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}