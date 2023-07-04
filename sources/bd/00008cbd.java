package nr;

import ch.qos.logback.core.CoreConstants;
import v20.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements n<vz.b0> {

    /* renamed from: b  reason: collision with root package name */
    private final long f41809b;

    /* renamed from: c  reason: collision with root package name */
    private final String f41810c;

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.TimerWorker$run$1", f = "Worker.kt", l = {333, 334}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super vz.b0>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41811a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f41812b;

        a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f41812b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super vz.b0> fVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f41811a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f41812b;
                long j11 = l.this.f41809b;
                this.f41812b = fVar;
                this.f41811a = 1;
                if (y0.b(j11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vz.r.b(obj);
                return vz.b0.f54756a;
            } else {
                fVar = (kotlinx.coroutines.flow.f) this.f41812b;
                vz.r.b(obj);
            }
            vz.b0 b0Var = vz.b0.f54756a;
            this.f41812b = null;
            this.f41811a = 2;
            if (fVar.emit(b0Var, this) == d11) {
                return d11;
            }
            return vz.b0.f54756a;
        }
    }

    public l(long j11, String key) {
        kotlin.jvm.internal.s.g(key, "key");
        this.f41809b = j11;
        this.f41810c = key;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof l) && kotlin.jvm.internal.s.c(((l) otherWorker).f41810c, this.f41810c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f41809b == lVar.f41809b && kotlin.jvm.internal.s.c(this.f41810c, lVar.f41810c);
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f41809b) * 31) + this.f41810c.hashCode();
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<vz.b0> run() {
        return kotlinx.coroutines.flow.g.v(new a(null));
    }

    public String toString() {
        return "TimerWorker(delayMs=" + this.f41809b + ", key=" + this.f41810c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}