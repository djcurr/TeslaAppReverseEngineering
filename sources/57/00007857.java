package io.realm.internal;

import ch.qos.logback.core.net.SyslogConstants;
import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes5.dex */
public class Property implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final long f31889b = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private long f31890a;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31891a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f31891a = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31891a[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31891a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31891a[RealmFieldType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31891a[RealmFieldType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31891a[RealmFieldType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31891a[RealmFieldType.BINARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31891a[RealmFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31891a[RealmFieldType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31891a[RealmFieldType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31891a[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31891a[RealmFieldType.UUID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31891a[RealmFieldType.MIXED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31891a[RealmFieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31891a[RealmFieldType.INTEGER_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31891a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31891a[RealmFieldType.STRING_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31891a[RealmFieldType.BINARY_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f31891a[RealmFieldType.DATE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31891a[RealmFieldType.FLOAT_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31891a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31891a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31891a[RealmFieldType.UUID_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31891a[RealmFieldType.DOUBLE_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31891a[RealmFieldType.MIXED_LIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f31891a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f31891a[RealmFieldType.BOOLEAN_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f31891a[RealmFieldType.STRING_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f31891a[RealmFieldType.INTEGER_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f31891a[RealmFieldType.FLOAT_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f31891a[RealmFieldType.DOUBLE_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f31891a[RealmFieldType.BINARY_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f31891a[RealmFieldType.DATE_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f31891a[RealmFieldType.DECIMAL128_SET.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f31891a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f31891a[RealmFieldType.UUID_SET.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f31891a[RealmFieldType.LINK_SET.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f31891a[RealmFieldType.MIXED_SET.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Property(long j11) {
        this.f31890a = j11;
        g.f31933c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RealmFieldType realmFieldType, boolean z11) {
        int i11 = 1;
        switch (a.f31891a[realmFieldType.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                i11 = 0;
                break;
            case 5:
                break;
            case 6:
                i11 = 2;
                break;
            case 7:
                i11 = 3;
                break;
            case 8:
                i11 = 4;
                break;
            case 9:
                i11 = 5;
                break;
            case 10:
                i11 = 11;
                break;
            case 11:
                i11 = 10;
                break;
            case 12:
                i11 = 12;
                break;
            case 13:
                i11 = 9;
                break;
            case 14:
                i11 = 6;
                break;
            case 15:
                i11 = 128;
                break;
            case 16:
                i11 = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
                break;
            case 17:
                i11 = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
                break;
            case 18:
                i11 = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE;
                break;
            case 19:
                i11 = 132;
                break;
            case 20:
                i11 = 133;
                break;
            case 21:
                i11 = 139;
                break;
            case 22:
                i11 = 138;
                break;
            case 23:
                i11 = 140;
                break;
            case 24:
                i11 = 134;
                break;
            case 25:
                i11 = 137;
                break;
            case 26:
                i11 = 521;
                break;
            case 27:
                i11 = 513;
                break;
            case 28:
                i11 = SyslogConstants.SYSLOG_PORT;
                break;
            case 29:
                i11 = 512;
                break;
            case 30:
                i11 = 517;
                break;
            case 31:
                i11 = 518;
                break;
            case 32:
                i11 = 515;
                break;
            case 33:
                i11 = 516;
                break;
            case 34:
                i11 = 523;
                break;
            case 35:
                i11 = 522;
                break;
            case 36:
                i11 = 524;
                break;
            case 37:
                i11 = 519;
                break;
            case 38:
                i11 = 257;
                break;
            case 39:
                i11 = 258;
                break;
            case 40:
                i11 = 256;
                break;
            case 41:
                i11 = 261;
                break;
            case 42:
                i11 = 262;
                break;
            case 43:
                i11 = 259;
                break;
            case 44:
                i11 = 260;
                break;
            case 45:
                i11 = 267;
                break;
            case 46:
                i11 = 266;
                break;
            case 47:
                i11 = 268;
                break;
            case 48:
                return 263;
            case 49:
                i11 = 265;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", realmFieldType.name()));
        }
        return i11 | (z11 ? 0 : 64);
    }

    private static RealmFieldType b(int i11) {
        int i12 = i11 & (-65);
        switch (i12) {
            case 0:
                return RealmFieldType.INTEGER;
            case 1:
                return RealmFieldType.BOOLEAN;
            case 2:
                return RealmFieldType.STRING;
            case 3:
                return RealmFieldType.BINARY;
            case 4:
                return RealmFieldType.DATE;
            case 5:
                return RealmFieldType.FLOAT;
            case 6:
                return RealmFieldType.DOUBLE;
            case 7:
                return RealmFieldType.OBJECT;
            default:
                switch (i12) {
                    case 9:
                        return RealmFieldType.MIXED;
                    case 10:
                        return RealmFieldType.OBJECT_ID;
                    case 11:
                        return RealmFieldType.DECIMAL128;
                    case 12:
                        return RealmFieldType.UUID;
                    default:
                        switch (i12) {
                            case 128:
                                return RealmFieldType.INTEGER_LIST;
                            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                return RealmFieldType.BOOLEAN_LIST;
                            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                return RealmFieldType.STRING_LIST;
                            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                                return RealmFieldType.BINARY_LIST;
                            case 132:
                                return RealmFieldType.DATE_LIST;
                            case 133:
                                return RealmFieldType.FLOAT_LIST;
                            case 134:
                                return RealmFieldType.DOUBLE_LIST;
                            case 135:
                                return RealmFieldType.LIST;
                            case 136:
                                return RealmFieldType.LINKING_OBJECTS;
                            case 137:
                                return RealmFieldType.MIXED_LIST;
                            case 138:
                                return RealmFieldType.OBJECT_ID_LIST;
                            case 139:
                                return RealmFieldType.DECIMAL128_LIST;
                            case 140:
                                return RealmFieldType.UUID_LIST;
                            default:
                                switch (i12) {
                                    case 256:
                                        return RealmFieldType.INTEGER_SET;
                                    case 257:
                                        return RealmFieldType.BOOLEAN_SET;
                                    case 258:
                                        return RealmFieldType.STRING_SET;
                                    case 259:
                                        return RealmFieldType.BINARY_SET;
                                    case 260:
                                        return RealmFieldType.DATE_SET;
                                    case 261:
                                        return RealmFieldType.FLOAT_SET;
                                    case 262:
                                        return RealmFieldType.DOUBLE_SET;
                                    case 263:
                                        return RealmFieldType.LINK_SET;
                                    default:
                                        switch (i12) {
                                            case 265:
                                                return RealmFieldType.MIXED_SET;
                                            case 266:
                                                return RealmFieldType.OBJECT_ID_SET;
                                            case 267:
                                                return RealmFieldType.DECIMAL128_SET;
                                            case 268:
                                                return RealmFieldType.UUID_SET;
                                            default:
                                                switch (i12) {
                                                    case 512:
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    case 513:
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    case SyslogConstants.SYSLOG_PORT /* 514 */:
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    case 515:
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    case 516:
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    case 517:
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    case 518:
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    case 519:
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    default:
                                                        switch (i12) {
                                                            case 521:
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            case 522:
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            case 523:
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            case 524:
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            default:
                                                                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", Integer.valueOf(i11)));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    static native long nativeCreateComputedLinkProperty(String str, String str2, String str3);

    static native long nativeCreatePersistedLinkProperty(String str, String str2, int i11, String str3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreatePersistedProperty(String str, String str2, int i11, boolean z11, boolean z12);

    private static native long nativeGetColumnKey(long j11);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j11);

    private static native int nativeGetType(long j11);

    public long c() {
        return nativeGetColumnKey(this.f31890a);
    }

    public String d() {
        return nativeGetLinkedObjectName(this.f31890a);
    }

    public RealmFieldType e() {
        return b(nativeGetType(this.f31890a));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31889b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31890a;
    }
}