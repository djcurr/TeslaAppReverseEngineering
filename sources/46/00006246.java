package com.withpersona.sdk.inquiry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.withpersona.sdk.inquiry.Attributes;
import com.withpersona.sdk.inquiry.Verification;
import com.withpersona.sdk.inquiry.internal.b;
import com.withpersona.sdk.inquiry.internal.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import zv.a0;
import zv.e0;
import zv.j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dBc\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry;", "", "Landroid/app/Activity;", "activity", "", "requestCode", "Lvz/b0;", "start", "", "templateId", "Ljava/lang/String;", "inquiryId", "accessToken", "referenceId", "accountId", "Lcom/withpersona/sdk/inquiry/Fields;", "fields", "Lcom/withpersona/sdk/inquiry/Fields;", "note", "theme", "Ljava/lang/Integer;", "Lcom/withpersona/sdk/inquiry/Environment;", "environment", "Lcom/withpersona/sdk/inquiry/Environment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Fields;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk/inquiry/Environment;)V", "Companion", "InquiryBuilder", "Response", "TemplateBuilder", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Inquiry {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final String accountId;
    private final Environment environment;
    private final Fields fields;
    private final String inquiryId;
    private final String note;
    private final String referenceId;
    private final String templateId;
    private final Integer theme;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Companion;", "", "", "templateId", "Lcom/withpersona/sdk/inquiry/Inquiry$TemplateBuilder;", "fromTemplate", "inquiryId", "Lcom/withpersona/sdk/inquiry/Inquiry$InquiryBuilder;", "fromInquiry", "Landroid/content/Intent;", "intent", "Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "onActivityResult", "<init>", "()V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[c.f.values().length];
                iArr[c.f.INITIATED.ordinal()] = 1;
                iArr[c.f.PASSED.ordinal()] = 2;
                iArr[c.f.REQUIRES_RETRY.ordinal()] = 3;
                iArr[c.f.FAILED.ordinal()] = 4;
                iArr[c.f.CANCELED.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[b.values().length];
                iArr2[b.INQUIRY_SUCCESS.ordinal()] = 1;
                iArr2[b.INQUIRY_CANCELED.ordinal()] = 2;
                iArr2[b.INQUIRY_FAILED.ordinal()] = 3;
                iArr2[b.INQUIRY_NETWORK_ERROR.ordinal()] = 4;
                iArr2[b.INQUIRY_BAD_TEMPLATE_ID_ERROR.ordinal()] = 5;
                iArr2[b.INQUIRY_UNKNOWN_ERROR.ordinal()] = 6;
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InquiryBuilder fromInquiry(String inquiryId) {
            s.g(inquiryId, "inquiryId");
            return new InquiryBuilder(inquiryId);
        }

        public final TemplateBuilder fromTemplate(String templateId) {
            s.g(templateId, "templateId");
            return new TemplateBuilder(templateId);
        }

        public final Response onActivityResult(Intent intent) {
            Bundle extras;
            String string;
            Bundle extras2;
            Bundle extras3;
            Attributes attributes;
            Bundle extras4;
            Response success;
            Verification verification;
            Verification.Status status;
            Relationships relationships = null;
            b valueOf = (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("PERSONA_ACTIVITY_RESULT")) == null) ? null : b.valueOf(string);
            if (valueOf == null) {
                valueOf = b.INQUIRY_UNKNOWN_ERROR;
            }
            String string2 = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("INQUIRY_ID_KEY");
            j jVar = (intent == null || (extras3 = intent.getExtras()) == null) ? null : (j) extras3.getParcelable("ATTRIBUTES");
            if (jVar == null) {
                attributes = null;
            } else {
                j.c c11 = jVar.c();
                Attributes.Name name = c11 == null ? null : new Attributes.Name(c11.a(), c11.c(), c11.b());
                Date b11 = jVar.b();
                j.a a11 = jVar.a();
                attributes = new Attributes(b11, name, a11 == null ? null : new Attributes.Address(a11.d(), a11.e(), a11.a(), a11.f(), a11.g(), a11.c(), a11.b()));
            }
            e0 e0Var = (intent == null || (extras4 = intent.getExtras()) == null) ? null : (e0) extras4.getParcelable("RELATIONSHIPS");
            if (e0Var != null) {
                List<c> a12 = e0Var.a();
                ArrayList arrayList = new ArrayList();
                for (c cVar : a12) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[cVar.a().ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            status = Verification.Status.PASSED;
                        } else if (i11 == 3) {
                            status = Verification.Status.REQUIRES_RETRY;
                        } else if (i11 == 4) {
                            status = Verification.Status.FAILED;
                        } else if (i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            status = Verification.Status.FAILED;
                        }
                        if (cVar instanceof c.d) {
                            verification = new Verification.PhoneNumber(cVar.getId(), status);
                        } else if (cVar instanceof c.C0434c) {
                            verification = new Verification.GovernmentId(cVar.getId(), status);
                        } else if (cVar instanceof c.e) {
                            verification = new Verification.Selfie(cVar.getId(), status);
                        } else if (cVar instanceof c.b) {
                            verification = new Verification.Document(cVar.getId(), status);
                        } else if (!(cVar instanceof c.a)) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            verification = new Verification.Database(cVar.getId(), status);
                        }
                    } else {
                        verification = null;
                    }
                    if (verification != null) {
                        arrayList.add(verification);
                    }
                }
                relationships = new Relationships(arrayList);
            }
            switch (WhenMappings.$EnumSwitchMapping$1[valueOf.ordinal()]) {
                case 1:
                    s.e(string2);
                    s.e(attributes);
                    s.e(relationships);
                    success = new Response.Success(string2, attributes, relationships);
                    break;
                case 2:
                    return Response.Cancel.INSTANCE;
                case 3:
                    s.e(string2);
                    s.e(attributes);
                    s.e(relationships);
                    success = new Response.Failure(string2, attributes, relationships);
                    break;
                case 4:
                    return new Response.Error("There was a problem reaching the server.");
                case 5:
                    return new Response.Error("The SDK needs a template ID that starts with `tmpl_`. If your template ID starts with `itmpl_`, you should use version v2.x or greater of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v2");
                case 6:
                    return new Response.Error("There was an unexpected error.");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return success;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$InquiryBuilder;", "", "", "theme", "", "accessToken", "Lcom/withpersona/sdk/inquiry/Inquiry;", "build", "inquiryId", "Ljava/lang/String;", "Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class InquiryBuilder {
        private String accessToken;
        private final String inquiryId;
        private Integer theme;

        public InquiryBuilder(String inquiryId) {
            s.g(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        public final InquiryBuilder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public final Inquiry build() {
            return new Inquiry(null, this.inquiryId, this.accessToken, null, null, null, null, this.theme, null, null);
        }

        public final InquiryBuilder theme(int i11) {
            this.theme = Integer.valueOf(i11);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "", "<init>", "()V", "Cancel", "Error", "Failure", "Success", "Lcom/withpersona/sdk/inquiry/Inquiry$Response$Success;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response$Cancel;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response$Failure;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response$Error;", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static abstract class Response {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Response$Cancel;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "<init>", "()V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Cancel extends Response {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Response$Error;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "", "debugMessage", "Ljava/lang/String;", "getDebugMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Error extends Response {
            private final String debugMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String debugMessage) {
                super(null);
                s.g(debugMessage, "debugMessage");
                this.debugMessage = debugMessage;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Response$Failure;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "", "inquiryId", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Attributes;", "attributes", "Lcom/withpersona/sdk/inquiry/Attributes;", "getAttributes", "()Lcom/withpersona/sdk/inquiry/Attributes;", "Lcom/withpersona/sdk/inquiry/Relationships;", "relationships", "Lcom/withpersona/sdk/inquiry/Relationships;", "getRelationships", "()Lcom/withpersona/sdk/inquiry/Relationships;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Attributes;Lcom/withpersona/sdk/inquiry/Relationships;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Failure extends Response {
            private final Attributes attributes;
            private final String inquiryId;
            private final Relationships relationships;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(String inquiryId, Attributes attributes, Relationships relationships) {
                super(null);
                s.g(inquiryId, "inquiryId");
                s.g(attributes, "attributes");
                s.g(relationships, "relationships");
                this.inquiryId = inquiryId;
                this.attributes = attributes;
                this.relationships = relationships;
            }

            public final Attributes getAttributes() {
                return this.attributes;
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            public final Relationships getRelationships() {
                return this.relationships;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$Response$Success;", "Lcom/withpersona/sdk/inquiry/Inquiry$Response;", "", "inquiryId", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Attributes;", "attributes", "Lcom/withpersona/sdk/inquiry/Attributes;", "getAttributes", "()Lcom/withpersona/sdk/inquiry/Attributes;", "Lcom/withpersona/sdk/inquiry/Relationships;", "relationships", "Lcom/withpersona/sdk/inquiry/Relationships;", "getRelationships", "()Lcom/withpersona/sdk/inquiry/Relationships;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Attributes;Lcom/withpersona/sdk/inquiry/Relationships;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Success extends Response {
            private final Attributes attributes;
            private final String inquiryId;
            private final Relationships relationships;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String inquiryId, Attributes attributes, Relationships relationships) {
                super(null);
                s.g(inquiryId, "inquiryId");
                s.g(attributes, "attributes");
                s.g(relationships, "relationships");
                this.inquiryId = inquiryId;
                this.attributes = attributes;
                this.relationships = relationships;
            }

            public final Attributes getAttributes() {
                return this.attributes;
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            public final Relationships getRelationships() {
                return this.relationships;
            }
        }

        private Response() {
        }

        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk/inquiry/Inquiry$TemplateBuilder;", "", "", "referenceId", "accountId", "Lcom/withpersona/sdk/inquiry/Fields;", "fields", "note", "Lcom/withpersona/sdk/inquiry/Environment;", "environment", "", "theme", "Lcom/withpersona/sdk/inquiry/Inquiry;", "build", "templateId", "Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Fields;", "Ljava/lang/Integer;", "Lcom/withpersona/sdk/inquiry/Environment;", "<init>", "(Ljava/lang/String;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class TemplateBuilder {
        private String accountId;
        private Environment environment;
        private Fields fields;
        private String note;
        private String referenceId;
        private final String templateId;
        private Integer theme;

        public TemplateBuilder(String templateId) {
            s.g(templateId, "templateId");
            this.templateId = templateId;
        }

        public final TemplateBuilder accountId(String str) {
            this.referenceId = null;
            this.accountId = str;
            return this;
        }

        public final Inquiry build() {
            return new Inquiry(this.templateId, null, null, this.referenceId, this.accountId, this.fields, this.note, this.theme, this.environment, null);
        }

        public final TemplateBuilder environment(Environment environment) {
            s.g(environment, "environment");
            this.environment = environment;
            return this;
        }

        public final TemplateBuilder fields(Fields fields) {
            this.fields = fields;
            return this;
        }

        public final TemplateBuilder note(String str) {
            this.note = str;
            return this;
        }

        public final TemplateBuilder referenceId(String str) {
            this.accountId = null;
            this.referenceId = str;
            return this;
        }

        public final TemplateBuilder theme(int i11) {
            this.theme = Integer.valueOf(i11);
            return this;
        }
    }

    private Inquiry(String str, String str2, String str3, String str4, String str5, Fields fields, String str6, Integer num, Environment environment) {
        this.templateId = str;
        this.inquiryId = str2;
        this.accessToken = str3;
        this.referenceId = str4;
        this.accountId = str5;
        this.fields = fields;
        this.note = str6;
        this.theme = num;
        this.environment = environment;
    }

    public /* synthetic */ Inquiry(String str, String str2, String str3, String str4, String str5, Fields fields, String str6, Integer num, Environment environment, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, fields, str6, num, environment);
    }

    public static final InquiryBuilder fromInquiry(String str) {
        return Companion.fromInquiry(str);
    }

    public static final TemplateBuilder fromTemplate(String str) {
        return Companion.fromTemplate(str);
    }

    public static final Response onActivityResult(Intent intent) {
        return Companion.onActivityResult(intent);
    }

    public final void start(Activity activity, int i11) {
        s.g(activity, "activity");
        Intent intent = new Intent();
        intent.setClassName(activity, "com.withpersona.sdk.inquiry.internal.InquiryActivity");
        String str = this.templateId;
        if (str != null) {
            intent.putExtra("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.inquiryId;
        if (str2 != null) {
            intent.putExtra("INQUIRY_ID_KEY", str2);
        }
        String str3 = this.accessToken;
        if (str3 != null) {
            intent.putExtra("ACCESS_TOKEN_KEY", str3);
        }
        String str4 = this.referenceId;
        if (str4 != null) {
            intent.putExtra("REFERENCE_ID_KEY", str4);
        }
        String str5 = this.accountId;
        if (str5 != null) {
            intent.putExtra("ACCOUNT_ID_KEY", str5);
        }
        Fields fields = this.fields;
        if (fields != null) {
            intent.putExtra("FIELDS_MAP_KEY", new a0(fields.getFields$inquiry_public_productionRelease()));
        }
        String str6 = this.note;
        if (str6 != null) {
            intent.putExtra("NOTE_KEY", str6);
        }
        Integer num = this.theme;
        if (num != null) {
            intent.putExtra("THEME_KEY", num.intValue());
        }
        Environment environment = this.environment;
        if (environment != null) {
            intent.putExtra("ENVIRONMENT_KEY", environment.name());
        }
        b0 b0Var = b0.f54756a;
        activity.startActivityForResult(intent, i11);
    }
}