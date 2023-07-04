package expo.modules.kotlin.allocators;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "", "T", "Ljava/lang/Class;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "tryToUseDefaultConstructor", "useUnsafeAllocator", "get", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ObjectConstructorFactory {
    public static /* synthetic */ Object a(Constructor constructor) {
        return m612tryToUseDefaultConstructor$lambda0(constructor);
    }

    public static /* synthetic */ Object b(UnsafeAllocator unsafeAllocator) {
        return m613useUnsafeAllocator$lambda1(unsafeAllocator);
    }

    private final <T> ObjectConstructor<T> tryToUseDefaultConstructor(Class<T> cls) {
        try {
            final Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.b
                @Override // expo.modules.kotlin.allocators.ObjectConstructor
                public final Object construct() {
                    return ObjectConstructorFactory.a(declaredConstructor);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: tryToUseDefaultConstructor$lambda-0 */
    public static final Object m612tryToUseDefaultConstructor$lambda0(Constructor constructor) {
        return constructor.newInstance(new Object[0]);
    }

    private final <T> ObjectConstructor<T> useUnsafeAllocator(Class<T> cls) {
        final UnsafeAllocator<T> createAllocator = UnsafeAllocator.Companion.createAllocator(cls);
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.a
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                return ObjectConstructorFactory.b(createAllocator);
            }
        };
    }

    /* renamed from: useUnsafeAllocator$lambda-1 */
    public static final Object m613useUnsafeAllocator$lambda1(UnsafeAllocator allocator) {
        s.g(allocator, "$allocator");
        return allocator.newInstance();
    }

    public final <T> ObjectConstructor<T> get(Class<T> clazz) {
        s.g(clazz, "clazz");
        ObjectConstructor<T> tryToUseDefaultConstructor = tryToUseDefaultConstructor(clazz);
        return tryToUseDefaultConstructor == null ? useUnsafeAllocator(clazz) : tryToUseDefaultConstructor;
    }
}