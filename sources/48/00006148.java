package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.AbstractMessage;
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
public final class SolarStatus extends GeneratedMessageV3 implements SolarStatusOrBuilder {
    private static final SolarStatus DEFAULT_INSTANCE = new SolarStatus();
    private static final Parser<SolarStatus> PARSER = new AbstractParser<SolarStatus>() { // from class: com.tesla.proto.energy.powergate.v1.SolarStatus.1
        @Override // com.google.protobuf.Parser
        public SolarStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new SolarStatus(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SOLAR_POWER_FIELD_NUMBER = 1;
    public static final int SOLAR_TYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double solarPower_;
    private int solarType_;

    private SolarStatus(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SolarStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_SolarStatus_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SolarStatus parseDelimitedFrom(InputStream inputStream) {
        return (SolarStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SolarStatus parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<SolarStatus> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SolarStatus)) {
            return super.equals(obj);
        }
        SolarStatus solarStatus = (SolarStatus) obj;
        return Double.doubleToLongBits(getSolarPower()) == Double.doubleToLongBits(solarStatus.getSolarPower()) && this.solarType_ == solarStatus.solarType_ && this.unknownFields.equals(solarStatus.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SolarStatus> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeDoubleSize = Double.doubleToRawLongBits(this.solarPower_) != 0 ? 0 + CodedOutputStream.computeDoubleSize(1, this.solarPower_) : 0;
        if (this.solarType_ != SolarType.SOLAR_TYPE_INVALID.getNumber()) {
            computeDoubleSize += CodedOutputStream.computeEnumSize(2, this.solarType_);
        }
        int serializedSize = computeDoubleSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
    public double getSolarPower() {
        return this.solarPower_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
    public SolarType getSolarType() {
        SolarType valueOf = SolarType.valueOf(this.solarType_);
        return valueOf == null ? SolarType.UNRECOGNIZED : valueOf;
    }

    @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
    public int getSolarTypeValue() {
        return this.solarType_;
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
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getSolarPower()))) * 37) + 2) * 53) + this.solarType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_SolarStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SolarStatus.class, Builder.class);
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
        return new SolarStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (Double.doubleToRawLongBits(this.solarPower_) != 0) {
            codedOutputStream.writeDouble(1, this.solarPower_);
        }
        if (this.solarType_ != SolarType.SOLAR_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(2, this.solarType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SolarStatusOrBuilder {
        private double solarPower_;
        private int solarType_;

        private Builder() {
            this.solarType_ = 0;
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_SolarStatus_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearSolarPower() {
            this.solarPower_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearSolarType() {
            this.solarType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_SolarStatus_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
        public double getSolarPower() {
            return this.solarPower_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
        public SolarType getSolarType() {
            SolarType valueOf = SolarType.valueOf(this.solarType_);
            return valueOf == null ? SolarType.UNRECOGNIZED : valueOf;
        }

        @Override // com.tesla.proto.energy.powergate.v1.SolarStatusOrBuilder
        public int getSolarTypeValue() {
            return this.solarType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_SolarStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SolarStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setSolarPower(double d11) {
            this.solarPower_ = d11;
            onChanged();
            return this;
        }

        public Builder setSolarType(SolarType solarType) {
            Objects.requireNonNull(solarType);
            this.solarType_ = solarType.getNumber();
            onChanged();
            return this;
        }

        public Builder setSolarTypeValue(int i11) {
            this.solarType_ = i11;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SolarStatus build() {
            SolarStatus buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SolarStatus buildPartial() {
            SolarStatus solarStatus = new SolarStatus(this);
            solarStatus.solarPower_ = this.solarPower_;
            solarStatus.solarType_ = this.solarType_;
            onBuilt();
            return solarStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SolarStatus getDefaultInstanceForType() {
            return SolarStatus.getDefaultInstance();
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
            this.solarType_ = 0;
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
            this.solarPower_ = 0.0d;
            this.solarType_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SolarStatus) {
                return mergeFrom((SolarStatus) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SolarStatus solarStatus) {
            if (solarStatus == SolarStatus.getDefaultInstance()) {
                return this;
            }
            if (solarStatus.getSolarPower() != 0.0d) {
                setSolarPower(solarStatus.getSolarPower());
            }
            if (solarStatus.solarType_ != 0) {
                setSolarTypeValue(solarStatus.getSolarTypeValue());
            }
            mergeUnknownFields(((GeneratedMessageV3) solarStatus).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.SolarStatus.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.SolarStatus.d()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.SolarStatus r3 = (com.tesla.proto.energy.powergate.v1.SolarStatus) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.SolarStatus r4 = (com.tesla.proto.energy.powergate.v1.SolarStatus) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.SolarStatus.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.SolarStatus$Builder");
        }
    }

    public static Builder newBuilder(SolarStatus solarStatus) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(solarStatus);
    }

    public static SolarStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private SolarStatus() {
        this.memoizedIsInitialized = (byte) -1;
        this.solarType_ = 0;
    }

    public static SolarStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SolarStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SolarStatus parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SolarStatus getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SolarStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static SolarStatus parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private SolarStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            if (readTag == 9) {
                                this.solarPower_ = codedInputStream.readDouble();
                            } else if (readTag != 16) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.solarType_ = codedInputStream.readEnum();
                            }
                        }
                        z11 = true;
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e13) {
                    throw e13.setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static SolarStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SolarStatus parseFrom(InputStream inputStream) {
        return (SolarStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SolarStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SolarStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SolarStatus parseFrom(CodedInputStream codedInputStream) {
        return (SolarStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SolarStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SolarStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}