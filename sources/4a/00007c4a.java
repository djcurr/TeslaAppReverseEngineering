package ju;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import lt.d2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33988a = new b();

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: ju.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0624a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final c f33989a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0624a(c streamMessageInfo) {
                super(null);
                s.g(streamMessageInfo, "streamMessageInfo");
                this.f33989a = streamMessageInfo;
            }

            public final c a() {
                return this.f33989a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0624a) && s.c(this.f33989a, ((C0624a) obj).f33989a);
            }

            public int hashCode() {
                return this.f33989a.hashCode();
            }

            public String toString() {
                c cVar = this.f33989a;
                return "Success(streamMessageInfo=" + cVar + ")";
            }
        }

        /* renamed from: ju.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0625b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f33990a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0625b(Exception exception) {
                super(null);
                s.g(exception, "exception");
                this.f33990a = exception;
            }

            public final Exception a() {
                return this.f33990a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0625b) && s.c(this.f33990a, ((C0625b) obj).f33990a);
            }

            public int hashCode() {
                return this.f33990a.hashCode();
            }

            public String toString() {
                Exception exc = this.f33990a;
                return "ThrownError(exception=" + exc + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private b() {
    }

    public final a a(d2 message) {
        s.g(message, "message");
        try {
            JSONObject jSONObject = new JSONObject(message.c().F());
            return new a.C0624a(new c(s.c(jSONObject.optString("msg_type"), "control:pong"), jSONObject));
        } catch (Exception e11) {
            return new a.C0625b(e11);
        }
    }
}