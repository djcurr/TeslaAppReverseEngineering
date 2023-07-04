package com.withpersona.sdk.inquiry.document.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse;", "", "Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Data;)V", "Attributes", "Data", "a", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DocumentStatusResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22362a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Attributes;", "", "", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22363a;

        public Attributes(String status) {
            s.g(status, "status");
            this.f22363a = status;
        }

        public final String a() {
            return this.f22363a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Data;", "", "Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse$Attributes;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22364a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22364a = attributes;
        }

        public final Attributes a() {
            return this.f22364a;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: com.withpersona.sdk.inquiry.document.network.DocumentStatusResponse$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0411a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0411a f22365a = new C0411a();

            private C0411a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f22366a = new b();

            private b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f22367a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentStatusResponse(Data data) {
        s.g(data, "data");
        this.f22362a = data;
    }

    public final Data a() {
        return this.f22362a;
    }

    public final a b() {
        String a11 = this.f22362a.a().a();
        int hashCode = a11.hashCode();
        if (hashCode != -1478984537) {
            if (hashCode != -1094759602) {
                if (hashCode == 348678395 && a11.equals("submitted")) {
                    return a.c.f22367a;
                }
            } else if (a11.equals("processed")) {
                return a.b.f22366a;
            }
        } else if (a11.equals("errored")) {
            return a.C0411a.f22365a;
        }
        return a.c.f22367a;
    }
}