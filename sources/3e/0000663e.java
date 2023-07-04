package dw;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24280a = new a(null);

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(okio.i byteString) {
            s.g(byteString, "byteString");
            okio.f w12 = new okio.f().w1(byteString);
            String b11 = nr.j.b(w12);
            if (s.c(b11, c.class.getName())) {
                return new c(nr.j.b(w12), false, 2, null);
            }
            if (s.c(b11, e.class.getName())) {
                return new e(nr.j.b(w12));
            }
            if (s.c(b11, b.class.getName())) {
                return new b(nr.j.b(w12), false, 2, null);
            }
            if (s.c(b11, d.class.getName())) {
                return new d(nr.j.b(w12));
            }
            throw new IllegalArgumentException(s.p("Unknown type ", b11));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        private final String f24281b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f24282c;

        public /* synthetic */ b(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11);
        }

        public final b b(String confirmationCode, boolean z11) {
            s.g(confirmationCode, "confirmationCode");
            return new b(confirmationCode, z11);
        }

        public final String c() {
            return this.f24281b;
        }

        public final boolean d() {
            return this.f24282c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return s.c(this.f24281b, bVar.f24281b) && this.f24282c == bVar.f24282c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f24281b.hashCode() * 31;
            boolean z11 = this.f24282c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "EnteringConfirmationCode(confirmationCode=" + this.f24281b + ", errored=" + this.f24282c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String confirmationCode, boolean z11) {
            super(null);
            s.g(confirmationCode, "confirmationCode");
            this.f24281b = confirmationCode;
            this.f24282c = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends k {

        /* renamed from: b  reason: collision with root package name */
        private final String f24283b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f24284c;

        public /* synthetic */ c(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11);
        }

        public final c b(String phoneNumber, boolean z11) {
            s.g(phoneNumber, "phoneNumber");
            return new c(phoneNumber, z11);
        }

        public final boolean c() {
            return this.f24284c;
        }

        public final String d() {
            return this.f24283b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return s.c(this.f24283b, cVar.f24283b) && this.f24284c == cVar.f24284c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f24283b.hashCode() * 31;
            boolean z11 = this.f24284c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "EnteringPhoneNumber(phoneNumber=" + this.f24283b + ", errored=" + this.f24284c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String phoneNumber, boolean z11) {
            super(null);
            s.g(phoneNumber, "phoneNumber");
            this.f24283b = phoneNumber;
            this.f24284c = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends k {

        /* renamed from: b  reason: collision with root package name */
        private final String f24285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String confirmationCode) {
            super(null);
            s.g(confirmationCode, "confirmationCode");
            this.f24285b = confirmationCode;
        }

        public final String b() {
            return this.f24285b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.c(this.f24285b, ((d) obj).f24285b);
        }

        public int hashCode() {
            return this.f24285b.hashCode();
        }

        public String toString() {
            return "SubmittingConfirmationCode(confirmationCode=" + this.f24285b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends k {

        /* renamed from: b  reason: collision with root package name */
        private final String f24286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String phoneNumber) {
            super(null);
            s.g(phoneNumber, "phoneNumber");
            this.f24286b = phoneNumber;
        }

        public final String b() {
            return this.f24286b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.c(this.f24286b, ((e) obj).f24286b);
        }

        public int hashCode() {
            return this.f24286b.hashCode();
        }

        public String toString() {
            return "SubmittingPhoneNumber(phoneNumber=" + this.f24286b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    static final class f extends u implements h00.l<okio.g, b0> {
        f() {
            super(1);
        }

        public final void a(okio.g sink) {
            s.g(sink, "sink");
            String name = k.this.getClass().getName();
            s.f(name, "this::class.java.name");
            nr.j.d(sink, name);
            k kVar = k.this;
            if (kVar instanceof c) {
                nr.j.d(sink, ((c) kVar).d());
            } else if (kVar instanceof e) {
                nr.j.d(sink, ((e) kVar).b());
            } else if (kVar instanceof b) {
                nr.j.d(sink, ((b) kVar).c());
            } else if (kVar instanceof d) {
                nr.j.d(sink, ((d) kVar).b());
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(okio.g gVar) {
            a(gVar);
            return b0.f54756a;
        }
    }

    private k() {
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final nr.i a() {
        return nr.i.f41802c.c(new f());
    }
}