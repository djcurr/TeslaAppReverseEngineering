package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.pd;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class b3 {

    /* loaded from: classes2.dex */
    public static final class a extends b3 {

        /* renamed from: a */
        public final String f18192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String phoneNumber) {
            super(null);
            kotlin.jvm.internal.s.g(phoneNumber, "phoneNumber");
            this.f18192a = phoneNumber;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends b3 {

        /* renamed from: a */
        public final LinkExit f18193a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LinkExit exit) {
            super(null);
            kotlin.jvm.internal.s.g(exit, "exit");
            this.f18193a = exit;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b3 {

        /* renamed from: a */
        public static final c f18194a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b3 {

        /* renamed from: a */
        public final String f18195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String url) {
            super(null);
            kotlin.jvm.internal.s.g(url, "url");
            this.f18195a = url;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e<F extends pd<?>> extends b3 {

        /* renamed from: a */
        public final h00.l<vd, F> f18196a;

        /* loaded from: classes2.dex */
        public static final class a extends e<com.plaid.internal.o> {

            /* renamed from: b */
            public final vd f18197b;

            /* renamed from: com.plaid.internal.b3$e$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0327a extends kotlin.jvm.internal.p implements h00.l<vd, com.plaid.internal.o> {
                public C0327a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public com.plaid.internal.o mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (com.plaid.internal.o) ((pd) com.plaid.internal.o.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vd pane) {
                super(new C0327a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18197b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18197b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f18197b, ((a) obj).f18197b);
            }

            public int hashCode() {
                return this.f18197b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("Button(pane=");
                a11.append(this.f18197b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends e<r> {

            /* renamed from: b */
            public final vd f18198b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, r> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public r mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (r) ((pd) r.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18198b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18198b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f18198b, ((b) obj).f18198b);
            }

            public int hashCode() {
                return this.f18198b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ButtonList(pane=");
                a11.append(this.f18198b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends e<x> {

            /* renamed from: b */
            public final vd f18199b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, x> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public x mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (x) ((pd) x.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18199b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18199b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f18199b, ((c) obj).f18199b);
            }

            public int hashCode() {
                return this.f18199b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ButtonWithAccordion(pane=");
                a11.append(this.f18199b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends e<d0> {

            /* renamed from: b */
            public final vd f18200b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, d0> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public d0 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (d0) ((pd) d0.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18200b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18200b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && kotlin.jvm.internal.s.c(this.f18200b, ((d) obj).f18200b);
            }

            public int hashCode() {
                return this.f18200b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ButtonWithCards(pane=");
                a11.append(this.f18200b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* renamed from: com.plaid.internal.b3$e$e */
        /* loaded from: classes2.dex */
        public static final class C0328e extends e<j0> {

            /* renamed from: b */
            public final vd f18201b;

            /* renamed from: com.plaid.internal.b3$e$e$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, j0> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public j0 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (j0) ((pd) j0.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0328e(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18201b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18201b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0328e) && kotlin.jvm.internal.s.c(this.f18201b, ((C0328e) obj).f18201b);
            }

            public int hashCode() {
                return this.f18201b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ButtonWithTable(pane=");
                a11.append(this.f18201b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class f extends e<p0> {

            /* renamed from: b */
            public final vd f18202b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, p0> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public p0 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (p0) ((pd) p0.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18202b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18202b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && kotlin.jvm.internal.s.c(this.f18202b, ((f) obj).f18202b);
            }

            public int hashCode() {
                return this.f18202b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ButtonWithWebview(pane=");
                a11.append(this.f18202b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class g extends e<x0> {

            /* renamed from: b */
            public final vd f18203b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, x0> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public x0 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (x0) ((pd) x0.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18203b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18203b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && kotlin.jvm.internal.s.c(this.f18203b, ((g) obj).f18203b);
            }

            public int hashCode() {
                return this.f18203b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("Challenge(pane=");
                a11.append(this.f18203b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class h extends e<u1> {

            /* renamed from: b */
            public final vd f18204b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, u1> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public u1 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (u1) ((pd) u1.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18204b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18204b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && kotlin.jvm.internal.s.c(this.f18204b, ((h) obj).f18204b);
            }

            public int hashCode() {
                return this.f18204b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("Consent(pane=");
                a11.append(this.f18204b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class i extends e<u2> {

            /* renamed from: b */
            public final vd f18205b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, u2> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public u2 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (u2) ((pd) u2.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18205b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18205b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && kotlin.jvm.internal.s.c(this.f18205b, ((i) obj).f18205b);
            }

            public int hashCode() {
                return this.f18205b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("Credentials(pane=");
                a11.append(this.f18205b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class j extends e<o3> {

            /* renamed from: b */
            public final vd f18206b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, o3> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public o3 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (o3) ((pd) o3.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18206b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18206b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && kotlin.jvm.internal.s.c(this.f18206b, ((j) obj).f18206b);
            }

            public int hashCode() {
                return this.f18206b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("GridSelection(pane=");
                a11.append(this.f18206b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class k extends e<t3> {

            /* renamed from: b */
            public final vd f18207b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, t3> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public t3 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (t3) ((pd) t3.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18207b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18207b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && kotlin.jvm.internal.s.c(this.f18207b, ((k) obj).f18207b);
            }

            public int hashCode() {
                return this.f18207b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("HeadlessOAuth(pane=");
                a11.append(this.f18207b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class l extends e<i7> {

            /* renamed from: b */
            public final vd f18208b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, i7> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public i7 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (i7) ((pd) i7.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18208b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18208b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && kotlin.jvm.internal.s.c(this.f18208b, ((l) obj).f18208b);
            }

            public int hashCode() {
                return this.f18208b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("OAuth(pane=");
                a11.append(this.f18208b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class m extends e<r7> {

            /* renamed from: b */
            public final vd f18209b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, r7> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public r7 mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (r7) ((pd) r7.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18209b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18209b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && kotlin.jvm.internal.s.c(this.f18209b, ((m) obj).f18209b);
            }

            public int hashCode() {
                return this.f18209b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("OrderedList(pane=");
                a11.append(this.f18209b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class n extends e<nb> {

            /* renamed from: b */
            public final vd f18210b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, nb> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public nb mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (nb) ((pd) nb.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18210b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18210b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && kotlin.jvm.internal.s.c(this.f18210b, ((n) obj).f18210b);
            }

            public int hashCode() {
                return this.f18210b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("SearchAndSelect(pane=");
                a11.append(this.f18210b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class o extends e<oc> {

            /* renamed from: b */
            public final vd f18211b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, oc> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public oc mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (oc) ((pd) oc.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18211b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18211b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && kotlin.jvm.internal.s.c(this.f18211b, ((o) obj).f18211b);
            }

            public int hashCode() {
                return this.f18211b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("UserInput(pane=");
                a11.append(this.f18211b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class p extends e<vc> {

            /* renamed from: b */
            public final vd f18212b;

            /* loaded from: classes2.dex */
            public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<vd, vc> {
                public a(Object obj) {
                    super(1, obj, td.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public vc mo12invoke(vd vdVar) {
                    vd p02 = vdVar;
                    kotlin.jvm.internal.s.g(p02, "p0");
                    td tdVar = (td) this.receiver;
                    pd.a aVar = pd.f19253d;
                    return (vc) ((pd) vc.class.newInstance()).a(p02);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(vd pane) {
                super(new a(td.f19539a), null);
                kotlin.jvm.internal.s.g(pane, "pane");
                this.f18212b = pane;
            }

            @Override // com.plaid.internal.b3.e
            public vd a() {
                return this.f18212b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && kotlin.jvm.internal.s.c(this.f18212b, ((p) obj).f18212b);
            }

            public int hashCode() {
                return this.f18212b.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("UserSelection(pane=");
                a11.append(this.f18212b);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(h00.l<? super vd, ? extends F> lVar) {
            super(null);
            this.f18196a = lVar;
        }

        public /* synthetic */ e(h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(lVar);
        }

        public abstract vd a();
    }

    /* loaded from: classes2.dex */
    public static final class f extends b3 {

        /* renamed from: a */
        public final LinkSuccess f18213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LinkSuccess success) {
            super(null);
            kotlin.jvm.internal.s.g(success, "success");
            this.f18213a = success;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String url) {
            super(null);
            kotlin.jvm.internal.s.g(url, "url");
        }
    }

    public b3() {
        kotlin.jvm.internal.s.f(getClass().getSimpleName(), "this.javaClass.simpleName");
    }

    public /* synthetic */ b3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}