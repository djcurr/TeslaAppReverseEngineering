package c8;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8965a;

    /* renamed from: b  reason: collision with root package name */
    private final b8.m<PointF, PointF> f8966b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.m<PointF, PointF> f8967c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.b f8968d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8969e;

    public k(String str, b8.m<PointF, PointF> mVar, b8.m<PointF, PointF> mVar2, b8.b bVar, boolean z11) {
        this.f8965a = str;
        this.f8966b = mVar;
        this.f8967c = mVar2;
        this.f8968d = bVar;
        this.f8969e = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.o(aVar, bVar, this);
    }

    public b8.b b() {
        return this.f8968d;
    }

    public String c() {
        return this.f8965a;
    }

    public b8.m<PointF, PointF> d() {
        return this.f8966b;
    }

    public b8.m<PointF, PointF> e() {
        return this.f8967c;
    }

    public boolean f() {
        return this.f8969e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f8966b + ", size=" + this.f8967c + CoreConstants.CURLY_RIGHT;
    }
}