package com.withpersona.sdk.inquiry.document.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse;", "", "Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Data;)V", "Attributes", "Data", "a", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DocumentVerificationStatusResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22374a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Attributes;", "", "", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22375a;

        public Attributes(String status) {
            s.g(status, "status");
            this.f22375a = status;
        }

        public final String a() {
            return this.f22375a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Data;", "", "Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse$Attributes;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22376a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22376a = attributes;
        }

        public final Attributes a() {
            return this.f22376a;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: com.withpersona.sdk.inquiry.document.network.DocumentVerificationStatusResponse$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0412a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0412a f22377a = new C0412a();

            private C0412a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f22378a = new b();

            private b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f22379a = new c();

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

    public DocumentVerificationStatusResponse(Data data) {
        s.g(data, "data");
        this.f22374a = data;
    }

    public final Data a() {
        return this.f22374a;
    }

    public final a b() {
        String a11 = this.f22374a.a().a();
        int hashCode = a11.hashCode();
        if (hashCode != -1281977283) {
            if (hashCode != -995381136) {
                if (hashCode == 348678395 && a11.equals("submitted")) {
                    return a.c.f22379a;
                }
            } else if (a11.equals("passed")) {
                return a.b.f22378a;
            }
        } else if (a11.equals("failed")) {
            return a.C0412a.f22377a;
        }
        return a.c.f22379a;
    }
}