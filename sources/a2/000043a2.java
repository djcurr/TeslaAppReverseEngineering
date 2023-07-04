package com.plaid.internal;

import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;

/* loaded from: classes2.dex */
public final class e6 {

    /* renamed from: a */
    public static final e6 f18523a = new e6();

    public final LinkExit a(LinkError linkError, LinkExitMetadata metadata) {
        kotlin.jvm.internal.s.g(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    public final LinkInstitution b(String str, String str2) {
        boolean z11 = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                return new LinkInstitution(str, str2);
            }
        }
        return null;
    }

    public final LinkError a(String errorCode, String errorMessage, String displayMessage, String errorJson) {
        kotlin.jvm.internal.s.g(errorCode, "errorCode");
        kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
        kotlin.jvm.internal.s.g(displayMessage, "displayMessage");
        kotlin.jvm.internal.s.g(errorJson, "errorJson");
        return new LinkError(LinkErrorCode.Companion.convert(errorCode), errorMessage, displayMessage, errorJson);
    }

    public static /* synthetic */ LinkExitMetadata a(e6 e6Var, String str, String str2, String str3, String str4, LinkExitMetadataStatus linkExitMetadataStatus, String str5, int i11) {
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return e6Var.a(null, null, null, str4, null, null);
    }

    public final LinkExitMetadata a(String str, String str2, String str3, String str4, LinkExitMetadataStatus linkExitMetadataStatus, String str5) {
        return new LinkExitMetadata(linkExitMetadataStatus, b(str3, str2), str, str4, str5);
    }

    public final String a(String linkSessionId, String requestId) {
        kotlin.jvm.internal.s.g(linkSessionId, "linkSessionId");
        kotlin.jvm.internal.s.g(requestId, "requestId");
        return "{\"link_session_id\":\"" + linkSessionId + "\",\"request_id\":\"" + requestId + "\"}";
    }
}