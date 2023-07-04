package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;

/* loaded from: classes2.dex */
public final class ib {
    public static final LinkEvent a(Common$SDKEvent common$SDKEvent) {
        LinkEventMetadata metadata;
        kotlin.jvm.internal.s.g(common$SDKEvent, "<this>");
        if (common$SDKEvent.hasMetadata()) {
            String brandName = common$SDKEvent.getMetadata().getBrandName();
            String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            String errorType = common$SDKEvent.getMetadata().getErrorType();
            String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            String mfaType = common$SDKEvent.getMetadata().getMfaType();
            String requestId = common$SDKEvent.getMetadata().getRequestId();
            String selection = common$SDKEvent.getMetadata().getSelection();
            String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            String viewName = common$SDKEvent.getMetadata().getViewName();
            kotlin.jvm.internal.s.f(errorCode, "errorCode");
            kotlin.jvm.internal.s.f(errorMessage, "errorMessage");
            kotlin.jvm.internal.s.f(errorType, "errorType");
            kotlin.jvm.internal.s.f(exitStatus, "exitStatus");
            kotlin.jvm.internal.s.f(institutionId, "institutionId");
            kotlin.jvm.internal.s.f(institutionName, "institutionName");
            kotlin.jvm.internal.s.f(institutionSearchQuery, "institutionSearchQuery");
            kotlin.jvm.internal.s.f(linkSessionId, "linkSessionId");
            kotlin.jvm.internal.s.f(mfaType, "mfaType");
            kotlin.jvm.internal.s.f(requestId, "requestId");
            kotlin.jvm.internal.s.f(timestamp, "timestamp");
            kotlin.jvm.internal.s.f(viewName, "viewName");
            kotlin.jvm.internal.s.f(brandName, "brandName");
            kotlin.jvm.internal.s.f(selection, "selection");
            kotlin.jvm.internal.s.g(errorCode, "errorCode");
            kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
            kotlin.jvm.internal.s.g(errorType, "errorType");
            kotlin.jvm.internal.s.g(exitStatus, "exitStatus");
            kotlin.jvm.internal.s.g(institutionId, "institutionId");
            kotlin.jvm.internal.s.g(institutionName, "institutionName");
            kotlin.jvm.internal.s.g(institutionSearchQuery, "institutionSearchQuery");
            kotlin.jvm.internal.s.g(linkSessionId, "linkSessionId");
            kotlin.jvm.internal.s.g(mfaType, "mfaType");
            kotlin.jvm.internal.s.g(requestId, "requestId");
            kotlin.jvm.internal.s.g(timestamp, "timestamp");
            kotlin.jvm.internal.s.g(viewName, "viewName");
            kotlin.jvm.internal.s.g(brandName, "brandName");
            kotlin.jvm.internal.s.g(selection, "selection");
            metadata = new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, linkSessionId, mfaType, requestId, selection, timestamp, LinkEventViewName.Companion.fromString$link_sdk_release(viewName), null, null, 49152, null);
        } else {
            String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            kotlin.jvm.internal.s.f(brandName2, "metadata.brandName");
            kotlin.jvm.internal.s.g("", "errorCode");
            kotlin.jvm.internal.s.g("", "errorMessage");
            kotlin.jvm.internal.s.g("", "errorType");
            kotlin.jvm.internal.s.g("", "exitStatus");
            kotlin.jvm.internal.s.g("", "institutionId");
            kotlin.jvm.internal.s.g("", "institutionName");
            kotlin.jvm.internal.s.g("", "institutionSearchQuery");
            kotlin.jvm.internal.s.g("", "linkSessionId");
            kotlin.jvm.internal.s.g("", "mfaType");
            kotlin.jvm.internal.s.g("", "requestId");
            kotlin.jvm.internal.s.g("", FraudDetectionData.KEY_TIMESTAMP);
            kotlin.jvm.internal.s.g("", "viewName");
            kotlin.jvm.internal.s.g(brandName2, "brandName");
            kotlin.jvm.internal.s.g("", BaseSheetViewModel.SAVE_SELECTION);
            metadata = new LinkEventMetadata(brandName2, "", "", "", "", "", "", "", "", "", "", "", "", LinkEventViewName.Companion.fromString$link_sdk_release(""), null, null, 49152, null);
        }
        String eventName = common$SDKEvent.getEventName();
        kotlin.jvm.internal.s.f(eventName, "event.eventName");
        kotlin.jvm.internal.s.g(eventName, "eventName");
        kotlin.jvm.internal.s.g(metadata, "metadata");
        return new LinkEvent(LinkEventName.Companion.fromString$link_sdk_release(eventName), metadata);
    }
}