package n0;

import androidx.compose.ui.platform.y1;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final float f39900a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f39901b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f39902c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {825}, m = "awaitDragOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39903a;

        /* renamed from: b  reason: collision with root package name */
        Object f39904b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39905c;

        /* renamed from: d  reason: collision with root package name */
        int f39906d;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39905c = obj;
            this.f39906d |= Integer.MIN_VALUE;
            return j.c(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {831, 869}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39907a;

        /* renamed from: b  reason: collision with root package name */
        Object f39908b;

        /* renamed from: c  reason: collision with root package name */
        Object f39909c;

        /* renamed from: d  reason: collision with root package name */
        Object f39910d;

        /* renamed from: e  reason: collision with root package name */
        float f39911e;

        /* renamed from: f  reason: collision with root package name */
        float f39912f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f39913g;

        /* renamed from: h  reason: collision with root package name */
        int f39914h;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39913g = obj;
            this.f39914h |= Integer.MIN_VALUE;
            return j.d(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {756}, m = "awaitLongPressOrCancellation")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39915a;

        /* renamed from: b  reason: collision with root package name */
        Object f39916b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39917c;

        /* renamed from: d  reason: collision with root package name */
        int f39918d;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39917c = obj;
            this.f39918d |= Integer.MIN_VALUE;
            return j.e(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {757}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d2.c0 f39920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0<d2.u> f39921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l0<d2.u> f39922d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {760, 777}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

            /* renamed from: b  reason: collision with root package name */
            Object f39923b;

            /* renamed from: c  reason: collision with root package name */
            int f39924c;

            /* renamed from: d  reason: collision with root package name */
            int f39925d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f39926e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ l0<d2.u> f39927f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ l0<d2.u> f39928g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0<d2.u> l0Var, l0<d2.u> l0Var2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39927f = l0Var;
                this.f39928g = l0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f39927f, this.f39928g, dVar);
                aVar.f39926e = obj;
                return aVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00ea A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x007a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00b4 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v10, types: [T, d2.u] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:44:0x00cb). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 362
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: n0.j.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d2.c0 c0Var, l0<d2.u> l0Var, l0<d2.u> l0Var2, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f39920b = c0Var;
            this.f39921c = l0Var;
            this.f39922d = l0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f39920b, this.f39921c, this.f39922d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39919a;
            if (i11 == 0) {
                vz.r.b(obj);
                d2.c0 c0Var = this.f39920b;
                a aVar = new a(this.f39921c, this.f39922d, null);
                this.f39919a = 1;
                if (c0Var.E(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {106, 135}, m = "awaitPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39929a;

        /* renamed from: b  reason: collision with root package name */
        Object f39930b;

        /* renamed from: c  reason: collision with root package name */
        Object f39931c;

        /* renamed from: d  reason: collision with root package name */
        Object f39932d;

        /* renamed from: e  reason: collision with root package name */
        long f39933e;

        /* renamed from: f  reason: collision with root package name */
        float f39934f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f39935g;

        /* renamed from: h  reason: collision with root package name */
        int f39936h;

        e(zz.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39935g = obj;
            this.f39936h |= Integer.MIN_VALUE;
            return j.f(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {831, 869}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39937a;

        /* renamed from: b  reason: collision with root package name */
        Object f39938b;

        /* renamed from: c  reason: collision with root package name */
        Object f39939c;

        /* renamed from: d  reason: collision with root package name */
        Object f39940d;

        /* renamed from: e  reason: collision with root package name */
        float f39941e;

        /* renamed from: f  reason: collision with root package name */
        float f39942f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f39943g;

        /* renamed from: h  reason: collision with root package name */
        int f39944h;

        f(zz.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39943g = obj;
            this.f39944h |= Integer.MIN_VALUE;
            return j.g(null, 0L, 0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {227}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39945a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39947c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39948d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f39949e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f39950f;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {228, 232, 244}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

            /* renamed from: b  reason: collision with root package name */
            Object f39951b;

            /* renamed from: c  reason: collision with root package name */
            Object f39952c;

            /* renamed from: d  reason: collision with root package name */
            int f39953d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f39954e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.l<s1.f, vz.b0> f39955f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39956g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f39957h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f39958i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: n0.j$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0775a extends kotlin.jvm.internal.u implements h00.p<d2.u, s1.f, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k0 f39959a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0775a(k0 k0Var) {
                    super(2);
                    this.f39959a = k0Var;
                }

                public final void a(d2.u change, long j11) {
                    kotlin.jvm.internal.s.g(change, "change");
                    d2.n.g(change);
                    this.f39959a.f34914a = j11;
                }

                @Override // h00.p
                public /* bridge */ /* synthetic */ vz.b0 invoke(d2.u uVar, s1.f fVar) {
                    a(uVar, fVar.t());
                    return vz.b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static final class b extends kotlin.jvm.internal.u implements h00.l<d2.u, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39960a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(h00.p<? super d2.u, ? super s1.f, vz.b0> pVar) {
                    super(1);
                    this.f39960a = pVar;
                }

                public final void a(d2.u it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    this.f39960a.invoke(it2, s1.f.d(d2.n.j(it2)));
                    d2.n.g(it2);
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ vz.b0 invoke(d2.u uVar) {
                    a(uVar);
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h00.l<? super s1.f, vz.b0> lVar, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39955f = lVar;
                this.f39956g = pVar;
                this.f39957h = aVar;
                this.f39958i = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f39955f, this.f39956g, this.f39957h, this.f39958i, dVar);
                aVar.f39954e = obj;
                return aVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:20:0x0081). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 217
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: n0.j.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(h00.l<? super s1.f, vz.b0> lVar, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, zz.d<? super g> dVar) {
            super(2, dVar);
            this.f39947c = lVar;
            this.f39948d = pVar;
            this.f39949e = aVar;
            this.f39950f = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            g gVar = new g(this.f39947c, this.f39948d, this.f39949e, this.f39950f, dVar);
            gVar.f39946b = obj;
            return gVar;
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((g) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39945a;
            if (i11 == 0) {
                vz.r.b(obj);
                a aVar = new a(this.f39947c, this.f39948d, this.f39949e, this.f39950f, null);
                this.f39945a = 1;
                if (((d2.c0) this.f39946b).E(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {279, 283, 287}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39961a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f39963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f39964d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f39965e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39966f;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {289}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

            /* renamed from: b  reason: collision with root package name */
            int f39967b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f39968c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d2.u f39969d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f39970e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.a<vz.b0> f39971f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39972g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: n0.j$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0776a extends kotlin.jvm.internal.u implements h00.l<d2.u, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h00.p<d2.u, s1.f, vz.b0> f39973a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0776a(h00.p<? super d2.u, ? super s1.f, vz.b0> pVar) {
                    super(1);
                    this.f39973a = pVar;
                }

                public final void a(d2.u it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    this.f39973a.invoke(it2, s1.f.d(d2.n.j(it2)));
                    d2.n.g(it2);
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ vz.b0 invoke(d2.u uVar) {
                    a(uVar);
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d2.u uVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39969d = uVar;
                this.f39970e = aVar;
                this.f39971f = aVar2;
                this.f39972g = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f39969d, this.f39970e, this.f39971f, this.f39972g, dVar);
                aVar.f39968c = obj;
                return aVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d2.c cVar;
                d11 = a00.d.d();
                int i11 = this.f39967b;
                if (i11 == 0) {
                    vz.r.b(obj);
                    d2.c cVar2 = (d2.c) this.f39968c;
                    long g11 = this.f39969d.g();
                    C0776a c0776a = new C0776a(this.f39972g);
                    this.f39968c = cVar2;
                    this.f39967b = 1;
                    Object j11 = j.j(cVar2, g11, c0776a, this);
                    if (j11 == d11) {
                        return d11;
                    }
                    cVar = cVar2;
                    obj = j11;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cVar = (d2.c) this.f39968c;
                    vz.r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    List<d2.u> b11 = cVar.R().b();
                    int i12 = 0;
                    int size = b11.size();
                    while (i12 < size) {
                        int i13 = i12 + 1;
                        d2.u uVar = b11.get(i12);
                        if (d2.n.c(uVar)) {
                            d2.n.f(uVar);
                        }
                        i12 = i13;
                    }
                    this.f39970e.invoke();
                } else {
                    this.f39971f.invoke();
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {280}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super d2.u>, Object> {

            /* renamed from: b  reason: collision with root package name */
            int f39974b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f39975c;

            b(zz.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f39975c = obj;
                return bVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(d2.c cVar, zz.d<? super d2.u> dVar) {
                return ((b) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39974b;
                if (i11 == 0) {
                    vz.r.b(obj);
                    this.f39974b = 1;
                    obj = i0.d((d2.c) this.f39975c, false, this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(h00.l<? super s1.f, vz.b0> lVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, zz.d<? super h> dVar) {
            super(2, dVar);
            this.f39963c = lVar;
            this.f39964d = aVar;
            this.f39965e = aVar2;
            this.f39966f = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            h hVar = new h(this.f39963c, this.f39964d, this.f39965e, this.f39966f, dVar);
            hVar.f39962b = obj;
            return hVar;
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((h) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0025, B:25:0x0058, B:27:0x005d, B:22:0x004d), top: B:34:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r11.f39961a
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                vz.r.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L82
            L17:
                r12 = move-exception
                goto L85
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.f39962b
                d2.c0 r1 = (d2.c0) r1
                vz.r.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L58
            L29:
                java.lang.Object r1 = r11.f39962b
                d2.c0 r1 = (d2.c0) r1
                vz.r.b(r12)
                goto L4b
            L31:
                vz.r.b(r12)
                java.lang.Object r12 = r11.f39962b
                d2.c0 r12 = (d2.c0) r12
                n0.j$h$b r1 = new n0.j$h$b
                r1.<init>(r2)
                r11.f39962b = r12
                r11.f39961a = r5
                java.lang.Object r1 = r12.E(r1, r11)
                if (r1 != r0) goto L48
                return r0
            L48:
                r10 = r1
                r1 = r12
                r12 = r10
            L4b:
                d2.u r12 = (d2.u) r12
                r11.f39962b = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f39961a = r4     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = n0.j.a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L58
                return r0
            L58:
                r5 = r12
                d2.u r5 = (d2.u) r5     // Catch: java.util.concurrent.CancellationException -> L17
                if (r5 == 0) goto L82
                h00.l<s1.f, vz.b0> r12 = r11.f39963c     // Catch: java.util.concurrent.CancellationException -> L17
                long r6 = r5.h()     // Catch: java.util.concurrent.CancellationException -> L17
                s1.f r4 = s1.f.d(r6)     // Catch: java.util.concurrent.CancellationException -> L17
                r12.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                n0.j$h$a r12 = new n0.j$h$a     // Catch: java.util.concurrent.CancellationException -> L17
                h00.a<vz.b0> r6 = r11.f39965e     // Catch: java.util.concurrent.CancellationException -> L17
                h00.a<vz.b0> r7 = r11.f39964d     // Catch: java.util.concurrent.CancellationException -> L17
                h00.p<d2.u, s1.f, vz.b0> r8 = r11.f39966f     // Catch: java.util.concurrent.CancellationException -> L17
                r9 = 0
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f39962b = r2     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f39961a = r3     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = r1.E(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L82
                return r0
            L82:
                vz.b0 r12 = vz.b0.f54756a
                return r12
            L85:
                h00.a<vz.b0> r0 = r11.f39964d
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.j.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, m = "drag-jO51t88")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39976a;

        /* renamed from: b  reason: collision with root package name */
        Object f39977b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39978c;

        /* renamed from: d  reason: collision with root package name */
        int f39979d;

        i(zz.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39978c = obj;
            this.f39979d |= Integer.MIN_VALUE;
            return j.j(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {831}, m = "horizontalDrag-jO51t88")
    /* renamed from: n0.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0777j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39980a;

        /* renamed from: b  reason: collision with root package name */
        Object f39981b;

        /* renamed from: c  reason: collision with root package name */
        Object f39982c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f39983d;

        /* renamed from: e  reason: collision with root package name */
        int f39984e;

        C0777j(zz.d<? super C0777j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39983d = obj;
            this.f39984e |= Integer.MIN_VALUE;
            return j.k(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {831}, m = "verticalDrag-jO51t88")
    /* loaded from: classes.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39985a;

        /* renamed from: b  reason: collision with root package name */
        Object f39986b;

        /* renamed from: c  reason: collision with root package name */
        Object f39987c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f39988d;

        /* renamed from: e  reason: collision with root package name */
        int f39989e;

        k(zz.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39988d = obj;
            this.f39989e |= Integer.MIN_VALUE;
            return j.n(null, 0L, null, this);
        }
    }

    static {
        float f11 = x2.g.f((float) 0.125d);
        f39900a = f11;
        float f12 = x2.g.f(18);
        f39901b = f12;
        f39902c = f11 / f12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        if (d2.n.n(r10) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(d2.c r17, long r18, zz.d<? super d2.u> r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.c(d2.c, long, zz.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
        if (d2.n.k(r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:56:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0161 -> B:53:0x0164). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0187 -> B:56:0x016c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(d2.c r20, long r21, int r23, h00.p<? super d2.u, ? super java.lang.Float, vz.b0> r24, zz.d<? super d2.u> r25) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.d(d2.c, long, int, h00.p, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.lang.Object, d2.u] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [d2.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(d2.c0 r8, d2.u r9, zz.d<? super d2.u> r10) {
        /*
            boolean r0 = r10 instanceof n0.j.c
            if (r0 == 0) goto L13
            r0 = r10
            n0.j$c r0 = (n0.j.c) r0
            int r1 = r0.f39918d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39918d = r1
            goto L18
        L13:
            n0.j$c r0 = new n0.j$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f39917c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f39918d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f39916b
            kotlin.jvm.internal.l0 r8 = (kotlin.jvm.internal.l0) r8
            java.lang.Object r9 = r0.f39915a
            d2.u r9 = (d2.u) r9
            vz.r.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            goto L6d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            vz.r.b(r10)
            kotlin.jvm.internal.l0 r10 = new kotlin.jvm.internal.l0
            r10.<init>()
            kotlin.jvm.internal.l0 r2 = new kotlin.jvm.internal.l0
            r2.<init>()
            r2.f34916a = r9
            androidx.compose.ui.platform.y1 r5 = r8.getViewConfiguration()
            long r5 = r5.c()
            n0.j$d r7 = new n0.j$d     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f39915a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f39916b = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f39918d = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            java.lang.Object r8 = v20.e3.c(r5, r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            if (r8 != r1) goto L6d
            return r1
        L63:
            r8 = r10
        L64:
            T r8 = r8.f34916a
            d2.u r8 = (d2.u) r8
            if (r8 != 0) goto L6c
            r3 = r9
            goto L6d
        L6c:
            r3 = r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.e(d2.c0, d2.u, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0118 -> B:65:0x0182). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0172 -> B:61:0x0179). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(d2.c r19, long r20, int r22, h00.p<? super d2.u, ? super s1.f, vz.b0> r23, zz.d<? super d2.u> r24) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.f(d2.c, long, int, h00.p, zz.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
        if (d2.n.k(r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:56:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0161 -> B:53:0x0164). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0187 -> B:56:0x016c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(d2.c r20, long r21, int r23, h00.p<? super d2.u, ? super java.lang.Float, vz.b0> r24, zz.d<? super d2.u> r25) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.g(d2.c, long, int, h00.p, zz.d):java.lang.Object");
    }

    public static final Object h(d2.c0 c0Var, h00.l<? super s1.f, vz.b0> lVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object d12 = q.d(c0Var, new g(lVar, pVar, aVar2, aVar, null), dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : vz.b0.f54756a;
    }

    public static final Object i(d2.c0 c0Var, h00.l<? super s1.f, vz.b0> lVar, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, h00.p<? super d2.u, ? super s1.f, vz.b0> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object d12 = q.d(c0Var, new h(lVar, aVar2, aVar, pVar, null), dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : vz.b0.f54756a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(d2.c r4, long r5, h00.l<? super d2.u, vz.b0> r7, zz.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof n0.j.i
            if (r0 == 0) goto L13
            r0 = r8
            n0.j$i r0 = (n0.j.i) r0
            int r1 = r0.f39979d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39979d = r1
            goto L18
        L13:
            n0.j$i r0 = new n0.j$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39978c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f39979d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f39977b
            h00.l r4 = (h00.l) r4
            java.lang.Object r5 = r0.f39976a
            d2.c r5 = (d2.c) r5
            vz.r.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            vz.r.b(r8)
        L3e:
            r0.f39976a = r4
            r0.f39977b = r7
            r0.f39979d = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            d2.u r8 = (d2.u) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = d2.n.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.g()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.j(d2.c, long, h00.l, zz.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if ((!(s1.f.l(d2.n.l(r11)) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED)) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(d2.c r18, long r19, h00.l<? super d2.u, vz.b0> r21, zz.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.k(d2.c, long, h00.l, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(d2.m mVar, long j11) {
        d2.u uVar;
        List<d2.u> b11 = mVar.b();
        int size = b11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                uVar = null;
                break;
            }
            int i12 = i11 + 1;
            uVar = b11.get(i11);
            if (d2.t.d(uVar.g(), j11)) {
                break;
            }
            i11 = i12;
        }
        d2.u uVar2 = uVar;
        if (uVar2 != null && uVar2.i()) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float m(y1 pointerSlop, int i11) {
        kotlin.jvm.internal.s.g(pointerSlop, "$this$pointerSlop");
        return d2.e0.g(i11, d2.e0.f23301a.b()) ? pointerSlop.e() * f39902c : pointerSlop.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if ((!(s1.f.m(d2.n.l(r11)) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED)) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(d2.c r18, long r19, h00.l<? super d2.u, vz.b0> r21, zz.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.n(d2.c, long, h00.l, zz.d):java.lang.Object");
    }
}