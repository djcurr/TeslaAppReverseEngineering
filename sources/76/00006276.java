package com.withpersona.sdk.inquiry.database.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse;", "", "Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Data;)V", "Attributes", "Data", "a", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DatabaseVerificationStatusResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22309a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Attributes;", "", "", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;)V", "database_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22310a;

        public Attributes(String status) {
            s.g(status, "status");
            this.f22310a = status;
        }

        public final String a() {
            return this.f22310a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Data;", "", "Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse$Attributes;)V", "database_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22311a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22311a = attributes;
        }

        public final Attributes a() {
            return this.f22311a;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: com.withpersona.sdk.inquiry.database.network.DatabaseVerificationStatusResponse$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0410a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0410a f22312a = new C0410a();

            private C0410a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f22313a = new b();

            private b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f22314a = new c();

            private c() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f22315a = new d();

            private d() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DatabaseVerificationStatusResponse(Data data) {
        s.g(data, "data");
        this.f22309a = data;
    }

    public final Data a() {
        return this.f22309a;
    }

    public final a b() {
        String a11 = this.f22309a.a().a();
        int hashCode = a11.hashCode();
        if (hashCode != -995381136) {
            if (hashCode != -248987413) {
                if (hashCode == 348678395 && a11.equals("submitted")) {
                    return a.d.f22315a;
                }
            } else if (a11.equals("initiated")) {
                return a.b.f22313a;
            }
        } else if (a11.equals("passed")) {
            return a.c.f22314a;
        }
        return a.C0410a.f22312a;
    }
}