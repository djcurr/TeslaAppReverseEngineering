package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public class f0 extends e0 {
    public f0(n00.g gVar, String str, String str2) {
        super(f.NO_RECEIVER, ((h) gVar).d(), str, str2, !(gVar instanceof n00.d) ? 1 : 0);
    }

    @Override // n00.o
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public f0(Class cls, String str, String str2, int i11) {
        super(f.NO_RECEIVER, cls, str, str2, i11);
    }
}