package js;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class k {

    /* loaded from: classes6.dex */
    public static final class a extends k {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f33960a;

        public a(Throwable th2) {
            super(null);
            this.f33960a = th2;
        }

        public final Throwable a() {
            return this.f33960a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        private final String f33961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String token) {
            super(null);
            s.g(token, "token");
            this.f33961a = token;
        }

        public final String a() {
            return this.f33961a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f33962a;

        /* renamed from: b  reason: collision with root package name */
        private final int f33963b;

        public c(Throwable th2, int i11) {
            super(null);
            this.f33962a = th2;
            this.f33963b = i11;
        }

        public final Throwable a() {
            return this.f33962a;
        }

        public final int b() {
            return this.f33963b;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends k {

        /* renamed from: a  reason: collision with root package name */
        private final String f33964a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String token) {
            super(null);
            s.g(token, "token");
            this.f33964a = token;
        }

        public final String a() {
            return this.f33964a;
        }
    }

    private k() {
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}