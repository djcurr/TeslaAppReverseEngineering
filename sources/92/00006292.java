package com.withpersona.sdk.inquiry.document.network;

import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest;", "", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Data;)V", "b", "Attributes", "a", "Data", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateDocumentVerificationRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22346b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22347a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Attributes;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22348a;

        public Attributes(String documentId) {
            s.g(documentId, "documentId");
            this.f22348a = documentId;
        }

        public final String a() {
            return this.f22348a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Data;", "", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest$Attributes;)V", "document_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final Attributes f22349a;

        public Data(Attributes attributes) {
            s.g(attributes, "attributes");
            this.f22349a = attributes;
        }

        public final Attributes a() {
            return this.f22349a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreateDocumentVerificationRequest a(String documentId) {
            s.g(documentId, "documentId");
            return new CreateDocumentVerificationRequest(new Data(new Attributes(documentId)));
        }
    }

    public CreateDocumentVerificationRequest(Data data) {
        s.g(data, "data");
        this.f22347a = data;
    }

    public final Data a() {
        return this.f22347a;
    }
}