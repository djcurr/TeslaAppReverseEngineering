package io.sentry;

import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class z2 {

    /* renamed from: d */
    private static final Charset f32730d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final a3 f32731a;

    /* renamed from: b */
    private final Callable<byte[]> f32732b;

    /* renamed from: c */
    private byte[] f32733c;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private byte[] f32734a;

        /* renamed from: b */
        private final Callable<byte[]> f32735b;

        public a(Callable<byte[]> callable) {
            this.f32735b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable<byte[]> callable;
            if (this.f32734a == null && (callable = this.f32735b) != null) {
                this.f32734a = callable.call();
            }
            return b(this.f32734a);
        }
    }

    public z2(a3 a3Var, byte[] bArr) {
        this.f32731a = (a3) rz.j.a(a3Var, "SentryEnvelopeItemHeader is required.");
        this.f32733c = bArr;
        this.f32732b = null;
    }

    public static /* synthetic */ byte[] A(h0 h0Var, mz.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f32730d));
            h0Var.a(bVar, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ Integer B(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] D(h0 h0Var, d2 d2Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f32730d));
            h0Var.a(d2Var, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ Integer E(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] G(File file, long j11, q1 q1Var, h0 h0Var) {
        if (file.exists()) {
            q1Var.A(sz.a.c(M(file.getPath(), j11), 3));
            q1Var.z();
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f32730d));
                        h0Var.a(q1Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e11.getMessage()));
                }
            } finally {
                file.delete();
            }
        }
        throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
    }

    public static /* synthetic */ Integer H(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] J(h0 h0Var, q3 q3Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f32730d));
            h0Var.a(q3Var, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ Integer K(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    private static byte[] M(String str, long j11) {
        try {
            File file = new File(str);
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.length() <= j11) {
                        FileInputStream fileInputStream = new FileInputStream(str);
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bufferedInputStream.close();
                                    fileInputStream.close();
                                    return byteArray;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } else {
                        throw new SentryEnvelopeException(String.format("Dropping item, because its size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j11)));
                    }
                } else {
                    throw new SentryEnvelopeException(String.format("Reading the item %s failed, because can't read the file.", str));
                }
            } else {
                throw new SentryEnvelopeException(String.format("Reading the item %s failed, because the file located at the path is not a file.", str));
            }
        } catch (IOException | SecurityException e11) {
            throw new SentryEnvelopeException(String.format("Reading the item %s failed.\n%s", str, e11.getMessage()));
        }
    }

    public static z2 p(final b bVar, final long j11) {
        final a aVar = new a(new Callable() { // from class: io.sentry.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] z11;
                z11 = z2.z(bVar, j11);
                return z11;
            }
        });
        return new z2(new a3(e3.Attachment, new Callable() { // from class: io.sentry.v2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer x11;
                x11 = z2.x(aVar);
                return x11;
            }
        }, bVar.d(), bVar.e(), bVar.b()), new Callable() { // from class: io.sentry.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a11;
                a11 = aVar.a();
                return a11;
            }
        });
    }

    public static z2 q(final h0 h0Var, final mz.b bVar) {
        rz.j.a(h0Var, "ISerializer is required.");
        rz.j.a(bVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] A;
                A = z2.A(h0.this, bVar);
                return A;
            }
        });
        return new z2(new a3(e3.resolve(bVar), new Callable() { // from class: io.sentry.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer B;
                B = z2.B(aVar);
                return B;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a11;
                a11 = aVar.a();
                return a11;
            }
        });
    }

    public static z2 r(final h0 h0Var, final d2 d2Var) {
        rz.j.a(h0Var, "ISerializer is required.");
        rz.j.a(d2Var, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] D;
                D = z2.D(h0.this, d2Var);
                return D;
            }
        });
        return new z2(new a3(e3.resolve(d2Var), new Callable() { // from class: io.sentry.n2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer E;
                E = z2.E(aVar);
                return E;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.l2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a11;
                a11 = aVar.a();
                return a11;
            }
        });
    }

    public static z2 s(final q1 q1Var, final long j11, final h0 h0Var) {
        final File w11 = q1Var.w();
        final a aVar = new a(new Callable() { // from class: io.sentry.p2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] G;
                G = z2.G(w11, j11, q1Var, h0Var);
                return G;
            }
        });
        return new z2(new a3(e3.Profile, new Callable() { // from class: io.sentry.y2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer H;
                H = z2.H(aVar);
                return H;
            }
        }, "application-json", w11.getName()), new Callable() { // from class: io.sentry.u2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a11;
                a11 = aVar.a();
                return a11;
            }
        });
    }

    public static z2 t(final h0 h0Var, final q3 q3Var) {
        rz.j.a(h0Var, "ISerializer is required.");
        rz.j.a(q3Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.r2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] J;
                J = z2.J(h0.this, q3Var);
                return J;
            }
        });
        return new z2(new a3(e3.Session, new Callable() { // from class: io.sentry.o2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer K;
                K = z2.K(aVar);
                return K;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.m2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a11;
                a11 = aVar.a();
                return a11;
            }
        });
    }

    public static /* synthetic */ Integer x(a aVar) {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] z(b bVar, long j11) {
        if (bVar.c() != null) {
            if (bVar.c().length <= j11) {
                return bVar.c();
            }
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", bVar.e(), Integer.valueOf(bVar.c().length), Long.valueOf(j11)));
        } else if (bVar.f() != null) {
            return M(bVar.f(), j11);
        } else {
            throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes or a path is set.", bVar.e()));
        }
    }

    public mz.b u(h0 h0Var) {
        a3 a3Var = this.f32731a;
        if (a3Var == null || a3Var.b() != e3.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(v()), f32730d));
        try {
            mz.b bVar = (mz.b) h0Var.c(bufferedReader, mz.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public byte[] v() {
        Callable<byte[]> callable;
        if (this.f32733c == null && (callable = this.f32732b) != null) {
            this.f32733c = callable.call();
        }
        return this.f32733c;
    }

    public a3 w() {
        return this.f32731a;
    }

    z2(a3 a3Var, Callable<byte[]> callable) {
        this.f32731a = (a3) rz.j.a(a3Var, "SentryEnvelopeItemHeader is required.");
        this.f32732b = (Callable) rz.j.a(callable, "DataFactory is required.");
        this.f32733c = null;
    }
}