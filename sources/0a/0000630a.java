package com.withpersona.sdk.inquiry.governmentid.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse;", "", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Data;)V", "Attributes", "Data", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateVerificationResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22529a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Attributes;", "", "", "countryCode", "<init>", "(Ljava/lang/String;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22530a;

        public Attributes(String countryCode) {
            s.g(countryCode, "countryCode");
            this.f22530a = countryCode;
        }

        public final String a() {
            return this.f22530a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Data;", "", "", "id", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Attributes;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22531a;

        /* renamed from: b  reason: collision with root package name */
        private final Attributes f22532b;

        public Data(String id2, Attributes attributes) {
            s.g(id2, "id");
            s.g(attributes, "attributes");
            this.f22531a = id2;
            this.f22532b = attributes;
        }

        public final Attributes a() {
            return this.f22532b;
        }

        public final String b() {
            return this.f22531a;
        }
    }

    public CreateVerificationResponse(Data data) {
        s.g(data, "data");
        this.f22529a = data;
    }

    public final Data a() {
        return this.f22529a;
    }
}