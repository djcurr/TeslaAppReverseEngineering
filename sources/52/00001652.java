package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import hf.i;
import java.util.concurrent.ExecutorService;
import kd.h;
import md.n;
import md.o;
import nf.j;

@md.d
/* loaded from: classes3.dex */
public class AnimatedFactoryV2Impl implements cf.a {

    /* renamed from: a  reason: collision with root package name */
    private final gf.f f11108a;

    /* renamed from: b  reason: collision with root package name */
    private final jf.f f11109b;

    /* renamed from: c  reason: collision with root package name */
    private final i<gd.d, nf.c> f11110c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11111d;

    /* renamed from: e  reason: collision with root package name */
    private cf.d f11112e;

    /* renamed from: f  reason: collision with root package name */
    private df.b f11113f;

    /* renamed from: g  reason: collision with root package name */
    private ef.a f11114g;

    /* renamed from: h  reason: collision with root package name */
    private mf.a f11115h;

    /* renamed from: i  reason: collision with root package name */
    private kd.f f11116i;

    /* loaded from: classes3.dex */
    class a implements lf.b {
        a() {
        }

        @Override // lf.b
        public nf.c a(nf.e eVar, int i11, j jVar, p001if.b bVar) {
            return AnimatedFactoryV2Impl.this.k().a(eVar, bVar, bVar.f30368h);
        }
    }

    /* loaded from: classes3.dex */
    class b implements lf.b {
        b() {
        }

        @Override // lf.b
        public nf.c a(nf.e eVar, int i11, j jVar, p001if.b bVar) {
            return AnimatedFactoryV2Impl.this.k().b(eVar, bVar, bVar.f30368h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements n<Integer> {
        c(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // md.n
        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements n<Integer> {
        d(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // md.n
        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements df.b {
        e() {
        }

        @Override // df.b
        public bf.a a(bf.e eVar, Rect rect) {
            return new df.a(AnimatedFactoryV2Impl.this.j(), eVar, rect, AnimatedFactoryV2Impl.this.f11111d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements df.b {
        f() {
        }

        @Override // df.b
        public bf.a a(bf.e eVar, Rect rect) {
            return new df.a(AnimatedFactoryV2Impl.this.j(), eVar, rect, AnimatedFactoryV2Impl.this.f11111d);
        }
    }

    @md.d
    public AnimatedFactoryV2Impl(gf.f fVar, jf.f fVar2, i<gd.d, nf.c> iVar, boolean z11, kd.f fVar3) {
        this.f11108a = fVar;
        this.f11109b = fVar2;
        this.f11110c = iVar;
        this.f11111d = z11;
        this.f11116i = fVar3;
    }

    private cf.d g() {
        return new cf.e(new f(), this.f11108a);
    }

    private ue.a h() {
        c cVar = new c(this);
        ExecutorService executorService = this.f11116i;
        if (executorService == null) {
            executorService = new kd.c(this.f11109b.d());
        }
        d dVar = new d(this);
        n<Boolean> nVar = o.f38489a;
        return new ue.a(i(), h.g(), executorService, RealtimeSinceBootClock.get(), this.f11108a, this.f11110c, cVar, dVar, nVar);
    }

    private df.b i() {
        if (this.f11113f == null) {
            this.f11113f = new e();
        }
        return this.f11113f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ef.a j() {
        if (this.f11114g == null) {
            this.f11114g = new ef.a();
        }
        return this.f11114g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cf.d k() {
        if (this.f11112e == null) {
            this.f11112e = g();
        }
        return this.f11112e;
    }

    @Override // cf.a
    public mf.a a(Context context) {
        if (this.f11115h == null) {
            this.f11115h = h();
        }
        return this.f11115h;
    }

    @Override // cf.a
    public lf.b b() {
        return new b();
    }

    @Override // cf.a
    public lf.b c() {
        return new a();
    }
}