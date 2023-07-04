package g20;

import java.util.List;

/* loaded from: classes5.dex */
public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f27438a = new a();

    /* loaded from: classes5.dex */
    static class a implements q {
        a() {
        }

        private static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i11 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // g20.q
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // g20.q
        public void b(w00.c cVar, List<String> list) {
            if (cVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    void b(w00.c cVar, List<String> list);
}