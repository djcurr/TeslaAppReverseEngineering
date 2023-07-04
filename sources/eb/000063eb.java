package com.withpersona.sdk.inquiry.selfie.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/network/SubmitVerificationResponse;", "", "Lcom/withpersona/sdk/inquiry/selfie/network/SubmitVerificationResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/selfie/network/SubmitVerificationResponse$Data;)V", "Data", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitVerificationResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22890a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/network/SubmitVerificationResponse$Data;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "selfie_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22891a;

        public Data(String id2) {
            s.g(id2, "id");
            this.f22891a = id2;
        }

        public final String a() {
            return this.f22891a;
        }
    }

    public SubmitVerificationResponse(Data data) {
        s.g(data, "data");
        this.f22890a = data;
    }

    public final Data a() {
        return this.f22890a;
    }
}