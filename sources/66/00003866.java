package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    static final int f16377a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f16378b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f16379c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f16380d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;

        /* loaded from: classes3.dex */
        enum a extends b {
            a(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.r1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0300b extends b {
            C0300b(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.r1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* loaded from: classes3.dex */
        enum c extends b {
            c(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.r1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* loaded from: classes3.dex */
        enum d extends b {
            d(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.r1.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0300b c0300b = new C0300b("GROUP", 9, cVar3, 3);
            GROUP = c0300b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0300b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private b(String str, int i11, c cVar, int i12) {
            this.javaType = cVar;
            this.wireType = i12;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f16278b),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public static int a(int i11) {
        return i11 >>> 3;
    }

    public static int b(int i11) {
        return i11 & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i11, int i12) {
        return (i11 << 3) | i12;
    }
}