package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class GridStatus extends GeneratedMessageV3 implements GridStatusOrBuilder {
    public static final int GRID_POWER_FIELD_NUMBER = 3;
    public static final int GRID_SERVICES_ACTIVE_FIELD_NUMBER = 2;
    public static final int GRID_SERVICES_POWER_FIELD_NUMBER = 4;
    public static final int GRID_STATUS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private double gridPower_;
    private boolean gridServicesActive_;
    private double gridServicesPower_;
    private volatile Object gridStatus_;
    private byte memoizedIsInitialized;
    private static final GridStatus DEFAULT_INSTANCE = new GridStatus();
    private static final Parser<GridStatus> PARSER = new AbstractParser<GridStatus>() { // from class: com.tesla.proto.energy.powergate.v1.GridStatus.1
        @Override // com.google.protobuf.Parser
        public GridStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new GridStatus(codedInputStream, extensionRegistryLite);
        }
    };

    private GridStatus(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GridStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_GridStatus_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GridStatus parseDelimitedFrom(InputStream inputStream) {
        return (GridStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GridStatus parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GridStatus> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GridStatus)) {
            return super.equals(obj);
        }
        GridStatus gridStatus = (GridStatus) obj;
        return getGridStatus().equals(gridStatus.getGridStatus()) && getGridServicesActive() == gridStatus.getGridServicesActive() && Double.doubleToLongBits(getGridPower()) == Double.doubleToLongBits(gridStatus.getGridPower()) && Double.doubleToLongBits(getGridServicesPower()) == Double.doubleToLongBits(gridStatus.getGridServicesPower()) && this.unknownFields.equals(gridStatus.unknownFields);
    }

    @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
    public double getGridPower() {
        return this.gridPower_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
    public boolean getGridServicesActive() {
        return this.gridServicesActive_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
    public double getGridServicesPower() {
        return this.gridServicesPower_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
    public String getGridStatus() {
        Object obj = this.gridStatus_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gridStatus_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
    public ByteString getGridStatusBytes() {
        Object obj = this.gridStatus_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gridStatus_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GridStatus> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeStringSize = GeneratedMessageV3.isStringEmpty(this.gridStatus_) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.gridStatus_);
        boolean z11 = this.gridServicesActive_;
        if (z11) {
            computeStringSize += CodedOutputStream.computeBoolSize(2, z11);
        }
        if (Double.doubleToRawLongBits(this.gridPower_) != 0) {
            computeStringSize += CodedOutputStream.computeDoubleSize(3, this.gridPower_);
        }
        if (Double.doubleToRawLongBits(this.gridServicesPower_) != 0) {
            computeStringSize += CodedOutputStream.computeDoubleSize(4, this.gridServicesPower_);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getGridStatus().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getGridServicesActive())) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getGridPower()))) * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getGridServicesPower()))) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_GridStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(GridStatus.class, Builder.class);
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
        return new GridStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!GeneratedMessageV3.isStringEmpty(this.gridStatus_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.gridStatus_);
        }
        boolean z11 = this.gridServicesActive_;
        if (z11) {
            codedOutputStream.writeBool(2, z11);
        }
        if (Double.doubleToRawLongBits(this.gridPower_) != 0) {
            codedOutputStream.writeDouble(3, this.gridPower_);
        }
        if (Double.doubleToRawLongBits(this.gridServicesPower_) != 0) {
            codedOutputStream.writeDouble(4, this.gridServicesPower_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GridStatusOrBuilder {
        private double gridPower_;
        private boolean gridServicesActive_;
        private double gridServicesPower_;
        private Object gridStatus_;

        private Builder() {
            this.gridStatus_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_GridStatus_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearGridPower() {
            this.gridPower_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearGridServicesActive() {
            this.gridServicesActive_ = false;
            onChanged();
            return this;
        }

        public Builder clearGridServicesPower() {
            this.gridServicesPower_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearGridStatus() {
            this.gridStatus_ = GridStatus.getDefaultInstance().getGridStatus();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_GridStatus_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
        public double getGridPower() {
            return this.gridPower_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
        public boolean getGridServicesActive() {
            return this.gridServicesActive_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
        public double getGridServicesPower() {
            return this.gridServicesPower_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
        public String getGridStatus() {
            Object obj = this.gridStatus_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gridStatus_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GridStatusOrBuilder
        public ByteString getGridStatusBytes() {
            Object obj = this.gridStatus_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gridStatus_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_GridStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(GridStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setGridPower(double d11) {
            this.gridPower_ = d11;
            onChanged();
            return this;
        }

        public Builder setGridServicesActive(boolean z11) {
            this.gridServicesActive_ = z11;
            onChanged();
            return this;
        }

        public Builder setGridServicesPower(double d11) {
            this.gridServicesPower_ = d11;
            onChanged();
            return this;
        }

        public Builder setGridStatus(String str) {
            Objects.requireNonNull(str);
            this.gridStatus_ = str;
            onChanged();
            return this;
        }

        public Builder setGridStatusBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.gridStatus_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GridStatus build() {
            GridStatus buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GridStatus buildPartial() {
            GridStatus gridStatus = new GridStatus(this);
            gridStatus.gridStatus_ = this.gridStatus_;
            gridStatus.gridServicesActive_ = this.gridServicesActive_;
            gridStatus.gridPower_ = this.gridPower_;
            gridStatus.gridServicesPower_ = this.gridServicesPower_;
            onBuilt();
            return gridStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GridStatus getDefaultInstanceForType() {
            return GridStatus.getDefaultInstance();
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
            this.gridStatus_ = "";
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
            this.gridStatus_ = "";
            this.gridServicesActive_ = false;
            this.gridPower_ = 0.0d;
            this.gridServicesPower_ = 0.0d;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GridStatus) {
                return mergeFrom((GridStatus) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GridStatus gridStatus) {
            if (gridStatus == GridStatus.getDefaultInstance()) {
                return this;
            }
            if (!gridStatus.getGridStatus().isEmpty()) {
                this.gridStatus_ = gridStatus.gridStatus_;
                onChanged();
            }
            if (gridStatus.getGridServicesActive()) {
                setGridServicesActive(gridStatus.getGridServicesActive());
            }
            if (gridStatus.getGridPower() != 0.0d) {
                setGridPower(gridStatus.getGridPower());
            }
            if (gridStatus.getGridServicesPower() != 0.0d) {
                setGridServicesPower(gridStatus.getGridServicesPower());
            }
            mergeUnknownFields(((GeneratedMessageV3) gridStatus).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.GridStatus.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.GridStatus.f()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.GridStatus r3 = (com.tesla.proto.energy.powergate.v1.GridStatus) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.GridStatus r4 = (com.tesla.proto.energy.powergate.v1.GridStatus) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.GridStatus.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.GridStatus$Builder");
        }
    }

    public static Builder newBuilder(GridStatus gridStatus) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(gridStatus);
    }

    public static GridStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private GridStatus() {
        this.memoizedIsInitialized = (byte) -1;
        this.gridStatus_ = "";
    }

    public static GridStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GridStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GridStatus parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GridStatus getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static GridStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static GridStatus parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private GridStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.gridStatus_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.gridServicesActive_ = codedInputStream.readBool();
                            } else if (readTag == 25) {
                                this.gridPower_ = codedInputStream.readDouble();
                            } else if (readTag != 33) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.gridServicesPower_ = codedInputStream.readDouble();
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e12) {
                        throw e12.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                    }
                } catch (IOException e13) {
                    throw new InvalidProtocolBufferException(e13).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static GridStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GridStatus parseFrom(InputStream inputStream) {
        return (GridStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static GridStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GridStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GridStatus parseFrom(CodedInputStream codedInputStream) {
        return (GridStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GridStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GridStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}