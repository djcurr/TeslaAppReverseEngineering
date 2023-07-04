package androidx.compose.ui.platform;

import o1.f;

/* loaded from: classes.dex */
public final class w0 extends z0 implements f.c {

    /* renamed from: b  reason: collision with root package name */
    private final a f3134b;

    /* loaded from: classes.dex */
    public final class a implements f.c {
        public a(w0 this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
        }

        @Override // o1.f
        public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
            return (R) f.c.a.b(this, r11, pVar);
        }

        @Override // o1.f
        public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
            return (R) f.c.a.c(this, r11, pVar);
        }

        @Override // o1.f
        public o1.f g0(o1.f fVar) {
            return f.c.a.d(this, fVar);
        }

        @Override // o1.f
        public boolean p(h00.l<? super f.c, Boolean> lVar) {
            return f.c.a.a(this, lVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f3134b = new a(this);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) f.c.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) f.c.a.c(this, r11, pVar);
    }

    public final a b() {
        return this.f3134b;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return f.c.a.d(this, fVar);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return f.c.a.a(this, lVar);
    }
}