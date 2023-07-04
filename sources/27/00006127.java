package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.MessageOrBuilder;
import com.tesla.proto.common.v1.UUIDv4;
import com.tesla.proto.common.v1.UUIDv4OrBuilder;

/* loaded from: classes6.dex */
public interface GetLiveStatusRequestOrBuilder extends MessageOrBuilder {
    UUIDv4 getAssetSiteId();

    UUIDv4OrBuilder getAssetSiteIdOrBuilder();

    UUIDv4 getRequestId();

    UUIDv4OrBuilder getRequestIdOrBuilder();

    boolean hasAssetSiteId();

    boolean hasRequestId();
}