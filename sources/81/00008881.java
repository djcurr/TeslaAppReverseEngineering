package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
abstract class i {

    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39814a = new a();

        private a() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        private final float f39815a;

        /* renamed from: b  reason: collision with root package name */
        private final long f39816b;

        private b(float f11, long j11) {
            super(null);
            this.f39815a = f11;
            this.f39816b = j11;
        }

        public /* synthetic */ b(float f11, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, j11);
        }

        public final float a() {
            return this.f39815a;
        }

        public final long b() {
            return this.f39816b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: a  reason: collision with root package name */
        private final long f39817a;

        private c(long j11) {
            super(null);
            this.f39817a = j11;
        }

        public /* synthetic */ c(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public final long a() {
            return this.f39817a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends i {

        /* renamed from: a  reason: collision with root package name */
        private final float f39818a;

        public d(float f11) {
            super(null);
            this.f39818a = f11;
        }

        public final float a() {
            return this.f39818a;
        }
    }

    private i() {
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}