package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private i f16244a;

    /* renamed from: b  reason: collision with root package name */
    private p f16245b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile q0 f16246c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f16247d;

    static {
        p.b();
    }

    protected void a(q0 q0Var) {
        if (this.f16246c != null) {
            return;
        }
        synchronized (this) {
            if (this.f16246c != null) {
                return;
            }
            try {
                if (this.f16244a != null) {
                    this.f16246c = q0Var.getParserForType().b(this.f16244a, this.f16245b);
                    this.f16247d = this.f16244a;
                } else {
                    this.f16246c = q0Var;
                    this.f16247d = i.f16278b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f16246c = q0Var;
                this.f16247d = i.f16278b;
            }
        }
    }

    public int b() {
        if (this.f16247d != null) {
            return this.f16247d.size();
        }
        i iVar = this.f16244a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f16246c != null) {
            return this.f16246c.getSerializedSize();
        }
        return 0;
    }

    public q0 c(q0 q0Var) {
        a(q0Var);
        return this.f16246c;
    }

    public q0 d(q0 q0Var) {
        q0 q0Var2 = this.f16246c;
        this.f16244a = null;
        this.f16247d = null;
        this.f16246c = q0Var;
        return q0Var2;
    }

    public i e() {
        if (this.f16247d != null) {
            return this.f16247d;
        }
        i iVar = this.f16244a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f16247d != null) {
                return this.f16247d;
            }
            if (this.f16246c == null) {
                this.f16247d = i.f16278b;
            } else {
                this.f16247d = this.f16246c.toByteString();
            }
            return this.f16247d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            q0 q0Var = this.f16246c;
            q0 q0Var2 = d0Var.f16246c;
            if (q0Var == null && q0Var2 == null) {
                return e().equals(d0Var.e());
            }
            if (q0Var == null || q0Var2 == null) {
                if (q0Var != null) {
                    return q0Var.equals(d0Var.c(q0Var.getDefaultInstanceForType()));
                }
                return c(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
            }
            return q0Var.equals(q0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}