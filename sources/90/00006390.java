package com.withpersona.sdk.inquiry.internal.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest;", "", "Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Data;)V", "b", "Attributes", "a", "Data", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateInquiryRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22772b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22773a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateInquiryRequest a() {
            return new UpdateInquiryRequest(new Data(new Attributes(null, Boolean.TRUE, 1, null), null, 2, null));
        }

        public final UpdateInquiryRequest b(String selectedCountryCode) {
            s.g(selectedCountryCode, "selectedCountryCode");
            return new UpdateInquiryRequest(new Data(new Attributes(selectedCountryCode, null, 2, null), null, 2, null));
        }
    }

    public UpdateInquiryRequest(Data data) {
        s.g(data, "data");
        this.f22773a = data;
    }

    public final Data a() {
        return this.f22773a;
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Data;", "", "Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Attributes;", "attributes", "", "type", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Attributes;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22776a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22777b;

        public Data(Attributes attributes, String type) {
            s.g(attributes, "attributes");
            s.g(type, "type");
            this.f22776a = attributes;
            this.f22777b = type;
        }

        public final Attributes a() {
            return this.f22776a;
        }

        public final String b() {
            return this.f22777b;
        }

        public /* synthetic */ Data(Attributes attributes, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(attributes, (i11 & 2) != 0 ? "inquiry" : str);
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Attributes;", "", "", "selectedCountryCode", "", "acceptedPolicies", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22774a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f22775b;

        public Attributes() {
            this(null, null, 3, null);
        }

        public Attributes(String str, Boolean bool) {
            this.f22774a = str;
            this.f22775b = bool;
        }

        public final Boolean a() {
            return this.f22775b;
        }

        public final String b() {
            return this.f22774a;
        }

        public /* synthetic */ Attributes(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
        }
    }
}