package com.plaid.internal;

import com.plaid.internal.b3;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.internal.wa;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    public final cb f18234a;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18235a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18236b;

        static {
            int[] iArr = new int[Pane$PaneRendering.b.values().length];
            iArr[Pane$PaneRendering.b.SINK.ordinal()] = 1;
            iArr[Pane$PaneRendering.b.CONSENT.ordinal()] = 2;
            iArr[Pane$PaneRendering.b.CREDENTIALS.ordinal()] = 3;
            iArr[Pane$PaneRendering.b.BUTTON.ordinal()] = 4;
            iArr[Pane$PaneRendering.b.BUTTON_LIST.ordinal()] = 5;
            iArr[Pane$PaneRendering.b.BUTTON_WITH_ACCORDION.ordinal()] = 6;
            iArr[Pane$PaneRendering.b.BUTTON_WITH_CARDS.ordinal()] = 7;
            iArr[Pane$PaneRendering.b.BUTTON_WITH_TABLE.ordinal()] = 8;
            iArr[Pane$PaneRendering.b.BUTTON_WITH_WEBVIEW.ordinal()] = 9;
            iArr[Pane$PaneRendering.b.GRID_SELECTION.ordinal()] = 10;
            iArr[Pane$PaneRendering.b.OAUTH.ordinal()] = 11;
            iArr[Pane$PaneRendering.b.USER_INPUT.ordinal()] = 12;
            iArr[Pane$PaneRendering.b.USER_SELECTION.ordinal()] = 13;
            iArr[Pane$PaneRendering.b.SEARCH_AND_SELECT.ordinal()] = 14;
            iArr[Pane$PaneRendering.b.ORDERED_LIST.ordinal()] = 15;
            iArr[Pane$PaneRendering.b.HEADLESS_O_AUTH.ordinal()] = 16;
            iArr[Pane$PaneRendering.b.CHALLENGE.ordinal()] = 17;
            iArr[Pane$PaneRendering.b.SOURCE.ordinal()] = 18;
            iArr[Pane$PaneRendering.b.QR_CODE.ordinal()] = 19;
            iArr[Pane$PaneRendering.b.RENDERING_NOT_SET.ordinal()] = 20;
            iArr[Pane$PaneRendering.b.BETA_UPLOAD.ordinal()] = 21;
            iArr[Pane$PaneRendering.b.BETA_SWITCH_SEARCH_AND_SELECT.ordinal()] = 22;
            iArr[Pane$PaneRendering.b.BETA_BUTTON_WITH_MULTI_TABLE.ordinal()] = 23;
            iArr[Pane$PaneRendering.b.BETA_ASSETS_USER_SELECTION.ordinal()] = 24;
            iArr[Pane$PaneRendering.b.BETA_BUTTON_WITH_TABULAR_LIST.ordinal()] = 25;
            iArr[Pane$PaneRendering.b.BETA_BUTTON_WITH_ACCOUNT_LIST.ordinal()] = 26;
            f18235a = iArr;
            int[] iArr2 = new int[SdkResult$SDKResult.b.values().length];
            iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            f18236b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.DestinationFactory", f = "DestinationFactory.kt", l = {38}, m = "create")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18237a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18238b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18239c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f18240d;

        /* renamed from: f  reason: collision with root package name */
        public int f18242f;

        public b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18240d = obj;
            this.f18242f |= Integer.MIN_VALUE;
            return c3.this.a((g6) null, this);
        }
    }

    public c3(cb paneStore) {
        kotlin.jvm.internal.s.g(paneStore, "paneStore");
        this.f18234a = paneStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.g6 r10, zz.d<? super com.plaid.internal.b3> r11) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.c3.a(com.plaid.internal.g6, zz.d):java.lang.Object");
    }

    public final b3 a(String str, String str2, String str3) {
        return a(new s5("Invalid pane returned by backend", str, str2), str3);
    }

    public final LinkExit a(SdkResult$SDKResult result, String storedRequestId, String errorJson, String metadataJson) {
        LinkExitMetadata metadata;
        LinkInstitution linkInstitution;
        kotlin.jvm.internal.s.g(result, "result");
        kotlin.jvm.internal.s.g(storedRequestId, "storedRequestId");
        kotlin.jvm.internal.s.g(errorJson, "errorJson");
        kotlin.jvm.internal.s.g(metadataJson, "metadataJson");
        if (result.hasError() && !kotlin.jvm.internal.s.c(result.getError().getRequestId(), "")) {
            storedRequestId = result.getError().getRequestId();
        }
        String str = storedRequestId;
        LinkError linkError = null;
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata.Institution institution = result.getMetadata().hasInstitution() ? result.getMetadata().getInstitution() : null;
            String linkSessionId = result.getMetadata().getLinkSessionId();
            String name = institution == null ? null : institution.getName();
            String institutionId = institution == null ? null : institution.getInstitutionId();
            LinkExitMetadataStatus fromString = LinkExitMetadataStatus.Companion.fromString(result.getMetadata().getStatus());
            boolean z11 = false;
            if (!(institutionId == null || institutionId.length() == 0)) {
                if (name == null || name.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    linkInstitution = new LinkInstitution(institutionId, name);
                    metadata = new LinkExitMetadata(fromString, linkInstitution, linkSessionId, str, metadataJson);
                }
            }
            linkInstitution = null;
            metadata = new LinkExitMetadata(fromString, linkInstitution, linkSessionId, str, metadataJson);
        } else {
            metadata = e6.a(e6.f18523a, null, null, null, str, null, null, 55);
        }
        SdkResult$SDKResult.Error error = result.hasError() ? result.getError() : null;
        if (error != null) {
            String errorCode = error.getErrorCode();
            kotlin.jvm.internal.s.f(errorCode, "error.errorCode");
            String errorMessage = error.getErrorMessage();
            kotlin.jvm.internal.s.f(errorMessage, "error.errorMessage");
            String displayMessage = error.getDisplayMessage();
            kotlin.jvm.internal.s.f(displayMessage, "error.displayMessage");
            kotlin.jvm.internal.s.g(errorCode, "errorCode");
            kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
            kotlin.jvm.internal.s.g(displayMessage, "displayMessage");
            kotlin.jvm.internal.s.g(errorJson, "errorJson");
            linkError = new LinkError(LinkErrorCode.Companion.convert(errorCode), errorMessage, displayMessage, errorJson);
        }
        kotlin.jvm.internal.s.g(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    public final LinkSuccess a(SdkResult$SDKResult result, String metadataJson) {
        int t11;
        LinkInstitution linkInstitution;
        kotlin.jvm.internal.s.g(result, "result");
        kotlin.jvm.internal.s.g(metadataJson, "metadataJson");
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata metadata = result.getMetadata();
            kotlin.jvm.internal.s.f(metadata, "metadata");
            List<SdkResult$SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            kotlin.jvm.internal.s.f(accountsList, "metadata.accountsList");
            t11 = wz.x.t(accountsList, 10);
            ArrayList accounts = new ArrayList(t11);
            Iterator<T> it2 = accountsList.iterator();
            while (true) {
                linkInstitution = null;
                String str = null;
                linkInstitution = null;
                if (!it2.hasNext()) {
                    break;
                }
                SdkResult$SDKResult.Metadata.Account account = (SdkResult$SDKResult.Metadata.Account) it2.next();
                String accountId = account.getId();
                kotlin.jvm.internal.s.f(accountId, "account.id");
                String name = account.getName();
                String mask = account.getMask();
                LinkAccountSubtype accountSubType = LinkAccountSubtype.Companion.convert(account.getSubtype(), account.getType());
                String verificationStatus = account.getVerificationStatus();
                if (!(verificationStatus == null || verificationStatus.length() == 0)) {
                    str = account.getVerificationStatus();
                }
                kotlin.jvm.internal.s.g(accountId, "accountId");
                kotlin.jvm.internal.s.g(accountSubType, "accountSubType");
                accounts.add(new LinkAccount(accountId, name, mask, accountSubType, LinkAccountVerificationStatus.Companion.convert(str), null, 32, null));
            }
            SdkResult$SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            String institutionId = institution == null ? null : institution.getInstitutionId();
            String name2 = institution == null ? null : institution.getName();
            String linkSessionId = metadata.getLinkSessionId();
            kotlin.jvm.internal.s.f(linkSessionId, "metadata.linkSessionId");
            kotlin.jvm.internal.s.g(accounts, "accounts");
            kotlin.jvm.internal.s.g(linkSessionId, "linkSessionId");
            kotlin.jvm.internal.s.g(metadataJson, "metadataJson");
            if (!(institutionId == null || institutionId.length() == 0)) {
                if (!(name2 == null || name2.length() == 0)) {
                    linkInstitution = new LinkInstitution(institutionId, name2);
                }
            }
            LinkSuccessMetadata metadata2 = new LinkSuccessMetadata(linkInstitution, accounts, linkSessionId, metadataJson);
            String publicToken = result.getPublicToken();
            kotlin.jvm.internal.s.f(publicToken, "result.publicToken");
            kotlin.jvm.internal.s.g(publicToken, "publicToken");
            kotlin.jvm.internal.s.g(metadata2, "metadata");
            return new LinkSuccess(publicToken, metadata2);
        }
        throw new LinkException(kotlin.jvm.internal.s.p("Was successful but returned no data: ", result));
    }

    public final b3 a(Throwable th2, String str) {
        LinkError fromException$link_sdk_release;
        wa.a aVar = wa.f19678a;
        boolean z11 = true;
        wa.f19679b.a(th2, true);
        if (th2 instanceof r5) {
            wa.f19679b.a(th2, true);
            String str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists";
            if (str != null && str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists\n" + ((Object) str);
            }
            fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(new LinkException(str2));
        } else {
            fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(th2);
        }
        return new b3.b(new LinkExit(fromException$link_sdk_release, null, 2, null));
    }
}