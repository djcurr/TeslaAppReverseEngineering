package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class SentryProject {
    private final int keyResId;
    private final int projectNumber;

    /* loaded from: classes2.dex */
    public static final class ConsumerPortal extends SentryProject {
        public static final ConsumerPortal INSTANCE = new ConsumerPortal();

        private ConsumerPortal() {
            super(1817, R.string.plaid_sentry_android_consumer_portal_api_key, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkSdk extends SentryProject {
        public static final LinkSdk INSTANCE = new LinkSdk();

        private LinkSdk() {
            super(563, R.string.plaid_sentry_android_link_sdk_api_key, null);
        }
    }

    private SentryProject(int i11, int i12) {
        this.projectNumber = i11;
        this.keyResId = i12;
    }

    public /* synthetic */ SentryProject(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    public final int getKeyResId() {
        return this.keyResId;
    }

    public final int getProjectNumber() {
        return this.projectNumber;
    }
}