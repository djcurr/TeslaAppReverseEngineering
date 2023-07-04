package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import g00.a;
import java.lang.reflect.Array;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.d;
import n00.f;
import n00.p;
import n00.r;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/types/ArrayTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "", "size", "", "createTypedArray", "(I)[Ljava/lang/Object;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "(Lcom/facebook/react/bridge/Dynamic;)[Ljava/lang/Object;", "arrayElementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Ln00/p;", "arrayType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ArrayTypeConverter extends TypeConverter<Object[]> {
    private final TypeConverter<?> arrayElementConverter;
    private final p arrayType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayTypeConverter(TypeConverterProvider converterProvider, p arrayType) {
        super(arrayType.e());
        s.g(converterProvider, "converterProvider");
        s.g(arrayType, "arrayType");
        this.arrayType = arrayType;
        p c11 = ((r) u.b0(arrayType.f())).c();
        if (c11 != null) {
            this.arrayElementConverter = converterProvider.obtainTypeConverter(c11);
            return;
        }
        throw new IllegalArgumentException("The array type should contain the type of the elements.".toString());
    }

    private final Object[] createTypedArray(int i11) {
        p c11 = ((r) u.b0(this.arrayType.f())).c();
        s.e(c11);
        f c12 = c11.c();
        Objects.requireNonNull(c12, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object newInstance = Array.newInstance(a.b((d) c12), i11);
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) newInstance;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public Object[] convertNonOptional(Dynamic value) {
        s.g(value, "value");
        ReadableArray asArray = value.asArray();
        Object[] createTypedArray = createTypedArray(asArray.size());
        int size = asArray.size();
        if (size > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Dynamic dynamic = asArray.getDynamic(i11);
                s.f(dynamic, "jsArray\n        .getDynamic(i)");
                try {
                    try {
                        Object convert = this.arrayElementConverter.convert(dynamic);
                        dynamic.recycle();
                        createTypedArray[i11] = convert;
                        if (i12 >= size) {
                            break;
                        }
                        i11 = i12;
                    } catch (CodedException e11) {
                        p pVar = this.arrayType;
                        p c11 = ((r) u.b0(pVar.f())).c();
                        s.e(c11);
                        ReadableType type = dynamic.getType();
                        s.f(type, "type");
                        throw new CollectionElementCastException(pVar, c11, type, e11);
                    } catch (Throwable th2) {
                        UnexpectedException unexpectedException = new UnexpectedException(th2);
                        p pVar2 = this.arrayType;
                        p c12 = ((r) u.b0(pVar2.f())).c();
                        s.e(c12);
                        ReadableType type2 = dynamic.getType();
                        s.f(type2, "type");
                        throw new CollectionElementCastException(pVar2, c12, type2, unexpectedException);
                    }
                } catch (Throwable th3) {
                    dynamic.recycle();
                    throw th3;
                }
            }
        }
        return createTypedArray;
    }
}