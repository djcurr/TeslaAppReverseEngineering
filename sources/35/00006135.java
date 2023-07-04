package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* loaded from: classes6.dex */
public interface LiveStatusOrBuilder extends MessageOrBuilder {
    BatteryStatus getBatteryStatus();

    BatteryStatusOrBuilder getBatteryStatusOrBuilder();

    GeneratorStatus getGeneratorStatus();

    GeneratorStatusOrBuilder getGeneratorStatusOrBuilder();

    GridStatus getGridStatus();

    GridStatusOrBuilder getGridStatusOrBuilder();

    IslandStatus getIslandStatus();

    int getIslandStatusValue();

    LoadStatus getLoadStatus();

    LoadStatusOrBuilder getLoadStatusOrBuilder();

    SolarStatus getSolarStatus();

    SolarStatusOrBuilder getSolarStatusOrBuilder();

    boolean getStormModeActive();

    StormWatchActiveState getStormModeStates(int i11);

    int getStormModeStatesCount();

    List<StormWatchActiveState> getStormModeStatesList();

    StormWatchActiveStateOrBuilder getStormModeStatesOrBuilder(int i11);

    List<? extends StormWatchActiveStateOrBuilder> getStormModeStatesOrBuilderList();

    String getTimestamp();

    ByteString getTimestampBytes();

    WallConnectorStatus getWallConnectorStatuses(int i11);

    int getWallConnectorStatusesCount();

    List<WallConnectorStatus> getWallConnectorStatusesList();

    WallConnectorStatusOrBuilder getWallConnectorStatusesOrBuilder(int i11);

    List<? extends WallConnectorStatusOrBuilder> getWallConnectorStatusesOrBuilderList();

    boolean hasBatteryStatus();

    boolean hasGeneratorStatus();

    boolean hasGridStatus();

    boolean hasLoadStatus();

    boolean hasSolarStatus();
}