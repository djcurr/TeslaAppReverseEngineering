package com.withpersona.sdk.inquiry.governmentid.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse;", "", "Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Data;", MessageExtension.FIELD_DATA, "", "included", "<init>", "(Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Data;Ljava/util/List;)V", "Attributes", "Data", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckVerificationResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22503a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Data> f22504b;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Data;", "", "", "id", "type", "Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Attributes;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22507a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22508b;

        /* renamed from: c  reason: collision with root package name */
        private final Attributes f22509c;

        public Data(String id2, String type, Attributes attributes) {
            s.g(id2, "id");
            s.g(type, "type");
            s.g(attributes, "attributes");
            this.f22507a = id2;
            this.f22508b = type;
            this.f22509c = attributes;
        }

        public final Attributes a() {
            return this.f22509c;
        }

        public final String b() {
            return this.f22507a;
        }

        public final String c() {
            return this.f22508b;
        }
    }

    public CheckVerificationResponse(Data data, List<Data> included) {
        s.g(data, "data");
        s.g(included, "included");
        this.f22503a = data;
        this.f22504b = included;
    }

    public final Data a() {
        return this.f22503a;
    }

    public final List<Data> b() {
        return this.f22504b;
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Attributes;", "", "", PermissionsResponse.STATUS_KEY, "", "entityConfidenceReasons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22505a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f22506b;

        public Attributes(String status, List<String> list) {
            s.g(status, "status");
            this.f22505a = status;
            this.f22506b = list;
        }

        public final List<String> a() {
            return this.f22506b;
        }

        public final String b() {
            return this.f22505a;
        }

        public /* synthetic */ Attributes(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? w.i() : list);
        }
    }
}