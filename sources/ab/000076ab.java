package io.grpc.internal;

import io.grpc.c0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: e  reason: collision with root package name */
    static final Logger f31096e = Logger.getLogger(io.grpc.f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Object f31097a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.g0 f31098b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<io.grpc.c0> f31099c;

    /* renamed from: d  reason: collision with root package name */
    private int f31100d;

    /* loaded from: classes5.dex */
    class a extends ArrayDeque<io.grpc.c0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31101a;

        a(int i11) {
            this.f31101a = i11;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: b */
        public boolean add(io.grpc.c0 c0Var) {
            if (size() == this.f31101a) {
                removeFirst();
            }
            o.a(o.this);
            return super.add(c0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31103a;

        static {
            int[] iArr = new int[c0.b.values().length];
            f31103a = iArr;
            try {
                iArr[c0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31103a[c0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(io.grpc.g0 g0Var, int i11, long j11, String str) {
        com.google.common.base.u.p(str, "description");
        this.f31098b = (io.grpc.g0) com.google.common.base.u.p(g0Var, "logId");
        if (i11 > 0) {
            this.f31099c = new a(i11);
        } else {
            this.f31099c = null;
        }
        c0.a aVar = new c0.a();
        e(aVar.b(str + " created").c(c0.b.CT_INFO).e(j11).a());
    }

    static /* synthetic */ int a(o oVar) {
        int i11 = oVar.f31100d;
        oVar.f31100d = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(io.grpc.g0 g0Var, Level level, String str) {
        Logger logger = f31096e;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + g0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.grpc.g0 b() {
        return this.f31098b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        boolean z11;
        synchronized (this.f31097a) {
            z11 = this.f31099c != null;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(io.grpc.c0 c0Var) {
        Level level;
        int i11 = b.f31103a[c0Var.f30534b.ordinal()];
        if (i11 == 1) {
            level = Level.FINE;
        } else if (i11 != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        f(c0Var);
        d(this.f31098b, level, c0Var.f30533a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(io.grpc.c0 c0Var) {
        synchronized (this.f31097a) {
            Collection<io.grpc.c0> collection = this.f31099c;
            if (collection != null) {
                collection.add(c0Var);
            }
        }
    }
}