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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.tesla.proto.energy.powergate.v1.BatteryStatus;
import com.tesla.proto.energy.powergate.v1.GeneratorStatus;
import com.tesla.proto.energy.powergate.v1.GridStatus;
import com.tesla.proto.energy.powergate.v1.LoadStatus;
import com.tesla.proto.energy.powergate.v1.SolarStatus;
import com.tesla.proto.energy.powergate.v1.StormWatchActiveState;
import com.tesla.proto.energy.powergate.v1.WallConnectorStatus;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class LiveStatus extends GeneratedMessageV3 implements LiveStatusOrBuilder {
    public static final int BATTERY_STATUS_FIELD_NUMBER = 3;
    public static final int GENERATOR_STATUS_FIELD_NUMBER = 6;
    public static final int GRID_STATUS_FIELD_NUMBER = 5;
    public static final int ISLAND_STATUS_FIELD_NUMBER = 7;
    public static final int LOAD_STATUS_FIELD_NUMBER = 4;
    public static final int SOLAR_STATUS_FIELD_NUMBER = 2;
    public static final int STORM_MODE_ACTIVE_FIELD_NUMBER = 8;
    public static final int STORM_MODE_STATES_FIELD_NUMBER = 9;
    public static final int TIMESTAMP_FIELD_NUMBER = 10;
    public static final int WALL_CONNECTOR_STATUSES_FIELD_NUMBER = 11;
    private static final long serialVersionUID = 0;
    private BatteryStatus batteryStatus_;
    private GeneratorStatus generatorStatus_;
    private GridStatus gridStatus_;
    private int islandStatus_;
    private LoadStatus loadStatus_;
    private byte memoizedIsInitialized;
    private SolarStatus solarStatus_;
    private boolean stormModeActive_;
    private List<StormWatchActiveState> stormModeStates_;
    private volatile Object timestamp_;
    private List<WallConnectorStatus> wallConnectorStatuses_;
    private static final LiveStatus DEFAULT_INSTANCE = new LiveStatus();
    private static final Parser<LiveStatus> PARSER = new AbstractParser<LiveStatus>() { // from class: com.tesla.proto.energy.powergate.v1.LiveStatus.1
        @Override // com.google.protobuf.Parser
        public LiveStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new LiveStatus(codedInputStream, extensionRegistryLite);
        }
    };

    private LiveStatus(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static LiveStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_LiveStatus_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static LiveStatus parseDelimitedFrom(InputStream inputStream) {
        return (LiveStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LiveStatus parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<LiveStatus> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveStatus)) {
            return super.equals(obj);
        }
        LiveStatus liveStatus = (LiveStatus) obj;
        if (hasSolarStatus() != liveStatus.hasSolarStatus()) {
            return false;
        }
        if ((!hasSolarStatus() || getSolarStatus().equals(liveStatus.getSolarStatus())) && hasBatteryStatus() == liveStatus.hasBatteryStatus()) {
            if ((!hasBatteryStatus() || getBatteryStatus().equals(liveStatus.getBatteryStatus())) && hasLoadStatus() == liveStatus.hasLoadStatus()) {
                if ((!hasLoadStatus() || getLoadStatus().equals(liveStatus.getLoadStatus())) && hasGridStatus() == liveStatus.hasGridStatus()) {
                    if ((!hasGridStatus() || getGridStatus().equals(liveStatus.getGridStatus())) && hasGeneratorStatus() == liveStatus.hasGeneratorStatus()) {
                        return (!hasGeneratorStatus() || getGeneratorStatus().equals(liveStatus.getGeneratorStatus())) && this.islandStatus_ == liveStatus.islandStatus_ && getStormModeActive() == liveStatus.getStormModeActive() && getStormModeStatesList().equals(liveStatus.getStormModeStatesList()) && getTimestamp().equals(liveStatus.getTimestamp()) && getWallConnectorStatusesList().equals(liveStatus.getWallConnectorStatusesList()) && this.unknownFields.equals(liveStatus.unknownFields);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public BatteryStatus getBatteryStatus() {
        BatteryStatus batteryStatus = this.batteryStatus_;
        return batteryStatus == null ? BatteryStatus.getDefaultInstance() : batteryStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public BatteryStatusOrBuilder getBatteryStatusOrBuilder() {
        return getBatteryStatus();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public GeneratorStatus getGeneratorStatus() {
        GeneratorStatus generatorStatus = this.generatorStatus_;
        return generatorStatus == null ? GeneratorStatus.getDefaultInstance() : generatorStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public GeneratorStatusOrBuilder getGeneratorStatusOrBuilder() {
        return getGeneratorStatus();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public GridStatus getGridStatus() {
        GridStatus gridStatus = this.gridStatus_;
        return gridStatus == null ? GridStatus.getDefaultInstance() : gridStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public GridStatusOrBuilder getGridStatusOrBuilder() {
        return getGridStatus();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public IslandStatus getIslandStatus() {
        IslandStatus valueOf = IslandStatus.valueOf(this.islandStatus_);
        return valueOf == null ? IslandStatus.UNRECOGNIZED : valueOf;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public int getIslandStatusValue() {
        return this.islandStatus_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public LoadStatus getLoadStatus() {
        LoadStatus loadStatus = this.loadStatus_;
        return loadStatus == null ? LoadStatus.getDefaultInstance() : loadStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public LoadStatusOrBuilder getLoadStatusOrBuilder() {
        return getLoadStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<LiveStatus> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeMessageSize = this.solarStatus_ != null ? CodedOutputStream.computeMessageSize(2, getSolarStatus()) + 0 : 0;
        if (this.batteryStatus_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getBatteryStatus());
        }
        if (this.loadStatus_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, getLoadStatus());
        }
        if (this.gridStatus_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, getGridStatus());
        }
        if (this.generatorStatus_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(6, getGeneratorStatus());
        }
        if (this.islandStatus_ != IslandStatus.ISLAND_STATUS_INVALID.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(7, this.islandStatus_);
        }
        boolean z11 = this.stormModeActive_;
        if (z11) {
            computeMessageSize += CodedOutputStream.computeBoolSize(8, z11);
        }
        for (int i12 = 0; i12 < this.stormModeStates_.size(); i12++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(9, this.stormModeStates_.get(i12));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.timestamp_)) {
            computeMessageSize += GeneratedMessageV3.computeStringSize(10, this.timestamp_);
        }
        for (int i13 = 0; i13 < this.wallConnectorStatuses_.size(); i13++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(11, this.wallConnectorStatuses_.get(i13));
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public SolarStatus getSolarStatus() {
        SolarStatus solarStatus = this.solarStatus_;
        return solarStatus == null ? SolarStatus.getDefaultInstance() : solarStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public SolarStatusOrBuilder getSolarStatusOrBuilder() {
        return getSolarStatus();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean getStormModeActive() {
        return this.stormModeActive_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public StormWatchActiveState getStormModeStates(int i11) {
        return this.stormModeStates_.get(i11);
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public int getStormModeStatesCount() {
        return this.stormModeStates_.size();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public List<StormWatchActiveState> getStormModeStatesList() {
        return this.stormModeStates_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public StormWatchActiveStateOrBuilder getStormModeStatesOrBuilder(int i11) {
        return this.stormModeStates_.get(i11);
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public List<? extends StormWatchActiveStateOrBuilder> getStormModeStatesOrBuilderList() {
        return this.stormModeStates_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public WallConnectorStatus getWallConnectorStatuses(int i11) {
        return this.wallConnectorStatuses_.get(i11);
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public int getWallConnectorStatusesCount() {
        return this.wallConnectorStatuses_.size();
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public List<WallConnectorStatus> getWallConnectorStatusesList() {
        return this.wallConnectorStatuses_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public WallConnectorStatusOrBuilder getWallConnectorStatusesOrBuilder(int i11) {
        return this.wallConnectorStatuses_.get(i11);
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public List<? extends WallConnectorStatusOrBuilder> getWallConnectorStatusesOrBuilderList() {
        return this.wallConnectorStatuses_;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean hasBatteryStatus() {
        return this.batteryStatus_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean hasGeneratorStatus() {
        return this.generatorStatus_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean hasGridStatus() {
        return this.gridStatus_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean hasLoadStatus() {
        return this.loadStatus_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
    public boolean hasSolarStatus() {
        return this.solarStatus_ != null;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasSolarStatus()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSolarStatus().hashCode();
        }
        if (hasBatteryStatus()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getBatteryStatus().hashCode();
        }
        if (hasLoadStatus()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getLoadStatus().hashCode();
        }
        if (hasGridStatus()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getGridStatus().hashCode();
        }
        if (hasGeneratorStatus()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getGeneratorStatus().hashCode();
        }
        int hashBoolean = (((((((hashCode * 37) + 7) * 53) + this.islandStatus_) * 37) + 8) * 53) + Internal.hashBoolean(getStormModeActive());
        if (getStormModeStatesCount() > 0) {
            hashBoolean = (((hashBoolean * 37) + 9) * 53) + getStormModeStatesList().hashCode();
        }
        int hashCode2 = (((hashBoolean * 37) + 10) * 53) + getTimestamp().hashCode();
        if (getWallConnectorStatusesCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 11) * 53) + getWallConnectorStatusesList().hashCode();
        }
        int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_LiveStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveStatus.class, Builder.class);
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
        return new LiveStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.solarStatus_ != null) {
            codedOutputStream.writeMessage(2, getSolarStatus());
        }
        if (this.batteryStatus_ != null) {
            codedOutputStream.writeMessage(3, getBatteryStatus());
        }
        if (this.loadStatus_ != null) {
            codedOutputStream.writeMessage(4, getLoadStatus());
        }
        if (this.gridStatus_ != null) {
            codedOutputStream.writeMessage(5, getGridStatus());
        }
        if (this.generatorStatus_ != null) {
            codedOutputStream.writeMessage(6, getGeneratorStatus());
        }
        if (this.islandStatus_ != IslandStatus.ISLAND_STATUS_INVALID.getNumber()) {
            codedOutputStream.writeEnum(7, this.islandStatus_);
        }
        boolean z11 = this.stormModeActive_;
        if (z11) {
            codedOutputStream.writeBool(8, z11);
        }
        for (int i11 = 0; i11 < this.stormModeStates_.size(); i11++) {
            codedOutputStream.writeMessage(9, this.stormModeStates_.get(i11));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.timestamp_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.timestamp_);
        }
        for (int i12 = 0; i12 < this.wallConnectorStatuses_.size(); i12++) {
            codedOutputStream.writeMessage(11, this.wallConnectorStatuses_.get(i12));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveStatusOrBuilder {
        private SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> batteryStatusBuilder_;
        private BatteryStatus batteryStatus_;
        private int bitField0_;
        private SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> generatorStatusBuilder_;
        private GeneratorStatus generatorStatus_;
        private SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> gridStatusBuilder_;
        private GridStatus gridStatus_;
        private int islandStatus_;
        private SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> loadStatusBuilder_;
        private LoadStatus loadStatus_;
        private SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> solarStatusBuilder_;
        private SolarStatus solarStatus_;
        private boolean stormModeActive_;
        private RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> stormModeStatesBuilder_;
        private List<StormWatchActiveState> stormModeStates_;
        private Object timestamp_;
        private RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> wallConnectorStatusesBuilder_;
        private List<WallConnectorStatus> wallConnectorStatuses_;

        private Builder() {
            this.islandStatus_ = 0;
            this.stormModeStates_ = Collections.emptyList();
            this.timestamp_ = "";
            this.wallConnectorStatuses_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void ensureStormModeStatesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.stormModeStates_ = new ArrayList(this.stormModeStates_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureWallConnectorStatusesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.wallConnectorStatuses_ = new ArrayList(this.wallConnectorStatuses_);
                this.bitField0_ |= 2;
            }
        }

        private SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> getBatteryStatusFieldBuilder() {
            if (this.batteryStatusBuilder_ == null) {
                this.batteryStatusBuilder_ = new SingleFieldBuilderV3<>(getBatteryStatus(), getParentForChildren(), isClean());
                this.batteryStatus_ = null;
            }
            return this.batteryStatusBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_LiveStatus_descriptor;
        }

        private SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> getGeneratorStatusFieldBuilder() {
            if (this.generatorStatusBuilder_ == null) {
                this.generatorStatusBuilder_ = new SingleFieldBuilderV3<>(getGeneratorStatus(), getParentForChildren(), isClean());
                this.generatorStatus_ = null;
            }
            return this.generatorStatusBuilder_;
        }

        private SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> getGridStatusFieldBuilder() {
            if (this.gridStatusBuilder_ == null) {
                this.gridStatusBuilder_ = new SingleFieldBuilderV3<>(getGridStatus(), getParentForChildren(), isClean());
                this.gridStatus_ = null;
            }
            return this.gridStatusBuilder_;
        }

        private SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> getLoadStatusFieldBuilder() {
            if (this.loadStatusBuilder_ == null) {
                this.loadStatusBuilder_ = new SingleFieldBuilderV3<>(getLoadStatus(), getParentForChildren(), isClean());
                this.loadStatus_ = null;
            }
            return this.loadStatusBuilder_;
        }

        private SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> getSolarStatusFieldBuilder() {
            if (this.solarStatusBuilder_ == null) {
                this.solarStatusBuilder_ = new SingleFieldBuilderV3<>(getSolarStatus(), getParentForChildren(), isClean());
                this.solarStatus_ = null;
            }
            return this.solarStatusBuilder_;
        }

        private RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> getStormModeStatesFieldBuilder() {
            if (this.stormModeStatesBuilder_ == null) {
                this.stormModeStatesBuilder_ = new RepeatedFieldBuilderV3<>(this.stormModeStates_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.stormModeStates_ = null;
            }
            return this.stormModeStatesBuilder_;
        }

        private RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> getWallConnectorStatusesFieldBuilder() {
            if (this.wallConnectorStatusesBuilder_ == null) {
                this.wallConnectorStatusesBuilder_ = new RepeatedFieldBuilderV3<>(this.wallConnectorStatuses_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.wallConnectorStatuses_ = null;
            }
            return this.wallConnectorStatusesBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getStormModeStatesFieldBuilder();
                getWallConnectorStatusesFieldBuilder();
            }
        }

        public Builder addAllStormModeStates(Iterable<? extends StormWatchActiveState> iterable) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureStormModeStatesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.stormModeStates_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addAllWallConnectorStatuses(Iterable<? extends WallConnectorStatus> iterable) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWallConnectorStatusesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.wallConnectorStatuses_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addStormModeStates(StormWatchActiveState stormWatchActiveState) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(stormWatchActiveState);
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.add(stormWatchActiveState);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(stormWatchActiveState);
            }
            return this;
        }

        public StormWatchActiveState.Builder addStormModeStatesBuilder() {
            return getStormModeStatesFieldBuilder().addBuilder(StormWatchActiveState.getDefaultInstance());
        }

        public Builder addWallConnectorStatuses(WallConnectorStatus wallConnectorStatus) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(wallConnectorStatus);
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.add(wallConnectorStatus);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(wallConnectorStatus);
            }
            return this;
        }

        public WallConnectorStatus.Builder addWallConnectorStatusesBuilder() {
            return getWallConnectorStatusesFieldBuilder().addBuilder(WallConnectorStatus.getDefaultInstance());
        }

        public Builder clearBatteryStatus() {
            if (this.batteryStatusBuilder_ == null) {
                this.batteryStatus_ = null;
                onChanged();
            } else {
                this.batteryStatus_ = null;
                this.batteryStatusBuilder_ = null;
            }
            return this;
        }

        public Builder clearGeneratorStatus() {
            if (this.generatorStatusBuilder_ == null) {
                this.generatorStatus_ = null;
                onChanged();
            } else {
                this.generatorStatus_ = null;
                this.generatorStatusBuilder_ = null;
            }
            return this;
        }

        public Builder clearGridStatus() {
            if (this.gridStatusBuilder_ == null) {
                this.gridStatus_ = null;
                onChanged();
            } else {
                this.gridStatus_ = null;
                this.gridStatusBuilder_ = null;
            }
            return this;
        }

        public Builder clearIslandStatus() {
            this.islandStatus_ = 0;
            onChanged();
            return this;
        }

        public Builder clearLoadStatus() {
            if (this.loadStatusBuilder_ == null) {
                this.loadStatus_ = null;
                onChanged();
            } else {
                this.loadStatus_ = null;
                this.loadStatusBuilder_ = null;
            }
            return this;
        }

        public Builder clearSolarStatus() {
            if (this.solarStatusBuilder_ == null) {
                this.solarStatus_ = null;
                onChanged();
            } else {
                this.solarStatus_ = null;
                this.solarStatusBuilder_ = null;
            }
            return this;
        }

        public Builder clearStormModeActive() {
            this.stormModeActive_ = false;
            onChanged();
            return this;
        }

        public Builder clearStormModeStates() {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.stormModeStates_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = LiveStatus.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        public Builder clearWallConnectorStatuses() {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.wallConnectorStatuses_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public BatteryStatus getBatteryStatus() {
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV3 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                BatteryStatus batteryStatus = this.batteryStatus_;
                return batteryStatus == null ? BatteryStatus.getDefaultInstance() : batteryStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public BatteryStatus.Builder getBatteryStatusBuilder() {
            onChanged();
            return getBatteryStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public BatteryStatusOrBuilder getBatteryStatusOrBuilder() {
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV3 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            BatteryStatus batteryStatus = this.batteryStatus_;
            return batteryStatus == null ? BatteryStatus.getDefaultInstance() : batteryStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_LiveStatus_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public GeneratorStatus getGeneratorStatus() {
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV3 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                GeneratorStatus generatorStatus = this.generatorStatus_;
                return generatorStatus == null ? GeneratorStatus.getDefaultInstance() : generatorStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public GeneratorStatus.Builder getGeneratorStatusBuilder() {
            onChanged();
            return getGeneratorStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public GeneratorStatusOrBuilder getGeneratorStatusOrBuilder() {
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV3 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            GeneratorStatus generatorStatus = this.generatorStatus_;
            return generatorStatus == null ? GeneratorStatus.getDefaultInstance() : generatorStatus;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public GridStatus getGridStatus() {
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV3 = this.gridStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                GridStatus gridStatus = this.gridStatus_;
                return gridStatus == null ? GridStatus.getDefaultInstance() : gridStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public GridStatus.Builder getGridStatusBuilder() {
            onChanged();
            return getGridStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public GridStatusOrBuilder getGridStatusOrBuilder() {
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV3 = this.gridStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            GridStatus gridStatus = this.gridStatus_;
            return gridStatus == null ? GridStatus.getDefaultInstance() : gridStatus;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public IslandStatus getIslandStatus() {
            IslandStatus valueOf = IslandStatus.valueOf(this.islandStatus_);
            return valueOf == null ? IslandStatus.UNRECOGNIZED : valueOf;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public int getIslandStatusValue() {
            return this.islandStatus_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public LoadStatus getLoadStatus() {
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV3 = this.loadStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                LoadStatus loadStatus = this.loadStatus_;
                return loadStatus == null ? LoadStatus.getDefaultInstance() : loadStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public LoadStatus.Builder getLoadStatusBuilder() {
            onChanged();
            return getLoadStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public LoadStatusOrBuilder getLoadStatusOrBuilder() {
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV3 = this.loadStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            LoadStatus loadStatus = this.loadStatus_;
            return loadStatus == null ? LoadStatus.getDefaultInstance() : loadStatus;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public SolarStatus getSolarStatus() {
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                SolarStatus solarStatus = this.solarStatus_;
                return solarStatus == null ? SolarStatus.getDefaultInstance() : solarStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public SolarStatus.Builder getSolarStatusBuilder() {
            onChanged();
            return getSolarStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public SolarStatusOrBuilder getSolarStatusOrBuilder() {
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            SolarStatus solarStatus = this.solarStatus_;
            return solarStatus == null ? SolarStatus.getDefaultInstance() : solarStatus;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean getStormModeActive() {
            return this.stormModeActive_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public StormWatchActiveState getStormModeStates(int i11) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.stormModeStates_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessage(i11);
        }

        public StormWatchActiveState.Builder getStormModeStatesBuilder(int i11) {
            return getStormModeStatesFieldBuilder().getBuilder(i11);
        }

        public List<StormWatchActiveState.Builder> getStormModeStatesBuilderList() {
            return getStormModeStatesFieldBuilder().getBuilderList();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public int getStormModeStatesCount() {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.stormModeStates_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public List<StormWatchActiveState> getStormModeStatesList() {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.stormModeStates_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public StormWatchActiveStateOrBuilder getStormModeStatesOrBuilder(int i11) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.stormModeStates_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i11);
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public List<? extends StormWatchActiveStateOrBuilder> getStormModeStatesOrBuilderList() {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.stormModeStates_);
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public WallConnectorStatus getWallConnectorStatuses(int i11) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.wallConnectorStatuses_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessage(i11);
        }

        public WallConnectorStatus.Builder getWallConnectorStatusesBuilder(int i11) {
            return getWallConnectorStatusesFieldBuilder().getBuilder(i11);
        }

        public List<WallConnectorStatus.Builder> getWallConnectorStatusesBuilderList() {
            return getWallConnectorStatusesFieldBuilder().getBuilderList();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public int getWallConnectorStatusesCount() {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.wallConnectorStatuses_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public List<WallConnectorStatus> getWallConnectorStatusesList() {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.wallConnectorStatuses_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public WallConnectorStatusOrBuilder getWallConnectorStatusesOrBuilder(int i11) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.wallConnectorStatuses_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i11);
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public List<? extends WallConnectorStatusOrBuilder> getWallConnectorStatusesOrBuilderList() {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.wallConnectorStatuses_);
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean hasBatteryStatus() {
            return (this.batteryStatusBuilder_ == null && this.batteryStatus_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean hasGeneratorStatus() {
            return (this.generatorStatusBuilder_ == null && this.generatorStatus_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean hasGridStatus() {
            return (this.gridStatusBuilder_ == null && this.gridStatus_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean hasLoadStatus() {
            return (this.loadStatusBuilder_ == null && this.loadStatus_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.LiveStatusOrBuilder
        public boolean hasSolarStatus() {
            return (this.solarStatusBuilder_ == null && this.solarStatus_ == null) ? false : true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_LiveStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBatteryStatus(BatteryStatus batteryStatus) {
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV3 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                BatteryStatus batteryStatus2 = this.batteryStatus_;
                if (batteryStatus2 != null) {
                    this.batteryStatus_ = BatteryStatus.newBuilder(batteryStatus2).mergeFrom(batteryStatus).buildPartial();
                } else {
                    this.batteryStatus_ = batteryStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(batteryStatus);
            }
            return this;
        }

        public Builder mergeGeneratorStatus(GeneratorStatus generatorStatus) {
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV3 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                GeneratorStatus generatorStatus2 = this.generatorStatus_;
                if (generatorStatus2 != null) {
                    this.generatorStatus_ = GeneratorStatus.newBuilder(generatorStatus2).mergeFrom(generatorStatus).buildPartial();
                } else {
                    this.generatorStatus_ = generatorStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(generatorStatus);
            }
            return this;
        }

        public Builder mergeGridStatus(GridStatus gridStatus) {
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV3 = this.gridStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                GridStatus gridStatus2 = this.gridStatus_;
                if (gridStatus2 != null) {
                    this.gridStatus_ = GridStatus.newBuilder(gridStatus2).mergeFrom(gridStatus).buildPartial();
                } else {
                    this.gridStatus_ = gridStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(gridStatus);
            }
            return this;
        }

        public Builder mergeLoadStatus(LoadStatus loadStatus) {
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV3 = this.loadStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                LoadStatus loadStatus2 = this.loadStatus_;
                if (loadStatus2 != null) {
                    this.loadStatus_ = LoadStatus.newBuilder(loadStatus2).mergeFrom(loadStatus).buildPartial();
                } else {
                    this.loadStatus_ = loadStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(loadStatus);
            }
            return this;
        }

        public Builder mergeSolarStatus(SolarStatus solarStatus) {
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                SolarStatus solarStatus2 = this.solarStatus_;
                if (solarStatus2 != null) {
                    this.solarStatus_ = SolarStatus.newBuilder(solarStatus2).mergeFrom(solarStatus).buildPartial();
                } else {
                    this.solarStatus_ = solarStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(solarStatus);
            }
            return this;
        }

        public Builder removeStormModeStates(int i11) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.remove(i11);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i11);
            }
            return this;
        }

        public Builder removeWallConnectorStatuses(int i11) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.remove(i11);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i11);
            }
            return this;
        }

        public Builder setBatteryStatus(BatteryStatus batteryStatus) {
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV3 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(batteryStatus);
                this.batteryStatus_ = batteryStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(batteryStatus);
            }
            return this;
        }

        public Builder setGeneratorStatus(GeneratorStatus generatorStatus) {
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV3 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(generatorStatus);
                this.generatorStatus_ = generatorStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(generatorStatus);
            }
            return this;
        }

        public Builder setGridStatus(GridStatus gridStatus) {
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV3 = this.gridStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(gridStatus);
                this.gridStatus_ = gridStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(gridStatus);
            }
            return this;
        }

        public Builder setIslandStatus(IslandStatus islandStatus) {
            Objects.requireNonNull(islandStatus);
            this.islandStatus_ = islandStatus.getNumber();
            onChanged();
            return this;
        }

        public Builder setIslandStatusValue(int i11) {
            this.islandStatus_ = i11;
            onChanged();
            return this;
        }

        public Builder setLoadStatus(LoadStatus loadStatus) {
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV3 = this.loadStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(loadStatus);
                this.loadStatus_ = loadStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(loadStatus);
            }
            return this;
        }

        public Builder setSolarStatus(SolarStatus solarStatus) {
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(solarStatus);
                this.solarStatus_ = solarStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(solarStatus);
            }
            return this;
        }

        public Builder setStormModeActive(boolean z11) {
            this.stormModeActive_ = z11;
            onChanged();
            return this;
        }

        public Builder setStormModeStates(int i11, StormWatchActiveState stormWatchActiveState) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(stormWatchActiveState);
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.set(i11, stormWatchActiveState);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, stormWatchActiveState);
            }
            return this;
        }

        public Builder setTimestamp(String str) {
            Objects.requireNonNull(str);
            this.timestamp_ = str;
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString;
            onChanged();
            return this;
        }

        public Builder setWallConnectorStatuses(int i11, WallConnectorStatus wallConnectorStatus) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(wallConnectorStatus);
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.set(i11, wallConnectorStatus);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, wallConnectorStatus);
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LiveStatus build() {
            LiveStatus buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LiveStatus buildPartial() {
            LiveStatus liveStatus = new LiveStatus(this);
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                liveStatus.solarStatus_ = this.solarStatus_;
            } else {
                liveStatus.solarStatus_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV32 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV32 == null) {
                liveStatus.batteryStatus_ = this.batteryStatus_;
            } else {
                liveStatus.batteryStatus_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV33 = this.loadStatusBuilder_;
            if (singleFieldBuilderV33 == null) {
                liveStatus.loadStatus_ = this.loadStatus_;
            } else {
                liveStatus.loadStatus_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV34 = this.gridStatusBuilder_;
            if (singleFieldBuilderV34 == null) {
                liveStatus.gridStatus_ = this.gridStatus_;
            } else {
                liveStatus.gridStatus_ = singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV35 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV35 == null) {
                liveStatus.generatorStatus_ = this.generatorStatus_;
            } else {
                liveStatus.generatorStatus_ = singleFieldBuilderV35.build();
            }
            liveStatus.islandStatus_ = this.islandStatus_;
            liveStatus.stormModeActive_ = this.stormModeActive_;
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.stormModeStates_ = Collections.unmodifiableList(this.stormModeStates_);
                    this.bitField0_ &= -2;
                }
                liveStatus.stormModeStates_ = this.stormModeStates_;
            } else {
                liveStatus.stormModeStates_ = repeatedFieldBuilderV3.build();
            }
            liveStatus.timestamp_ = this.timestamp_;
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV32 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.wallConnectorStatuses_ = Collections.unmodifiableList(this.wallConnectorStatuses_);
                    this.bitField0_ &= -3;
                }
                liveStatus.wallConnectorStatuses_ = this.wallConnectorStatuses_;
            } else {
                liveStatus.wallConnectorStatuses_ = repeatedFieldBuilderV32.build();
            }
            onBuilt();
            return liveStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveStatus getDefaultInstanceForType() {
            return LiveStatus.getDefaultInstance();
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

        public StormWatchActiveState.Builder addStormModeStatesBuilder(int i11) {
            return getStormModeStatesFieldBuilder().addBuilder(i11, StormWatchActiveState.getDefaultInstance());
        }

        public WallConnectorStatus.Builder addWallConnectorStatusesBuilder(int i11) {
            return getWallConnectorStatusesFieldBuilder().addBuilder(i11, WallConnectorStatus.getDefaultInstance());
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
            if (this.solarStatusBuilder_ == null) {
                this.solarStatus_ = null;
            } else {
                this.solarStatus_ = null;
                this.solarStatusBuilder_ = null;
            }
            if (this.batteryStatusBuilder_ == null) {
                this.batteryStatus_ = null;
            } else {
                this.batteryStatus_ = null;
                this.batteryStatusBuilder_ = null;
            }
            if (this.loadStatusBuilder_ == null) {
                this.loadStatus_ = null;
            } else {
                this.loadStatus_ = null;
                this.loadStatusBuilder_ = null;
            }
            if (this.gridStatusBuilder_ == null) {
                this.gridStatus_ = null;
            } else {
                this.gridStatus_ = null;
                this.gridStatusBuilder_ = null;
            }
            if (this.generatorStatusBuilder_ == null) {
                this.generatorStatus_ = null;
            } else {
                this.generatorStatus_ = null;
                this.generatorStatusBuilder_ = null;
            }
            this.islandStatus_ = 0;
            this.stormModeActive_ = false;
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.stormModeStates_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.timestamp_ = "";
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV32 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.wallConnectorStatuses_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        public Builder setBatteryStatus(BatteryStatus.Builder builder) {
            SingleFieldBuilderV3<BatteryStatus, BatteryStatus.Builder, BatteryStatusOrBuilder> singleFieldBuilderV3 = this.batteryStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.batteryStatus_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setGeneratorStatus(GeneratorStatus.Builder builder) {
            SingleFieldBuilderV3<GeneratorStatus, GeneratorStatus.Builder, GeneratorStatusOrBuilder> singleFieldBuilderV3 = this.generatorStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.generatorStatus_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setGridStatus(GridStatus.Builder builder) {
            SingleFieldBuilderV3<GridStatus, GridStatus.Builder, GridStatusOrBuilder> singleFieldBuilderV3 = this.gridStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.gridStatus_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setLoadStatus(LoadStatus.Builder builder) {
            SingleFieldBuilderV3<LoadStatus, LoadStatus.Builder, LoadStatusOrBuilder> singleFieldBuilderV3 = this.loadStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.loadStatus_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setSolarStatus(SolarStatus.Builder builder) {
            SingleFieldBuilderV3<SolarStatus, SolarStatus.Builder, SolarStatusOrBuilder> singleFieldBuilderV3 = this.solarStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.solarStatus_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.islandStatus_ = 0;
            this.stormModeStates_ = Collections.emptyList();
            this.timestamp_ = "";
            this.wallConnectorStatuses_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addStormModeStates(int i11, StormWatchActiveState stormWatchActiveState) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(stormWatchActiveState);
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.add(i11, stormWatchActiveState);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, stormWatchActiveState);
            }
            return this;
        }

        public Builder addWallConnectorStatuses(int i11, WallConnectorStatus wallConnectorStatus) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(wallConnectorStatus);
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.add(i11, wallConnectorStatus);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, wallConnectorStatus);
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof LiveStatus) {
                return mergeFrom((LiveStatus) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setStormModeStates(int i11, StormWatchActiveState.Builder builder) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.set(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, builder.build());
            }
            return this;
        }

        public Builder setWallConnectorStatuses(int i11, WallConnectorStatus.Builder builder) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.set(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(LiveStatus liveStatus) {
            if (liveStatus == LiveStatus.getDefaultInstance()) {
                return this;
            }
            if (liveStatus.hasSolarStatus()) {
                mergeSolarStatus(liveStatus.getSolarStatus());
            }
            if (liveStatus.hasBatteryStatus()) {
                mergeBatteryStatus(liveStatus.getBatteryStatus());
            }
            if (liveStatus.hasLoadStatus()) {
                mergeLoadStatus(liveStatus.getLoadStatus());
            }
            if (liveStatus.hasGridStatus()) {
                mergeGridStatus(liveStatus.getGridStatus());
            }
            if (liveStatus.hasGeneratorStatus()) {
                mergeGeneratorStatus(liveStatus.getGeneratorStatus());
            }
            if (liveStatus.islandStatus_ != 0) {
                setIslandStatusValue(liveStatus.getIslandStatusValue());
            }
            if (liveStatus.getStormModeActive()) {
                setStormModeActive(liveStatus.getStormModeActive());
            }
            if (this.stormModeStatesBuilder_ == null) {
                if (!liveStatus.stormModeStates_.isEmpty()) {
                    if (this.stormModeStates_.isEmpty()) {
                        this.stormModeStates_ = liveStatus.stormModeStates_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureStormModeStatesIsMutable();
                        this.stormModeStates_.addAll(liveStatus.stormModeStates_);
                    }
                    onChanged();
                }
            } else if (!liveStatus.stormModeStates_.isEmpty()) {
                if (this.stormModeStatesBuilder_.isEmpty()) {
                    this.stormModeStatesBuilder_.dispose();
                    this.stormModeStatesBuilder_ = null;
                    this.stormModeStates_ = liveStatus.stormModeStates_;
                    this.bitField0_ &= -2;
                    this.stormModeStatesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStormModeStatesFieldBuilder() : null;
                } else {
                    this.stormModeStatesBuilder_.addAllMessages(liveStatus.stormModeStates_);
                }
            }
            if (!liveStatus.getTimestamp().isEmpty()) {
                this.timestamp_ = liveStatus.timestamp_;
                onChanged();
            }
            if (this.wallConnectorStatusesBuilder_ == null) {
                if (!liveStatus.wallConnectorStatuses_.isEmpty()) {
                    if (this.wallConnectorStatuses_.isEmpty()) {
                        this.wallConnectorStatuses_ = liveStatus.wallConnectorStatuses_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureWallConnectorStatusesIsMutable();
                        this.wallConnectorStatuses_.addAll(liveStatus.wallConnectorStatuses_);
                    }
                    onChanged();
                }
            } else if (!liveStatus.wallConnectorStatuses_.isEmpty()) {
                if (this.wallConnectorStatusesBuilder_.isEmpty()) {
                    this.wallConnectorStatusesBuilder_.dispose();
                    this.wallConnectorStatusesBuilder_ = null;
                    this.wallConnectorStatuses_ = liveStatus.wallConnectorStatuses_;
                    this.bitField0_ &= -3;
                    this.wallConnectorStatusesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getWallConnectorStatusesFieldBuilder() : null;
                } else {
                    this.wallConnectorStatusesBuilder_.addAllMessages(liveStatus.wallConnectorStatuses_);
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) liveStatus).unknownFields);
            onChanged();
            return this;
        }

        public Builder addStormModeStates(StormWatchActiveState.Builder builder) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addWallConnectorStatuses(WallConnectorStatus.Builder builder) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addStormModeStates(int i11, StormWatchActiveState.Builder builder) {
            RepeatedFieldBuilderV3<StormWatchActiveState, StormWatchActiveState.Builder, StormWatchActiveStateOrBuilder> repeatedFieldBuilderV3 = this.stormModeStatesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureStormModeStatesIsMutable();
                this.stormModeStates_.add(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, builder.build());
            }
            return this;
        }

        public Builder addWallConnectorStatuses(int i11, WallConnectorStatus.Builder builder) {
            RepeatedFieldBuilderV3<WallConnectorStatus, WallConnectorStatus.Builder, WallConnectorStatusOrBuilder> repeatedFieldBuilderV3 = this.wallConnectorStatusesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWallConnectorStatusesIsMutable();
                this.wallConnectorStatuses_.add(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, builder.build());
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.LiveStatus.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.LiveStatus.o()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.LiveStatus r3 = (com.tesla.proto.energy.powergate.v1.LiveStatus) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.LiveStatus r4 = (com.tesla.proto.energy.powergate.v1.LiveStatus) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.LiveStatus.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.LiveStatus$Builder");
        }
    }

    public static Builder newBuilder(LiveStatus liveStatus) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveStatus);
    }

    public static LiveStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private LiveStatus() {
        this.memoizedIsInitialized = (byte) -1;
        this.islandStatus_ = 0;
        this.stormModeStates_ = Collections.emptyList();
        this.timestamp_ = "";
        this.wallConnectorStatuses_ = Collections.emptyList();
    }

    public static LiveStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LiveStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LiveStatus parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public LiveStatus getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static LiveStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static LiveStatus parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static LiveStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LiveStatus parseFrom(InputStream inputStream) {
        return (LiveStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private LiveStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 18:
                                SolarStatus solarStatus = this.solarStatus_;
                                SolarStatus.Builder builder = solarStatus != null ? solarStatus.toBuilder() : null;
                                SolarStatus solarStatus2 = (SolarStatus) codedInputStream.readMessage(SolarStatus.parser(), extensionRegistryLite);
                                this.solarStatus_ = solarStatus2;
                                if (builder != null) {
                                    builder.mergeFrom(solarStatus2);
                                    this.solarStatus_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 26:
                                BatteryStatus batteryStatus = this.batteryStatus_;
                                BatteryStatus.Builder builder2 = batteryStatus != null ? batteryStatus.toBuilder() : null;
                                BatteryStatus batteryStatus2 = (BatteryStatus) codedInputStream.readMessage(BatteryStatus.parser(), extensionRegistryLite);
                                this.batteryStatus_ = batteryStatus2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(batteryStatus2);
                                    this.batteryStatus_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                LoadStatus loadStatus = this.loadStatus_;
                                LoadStatus.Builder builder3 = loadStatus != null ? loadStatus.toBuilder() : null;
                                LoadStatus loadStatus2 = (LoadStatus) codedInputStream.readMessage(LoadStatus.parser(), extensionRegistryLite);
                                this.loadStatus_ = loadStatus2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(loadStatus2);
                                    this.loadStatus_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                GridStatus gridStatus = this.gridStatus_;
                                GridStatus.Builder builder4 = gridStatus != null ? gridStatus.toBuilder() : null;
                                GridStatus gridStatus2 = (GridStatus) codedInputStream.readMessage(GridStatus.parser(), extensionRegistryLite);
                                this.gridStatus_ = gridStatus2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(gridStatus2);
                                    this.gridStatus_ = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                GeneratorStatus generatorStatus = this.generatorStatus_;
                                GeneratorStatus.Builder builder5 = generatorStatus != null ? generatorStatus.toBuilder() : null;
                                GeneratorStatus generatorStatus2 = (GeneratorStatus) codedInputStream.readMessage(GeneratorStatus.parser(), extensionRegistryLite);
                                this.generatorStatus_ = generatorStatus2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(generatorStatus2);
                                    this.generatorStatus_ = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 56:
                                this.islandStatus_ = codedInputStream.readEnum();
                                continue;
                            case 64:
                                this.stormModeActive_ = codedInputStream.readBool();
                                continue;
                            case 74:
                                boolean z13 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z13) {
                                    this.stormModeStates_ = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.stormModeStates_.add((StormWatchActiveState) codedInputStream.readMessage(StormWatchActiveState.parser(), extensionRegistryLite));
                                continue;
                            case 82:
                                this.timestamp_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 90:
                                boolean z14 = (z12 ? 1 : 0) & true;
                                z12 = z12;
                                if (!z14) {
                                    this.wallConnectorStatuses_ = new ArrayList();
                                    z12 = (z12 ? 1 : 0) | true;
                                }
                                this.wallConnectorStatuses_.add((WallConnectorStatus) codedInputStream.readMessage(WallConnectorStatus.parser(), extensionRegistryLite));
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                } else {
                                    continue;
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
                if ((z12 ? 1 : 0) & true) {
                    this.stormModeStates_ = Collections.unmodifiableList(this.stormModeStates_);
                }
                if ((z12 ? 1 : 0) & true) {
                    this.wallConnectorStatuses_ = Collections.unmodifiableList(this.wallConnectorStatuses_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static LiveStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LiveStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LiveStatus parseFrom(CodedInputStream codedInputStream) {
        return (LiveStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LiveStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LiveStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}