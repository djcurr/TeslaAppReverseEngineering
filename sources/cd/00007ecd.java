package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private d f35024a;

    /* renamed from: b  reason: collision with root package name */
    private f f35025b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f35026c;

    /* renamed from: d  reason: collision with root package name */
    protected volatile o f35027d;

    protected void a(o oVar) {
        if (this.f35027d != null) {
            return;
        }
        synchronized (this) {
            if (this.f35027d != null) {
                return;
            }
            try {
                if (this.f35024a != null) {
                    this.f35027d = oVar.getParserForType().b(this.f35024a, this.f35025b);
                } else {
                    this.f35027d = oVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        if (this.f35026c) {
            return this.f35027d.getSerializedSize();
        }
        return this.f35024a.size();
    }

    public o c(o oVar) {
        a(oVar);
        return this.f35027d;
    }

    public o d(o oVar) {
        o oVar2 = this.f35027d;
        this.f35027d = oVar;
        this.f35024a = null;
        this.f35026c = true;
        return oVar2;
    }
}