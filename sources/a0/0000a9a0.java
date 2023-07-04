package p20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f45898a;

    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45899b = new a();

        private a() {
            super(false, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            s.g(error, "error");
        }
    }

    /* renamed from: p20.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0977c extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final C0977c f45900b = new C0977c();

        private C0977c() {
            super(true, null);
        }
    }

    private c(boolean z11) {
        this.f45898a = z11;
    }

    public /* synthetic */ c(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    public final boolean a() {
        return this.f45898a;
    }
}