package com.withpersona.sdk.inquiry.selfie.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest;", "", "Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Data;)V", "Attributes", "Data", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateVerificationRequest {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22866a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Attributes;", "", "<init>", "()V", "selfie_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {
    }

    public CreateVerificationRequest() {
        this(null, 1, null);
    }

    public CreateVerificationRequest(Data data) {
        s.g(data, "data");
        this.f22866a = data;
    }

    public final Data a() {
        return this.f22866a;
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Data;", "", "Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/selfie/network/CreateVerificationRequest$Attributes;)V", "selfie_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22867a;

        public Data() {
            this(null, 1, null);
        }

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22867a = attributes;
        }

        public final Attributes a() {
            return this.f22867a;
        }

        public /* synthetic */ Data(Attributes attributes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new Attributes() : attributes);
        }
    }

    public /* synthetic */ CreateVerificationRequest(Data data, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Data(null, 1, null) : data);
    }
}