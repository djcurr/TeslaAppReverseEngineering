package im;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f30470a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f30471b;

    /* renamed from: c  reason: collision with root package name */
    private final b f30472c;

    public a(int i11, d... dVarArr) {
        this.f30470a = i11;
        this.f30471b = dVarArr;
        this.f30472c = new b(i11);
    }

    @Override // im.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.f30470a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f30471b) {
            if (stackTraceElementArr2.length <= this.f30470a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f30470a ? this.f30472c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}