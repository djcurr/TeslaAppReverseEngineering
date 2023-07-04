package s2;

import s2.k0;

/* loaded from: classes.dex */
public interface k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50112a = a.f50113a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f50113a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final k0 f50114b = new k0() { // from class: s2.j0
            @Override // s2.k0
            public final i0 filter(n2.a aVar) {
                i0 b11;
                b11 = k0.a.b(aVar);
                return b11;
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(n2.a text) {
            kotlin.jvm.internal.s.g(text, "text");
            return new i0(text, t.f50149a.a());
        }

        public final k0 c() {
            return f50114b;
        }
    }

    i0 filter(n2.a aVar);
}