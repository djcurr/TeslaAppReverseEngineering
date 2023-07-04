package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import l0.l0;
import v1.e;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f54931a = x2.g.f(2);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1.s f54932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t0 f54933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.a0 f54934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.t f54935d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {49}, m = "invokeSuspend")
        /* renamed from: w0.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1242a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f54936a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l0.a<Float, l0.m> f54937b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1242a(l0.a<Float, l0.m> aVar, zz.d<? super C1242a> dVar) {
                super(2, dVar);
                this.f54937b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C1242a(this.f54937b, dVar);
            }

            @Override // h00.p
            public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C1242a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f54936a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    l0.a<Float, l0.m> aVar = this.f54937b;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(BitmapDescriptorFactory.HUE_RED);
                    l0.i a11 = f0.a();
                    this.f54936a = 1;
                    if (l0.a.f(aVar, b11, a11, null, null, this, 12, null) == d11) {
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
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l0.a<Float, l0.m> f54938a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ s2.t f54939b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ s2.a0 f54940c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ t0 f54941d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ t1.s f54942e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l0.a<Float, l0.m> aVar, s2.t tVar, s2.a0 a0Var, t0 t0Var, t1.s sVar) {
                super(1);
                this.f54938a = aVar;
                this.f54939b = tVar;
                this.f54940c = a0Var;
                this.f54941d = t0Var;
                this.f54942e = sVar;
            }

            public final void a(v1.c drawWithContent) {
                float l11;
                float h11;
                n2.w i11;
                kotlin.jvm.internal.s.g(drawWithContent, "$this$drawWithContent");
                drawWithContent.s0();
                l11 = m00.l.l(this.f54938a.o().floatValue(), BitmapDescriptorFactory.HUE_RED, 1.0f);
                if (l11 == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                int originalToTransformed = this.f54939b.originalToTransformed(n2.y.n(this.f54940c.g()));
                v0 g11 = this.f54941d.g();
                s1.h hVar = null;
                if (g11 != null && (i11 = g11.i()) != null) {
                    hVar = i11.d(originalToTransformed);
                }
                if (hVar == null) {
                    hVar = new s1.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float i02 = drawWithContent.i0(f0.d());
                float f11 = i02 / 2;
                h11 = m00.l.h(hVar.i() + f11, s1.l.i(drawWithContent.c()) - f11);
                e.b.e(drawWithContent, this.f54942e, s1.g.a(h11, hVar.l()), s1.g.a(h11, hVar.e()), i02, 0, null, l11, null, 0, 432, null);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t1.s sVar, t0 t0Var, s2.a0 a0Var, s2.t tVar) {
            super(3);
            this.f54932a = sVar;
            this.f54933b = t0Var;
            this.f54934c = a0Var;
            this.f54935d = tVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
            if ((((t1.e1) r13).b() == t1.a0.f51365b.f()) == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o1.f a(o1.f r11, c1.i r12, int r13) {
            /*
                r10 = this;
                java.lang.String r13 = "$this$composed"
                kotlin.jvm.internal.s.g(r11, r13)
                r13 = -1201392955(0xffffffffb86432c5, float:-5.440672E-5)
                r12.x(r13)
                r13 = -3687241(0xffffffffffc7bcb7, float:NaN)
                r12.x(r13)
                java.lang.Object r13 = r12.y()
                c1.i$a r0 = c1.i.f8486a
                java.lang.Object r0 = r0.a()
                r1 = 0
                if (r13 != r0) goto L29
                r13 = 1065353216(0x3f800000, float:1.0)
                r0 = 0
                r2 = 2
                l0.a r13 = l0.b.b(r13, r0, r2, r1)
                r12.p(r13)
            L29:
                r12.N()
                r3 = r13
                l0.a r3 = (l0.a) r3
                t1.s r13 = r10.f54932a
                boolean r0 = r13 instanceof t1.e1
                r2 = 0
                r4 = 1
                if (r0 == 0) goto L4c
                t1.e1 r13 = (t1.e1) r13
                long r5 = r13.b()
                t1.a0$a r13 = t1.a0.f51365b
                long r7 = r13.f()
                int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r13 != 0) goto L49
                r13 = r4
                goto L4a
            L49:
                r13 = r2
            L4a:
                if (r13 != 0) goto L4d
            L4c:
                r2 = r4
            L4d:
                w0.t0 r13 = r10.f54933b
                boolean r13 = r13.c()
                if (r13 == 0) goto L92
                s2.a0 r13 = r10.f54934c
                long r4 = r13.g()
                boolean r13 = n2.y.h(r4)
                if (r13 == 0) goto L92
                if (r2 == 0) goto L92
                t1.s r4 = r10.f54932a
                s2.a0 r13 = r10.f54934c
                n2.a r5 = r13.e()
                s2.a0 r13 = r10.f54934c
                long r6 = r13.g()
                n2.y r6 = n2.y.b(r6)
                w0.f0$a$a r7 = new w0.f0$a$a
                r7.<init>(r3, r1)
                r9 = 0
                r8 = r12
                c1.b0.f(r4, r5, r6, r7, r8, r9)
                w0.f0$a$b r13 = new w0.f0$a$b
                s2.t r4 = r10.f54935d
                s2.a0 r5 = r10.f54934c
                w0.t0 r6 = r10.f54933b
                t1.s r7 = r10.f54932a
                r2 = r13
                r2.<init>(r3, r4, r5, r6, r7)
                o1.f r11 = q1.i.c(r11, r13)
                goto L94
            L92:
                o1.f$a r11 = o1.f.f42062f1
            L94:
                r12.N()
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.f0.a.a(o1.f, c1.i, int):o1.f");
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<l0.b<Float>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54943a = new b();

        b() {
            super(1);
        }

        public final void a(l0.b<Float> keyframes) {
            kotlin.jvm.internal.s.g(keyframes, "$this$keyframes");
            keyframes.e(1000);
            Float valueOf = Float.valueOf(1.0f);
            keyframes.a(valueOf, 0);
            keyframes.a(valueOf, DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR);
            Float valueOf2 = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            keyframes.a(valueOf2, 500);
            keyframes.a(valueOf2, 999);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l0.b<Float> bVar) {
            a(bVar);
            return vz.b0.f54756a;
        }
    }

    public static final /* synthetic */ l0.i a() {
        return c();
    }

    public static final o1.f b(o1.f fVar, t0 state, s2.a0 value, s2.t offsetMapping, t1.s cursorBrush, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.s.g(cursorBrush, "cursorBrush");
        return z11 ? o1.e.b(fVar, null, new a(cursorBrush, state, value, offsetMapping), 1, null) : fVar;
    }

    private static final l0.i<Float> c() {
        return l0.j.d(l0.j.e(b.f54943a), null, 0L, 6, null);
    }

    public static final float d() {
        return f54931a;
    }
}