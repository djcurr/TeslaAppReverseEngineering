package com.tesla.data.oapi;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.TextBundle;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\f\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tesla/data/oapi/ShareCommandRequestBody;", "", "", "type", "Lcom/tesla/data/oapi/ShareCommandRequestBody$Value;", "value", "locale", "", "Lcom/tesla/data/oapi/MillisecondsSince1970;", FraudDetectionData.KEY_TIMESTAMP, "<init>", "(Ljava/lang/String;Lcom/tesla/data/oapi/ShareCommandRequestBody$Value;Ljava/lang/String;J)V", "a", "Value", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ShareCommandRequestBody {
    @ir.b(name = "type")

    /* renamed from: a  reason: collision with root package name */
    private final String f21682a;
    @ir.b(name = "value")

    /* renamed from: b  reason: collision with root package name */
    private final Value f21683b;
    @ir.b(name = "locale")

    /* renamed from: c  reason: collision with root package name */
    private final String f21684c;
    @ir.b(name = FraudDetectionData.KEY_TIMESTAMP)

    /* renamed from: d  reason: collision with root package name */
    private final long f21685d;

    @com.squareup.moshi.g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/ShareCommandRequestBody$Value;", "", "", "type", "action", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Value {
        @ir.b(name = "android.intent.TYPE")

        /* renamed from: a  reason: collision with root package name */
        private final String f21686a;
        @ir.b(name = "android.intent.ACTION")

        /* renamed from: b  reason: collision with root package name */
        private final String f21687b;
        @ir.b(name = "android.intent.extra.TEXT")

        /* renamed from: c  reason: collision with root package name */
        private final String f21688c;

        public Value(String type, String action, String text) {
            s.g(type, "type");
            s.g(action, "action");
            s.g(text, "text");
            this.f21686a = type;
            this.f21687b = action;
            this.f21688c = text;
        }

        public final String a() {
            return this.f21687b;
        }

        public final String b() {
            return this.f21688c;
        }

        public final String c() {
            return this.f21686a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Value) {
                Value value = (Value) obj;
                return s.c(this.f21686a, value.f21686a) && s.c(this.f21687b, value.f21687b) && s.c(this.f21688c, value.f21688c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f21686a.hashCode() * 31) + this.f21687b.hashCode()) * 31) + this.f21688c.hashCode();
        }

        public String toString() {
            String str = this.f21686a;
            String str2 = this.f21687b;
            String str3 = this.f21688c;
            return "Value(type=" + str + ", action=" + str2 + ", text=" + str3 + ")";
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public ShareCommandRequestBody(String type, Value value, String locale, long j11) {
        s.g(type, "type");
        s.g(value, "value");
        s.g(locale, "locale");
        this.f21682a = type;
        this.f21683b = value;
        this.f21684c = locale;
        this.f21685d = j11;
    }

    public final String a() {
        return this.f21684c;
    }

    public final long b() {
        return this.f21685d;
    }

    public final String c() {
        return this.f21682a;
    }

    public final Value d() {
        return this.f21683b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareCommandRequestBody) {
            ShareCommandRequestBody shareCommandRequestBody = (ShareCommandRequestBody) obj;
            return s.c(this.f21682a, shareCommandRequestBody.f21682a) && s.c(this.f21683b, shareCommandRequestBody.f21683b) && s.c(this.f21684c, shareCommandRequestBody.f21684c) && this.f21685d == shareCommandRequestBody.f21685d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f21682a.hashCode() * 31) + this.f21683b.hashCode()) * 31) + this.f21684c.hashCode()) * 31) + Long.hashCode(this.f21685d);
    }

    public String toString() {
        String str = this.f21682a;
        Value value = this.f21683b;
        String str2 = this.f21684c;
        long j11 = this.f21685d;
        return "ShareCommandRequestBody(type=" + str + ", value=" + value + ", locale=" + str2 + ", timestamp=" + j11 + ")";
    }
}