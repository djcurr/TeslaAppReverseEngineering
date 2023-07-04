package io.sentry;

import ch.qos.logback.classic.net.SyslogAppender;
import io.sentry.a3;
import io.sentry.b3;
import io.sentry.c;
import io.sentry.e3;
import io.sentry.f3;
import io.sentry.i4;
import io.sentry.j2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.c;
import io.sentry.protocol.d;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.g;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.q1;
import io.sentry.q3;
import io.sentry.u3;
import io.sentry.w3;
import io.sentry.x3;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import mz.b;

/* loaded from: classes5.dex */
public final class y0 implements h0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f32711c = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32712a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, n0<?>> f32713b;

    public y0(g3 g3Var) {
        this.f32712a = g3Var;
        HashMap hashMap = new HashMap();
        this.f32713b = hashMap;
        hashMap.put(io.sentry.protocol.a.class, new a.C0598a());
        hashMap.put(c.class, new c.a());
        hashMap.put(io.sentry.protocol.b.class, new b.a());
        hashMap.put(io.sentry.protocol.c.class, new c.a());
        hashMap.put(DebugImage.class, new DebugImage.a());
        hashMap.put(io.sentry.protocol.d.class, new d.a());
        hashMap.put(io.sentry.protocol.e.class, new e.a());
        hashMap.put(e.b.class, new e.b.a());
        hashMap.put(io.sentry.protocol.f.class, new f.a());
        hashMap.put(io.sentry.protocol.g.class, new g.a());
        hashMap.put(io.sentry.protocol.h.class, new h.a());
        hashMap.put(io.sentry.protocol.i.class, new i.a());
        hashMap.put(io.sentry.protocol.j.class, new j.a());
        hashMap.put(q1.class, new q1.b());
        hashMap.put(io.sentry.protocol.k.class, new k.a());
        hashMap.put(io.sentry.protocol.l.class, new l.a());
        hashMap.put(io.sentry.protocol.m.class, new m.a());
        hashMap.put(j2.class, new j2.a());
        hashMap.put(a3.class, new a3.a());
        hashMap.put(b3.class, new b3.a());
        hashMap.put(io.sentry.protocol.n.class, new n.a());
        hashMap.put(e3.class, new e3.a());
        hashMap.put(f3.class, new f3.a());
        hashMap.put(io.sentry.protocol.p.class, new p.a());
        hashMap.put(io.sentry.protocol.q.class, new q.a());
        hashMap.put(io.sentry.protocol.r.class, new r.a());
        hashMap.put(io.sentry.protocol.s.class, new s.a());
        hashMap.put(io.sentry.protocol.t.class, new t.a());
        hashMap.put(io.sentry.protocol.u.class, new u.a());
        hashMap.put(io.sentry.protocol.v.class, new v.a());
        hashMap.put(q3.class, new q3.a());
        hashMap.put(u3.class, new u3.a());
        hashMap.put(w3.class, new w3.a());
        hashMap.put(x3.class, new x3.a());
        hashMap.put(io.sentry.protocol.w.class, new w.a());
        hashMap.put(i4.class, new i4.a());
        hashMap.put(mz.b.class, new b.a());
    }

    private String f(Object obj, boolean z11) {
        StringWriter stringWriter = new StringWriter();
        v0 v0Var = new v0(stringWriter, this.f32712a.getMaxDepth());
        if (z11) {
            v0Var.p0(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        }
        v0Var.Q0(this.f32712a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.h0
    public <T> void a(T t11, Writer writer) {
        rz.j.a(t11, "The entity is required.");
        rz.j.a(writer, "The Writer object is required.");
        d0 logger = this.f32712a.getLogger();
        f3 f3Var = f3.DEBUG;
        if (logger.d(f3Var)) {
            this.f32712a.getLogger().c(f3Var, "Serializing object: %s", f(t11, true));
        }
        new v0(writer, this.f32712a.getMaxDepth()).Q0(this.f32712a.getLogger(), t11);
        writer.flush();
    }

    @Override // io.sentry.h0
    public void b(i2 i2Var, OutputStream outputStream) {
        rz.j.a(i2Var, "The SentryEnvelope object is required.");
        rz.j.a(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f32711c));
        try {
            i2Var.b().serialize(new v0(bufferedWriter, this.f32712a.getMaxDepth()), this.f32712a.getLogger());
            bufferedWriter.write("\n");
            for (z2 z2Var : i2Var.c()) {
                try {
                    byte[] v11 = z2Var.v();
                    z2Var.w().serialize(new v0(bufferedWriter, this.f32712a.getMaxDepth()), this.f32712a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(v11);
                    bufferedWriter.write("\n");
                } catch (Exception e11) {
                    this.f32712a.getLogger().b(f3.ERROR, "Failed to create envelope item. Dropping it.", e11);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.h0
    public <T> T c(Reader reader, Class<T> cls) {
        try {
            t0 t0Var = new t0(reader);
            n0<?> n0Var = this.f32713b.get(cls);
            if (n0Var != null) {
                return cls.cast(n0Var.a(t0Var, this.f32712a.getLogger()));
            }
            return null;
        } catch (Exception e11) {
            this.f32712a.getLogger().b(f3.ERROR, "Error when deserializing", e11);
            return null;
        }
    }

    @Override // io.sentry.h0
    public i2 d(InputStream inputStream) {
        rz.j.a(inputStream, "The InputStream object is required.");
        try {
            return this.f32712a.getEnvelopeReader().a(inputStream);
        } catch (IOException e11) {
            this.f32712a.getLogger().b(f3.ERROR, "Error deserializing envelope.", e11);
            return null;
        }
    }

    @Override // io.sentry.h0
    public String e(Map<String, Object> map) {
        return f(map, false);
    }
}