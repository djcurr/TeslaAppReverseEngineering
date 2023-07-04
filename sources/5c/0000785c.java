package io.realm.internal;

import io.realm.RealmFieldType;

/* loaded from: classes5.dex */
public class Table implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f31893d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f31894e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f31895f;

    /* renamed from: a  reason: collision with root package name */
    private final long f31896a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31897b;

    /* renamed from: c  reason: collision with root package name */
    private final OsSharedRealm f31898c;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31899a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f31899a = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31899a[RealmFieldType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31899a[RealmFieldType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31899a[RealmFieldType.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31899a[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31899a[RealmFieldType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31899a[RealmFieldType.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31899a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31899a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31899a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31899a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31899a[RealmFieldType.INTEGER_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31899a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31899a[RealmFieldType.STRING_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31899a[RealmFieldType.BINARY_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31899a[RealmFieldType.DATE_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31899a[RealmFieldType.FLOAT_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31899a[RealmFieldType.DOUBLE_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f31899a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31899a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31899a[RealmFieldType.UUID_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31899a[RealmFieldType.MIXED_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f31899a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f31899a[RealmFieldType.INTEGER_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f31899a[RealmFieldType.BOOLEAN_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f31899a[RealmFieldType.STRING_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f31899a[RealmFieldType.BINARY_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f31899a[RealmFieldType.DATE_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f31899a[RealmFieldType.FLOAT_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f31899a[RealmFieldType.DOUBLE_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f31899a[RealmFieldType.DECIMAL128_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f31899a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f31899a[RealmFieldType.UUID_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f31899a[RealmFieldType.MIXED_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    static {
        String c11 = Util.c();
        f31893d = c11;
        f31894e = 63 - c11.length();
        f31895f = nativeGetFinalizerPtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table(OsSharedRealm osSharedRealm, long j11) {
        g gVar = osSharedRealm.context;
        this.f31897b = gVar;
        this.f31898c = osSharedRealm;
        this.f31896a = j11;
        gVar.a(this);
    }

    private static void C() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    private void D(String str) {
        if (str.length() > 63) {
            throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        String str2 = f31893d;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    private native long nativeAddColumn(long j11, int i11, String str, boolean z11);

    private native long nativeAddColumnDictionaryLink(long j11, int i11, String str, long j12);

    private native long nativeAddColumnLink(long j11, int i11, String str, long j12);

    private native long nativeAddColumnSetLink(long j11, int i11, String str, long j12);

    private native long nativeAddPrimitiveDictionaryColumn(long j11, int i11, String str, boolean z11);

    private native long nativeAddPrimitiveListColumn(long j11, int i11, String str, boolean z11);

    private native long nativeAddPrimitiveSetColumn(long j11, int i11, String str, boolean z11);

    private native void nativeAddSearchIndex(long j11, long j12);

    private native void nativeClear(long j11);

    private native void nativeConvertColumnToNotNullable(long j11, long j12, boolean z11);

    private native void nativeConvertColumnToNullable(long j11, long j12, boolean z11);

    private native long nativeCountDouble(long j11, long j12, double d11);

    private native long nativeCountFloat(long j11, long j12, float f11);

    private native long nativeCountLong(long j11, long j12, long j13);

    private native long nativeCountString(long j11, long j12, String str);

    private native long nativeFindFirstBool(long j11, long j12, boolean z11);

    public static native long nativeFindFirstDecimal128(long j11, long j12, long j13, long j14);

    private native long nativeFindFirstDouble(long j11, long j12, double d11);

    private native long nativeFindFirstFloat(long j11, long j12, float f11);

    public static native long nativeFindFirstInt(long j11, long j12, long j13);

    public static native long nativeFindFirstNull(long j11, long j12);

    public static native long nativeFindFirstObjectId(long j11, long j12, String str);

    public static native long nativeFindFirstString(long j11, long j12, String str);

    private native long nativeFindFirstTimestamp(long j11, long j12, long j13);

    public static native long nativeFindFirstUUID(long j11, long j12, String str);

    private static native long nativeFreeze(long j11, long j12);

    private native boolean nativeGetBoolean(long j11, long j12, long j13);

    private native byte[] nativeGetByteArray(long j11, long j12, long j13);

    private native long nativeGetColumnCount(long j11);

    private native long nativeGetColumnKey(long j11, String str);

    private native String nativeGetColumnName(long j11, long j12);

    private native String[] nativeGetColumnNames(long j11);

    private native int nativeGetColumnType(long j11, long j12);

    private native long[] nativeGetDecimal128(long j11, long j12, long j13);

    private native double nativeGetDouble(long j11, long j12, long j13);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long j11, long j12, long j13);

    private native long nativeGetLink(long j11, long j12, long j13);

    private native long nativeGetLinkTarget(long j11, long j12);

    private native long nativeGetLong(long j11, long j12, long j13);

    private native String nativeGetName(long j11);

    private native String nativeGetObjectId(long j11, long j12, long j13);

    private native String nativeGetString(long j11, long j12, long j13);

    private native long nativeGetTimestamp(long j11, long j12, long j13);

    private native boolean nativeHasSameSchema(long j11, long j12);

    private native boolean nativeHasSearchIndex(long j11, long j12);

    public static native void nativeIncrementLong(long j11, long j12, long j13, long j14);

    private native boolean nativeIsColumnNullable(long j11, long j12);

    private static native boolean nativeIsEmbedded(long j11);

    private native boolean nativeIsNull(long j11, long j12, long j13);

    private native boolean nativeIsNullLink(long j11, long j12, long j13);

    private native boolean nativeIsValid(long j11);

    private native void nativeMoveLastOver(long j11, long j12);

    public static native void nativeNullifyLink(long j11, long j12, long j13);

    private native void nativeRemoveColumn(long j11, long j12);

    private native void nativeRemoveSearchIndex(long j11, long j12);

    private native void nativeRenameColumn(long j11, long j12, String str);

    public static native void nativeSetBoolean(long j11, long j12, long j13, boolean z11, boolean z12);

    public static native void nativeSetByteArray(long j11, long j12, long j13, byte[] bArr, boolean z11);

    public static native void nativeSetDecimal128(long j11, long j12, long j13, long j14, long j15, boolean z11);

    public static native void nativeSetDouble(long j11, long j12, long j13, double d11, boolean z11);

    private static native boolean nativeSetEmbedded(long j11, boolean z11);

    public static native void nativeSetFloat(long j11, long j12, long j13, float f11, boolean z11);

    public static native void nativeSetLink(long j11, long j12, long j13, long j14, boolean z11);

    public static native void nativeSetLong(long j11, long j12, long j13, long j14, boolean z11);

    public static native void nativeSetNull(long j11, long j12, long j13, boolean z11);

    public static native void nativeSetObjectId(long j11, long j12, long j13, String str, boolean z11);

    public static native void nativeSetRealmAny(long j11, long j12, long j13, long j14, boolean z11);

    public static native void nativeSetString(long j11, long j12, long j13, String str, boolean z11);

    public static native void nativeSetTimestamp(long j11, long j12, long j13, long j14, boolean z11);

    public static native void nativeSetUUID(long j11, long j12, long j13, String str, boolean z11);

    private native long nativeSize(long j11);

    private native long nativeWhere(long j11);

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        return f31893d + str;
    }

    public void A(long j11, long j12, String str, boolean z11) {
        c();
        if (str == null) {
            nativeSetNull(this.f31896a, j11, j12, z11);
        } else {
            nativeSetString(this.f31896a, j11, j12, str, z11);
        }
    }

    public long B() {
        return nativeSize(this.f31896a);
    }

    public TableQuery E() {
        return new TableQuery(this.f31897b, this, nativeWhere(this.f31896a));
    }

    public long a(RealmFieldType realmFieldType, String str, boolean z11) {
        D(str);
        switch (a.f31899a[realmFieldType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return nativeAddColumn(this.f31896a, realmFieldType.getNativeValue(), str, z11);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return nativeAddPrimitiveListColumn(this.f31896a, realmFieldType.getNativeValue() - 128, str, z11);
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return nativeAddPrimitiveDictionaryColumn(this.f31896a, realmFieldType.getNativeValue() - 512, str, z11);
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return nativeAddPrimitiveSetColumn(this.f31896a, realmFieldType.getNativeValue() - 256, str, z11);
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
    }

    public void b(long j11) {
        c();
        nativeAddSearchIndex(this.f31896a, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (u()) {
            C();
        }
    }

    public long d(long j11) {
        return nativeFindFirstNull(this.f31896a, j11);
    }

    public long e(long j11, String str) {
        if (str != null) {
            return nativeFindFirstString(this.f31896a, j11, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public CheckedRow f(long j11) {
        return CheckedRow.d(this.f31897b, this, j11);
    }

    public String g() {
        String h11 = h(o());
        if (Util.e(h11)) {
            throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
        }
        return h11;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31895f;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31896a;
    }

    public long i() {
        return nativeGetColumnCount(this.f31896a);
    }

    public long j(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f31896a, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String k(long j11) {
        return nativeGetColumnName(this.f31896a, j11);
    }

    public String[] l() {
        return nativeGetColumnNames(this.f31896a);
    }

    public RealmFieldType m(long j11) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f31896a, j11));
    }

    public Table n(long j11) {
        return new Table(this.f31898c, nativeGetLinkTarget(this.f31896a, j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long nativeGetRowPtr(long j11, long j12);

    public String o() {
        return nativeGetName(this.f31896a);
    }

    public OsSharedRealm p() {
        return this.f31898c;
    }

    public UncheckedRow r(long j11) {
        return UncheckedRow.a(this.f31897b, this, j11);
    }

    public UncheckedRow s(long j11) {
        return UncheckedRow.b(this.f31897b, this, j11);
    }

    public boolean t(long j11) {
        return nativeHasSearchIndex(this.f31896a, j11);
    }

    public String toString() {
        long i11 = i();
        String o11 = o();
        StringBuilder sb2 = new StringBuilder("The Table ");
        if (o11 != null && !o11.isEmpty()) {
            sb2.append(o());
            sb2.append(" ");
        }
        sb2.append("contains ");
        sb2.append(i11);
        sb2.append(" columns: ");
        String[] l11 = l();
        int length = l11.length;
        boolean z11 = true;
        int i12 = 0;
        while (i12 < length) {
            String str = l11[i12];
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(str);
            i12++;
            z11 = false;
        }
        sb2.append(".");
        sb2.append(" And ");
        sb2.append(B());
        sb2.append(" rows.");
        return sb2.toString();
    }

    boolean u() {
        OsSharedRealm osSharedRealm = this.f31898c;
        return (osSharedRealm == null || osSharedRealm.isInTransaction()) ? false : true;
    }

    public boolean v() {
        long j11 = this.f31896a;
        return j11 != 0 && nativeIsValid(j11);
    }

    public void w(long j11) {
        String g11 = g();
        String k11 = k(j11);
        String b11 = OsObjectStore.b(this.f31898c, g());
        nativeRemoveColumn(this.f31896a, j11);
        if (k11.equals(b11)) {
            OsObjectStore.d(this.f31898c, g11, null);
        }
    }

    public void x(long j11) {
        c();
        nativeRemoveSearchIndex(this.f31896a, j11);
    }

    public void y(long j11, long j12, byte[] bArr, boolean z11) {
        c();
        nativeSetByteArray(this.f31896a, j11, j12, bArr, z11);
    }

    public void z(long j11, long j12, boolean z11) {
        c();
        nativeSetNull(this.f31896a, j11, j12, z11);
    }
}