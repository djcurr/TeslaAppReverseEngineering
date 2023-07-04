package net.time4j.history;

import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i extends net.time4j.engine.e<h> {
    private static final long serialVersionUID = -5386613740709845550L;
    private final d history;

    /* loaded from: classes5.dex */
    private static class a<C extends q<C>> implements y<C, h> {

        /* renamed from: a  reason: collision with root package name */
        private final d f41403a;

        a(d dVar) {
            this.f41403a = dVar;
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public h getMaximum(C c11) {
            d dVar = this.f41403a;
            if (dVar == d.f41366w) {
                return h.f(j.BYZANTINE, 999984973, 8, 31);
            }
            if (dVar == d.f41365t) {
                return h.f(j.AD, 999979465, 12, 31);
            }
            if (dVar == d.f41364q) {
                return h.f(j.AD, 999999999, 12, 31);
            }
            return h.f(j.AD, 9999, 12, 31);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public h getMinimum(C c11) {
            d dVar = this.f41403a;
            if (dVar == d.f41366w) {
                return h.f(j.BYZANTINE, 0, 9, 1);
            }
            if (dVar == d.f41365t) {
                return h.f(j.BC, 999979466, 1, 1);
            }
            if (dVar == d.f41364q) {
                return h.f(j.BC, Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 1, 1);
            }
            return h.f(j.BC, 45, 1, 1);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public h getValue(C c11) {
            try {
                return this.f41403a.e((g0) c11.l(g0.f41293o));
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(C c11, h hVar) {
            return this.f41403a.B(hVar);
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public C withValue(C c11, h hVar, boolean z11) {
            if (hVar != null) {
                return (C) c11.z(g0.f41293o, this.f41403a.d(hVar));
            }
            throw new IllegalArgumentException("Missing historic date.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(d dVar) {
        super("HISTORIC_DATE");
        this.history = dVar;
    }

    private Object readResolve() {
        return this.history.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.e
    public <T extends q<T>> y<T, h> f(w<T> wVar) {
        if (wVar.v(g0.f41293o)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e
    protected boolean g(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((i) eVar).history);
    }

    @Override // net.time4j.engine.p
    public Class<h> getType() {
        return h.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    /* renamed from: o */
    public h getDefaultMaximum() {
        return h.f(j.AD, 9999, 12, 31);
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public h getDefaultMinimum() {
        return h.f(j.BC, 45, 1, 1);
    }
}