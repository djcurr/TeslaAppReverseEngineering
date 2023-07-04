package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.NullArgumentException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverter;", "", "Type", "Lcom/facebook/react/bridge/Dynamic;", "value", "convert", "(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;", "convertNonOptional", "", "isOptional", "Z", "<init>", "(Z)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public abstract class TypeConverter<Type> {
    private final boolean isOptional;

    public TypeConverter(boolean z11) {
        this.isOptional = z11;
    }

    public Type convert(Dynamic value) {
        s.g(value, "value");
        if (value.isNull()) {
            if (this.isOptional) {
                return null;
            }
            throw new NullArgumentException();
        }
        return convertNonOptional(value);
    }

    public abstract Type convertNonOptional(Dynamic dynamic);
}