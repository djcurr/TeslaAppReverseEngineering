package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.p;
import n00.r;
import vz.b0;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/MapTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "valueConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Ln00/p;", "mapType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class MapTypeConverter extends TypeConverter<Map<?, ?>> {
    private final p mapType;
    private final TypeConverter<?> valueConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTypeConverter(TypeConverterProvider converterProvider, p mapType) {
        super(mapType.e());
        s.g(converterProvider, "converterProvider");
        s.g(mapType, "mapType");
        this.mapType = mapType;
        if (s.c(((r) u.b0(mapType.f())).c(), m0.m(String.class))) {
            r rVar = (r) u.e0(mapType.f(), 1);
            p c11 = rVar == null ? null : rVar.c();
            if (c11 != null) {
                this.valueConverter = converterProvider.obtainTypeConverter(c11);
                return;
            }
            throw new IllegalArgumentException("The map type should contain the key type.".toString());
        }
        Object b02 = u.b0(mapType.f());
        throw new IllegalArgumentException(("The map key type should be String, but received " + b02 + ".").toString());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public Map<?, ?> convertNonOptional(Dynamic value) {
        s.g(value, "value");
        ReadableMap asMap = value.asMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = asMap.getEntryIterator();
        s.f(entryIterator, "jsMap.entryIterator");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            s.f(next, "(key, value)");
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                try {
                    s.f(key, "key");
                    linkedHashMap.put(key, this.valueConverter.convert(dynamicFromObject));
                    b0 b0Var = b0.f54756a;
                    dynamicFromObject.recycle();
                }
            } catch (CodedException e11) {
                p pVar = this.mapType;
                p c11 = pVar.f().get(1).c();
                s.e(c11);
                ReadableType type = dynamicFromObject.getType();
                s.f(type, "type");
                throw new CollectionElementCastException(pVar, c11, type, e11);
            }
        }
        return linkedHashMap;
    }
}