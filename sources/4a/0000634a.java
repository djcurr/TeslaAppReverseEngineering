package com.withpersona.sdk.inquiry.internal.network;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest;", "", "Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest$Meta;)V", "b", "a", "Meta", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ContactSupportRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22638b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Meta f22639a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest$Meta;", "", "", "name", "emailAddress", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Meta {

        /* renamed from: a  reason: collision with root package name */
        private final String f22640a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22641b;

        /* renamed from: c  reason: collision with root package name */
        private final String f22642c;

        public Meta(String name, String emailAddress, String comment) {
            s.g(name, "name");
            s.g(emailAddress, "emailAddress");
            s.g(comment, "comment");
            this.f22640a = name;
            this.f22641b = emailAddress;
            this.f22642c = comment;
        }

        public final String a() {
            return this.f22642c;
        }

        public final String b() {
            return this.f22641b;
        }

        public final String c() {
            return this.f22640a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContactSupportRequest a(String name, String emailAddress, String comment) {
            s.g(name, "name");
            s.g(emailAddress, "emailAddress");
            s.g(comment, "comment");
            return new ContactSupportRequest(new Meta(name, emailAddress, comment));
        }
    }

    public ContactSupportRequest(Meta meta) {
        s.g(meta, "meta");
        this.f22639a = meta;
    }

    public final Meta a() {
        return this.f22639a;
    }
}