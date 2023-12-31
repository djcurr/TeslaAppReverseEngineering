package com.google.protobuf;

/* loaded from: classes2.dex */
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public boolean shouldDiscardUnknownFields(Reader reader) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed32(UnknownFieldSetLite unknownFieldSetLite, int i11, int i12) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 5), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed64(UnknownFieldSetLite unknownFieldSetLite, int i11, long j11) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 1), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addGroup(UnknownFieldSetLite unknownFieldSetLite, int i11, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 3), unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addLengthDelimited(UnknownFieldSetLite unknownFieldSetLite, int i11, ByteString byteString) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addVarint(UnknownFieldSetLite unknownFieldSetLite, int i11, long j11) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 0), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite getBuilderFromMessage(Object obj) {
        UnknownFieldSetLite fromMessage = getFromMessage(obj);
        if (fromMessage == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            setToMessage(obj, newInstance);
            return newInstance;
        }
        return fromMessage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite getFromMessage(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSize(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite merge(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        return unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance()) ? unknownFieldSetLite : UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite newBuilder() {
        return UnknownFieldSetLite.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        setToMessage(obj, unknownFieldSetLite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void setToMessage(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public UnknownFieldSetLite toImmutable(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeAsMessageSetTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }
}