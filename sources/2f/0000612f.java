package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* loaded from: classes6.dex */
public interface GridStatusOrBuilder extends MessageOrBuilder {
    double getGridPower();

    boolean getGridServicesActive();

    double getGridServicesPower();

    String getGridStatus();

    ByteString getGridStatusBytes();
}