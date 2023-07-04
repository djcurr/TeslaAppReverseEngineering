package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/types/StringTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "", "isOptional", "<init>", "(Z)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class StringTypeConverter extends TypeConverter<String> {
    public StringTypeConverter(boolean z11) {
        super(z11);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public String convertNonOptional(Dynamic value) {
        s.g(value, "value");
        String asString = value.asString();
        s.f(asString, "value.asString()");
        return asString;
    }
}