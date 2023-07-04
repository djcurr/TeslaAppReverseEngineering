package io.realm;

import ch.qos.logback.classic.spi.CallerData;
import com.adyen.checkout.components.model.payments.request.Address;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class j extends n0 implements io.realm.internal.m {

    /* renamed from: a  reason: collision with root package name */
    private final z<j> f31960a;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31961a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f31962b;

        static {
            int[] iArr = new int[b.values().length];
            f31962b = iArr;
            try {
                iArr[b.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31962b[b.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31962b[b.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            f31961a = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31961a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31961a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31961a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31961a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31961a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31961a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31961a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31961a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31961a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31961a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31961a[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31961a[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f31961a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f31961a[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f31961a[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f31961a[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f31961a[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f31961a[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f31961a[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f31961a[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f31961a[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f31961a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f31961a[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f31961a[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f31961a[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f31961a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f31961a[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f31961a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f31961a[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f31961a[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f31961a[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f31961a[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f31961a[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f31961a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f31961a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f31961a[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f31961a[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private enum b {
        LIST,
        DICTIONARY,
        SET
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(io.realm.a aVar, io.realm.internal.o oVar) {
        z<j> zVar = new z<>(this);
        this.f31960a = zVar;
        zVar.k(aVar);
        zVar.l(oVar);
        zVar.i();
    }

    private b0 l(long j11) {
        return new b0(d0.b(this.f31960a.c(), this.f31960a.d().getNativeRealmAny(j11)));
    }

    @Override // io.realm.internal.m
    public z d() {
        return this.f31960a;
    }

    public boolean equals(Object obj) {
        this.f31960a.c().g();
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        String path = this.f31960a.c().getPath();
        String path2 = jVar.f31960a.c().getPath();
        if (path == null ? path2 == null : path.equals(path2)) {
            String o11 = this.f31960a.d().getTable().o();
            String o12 = jVar.f31960a.d().getTable().o();
            if (o11 == null ? o12 == null : o11.equals(o12)) {
                return this.f31960a.d().getObjectKey() == jVar.f31960a.d().getObjectKey();
            }
            return false;
        }
        return false;
    }

    @Override // io.realm.internal.m
    public void f() {
    }

    public int hashCode() {
        this.f31960a.c().g();
        String path = this.f31960a.c().getPath();
        String o11 = this.f31960a.d().getTable().o();
        long objectKey = this.f31960a.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (o11 != null ? o11.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String[] k() {
        this.f31960a.c().g();
        return this.f31960a.d().getColumnNames();
    }

    public String toString() {
        this.f31960a.c().g();
        if (this.f31960a.d().isValid()) {
            String g11 = this.f31960a.d().getTable().g();
            StringBuilder sb2 = new StringBuilder(g11 + " = dynamic[");
            String[] k11 = k();
            int length = k11.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = k11[i11];
                long columnKey = this.f31960a.d().getColumnKey(str);
                RealmFieldType columnType = this.f31960a.d().getColumnType(columnKey);
                sb2.append("{");
                sb2.append(str);
                sb2.append(":");
                int i12 = a.f31961a[columnType.ordinal()];
                String str2 = Address.ADDRESS_NULL_PLACEHOLDER;
                switch (i12) {
                    case 1:
                        Boolean bool = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            bool = Boolean.valueOf(this.f31960a.d().getBoolean(columnKey));
                        }
                        sb2.append(bool);
                        break;
                    case 2:
                        Long l11 = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            l11 = Long.valueOf(this.f31960a.d().getLong(columnKey));
                        }
                        sb2.append(l11);
                        break;
                    case 3:
                        Float f11 = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            f11 = Float.valueOf(this.f31960a.d().getFloat(columnKey));
                        }
                        sb2.append(f11);
                        break;
                    case 4:
                        Double d11 = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            d11 = Double.valueOf(this.f31960a.d().getDouble(columnKey));
                        }
                        sb2.append(d11);
                        break;
                    case 5:
                        sb2.append(this.f31960a.d().getString(columnKey));
                        break;
                    case 6:
                        sb2.append(Arrays.toString(this.f31960a.d().getBinaryByteArray(columnKey)));
                        break;
                    case 7:
                        Date date = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            date = this.f31960a.d().getDate(columnKey);
                        }
                        sb2.append(date);
                        break;
                    case 8:
                        Decimal128 decimal128 = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            decimal128 = this.f31960a.d().getDecimal128(columnKey);
                        }
                        sb2.append(decimal128);
                        break;
                    case 9:
                        ObjectId objectId = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            objectId = this.f31960a.d().getObjectId(columnKey);
                        }
                        sb2.append(objectId);
                        break;
                    case 10:
                        String str3 = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            str3 = l(columnKey);
                        }
                        sb2.append(str3);
                        break;
                    case 11:
                        UUID uuid = str2;
                        if (!this.f31960a.d().isNull(columnKey)) {
                            uuid = this.f31960a.d().getUUID(columnKey);
                        }
                        sb2.append(uuid);
                        break;
                    case 12:
                        String str4 = str2;
                        if (!this.f31960a.d().isNullLink(columnKey)) {
                            str4 = this.f31960a.d().getTable().n(columnKey).g();
                        }
                        sb2.append(str4);
                        break;
                    case 13:
                        sb2.append(String.format(Locale.US, "RealmList<%s>[%s]", this.f31960a.d().getTable().n(columnKey).g(), Long.valueOf(this.f31960a.d().getModelList(columnKey).a())));
                        break;
                    case 14:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 15:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 16:
                        sb2.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 17:
                        sb2.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 18:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 19:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 20:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 21:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 22:
                        sb2.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 23:
                        sb2.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 24:
                        sb2.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.f31960a.d().getValueMap(columnKey, columnType).a())));
                        break;
                    case 25:
                        sb2.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.f31960a.d().getTable().n(columnKey).g(), Long.valueOf(this.f31960a.d().getModelMap(columnKey).a())));
                        break;
                    case 26:
                        sb2.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 27:
                        sb2.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 28:
                        sb2.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 29:
                        sb2.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 30:
                        sb2.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 31:
                        sb2.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 32:
                        sb2.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 33:
                        sb2.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 34:
                        sb2.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 35:
                        sb2.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 36:
                        sb2.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.f31960a.d().getTable().n(columnKey).g(), Long.valueOf(this.f31960a.d().getModelSet(columnKey).a())));
                        break;
                    case 37:
                        sb2.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.f31960a.d().getValueSet(columnKey, columnType).a())));
                        break;
                    case 38:
                    default:
                        sb2.append(CallerData.NA);
                        break;
                    case 39:
                        sb2.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 40:
                        sb2.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 41:
                        sb2.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 42:
                        sb2.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 43:
                        sb2.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 44:
                        sb2.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 45:
                        sb2.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 46:
                        sb2.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 47:
                        sb2.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 48:
                        sb2.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                    case 49:
                        sb2.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.f31960a.d().getValueList(columnKey, columnType).a())));
                        break;
                }
                sb2.append("},");
            }
            sb2.replace(sb2.length() - 1, sb2.length(), "");
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }
}