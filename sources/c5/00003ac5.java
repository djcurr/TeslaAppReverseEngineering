package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ArrayDecoders {

    /* renamed from: com.google.protobuf.ArrayDecoders$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    ArrayDecoders() {
    }

    public static int decodeBoolList(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i12, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (decodeVarint64 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return decodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i11, Registers registers) {
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1;
        if (i12 >= 0) {
            if (i12 <= bArr.length - decodeVarint32) {
                if (i12 == 0) {
                    registers.object1 = ByteString.EMPTY;
                    return decodeVarint32;
                }
                registers.object1 = ByteString.copyFrom(bArr, decodeVarint32, i12);
                return decodeVarint32 + i12;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x001b -> B:46:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int decodeBytesList(int r2, byte[] r3, int r4, int r5, com.google.protobuf.Internal.ProtobufList<?> r6, com.google.protobuf.ArrayDecoders.Registers r7) {
        /*
            int r4 = decodeVarint32(r3, r4, r7)
            int r0 = r7.int1
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = decodeVarint32(r3, r4, r7)
            int r1 = r7.int1
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = decodeVarint32(r3, r0, r7)
            int r0 = r7.int1
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L3b:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L48:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L53:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.decodeBytesList(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    public static double decodeDouble(byte[] bArr, int i11) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i11));
    }

    public static int decodeDoubleList(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i12));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, i14, registers);
            if (i11 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            i14 = decodeVarint32 + 8;
        }
        return i14;
    }

    static int decodeExtension(int i11, byte[] bArr, int i12, int i13, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) {
        Object field;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i14 = i11 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i12, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return decodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i12, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i12, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i12, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i12, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i12, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return decodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i12, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return decodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i12, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return decodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i12, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return decodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i12, intArrayList4, registers);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i14, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i12 = decodeVarint32(bArr, i12, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                UnknownFieldSetLite unknownFieldSetLite3 = extendableMessage.unknownFields;
                if (unknownFieldSetLite3 == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite3 = UnknownFieldSetLite.newInstance();
                    extendableMessage.unknownFields = unknownFieldSetLite3;
                }
                SchemaUtil.storeUnknownEnum(i14, registers.int1, unknownFieldSetLite3, unknownFieldSchema);
                return i12;
            }
            r2 = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    r2 = Double.valueOf(decodeDouble(bArr, i12));
                    i12 += 8;
                    break;
                case 2:
                    r2 = Float.valueOf(decodeFloat(bArr, i12));
                    i12 += 4;
                    break;
                case 3:
                case 4:
                    i12 = decodeVarint64(bArr, i12, registers);
                    r2 = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i12 = decodeVarint32(bArr, i12, registers);
                    r2 = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    r2 = Long.valueOf(decodeFixed64(bArr, i12));
                    i12 += 8;
                    break;
                case 9:
                case 10:
                    r2 = Integer.valueOf(decodeFixed32(bArr, i12));
                    i12 += 4;
                    break;
                case 11:
                    i12 = decodeVarint64(bArr, i12, registers);
                    r2 = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i12 = decodeVarint32(bArr, i12, registers);
                    r2 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i12 = decodeVarint64(bArr, i12, registers);
                    r2 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i12 = decodeBytes(bArr, i12, registers);
                    r2 = registers.object1;
                    break;
                case 16:
                    i12 = decodeString(bArr, i12, registers);
                    r2 = registers.object1;
                    break;
                case 17:
                    i12 = decodeGroupField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, i12, i13, (i14 << 3) | 4, registers);
                    r2 = registers.object1;
                    break;
                case 18:
                    i12 = decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, i12, i13, registers);
                    r2 = registers.object1;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, r2);
        } else {
            int i15 = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
            if ((i15 == 17 || i15 == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
                r2 = Internal.mergeMessage(field, r2);
            }
            fieldSet.setField(generatedExtension.descriptor, r2);
        }
        return i12;
    }

    public static int decodeExtensionOrUnknownField(int i11, byte[] bArr, int i12, int i13, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i11 >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i11, bArr, i12, i13, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i11, bArr, i12, i13, extendableMessage, findLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i12));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, i14, registers);
            if (i11 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            i14 = decodeVarint32 + 4;
        }
        return i14;
    }

    public static long decodeFixed64(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i12));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, i14, registers);
            if (i11 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            i14 = decodeVarint32 + 8;
        }
        return i14;
    }

    public static float decodeFloat(byte[] bArr, int i11) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i11));
    }

    public static int decodeFloatList(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i12));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, i14, registers);
            if (i11 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            i14 = decodeVarint32 + 4;
        }
        return i14;
    }

    public static int decodeGroupField(Schema schema, byte[] bArr, int i11, int i12, int i13, Registers registers) {
        MessageSchema messageSchema = (MessageSchema) schema;
        Object newInstance = messageSchema.newInstance();
        int parseProto2Message = messageSchema.parseProto2Message(newInstance, bArr, i11, i12, i13, registers);
        messageSchema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return parseProto2Message;
    }

    public static int decodeGroupList(Schema schema, int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        int i14 = (i11 & (-8)) | 4;
        int decodeGroupField = decodeGroupField(schema, bArr, i12, i13, i14, registers);
        protobufList.add(registers.object1);
        while (decodeGroupField < i13) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(schema, bArr, decodeVarint32, i13, i14, registers);
            protobufList.add(registers.object1);
        }
        return decodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] bArr, int i11, int i12, Registers registers) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = decodeVarint32(i14, bArr, i13, registers);
            i14 = registers.int1;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            Object newInstance = schema.newInstance();
            int i16 = i14 + i15;
            schema.mergeFrom(newInstance, bArr, i15, i16, registers);
            schema.makeImmutable(newInstance);
            registers.object1 = newInstance;
            return i16;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeMessageList(Schema<?> schema, int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        int decodeMessageField = decodeMessageField(schema, bArr, i12, i13, registers);
        protobufList.add(registers.object1);
        while (decodeMessageField < i13) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(schema, bArr, decodeVarint32, i13, registers);
            protobufList.add(registers.object1);
        }
        return decodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i11, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i12) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (decodeVarint32 == i12) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i12, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (decodeVarint32 < i13) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return decodeVarint32;
    }

    public static int decodeSInt64List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i12, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (decodeVarint64 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return decodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i11, Registers registers) {
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1;
        if (i12 >= 0) {
            if (i12 == 0) {
                registers.object1 = "";
                return decodeVarint32;
            }
            registers.object1 = new String(bArr, decodeVarint32, i12, Internal.UTF_8);
            return decodeVarint32 + i12;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x001a -> B:37:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int decodeStringList(int r4, byte[] r5, int r6, int r7, com.google.protobuf.Internal.ProtobufList<?> r8, com.google.protobuf.ArrayDecoders.Registers r9) {
        /*
            int r6 = decodeVarint32(r5, r6, r9)
            int r0 = r9.int1
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.UTF_8
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = decodeVarint32(r5, r6, r9)
            int r2 = r9.int1
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = decodeVarint32(r5, r0, r9)
            int r0 = r9.int1
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.UTF_8
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L44:
            return r6
        L45:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.decodeStringList(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0022 -> B:47:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int decodeStringListRequireUtf8(int r5, byte[] r6, int r7, int r8, com.google.protobuf.Internal.ProtobufList<?> r9, com.google.protobuf.ArrayDecoders.Registers r10) {
        /*
            int r7 = decodeVarint32(r6, r7, r10)
            int r0 = r10.int1
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.isValidUtf8(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.UTF_8
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = decodeVarint32(r6, r7, r10)
            int r2 = r10.int1
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = decodeVarint32(r6, r0, r10)
            int r0 = r10.int1
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.isValidUtf8(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.UTF_8
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L54:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L59:
            return r7
        L5a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L5f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ArrayDecoders.decodeStringListRequireUtf8(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i11, Registers registers) {
        int decodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i12 = registers.int1;
        if (i12 >= 0) {
            if (i12 == 0) {
                registers.object1 = "";
                return decodeVarint32;
            }
            registers.object1 = Utf8.decodeUtf8(bArr, decodeVarint32, i12);
            return decodeVarint32 + i12;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int decodeUnknownField(int i11, byte[] bArr, int i12, int i13, UnknownFieldSetLite unknownFieldSetLite, Registers registers) {
        if (WireFormat.getTagFieldNumber(i11) != 0) {
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                int decodeVarint64 = decodeVarint64(bArr, i12, registers);
                unknownFieldSetLite.storeField(i11, Long.valueOf(registers.long1));
                return decodeVarint64;
            } else if (tagWireType == 1) {
                unknownFieldSetLite.storeField(i11, Long.valueOf(decodeFixed64(bArr, i12)));
                return i12 + 8;
            } else if (tagWireType == 2) {
                int decodeVarint32 = decodeVarint32(bArr, i12, registers);
                int i14 = registers.int1;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - decodeVarint32) {
                        if (i14 == 0) {
                            unknownFieldSetLite.storeField(i11, ByteString.EMPTY);
                        } else {
                            unknownFieldSetLite.storeField(i11, ByteString.copyFrom(bArr, decodeVarint32, i14));
                        }
                        return decodeVarint32 + i14;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else if (tagWireType != 3) {
                if (tagWireType == 5) {
                    unknownFieldSetLite.storeField(i11, Integer.valueOf(decodeFixed32(bArr, i12)));
                    return i12 + 4;
                }
                throw InvalidProtocolBufferException.invalidTag();
            } else {
                UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                int i15 = (i11 & (-8)) | 4;
                int i16 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int decodeVarint322 = decodeVarint32(bArr, i12, registers);
                    int i17 = registers.int1;
                    if (i17 == i15) {
                        i16 = i17;
                        i12 = decodeVarint322;
                        break;
                    }
                    i16 = i17;
                    i12 = decodeUnknownField(i17, bArr, decodeVarint322, i13, newInstance, registers);
                }
                if (i12 <= i13 && i16 == i15) {
                    unknownFieldSetLite.storeField(i11, newInstance);
                    return i12;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public static int decodeVarint32(byte[] bArr, int i11, Registers registers) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            registers.int1 = b11;
            return i12;
        }
        return decodeVarint32(b11, bArr, i12, registers);
    }

    public static int decodeVarint32List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i12, registers);
        intArrayList.addInt(registers.int1);
        while (decodeVarint32 < i13) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i11, Registers registers) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            registers.long1 = j11;
            return i12;
        }
        return decodeVarint64(j11, bArr, i12, registers);
    }

    public static int decodeVarint64List(int i11, byte[] bArr, int i12, int i13, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i12, registers);
        longArrayList.addLong(registers.long1);
        while (decodeVarint64 < i13) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i11 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return decodeVarint64;
    }

    public static int skipField(int i11, byte[] bArr, int i12, int i13, Registers registers) {
        if (WireFormat.getTagFieldNumber(i11) != 0) {
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i12 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i14 = (i11 & (-8)) | 4;
                        int i15 = 0;
                        while (i12 < i13) {
                            i12 = decodeVarint32(bArr, i12, registers);
                            i15 = registers.int1;
                            if (i15 == i14) {
                                break;
                            }
                            i12 = skipField(i15, bArr, i12, i13, registers);
                        }
                        if (i12 > i13 || i15 != i14) {
                            throw InvalidProtocolBufferException.parseFailure();
                        }
                        return i12;
                    }
                    return decodeVarint32(bArr, i12, registers) + registers.int1;
                }
                return i12 + 8;
            }
            return decodeVarint64(bArr, i12, registers);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* loaded from: classes2.dex */
    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;

        Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            Objects.requireNonNull(extensionRegistryLite);
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint32(int i11, byte[] bArr, int i12, Registers registers) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            registers.int1 = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            registers.int1 = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            registers.int1 = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i18 + 1;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            registers.int1 = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                registers.int1 = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int decodeVarint64(long j11, byte[] bArr, int i11, Registers registers) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            byte b12 = bArr[i12];
            i13 += 7;
            j12 |= (b12 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b11 = b12;
        }
        registers.long1 = j12;
        return i12;
    }
}