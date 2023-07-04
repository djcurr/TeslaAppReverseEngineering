package com.tesla.proto.common.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class UUIDv4Bytes extends GeneratedMessageV3 implements UUIDv4BytesOrBuilder {
    private static final UUIDv4Bytes DEFAULT_INSTANCE = new UUIDv4Bytes();
    private static final Parser<UUIDv4Bytes> PARSER = new AbstractParser<UUIDv4Bytes>() { // from class: com.tesla.proto.common.v1.UUIDv4Bytes.1
        @Override // com.google.protobuf.Parser
        public UUIDv4Bytes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new UUIDv4Bytes(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ByteString value_;

    private UUIDv4Bytes(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UUIDv4Bytes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return UUID.internal_static_tesla_proto_common_v1_UUIDv4Bytes_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static UUIDv4Bytes parseDelimitedFrom(InputStream inputStream) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UUIDv4Bytes parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<UUIDv4Bytes> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UUIDv4Bytes)) {
            return super.equals(obj);
        }
        UUIDv4Bytes uUIDv4Bytes = (UUIDv4Bytes) obj;
        return getValue().equals(uUIDv4Bytes.getValue()) && this.unknownFields.equals(uUIDv4Bytes.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<UUIDv4Bytes> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeBytesSize = (this.value_.isEmpty() ? 0 : 0 + CodedOutputStream.computeBytesSize(1, this.value_)) + this.unknownFields.getSerializedSize();
        this.memoizedSize = computeBytesSize;
        return computeBytesSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.common.v1.UUIDv4BytesOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return UUID.internal_static_tesla_proto_common_v1_UUIDv4Bytes_fieldAccessorTable.ensureFieldAccessorsInitialized(UUIDv4Bytes.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b11 = this.memoizedIsInitialized;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new UUIDv4Bytes();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.value_.isEmpty()) {
            codedOutputStream.writeBytes(1, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UUIDv4BytesOrBuilder {
        private ByteString value_;

        private Builder() {
            this.value_ = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UUID.internal_static_tesla_proto_common_v1_UUIDv4Bytes_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearValue() {
            this.value_ = UUIDv4Bytes.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UUID.internal_static_tesla_proto_common_v1_UUIDv4Bytes_descriptor;
        }

        @Override // com.tesla.proto.common.v1.UUIDv4BytesOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UUID.internal_static_tesla_proto_common_v1_UUIDv4Bytes_fieldAccessorTable.ensureFieldAccessorsInitialized(UUIDv4Bytes.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setValue(ByteString byteString) {
            Objects.requireNonNull(byteString);
            this.value_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UUIDv4Bytes build() {
            UUIDv4Bytes buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UUIDv4Bytes buildPartial() {
            UUIDv4Bytes uUIDv4Bytes = new UUIDv4Bytes(this);
            uUIDv4Bytes.value_ = this.value_;
            onBuilt();
            return uUIDv4Bytes;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UUIDv4Bytes getDefaultInstanceForType() {
            return UUIDv4Bytes.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i11, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i11, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.value_ = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.value_ = ByteString.EMPTY;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof UUIDv4Bytes) {
                return mergeFrom((UUIDv4Bytes) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(UUIDv4Bytes uUIDv4Bytes) {
            if (uUIDv4Bytes == UUIDv4Bytes.getDefaultInstance()) {
                return this;
            }
            if (uUIDv4Bytes.getValue() != ByteString.EMPTY) {
                setValue(uUIDv4Bytes.getValue());
            }
            mergeUnknownFields(((GeneratedMessageV3) uUIDv4Bytes).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.common.v1.UUIDv4Bytes.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.common.v1.UUIDv4Bytes.b()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.common.v1.UUIDv4Bytes r3 = (com.tesla.proto.common.v1.UUIDv4Bytes) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.tesla.proto.common.v1.UUIDv4Bytes r4 = (com.tesla.proto.common.v1.UUIDv4Bytes) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.common.v1.UUIDv4Bytes.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.common.v1.UUIDv4Bytes$Builder");
        }
    }

    public static Builder newBuilder(UUIDv4Bytes uUIDv4Bytes) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uUIDv4Bytes);
    }

    public static UUIDv4Bytes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private UUIDv4Bytes() {
        this.memoizedIsInitialized = (byte) -1;
        this.value_ = ByteString.EMPTY;
    }

    public static UUIDv4Bytes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UUIDv4Bytes parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public UUIDv4Bytes getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static UUIDv4Bytes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static UUIDv4Bytes parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private UUIDv4Bytes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag != 10) {
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            this.value_ = codedInputStream.readBytes();
                        }
                    }
                    z11 = true;
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static UUIDv4Bytes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static UUIDv4Bytes parseFrom(InputStream inputStream) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static UUIDv4Bytes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UUIDv4Bytes parseFrom(CodedInputStream codedInputStream) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static UUIDv4Bytes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UUIDv4Bytes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}