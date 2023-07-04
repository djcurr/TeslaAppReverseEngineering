package y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final t1.q0 f58128a;

    /* renamed from: b  reason: collision with root package name */
    private final t1.t0 f58129b;

    /* renamed from: c  reason: collision with root package name */
    private final t1.q0 f58130c;

    public h() {
        this(null, null, null, 7, null);
    }

    public h(t1.q0 checkPath, t1.t0 pathMeasure, t1.q0 pathToDraw) {
        kotlin.jvm.internal.s.g(checkPath, "checkPath");
        kotlin.jvm.internal.s.g(pathMeasure, "pathMeasure");
        kotlin.jvm.internal.s.g(pathToDraw, "pathToDraw");
        this.f58128a = checkPath;
        this.f58129b = pathMeasure;
        this.f58130c = pathToDraw;
    }

    public final t1.q0 a() {
        return this.f58128a;
    }

    public final t1.t0 b() {
        return this.f58129b;
    }

    public final t1.q0 c() {
        return this.f58130c;
    }

    public /* synthetic */ h(t1.q0 q0Var, t1.t0 t0Var, t1.q0 q0Var2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.n.a() : q0Var, (i11 & 2) != 0 ? t1.m.a() : t0Var, (i11 & 4) != 0 ? t1.n.a() : q0Var2);
    }
}