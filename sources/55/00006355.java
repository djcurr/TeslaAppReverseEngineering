package com.withpersona.sdk.inquiry.internal.network;

import cg.c;
import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Data;", MessageExtension.FIELD_DATA, "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Data;Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Meta;)V", c.f9084i, "a", "Data", "Meta", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquirySessionRequest {

    /* renamed from: c  reason: collision with root package name */
    public static final a f22659c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22660a;

    /* renamed from: b  reason: collision with root package name */
    private final Meta f22661b;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Meta;", "", "", "inquiryId", "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Meta {

        /* renamed from: a  reason: collision with root package name */
        private final String f22663a;

        public Meta(String inquiryId) {
            s.g(inquiryId, "inquiryId");
            this.f22663a = inquiryId;
        }

        public final String a() {
            return this.f22663a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreateInquirySessionRequest a(String inquiryId) {
            s.g(inquiryId, "inquiryId");
            return new CreateInquirySessionRequest(new Data(null, 1, null), new Meta(inquiryId));
        }
    }

    public CreateInquirySessionRequest(Data data, Meta meta) {
        s.g(data, "data");
        s.g(meta, "meta");
        this.f22660a = data;
        this.f22661b = meta;
    }

    public final Data a() {
        return this.f22660a;
    }

    public final Meta b() {
        return this.f22661b;
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Data;", "", "", "type", "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22662a;

        public Data() {
            this(null, 1, null);
        }

        public Data(String type) {
            s.g(type, "type");
            this.f22662a = type;
        }

        public final String a() {
            return this.f22662a;
        }

        public /* synthetic */ Data(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "inquiry-session" : str);
        }
    }
}