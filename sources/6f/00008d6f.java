package o1;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: f1  reason: collision with root package name */
    public static final a f42062f1 = a.f42063a;

    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f42063a = new a();

        private a() {
        }

        @Override // o1.f
        public <R> R C(R r11, p<? super R, ? super c, ? extends R> operation) {
            s.g(operation, "operation");
            return r11;
        }

        @Override // o1.f
        public <R> R a0(R r11, p<? super c, ? super R, ? extends R> operation) {
            s.g(operation, "operation");
            return r11;
        }

        @Override // o1.f
        public f g0(f other) {
            s.g(other, "other");
            return other;
        }

        @Override // o1.f
        public boolean p(l<? super c, Boolean> predicate) {
            s.g(predicate, "predicate");
            return true;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static f a(f fVar, f other) {
            s.g(fVar, "this");
            s.g(other, "other");
            return other == f.f42062f1 ? fVar : new o1.c(fVar, other);
        }
    }

    /* loaded from: classes.dex */
    public interface c extends f {

        /* loaded from: classes.dex */
        public static final class a {
            public static boolean a(c cVar, l<? super c, Boolean> predicate) {
                s.g(cVar, "this");
                s.g(predicate, "predicate");
                return predicate.invoke(cVar).booleanValue();
            }

            public static <R> R b(c cVar, R r11, p<? super R, ? super c, ? extends R> operation) {
                s.g(cVar, "this");
                s.g(operation, "operation");
                return operation.invoke(r11, cVar);
            }

            public static <R> R c(c cVar, R r11, p<? super c, ? super R, ? extends R> operation) {
                s.g(cVar, "this");
                s.g(operation, "operation");
                return operation.invoke(cVar, r11);
            }

            public static f d(c cVar, f other) {
                s.g(cVar, "this");
                s.g(other, "other");
                return b.a(cVar, other);
            }
        }
    }

    <R> R C(R r11, p<? super R, ? super c, ? extends R> pVar);

    <R> R a0(R r11, p<? super c, ? super R, ? extends R> pVar);

    f g0(f fVar);

    boolean p(l<? super c, Boolean> lVar);
}