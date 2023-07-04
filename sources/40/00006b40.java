package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b\u001a \u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"", "T", "Lexpo/modules/kotlin/types/TypeConverter;", "obtainTypeConverter", "Lcom/facebook/react/bridge/Dynamic;", "value", "convert", "(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;", "Ln00/p;", "type", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class TypeConverterProviderKt {
    public static final /* synthetic */ <T> T convert(Dynamic value) {
        s.g(value, "value");
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        s.m(6, "T");
        T t11 = (T) typeConverterProviderImpl.obtainTypeConverter(null).convert(value);
        s.m(1, "T");
        return t11;
    }

    public static final /* synthetic */ <T> TypeConverter<T> obtainTypeConverter() {
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        s.m(6, "T");
        return (TypeConverter<T>) typeConverterProviderImpl.obtainTypeConverter(null);
    }

    public static final Object convert(Dynamic value, p type) {
        s.g(value, "value");
        s.g(type, "type");
        return TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(type).convert(value);
    }
}