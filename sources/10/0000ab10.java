package pn;

import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends com.google.gson.stream.b {

    /* renamed from: p  reason: collision with root package name */
    private static final Writer f46710p = new a();

    /* renamed from: q  reason: collision with root package name */
    private static final o f46711q = new o("closed");

    /* renamed from: m  reason: collision with root package name */
    private final List<com.google.gson.k> f46712m;

    /* renamed from: n  reason: collision with root package name */
    private String f46713n;

    /* renamed from: o  reason: collision with root package name */
    private com.google.gson.k f46714o;

    /* loaded from: classes2.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f46710p);
        this.f46712m = new ArrayList();
        this.f46714o = com.google.gson.l.f17206a;
    }

    private com.google.gson.k h1() {
        List<com.google.gson.k> list = this.f46712m;
        return list.get(list.size() - 1);
    }

    private void p1(com.google.gson.k kVar) {
        if (this.f46713n != null) {
            if (!kVar.i() || D()) {
                ((com.google.gson.m) h1()).m(this.f46713n, kVar);
            }
            this.f46713n = null;
        } else if (this.f46712m.isEmpty()) {
            this.f46714o = kVar;
        } else {
            com.google.gson.k h12 = h1();
            if (h12 instanceof com.google.gson.h) {
                ((com.google.gson.h) h12).m(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b C() {
        if (!this.f46712m.isEmpty() && this.f46713n == null) {
            if (h1() instanceof com.google.gson.m) {
                List<com.google.gson.k> list = this.f46712m;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b P0(long j11) {
        p1(new o(Long.valueOf(j11)));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b Q0(Boolean bool) {
        if (bool == null) {
            return n0();
        }
        p1(new o(bool));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b R0(Number number) {
        if (number == null) {
            return n0();
        }
        if (!L()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        p1(new o(number));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b S0(String str) {
        if (str == null) {
            return n0();
        }
        p1(new o(str));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b X0(boolean z11) {
        p1(new o(Boolean.valueOf(z11)));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b a0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f46712m.isEmpty() && this.f46713n == null) {
            if (h1() instanceof com.google.gson.m) {
                this.f46713n = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public com.google.gson.k b1() {
        if (this.f46712m.isEmpty()) {
            return this.f46714o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f46712m);
    }

    @Override // com.google.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46712m.isEmpty()) {
            this.f46712m.add(f46711q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.b, java.io.Flushable
    public void flush() {
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b j() {
        com.google.gson.h hVar = new com.google.gson.h();
        p1(hVar);
        this.f46712m.add(hVar);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b l() {
        com.google.gson.m mVar = new com.google.gson.m();
        p1(mVar);
        this.f46712m.add(mVar);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b n0() {
        p1(com.google.gson.l.f17206a);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b p() {
        if (!this.f46712m.isEmpty() && this.f46713n == null) {
            if (h1() instanceof com.google.gson.h) {
                List<com.google.gson.k> list = this.f46712m;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}