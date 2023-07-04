package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class k {
    public h b() {
        if (h()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m c() {
        if (j()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o d() {
        if (k()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        return this instanceof h;
    }

    public boolean i() {
        return this instanceof l;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.google.gson.stream.b bVar = new com.google.gson.stream.b(stringWriter);
            bVar.G0(true);
            on.l.b(this, bVar);
            return stringWriter.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}