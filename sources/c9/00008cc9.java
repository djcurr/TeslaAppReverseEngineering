package nr;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class q<PropsT, StateT, OutputT> {

    /* loaded from: classes2.dex */
    public static final class a extends q<Object, Object, Object> {
        a() {
        }

        @Override // nr.q
        public void a(q<? super Object, Object, ? extends Object>.c cVar) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
        }

        public String toString() {
            return "WorkflowAction.noAction()";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final PropsT f41829a;

        /* renamed from: b  reason: collision with root package name */
        private StateT f41830b;

        /* renamed from: c  reason: collision with root package name */
        private u<? extends OutputT> f41831c;

        public c(q this$0, PropsT propst, StateT statet) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f41829a = propst;
            this.f41830b = statet;
        }

        public final u<OutputT> a() {
            return (u<? extends OutputT>) this.f41831c;
        }

        public final PropsT b() {
            return this.f41829a;
        }

        public final StateT c() {
            return this.f41830b;
        }

        public final void d(OutputT outputt) {
            this.f41831c = new u<>(outputt);
        }

        public final void e(StateT statet) {
            this.f41830b = statet;
        }
    }

    static {
        new b(null);
        new a();
    }

    public abstract void a(q<? super PropsT, StateT, ? extends OutputT>.c cVar);
}