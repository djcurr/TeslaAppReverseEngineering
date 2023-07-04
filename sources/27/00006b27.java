package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002R!\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/types/AnyType;", "", "Lcom/facebook/react/bridge/Dynamic;", "value", "convert", "Lexpo/modules/kotlin/types/TypeConverter;", "converter$delegate", "Lvz/k;", "getConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "converter", "Ln00/p;", "kType", "Ln00/p;", "getKType", "()Ln00/p;", "<init>", "(Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AnyType {
    private final k converter$delegate;
    private final p kType;

    public AnyType(p kType) {
        k a11;
        s.g(kType, "kType");
        this.kType = kType;
        a11 = m.a(new AnyType$converter$2(this));
        this.converter$delegate = a11;
    }

    private final TypeConverter<?> getConverter() {
        return (TypeConverter) this.converter$delegate.getValue();
    }

    public final Object convert(Dynamic value) {
        s.g(value, "value");
        return getConverter().convert(value);
    }

    public final p getKType() {
        return this.kType;
    }
}