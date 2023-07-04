package com.withpersona.sdk.inquiry;

import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "Database", "Document", "GovernmentId", "PhoneNumber", "Selfie", "Status", "Lcom/withpersona/sdk/inquiry/Verification$PhoneNumber;", "Lcom/withpersona/sdk/inquiry/Verification$GovernmentId;", "Lcom/withpersona/sdk/inquiry/Verification$Selfie;", "Lcom/withpersona/sdk/inquiry/Verification$Document;", "Lcom/withpersona/sdk/inquiry/Verification$Database;", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Verification {

    /* renamed from: id  reason: collision with root package name */
    private final String f22288id;
    private final Status status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$Database;", "Lcom/withpersona/sdk/inquiry/Verification;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Database extends Verification {

        /* renamed from: id  reason: collision with root package name */
        private final String f22289id;
        private final Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Database(String id2, Status status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22289id = id2;
            this.status = status;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public String getId() {
            return this.f22289id;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public Status getStatus() {
            return this.status;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$Document;", "Lcom/withpersona/sdk/inquiry/Verification;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Document extends Verification {

        /* renamed from: id  reason: collision with root package name */
        private final String f22290id;
        private final Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Document(String id2, Status status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22290id = id2;
            this.status = status;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public String getId() {
            return this.f22290id;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public Status getStatus() {
            return this.status;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$GovernmentId;", "Lcom/withpersona/sdk/inquiry/Verification;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class GovernmentId extends Verification {

        /* renamed from: id  reason: collision with root package name */
        private final String f22291id;
        private final Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentId(String id2, Status status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22291id = id2;
            this.status = status;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public String getId() {
            return this.f22291id;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public Status getStatus() {
            return this.status;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$PhoneNumber;", "Lcom/withpersona/sdk/inquiry/Verification;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class PhoneNumber extends Verification {

        /* renamed from: id  reason: collision with root package name */
        private final String f22292id;
        private final Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneNumber(String id2, Status status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22292id = id2;
            this.status = status;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public String getId() {
            return this.f22292id;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public Status getStatus() {
            return this.status;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$Selfie;", "Lcom/withpersona/sdk/inquiry/Verification;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/withpersona/sdk/inquiry/Verification$Status;", PermissionsResponse.STATUS_KEY, "Lcom/withpersona/sdk/inquiry/Verification$Status;", "getStatus", "()Lcom/withpersona/sdk/inquiry/Verification$Status;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/Verification$Status;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Selfie extends Verification {

        /* renamed from: id  reason: collision with root package name */
        private final String f22293id;
        private final Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(String id2, Status status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22293id = id2;
            this.status = status;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public String getId() {
            return this.f22293id;
        }

        @Override // com.withpersona.sdk.inquiry.Verification
        public Status getStatus() {
            return this.status;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/Verification$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PASSED", "REQUIRES_RETRY", "FAILED", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public enum Status {
        PASSED,
        REQUIRES_RETRY,
        FAILED
    }

    private Verification(String str, Status status) {
        this.f22288id = str;
        this.status = status;
    }

    public /* synthetic */ Verification(String str, Status status, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, status);
    }

    public String getId() {
        return this.f22288id;
    }

    public Status getStatus() {
        return this.status;
    }
}