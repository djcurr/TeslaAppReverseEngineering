package r1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49016b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final s f49017c;

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<h2.u> f49018a = new d1.e<>(new h2.u[16], 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            return s.f49017c;
        }
    }

    static {
        int i11 = d1.e.f23279d;
        f49017c = new s();
    }

    public final d1.e<h2.u> b() {
        return this.f49018a;
    }

    public final void c() {
        if (this.f49018a.o()) {
            d1.e<h2.u> eVar = this.f49018a;
            int l11 = eVar.l();
            if (l11 > 0) {
                int i11 = 0;
                h2.u[] k11 = eVar.k();
                do {
                    h2.s j22 = k11[i11].j2();
                    if (j22 != null) {
                        y.h(j22);
                    }
                    i11++;
                } while (i11 < l11);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}