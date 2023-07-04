package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final OneofInfo oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    /* renamed from: com.google.protobuf.FieldInfo$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private OneofInfo oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public FieldInfo build() {
            OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                if (this.required) {
                    return FieldInfo.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
                }
                return FieldInfo.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                if (field2 == null) {
                    return FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier);
                }
                return FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (field3 == null) {
                return FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
            }
            return FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z11) {
            this.enforceUtf8 = z11;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            if (this.oneof == null) {
                this.field = field;
                return this;
            }
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }

        public Builder withFieldNumber(int i11) {
            this.fieldNumber = i11;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(OneofInfo oneofInfo, Class<?> cls) {
            if (this.field == null && this.presenceField == null) {
                this.oneof = oneofInfo;
                this.oneofStoredType = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i11) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i11;
            return this;
        }

        public Builder withRequired(boolean z11) {
            this.required = z11;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i11, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i12, boolean z11, boolean z12, OneofInfo oneofInfo, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = cls;
        this.fieldNumber = i11;
        this.presenceField = field2;
        this.presenceMask = i12;
        this.required = z11;
        this.enforceUtf8 = z12;
        this.oneof = oneofInfo;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i11) {
        if (i11 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i11);
    }

    public static FieldInfo forField(java.lang.reflect.Field field, int i11, FieldType fieldType, boolean z11) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i11, fieldType, null, null, 0, false, z11, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int i11, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i11, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo forMapField(java.lang.reflect.Field field, int i11, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i11, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo forOneofMemberField(int i11, FieldType fieldType, OneofInfo oneofInfo, Class<?> cls, boolean z11, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i11);
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(oneofInfo, "oneof");
        Internal.checkNotNull(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new FieldInfo(null, i11, fieldType, null, null, 0, false, z11, oneofInfo, cls, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i11 + " is of type " + fieldType);
    }

    public static FieldInfo forPackedField(java.lang.reflect.Field field, int i11, FieldType fieldType, java.lang.reflect.Field field2) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i11, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i11, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i11, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static FieldInfo forProto2OptionalField(java.lang.reflect.Field field, int i11, FieldType fieldType, java.lang.reflect.Field field2, int i12, boolean z11, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i12)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i12);
        }
        return new FieldInfo(field, i11, fieldType, null, field2, i12, false, z11, null, null, null, enumVerifier, null);
    }

    public static FieldInfo forProto2RequiredField(java.lang.reflect.Field field, int i11, FieldType fieldType, java.lang.reflect.Field field2, int i12, boolean z11, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i12)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i12);
        }
        return new FieldInfo(field, i11, fieldType, null, field2, i12, true, z11, null, null, null, enumVerifier, null);
    }

    public static FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int i11, FieldType fieldType, Class<?> cls) {
        checkFieldNumber(i11);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(cls, "messageClass");
        return new FieldInfo(field, i11, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i11) {
        return i11 != 0 && (i11 & (i11 + (-1))) == 0;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i11 = AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        } else if (i11 == 3 || i11 == 4) {
            return this.messageClass;
        } else {
            return null;
        }
    }

    public OneofInfo getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        return this.fieldNumber - fieldInfo.fieldNumber;
    }
}