package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import k20.d0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.text.v;
import w00.v0;
import wz.x0;

/* loaded from: classes5.dex */
public final class g implements f {
    static final /* synthetic */ KProperty<Object>[] X = {m0.f(new z(m0.b(g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), m0.f(new z(m0.b(g.class), "withDefinedIn", "getWithDefinedIn()Z")), m0.f(new z(m0.b(g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), m0.f(new z(m0.b(g.class), "modifiers", "getModifiers()Ljava/util/Set;")), m0.f(new z(m0.b(g.class), "startFromName", "getStartFromName()Z")), m0.f(new z(m0.b(g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), m0.f(new z(m0.b(g.class), "debugMode", "getDebugMode()Z")), m0.f(new z(m0.b(g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), m0.f(new z(m0.b(g.class), "verbose", "getVerbose()Z")), m0.f(new z(m0.b(g.class), "unitReturnType", "getUnitReturnType()Z")), m0.f(new z(m0.b(g.class), "withoutReturnType", "getWithoutReturnType()Z")), m0.f(new z(m0.b(g.class), "enhancedTypes", "getEnhancedTypes()Z")), m0.f(new z(m0.b(g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), m0.f(new z(m0.b(g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), m0.f(new z(m0.b(g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), m0.f(new z(m0.b(g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), m0.f(new z(m0.b(g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), m0.f(new z(m0.b(g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), m0.f(new z(m0.b(g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), m0.f(new z(m0.b(g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), m0.f(new z(m0.b(g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), m0.f(new z(m0.b(g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), m0.f(new z(m0.b(g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), m0.f(new z(m0.b(g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), m0.f(new z(m0.b(g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), m0.f(new z(m0.b(g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), m0.f(new z(m0.b(g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), m0.f(new z(m0.b(g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), m0.f(new z(m0.b(g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), m0.f(new z(m0.b(g.class), "receiverAfterName", "getReceiverAfterName()Z")), m0.f(new z(m0.b(g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), m0.f(new z(m0.b(g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), m0.f(new z(m0.b(g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), m0.f(new z(m0.b(g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), m0.f(new z(m0.b(g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), m0.f(new z(m0.b(g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), m0.f(new z(m0.b(g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), m0.f(new z(m0.b(g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), m0.f(new z(m0.b(g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), m0.f(new z(m0.b(g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), m0.f(new z(m0.b(g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), m0.f(new z(m0.b(g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), m0.f(new z(m0.b(g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), m0.f(new z(m0.b(g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), m0.f(new z(m0.b(g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), m0.f(new z(m0.b(g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), m0.f(new z(m0.b(g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), m0.f(new z(m0.b(g.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    private final kotlin.properties.c A;
    private final kotlin.properties.c B;
    private final kotlin.properties.c C;
    private final kotlin.properties.c D;
    private final kotlin.properties.c E;
    private final kotlin.properties.c F;
    private final kotlin.properties.c G;
    private final kotlin.properties.c H;
    private final kotlin.properties.c I;
    private final kotlin.properties.c J;
    private final kotlin.properties.c K;
    private final kotlin.properties.c L;
    private final kotlin.properties.c M;
    private final kotlin.properties.c N;
    private final kotlin.properties.c O;
    private final kotlin.properties.c P;
    private final kotlin.properties.c Q;
    private final kotlin.properties.c R;
    private final kotlin.properties.c S;
    private final kotlin.properties.c T;
    private final kotlin.properties.c U;
    private final kotlin.properties.c V;
    private final kotlin.properties.c W;

    /* renamed from: a  reason: collision with root package name */
    private boolean f35107a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.properties.c f35108b = m0(b.c.f35078a);

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.properties.c f35109c;

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.properties.c f35110d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlin.properties.c f35111e;

    /* renamed from: f  reason: collision with root package name */
    private final kotlin.properties.c f35112f;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.properties.c f35113g;

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.properties.c f35114h;

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.properties.c f35115i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.properties.c f35116j;

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.properties.c f35117k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.properties.c f35118l;

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.properties.c f35119m;

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.properties.c f35120n;

    /* renamed from: o  reason: collision with root package name */
    private final kotlin.properties.c f35121o;

    /* renamed from: p  reason: collision with root package name */
    private final kotlin.properties.c f35122p;

    /* renamed from: q  reason: collision with root package name */
    private final kotlin.properties.c f35123q;

    /* renamed from: r  reason: collision with root package name */
    private final kotlin.properties.c f35124r;

    /* renamed from: s  reason: collision with root package name */
    private final kotlin.properties.c f35125s;

    /* renamed from: t  reason: collision with root package name */
    private final kotlin.properties.c f35126t;

    /* renamed from: u  reason: collision with root package name */
    private final kotlin.properties.c f35127u;

    /* renamed from: v  reason: collision with root package name */
    private final kotlin.properties.c f35128v;

    /* renamed from: w  reason: collision with root package name */
    private final kotlin.properties.c f35129w;

    /* renamed from: x  reason: collision with root package name */
    private final kotlin.properties.c f35130x;

    /* renamed from: y  reason: collision with root package name */
    private final kotlin.properties.c f35131y;

    /* renamed from: z  reason: collision with root package name */
    private final kotlin.properties.c f35132z;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<v0, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35133a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String invoke(v0 it2) {
            s.g(it2, "it");
            return "...";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class b<T> extends kotlin.properties.b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f35135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, g gVar) {
            super(obj2);
            this.f35134a = obj;
            this.f35135b = gVar;
        }

        @Override // kotlin.properties.b
        protected boolean beforeChange(n00.m<?> property, T t11, T t12) {
            s.g(property, "property");
            if (this.f35135b.k0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.l<d0, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35136a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 invoke(d0 it2) {
            s.g(it2, "it");
            return it2;
        }
    }

    public g() {
        Set d11;
        Boolean bool = Boolean.TRUE;
        this.f35109c = m0(bool);
        this.f35110d = m0(bool);
        this.f35111e = m0(e.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f35112f = m0(bool2);
        this.f35113g = m0(bool2);
        this.f35114h = m0(bool2);
        this.f35115i = m0(bool2);
        this.f35116j = m0(bool2);
        this.f35117k = m0(bool);
        this.f35118l = m0(bool2);
        this.f35119m = m0(bool2);
        this.f35120n = m0(bool2);
        this.f35121o = m0(bool);
        this.f35122p = m0(bool);
        this.f35123q = m0(bool2);
        this.f35124r = m0(bool2);
        this.f35125s = m0(bool2);
        this.f35126t = m0(bool2);
        this.f35127u = m0(bool2);
        this.f35128v = m0(bool2);
        this.f35129w = m0(bool2);
        this.f35130x = m0(c.f35136a);
        this.f35131y = m0(a.f35133a);
        this.f35132z = m0(bool);
        this.A = m0(j.RENDER_OPEN);
        this.B = m0(c.l.a.f35093a);
        this.C = m0(m.PLAIN);
        this.D = m0(k.ALL);
        this.E = m0(bool2);
        this.F = m0(bool2);
        this.G = m0(l.DEBUG);
        this.H = m0(bool2);
        this.I = m0(bool2);
        d11 = x0.d();
        this.J = m0(d11);
        this.K = m0(h.f35137a.a());
        this.L = m0(null);
        this.M = m0(kotlin.reflect.jvm.internal.impl.renderer.a.NO_ARGUMENTS);
        this.N = m0(bool2);
        this.O = m0(bool);
        this.P = m0(bool);
        this.Q = m0(bool2);
        this.R = m0(bool);
        this.S = m0(bool);
        this.T = m0(bool2);
        this.U = m0(bool2);
        this.V = m0(bool2);
        this.W = m0(bool);
    }

    private final <T> kotlin.properties.c<g, T> m0(T t11) {
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        return new b(t11, t11, this);
    }

    public boolean A() {
        return ((Boolean) this.R.getValue(this, X[42])).booleanValue();
    }

    public boolean B() {
        return f.a.a(this);
    }

    public boolean C() {
        return f.a.b(this);
    }

    public boolean D() {
        return ((Boolean) this.f35127u.getValue(this, X[19])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.W.getValue(this, X[47])).booleanValue();
    }

    public Set<e> F() {
        return (Set) this.f35111e.getValue(this, X[3]);
    }

    public boolean G() {
        return ((Boolean) this.f35120n.getValue(this, X[12])).booleanValue();
    }

    public j H() {
        return (j) this.A.getValue(this, X[25]);
    }

    public k I() {
        return (k) this.D.getValue(this, X[28]);
    }

    public boolean J() {
        return ((Boolean) this.S.getValue(this, X[43])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.U.getValue(this, X[45])).booleanValue();
    }

    public l L() {
        return (l) this.G.getValue(this, X[31]);
    }

    public boolean M() {
        return ((Boolean) this.E.getValue(this, X[29])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.F.getValue(this, X[30])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f35123q.getValue(this, X[15])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.O.getValue(this, X[39])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.H.getValue(this, X[32])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f35122p.getValue(this, X[14])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f35121o.getValue(this, X[13])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f35124r.getValue(this, X[16])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.Q.getValue(this, X[41])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.P.getValue(this, X[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f35132z.getValue(this, X[24])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f35113g.getValue(this, X[5])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f35112f.getValue(this, X[4])).booleanValue();
    }

    public m Z() {
        return (m) this.C.getValue(this, X[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(boolean z11) {
        this.f35112f.setValue(this, X[4], Boolean.valueOf(z11));
    }

    public h00.l<d0, d0> a0() {
        return (h00.l) this.f35130x.getValue(this, X[22]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(k kVar) {
        s.g(kVar, "<set-?>");
        this.D.setValue(this, X[28], kVar);
    }

    public boolean b0() {
        return ((Boolean) this.f35126t.getValue(this, X[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(boolean z11) {
        this.f35109c.setValue(this, X[1], Boolean.valueOf(z11));
    }

    public boolean c0() {
        return ((Boolean) this.f35117k.getValue(this, X[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean d() {
        return ((Boolean) this.f35119m.getValue(this, X[11])).booleanValue();
    }

    public c.l d0() {
        return (c.l) this.B.getValue(this, X[26]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z11) {
        this.f35129w.setValue(this, X[21], Boolean.valueOf(z11));
    }

    public boolean e0() {
        return ((Boolean) this.f35116j.getValue(this, X[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z11) {
        this.E.setValue(this, X[29], Boolean.valueOf(z11));
    }

    public boolean f0() {
        return ((Boolean) this.f35109c.getValue(this, X[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(m mVar) {
        s.g(mVar, "<set-?>");
        this.C.setValue(this, X[27], mVar);
    }

    public boolean g0() {
        return ((Boolean) this.f35110d.getValue(this, X[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public Set<u10.c> h() {
        return (Set) this.K.getValue(this, X[35]);
    }

    public boolean h0() {
        return ((Boolean) this.f35118l.getValue(this, X[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean i() {
        return ((Boolean) this.f35114h.getValue(this, X[6])).booleanValue();
    }

    public boolean i0() {
        return ((Boolean) this.f35129w.getValue(this, X[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public kotlin.reflect.jvm.internal.impl.renderer.a j() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a) this.M.getValue(this, X[37]);
    }

    public boolean j0() {
        return ((Boolean) this.f35128v.getValue(this, X[20])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(Set<u10.c> set) {
        s.g(set, "<set-?>");
        this.K.setValue(this, X[35], set);
    }

    public final boolean k0() {
        return this.f35107a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(Set<? extends e> set) {
        s.g(set, "<set-?>");
        this.f35111e.setValue(this, X[3], set);
    }

    public final void l0() {
        this.f35107a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        s.g(bVar, "<set-?>");
        this.f35108b.setValue(this, X[0], bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(boolean z11) {
        this.f35114h.setValue(this, X[6], Boolean.valueOf(z11));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void o(boolean z11) {
        this.F.setValue(this, X[30], Boolean.valueOf(z11));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z11) {
        this.f35128v.setValue(this, X[20], Boolean.valueOf(z11));
    }

    public final g q() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        s.f(declaredFields, "this::class.java.declaredFields");
        int length = declaredFields.length;
        int i11 = 0;
        while (i11 < length) {
            Field field = declaredFields[i11];
            i11++;
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                kotlin.properties.b bVar = obj instanceof kotlin.properties.b ? (kotlin.properties.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    s.f(name, "field.name");
                    v.H(name, "is", false, 2, null);
                    n00.d b11 = m0.b(g.class);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    s.f(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        s.f(substring, "(this as java.lang.String).substring(startIndex)");
                        name3 = String.valueOf(upperCase) + substring;
                    }
                    field.set(gVar, gVar.m0(bVar.getValue(this, new f0(b11, name2, s.p("get", name3)))));
                }
            }
        }
        return gVar;
    }

    public boolean r() {
        return ((Boolean) this.f35125s.getValue(this, X[17])).booleanValue();
    }

    public boolean s() {
        return ((Boolean) this.N.getValue(this, X[38])).booleanValue();
    }

    public h00.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> t() {
        return (h00.l) this.L.getValue(this, X[36]);
    }

    public boolean u() {
        return ((Boolean) this.V.getValue(this, X[46])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f35115i.getValue(this, X[7])).booleanValue();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.b w() {
        return (kotlin.reflect.jvm.internal.impl.renderer.b) this.f35108b.getValue(this, X[0]);
    }

    public h00.l<v0, String> x() {
        return (h00.l) this.f35131y.getValue(this, X[23]);
    }

    public boolean y() {
        return ((Boolean) this.I.getValue(this, X[33])).booleanValue();
    }

    public Set<u10.c> z() {
        return (Set) this.J.getValue(this, X[34]);
    }
}