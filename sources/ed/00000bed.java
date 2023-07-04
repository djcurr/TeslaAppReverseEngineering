package b2;

import android.view.KeyEvent;
import h00.l;
import h00.p;
import h2.v;
import kotlin.jvm.internal.s;
import o1.f;
import r1.z;

/* loaded from: classes.dex */
public final class e implements f.c {

    /* renamed from: a  reason: collision with root package name */
    private final l<b, Boolean> f7349a;

    /* renamed from: b  reason: collision with root package name */
    private final l<b, Boolean> f7350b;

    /* renamed from: c  reason: collision with root package name */
    public v f7351c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.f7349a = lVar;
        this.f7350b = lVar2;
    }

    @Override // o1.f
    public <R> R C(R r11, p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) f.c.a.b(this, r11, pVar);
    }

    public final v a() {
        v vVar = this.f7351c;
        if (vVar != null) {
            return vVar;
        }
        s.x("keyInputNode");
        return null;
    }

    @Override // o1.f
    public <R> R a0(R r11, p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) f.c.a.c(this, r11, pVar);
    }

    public final l<b, Boolean> b() {
        return this.f7349a;
    }

    public final l<b, Boolean> c() {
        return this.f7350b;
    }

    public final boolean d(KeyEvent keyEvent) {
        h2.s a11;
        s.g(keyEvent, "keyEvent");
        h2.s c12 = a().c1();
        v vVar = null;
        if (c12 != null && (a11 = z.a(c12)) != null) {
            vVar = a11.X0();
        }
        if (vVar != null) {
            if (vVar.k2(keyEvent)) {
                return true;
            }
            return vVar.j2(keyEvent);
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    public final void e(v vVar) {
        s.g(vVar, "<set-?>");
        this.f7351c = vVar;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return f.c.a.d(this, fVar);
    }

    @Override // o1.f
    public boolean p(l<? super f.c, Boolean> lVar) {
        return f.c.a.a(this, lVar);
    }
}