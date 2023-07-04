package expo.modules.kotlin.allocators;

import expo.modules.kotlin.allocators.UnsafeAllocator;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005J\u000f\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/allocators/UnsafeAllocator;", "T", "", "newInstance", "()Ljava/lang/Object;", "Companion", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public interface UnsafeAllocator<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/allocators/UnsafeAllocator$Companion;", "", "T", "Ljava/lang/Class;", "clazz", "Lexpo/modules/kotlin/allocators/UnsafeAllocator;", "createAllocator", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Object a(Class cls) {
            return m616createAllocator$lambda2(cls);
        }

        public static /* synthetic */ Object b(Method method, Class cls, int i11) {
            return m614createAllocator$lambda0(method, cls, i11);
        }

        public static /* synthetic */ Object c(Method method, Object obj, Class cls) {
            return m615createAllocator$lambda1(method, obj, cls);
        }

        /* renamed from: createAllocator$lambda-0 */
        public static final Object m614createAllocator$lambda0(Method method, Class clazz, int i11) {
            s.g(clazz, "$clazz");
            return method.invoke(null, clazz, Integer.valueOf(i11));
        }

        /* renamed from: createAllocator$lambda-1 */
        public static final Object m615createAllocator$lambda1(Method method, Object obj, Class clazz) {
            s.g(clazz, "$clazz");
            return method.invoke(obj, clazz);
        }

        /* renamed from: createAllocator$lambda-2 */
        public static final Object m616createAllocator$lambda2(Class clazz) {
            s.g(clazz, "$clazz");
            throw new IllegalArgumentException("Cannot allocate " + clazz);
        }

        public final <T> UnsafeAllocator<T> createAllocator(final Class<T> clazz) {
            s.g(clazz, "clazz");
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(null, Object.class);
                    if (invoke != null) {
                        final int intValue = ((Integer) invoke).intValue();
                        final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new UnsafeAllocator() { // from class: expo.modules.kotlin.allocators.d
                            @Override // expo.modules.kotlin.allocators.UnsafeAllocator
                            public final Object newInstance() {
                                return UnsafeAllocator.Companion.b(declaredMethod2, clazz, intValue);
                            }
                        };
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (Throwable unused) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new UnsafeAllocator() { // from class: expo.modules.kotlin.allocators.e
                        @Override // expo.modules.kotlin.allocators.UnsafeAllocator
                        public final Object newInstance() {
                            return UnsafeAllocator.Companion.c(method, obj, clazz);
                        }
                    };
                }
            } catch (Throwable unused2) {
                return new UnsafeAllocator() { // from class: expo.modules.kotlin.allocators.c
                    @Override // expo.modules.kotlin.allocators.UnsafeAllocator
                    public final Object newInstance() {
                        return UnsafeAllocator.Companion.a(clazz);
                    }
                };
            }
        }
    }

    T newInstance();
}