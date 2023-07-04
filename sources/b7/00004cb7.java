package com.stripe.android.core.model.parsers;

import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFilePurpose;
import com.stripe.android.core.model.StripeJsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class StripeFileJsonParser implements ModelJsonParser<StripeFile> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_FILENAME = "filename";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_PURPOSE = "purpose";
    @Deprecated
    private static final String FIELD_SIZE = "size";
    @Deprecated
    private static final String FIELD_TITLE = "title";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_URL = "url";

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeFile parse(JSONObject json) {
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        return new StripeFile(optString, stripeJsonUtils.optLong(json, FIELD_CREATED), StripeJsonUtils.optString(json, FIELD_FILENAME), StripeFilePurpose.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_PURPOSE)), stripeJsonUtils.optInteger(json, FIELD_SIZE), StripeJsonUtils.optString(json, "title"), StripeJsonUtils.optString(json, "type"), StripeJsonUtils.optString(json, "url"));
    }
}