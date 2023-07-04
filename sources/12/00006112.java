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
public final class BatteryStatus extends GeneratedMessageV3 implements BatteryStatusOrBuilder {
    public static final int BACKUP_CAPABLE_FIELD_NUMBER = 6;
    public static final int BATTERY_BREAKER_OPEN_FIELD_NUMBER = 7;
    public static final int BATTERY_POWER_FIELD_NUMBER = 5;
    public static final int BATTERY_TYPE_FIELD_NUMBER = 1;
    public static final int ENERGY_LEFT_FIELD_NUMBER = 2;
    public static final int PERCENTAGE_CHARGED_FIELD_NUMBER = 4;
    public static final int TOTAL_PACK_ENERGY_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private boolean backupCapable_;
    private boolean batteryBreakerOpen_;
    private double batteryPower_;
    private int batteryType_;
    private double energyLeft_;
    private byte memoizedIsInitialized;
    private double percentageCharged_;
    private double totalPackEnergy_;
    private static final BatteryStatus DEFAULT_INSTANCE = new BatteryStatus();
    private static final Parser<BatteryStatus> PARSER = new AbstractParser<BatteryStatus>() { // from class: com.tesla.proto.energy.powergate.v1.BatteryStatus.1
        @Override // com.google.protobuf.Parser
        public BatteryStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new BatteryStatus(codedInputStream, extensionRegistryLite);
        }
    };

    private BatteryStatus(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BatteryStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BatteryStatus parseDelimitedFrom(InputStream inputStream) {
        return (BatteryStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BatteryStatus parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<BatteryStatus> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatteryStatus)) {
            return super.equals(obj);
        }
        BatteryStatus batteryStatus = (BatteryStatus) obj;
        return this.batteryType_ == batteryStatus.batteryType_ && Double.doubleToLongBits(getEnergyLeft()) == Double.doubleToLongBits(batteryStatus.getEnergyLeft()) && Double.doubleToLongBits(getTotalPackEnergy()) == Double.doubleToLongBits(batteryStatus.getTotalPackEnergy()) && Double.doubleToLongBits(getPercentageCharged()) == Double.doubleToLongBits(batteryStatus.getPercentageCharged()) && Double.doubleToLongBits(getBatteryPower()) == Double.doubleToLongBits(batteryStatus.getBatteryPower()) && getBackupCapable() == batteryStatus.getBackupCapable() && getBatteryBreakerOpen() == batteryStatus.getBatteryBreakerOpen() && this.unknownFields.equals(batteryStatus.unknownFields);
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public boolean getBackupCapable() {
        return this.backupCapable_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public boolean getBatteryBreakerOpen() {
        return this.batteryBreakerOpen_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public double getBatteryPower() {
        return this.batteryPower_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public BatteryType getBatteryType() {
        BatteryType valueOf = BatteryType.valueOf(this.batteryType_);
        return valueOf == null ? BatteryType.UNRECOGNIZED : valueOf;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public int getBatteryTypeValue() {
        return this.batteryType_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public double getEnergyLeft() {
        return this.energyLeft_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<BatteryStatus> getParserForType() {
        return PARSER;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public double getPercentageCharged() {
        return this.percentageCharged_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeEnumSize = this.batteryType_ != BatteryType.BATTERY_TYPE_INVALID.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.batteryType_) : 0;
        if (Double.doubleToRawLongBits(this.energyLeft_) != 0) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(2, this.energyLeft_);
        }
        if (Double.doubleToRawLongBits(this.totalPackEnergy_) != 0) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(3, this.totalPackEnergy_);
        }
        if (Double.doubleToRawLongBits(this.percentageCharged_) != 0) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(4, this.percentageCharged_);
        }
        if (Double.doubleToRawLongBits(this.batteryPower_) != 0) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(5, this.batteryPower_);
        }
        boolean z11 = this.backupCapable_;
        if (z11) {
            computeEnumSize += CodedOutputStream.computeBoolSize(6, z11);
        }
        boolean z12 = this.batteryBreakerOpen_;
        if (z12) {
            computeEnumSize += CodedOutputStream.computeBoolSize(7, z12);
        }
        int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
    public double getTotalPackEnergy() {
        return this.totalPackEnergy_;
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
        int hashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.batteryType_) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getEnergyLeft()))) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getTotalPackEnergy()))) * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getPercentageCharged()))) * 37) + 5) * 53) + Internal.hashLong(Double.doubleToLongBits(getBatteryPower()))) * 37) + 6) * 53) + Internal.hashBoolean(getBackupCapable())) * 37) + 7) * 53) + Internal.hashBoolean(getBatteryBreakerOpen())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(BatteryStatus.class, Builder.class);
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
        return new BatteryStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.batteryType_ != BatteryType.BATTERY_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(1, this.batteryType_);
        }
        if (Double.doubleToRawLongBits(this.energyLeft_) != 0) {
            codedOutputStream.writeDouble(2, this.energyLeft_);
        }
        if (Double.doubleToRawLongBits(this.totalPackEnergy_) != 0) {
            codedOutputStream.writeDouble(3, this.totalPackEnergy_);
        }
        if (Double.doubleToRawLongBits(this.percentageCharged_) != 0) {
            codedOutputStream.writeDouble(4, this.percentageCharged_);
        }
        if (Double.doubleToRawLongBits(this.batteryPower_) != 0) {
            codedOutputStream.writeDouble(5, this.batteryPower_);
        }
        boolean z11 = this.backupCapable_;
        if (z11) {
            codedOutputStream.writeBool(6, z11);
        }
        boolean z12 = this.batteryBreakerOpen_;
        if (z12) {
            codedOutputStream.writeBool(7, z12);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BatteryStatusOrBuilder {
        private boolean backupCapable_;
        private boolean batteryBreakerOpen_;
        private double batteryPower_;
        private int batteryType_;
        private double energyLeft_;
        private double percentageCharged_;
        private double totalPackEnergy_;

        private Builder() {
            this.batteryType_ = 0;
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearBackupCapable() {
            this.backupCapable_ = false;
            onChanged();
            return this;
        }

        public Builder clearBatteryBreakerOpen() {
            this.batteryBreakerOpen_ = false;
            onChanged();
            return this;
        }

        public Builder clearBatteryPower() {
            this.batteryPower_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearBatteryType() {
            this.batteryType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearEnergyLeft() {
            this.energyLeft_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearPercentageCharged() {
            this.percentageCharged_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearTotalPackEnergy() {
            this.totalPackEnergy_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public boolean getBackupCapable() {
            return this.backupCapable_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public boolean getBatteryBreakerOpen() {
            return this.batteryBreakerOpen_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public double getBatteryPower() {
            return this.batteryPower_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public BatteryType getBatteryType() {
            BatteryType valueOf = BatteryType.valueOf(this.batteryType_);
            return valueOf == null ? BatteryType.UNRECOGNIZED : valueOf;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public int getBatteryTypeValue() {
            return this.batteryType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public double getEnergyLeft() {
            return this.energyLeft_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public double getPercentageCharged() {
            return this.percentageCharged_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.BatteryStatusOrBuilder
        public double getTotalPackEnergy() {
            return this.totalPackEnergy_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(BatteryStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBackupCapable(boolean z11) {
            this.backupCapable_ = z11;
            onChanged();
            return this;
        }

        public Builder setBatteryBreakerOpen(boolean z11) {
            this.batteryBreakerOpen_ = z11;
            onChanged();
            return this;
        }

        public Builder setBatteryPower(double d11) {
            this.batteryPower_ = d11;
            onChanged();
            return this;
        }

        public Builder setBatteryType(BatteryType batteryType) {
            Objects.requireNonNull(batteryType);
            this.batteryType_ = batteryType.getNumber();
            onChanged();
            return this;
        }

        public Builder setBatteryTypeValue(int i11) {
            this.batteryType_ = i11;
            onChanged();
            return this;
        }

        public Builder setEnergyLeft(double d11) {
            this.energyLeft_ = d11;
            onChanged();
            return this;
        }

        public Builder setPercentageCharged(double d11) {
            this.percentageCharged_ = d11;
            onChanged();
            return this;
        }

        public Builder setTotalPackEnergy(double d11) {
            this.totalPackEnergy_ = d11;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BatteryStatus build() {
            BatteryStatus buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BatteryStatus buildPartial() {
            BatteryStatus batteryStatus = new BatteryStatus(this);
            batteryStatus.batteryType_ = this.batteryType_;
            batteryStatus.energyLeft_ = this.energyLeft_;
            batteryStatus.totalPackEnergy_ = this.totalPackEnergy_;
            batteryStatus.percentageCharged_ = this.percentageCharged_;
            batteryStatus.batteryPower_ = this.batteryPower_;
            batteryStatus.backupCapable_ = this.backupCapable_;
            batteryStatus.batteryBreakerOpen_ = this.batteryBreakerOpen_;
            onBuilt();
            return batteryStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BatteryStatus getDefaultInstanceForType() {
            return BatteryStatus.getDefaultInstance();
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
            this.batteryType_ = 0;
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
            this.batteryType_ = 0;
            this.energyLeft_ = 0.0d;
            this.totalPackEnergy_ = 0.0d;
            this.percentageCharged_ = 0.0d;
            this.batteryPower_ = 0.0d;
            this.backupCapable_ = false;
            this.batteryBreakerOpen_ = false;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof BatteryStatus) {
                return mergeFrom((BatteryStatus) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BatteryStatus batteryStatus) {
            if (batteryStatus == BatteryStatus.getDefaultInstance()) {
                return this;
            }
            if (batteryStatus.batteryType_ != 0) {
                setBatteryTypeValue(batteryStatus.getBatteryTypeValue());
            }
            if (batteryStatus.getEnergyLeft() != 0.0d) {
                setEnergyLeft(batteryStatus.getEnergyLeft());
            }
            if (batteryStatus.getTotalPackEnergy() != 0.0d) {
                setTotalPackEnergy(batteryStatus.getTotalPackEnergy());
            }
            if (batteryStatus.getPercentageCharged() != 0.0d) {
                setPercentageCharged(batteryStatus.getPercentageCharged());
            }
            if (batteryStatus.getBatteryPower() != 0.0d) {
                setBatteryPower(batteryStatus.getBatteryPower());
            }
            if (batteryStatus.getBackupCapable()) {
                setBackupCapable(batteryStatus.getBackupCapable());
            }
            if (batteryStatus.getBatteryBreakerOpen()) {
                setBatteryBreakerOpen(batteryStatus.getBatteryBreakerOpen());
            }
            mergeUnknownFields(((GeneratedMessageV3) batteryStatus).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.BatteryStatus.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.BatteryStatus.i()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.BatteryStatus r3 = (com.tesla.proto.energy.powergate.v1.BatteryStatus) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.BatteryStatus r4 = (com.tesla.proto.energy.powergate.v1.BatteryStatus) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.BatteryStatus.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.BatteryStatus$Builder");
        }
    }

    public static Builder newBuilder(BatteryStatus batteryStatus) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(batteryStatus);
    }

    public static BatteryStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private BatteryStatus() {
        this.memoizedIsInitialized = (byte) -1;
        this.batteryType_ = 0;
    }

    public static BatteryStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BatteryStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BatteryStatus parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public BatteryStatus getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static BatteryStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static BatteryStatus parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private BatteryStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            if (readTag == 8) {
                                this.batteryType_ = codedInputStream.readEnum();
                            } else if (readTag == 17) {
                                this.energyLeft_ = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.totalPackEnergy_ = codedInputStream.readDouble();
                            } else if (readTag == 33) {
                                this.percentageCharged_ = codedInputStream.readDouble();
                            } else if (readTag == 41) {
                                this.batteryPower_ = codedInputStream.readDouble();
                            } else if (readTag == 48) {
                                this.backupCapable_ = codedInputStream.readBool();
                            } else if (readTag != 56) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.batteryBreakerOpen_ = codedInputStream.readBool();
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

    public static BatteryStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BatteryStatus parseFrom(InputStream inputStream) {
        return (BatteryStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BatteryStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BatteryStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BatteryStatus parseFrom(CodedInputStream codedInputStream) {
        return (BatteryStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BatteryStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BatteryStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}