package av;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f7050a;

    /* renamed from: b  reason: collision with root package name */
    private final com.tesla.widget.d f7051b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7052c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tesla.widget.b f7053d;

    public l(int i11, com.tesla.widget.d type, boolean z11, com.tesla.widget.b commandExecution) {
        s.g(type, "type");
        s.g(commandExecution, "commandExecution");
        this.f7050a = i11;
        this.f7051b = type;
        this.f7052c = z11;
        this.f7053d = commandExecution;
    }

    public final int a() {
        return this.f7050a;
    }

    public final com.tesla.widget.d b() {
        return this.f7051b;
    }

    public final boolean c() {
        return this.f7052c;
    }

    public final com.tesla.widget.b d() {
        return this.f7053d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f7050a == lVar.f7050a && this.f7051b == lVar.f7051b && this.f7052c == lVar.f7052c && this.f7053d == lVar.f7053d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f7050a) * 31) + this.f7051b.hashCode()) * 31;
        boolean z11 = this.f7052c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.f7053d.hashCode();
    }

    public String toString() {
        int i11 = this.f7050a;
        com.tesla.widget.d dVar = this.f7051b;
        boolean z11 = this.f7052c;
        com.tesla.widget.b bVar = this.f7053d;
        return "WidgetBuilderConfig(appWidgetId=" + i11 + ", type=" + dVar + ", withCache=" + z11 + ", commandExecution=" + bVar + ")";
    }

    public /* synthetic */ l(int i11, com.tesla.widget.d dVar, boolean z11, com.tesla.widget.b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, dVar, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? com.tesla.widget.b.NONE : bVar);
    }
}