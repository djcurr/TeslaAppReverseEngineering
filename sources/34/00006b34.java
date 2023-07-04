package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;
import n00.r;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/ListTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "elementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Ln00/p;", "listType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ListTypeConverter extends TypeConverter<List<?>> {
    private final TypeConverter<?> elementConverter;
    private final p listType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListTypeConverter(TypeConverterProvider converterProvider, p listType) {
        super(listType.e());
        s.g(converterProvider, "converterProvider");
        s.g(listType, "listType");
        this.listType = listType;
        p c11 = ((r) u.b0(listType.f())).c();
        if (c11 != null) {
            this.elementConverter = converterProvider.obtainTypeConverter(c11);
            return;
        }
        throw new IllegalArgumentException("The list type should contain the type of elements.".toString());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public List<?> convertNonOptional(Dynamic value) {
        s.g(value, "value");
        ReadableArray asArray = value.asArray();
        int size = asArray.size();
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Dynamic dynamic = asArray.getDynamic(i11);
            s.f(dynamic, "jsArray.getDynamic(index)");
            try {
                try {
                    Object convert = this.elementConverter.convert(dynamic);
                    dynamic.recycle();
                    arrayList.add(convert);
                    i11 = i12;
                } catch (CodedException e11) {
                    p pVar = this.listType;
                    p c11 = ((r) u.b0(pVar.f())).c();
                    s.e(c11);
                    ReadableType type = dynamic.getType();
                    s.f(type, "type");
                    throw new CollectionElementCastException(pVar, c11, type, e11);
                } catch (Throwable th2) {
                    UnexpectedException unexpectedException = new UnexpectedException(th2);
                    p pVar2 = this.listType;
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
        return arrayList;
    }
}