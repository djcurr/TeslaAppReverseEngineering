package k20;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Kind;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

/* loaded from: classes5.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final w00.x f34333a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final c f34334b = new c(u10.f.i("<ERROR CLASS>"));

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f34335c = j("<LOOP IN SUPERTYPES>");

    /* renamed from: d  reason: collision with root package name */
    private static final d0 f34336d = j("<ERROR PROPERTY TYPE>");

    /* renamed from: e  reason: collision with root package name */
    private static final w00.i0 f34337e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<w00.i0> f34338f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements w00.x {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void w(int r12) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k20.v.a.w(int):void");
        }

        @Override // w00.x
        public w00.f0 R(u10.c cVar) {
            if (cVar == null) {
                w(7);
            }
            throw new IllegalStateException("Should not be called!");
        }

        @Override // w00.i
        public w00.i a() {
            return this;
        }

        @Override // w00.i
        public w00.i b() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
            if (b11 == null) {
                w(1);
            }
            return b11;
        }

        @Override // w00.y
        public u10.f getName() {
            u10.f i11 = u10.f.i("<ERROR MODULE>");
            if (i11 == null) {
                w(5);
            }
            return i11;
        }

        @Override // w00.x
        public t00.h l() {
            t00.e E0 = t00.e.E0();
            if (E0 == null) {
                w(14);
            }
            return E0;
        }

        @Override // w00.x
        public <T> T l0(w00.w<T> wVar) {
            if (wVar == null) {
                w(0);
                return null;
            }
            return null;
        }

        @Override // w00.x
        public Collection<u10.c> r(u10.c cVar, h00.l<? super u10.f, Boolean> lVar) {
            List i11;
            if (cVar == null) {
                w(2);
            }
            if (lVar == null) {
                w(3);
            }
            i11 = wz.w.i();
            if (i11 == null) {
                w(4);
            }
            return i11;
        }

        @Override // w00.x
        public List<w00.x> t0() {
            List<w00.x> i11;
            i11 = wz.w.i();
            if (i11 == null) {
                w(9);
            }
            return i11;
        }

        @Override // w00.i
        public <R, D> R v0(w00.k<R, D> kVar, D d11) {
            if (kVar == null) {
                w(11);
                return null;
            }
            return null;
        }

        @Override // w00.x
        public boolean y(w00.x xVar) {
            if (xVar == null) {
                w(12);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements w0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f34339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34340b;

        b(c cVar, String str) {
            this.f34339a = cVar;
            this.f34340b = str;
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i11 != 3 ? 2 : 3];
            if (i11 != 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else {
                objArr[0] = "kotlinTypeRefiner";
            }
            if (i11 == 1) {
                objArr[1] = "getSupertypes";
            } else if (i11 == 2) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else if (i11 != 4) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "refine";
            }
            if (i11 == 3) {
                objArr[2] = "refine";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // k20.w0
        public Collection<d0> a() {
            List i11;
            i11 = wz.w.i();
            if (i11 == null) {
                b(1);
            }
            return i11;
        }

        @Override // k20.w0
        public List<w00.s0> getParameters() {
            List<w00.s0> i11;
            i11 = wz.w.i();
            if (i11 == null) {
                b(0);
            }
            return i11;
        }

        @Override // k20.w0
        public t00.h l() {
            t00.e E0 = t00.e.E0();
            if (E0 == null) {
                b(2);
            }
            return E0;
        }

        @Override // k20.w0
        public w0 m(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            if (hVar == null) {
                b(3);
            }
            return this;
        }

        @Override // k20.w0
        public w00.e n() {
            return this.f34339a;
        }

        @Override // k20.w0
        public boolean o() {
            return false;
        }

        public String toString() {
            return this.f34340b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends y00.h {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(u10.f r11) {
            /*
                r10 = this;
                if (r11 != 0) goto L6
                r0 = 0
                d0(r0)
            L6:
                w00.x r2 = k20.v.q()
                kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN
                kotlin.reflect.jvm.internal.impl.descriptors.c r5 = kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS
                java.util.List r6 = java.util.Collections.emptyList()
                w00.n0 r0 = w00.n0.f55303a
                r8 = 0
                j20.n r9 = j20.f.f33124e
                r1 = r10
                r3 = r11
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r11 = r11.b()
                r1 = 1
                y00.f r11 = y00.f.i1(r10, r11, r1, r0)
                java.util.List r0 = java.util.Collections.emptyList()
                w00.q r1 = w00.p.f55308d
                r11.l1(r0, r1)
                u10.f r0 = r10.getName()
                java.lang.String r0 = r0.b()
                d20.h r0 = k20.v.h(r0)
                k20.u r1 = new k20.u
                java.lang.String r2 = "<ERROR>"
                k20.w0 r2 = k20.v.d(r2, r10)
                r1.<init>(r2, r0)
                r11.c1(r1)
                java.util.Set r1 = java.util.Collections.singleton(r11)
                r10.G0(r0, r1, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k20.v.c.<init>(u10.f):void");
        }

        private static /* synthetic */ void d0(int i11) {
            String str = (i11 == 2 || i11 == 5 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 5 || i11 == 8) ? 2 : 3];
            switch (i11) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i11 == 2) {
                objArr[1] = "substitute";
            } else if (i11 == 5 || i11 == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i11) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 2 && i11 != 5 && i11 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // y00.a, w00.p0
        /* renamed from: F0 */
        public w00.c c(d1 d1Var) {
            if (d1Var == null) {
                d0(1);
            }
            return this;
        }

        @Override // y00.h
        public String toString() {
            return getName().b();
        }

        @Override // y00.a, y00.t
        public d20.h w(b1 b1Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            if (b1Var == null) {
                d0(6);
            }
            if (hVar == null) {
                d0(7);
            }
            d20.h h11 = v.h("Error scope for class " + getName() + " with arguments: " + b1Var);
            if (h11 == null) {
                d0(8);
            }
            return h11;
        }
    }

    /* loaded from: classes5.dex */
    public static class d implements d20.h {

        /* renamed from: b  reason: collision with root package name */
        private final String f34341b;

        /* synthetic */ d(String str, a aVar) {
            this(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r10) {
            /*
                r0 = 18
                r1 = 7
                if (r10 == r1) goto Ld
                if (r10 == r0) goto Ld
                switch(r10) {
                    case 10: goto Ld;
                    case 11: goto Ld;
                    case 12: goto Ld;
                    case 13: goto Ld;
                    default: goto La;
                }
            La:
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lf
            Ld:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lf:
                r3 = 2
                if (r10 == r1) goto L19
                if (r10 == r0) goto L19
                switch(r10) {
                    case 10: goto L19;
                    case 11: goto L19;
                    case 12: goto L19;
                    case 13: goto L19;
                    default: goto L17;
                }
            L17:
                r4 = 3
                goto L1a
            L19:
                r4 = r3
            L1a:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope"
                r6 = 0
                switch(r10) {
                    case 1: goto L3e;
                    case 2: goto L39;
                    case 3: goto L3e;
                    case 4: goto L39;
                    case 5: goto L3e;
                    case 6: goto L39;
                    case 7: goto L36;
                    case 8: goto L3e;
                    case 9: goto L39;
                    case 10: goto L36;
                    case 11: goto L36;
                    case 12: goto L36;
                    case 13: goto L36;
                    case 14: goto L3e;
                    case 15: goto L39;
                    case 16: goto L31;
                    case 17: goto L2c;
                    case 18: goto L36;
                    case 19: goto L3e;
                    case 20: goto L27;
                    default: goto L22;
                }
            L22:
                java.lang.String r7 = "debugMessage"
                r4[r6] = r7
                goto L42
            L27:
                java.lang.String r7 = "p"
                r4[r6] = r7
                goto L42
            L2c:
                java.lang.String r7 = "nameFilter"
                r4[r6] = r7
                goto L42
            L31:
                java.lang.String r7 = "kindFilter"
                r4[r6] = r7
                goto L42
            L36:
                r4[r6] = r5
                goto L42
            L39:
                java.lang.String r7 = "location"
                r4[r6] = r7
                goto L42
            L3e:
                java.lang.String r7 = "name"
                r4[r6] = r7
            L42:
                java.lang.String r6 = "getContributedDescriptors"
                java.lang.String r7 = "getContributedFunctions"
                java.lang.String r8 = "getContributedVariables"
                r9 = 1
                if (r10 == r1) goto L68
                if (r10 == r0) goto L65
                switch(r10) {
                    case 10: goto L62;
                    case 11: goto L5d;
                    case 12: goto L58;
                    case 13: goto L53;
                    default: goto L50;
                }
            L50:
                r4[r9] = r5
                goto L6a
            L53:
                java.lang.String r5 = "getClassifierNames"
                r4[r9] = r5
                goto L6a
            L58:
                java.lang.String r5 = "getVariableNames"
                r4[r9] = r5
                goto L6a
            L5d:
                java.lang.String r5 = "getFunctionNames"
                r4[r9] = r5
                goto L6a
            L62:
                r4[r9] = r7
                goto L6a
            L65:
                r4[r9] = r6
                goto L6a
            L68:
                r4[r9] = r8
            L6a:
                switch(r10) {
                    case 1: goto L8f;
                    case 2: goto L8f;
                    case 3: goto L8a;
                    case 4: goto L8a;
                    case 5: goto L87;
                    case 6: goto L87;
                    case 7: goto L93;
                    case 8: goto L84;
                    case 9: goto L84;
                    case 10: goto L93;
                    case 11: goto L93;
                    case 12: goto L93;
                    case 13: goto L93;
                    case 14: goto L7f;
                    case 15: goto L7f;
                    case 16: goto L7c;
                    case 17: goto L7c;
                    case 18: goto L93;
                    case 19: goto L77;
                    case 20: goto L72;
                    default: goto L6d;
                }
            L6d:
                java.lang.String r5 = "<init>"
                r4[r3] = r5
                goto L93
            L72:
                java.lang.String r5 = "printScopeStructure"
                r4[r3] = r5
                goto L93
            L77:
                java.lang.String r5 = "definitelyDoesNotContainName"
                r4[r3] = r5
                goto L93
            L7c:
                r4[r3] = r6
                goto L93
            L7f:
                java.lang.String r5 = "recordLookup"
                r4[r3] = r5
                goto L93
            L84:
                r4[r3] = r7
                goto L93
            L87:
                r4[r3] = r8
                goto L93
            L8a:
                java.lang.String r5 = "getContributedClassifierIncludeDeprecated"
                r4[r3] = r5
                goto L93
            L8f:
                java.lang.String r5 = "getContributedClassifier"
                r4[r3] = r5
            L93:
                java.lang.String r2 = java.lang.String.format(r2, r4)
                if (r10 == r1) goto La4
                if (r10 == r0) goto La4
                switch(r10) {
                    case 10: goto La4;
                    case 11: goto La4;
                    case 12: goto La4;
                    case 13: goto La4;
                    default: goto L9e;
                }
            L9e:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r2)
                goto La9
            La4:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r2)
            La9:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: k20.v.d.h(int):void");
        }

        @Override // d20.h
        public Set<u10.f> b() {
            Set<u10.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(11);
            }
            return emptySet;
        }

        @Override // d20.h
        public Set<u10.f> d() {
            Set<u10.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(12);
            }
            return emptySet;
        }

        @Override // d20.k
        public w00.e e(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            return v.e(fVar.b());
        }

        @Override // d20.h
        public Set<u10.f> f() {
            Set<u10.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(13);
            }
            return emptySet;
        }

        @Override // d20.k
        public Collection<w00.i> g(d20.d dVar, h00.l<? super u10.f, Boolean> lVar) {
            if (dVar == null) {
                h(16);
            }
            if (lVar == null) {
                h(17);
            }
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                h(18);
            }
            return emptyList;
        }

        @Override // d20.h
        /* renamed from: i */
        public Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(8);
            }
            if (bVar == null) {
                h(9);
            }
            Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> singleton = Collections.singleton(v.f(this));
            if (singleton == null) {
                h(10);
            }
            return singleton;
        }

        @Override // d20.h
        /* renamed from: j */
        public Set<? extends w00.i0> a(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Set<? extends w00.i0> set = v.f34338f;
            if (set == null) {
                h(7);
            }
            return set;
        }

        public String toString() {
            return "ErrorScope{" + this.f34341b + CoreConstants.CURLY_RIGHT;
        }

        private d(String str) {
            if (str == null) {
                h(0);
            }
            this.f34341b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e implements d20.h {

        /* renamed from: b  reason: collision with root package name */
        private final String f34342b;

        /* synthetic */ e(String str, a aVar) {
            this(str);
        }

        private static /* synthetic */ void h(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = Kind.LOCATION;
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // d20.h
        public Collection<? extends w00.i0> a(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            throw new IllegalStateException(this.f34342b + ", required name: " + fVar);
        }

        @Override // d20.h
        public Set<u10.f> b() {
            throw new IllegalStateException();
        }

        @Override // d20.h
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(7);
            }
            if (bVar == null) {
                h(8);
            }
            throw new IllegalStateException(this.f34342b + ", required name: " + fVar);
        }

        @Override // d20.h
        public Set<u10.f> d() {
            throw new IllegalStateException();
        }

        @Override // d20.k
        public w00.e e(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            throw new IllegalStateException(this.f34342b + ", required name: " + fVar);
        }

        @Override // d20.h
        public Set<u10.f> f() {
            throw new IllegalStateException();
        }

        @Override // d20.k
        public Collection<w00.i> g(d20.d dVar, h00.l<? super u10.f, Boolean> lVar) {
            if (dVar == null) {
                h(9);
            }
            if (lVar == null) {
                h(10);
            }
            throw new IllegalStateException(this.f34342b);
        }

        public String toString() {
            return "ThrowingScope{" + this.f34342b + CoreConstants.CURLY_RIGHT;
        }

        private e(String str) {
            if (str == null) {
                h(0);
            }
            this.f34342b = str;
        }
    }

    /* loaded from: classes5.dex */
    public static class f implements w0 {

        /* renamed from: a  reason: collision with root package name */
        private final w00.s0 f34343a;

        /* renamed from: b  reason: collision with root package name */
        private final w0 f34344b;

        private static /* synthetic */ void b(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 6) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i11 == 2) {
                objArr[1] = "getParameters";
            } else if (i11 == 3) {
                objArr[1] = "getSupertypes";
            } else if (i11 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i11 != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 6) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // k20.w0
        public Collection<d0> a() {
            Collection<d0> a11 = this.f34344b.a();
            if (a11 == null) {
                b(3);
            }
            return a11;
        }

        public w00.s0 c() {
            w00.s0 s0Var = this.f34343a;
            if (s0Var == null) {
                b(1);
            }
            return s0Var;
        }

        @Override // k20.w0
        public List<w00.s0> getParameters() {
            List<w00.s0> parameters = this.f34344b.getParameters();
            if (parameters == null) {
                b(2);
            }
            return parameters;
        }

        @Override // k20.w0
        public t00.h l() {
            t00.h g11 = a20.a.g(this.f34343a);
            if (g11 == null) {
                b(4);
            }
            return g11;
        }

        @Override // k20.w0
        public w0 m(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            if (hVar == null) {
                b(5);
            }
            return this;
        }

        @Override // k20.w0
        public w00.e n() {
            return this.f34344b.n();
        }

        @Override // k20.w0
        public boolean o() {
            return this.f34344b.o();
        }
    }

    static {
        y00.c0 g11 = g();
        f34337e = g11;
        f34338f = Collections.singleton(g11);
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 4 || i11 == 6 || i11 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 6 || i11 == 19) ? 2 : 3];
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i11 == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i11 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i11) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 6 && i11 != 19) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static w00.c e(String str) {
        if (str == null) {
            a(1);
        }
        return new c(u10.f.i("<ERROR CLASS: " + str + ">"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kotlin.reflect.jvm.internal.impl.descriptors.h f(d dVar) {
        if (dVar == null) {
            a(5);
        }
        l20.a aVar = new l20.a(f34334b, dVar);
        aVar.N0(null, null, Collections.emptyList(), Collections.emptyList(), j("<ERROR FUNCTION RETURN TYPE>"), kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN, w00.p.f55309e);
        return aVar;
    }

    private static y00.c0 g() {
        y00.c0 J0 = y00.c0.J0(f34334b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN, w00.p.f55309e, true, u10.f.i("<ERROR PROPERTY>"), b.a.DECLARATION, w00.n0.f55303a, false, false, false, false, false, false);
        J0.V0(f34336d, Collections.emptyList(), null, null);
        return J0;
    }

    public static d20.h h(String str) {
        if (str == null) {
            a(2);
        }
        return i(str, false);
    }

    public static d20.h i(String str, boolean z11) {
        if (str == null) {
            a(3);
        }
        if (z11) {
            return new e(str, null);
        }
        return new d(str, null);
    }

    public static k0 j(String str) {
        if (str == null) {
            a(7);
        }
        return n(str, Collections.emptyList());
    }

    public static w0 k(String str) {
        if (str == null) {
            a(15);
        }
        return m("[ERROR : " + str + "]", f34334b);
    }

    public static w0 l(String str) {
        if (str == null) {
            a(16);
        }
        return m(str, f34334b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w0 m(String str, c cVar) {
        if (str == null) {
            a(17);
        }
        if (cVar == null) {
            a(18);
        }
        return new b(cVar, str);
    }

    public static k0 n(String str, List<y0> list) {
        if (str == null) {
            a(11);
        }
        if (list == null) {
            a(12);
        }
        return new u(k(str), h(str), list, false);
    }

    public static k0 o(String str, w0 w0Var) {
        if (str == null) {
            a(9);
        }
        if (w0Var == null) {
            a(10);
        }
        return new u(w0Var, h(str));
    }

    public static k0 p(String str) {
        if (str == null) {
            a(8);
        }
        return o(str, l(str));
    }

    public static w00.x q() {
        w00.x xVar = f34333a;
        if (xVar == null) {
            a(19);
        }
        return xVar;
    }

    public static boolean r(w00.i iVar) {
        if (iVar == null) {
            return false;
        }
        return s(iVar) || s(iVar.b()) || iVar == f34333a;
    }

    private static boolean s(w00.i iVar) {
        return iVar instanceof c;
    }

    public static boolean t(d0 d0Var) {
        return d0Var != null && (d0Var.H0() instanceof f);
    }
}