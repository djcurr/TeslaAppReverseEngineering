package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class WallConnectorStatus extends GeneratedMessageV3 implements WallConnectorStatusOrBuilder {
    public static final int DIN_FIELD_NUMBER = 5;
    public static final int VIN_FIELD_NUMBER = 1;
    public static final int WALL_CONNECTOR_FAULT_STATE_FIELD_NUMBER = 3;
    public static final int WALL_CONNECTOR_POWER_FIELD_NUMBER = 4;
    public static final int WALL_CONNECTOR_STATE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object din_;
    private byte memoizedIsInitialized;
    private StringValue vin_;
    private int wallConnectorFaultState_;
    private FloatValue wallConnectorPower_;
    private int wallConnectorState_;
    private static final WallConnectorStatus DEFAULT_INSTANCE = new WallConnectorStatus();
    private static final Parser<WallConnectorStatus> PARSER = new AbstractParser<WallConnectorStatus>() { // from class: com.tesla.proto.energy.powergate.v1.WallConnectorStatus.1
        @Override // com.google.protobuf.Parser
        public WallConnectorStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new WallConnectorStatus(codedInputStream, extensionRegistryLite);
        }
    };

    private WallConnectorStatus(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static WallConnectorStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static WallConnectorStatus parseDelimitedFrom(InputStream inputStream) {
        return (WallConnectorStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static WallConnectorStatus parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<WallConnectorStatus> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WallConnectorStatus)) {
            return super.equals(obj);
        }
        WallConnectorStatus wallConnectorStatus = (WallConnectorStatus) obj;
        if (hasVin() != wallConnectorStatus.hasVin()) {
            return false;
        }
        if ((!hasVin() || getVin().equals(wallConnectorStatus.getVin())) && this.wallConnectorState_ == wallConnectorStatus.wallConnectorState_ && this.wallConnectorFaultState_ == wallConnectorStatus.wallConnectorFaultState_ && hasWallConnectorPower() == wallConnectorStatus.hasWallConnectorPower()) {
            return (!hasWallConnectorPower() || getWallConnectorPower().equals(wallConnectorStatus.getWallConnectorPower())) && getDin().equals(wallConnectorStatus.getDin()) && this.unknownFields.equals(wallConnectorStatus.unknownFields);
        }
        return false;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public String getDin() {
        Object obj = this.din_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.din_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public ByteString getDinBytes() {
        Object obj = this.din_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.din_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<WallConnectorStatus> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeMessageSize = this.vin_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getVin()) : 0;
        if (this.wallConnectorState_ != WCState.WC_STATE_INVALID.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(2, this.wallConnectorState_);
        }
        if (this.wallConnectorFaultState_ != WCFaultStatusState.WC_FAULT_STATUS_STATE_INVALID.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(3, this.wallConnectorFaultState_);
        }
        if (this.wallConnectorPower_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, getWallConnectorPower());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.din_)) {
            computeMessageSize += GeneratedMessageV3.computeStringSize(5, this.din_);
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public StringValue getVin() {
        StringValue stringValue = this.vin_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public StringValueOrBuilder getVinOrBuilder() {
        return getVin();
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public WCFaultStatusState getWallConnectorFaultState() {
        WCFaultStatusState valueOf = WCFaultStatusState.valueOf(this.wallConnectorFaultState_);
        return valueOf == null ? WCFaultStatusState.UNRECOGNIZED : valueOf;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public int getWallConnectorFaultStateValue() {
        return this.wallConnectorFaultState_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public FloatValue getWallConnectorPower() {
        FloatValue floatValue = this.wallConnectorPower_;
        return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public FloatValueOrBuilder getWallConnectorPowerOrBuilder() {
        return getWallConnectorPower();
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public WCState getWallConnectorState() {
        WCState valueOf = WCState.valueOf(this.wallConnectorState_);
        return valueOf == null ? WCState.UNRECOGNIZED : valueOf;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public int getWallConnectorStateValue() {
        return this.wallConnectorState_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public boolean hasVin() {
        return this.vin_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
    public boolean hasWallConnectorPower() {
        return this.wallConnectorPower_ != null;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasVin()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getVin().hashCode();
        }
        int i12 = (((((((hashCode * 37) + 2) * 53) + this.wallConnectorState_) * 37) + 3) * 53) + this.wallConnectorFaultState_;
        if (hasWallConnectorPower()) {
            i12 = (((i12 * 37) + 4) * 53) + getWallConnectorPower().hashCode();
        }
        int hashCode2 = (((((i12 * 37) + 5) * 53) + getDin().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(WallConnectorStatus.class, Builder.class);
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
        return new WallConnectorStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.vin_ != null) {
            codedOutputStream.writeMessage(1, getVin());
        }
        if (this.wallConnectorState_ != WCState.WC_STATE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(2, this.wallConnectorState_);
        }
        if (this.wallConnectorFaultState_ != WCFaultStatusState.WC_FAULT_STATUS_STATE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.wallConnectorFaultState_);
        }
        if (this.wallConnectorPower_ != null) {
            codedOutputStream.writeMessage(4, getWallConnectorPower());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.din_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.din_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WallConnectorStatusOrBuilder {
        private Object din_;
        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> vinBuilder_;
        private StringValue vin_;
        private int wallConnectorFaultState_;
        private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> wallConnectorPowerBuilder_;
        private FloatValue wallConnectorPower_;
        private int wallConnectorState_;

        private Builder() {
            this.wallConnectorState_ = 0;
            this.wallConnectorFaultState_ = 0;
            this.din_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_descriptor;
        }

        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getVinFieldBuilder() {
            if (this.vinBuilder_ == null) {
                this.vinBuilder_ = new SingleFieldBuilderV3<>(getVin(), getParentForChildren(), isClean());
                this.vin_ = null;
            }
            return this.vinBuilder_;
        }

        private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> getWallConnectorPowerFieldBuilder() {
            if (this.wallConnectorPowerBuilder_ == null) {
                this.wallConnectorPowerBuilder_ = new SingleFieldBuilderV3<>(getWallConnectorPower(), getParentForChildren(), isClean());
                this.wallConnectorPower_ = null;
            }
            return this.wallConnectorPowerBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearDin() {
            this.din_ = WallConnectorStatus.getDefaultInstance().getDin();
            onChanged();
            return this;
        }

        public Builder clearVin() {
            if (this.vinBuilder_ == null) {
                this.vin_ = null;
                onChanged();
            } else {
                this.vin_ = null;
                this.vinBuilder_ = null;
            }
            return this;
        }

        public Builder clearWallConnectorFaultState() {
            this.wallConnectorFaultState_ = 0;
            onChanged();
            return this;
        }

        public Builder clearWallConnectorPower() {
            if (this.wallConnectorPowerBuilder_ == null) {
                this.wallConnectorPower_ = null;
                onChanged();
            } else {
                this.wallConnectorPower_ = null;
                this.wallConnectorPowerBuilder_ = null;
            }
            return this;
        }

        public Builder clearWallConnectorState() {
            this.wallConnectorState_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public String getDin() {
            Object obj = this.din_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.din_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public ByteString getDinBytes() {
            Object obj = this.din_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.din_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public StringValue getVin() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue = this.vin_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public StringValue.Builder getVinBuilder() {
            onChanged();
            return getVinFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public StringValueOrBuilder getVinOrBuilder() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.vin_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public WCFaultStatusState getWallConnectorFaultState() {
            WCFaultStatusState valueOf = WCFaultStatusState.valueOf(this.wallConnectorFaultState_);
            return valueOf == null ? WCFaultStatusState.UNRECOGNIZED : valueOf;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public int getWallConnectorFaultStateValue() {
            return this.wallConnectorFaultState_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public FloatValue getWallConnectorPower() {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV3 == null) {
                FloatValue floatValue = this.wallConnectorPower_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public FloatValue.Builder getWallConnectorPowerBuilder() {
            onChanged();
            return getWallConnectorPowerFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public FloatValueOrBuilder getWallConnectorPowerOrBuilder() {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            FloatValue floatValue = this.wallConnectorPower_;
            return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public WCState getWallConnectorState() {
            WCState valueOf = WCState.valueOf(this.wallConnectorState_);
            return valueOf == null ? WCState.UNRECOGNIZED : valueOf;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public int getWallConnectorStateValue() {
            return this.wallConnectorState_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public boolean hasVin() {
            return (this.vinBuilder_ == null && this.vin_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.WallConnectorStatusOrBuilder
        public boolean hasWallConnectorPower() {
            return (this.wallConnectorPowerBuilder_ == null && this.wallConnectorPower_ == null) ? false : true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(WallConnectorStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeVin(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.vin_;
                if (stringValue2 != null) {
                    this.vin_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.vin_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder mergeWallConnectorPower(FloatValue floatValue) {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV3 == null) {
                FloatValue floatValue2 = this.wallConnectorPower_;
                if (floatValue2 != null) {
                    this.wallConnectorPower_ = FloatValue.newBuilder(floatValue2).mergeFrom(floatValue).buildPartial();
                } else {
                    this.wallConnectorPower_ = floatValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(floatValue);
            }
            return this;
        }

        public Builder setDin(String str) {
            Objects.requireNonNull(str);
            this.din_ = str;
            onChanged();
            return this;
        }

        public Builder setDinBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.din_ = byteString;
            onChanged();
            return this;
        }

        public Builder setVin(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(stringValue);
                this.vin_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setWallConnectorFaultState(WCFaultStatusState wCFaultStatusState) {
            Objects.requireNonNull(wCFaultStatusState);
            this.wallConnectorFaultState_ = wCFaultStatusState.getNumber();
            onChanged();
            return this;
        }

        public Builder setWallConnectorFaultStateValue(int i11) {
            this.wallConnectorFaultState_ = i11;
            onChanged();
            return this;
        }

        public Builder setWallConnectorPower(FloatValue floatValue) {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(floatValue);
                this.wallConnectorPower_ = floatValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(floatValue);
            }
            return this;
        }

        public Builder setWallConnectorState(WCState wCState) {
            Objects.requireNonNull(wCState);
            this.wallConnectorState_ = wCState.getNumber();
            onChanged();
            return this;
        }

        public Builder setWallConnectorStateValue(int i11) {
            this.wallConnectorState_ = i11;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WallConnectorStatus build() {
            WallConnectorStatus buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WallConnectorStatus buildPartial() {
            WallConnectorStatus wallConnectorStatus = new WallConnectorStatus(this);
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 == null) {
                wallConnectorStatus.vin_ = this.vin_;
            } else {
                wallConnectorStatus.vin_ = singleFieldBuilderV3.build();
            }
            wallConnectorStatus.wallConnectorState_ = this.wallConnectorState_;
            wallConnectorStatus.wallConnectorFaultState_ = this.wallConnectorFaultState_;
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV32 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV32 == null) {
                wallConnectorStatus.wallConnectorPower_ = this.wallConnectorPower_;
            } else {
                wallConnectorStatus.wallConnectorPower_ = singleFieldBuilderV32.build();
            }
            wallConnectorStatus.din_ = this.din_;
            onBuilt();
            return wallConnectorStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WallConnectorStatus getDefaultInstanceForType() {
            return WallConnectorStatus.getDefaultInstance();
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
            if (this.vinBuilder_ == null) {
                this.vin_ = null;
            } else {
                this.vin_ = null;
                this.vinBuilder_ = null;
            }
            this.wallConnectorState_ = 0;
            this.wallConnectorFaultState_ = 0;
            if (this.wallConnectorPowerBuilder_ == null) {
                this.wallConnectorPower_ = null;
            } else {
                this.wallConnectorPower_ = null;
                this.wallConnectorPowerBuilder_ = null;
            }
            this.din_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.wallConnectorState_ = 0;
            this.wallConnectorFaultState_ = 0;
            this.din_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setVin(StringValue.Builder builder) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.vinBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.vin_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setWallConnectorPower(FloatValue.Builder builder) {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.wallConnectorPowerBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.wallConnectorPower_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo115clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof WallConnectorStatus) {
                return mergeFrom((WallConnectorStatus) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(WallConnectorStatus wallConnectorStatus) {
            if (wallConnectorStatus == WallConnectorStatus.getDefaultInstance()) {
                return this;
            }
            if (wallConnectorStatus.hasVin()) {
                mergeVin(wallConnectorStatus.getVin());
            }
            if (wallConnectorStatus.wallConnectorState_ != 0) {
                setWallConnectorStateValue(wallConnectorStatus.getWallConnectorStateValue());
            }
            if (wallConnectorStatus.wallConnectorFaultState_ != 0) {
                setWallConnectorFaultStateValue(wallConnectorStatus.getWallConnectorFaultStateValue());
            }
            if (wallConnectorStatus.hasWallConnectorPower()) {
                mergeWallConnectorPower(wallConnectorStatus.getWallConnectorPower());
            }
            if (!wallConnectorStatus.getDin().isEmpty()) {
                this.din_ = wallConnectorStatus.din_;
                onChanged();
            }
            mergeUnknownFields(((GeneratedMessageV3) wallConnectorStatus).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.WallConnectorStatus.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.WallConnectorStatus.i()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.WallConnectorStatus r3 = (com.tesla.proto.energy.powergate.v1.WallConnectorStatus) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.WallConnectorStatus r4 = (com.tesla.proto.energy.powergate.v1.WallConnectorStatus) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.WallConnectorStatus.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.WallConnectorStatus$Builder");
        }
    }

    public static Builder newBuilder(WallConnectorStatus wallConnectorStatus) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(wallConnectorStatus);
    }

    public static WallConnectorStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private WallConnectorStatus() {
        this.memoizedIsInitialized = (byte) -1;
        this.wallConnectorState_ = 0;
        this.wallConnectorFaultState_ = 0;
        this.din_ = "";
    }

    public static WallConnectorStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WallConnectorStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WallConnectorStatus parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public WallConnectorStatus getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static WallConnectorStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static WallConnectorStatus parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static WallConnectorStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static WallConnectorStatus parseFrom(InputStream inputStream) {
        return (WallConnectorStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private WallConnectorStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                StringValue stringValue = this.vin_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.vin_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.vin_ = builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.wallConnectorState_ = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                this.wallConnectorFaultState_ = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                FloatValue floatValue = this.wallConnectorPower_;
                                FloatValue.Builder builder2 = floatValue != null ? floatValue.toBuilder() : null;
                                FloatValue floatValue2 = (FloatValue) codedInputStream.readMessage(FloatValue.parser(), extensionRegistryLite);
                                this.wallConnectorPower_ = floatValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(floatValue2);
                                    this.wallConnectorPower_ = builder2.buildPartial();
                                }
                            } else if (readTag != 42) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.din_ = codedInputStream.readStringRequireUtf8();
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

    public static WallConnectorStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WallConnectorStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WallConnectorStatus parseFrom(CodedInputStream codedInputStream) {
        return (WallConnectorStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static WallConnectorStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WallConnectorStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}