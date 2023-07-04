package r00;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes5.dex */
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f48968a = new j();

    private j() {
    }

    @Override // r00.d
    public List<Type> a() {
        List<Type> i11;
        i11 = w.i();
        return i11;
    }

    @Override // r00.d
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    public Void c() {
        return null;
    }

    @Override // r00.d
    public Object call(Object[] args) {
        s.g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // r00.d
    public Type getReturnType() {
        Class cls = Void.TYPE;
        s.f(cls, "Void.TYPE");
        return cls;
    }
}