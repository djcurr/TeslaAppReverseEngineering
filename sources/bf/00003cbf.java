package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.MessageSchema$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i11, int i12, MessageLite messageLite, boolean z11, boolean z12, int[] iArr2, int i13, int i14, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i11;
        this.maxFieldNumber = i12;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z11;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z12;
        this.intArray = iArr2;
        this.checkInitializedCount = i13;
        this.repeatedFieldOffsetStart = i14;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t11, T t12, int i11) {
        return isFieldPresent(t11, i11) == isFieldPresent(t12, i11);
    }

    private static <T> boolean booleanAt(T t11, long j11) {
        return UnsafeUtil.getBoolean(t11, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i11, int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) {
        int i13;
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
        int i14 = registers.int1;
        if (i14 >= 0 && i14 <= i12 - decodeVarint32) {
            int i15 = decodeVarint32 + i14;
            K k11 = metadata.defaultKey;
            V v11 = metadata.defaultValue;
            while (decodeVarint32 < i15) {
                int i16 = decodeVarint32 + 1;
                byte b11 = bArr[decodeVarint32];
                if (b11 < 0) {
                    i13 = ArrayDecoders.decodeVarint32(b11, bArr, i16, registers);
                    b11 = registers.int1;
                } else {
                    i13 = i16;
                }
                int i17 = b11 >>> 3;
                int i18 = b11 & 7;
                if (i17 != 1) {
                    if (i17 == 2 && i18 == metadata.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i13, i12, metadata.valueType, metadata.defaultValue.getClass(), registers);
                        v11 = registers.object1;
                    }
                    decodeVarint32 = ArrayDecoders.skipField(b11, bArr, i13, i12, registers);
                } else if (i18 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i13, i12, metadata.keyType, null, registers);
                    k11 = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(b11, bArr, i13, i12, registers);
                }
            }
            if (decodeVarint32 == i15) {
                map.put(k11, v11);
                return i15;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private int decodeMapEntryValue(byte[] bArr, int i11, int i12, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i11, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i11));
                return i11 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i11));
                return i11 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i11));
                return i11 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i11));
                return i11 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i11, i12, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i11, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t11, long j11) {
        return UnsafeUtil.getDouble(t11, j11);
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i11, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i11);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i11)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i11)) == null) ? ub2 : (UB) filterUnknownEnumMap(i11, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema);
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i11, int i12, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.newBuilder();
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i12, newCodedBuilder.build());
                    it2.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t11, long j11) {
        return UnsafeUtil.getFloat(t11, j11);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i11) {
        return (Internal.EnumVerifier) this.objects[((i11 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i11) {
        return this.objects[(i11 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i11) {
        int i12 = (i11 / 3) * 2;
        Schema schema = (Schema) this.objects[i12];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) ((Class) this.objects[i12 + 1]));
        this.objects[i12] = schemaFor;
        return schemaFor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t11) {
        int i11;
        int i12;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        boolean z11;
        int computeSizeFixed32List;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i15);
            int numberAt = numberAt(i15);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i11 = this.buffer[i15 + 2];
                int i18 = i11 & i13;
                i12 = 1 << (i11 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(t11, i18);
                    i14 = i18;
                }
            } else {
                i11 = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i15 + 2] & i13;
                i12 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, BitmapDescriptorFactory.HUE_RED);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i17 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i17 & i12) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i16 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i16 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i17 & i12) != 0) {
                        Object object = unsafe.getObject(t11, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i16 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i17 & i12) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i17 & i12) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeBoolSize;
                    break;
                case 19:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 20:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 21:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 22:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 23:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 24:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 25:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i16 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                    i16 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i16 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeBoolSize;
                    break;
                case 30:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 31:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 32:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 33:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 34:
                    z11 = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i16 += computeSizeFixed32List;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                    i16 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t11, offset), getMapFieldDefaultEntry(i15));
                    i16 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i16 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, BitmapDescriptorFactory.HUE_RED);
                        i16 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i16 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        Object object2 = unsafe.getObject(t11, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i16 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t11, offset));
                        i16 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t11, numberAt, i15)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), getMessageFieldSchema(i15));
                        i16 += computeBoolSize;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int unknownFieldsSerializedSize = i16 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t11);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t11).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t11) {
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i11 = 0;
        for (int i12 = 0; i12 < this.buffer.length; i12 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i12);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i12);
            long offset = offset(typeAndOffsetAt);
            int i13 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i12 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, BitmapDescriptorFactory.HUE_RED);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (isFieldPresent(t11, i12)) {
                        Object object = UnsafeUtil.getObject(t11, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t11, offset), getMessageFieldSchema(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (isFieldPresent(t11, i12)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t11, offset), getMessageFieldSchema(i12));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t11, offset), false);
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t11, offset), false);
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(t11, offset), false);
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t11, offset), false);
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(t11, offset), false);
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t11, offset), false);
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t11, offset), false);
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(t11, offset), false);
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(t11, offset));
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(t11, offset), getMessageFieldSchema(i12));
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t11, offset));
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t11, offset), false);
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(t11, offset), false);
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t11, offset), false);
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t11, offset), false);
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t11, offset), false);
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t11, offset), false);
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t11, i13, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(t11, offset), getMessageFieldSchema(i12));
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t11, offset), getMapFieldDefaultEntry(i12));
                    break;
                case 51:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, BitmapDescriptorFactory.HUE_RED);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        Object object2 = UnsafeUtil.getObject(t11, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t11, offset), getMessageFieldSchema(i12));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t11, offset));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t11, offset), getMessageFieldSchema(i12));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i11 += computeDoubleSize;
        }
        return i11 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t11);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t11));
    }

    private static <T> int intAt(T t11, long j11) {
        return UnsafeUtil.getInt(t11, j11);
    }

    private static boolean isEnforceUtf8(int i11) {
        return (i11 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t11, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return isFieldPresent(t11, i11);
        }
        return (i13 & i14) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i11, int i12) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i11));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!messageFieldSchema.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t11, int i11, int i12) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t11, offset(i11)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema<T> schema = 0;
        for (Object obj : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            boolean isInitialized = schema.isInitialized(obj);
            schema = schema;
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t11, T t12, int i11) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11) & 1048575;
        return UnsafeUtil.getInt(t11, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t12, presenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t11, int i11, int i12) {
        return UnsafeUtil.getInt(t11, (long) (presenceMaskAndOffsetAt(i12) & 1048575)) == i11;
    }

    private static boolean isRequired(int i11) {
        return (i11 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j11) {
        return (List) UnsafeUtil.getObject(obj, j11);
    }

    private static <T> long longAt(T t11, long j11) {
        return UnsafeUtil.getLong(t11, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.repeatedFieldOffsetStart) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = filterMapUnknownEnumValues(r19, r16.intArray[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.setBuilderToMessage(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r17, com.google.protobuf.ExtensionSchema<ET> r18, T r19, com.google.protobuf.Reader r20, com.google.protobuf.ExtensionRegistryLite r21) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i11, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i11));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(T t11, T t12, int i11) {
        long offset = offset(typeAndOffsetAt(i11));
        if (isFieldPresent(t12, i11)) {
            Object object = UnsafeUtil.getObject(t11, offset);
            Object object2 = UnsafeUtil.getObject(t12, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t11, offset, Internal.mergeMessage(object, object2));
                setFieldPresent(t11, i11);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t11, offset, object2);
                setFieldPresent(t11, i11);
            }
        }
    }

    private void mergeOneofMessage(T t11, T t12, int i11) {
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        int numberAt = numberAt(i11);
        long offset = offset(typeAndOffsetAt);
        if (isOneofPresent(t12, numberAt, i11)) {
            Object object = isOneofPresent(t11, numberAt, i11) ? UnsafeUtil.getObject(t11, offset) : null;
            Object object2 = UnsafeUtil.getObject(t12, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t11, offset, Internal.mergeMessage(object, object2));
                setOneofPresent(t11, numberAt, i11);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t11, offset, object2);
                setOneofPresent(t11, numberAt, i11);
            }
        }
    }

    private void mergeSingleField(T t11, T t12, int i11) {
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i11);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putDouble(t11, offset, UnsafeUtil.getDouble(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putFloat(t11, offset, UnsafeUtil.getFloat(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, offset, UnsafeUtil.getLong(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, offset, UnsafeUtil.getLong(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, offset, UnsafeUtil.getLong(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putBoolean(t11, offset, UnsafeUtil.getBoolean(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putObject(t11, offset, UnsafeUtil.getObject(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 9:
                mergeMessage(t11, t12, i11);
                return;
            case 10:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putObject(t11, offset, UnsafeUtil.getObject(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, offset, UnsafeUtil.getLong(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, offset, UnsafeUtil.getInt(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, offset, UnsafeUtil.getLong(t12, offset));
                    setFieldPresent(t11, i11);
                    return;
                }
                return;
            case 17:
                mergeMessage(t11, t12, i11);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
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
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t11, t12, offset);
                return;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t11, t12, offset);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t12, numberAt, i11)) {
                    UnsafeUtil.putObject(t11, offset, UnsafeUtil.getObject(t12, offset));
                    setOneofPresent(t11, numberAt, i11);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t11, t12, i11);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t12, numberAt, i11)) {
                    UnsafeUtil.putObject(t11, offset, UnsafeUtil.getObject(t12, offset));
                    setOneofPresent(t11, numberAt, i11);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t11, t12, i11);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i11;
        boolean z11 = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i12++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i13++;
            }
        }
        int[] iArr2 = i12 > 0 ? new int[i12] : null;
        int[] iArr3 = i13 > 0 ? new int[i13] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i14 < fields.length) {
            FieldInfo fieldInfo2 = fields[i14];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i15, objArr);
            if (i16 < checkInitialized.length && checkInitialized[i16] == fieldNumber3) {
                checkInitialized[i16] = i15;
                i16++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i17] = i15;
                i17++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i11 = i15;
                iArr3[i18] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i18++;
                i14++;
                i15 = i11 + 3;
            }
            i11 = i15;
            i14++;
            i15 = i11 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z11, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r34, com.google.protobuf.NewInstanceSchema r35, com.google.protobuf.ListFieldSchema r36, com.google.protobuf.UnknownFieldSchema<?, ?> r37, com.google.protobuf.ExtensionSchema<?> r38, com.google.protobuf.MapFieldSchema r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int i11) {
        return this.buffer[i11];
    }

    private static long offset(int i11) {
        return i11 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t11, long j11) {
        return ((Boolean) UnsafeUtil.getObject(t11, j11)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t11, long j11) {
        return ((Double) UnsafeUtil.getObject(t11, j11)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t11, long j11) {
        return ((Float) UnsafeUtil.getObject(t11, j11)).floatValue();
    }

    private static <T> int oneofIntAt(T t11, long j11) {
        return ((Integer) UnsafeUtil.getObject(t11, j11)).intValue();
    }

    private static <T> long oneofLongAt(T t11, long j11) {
        return ((Long) UnsafeUtil.getObject(t11, j11)).longValue();
    }

    private <K, V> int parseMapField(T t11, byte[] bArr, int i11, int i12, int i13, long j11, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i13);
        Object object = unsafe.getObject(t11, j11);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t11, j11, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i11, i12, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        long j12 = this.buffer[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i11)));
                    int i19 = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return i19;
                }
                break;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i11)));
                    int i21 = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return i21;
                }
                break;
            case 53:
            case 54:
                if (i15 == 0) {
                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                    unsafe.putObject(t11, j11, Long.valueOf(registers.long1));
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i15 == 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                    unsafe.putObject(t11, j11, Integer.valueOf(registers.int1));
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i11)));
                    int i22 = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return i22;
                }
                break;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i11)));
                    int i23 = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return i23;
                }
                break;
            case 58:
                if (i15 == 0) {
                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                    unsafe.putObject(t11, j11, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (i15 == 2) {
                    int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                    int i24 = registers.int1;
                    if (i24 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i16 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i24)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(t11, j11, new String(bArr, decodeVarint322, i24, Internal.UTF_8));
                        decodeVarint322 += i24;
                    }
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (i15 == 2) {
                    int decodeMessageField = ArrayDecoders.decodeMessageField(getMessageFieldSchema(i18), bArr, i11, i12, registers);
                    Object object = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, registers.object1);
                    } else {
                        unsafe.putObject(t11, j11, Internal.mergeMessage(object, registers.object1));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return decodeMessageField;
                }
                break;
            case 61:
                if (i15 == 2) {
                    int decodeBytes = ArrayDecoders.decodeBytes(bArr, i11, registers);
                    unsafe.putObject(t11, j11, registers.object1);
                    unsafe.putInt(t11, j12, i14);
                    return decodeBytes;
                }
                break;
            case 63:
                if (i15 == 0) {
                    int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                    int i25 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i18);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i25)) {
                        getMutableUnknownFields(t11).storeField(i13, Long.valueOf(i25));
                    } else {
                        unsafe.putObject(t11, j11, Integer.valueOf(i25));
                        unsafe.putInt(t11, j12, i14);
                    }
                    return decodeVarint323;
                }
                break;
            case 66:
                if (i15 == 0) {
                    int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                    unsafe.putObject(t11, j11, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (i15 == 0) {
                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                    unsafe.putObject(t11, j11, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t11, j12, i14);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (i15 == 3) {
                    int decodeGroupField = ArrayDecoders.decodeGroupField(getMessageFieldSchema(i18), bArr, i11, i12, (i13 & (-8)) | 4, registers);
                    Object object2 = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, registers.object1);
                    } else {
                        unsafe.putObject(t11, j11, Internal.mergeMessage(object2, registers.object1));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return decodeGroupField;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x028e, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0290, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r10 = r18;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d7, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02fa, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(T r31, byte[] r32, int r33, int r34, com.google.protobuf.ArrayDecoders.Registers r35) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    private int parseRepeatedField(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, ArrayDecoders.Registers registers) {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t11, j12);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t11, j12, protobufList);
        }
        switch (i17) {
            case 18:
            case 35:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i11, protobufList, registers);
                }
                if (i15 == 1) {
                    return ArrayDecoders.decodeDoubleList(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i11, protobufList, registers);
                }
                if (i15 == 5) {
                    return ArrayDecoders.decodeFloatList(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeVarint64List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeVarint32List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 1) {
                    return ArrayDecoders.decodeFixed64List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 5) {
                    return ArrayDecoders.decodeFixed32List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeBoolList(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        return ArrayDecoders.decodeStringList(i13, bArr, i11, i12, protobufList, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 27:
                if (i15 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i16), i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 28:
                if (i15 == 2) {
                    return ArrayDecoders.decodeBytesList(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i11, protobufList, registers);
                } else if (i15 == 0) {
                    decodeVarint32List = ArrayDecoders.decodeVarint32List(i13, bArr, i11, i12, protobufList, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t11;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i14, (List<Integer>) protobufList, getEnumFieldVerifier(i16), unknownFieldSetLite, (UnknownFieldSchema<UT, UnknownFieldSetLite>) this.unknownFieldSchema);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return decodeVarint32List;
            case 33:
            case 47:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeSInt32List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeSInt64List(i13, bArr, i11, i12, protobufList, registers);
                }
                break;
            case 49:
                if (i15 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i16), i13, bArr, i11, i12, protobufList, registers);
                }
                break;
        }
        return i11;
    }

    private int positionForFieldNumber(int i11) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, 0);
    }

    private int presenceMaskAndOffsetAt(int i11) {
        return this.buffer[i11 + 2];
    }

    private <E> void readGroupList(Object obj, long j11, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j11), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i11, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i11)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i11, Reader reader) {
        if (isEnforceUtf8(i11)) {
            UnsafeUtil.putObject(obj, offset(i11), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i11), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i11), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i11, Reader reader) {
        if (isEnforceUtf8(i11)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        java.lang.reflect.Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t11, int i11) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t11, j11, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t11, j11));
    }

    private void setOneofPresent(T t11, int i11, int i12) {
        UnsafeUtil.putInt(t11, presenceMaskAndOffsetAt(i12) & 1048575, i11);
    }

    private int slowPositionForFieldNumber(int i11, int i12) {
        int length = (this.buffer.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int numberAt = numberAt(i14);
            if (i11 == numberAt) {
                return i14;
            }
            if (i11 < numberAt) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Laf:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ldb
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Lc9:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private static int type(int i11) {
        return (i11 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i11) {
        return this.buffer[i11 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(T r18, com.google.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(T r13, com.google.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i11, Object obj, int i12) {
        if (obj != null) {
            writer.writeMap(i11, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i11, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i11, (String) obj);
        } else {
            writer.writeBytes(i11, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t11), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t11, T t12) {
        int length = this.buffer.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!equals(t11, t12, i11)) {
                return false;
            }
        }
        if (this.unknownFieldSchema.getFromMessage(t11).equals(this.unknownFieldSchema.getFromMessage(t12))) {
            if (this.hasExtensions) {
                return this.extensionSchema.getExtensions(t11).equals(this.extensionSchema.getExtensions(t12));
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t11) {
        return this.proto3 ? getSerializedSizeProto3(t11) : getSerializedSizeProto2(t11);
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t11) {
        int i11;
        int hashLong;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int numberAt = numberAt(i13);
            long offset = offset(typeAndOffsetAt);
            int i14 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t11, offset)));
                    i12 = i11 + hashLong;
                    break;
                case 1:
                    i11 = i12 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 2:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 3:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 4:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 5:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 6:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 7:
                    i11 = i12 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 8:
                    i11 = i12 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t11, offset)).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t11, offset);
                    if (object != null) {
                        i14 = object.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 10:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 11:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 12:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 13:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 14:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 15:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(t11, offset);
                    i12 = i11 + hashLong;
                    break;
                case 16:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t11, offset));
                    i12 = i11 + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t11, offset);
                    if (object2 != null) {
                        i14 = object2.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
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
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 50:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t11, offset)));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t11, offset)).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(t11, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t11, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t11, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(t11, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.unknownFieldSchema.getFromMessage(t11).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t11).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t11) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.checkInitializedCount) {
            int i16 = this.intArray[i15];
            int numberAt = numberAt(i16);
            int typeAndOffsetAt = typeAndOffsetAt(i16);
            int i17 = this.buffer[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i14 = UNSAFE.getInt(t11, i18);
                }
                i12 = i14;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t11, i16, i11, i12, i19)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t11, numberAt, i16) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t11, typeAndOffsetAt, i16)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t11, typeAndOffsetAt, i16)) {
                    return false;
                }
            } else if (isFieldPresent(t11, i16, i11, i12, i19) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t11).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t11) {
        int i11;
        int i12 = this.checkInitializedCount;
        while (true) {
            i11 = this.repeatedFieldOffsetStart;
            if (i12 >= i11) {
                break;
            }
            long offset = offset(typeAndOffsetAt(this.intArray[i12]));
            Object object = UnsafeUtil.getObject(t11, offset);
            if (object != null) {
                UnsafeUtil.putObject(t11, offset, this.mapFieldSchema.toImmutable(object));
            }
            i12++;
        }
        int length = this.intArray.length;
        while (i11 < length) {
            this.listFieldSchema.makeImmutableListAt(t11, this.intArray[i11]);
            i11++;
        }
        this.unknownFieldSchema.makeImmutable(t11);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t11);
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, T t12) {
        Objects.requireNonNull(t12);
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            mergeSingleField(t11, t12, i11);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t11, t12);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t11, t12);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int parseProto2Message(T t11, byte[] bArr, int i11, int i12, int i13, ArrayDecoders.Registers registers) {
        Unsafe unsafe;
        int i14;
        MessageSchema<T> messageSchema;
        int i15;
        T t12;
        byte b11;
        int positionForFieldNumber;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        T t13;
        T t14;
        int i25;
        T t15;
        int i26;
        int i27;
        MessageSchema<T> messageSchema2 = this;
        T t16 = t11;
        byte[] bArr2 = bArr;
        int i28 = i12;
        int i29 = i13;
        ArrayDecoders.Registers registers2 = registers;
        Unsafe unsafe2 = UNSAFE;
        int i31 = i11;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = -1;
        int i36 = 1048575;
        while (true) {
            if (i31 < i28) {
                int i37 = i31 + 1;
                byte b12 = bArr2[i31];
                if (b12 < 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(b12, bArr2, i37, registers2);
                    b11 = registers2.int1;
                    i37 = decodeVarint32;
                } else {
                    b11 = b12;
                }
                int i38 = b11 >>> 3;
                int i39 = b11 & 7;
                if (i38 > i35) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i38, i32 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i38);
                }
                int i41 = positionForFieldNumber;
                if (i41 == -1) {
                    i16 = i38;
                    i17 = i37;
                    i18 = b11;
                    i19 = i34;
                    i21 = i36;
                    unsafe = unsafe2;
                    i14 = i29;
                    i22 = 0;
                } else {
                    int i42 = messageSchema2.buffer[i41 + 1];
                    int type = type(i42);
                    long offset = offset(i42);
                    int i43 = b11;
                    if (type <= 17) {
                        int i44 = messageSchema2.buffer[i41 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i36) {
                            if (i36 != 1048575) {
                                unsafe2.putInt(t16, i36, i34);
                            }
                            i34 = unsafe2.getInt(t16, i46);
                            i21 = i46;
                        } else {
                            i21 = i36;
                        }
                        int i47 = i34;
                        switch (type) {
                            case 0:
                                t13 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 1) {
                                    UnsafeUtil.putDouble(t13, offset, ArrayDecoders.decodeDouble(bArr2, i37));
                                    i31 = i37 + 8;
                                    i34 = i47 | i45;
                                    i28 = i12;
                                    t16 = t13;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 1:
                                t13 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 5) {
                                    UnsafeUtil.putFloat(t13, offset, ArrayDecoders.decodeFloat(bArr2, i37));
                                    i31 = i37 + 4;
                                    i34 = i47 | i45;
                                    i28 = i12;
                                    t16 = t13;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t17 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 0) {
                                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i37, registers2);
                                    t14 = t17;
                                    unsafe2.putLong(t11, offset, registers2.long1);
                                    i34 = i47 | i45;
                                    i31 = decodeVarint64;
                                    i32 = i23;
                                    i33 = i24;
                                    t16 = t14;
                                    i35 = i16;
                                    i36 = i21;
                                    i28 = i12;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                t13 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 0) {
                                    i31 = ArrayDecoders.decodeVarint32(bArr2, i37, registers2);
                                    unsafe2.putInt(t13, offset, registers2.int1);
                                    i34 = i47 | i45;
                                    i28 = i12;
                                    t16 = t13;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t18 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 1) {
                                    t14 = t18;
                                    unsafe2.putLong(t11, offset, ArrayDecoders.decodeFixed64(bArr2, i37));
                                    i31 = i37 + 8;
                                    i34 = i47 | i45;
                                    i32 = i23;
                                    i33 = i24;
                                    t16 = t14;
                                    i35 = i16;
                                    i36 = i21;
                                    i28 = i12;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i25 = i12;
                                t15 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 5) {
                                    unsafe2.putInt(t15, offset, ArrayDecoders.decodeFixed32(bArr2, i37));
                                    i31 = i37 + 4;
                                    int i48 = i47 | i45;
                                    t16 = t15;
                                    i28 = i25;
                                    i32 = i23;
                                    i33 = i24;
                                    i36 = i21;
                                    i29 = i13;
                                    i34 = i48;
                                    i35 = i16;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 7:
                                i25 = i12;
                                t15 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 0) {
                                    i31 = ArrayDecoders.decodeVarint64(bArr2, i37, registers2);
                                    UnsafeUtil.putBoolean(t15, offset, registers2.long1 != 0);
                                    int i482 = i47 | i45;
                                    t16 = t15;
                                    i28 = i25;
                                    i32 = i23;
                                    i33 = i24;
                                    i36 = i21;
                                    i29 = i13;
                                    i34 = i482;
                                    i35 = i16;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 8:
                                i25 = i12;
                                t15 = t16;
                                i23 = i41;
                                i16 = i38;
                                bArr2 = bArr;
                                i24 = i43;
                                if (i39 == 2) {
                                    if ((i42 & 536870912) == 0) {
                                        i31 = ArrayDecoders.decodeString(bArr2, i37, registers2);
                                    } else {
                                        i31 = ArrayDecoders.decodeStringRequireUtf8(bArr2, i37, registers2);
                                    }
                                    unsafe2.putObject(t15, offset, registers2.object1);
                                    int i4822 = i47 | i45;
                                    t16 = t15;
                                    i28 = i25;
                                    i32 = i23;
                                    i33 = i24;
                                    i36 = i21;
                                    i29 = i13;
                                    i34 = i4822;
                                    i35 = i16;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 9:
                                t15 = t16;
                                i23 = i41;
                                i16 = i38;
                                i24 = i43;
                                bArr2 = bArr;
                                if (i39 == 2) {
                                    i25 = i12;
                                    i31 = ArrayDecoders.decodeMessageField(messageSchema2.getMessageFieldSchema(i23), bArr2, i37, i25, registers2);
                                    if ((i47 & i45) == 0) {
                                        unsafe2.putObject(t15, offset, registers2.object1);
                                    } else {
                                        unsafe2.putObject(t15, offset, Internal.mergeMessage(unsafe2.getObject(t15, offset), registers2.object1));
                                    }
                                    int i48222 = i47 | i45;
                                    t16 = t15;
                                    i28 = i25;
                                    i32 = i23;
                                    i33 = i24;
                                    i36 = i21;
                                    i29 = i13;
                                    i34 = i48222;
                                    i35 = i16;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 10:
                                t13 = t16;
                                i23 = i41;
                                i16 = i38;
                                i24 = i43;
                                bArr2 = bArr;
                                if (i39 == 2) {
                                    i31 = ArrayDecoders.decodeBytes(bArr2, i37, registers2);
                                    unsafe2.putObject(t13, offset, registers2.object1);
                                    i34 = i47 | i45;
                                    i28 = i12;
                                    t16 = t13;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 12:
                                t13 = t16;
                                i23 = i41;
                                i16 = i38;
                                i24 = i43;
                                bArr2 = bArr;
                                if (i39 == 0) {
                                    i31 = ArrayDecoders.decodeVarint32(bArr2, i37, registers2);
                                    int i49 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i23);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i49)) {
                                        getMutableUnknownFields(t11).storeField(i24, Long.valueOf(i49));
                                        i28 = i12;
                                        t16 = t13;
                                        i34 = i47;
                                        i32 = i23;
                                        i33 = i24;
                                        i35 = i16;
                                        i36 = i21;
                                        i29 = i13;
                                    } else {
                                        unsafe2.putInt(t13, offset, i49);
                                        i34 = i47 | i45;
                                        i28 = i12;
                                        t16 = t13;
                                        i32 = i23;
                                        i33 = i24;
                                        i35 = i16;
                                        i36 = i21;
                                        i29 = i13;
                                        break;
                                    }
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                i23 = i41;
                                i24 = i43;
                                bArr2 = bArr;
                                i16 = i38;
                                if (i39 == 0) {
                                    i31 = ArrayDecoders.decodeVarint32(bArr2, i37, registers2);
                                    t13 = t11;
                                    unsafe2.putInt(t13, offset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i34 = i47 | i45;
                                    i28 = i12;
                                    t16 = t13;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 16:
                                i23 = i41;
                                i16 = i38;
                                if (i39 == 0) {
                                    bArr2 = bArr;
                                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr2, i37, registers2);
                                    i24 = i43;
                                    unsafe2.putLong(t11, offset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i34 = i47 | i45;
                                    t16 = t11;
                                    i28 = i12;
                                    i31 = decodeVarint642;
                                    i32 = i23;
                                    i33 = i24;
                                    i35 = i16;
                                    i36 = i21;
                                    i29 = i13;
                                    break;
                                } else {
                                    i24 = i43;
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            case 17:
                                if (i39 == 3) {
                                    i31 = ArrayDecoders.decodeGroupField(messageSchema2.getMessageFieldSchema(i41), bArr, i37, i12, (i38 << 3) | 4, registers);
                                    if ((i47 & i45) == 0) {
                                        unsafe2.putObject(t16, offset, registers2.object1);
                                    } else {
                                        unsafe2.putObject(t16, offset, Internal.mergeMessage(unsafe2.getObject(t16, offset), registers2.object1));
                                    }
                                    i34 = i47 | i45;
                                    bArr2 = bArr;
                                    i28 = i12;
                                    i29 = i13;
                                    i33 = i43;
                                    i32 = i41;
                                    i35 = i38;
                                    i36 = i21;
                                    break;
                                } else {
                                    i23 = i41;
                                    i16 = i38;
                                    i24 = i43;
                                    i17 = i37;
                                    i19 = i47;
                                    i22 = i23;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                    i14 = i13;
                                    break;
                                }
                            default:
                                i23 = i41;
                                i24 = i43;
                                i16 = i38;
                                i17 = i37;
                                i19 = i47;
                                i22 = i23;
                                unsafe = unsafe2;
                                i18 = i24;
                                i14 = i13;
                                break;
                        }
                    } else {
                        i16 = i38;
                        T t19 = t16;
                        bArr2 = bArr;
                        if (type != 27) {
                            i22 = i41;
                            i19 = i34;
                            i21 = i36;
                            if (type <= 49) {
                                int i51 = i37;
                                unsafe = unsafe2;
                                i27 = i43;
                                i31 = parseRepeatedField(t11, bArr, i37, i12, i43, i16, i39, i22, i42, type, offset, registers);
                                if (i31 != i51) {
                                    messageSchema2 = this;
                                    t16 = t11;
                                    bArr2 = bArr;
                                    i28 = i12;
                                    i29 = i13;
                                    registers2 = registers;
                                    i35 = i16;
                                    i33 = i27;
                                    i32 = i22;
                                    i34 = i19;
                                    i36 = i21;
                                    unsafe2 = unsafe;
                                } else {
                                    i14 = i13;
                                    i17 = i31;
                                    i18 = i27;
                                }
                            } else {
                                i26 = i37;
                                unsafe = unsafe2;
                                i27 = i43;
                                if (type != 50) {
                                    i31 = parseOneofField(t11, bArr, i26, i12, i27, i16, i39, i42, type, offset, i22, registers);
                                    if (i31 != i26) {
                                        messageSchema2 = this;
                                        t16 = t11;
                                        bArr2 = bArr;
                                        i28 = i12;
                                        i29 = i13;
                                        registers2 = registers;
                                        i35 = i16;
                                        i33 = i27;
                                        i32 = i22;
                                        i34 = i19;
                                        i36 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i13;
                                        i17 = i31;
                                        i18 = i27;
                                    }
                                } else if (i39 == 2) {
                                    i31 = parseMapField(t11, bArr, i26, i12, i22, offset, registers);
                                    if (i31 != i26) {
                                        messageSchema2 = this;
                                        t16 = t11;
                                        bArr2 = bArr;
                                        i28 = i12;
                                        i29 = i13;
                                        registers2 = registers;
                                        i35 = i16;
                                        i33 = i27;
                                        i32 = i22;
                                        i34 = i19;
                                        i36 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i13;
                                        i17 = i31;
                                        i18 = i27;
                                    }
                                }
                            }
                        } else if (i39 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(t19, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t19, offset, protobufList);
                            }
                            i21 = i36;
                            i31 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i41), i43, bArr, i37, i12, protobufList, registers);
                            t16 = t11;
                            i28 = i12;
                            i33 = i43;
                            i35 = i16;
                            i32 = i41;
                            i34 = i34;
                            i36 = i21;
                            i29 = i13;
                        } else {
                            i22 = i41;
                            i19 = i34;
                            i21 = i36;
                            i26 = i37;
                            unsafe = unsafe2;
                            i27 = i43;
                        }
                        i14 = i13;
                        i17 = i26;
                        i18 = i27;
                    }
                }
                if (i18 != i14 || i14 == 0) {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        i31 = ArrayDecoders.decodeExtensionOrUnknownField(i18, bArr, i17, i12, t11, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i31 = ArrayDecoders.decodeUnknownField(i18, bArr, i17, i12, getMutableUnknownFields(t11), registers);
                    }
                    t16 = t11;
                    bArr2 = bArr;
                    i28 = i12;
                    i33 = i18;
                    messageSchema2 = this;
                    registers2 = registers;
                    i35 = i16;
                    i32 = i22;
                    i34 = i19;
                    i36 = i21;
                    unsafe2 = unsafe;
                    i29 = i14;
                } else {
                    i15 = 1048575;
                    messageSchema = this;
                    i31 = i17;
                    i33 = i18;
                    i34 = i19;
                    i36 = i21;
                }
            } else {
                unsafe = unsafe2;
                i14 = i29;
                messageSchema = messageSchema2;
                i15 = 1048575;
            }
        }
        if (i36 != i15) {
            t12 = t11;
            unsafe.putInt(t12, i36, i34);
        } else {
            t12 = t11;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i52 = messageSchema.checkInitializedCount; i52 < messageSchema.repeatedFieldOffsetStart; i52++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t12, messageSchema.intArray[i52], unknownFieldSetLite, messageSchema.unknownFieldSchema);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t12, unknownFieldSetLite);
        }
        if (i14 == 0) {
            if (i31 != i12) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i31 > i12 || i33 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i31;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t11, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t11, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t11, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t11, writer);
        }
    }

    private boolean isFieldPresent(T t11, int i11) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 != 1048575) {
            return (UnsafeUtil.getInt(t11, j11) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t11, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t11, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t11, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t11, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t11, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t11, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t11, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t11, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t11, offset));
            case 11:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t11, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t11, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t11, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t11, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i11, int i12) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, i12);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Objects.requireNonNull(extensionRegistryLite);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t11, reader, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, byte[] bArr, int i11, int i12, ArrayDecoders.Registers registers) {
        if (this.proto3) {
            parseProto3Message(t11, bArr, i11, i12, registers);
        } else {
            parseProto2Message(t11, bArr, i11, i12, 0, registers);
        }
    }

    private boolean equals(T t11, T t12, int i11) {
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t11, t12, i11) && Double.doubleToLongBits(UnsafeUtil.getDouble(t11, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t12, offset));
            case 1:
                return arePresentForEquals(t11, t12, i11) && Float.floatToIntBits(UnsafeUtil.getFloat(t11, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t12, offset));
            case 2:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, offset) == UnsafeUtil.getLong(t12, offset);
            case 3:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, offset) == UnsafeUtil.getLong(t12, offset);
            case 4:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 5:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, offset) == UnsafeUtil.getLong(t12, offset);
            case 6:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 7:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getBoolean(t11, offset) == UnsafeUtil.getBoolean(t12, offset);
            case 8:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 9:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 10:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 11:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 12:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 13:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 14:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, offset) == UnsafeUtil.getLong(t12, offset);
            case 15:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, offset) == UnsafeUtil.getInt(t12, offset);
            case 16:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, offset) == UnsafeUtil.getLong(t12, offset);
            case 17:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
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
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, offset), UnsafeUtil.getObject(t12, offset));
            default:
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i11, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i11)));
    }
}