package com.withpersona.sdk.inquiry.phone.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest;", "", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Data;)V", "b", "Attributes", "a", "Data", "phone_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitConfirmationCodeRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22827b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22828a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Attributes;", "", "", "confirmationCode", "<init>", "(Ljava/lang/String;)V", "phone_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22829a;

        public Attributes(String confirmationCode) {
            s.g(confirmationCode, "confirmationCode");
            this.f22829a = confirmationCode;
        }

        public final String a() {
            return this.f22829a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Data;", "", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest$Attributes;)V", "phone_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22830a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22830a = attributes;
        }

        public final Attributes a() {
            return this.f22830a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SubmitConfirmationCodeRequest a(String confirmationCode) {
            s.g(confirmationCode, "confirmationCode");
            return new SubmitConfirmationCodeRequest(new Data(new Attributes(confirmationCode)));
        }
    }

    public SubmitConfirmationCodeRequest(Data data) {
        s.g(data, "data");
        this.f22828a = data;
    }

    public final Data a() {
        return this.f22828a;
    }
}