package o10;

import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import e10.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n10.o;
import o10.a;
import t10.e;
import u10.f;
import w00.n0;

/* loaded from: classes5.dex */
public class b implements o.c {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f42113i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: j  reason: collision with root package name */
    private static final Map<u10.b, a.EnumC0828a> f42114j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f42115a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f42116b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f42117c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f42118d = null;

    /* renamed from: e  reason: collision with root package name */
    private String[] f42119e = null;

    /* renamed from: f  reason: collision with root package name */
    private String[] f42120f = null;

    /* renamed from: g  reason: collision with root package name */
    private String[] f42121g = null;

    /* renamed from: h  reason: collision with root package name */
    private a.EnumC0828a f42122h = null;

    /* renamed from: o10.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static abstract class AbstractC0830b implements o.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f42123a = new ArrayList();

        private static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i11 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i11 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i11 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i11 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // n10.o.b
        public void a() {
            g((String[]) this.f42123a.toArray(new String[0]));
        }

        @Override // n10.o.b
        public void b(u10.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // n10.o.b
        public void c(y10.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        @Override // n10.o.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f42123a.add((String) obj);
            }
        }

        @Override // n10.o.b
        public o.a e(u10.b bVar) {
            if (bVar == null) {
                f(3);
                return null;
            }
            return null;
        }

        protected abstract void g(String[] strArr);
    }

    /* loaded from: classes5.dex */
    private class c implements o.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a extends AbstractC0830b {
            a() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // o10.b.AbstractC0830b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f42119e = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o10.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0831b extends AbstractC0830b {
            C0831b() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // o10.b.AbstractC0830b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f42120f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i11 == 7) {
                objArr[0] = "classId";
            } else if (i11 == 4) {
                objArr[0] = "enumClassId";
            } else if (i11 != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i11) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private o.b h() {
            return new a();
        }

        private o.b i() {
            return new C0831b();
        }

        @Override // n10.o.a
        public void a() {
        }

        @Override // n10.o.a
        public o.a b(f fVar, u10.b bVar) {
            if (fVar == null) {
                g(6);
            }
            if (bVar == null) {
                g(7);
                return null;
            }
            return null;
        }

        @Override // n10.o.a
        public void c(f fVar, u10.b bVar, f fVar2) {
            if (fVar == null) {
                g(3);
            }
            if (bVar == null) {
                g(4);
            }
            if (fVar2 == null) {
                g(5);
            }
        }

        @Override // n10.o.a
        public o.b d(f fVar) {
            if (fVar == null) {
                g(2);
            }
            String b11 = fVar.b();
            if ("d1".equals(b11)) {
                return h();
            }
            if ("d2".equals(b11)) {
                return i();
            }
            return null;
        }

        @Override // n10.o.a
        public void e(f fVar, y10.f fVar2) {
            if (fVar == null) {
                g(0);
            }
            if (fVar2 == null) {
                g(1);
            }
        }

        @Override // n10.o.a
        public void f(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String b11 = fVar.b();
            if ("k".equals(b11)) {
                if (obj instanceof Integer) {
                    b.this.f42122h = a.EnumC0828a.getById(((Integer) obj).intValue());
                }
            } else if ("mv".equals(b11)) {
                if (obj instanceof int[]) {
                    b.this.f42115a = (int[]) obj;
                }
            } else if ("xs".equals(b11)) {
                if (obj instanceof String) {
                    b.this.f42116b = (String) obj;
                }
            } else if ("xi".equals(b11)) {
                if (obj instanceof Integer) {
                    b.this.f42117c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(b11) && (obj instanceof String)) {
                b.this.f42118d = (String) obj;
            }
        }
    }

    /* loaded from: classes5.dex */
    private class d implements o.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a extends AbstractC0830b {
            a() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", MessageExtension.FIELD_DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // o10.b.AbstractC0830b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f42119e = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o10.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0832b extends AbstractC0830b {
            C0832b() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", MessageExtension.FIELD_DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // o10.b.AbstractC0830b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f42120f = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i11 == 7) {
                objArr[0] = "classId";
            } else if (i11 == 4) {
                objArr[0] = "enumClassId";
            } else if (i11 != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i11) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private o.b h() {
            return new a();
        }

        private o.b i() {
            return new C0832b();
        }

        @Override // n10.o.a
        public void a() {
        }

        @Override // n10.o.a
        public o.a b(f fVar, u10.b bVar) {
            if (fVar == null) {
                g(6);
            }
            if (bVar == null) {
                g(7);
                return null;
            }
            return null;
        }

        @Override // n10.o.a
        public void c(f fVar, u10.b bVar, f fVar2) {
            if (fVar == null) {
                g(3);
            }
            if (bVar == null) {
                g(4);
            }
            if (fVar2 == null) {
                g(5);
            }
        }

        @Override // n10.o.a
        public o.b d(f fVar) {
            if (fVar == null) {
                g(2);
            }
            String b11 = fVar.b();
            if (!MessageExtension.FIELD_DATA.equals(b11) && !"filePartClassNames".equals(b11)) {
                if ("strings".equals(b11)) {
                    return i();
                }
                return null;
            }
            return h();
        }

        @Override // n10.o.a
        public void e(f fVar, y10.f fVar2) {
            if (fVar == null) {
                g(0);
            }
            if (fVar2 == null) {
                g(1);
            }
        }

        @Override // n10.o.a
        public void f(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String b11 = fVar.b();
            if ("version".equals(b11)) {
                if (obj instanceof int[]) {
                    b.this.f42115a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(b11)) {
                b.this.f42116b = obj instanceof String ? (String) obj : null;
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f42114j = hashMap;
        hashMap.put(u10.b.m(new u10.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0828a.CLASS);
        hashMap.put(u10.b.m(new u10.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0828a.FILE_FACADE);
        hashMap.put(u10.b.m(new u10.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0828a.MULTIFILE_CLASS);
        hashMap.put(u10.b.m(new u10.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0828a.MULTIFILE_CLASS_PART);
        hashMap.put(u10.b.m(new u10.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0828a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean m() {
        a.EnumC0828a enumC0828a = this.f42122h;
        return enumC0828a == a.EnumC0828a.CLASS || enumC0828a == a.EnumC0828a.FILE_FACADE || enumC0828a == a.EnumC0828a.MULTIFILE_CLASS_PART;
    }

    @Override // n10.o.c
    public void a() {
    }

    @Override // n10.o.c
    public o.a b(u10.b bVar, n0 n0Var) {
        a.EnumC0828a enumC0828a;
        if (bVar == null) {
            d(0);
        }
        if (n0Var == null) {
            d(1);
        }
        if (bVar.b().equals(z.f24511a)) {
            return new c();
        }
        if (f42113i || this.f42122h != null || (enumC0828a = f42114j.get(bVar)) == null) {
            return null;
        }
        this.f42122h = enumC0828a;
        return new d();
    }

    public o10.a l() {
        if (this.f42122h == null || this.f42115a == null) {
            return null;
        }
        e eVar = new e(this.f42115a, (this.f42117c & 8) != 0);
        if (!eVar.h()) {
            this.f42121g = this.f42119e;
            this.f42119e = null;
        } else if (m() && this.f42119e == null) {
            return null;
        }
        return new o10.a(this.f42122h, eVar, this.f42119e, this.f42121g, this.f42120f, this.f42116b, this.f42117c, this.f42118d);
    }
}