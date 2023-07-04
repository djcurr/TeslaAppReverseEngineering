package r00;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;
import q00.l0;

/* loaded from: classes5.dex */
public final class g<M extends Member> implements d<M> {

    /* renamed from: a  reason: collision with root package name */
    private final a f48958a;

    /* renamed from: b  reason: collision with root package name */
    private final d<M> f48959b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f48960c;

    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m00.i f48961a;

        /* renamed from: b  reason: collision with root package name */
        private final Method[] f48962b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f48963c;

        public a(m00.i argumentRange, Method[] unbox, Method method) {
            s.g(argumentRange, "argumentRange");
            s.g(unbox, "unbox");
            this.f48961a = argumentRange;
            this.f48962b = unbox;
            this.f48963c = method;
        }

        public final m00.i a() {
            return this.f48961a;
        }

        public final Method[] b() {
            return this.f48962b;
        }

        public final Method c() {
            return this.f48963c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if ((r9 instanceof r00.c) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(kotlin.reflect.jvm.internal.impl.descriptors.b r8, r00.d<? extends M> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r00.g.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, r00.d, boolean):void");
    }

    @Override // r00.d
    public List<Type> a() {
        return this.f48959b.a();
    }

    @Override // r00.d
    public M b() {
        return this.f48959b.b();
    }

    @Override // r00.d
    public Object call(Object[] args) {
        Object invoke;
        s.g(args, "args");
        a aVar = this.f48958a;
        m00.i a11 = aVar.a();
        Method[] b11 = aVar.b();
        Method c11 = aVar.c();
        Object[] copyOf = Arrays.copyOf(args, args.length);
        s.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        Objects.requireNonNull(copyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int c12 = a11.c();
        int e11 = a11.e();
        if (c12 <= e11) {
            while (true) {
                Method method = b11[c12];
                Object obj = args[c12];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        s.f(returnType, "method.returnType");
                        obj = l0.g(returnType);
                    }
                }
                copyOf[c12] = obj;
                if (c12 == e11) {
                    break;
                }
                c12++;
            }
        }
        Object call = this.f48959b.call(copyOf);
        return (c11 == null || (invoke = c11.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // r00.d
    public Type getReturnType() {
        return this.f48959b.getReturnType();
    }
}