package io.realm;

import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: c  reason: collision with root package name */
    static final Map<Class<?>, b> f31967c;

    /* renamed from: d  reason: collision with root package name */
    static final Map<Class<?>, b> f31968d;

    /* renamed from: e  reason: collision with root package name */
    static final Map<Class<?>, b> f31969e;

    /* renamed from: f  reason: collision with root package name */
    static final Map<Class<?>, b> f31970f;

    /* renamed from: a  reason: collision with root package name */
    final io.realm.a f31971a;

    /* renamed from: b  reason: collision with root package name */
    final Table f31972b;

    /* loaded from: classes5.dex */
    static final class a extends io.realm.internal.c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Table table) {
            super((io.realm.internal.c) null, false);
        }

        @Override // io.realm.internal.c
        protected void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override // io.realm.internal.c
        public void c(io.realm.internal.c cVar) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
    }

    /* loaded from: classes5.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final RealmFieldType f31973a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f31974b;

        b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z11) {
            this.f31973a = realmFieldType;
            this.f31974b = z11;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        hashMap.put(String.class, new b(realmFieldType, RealmFieldType.STRING_LIST, true));
        Class cls = Short.TYPE;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Short.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls2 = Integer.TYPE;
        hashMap.put(cls2, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Integer.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls3 = Long.TYPE;
        hashMap.put(cls3, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Long.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls4 = Float.TYPE;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls4, new b(realmFieldType4, realmFieldType5, false));
        hashMap.put(Float.class, new b(realmFieldType4, realmFieldType5, true));
        Class cls5 = Double.TYPE;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        hashMap.put(cls5, new b(realmFieldType6, realmFieldType7, false));
        hashMap.put(Double.class, new b(realmFieldType6, realmFieldType7, true));
        Class cls6 = Boolean.TYPE;
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        hashMap.put(cls6, new b(realmFieldType8, realmFieldType9, false));
        hashMap.put(Boolean.class, new b(realmFieldType8, realmFieldType9, true));
        hashMap.put(Byte.TYPE, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Byte.class, new b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        hashMap.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        hashMap.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        hashMap.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        hashMap.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        hashMap.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        hashMap.put(b0.class, new b(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        f31967c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class, new b(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        Class cls7 = Short.TYPE;
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        hashMap2.put(cls7, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Short.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls2, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Integer.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls3, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Long.class, new b(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        hashMap2.put(cls4, new b(realmFieldType4, realmFieldType17, false));
        hashMap2.put(Float.class, new b(realmFieldType4, realmFieldType17, true));
        Class cls8 = Double.TYPE;
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        hashMap2.put(cls8, new b(realmFieldType6, realmFieldType18, false));
        hashMap2.put(Double.class, new b(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        hashMap2.put(cls6, new b(realmFieldType8, realmFieldType19, false));
        hashMap2.put(Boolean.class, new b(realmFieldType8, realmFieldType19, true));
        hashMap2.put(Byte.TYPE, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Byte.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(byte[].class, new b(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(Date.class, new b(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        hashMap2.put(UUID.class, new b(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(b0.class, new b(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f31968d = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(String.class, new b(realmFieldType, RealmFieldType.STRING_SET, true));
        Class cls9 = Short.TYPE;
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        hashMap3.put(cls9, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Short.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls2, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Integer.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls3, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Long.class, new b(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        hashMap3.put(cls4, new b(realmFieldType4, realmFieldType21, false));
        hashMap3.put(Float.class, new b(realmFieldType4, realmFieldType21, true));
        Class cls10 = Double.TYPE;
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        hashMap3.put(cls10, new b(realmFieldType6, realmFieldType22, false));
        hashMap3.put(Double.class, new b(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        hashMap3.put(cls6, new b(realmFieldType8, realmFieldType23, false));
        hashMap3.put(Boolean.class, new b(realmFieldType8, realmFieldType23, true));
        hashMap3.put(Byte.TYPE, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Byte.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_SET, true));
        hashMap3.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_SET, true));
        hashMap3.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_SET, true));
        hashMap3.put(b0.class, new b(realmFieldType15, RealmFieldType.MIXED_SET, true));
        f31969e = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(n0.class, new b(RealmFieldType.OBJECT, null, false));
        hashMap4.put(i0.class, new b(RealmFieldType.LIST, null, false));
        hashMap4.put(h0.class, new b(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        hashMap4.put(s0.class, new b(RealmFieldType.LINK_SET, null, false));
        f31970f = Collections.unmodifiableMap(hashMap4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(io.realm.a aVar, r0 r0Var, Table table, io.realm.internal.c cVar) {
        this.f31971a = aVar;
        this.f31972b = table;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.contains(".")) {
                if (str.length() > 63) {
                    throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
                }
                return;
            }
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        throw new IllegalArgumentException("Field name can not be null or empty");
    }

    public abstract p0 a(String str, Class<?> cls, k... kVarArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (this.f31972b.j(str) != -1) {
            return;
        }
        throw new IllegalArgumentException("Field name doesn't exist on object '" + d() + "': " + str);
    }

    public String d() {
        return this.f31972b.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long e(String str) {
        long j11 = this.f31972b.j(str);
        if (j11 != -1) {
            return j11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, d()));
    }

    public RealmFieldType f(String str) {
        return this.f31972b.m(e(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table g() {
        return this.f31972b;
    }
}