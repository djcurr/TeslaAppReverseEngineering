package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface h2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2961a = a.f2962a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2962a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h2 f2963b = C0052a.f2964b;

        /* renamed from: androidx.compose.ui.platform.h2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0052a implements h2 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0052a f2964b = new C0052a();

            C0052a() {
            }

            @Override // androidx.compose.ui.platform.h2
            public final c1.a1 a(View rootView) {
                c1.a1 b11;
                kotlin.jvm.internal.s.g(rootView, "rootView");
                b11 = WindowRecomposer_androidKt.b(rootView);
                return b11;
            }
        }

        private a() {
        }

        public final h2 a() {
            return f2963b;
        }
    }

    c1.a1 a(View view);
}