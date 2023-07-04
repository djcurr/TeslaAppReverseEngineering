package com.withpersona.sdk.inquiry.internal.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Data;", MessageExtension.FIELD_DATA, "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Data;Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V", "Data", "Meta", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquirySessionResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22672a;

    /* renamed from: b  reason: collision with root package name */
    private final Meta f22673b;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Data;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22674a;

        public Data(String id2) {
            s.g(id2, "id");
            this.f22674a = id2;
        }

        public final String a() {
            return this.f22674a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "", "accessToken", "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Meta {

        /* renamed from: a  reason: collision with root package name */
        private final String f22675a;

        public Meta(String accessToken) {
            s.g(accessToken, "accessToken");
            this.f22675a = accessToken;
        }

        public final String a() {
            return this.f22675a;
        }
    }

    public CreateInquirySessionResponse(Data data, Meta meta) {
        s.g(data, "data");
        s.g(meta, "meta");
        this.f22672a = data;
        this.f22673b = meta;
    }

    public final Data a() {
        return this.f22672a;
    }

    public final Meta b() {
        return this.f22673b;
    }
}