package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* loaded from: classes6.dex */
public interface StormWatchActiveStateOrBuilder extends MessageOrBuilder {
    String getEndTime();

    ByteString getEndTimeBytes();

    boolean getOptedOut();

    String getStartTime();

    ByteString getStartTimeBytes();

    String getStormType();

    ByteString getStormTypeBytes();

    String getWatchEventId();

    ByteString getWatchEventIdBytes();
}