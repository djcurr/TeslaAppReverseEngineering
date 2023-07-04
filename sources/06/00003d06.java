package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeBoolList(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(i11, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeByteStringList(int i11, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i12));
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeEnumList(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag);
        }
        return computeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeEnumSizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed32List(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed64List(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i11, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i11, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += CodedOutputStream.computeGroupSize(i11, list.get(i13));
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag);
        }
        return computeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt64List(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag);
        }
        return computeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeMessage(int i11, Object obj, Schema schema) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i11, (LazyFieldLite) obj);
        }
        return CodedOutputStream.computeMessageSize(i11, (MessageLite) obj, schema);
    }

    static int computeSizeMessageList(int i11, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag);
        }
        return computeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt64List(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag);
        }
        return computeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeStringList(int i11, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i12 < size) {
                Object raw = lazyStringList.getRaw(i12);
                if (raw instanceof ByteString) {
                    computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                computeTagSize += computeStringSizeNoTag2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof ByteString) {
                    computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                } else {
                    computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i12++;
            }
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt32List(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag);
        }
        return computeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt64List(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z11) {
            return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag);
        }
        return computeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB filterUnknownEnumList(int i11, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) storeUnknownEnum(i11, intValue, ub2, unknownFieldSchema);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (enumLiteMap.findValueByNumber(intValue2) == null) {
                    ub2 = (UB) storeUnknownEnum(i11, intValue2, ub2, unknownFieldSchema);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean z11) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        return UnknownFieldSetSchema.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t11, T t12) {
        FieldSet<FT> extensions = extensionSchema.getExtensions(t12);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t11).mergeFrom(extensions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t11, T t12, long j11) {
        UnsafeUtil.putObject(t11, j11, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t11, j11), UnsafeUtil.getObject(t12, j11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11, T t12) {
        unknownFieldSchema.setToMessage(t11, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t11), unknownFieldSchema.getFromMessage(t12)));
    }

    public static UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i11, int i12, int i13) {
        if (i12 < 40) {
            return true;
        }
        long j11 = i13;
        return ((((long) i12) - ((long) i11)) + 1) + 9 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB storeUnknownEnum(int i11, int i12, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.newBuilder();
        }
        unknownFieldSchema.addVarint(ub2, i11, i12);
        return ub2;
    }

    static String toCamelCase(String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb2.append(charAt);
                    }
                    z11 = true;
                } else if (i11 == 0 && !z11) {
                    sb2.append((char) (charAt + ' '));
                } else {
                    sb2.append(charAt);
                }
            } else if (z11) {
                sb2.append((char) (charAt - ' '));
            } else {
                sb2.append(charAt);
            }
            z11 = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i11, boolean z11, Writer writer) {
        if (z11) {
            writer.writeBool(i11, true);
        }
    }

    public static void writeBoolList(int i11, List<Boolean> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i11, list, z11);
    }

    public static void writeBytes(int i11, ByteString byteString, Writer writer) {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i11, byteString);
    }

    public static void writeBytesList(int i11, List<ByteString> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i11, list);
    }

    public static void writeDouble(int i11, double d11, Writer writer) {
        if (Double.doubleToRawLongBits(d11) != 0) {
            writer.writeDouble(i11, d11);
        }
    }

    public static void writeDoubleList(int i11, List<Double> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i11, list, z11);
    }

    public static void writeEnum(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeEnum(i11, i12);
        }
    }

    public static void writeEnumList(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i11, list, z11);
    }

    public static void writeFixed32(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeFixed32(i11, i12);
        }
    }

    public static void writeFixed32List(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i11, list, z11);
    }

    public static void writeFixed64(int i11, long j11, Writer writer) {
        if (j11 != 0) {
            writer.writeFixed64(i11, j11);
        }
    }

    public static void writeFixed64List(int i11, List<Long> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i11, list, z11);
    }

    public static void writeFloat(int i11, float f11, Writer writer) {
        if (Float.floatToRawIntBits(f11) != 0) {
            writer.writeFloat(i11, f11);
        }
    }

    public static void writeFloatList(int i11, List<Float> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i11, list, z11);
    }

    public static void writeGroupList(int i11, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i11, list);
    }

    public static void writeInt32(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeInt32(i11, i12);
        }
    }

    public static void writeInt32List(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i11, list, z11);
    }

    public static void writeInt64(int i11, long j11, Writer writer) {
        if (j11 != 0) {
            writer.writeInt64(i11, j11);
        }
    }

    public static void writeInt64List(int i11, List<Long> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i11, list, z11);
    }

    public static void writeLazyFieldList(int i11, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            ((LazyFieldLite) it2.next()).writeTo(writer, i11);
        }
    }

    public static void writeMessage(int i11, Object obj, Writer writer) {
        if (obj != null) {
            writer.writeMessage(i11, obj);
        }
    }

    public static void writeMessageList(int i11, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i11, list);
    }

    public static void writeSFixed32(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeSFixed32(i11, i12);
        }
    }

    public static void writeSFixed32List(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i11, list, z11);
    }

    public static void writeSFixed64(int i11, long j11, Writer writer) {
        if (j11 != 0) {
            writer.writeSFixed64(i11, j11);
        }
    }

    public static void writeSFixed64List(int i11, List<Long> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i11, list, z11);
    }

    public static void writeSInt32(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeSInt32(i11, i12);
        }
    }

    public static void writeSInt32List(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i11, list, z11);
    }

    public static void writeSInt64(int i11, long j11, Writer writer) {
        if (j11 != 0) {
            writer.writeSInt64(i11, j11);
        }
    }

    public static void writeSInt64List(int i11, List<Long> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i11, list, z11);
    }

    public static void writeString(int i11, Object obj, Writer writer) {
        if (obj instanceof String) {
            writeStringInternal(i11, (String) obj, writer);
        } else {
            writeBytes(i11, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i11, String str, Writer writer) {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i11, str);
    }

    public static void writeStringList(int i11, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i11, list);
    }

    public static void writeUInt32(int i11, int i12, Writer writer) {
        if (i12 != 0) {
            writer.writeUInt32(i11, i12);
        }
    }

    public static void writeUInt32List(int i11, List<Integer> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i11, list, z11);
    }

    public static void writeUInt64(int i11, long j11, Writer writer) {
        if (j11 != 0) {
            writer.writeUInt64(i11, j11);
        }
    }

    public static void writeUInt64List(int i11, List<Long> list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeGroupList(int i11, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += CodedOutputStream.computeGroupSize(i11, list.get(i13), schema);
        }
        return i12;
    }

    public static void writeGroupList(int i11, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i11, list, schema);
    }

    public static void writeMessageList(int i11, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i11, list, schema);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeMessageList(int i11, List<?> list, Schema schema) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB filterUnknownEnumList(int i11, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) storeUnknownEnum(i11, intValue, ub2, unknownFieldSchema);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    ub2 = (UB) storeUnknownEnum(i11, intValue2, ub2, unknownFieldSchema);
                    it2.remove();
                }
            }
        }
        return ub2;
    }
}