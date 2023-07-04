package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1  reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i11, boolean z11, V v11, MapEntryLite.Metadata<Boolean, V> metadata) {
        this.output.writeTag(i11, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(z11), v11));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(z11), v11);
    }

    private <V> void writeDeterministicIntegerMap(int i11, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i12 = 0;
        for (Integer num : map.keySet()) {
            iArr[i12] = num.intValue();
            i12++;
        }
        Arrays.sort(iArr);
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            V v11 = map.get(Integer.valueOf(i14));
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i14), v11));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i14), v11);
        }
    }

    private <V> void writeDeterministicLongMap(int i11, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i12 = 0;
        for (Long l11 : map.keySet()) {
            jArr[i12] = l11.longValue();
            i12++;
        }
        Arrays.sort(jArr);
        for (int i13 = 0; i13 < size; i13++) {
            long j11 = jArr[i13];
            V v11 = map.get(Long.valueOf(j11));
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j11), v11));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j11), v11);
        }
    }

    private <K, V> void writeDeterministicMap(int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v11 = map.get(Boolean.FALSE);
                if (v11 != null) {
                    writeDeterministicBooleanMapEntry(i11, false, v11, metadata);
                }
                V v12 = map.get(Boolean.TRUE);
                if (v12 != null) {
                    writeDeterministicBooleanMapEntry(i11, true, v12, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i11, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i11, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i11, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i11, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i12 = 0;
        for (String str : map.keySet()) {
            strArr[i12] = str;
            i12++;
        }
        Arrays.sort(strArr);
        for (int i13 = 0; i13 < size; i13++) {
            String str2 = strArr[i13];
            V v11 = map.get(str2);
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str2, v11));
            MapEntryLite.writeTo(this.output, metadata, str2, v11);
        }
    }

    private void writeLazyString(int i11, Object obj) {
        if (obj instanceof String) {
            this.output.writeString(i11, (String) obj);
        } else {
            this.output.writeBytes(i11, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.Writer
    public void writeBool(int i11, boolean z11) {
        this.output.writeBool(i11, z11);
    }

    @Override // com.google.protobuf.Writer
    public void writeBoolList(int i11, List<Boolean> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeBoolSizeNoTag(list.get(i14).booleanValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeBoolNoTag(list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeBool(i11, list.get(i12).booleanValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeBytes(int i11, ByteString byteString) {
        this.output.writeBytes(i11, byteString);
    }

    @Override // com.google.protobuf.Writer
    public void writeBytesList(int i11, List<ByteString> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.output.writeBytes(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeDouble(int i11, double d11) {
        this.output.writeDouble(i11, d11);
    }

    @Override // com.google.protobuf.Writer
    public void writeDoubleList(int i11, List<Double> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeDoubleSizeNoTag(list.get(i14).doubleValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i12).doubleValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeDouble(i11, list.get(i12).doubleValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeEndGroup(int i11) {
        this.output.writeTag(i11, 4);
    }

    @Override // com.google.protobuf.Writer
    public void writeEnum(int i11, int i12) {
        this.output.writeEnum(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeEnumList(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeEnumSizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeEnumNoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeEnum(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32(int i11, int i12) {
        this.output.writeFixed32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFixed32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFixed32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64(int i11, long j11) {
        this.output.writeFixed64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFixed64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFixed64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFloat(int i11, float f11) {
        this.output.writeFloat(i11, f11);
    }

    @Override // com.google.protobuf.Writer
    public void writeFloatList(int i11, List<Float> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFloatSizeNoTag(list.get(i14).floatValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFloatNoTag(list.get(i12).floatValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFloat(i11, list.get(i12).floatValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int i11, Object obj) {
        this.output.writeGroup(i11, (MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int i11, List<?> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeGroup(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32(int i11, int i12) {
        this.output.writeInt32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64(int i11, long j11) {
        this.output.writeInt64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i11, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i11, Object obj) {
        this.output.writeMessage(i11, (MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i11, List<?> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeMessage(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i11, Object obj) {
        if (obj instanceof ByteString) {
            this.output.writeRawMessageSetExtension(i11, (ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i11, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32(int i11, int i12) {
        this.output.writeSFixed32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSFixed32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64(int i11, long j11) {
        this.output.writeSFixed64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSFixed64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32(int i11, int i12) {
        this.output.writeSInt32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64(int i11, long j11) {
        this.output.writeSInt64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeStartGroup(int i11) {
        this.output.writeTag(i11, 3);
    }

    @Override // com.google.protobuf.Writer
    public void writeString(int i11, String str) {
        this.output.writeString(i11, str);
    }

    @Override // com.google.protobuf.Writer
    public void writeStringList(int i11, List<String> list) {
        int i12 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i12 < list.size()) {
                writeLazyString(i11, lazyStringList.getRaw(i12));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeString(i11, list.get(i12));
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32(int i11, int i12) {
        this.output.writeUInt32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeUInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64(int i11, long j11) {
        this.output.writeUInt64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeUInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int i11, Object obj, Schema schema) {
        this.output.writeGroup(i11, (MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i11, Object obj, Schema schema) {
        this.output.writeMessage(i11, (MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int i11, List<?> list, Schema schema) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeGroup(i11, list.get(i12), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i11, List<?> list, Schema schema) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeMessage(i11, list.get(i12), schema);
        }
    }
}