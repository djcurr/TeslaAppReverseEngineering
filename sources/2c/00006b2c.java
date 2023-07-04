package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/types/DoubleTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Double;", "", "isOptional", "<init>", "(Z)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class DoubleTypeConverter extends TypeConverter<Double> {
    public DoubleTypeConverter(boolean z11) {
        super(z11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.TypeConverter
    public Double convertNonOptional(Dynamic value) {
        s.g(value, "value");
        return Double.valueOf(value.asDouble());
    }
}