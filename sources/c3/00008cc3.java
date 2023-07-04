package nr;

import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
public interface n<OutputT> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41819a = a.f41820a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f41820a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final n00.p f41821b = m0.m(Void.class);

        private a() {
        }

        public static /* synthetic */ n b(a aVar, long j11, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            return aVar.a(j11, str);
        }

        public final n<vz.b0> a(long j11, String key) {
            kotlin.jvm.internal.s.g(key, "key");
            return new l(j11, key);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static <OutputT> boolean a(n<? extends OutputT> nVar, n<?> otherWorker) {
            kotlin.jvm.internal.s.g(nVar, "this");
            kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
            return kotlin.jvm.internal.s.c(m0.b(otherWorker.getClass()), m0.b(nVar.getClass()));
        }
    }

    boolean a(n<?> nVar);

    kotlinx.coroutines.flow.e<OutputT> run();
}