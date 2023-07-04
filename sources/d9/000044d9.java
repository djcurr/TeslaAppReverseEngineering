package com.plaid.internal;

import com.plaid.internal.b3;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;

/* loaded from: classes2.dex */
public final class o5 implements p5 {

    /* renamed from: a  reason: collision with root package name */
    public final w5 f19135a;

    /* renamed from: b  reason: collision with root package name */
    public final j6 f19136b;

    /* renamed from: c  reason: collision with root package name */
    public final i6 f19137c;

    /* renamed from: d  reason: collision with root package name */
    public final be f19138d;

    /* renamed from: e  reason: collision with root package name */
    public final ce f19139e;

    /* renamed from: f  reason: collision with root package name */
    public final c3 f19140f;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {38, 38, 40}, m = "next")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19141a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19142b;

        /* renamed from: c  reason: collision with root package name */
        public Object f19143c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f19144d;

        /* renamed from: f  reason: collision with root package name */
        public int f19146f;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19144d = obj;
            this.f19146f |= Integer.MIN_VALUE;
            return o5.this.a((Pane$PaneOutput[]) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {44, 44, 46}, m = "previous")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19147a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19148b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f19149c;

        /* renamed from: e  reason: collision with root package name */
        public int f19151e;

        public b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19149c = obj;
            this.f19151e |= Integer.MIN_VALUE;
            return o5.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {53, 56, 58, 60}, m = "resume")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19152a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19153b;

        /* renamed from: c  reason: collision with root package name */
        public Object f19154c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f19155d;

        /* renamed from: f  reason: collision with root package name */
        public int f19157f;

        public c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19155d = obj;
            this.f19157f |= Integer.MIN_VALUE;
            return o5.this.a((fb) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {30, 32, 34}, m = "start")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19158a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f19159b;

        /* renamed from: d  reason: collision with root package name */
        public int f19161d;

        public d(zz.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19159b = obj;
            this.f19161d |= Integer.MIN_VALUE;
            return o5.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {77, 79, 80}, m = "storeStateAndNavigate")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f19162a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19163b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f19164c;

        /* renamed from: e  reason: collision with root package name */
        public int f19166e;

        public e(zz.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19164c = obj;
            this.f19166e |= Integer.MIN_VALUE;
            return o5.this.a((g6) null, this);
        }
    }

    public o5(w5 navigator, j6 linkStateStore, i6 linkStateReducer, be writeOAuthRedirectUri, ce writeWebviewFallbackUri, c3 destinationFactory) {
        kotlin.jvm.internal.s.g(navigator, "navigator");
        kotlin.jvm.internal.s.g(linkStateStore, "linkStateStore");
        kotlin.jvm.internal.s.g(linkStateReducer, "linkStateReducer");
        kotlin.jvm.internal.s.g(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        kotlin.jvm.internal.s.g(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        kotlin.jvm.internal.s.g(destinationFactory, "destinationFactory");
        this.f19135a = navigator;
        this.f19136b = linkStateStore;
        this.f19137c = linkStateReducer;
        this.f19138d = writeOAuthRedirectUri;
        this.f19139e = writeWebviewFallbackUri;
        this.f19140f = destinationFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    @Override // com.plaid.internal.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] r10, zz.d<? super vz.b0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.plaid.internal.o5.a
            if (r0 == 0) goto L13
            r0 = r11
            com.plaid.internal.o5$a r0 = (com.plaid.internal.o5.a) r0
            int r1 = r0.f19146f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19146f = r1
            goto L18
        L13:
            com.plaid.internal.o5$a r0 = new com.plaid.internal.o5$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f19144d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19146f
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == 0) goto L51
            if (r2 == r4) goto L41
            if (r2 == r6) goto L39
            if (r2 != r3) goto L31
            vz.r.b(r11)
            goto L9b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.Object r10 = r0.f19141a
            com.plaid.internal.o5 r10 = (com.plaid.internal.o5) r10
            vz.r.b(r11)
            goto L82
        L41:
            java.lang.Object r10 = r0.f19143c
            com.plaid.internal.i6 r10 = (com.plaid.internal.i6) r10
            java.lang.Object r2 = r0.f19142b
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] r2 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[]) r2
            java.lang.Object r4 = r0.f19141a
            com.plaid.internal.o5 r4 = (com.plaid.internal.o5) r4
            vz.r.b(r11)
            goto L6c
        L51:
            vz.r.b(r11)
            com.plaid.internal.i6 r11 = r9.f19137c
            com.plaid.internal.j6 r2 = r9.f19136b
            r0.f19141a = r9
            r0.f19142b = r10
            r0.f19143c = r11
            r0.f19146f = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L67
            return r1
        L67:
            r4 = r9
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L6c:
            com.plaid.internal.g6 r11 = (com.plaid.internal.g6) r11
            java.util.List r2 = wz.l.s0(r2)
            r0.f19141a = r4
            r0.f19142b = r5
            r0.f19143c = r5
            r0.f19146f = r6
            java.lang.Object r11 = r10.a(r11, r2, r0)
            if (r11 != r1) goto L81
            return r1
        L81:
            r10 = r4
        L82:
            com.plaid.internal.g6 r11 = (com.plaid.internal.g6) r11
            com.plaid.internal.wa$a r2 = com.plaid.internal.wa.f19678a
            java.lang.String r4 = "Next "
            java.lang.String r4 = kotlin.jvm.internal.s.p(r4, r11)
            r7 = 0
            com.plaid.internal.wa.a.a(r2, r4, r7, r6)
            r0.f19141a = r5
            r0.f19146f = r3
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            vz.b0 r10 = vz.b0.f54756a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.o5.a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[], zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    @Override // com.plaid.internal.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(zz.d<? super vz.b0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.plaid.internal.o5.d
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.o5$d r0 = (com.plaid.internal.o5.d) r0
            int r1 = r0.f19161d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19161d = r1
            goto L18
        L13:
            com.plaid.internal.o5$d r0 = new com.plaid.internal.o5$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19159b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19161d
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            vz.r.b(r9)
            goto L8c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f19158a
            com.plaid.internal.o5 r2 = (com.plaid.internal.o5) r2
            vz.r.b(r9)
            goto L73
        L40:
            java.lang.Object r2 = r0.f19158a
            com.plaid.internal.o5 r2 = (com.plaid.internal.o5) r2
            vz.r.b(r9)
            goto L59
        L48:
            vz.r.b(r9)
            com.plaid.internal.j6 r9 = r8.f19136b
            r0.f19158a = r8
            r0.f19161d = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r8
        L59:
            com.plaid.internal.g6 r9 = (com.plaid.internal.g6) r9
            com.plaid.internal.wa$a r5 = com.plaid.internal.wa.f19678a
            java.lang.String r7 = "Start from "
            java.lang.String r7 = kotlin.jvm.internal.s.p(r7, r9)
            com.plaid.internal.wa.a.a(r5, r7, r3, r6)
            com.plaid.internal.i6 r5 = r2.f19137c
            r0.f19158a = r2
            r0.f19161d = r6
            java.lang.Object r9 = r5.c(r9, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            com.plaid.internal.g6 r9 = (com.plaid.internal.g6) r9
            com.plaid.internal.wa$a r5 = com.plaid.internal.wa.f19678a
            java.lang.String r7 = "Start next "
            java.lang.String r7 = kotlin.jvm.internal.s.p(r7, r9)
            com.plaid.internal.wa.a.a(r5, r7, r3, r6)
            r3 = 0
            r0.f19158a = r3
            r0.f19161d = r4
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L8c
            return r1
        L8c:
            vz.b0 r9 = vz.b0.f54756a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.o5.b(zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[RETURN] */
    @Override // com.plaid.internal.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(zz.d<? super vz.b0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.plaid.internal.o5.b
            if (r0 == 0) goto L13
            r0 = r10
            com.plaid.internal.o5$b r0 = (com.plaid.internal.o5.b) r0
            int r1 = r0.f19151e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19151e = r1
            goto L18
        L13:
            com.plaid.internal.o5$b r0 = new com.plaid.internal.o5$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19149c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19151e
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            vz.r.b(r10)
            goto L8a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.Object r2 = r0.f19147a
            com.plaid.internal.o5 r2 = (com.plaid.internal.o5) r2
            vz.r.b(r10)
            goto L71
        L40:
            java.lang.Object r2 = r0.f19148b
            com.plaid.internal.i6 r2 = (com.plaid.internal.i6) r2
            java.lang.Object r5 = r0.f19147a
            com.plaid.internal.o5 r5 = (com.plaid.internal.o5) r5
            vz.r.b(r10)
            goto L61
        L4c:
            vz.r.b(r10)
            com.plaid.internal.i6 r2 = r9.f19137c
            com.plaid.internal.j6 r10 = r9.f19136b
            r0.f19147a = r9
            r0.f19148b = r2
            r0.f19151e = r5
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            r5 = r9
        L61:
            com.plaid.internal.g6 r10 = (com.plaid.internal.g6) r10
            r0.f19147a = r5
            r0.f19148b = r3
            r0.f19151e = r6
            java.lang.Object r10 = r2.b(r10, r0)
            if (r10 != r1) goto L70
            return r1
        L70:
            r2 = r5
        L71:
            com.plaid.internal.g6 r10 = (com.plaid.internal.g6) r10
            com.plaid.internal.wa$a r5 = com.plaid.internal.wa.f19678a
            java.lang.String r7 = "Previous "
            java.lang.String r7 = kotlin.jvm.internal.s.p(r7, r10)
            r8 = 0
            com.plaid.internal.wa.a.a(r5, r7, r8, r6)
            r0.f19147a = r3
            r0.f19151e = r4
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            vz.b0 r10 = vz.b0.f54756a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.o5.a(zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.p5
    public void b(String number) {
        kotlin.jvm.internal.s.g(number, "number");
        this.f19135a.a(new b3.a(number));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[RETURN] */
    @Override // com.plaid.internal.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.plaid.internal.fb r11, zz.d<? super vz.b0> r12) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.o5.a(com.plaid.internal.fb, zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.p5
    public void a(LinkResult linkResult) {
        b3 bVar;
        kotlin.jvm.internal.s.g(linkResult, "linkResult");
        w5 w5Var = this.f19135a;
        if (linkResult instanceof LinkSuccess) {
            bVar = new b3.f((LinkSuccess) linkResult);
        } else if (!(linkResult instanceof LinkExit)) {
            throw new IllegalArgumentException("Link result is not a valid result of LinkSuccess or LinkExit");
        } else {
            bVar = new b3.b((LinkExit) linkResult);
        }
        w5Var.a(bVar);
    }

    @Override // com.plaid.internal.p5
    public void a(String url) {
        kotlin.jvm.internal.s.g(url, "url");
        this.f19135a.a(new b3.d(url));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.g6 r8, zz.d<? super vz.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.plaid.internal.o5.e
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.o5$e r0 = (com.plaid.internal.o5.e) r0
            int r1 = r0.f19166e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19166e = r1
            goto L18
        L13:
            com.plaid.internal.o5$e r0 = new com.plaid.internal.o5$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19164c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19166e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f19162a
            com.plaid.internal.w5 r8 = (com.plaid.internal.w5) r8
            vz.r.b(r9)
            goto L93
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f19163b
            com.plaid.internal.g6 r8 = (com.plaid.internal.g6) r8
            java.lang.Object r2 = r0.f19162a
            com.plaid.internal.o5 r2 = (com.plaid.internal.o5) r2
            vz.r.b(r9)
            goto L7e
        L47:
            java.lang.Object r8 = r0.f19163b
            com.plaid.internal.g6 r8 = (com.plaid.internal.g6) r8
            java.lang.Object r2 = r0.f19162a
            com.plaid.internal.o5 r2 = (com.plaid.internal.o5) r2
            vz.r.b(r9)
            goto L6f
        L53:
            vz.r.b(r9)
            boolean r9 = r8 instanceof com.plaid.internal.g6.j
            if (r9 == 0) goto L6e
            com.plaid.internal.ce r9 = r7.f19139e
            r2 = r8
            com.plaid.internal.g6$j r2 = (com.plaid.internal.g6.j) r2
            java.lang.String r2 = r2.f18646g
            r0.f19162a = r7
            r0.f19163b = r8
            r0.f19166e = r5
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r2 = r7
        L6f:
            com.plaid.internal.j6 r9 = r2.f19136b
            r0.f19162a = r2
            r0.f19163b = r8
            r0.f19166e = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            com.plaid.internal.w5 r9 = r2.f19135a
            com.plaid.internal.c3 r2 = r2.f19140f
            r0.f19162a = r9
            r4 = 0
            r0.f19163b = r4
            r0.f19166e = r3
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r6 = r9
            r9 = r8
            r8 = r6
        L93:
            com.plaid.internal.b3 r9 = (com.plaid.internal.b3) r9
            r8.a(r9)
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.o5.a(com.plaid.internal.g6, zz.d):java.lang.Object");
    }
}