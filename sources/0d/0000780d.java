package io.realm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f31758a;

    /* loaded from: classes5.dex */
    public enum a {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, l0.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);
        
        private static final a[] realmFieldToRealmAnyTypeMap = new a[19];
        private final Class<?> clazz;
        private final RealmFieldType realmFieldType;

        static {
            a[] values;
            for (a aVar : values()) {
                if (aVar != NULL) {
                    realmFieldToRealmAnyTypeMap[aVar.realmFieldType.getNativeValue()] = aVar;
                }
            }
            realmFieldToRealmAnyTypeMap[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        a(RealmFieldType realmFieldType, Class cls) {
            this.realmFieldType = realmFieldType;
            this.clazz = cls;
        }

        public static a fromNativeValue(int i11) {
            if (i11 == -1) {
                return NULL;
            }
            return realmFieldToRealmAnyTypeMap[i11];
        }

        public Class<?> getTypedClass() {
            return this.clazz;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(d0 d0Var) {
        this.f31758a = d0Var;
    }

    public static b0 b(String str) {
        return new b0(str == null ? new s() : new t0(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        return this.f31758a.c();
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f31758a.equals(((b0) obj).f31758a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31758a.hashCode();
    }

    public String toString() {
        return this.f31758a.toString();
    }
}