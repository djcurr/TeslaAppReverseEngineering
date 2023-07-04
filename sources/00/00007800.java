package io.realm;

import ch.qos.logback.core.net.SyslogConstants;
import io.realm.internal.Keep;

@Keep
/* loaded from: classes5.dex */
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    UUID(17),
    MIXED(6),
    TYPED_LINK(16),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE),
    STRING_LIST(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138),
    DECIMAL128_LIST(139),
    OBJECT_ID_LIST(143),
    UUID_LIST(145),
    MIXED_LIST(134),
    STRING_TO_INTEGER_MAP(512),
    STRING_TO_BOOLEAN_MAP(513),
    STRING_TO_STRING_MAP(SyslogConstants.SYSLOG_PORT),
    STRING_TO_BINARY_MAP(516),
    STRING_TO_DATE_MAP(520),
    STRING_TO_FLOAT_MAP(521),
    STRING_TO_DOUBLE_MAP(522),
    STRING_TO_DECIMAL128_MAP(523),
    STRING_TO_OBJECT_ID_MAP(527),
    STRING_TO_UUID_MAP(529),
    STRING_TO_MIXED_MAP(518),
    STRING_TO_LINK_MAP(524),
    INTEGER_SET(256),
    BOOLEAN_SET(257),
    STRING_SET(258),
    BINARY_SET(260),
    DATE_SET(264),
    FLOAT_SET(265),
    DOUBLE_SET(266),
    DECIMAL128_SET(267),
    OBJECT_ID_SET(271),
    UUID_SET(273),
    LINK_SET(268),
    MIXED_SET(262);
    
    private static final RealmFieldType[] basicTypes = new RealmFieldType[18];
    private static final RealmFieldType[] listTypes = new RealmFieldType[18];
    private static final RealmFieldType[] mapTypes = new RealmFieldType[18];
    private static final RealmFieldType[] setTypes = new RealmFieldType[18];
    private final int nativeValue;

    static {
        RealmFieldType[] values;
        for (RealmFieldType realmFieldType : values()) {
            int i11 = realmFieldType.nativeValue;
            if (i11 < 128) {
                basicTypes[i11] = realmFieldType;
            } else if (i11 < 256) {
                listTypes[i11 - 128] = realmFieldType;
            } else {
                if (i11 < 512) {
                    setTypes[i11 - 256] = realmFieldType;
                } else {
                    mapTypes[i11 - 512] = realmFieldType;
                }
            }
        }
    }

    RealmFieldType(int i11) {
        this.nativeValue = i11;
    }

    public static RealmFieldType fromNativeValue(int i11) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        RealmFieldType realmFieldType3;
        RealmFieldType realmFieldType4;
        if (i11 >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i11 < realmFieldTypeArr.length && (realmFieldType4 = realmFieldTypeArr[i11]) != null) {
                return realmFieldType4;
            }
        }
        if (128 <= i11 && i11 < 256) {
            int i12 = i11 - 128;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i12 < realmFieldTypeArr2.length && (realmFieldType3 = realmFieldTypeArr2[i12]) != null) {
                return realmFieldType3;
            }
        }
        if (256 <= i11 && i11 < 512) {
            int i13 = i11 - 256;
            RealmFieldType[] realmFieldTypeArr3 = setTypes;
            if (i13 < realmFieldTypeArr3.length && (realmFieldType2 = realmFieldTypeArr3[i13]) != null) {
                return realmFieldType2;
            }
        }
        if (512 <= i11) {
            int i14 = i11 - 512;
            RealmFieldType[] realmFieldTypeArr4 = mapTypes;
            if (i14 < realmFieldTypeArr4.length && (realmFieldType = realmFieldTypeArr4[i14]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: " + i11);
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public boolean isValid(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.nativeValue
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L67
            if (r0 == r1) goto L64
            r3 = 2
            if (r0 == r3) goto L61
            r3 = 4
            if (r0 == r3) goto L56
            r1 = 6
            if (r0 == r1) goto L53
            switch(r0) {
                case 6: goto L53;
                case 17: goto L50;
                case 132: goto L4f;
                case 134: goto L4f;
                case 143: goto L4f;
                case 145: goto L4f;
                case 260: goto L4f;
                case 262: goto L4f;
                case 271: goto L4f;
                case 273: goto L4f;
                case 516: goto L4f;
                case 518: goto L4f;
                case 527: goto L4f;
                case 529: goto L4f;
                default: goto L14;
            }
        L14:
            switch(r0) {
                case 8: goto L4c;
                case 9: goto L49;
                case 10: goto L46;
                case 11: goto L43;
                case 12: goto L4f;
                case 13: goto L4f;
                case 14: goto L4f;
                case 15: goto L40;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 128: goto L4f;
                case 129: goto L4f;
                case 130: goto L4f;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 136: goto L4f;
                case 137: goto L4f;
                case 138: goto L4f;
                case 139: goto L4f;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 256: goto L4f;
                case 257: goto L4f;
                case 258: goto L4f;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 264: goto L4f;
                case 265: goto L4f;
                case 266: goto L4f;
                case 267: goto L4f;
                case 268: goto L4f;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 512: goto L4f;
                case 513: goto L4f;
                case 514: goto L4f;
                default: goto L26;
            }
        L26:
            switch(r0) {
                case 520: goto L4f;
                case 521: goto L4f;
                case 522: goto L4f;
                case 523: goto L4f;
                case 524: goto L4f;
                default: goto L29;
            }
        L29:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported Realm type:  "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L40:
            boolean r5 = r5 instanceof org.bson.types.ObjectId
            return r5
        L43:
            boolean r5 = r5 instanceof org.bson.types.Decimal128
            return r5
        L46:
            boolean r5 = r5 instanceof java.lang.Double
            return r5
        L49:
            boolean r5 = r5 instanceof java.lang.Float
            return r5
        L4c:
            boolean r5 = r5 instanceof java.util.Date
            return r5
        L4f:
            return r2
        L50:
            boolean r5 = r5 instanceof java.util.UUID
            return r5
        L53:
            boolean r5 = r5 instanceof io.realm.b0
            return r5
        L56:
            boolean r0 = r5 instanceof byte[]
            if (r0 != 0) goto L60
            boolean r5 = r5 instanceof java.nio.ByteBuffer
            if (r5 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            boolean r5 = r5 instanceof java.lang.String
            return r5
        L64:
            boolean r5 = r5 instanceof java.lang.Boolean
            return r5
        L67:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L79
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L79
            boolean r0 = r5 instanceof java.lang.Short
            if (r0 != 0) goto L79
            boolean r5 = r5 instanceof java.lang.Byte
            if (r5 == 0) goto L78
            goto L79
        L78:
            r1 = r2
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmFieldType.isValid(java.lang.Object):boolean");
    }
}