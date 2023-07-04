package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f34888a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f34889b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f34890c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f34891a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f34892b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f34893c;

        public a(Method method, Method method2, Method method3) {
            this.f34891a = method;
            this.f34892b = method2;
            this.f34893c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f34890c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f34889b;
            f34890c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        s.g(continuation, "continuation");
        a aVar = f34890c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f34889b) {
            return null;
        }
        Method method = aVar.f34891a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f34892b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f34893c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}