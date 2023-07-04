package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.r;
import vz.p;
import wz.u;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/types/PairTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "Lvz/p;", "Lcom/facebook/react/bridge/ReadableArray;", "array", "", "index", "", "convertElement", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "", "converters", "Ljava/util/List;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Ln00/p;", "pairType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class PairTypeConverter extends TypeConverter<p<?, ?>> {
    private final List<TypeConverter<? extends Object>> converters;
    private final n00.p pairType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairTypeConverter(TypeConverterProvider converterProvider, n00.p pairType) {
        super(pairType.e());
        List<TypeConverter<? extends Object>> l11;
        s.g(converterProvider, "converterProvider");
        s.g(pairType, "pairType");
        this.pairType = pairType;
        TypeConverter[] typeConverterArr = new TypeConverter[2];
        r rVar = (r) u.e0(pairType.f(), 0);
        n00.p c11 = rVar == null ? null : rVar.c();
        if (c11 != null) {
            typeConverterArr[0] = converterProvider.obtainTypeConverter(c11);
            r rVar2 = (r) u.e0(pairType.f(), 1);
            n00.p c12 = rVar2 != null ? rVar2.c() : null;
            if (c12 != null) {
                typeConverterArr[1] = converterProvider.obtainTypeConverter(c12);
                l11 = w.l(typeConverterArr);
                this.converters = l11;
                return;
            }
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.".toString());
        }
        throw new IllegalArgumentException("The pair type should contain the type of the first parameter.".toString());
    }

    private final Object convertElement(ReadableArray readableArray, int i11) {
        Dynamic dynamic = readableArray.getDynamic(i11);
        s.f(dynamic, "array.getDynamic(index)");
        try {
            try {
                Object convert = this.converters.get(i11).convert(dynamic);
                dynamic.recycle();
                return convert;
            }
        } catch (CodedException e11) {
            n00.p pVar = this.pairType;
            n00.p c11 = pVar.f().get(i11).c();
            s.e(c11);
            ReadableType type = dynamic.getType();
            s.f(type, "type");
            throw new CollectionElementCastException(pVar, c11, type, e11);
        }
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public p<?, ?> convertNonOptional(Dynamic value) {
        s.g(value, "value");
        ReadableArray jsArray = value.asArray();
        s.f(jsArray, "jsArray");
        return new p<>(convertElement(jsArray, 0), convertElement(jsArray, 1));
    }
}