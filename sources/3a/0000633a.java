package com.withpersona.sdk.inquiry.internal.network;

import android.os.Parcelable;
import com.squareup.moshi.g;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.internal.c;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import qv.l;
import vz.v;
import wz.s0;
import wz.w;
import wz.x;
import zv.j;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Data;", MessageExtension.FIELD_DATA, "", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Included;", "included", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Data;Ljava/util/List;)V", "Attributes", "Data", "Included", "IncludedAttributes", "Relationships", "VerificationData", "Verifications", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse {

    /* renamed from: a  reason: collision with root package name */
    private final Data f22589a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Included> f22590b;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Attributes;", "", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "nextStep", "", "selectedCountryCode", "birthdate", "nameFirst", "nameMiddle", "nameLast", "addressStreet1", "addressStreet2", "addressCity", "addressSubdivision", "addressSubdivisionAbbr", "addressPostalCode", "addressCountryCode", "phoneNumber", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/NextStep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Attributes {

        /* renamed from: a  reason: collision with root package name */
        private final NextStep f22591a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22592b;

        /* renamed from: c  reason: collision with root package name */
        private final String f22593c;

        /* renamed from: d  reason: collision with root package name */
        private final String f22594d;

        /* renamed from: e  reason: collision with root package name */
        private final String f22595e;

        /* renamed from: f  reason: collision with root package name */
        private final String f22596f;

        /* renamed from: g  reason: collision with root package name */
        private final String f22597g;

        /* renamed from: h  reason: collision with root package name */
        private final String f22598h;

        /* renamed from: i  reason: collision with root package name */
        private final String f22599i;

        /* renamed from: j  reason: collision with root package name */
        private final String f22600j;

        /* renamed from: k  reason: collision with root package name */
        private final String f22601k;

        /* renamed from: l  reason: collision with root package name */
        private final String f22602l;

        /* renamed from: m  reason: collision with root package name */
        private final String f22603m;

        /* renamed from: n  reason: collision with root package name */
        private final String f22604n;

        public Attributes(NextStep nextStep, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            s.g(nextStep, "nextStep");
            this.f22591a = nextStep;
            this.f22592b = str;
            this.f22593c = str2;
            this.f22594d = str3;
            this.f22595e = str4;
            this.f22596f = str5;
            this.f22597g = str6;
            this.f22598h = str7;
            this.f22599i = str8;
            this.f22600j = str9;
            this.f22601k = str10;
            this.f22602l = str11;
            this.f22603m = str12;
            this.f22604n = str13;
        }

        public final String a() {
            return this.f22599i;
        }

        public final String b() {
            return this.f22603m;
        }

        public final String c() {
            return this.f22602l;
        }

        public final String d() {
            return this.f22597g;
        }

        public final String e() {
            return this.f22598h;
        }

        public final String f() {
            return this.f22600j;
        }

        public final String g() {
            return this.f22601k;
        }

        public final String h() {
            return this.f22593c;
        }

        public final String i() {
            return this.f22594d;
        }

        public final String j() {
            return this.f22596f;
        }

        public final String k() {
            return this.f22595e;
        }

        public final NextStep l() {
            return this.f22591a;
        }

        public final String m() {
            return this.f22604n;
        }

        public final String n() {
            return this.f22592b;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Data;", "", "", "id", "type", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Attributes;", "attributes", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Relationships;", "relationships", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Attributes;Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Relationships;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: a  reason: collision with root package name */
        private final String f22605a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22606b;

        /* renamed from: c  reason: collision with root package name */
        private final Attributes f22607c;

        /* renamed from: d  reason: collision with root package name */
        private final Relationships f22608d;

        public Data(String id2, String type, Attributes attributes, Relationships relationships) {
            s.g(id2, "id");
            s.g(type, "type");
            s.g(attributes, "attributes");
            this.f22605a = id2;
            this.f22606b = type;
            this.f22607c = attributes;
            this.f22608d = relationships;
        }

        public final Attributes a() {
            return this.f22607c;
        }

        public final String b() {
            return this.f22605a;
        }

        public final Relationships c() {
            return this.f22608d;
        }

        public final String d() {
            return this.f22606b;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Included;", "", "", "type", "id", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$IncludedAttributes;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$IncludedAttributes;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Included {

        /* renamed from: a  reason: collision with root package name */
        private final String f22609a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22610b;

        /* renamed from: c  reason: collision with root package name */
        private final IncludedAttributes f22611c;

        public Included(String type, String id2, IncludedAttributes includedAttributes) {
            s.g(type, "type");
            s.g(id2, "id");
            this.f22609a = type;
            this.f22610b = id2;
            this.f22611c = includedAttributes;
        }

        public final IncludedAttributes a() {
            return this.f22611c;
        }

        public final String b() {
            return this.f22610b;
        }

        public final String c() {
            return this.f22609a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$IncludedAttributes;", "", "", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class IncludedAttributes {

        /* renamed from: a  reason: collision with root package name */
        private final String f22612a;

        public IncludedAttributes(String str) {
            this.f22612a = str;
        }

        public final String a() {
            return this.f22612a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Relationships;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Verifications;", "verifications", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Verifications;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Relationships {

        /* renamed from: a  reason: collision with root package name */
        private final Verifications f22613a;

        public Relationships(Verifications verifications) {
            s.g(verifications, "verifications");
            this.f22613a = verifications;
        }

        public final Verifications a() {
            return this.f22613a;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$VerificationData;", "", "", "id", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class VerificationData {

        /* renamed from: a  reason: collision with root package name */
        private final String f22614a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22615b;

        public VerificationData(String id2, String type) {
            s.g(id2, "id");
            s.g(type, "type");
            this.f22614a = id2;
            this.f22615b = type;
        }

        public final String a() {
            return this.f22614a;
        }

        public final String b() {
            return this.f22615b;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Verifications;", "", "", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$VerificationData;", MessageExtension.FIELD_DATA, "<init>", "(Ljava/util/List;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Verifications {

        /* renamed from: a  reason: collision with root package name */
        private final List<VerificationData> f22616a;

        public Verifications(List<VerificationData> data) {
            s.g(data, "data");
            this.f22616a = data;
        }

        public final List<VerificationData> a() {
            return this.f22616a;
        }
    }

    public CheckInquiryResponse(Data data, List<Included> list) {
        s.g(data, "data");
        this.f22589a = data;
        this.f22590b = list;
    }

    private final j.a c(Attributes attributes) {
        List n11;
        n11 = w.n(attributes.d(), attributes.e(), attributes.a(), attributes.f(), attributes.g(), attributes.c(), attributes.b());
        if (n11.isEmpty()) {
            return null;
        }
        return new j.a(attributes.d(), attributes.e(), attributes.a(), attributes.f(), attributes.g(), attributes.c(), attributes.b());
    }

    private final j d(Attributes attributes) {
        j.c f11 = f(attributes);
        String h11 = attributes.h();
        return new j(f11, h11 == null ? null : l.b.f48568a.g(h11), c(attributes));
    }

    private final j.c f(Attributes attributes) {
        List n11;
        n11 = w.n(attributes.i(), attributes.k(), attributes.j());
        if (n11.isEmpty()) {
            return null;
        }
        return new j.c(attributes.i(), attributes.k(), attributes.j());
    }

    private final List<c> g() {
        int t11;
        c.f fVar;
        Parcelable bVar;
        int t12;
        List<Included> list = this.f22590b;
        Map map = null;
        if (list != null) {
            t12 = x.t(list, 10);
            ArrayList arrayList = new ArrayList(t12);
            for (Included included : list) {
                String b11 = included.b();
                IncludedAttributes a11 = included.a();
                arrayList.add(v.a(b11, a11 == null ? null : a11.a()));
            }
            map = s0.t(arrayList);
        }
        if (map == null) {
            map = s0.i();
        }
        Relationships c11 = this.f22589a.c();
        List<VerificationData> i11 = c11 == null ? w.i() : c11.a().a();
        t11 = x.t(i11, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (VerificationData verificationData : i11) {
            String str = (String) map.get(verificationData.a());
            if (str != null) {
                switch (str.hashCode()) {
                    case -1281977283:
                        if (str.equals("failed")) {
                            fVar = c.f.FAILED;
                            break;
                        } else {
                            break;
                        }
                    case -1059866921:
                        if (str.equals("requires_retry")) {
                            fVar = c.f.REQUIRES_RETRY;
                            break;
                        } else {
                            break;
                        }
                    case -995381136:
                        if (str.equals("passed")) {
                            fVar = c.f.PASSED;
                            break;
                        } else {
                            break;
                        }
                    case -248987413:
                        if (str.equals("initiated")) {
                            fVar = c.f.INITIATED;
                            break;
                        } else {
                            break;
                        }
                    case -123173735:
                        if (str.equals("canceled")) {
                            fVar = c.f.CANCELED;
                            break;
                        } else {
                            break;
                        }
                }
                String b12 = verificationData.b();
                switch (b12.hashCode()) {
                    case -1839789425:
                        if (b12.equals("verification/document")) {
                            bVar = new c.b(verificationData.a(), fVar);
                            break;
                        } else {
                            throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                        }
                    case -912045329:
                        if (b12.equals("verification/database")) {
                            bVar = new c.a(verificationData.a(), fVar);
                            break;
                        } else {
                            throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                        }
                    case 35721212:
                        if (b12.equals("verification/phone-number")) {
                            bVar = new c.d(verificationData.a(), fVar);
                            break;
                        } else {
                            throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                        }
                    case 678746499:
                        if (b12.equals("verification/government-id")) {
                            bVar = new c.C0434c(verificationData.a(), fVar);
                            break;
                        } else {
                            throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                        }
                    case 2036416476:
                        if (b12.equals("verification/selfie")) {
                            bVar = new c.e(verificationData.a(), fVar);
                            break;
                        } else {
                            throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                        }
                    default:
                        throw new IllegalArgumentException(s.p("Unknown type ", verificationData.b()));
                }
                arrayList2.add(bVar);
            }
            throw new IllegalArgumentException(s.p("Unknown status ", str));
        }
        return arrayList2;
    }

    public final Data a() {
        return this.f22589a;
    }

    public final List<Included> b() {
        return this.f22590b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zv.i0 e(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse.e(java.lang.String):zv.i0");
    }
}