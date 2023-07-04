package androidx.room;

import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.g;

/* loaded from: classes.dex */
public final class a1 implements g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5739b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final zz.e f5740a;

    /* loaded from: classes.dex */
    public static final class a implements g.c<a1> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final zz.e b() {
        return this.f5740a;
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<a1> getKey() {
        return f5739b;
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return g.b.a.d(this, gVar);
    }
}