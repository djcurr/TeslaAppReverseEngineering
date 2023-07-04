package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class a implements n, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i11, Class cls, String str, String str2, int i12) {
        this(i11, f.NO_RECEIVER, cls, str, str2, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && s.c(this.receiver, aVar.receiver) && s.c(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public n00.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? m0.c(cls) : m0.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return m0.k(this);
    }

    public a(int i11, Object obj, Class cls, String str, String str2, int i12) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i12 & 1) == 1;
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}