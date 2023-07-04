package com.withpersona.sdk.inquiry.internal.network;

import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import ir.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.s0;
import zv.z;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\u0006\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest$Data;", MessageExtension.FIELD_DATA, "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest$Data;)V", "b", "a", "Data", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquiryRequest {

    /* renamed from: b  reason: collision with root package name */
    public static final b f22647b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Data f22648a;

    /* loaded from: classes6.dex */
    public static final class Data {

        /* renamed from: b  reason: collision with root package name */
        public static final Adapter f22649b = new Adapter(null);

        /* renamed from: a  reason: collision with root package name */
        private final a f22650a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "Lcom/squareup/moshi/m;", "jsonWriter", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest$Data;", MessageExtension.FIELD_DATA, "Lvz/b0;", "toJson", "Lcom/squareup/moshi/h;", "reader", "fromJson", "<init>", "()V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Adapter {
            private Adapter() {
            }

            public /* synthetic */ Adapter(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @ir.a
            public final Data fromJson(h reader) {
                s.g(reader, "reader");
                reader.g();
                String str = "";
                String str2 = str;
                while (reader.p()) {
                    String a02 = reader.a0();
                    if (s.c(a02, "templateId")) {
                        str = reader.n0();
                        s.f(str, "reader.nextString()");
                    } else if (s.c(a02, "environment")) {
                        str2 = reader.n0();
                        s.f(str2, "reader.nextString()");
                    } else {
                        reader.R0();
                    }
                }
                reader.l();
                return new Data(new a(str, str2, null, null, null, null, 60, null), null, 2, null);
            }

            @d
            public final void toJson(m jsonWriter, Data data) {
                s.g(jsonWriter, "jsonWriter");
                s.g(data, "data");
                jsonWriter.j();
                jsonWriter.L("attributes");
                jsonWriter.j();
                jsonWriter.L("templateId").I0(data.a().f());
                jsonWriter.L("environment").I0(data.a().b());
                String a11 = data.a().a();
                if (a11 != null) {
                    jsonWriter.L("accountId").I0(a11);
                }
                String e11 = data.a().e();
                if (e11 != null) {
                    jsonWriter.L("referenceId").I0(e11);
                }
                String d11 = data.a().d();
                if (d11 != null) {
                    jsonWriter.L("note").I0(d11);
                }
                Map<String, z> c11 = data.a().c();
                if (c11 == null) {
                    c11 = s0.i();
                }
                for (Map.Entry<String, z> entry : c11.entrySet()) {
                    z value = entry.getValue();
                    jsonWriter.L(entry.getKey());
                    if (value instanceof z.c) {
                        jsonWriter.I0(((z.c) value).a());
                    } else if (value instanceof z.b) {
                        jsonWriter.G0(Integer.valueOf(((z.b) value).a()));
                    } else if (value instanceof z.a) {
                        jsonWriter.J0(((z.a) value).a());
                    }
                }
                jsonWriter.C();
                jsonWriter.C();
            }
        }

        public Data(a attributes, String type) {
            s.g(attributes, "attributes");
            s.g(type, "type");
            this.f22650a = attributes;
        }

        public final a a() {
            return this.f22650a;
        }

        public /* synthetic */ Data(a aVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i11 & 2) != 0 ? "inquiry" : str);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreateInquiryRequest a(String templateId, com.withpersona.sdk.inquiry.internal.a environment, String str, String str2, Map<String, ? extends z> map, String str3) {
            s.g(templateId, "templateId");
            s.g(environment, "environment");
            return new CreateInquiryRequest(new Data(new a(templateId, environment.getLowercase$inquiry_internal_productionRelease(), str, str2, str3, map), null, 2, null));
        }
    }

    public CreateInquiryRequest(Data data) {
        s.g(data, "data");
        this.f22648a = data;
    }

    public final Data a() {
        return this.f22648a;
    }

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f22651a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22652b;

        /* renamed from: c  reason: collision with root package name */
        private final String f22653c;

        /* renamed from: d  reason: collision with root package name */
        private final String f22654d;

        /* renamed from: e  reason: collision with root package name */
        private final String f22655e;

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, z> f22656f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String templateId, String environment, String str, String str2, String str3, Map<String, ? extends z> map) {
            s.g(templateId, "templateId");
            s.g(environment, "environment");
            this.f22651a = templateId;
            this.f22652b = environment;
            this.f22653c = str;
            this.f22654d = str2;
            this.f22655e = str3;
            this.f22656f = map;
        }

        public final String a() {
            return this.f22653c;
        }

        public final String b() {
            return this.f22652b;
        }

        public final Map<String, z> c() {
            return this.f22656f;
        }

        public final String d() {
            return this.f22655e;
        }

        public final String e() {
            return this.f22654d;
        }

        public final String f() {
            return this.f22651a;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : map);
        }
    }
}