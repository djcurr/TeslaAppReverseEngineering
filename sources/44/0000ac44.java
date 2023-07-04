package q00;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Class<?>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47176a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(Class<?> it2) {
            kotlin.jvm.internal.s.f(it2, "it");
            return b10.b.b(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Method method) {
        String Y;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.s.f(parameterTypes, "parameterTypes");
        Y = wz.p.Y(parameterTypes, "", "(", ")", 0, null, a.f47176a, 24, null);
        sb2.append(Y);
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.s.f(returnType, "returnType");
        sb2.append(b10.b.b(returnType));
        return sb2.toString();
    }
}