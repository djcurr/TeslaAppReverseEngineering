package com.withpersona.sdk.inquiry.phone.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse;", "", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Data;)V", "Attributes", "Data", "phone_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitNameResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22846a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Attributes;", "", "", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;)V", "phone_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22847a;

        public Attributes(String status) {
            s.g(status, "status");
            this.f22847a = status;
        }

        public final String a() {
            return this.f22847a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Data;", "", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse$Attributes;)V", "phone_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22848a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22848a = attributes;
        }

        public final Attributes a() {
            return this.f22848a;
        }
    }

    public SubmitNameResponse(Data data) {
        s.g(data, "data");
        this.f22846a = data;
    }

    public final Data a() {
        return this.f22846a;
    }
}