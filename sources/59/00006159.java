package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueOrBuilder;

/* loaded from: classes6.dex */
public interface WallConnectorStatusOrBuilder extends MessageOrBuilder {
    String getDin();

    ByteString getDinBytes();

    StringValue getVin();

    StringValueOrBuilder getVinOrBuilder();

    WCFaultStatusState getWallConnectorFaultState();

    int getWallConnectorFaultStateValue();

    FloatValue getWallConnectorPower();

    FloatValueOrBuilder getWallConnectorPowerOrBuilder();

    WCState getWallConnectorState();

    int getWallConnectorStateValue();

    boolean hasVin();

    boolean hasWallConnectorPower();
}