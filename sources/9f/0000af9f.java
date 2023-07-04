package r00;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r00.d;
import r00.e;
import wz.l;

/* loaded from: classes5.dex */
public abstract class i implements d<Method> {

    /* renamed from: a  reason: collision with root package name */
    private final Type f48964a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f48965b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Type> f48966c;

    /* loaded from: classes5.dex */
    public static final class a extends i implements c {

        /* renamed from: d  reason: collision with root package name */
        private final Object f48967d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.reflect.Method r3, java.lang.Object r4) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.s.g(r3, r0)
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.f48967d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.i.a.<init>(java.lang.reflect.Method, java.lang.Object):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            d(args);
            return c(this.f48967d, args);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.s.g(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = wz.u.d(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.i.b.<init>(java.lang.reflect.Method):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            Object[] r11;
            s.g(args, "args");
            d(args);
            Object obj = args[0];
            e.d dVar = e.f48945e;
            if (args.length <= 1) {
                r11 = new Object[0];
            } else {
                r11 = l.r(args, 1, args.length);
                Objects.requireNonNull(r11, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            return c(obj, r11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i(Method method, List<? extends Type> list) {
        this.f48965b = method;
        this.f48966c = list;
        Class<?> returnType = method.getReturnType();
        s.f(returnType, "unboxMethod.returnType");
        this.f48964a = returnType;
    }

    @Override // r00.d
    public final List<Type> a() {
        return this.f48966c;
    }

    protected final Object c(Object obj, Object[] args) {
        s.g(args, "args");
        return this.f48965b.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void d(Object[] args) {
        s.g(args, "args");
        d.a.a(this, args);
    }

    @Override // r00.d
    /* renamed from: e */
    public final Method b() {
        return null;
    }

    @Override // r00.d
    public final Type getReturnType() {
        return this.f48964a;
    }

    public /* synthetic */ i(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }
}