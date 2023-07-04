package com.withpersona.sdk.inquiry.database.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import sv.b;
import vz.v;
import wz.r0;
import wz.s0;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest;", "", "Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest$Data;)V", "b", "a", "Data", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateDatabaseVerificationRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22327b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22328a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest$Data;", "", "", "", "attributes", "<init>", "(Ljava/util/Map;)V", "database_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f22329a;

        public Data(Map<String, String> attributes) {
            s.g(attributes, "attributes");
            this.f22329a = attributes;
        }

        public final Map<String, String> a() {
            return this.f22329a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateDatabaseVerificationRequest a(b basicForm) {
            Map l11;
            int e11;
            s.g(basicForm, "basicForm");
            l11 = s0.l(v.a("countryCode", basicForm.e()), v.a("birthdate", basicForm.c()), v.a("nameFirst", basicForm.f()), v.a("nameMiddle", basicForm.i()), v.a("nameLast", basicForm.h()), v.a("addressStreet-1", basicForm.l()), v.a("addressStreet-2", basicForm.m()), v.a("addressCity", basicForm.d()), v.a("addressSubdivision", basicForm.n()), v.a("addressPostalCode", basicForm.k()), v.a("identificationNumber", basicForm.g()), v.a("phoneNumber", basicForm.j()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : l11.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            e11 = r0.e(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                s.e(value);
                linkedHashMap2.put(key, (String) value);
            }
            return new UpdateDatabaseVerificationRequest(new Data(linkedHashMap2));
        }
    }

    public UpdateDatabaseVerificationRequest(Data data) {
        s.g(data, "data");
        this.f22328a = data;
    }

    public final Data a() {
        return this.f22328a;
    }
}