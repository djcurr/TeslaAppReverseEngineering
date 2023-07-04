package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface o6 {
    Object a(Workflow$LinkWorkflowEventRequest.Event event, zz.d<? super vz.b0> dVar);

    Object a(Collection<Workflow$LinkWorkflowEventRequest.Event> collection, zz.d<? super vz.b0> dVar);

    Object a(zz.d<? super Collection<Workflow$LinkWorkflowEventRequest.Event>> dVar);
}