package expo.modules.kotlin.types;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.RecordTypeConverter;
import g00.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import n00.f;
import n00.p;
import o00.b;
import vz.v;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0016R&\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\u000e\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterProviderImpl;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "", "isOptional", "", "Ln00/p;", "Lexpo/modules/kotlin/types/TypeConverter;", "createCashedConverters", "type", "obtainTypeConverter", "cachedConverters", "Ljava/util/Map;", "", "Ln00/d;", "cachedRecordConverters", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class TypeConverterProviderImpl implements TypeConverterProvider {
    public static final TypeConverterProviderImpl INSTANCE;
    private static final Map<p, TypeConverter<?>> cachedConverters;
    private static final Map<d<?>, TypeConverter<?>> cachedRecordConverters;

    static {
        Map<p, TypeConverter<?>> p11;
        TypeConverterProviderImpl typeConverterProviderImpl = new TypeConverterProviderImpl();
        INSTANCE = typeConverterProviderImpl;
        p11 = s0.p(typeConverterProviderImpl.createCashedConverters(false), typeConverterProviderImpl.createCashedConverters(true));
        cachedConverters = p11;
        cachedRecordConverters = new LinkedHashMap();
    }

    private TypeConverterProviderImpl() {
    }

    private final Map<p, TypeConverter<?>> createCashedConverters(boolean z11) {
        Map<p, TypeConverter<?>> l11;
        IntTypeConverter intTypeConverter = new IntTypeConverter(z11);
        DoubleTypeConverter doubleTypeConverter = new DoubleTypeConverter(z11);
        FloatTypeConverter floatTypeConverter = new FloatTypeConverter(z11);
        BoolTypeConverter boolTypeConverter = new BoolTypeConverter(z11);
        l11 = s0.l(v.a(o00.d.c(m0.b(Integer.TYPE), null, z11, null, 5, null), intTypeConverter), v.a(o00.d.c(m0.b(Integer.class), null, z11, null, 5, null), intTypeConverter), v.a(o00.d.c(m0.b(Double.TYPE), null, z11, null, 5, null), doubleTypeConverter), v.a(o00.d.c(m0.b(Double.class), null, z11, null, 5, null), doubleTypeConverter), v.a(o00.d.c(m0.b(Float.TYPE), null, z11, null, 5, null), floatTypeConverter), v.a(o00.d.c(m0.b(Float.class), null, z11, null, 5, null), floatTypeConverter), v.a(o00.d.c(m0.b(Boolean.TYPE), null, z11, null, 5, null), boolTypeConverter), v.a(o00.d.c(m0.b(Boolean.class), null, z11, null, 5, null), boolTypeConverter), v.a(o00.d.c(m0.b(String.class), null, z11, null, 5, null), new StringTypeConverter(z11)), v.a(o00.d.c(m0.b(ReadableArray.class), null, z11, null, 5, null), new ReadableArrayTypeConverter(z11)), v.a(o00.d.c(m0.b(ReadableMap.class), null, z11, null, 5, null), new ReadableMapTypeConverter(z11)), v.a(o00.d.c(m0.b(int[].class), null, z11, null, 5, null), new PrimitiveIntArrayTypeConverter(z11)), v.a(o00.d.c(m0.b(double[].class), null, z11, null, 5, null), new PrimitiveDoubleArrayTypeConverter(z11)), v.a(o00.d.c(m0.b(float[].class), null, z11, null, 5, null), new PrimitiveFloatArrayTypeConverter(z11)));
        return l11;
    }

    @Override // expo.modules.kotlin.types.TypeConverterProvider
    public TypeConverter<?> obtainTypeConverter(p type) {
        s.g(type, "type");
        TypeConverter<?> typeConverter = cachedConverters.get(type);
        if (typeConverter == null) {
            f c11 = type.c();
            d<?> dVar = c11 instanceof d ? (d) c11 : null;
            if (dVar != null) {
                if (a.b(dVar).isArray()) {
                    return new ArrayTypeConverter(this, type);
                }
                if (b.i(dVar, m0.b(List.class))) {
                    return new ListTypeConverter(this, type);
                }
                if (b.i(dVar, m0.b(Map.class))) {
                    return new MapTypeConverter(this, type);
                }
                if (b.i(dVar, m0.b(vz.p.class))) {
                    return new PairTypeConverter(this, type);
                }
                if (b.i(dVar, m0.b(Object[].class))) {
                    return new ArrayTypeConverter(this, type);
                }
                if (a.b(dVar).isEnum()) {
                    return new EnumTypeConverter(dVar, type.e());
                }
                Map<d<?>, TypeConverter<?>> map = cachedRecordConverters;
                TypeConverter<?> typeConverter2 = map.get(dVar);
                if (typeConverter2 != null) {
                    return typeConverter2;
                }
                if (b.i(dVar, m0.b(Record.class))) {
                    RecordTypeConverter recordTypeConverter = new RecordTypeConverter(this, type);
                    map.put(dVar, recordTypeConverter);
                    return recordTypeConverter;
                }
                throw new MissingTypeConverter(type);
            }
            throw new MissingTypeConverter(type);
        }
        return typeConverter;
    }
}