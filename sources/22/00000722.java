package androidx.lifecycle;

import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements s {

    /* renamed from: a  reason: collision with root package name */
    private final m f5024a;

    /* renamed from: b  reason: collision with root package name */
    private final s f5025b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5026a;

        static {
            int[] iArr = new int[p.b.values().length];
            f5026a = iArr;
            try {
                iArr[p.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5026a[p.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5026a[p.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5026a[p.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5026a[p.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5026a[p.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5026a[p.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(m mVar, s sVar) {
        this.f5024a = mVar;
        this.f5025b = sVar;
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        switch (a.f5026a[bVar.ordinal()]) {
            case 1:
                this.f5024a.onCreate(vVar);
                break;
            case 2:
                this.f5024a.onStart(vVar);
                break;
            case 3:
                this.f5024a.onResume(vVar);
                break;
            case 4:
                this.f5024a.onPause(vVar);
                break;
            case 5:
                this.f5024a.onStop(vVar);
                break;
            case 6:
                this.f5024a.onDestroy(vVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        s sVar = this.f5025b;
        if (sVar != null) {
            sVar.g(vVar, bVar);
        }
    }
}