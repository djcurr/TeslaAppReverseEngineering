package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;

/* loaded from: classes2.dex */
public interface md {
    @m80.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @m80.o("/link/workflow/event")
    Object a(@m80.a Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest, zz.d<? super f7<Workflow$LinkWorkflowEventResponse, ? extends Object>> dVar);

    @m80.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @m80.o("/link/workflow/next")
    Object a(@m80.a Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, zz.d<? super f7<Workflow$LinkWorkflowNextResponse, ? extends Object>> dVar);

    @m80.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @m80.o("link/workflow/poll")
    Object a(@m80.a Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest, zz.d<? super f7<Workflow$LinkWorkflowPollResponse, ? extends Object>> dVar);

    @m80.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @m80.o("/link/workflow/search")
    Object a(@m80.a Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest, zz.d<? super f7<Workflow$LinkWorkflowSearchResponse, ? extends Object>> dVar);

    @m80.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @m80.o("/link/workflow/start")
    Object a(@m80.a Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, zz.d<? super f7<Workflow$LinkWorkflowStartResponse, ? extends Object>> dVar);
}