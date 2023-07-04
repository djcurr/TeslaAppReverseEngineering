package p4;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f46107a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46108b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46109c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0982a f46110d = new C0982a(null);

        /* renamed from: a  reason: collision with root package name */
        private Uri f46111a;

        /* renamed from: b  reason: collision with root package name */
        private String f46112b;

        /* renamed from: c  reason: collision with root package name */
        private String f46113c;

        /* renamed from: p4.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0982a {
            private C0982a() {
            }

            public /* synthetic */ C0982a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Uri uri) {
                kotlin.jvm.internal.s.g(uri, "uri");
                a aVar = new a(null);
                aVar.b(uri);
                return aVar;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return new o(this.f46111a, this.f46112b, this.f46113c);
        }

        public final a b(Uri uri) {
            kotlin.jvm.internal.s.g(uri, "uri");
            this.f46111a = uri;
            return this;
        }
    }

    public o(Uri uri, String str, String str2) {
        this.f46107a = uri;
        this.f46108b = str;
        this.f46109c = str2;
    }

    public String a() {
        return this.f46108b;
    }

    public String b() {
        return this.f46109c;
    }

    public Uri c() {
        return this.f46107a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        kotlin.jvm.internal.s.g(intent, "intent");
    }
}