package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class f implements n00.c, Serializable {
    public static final Object NO_RECEIVER = a.f34900a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient n00.c reflected;
    private final String signature;

    /* loaded from: classes5.dex */
    private static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private static final a f34900a = new a();

        private a() {
        }
    }

    public f() {
        this(NO_RECEIVER);
    }

    @Override // n00.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // n00.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public n00.c compute() {
        n00.c cVar = this.reflected;
        if (cVar == null) {
            n00.c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return cVar;
    }

    protected abstract n00.c computeReflected();

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // n00.c
    public String getName() {
        return this.name;
    }

    public n00.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? m0.c(cls) : m0.b(cls);
    }

    @Override // n00.c
    public List<n00.l> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n00.c getReflected() {
        n00.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new g00.b();
    }

    @Override // n00.c
    public n00.p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // n00.c
    public List<n00.q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // n00.c
    public n00.t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // n00.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // n00.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // n00.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // n00.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Object obj, Class cls, String str, String str2, boolean z11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z11;
    }
}