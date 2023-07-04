package a8;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f342c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f343a;

    /* renamed from: b  reason: collision with root package name */
    private f f344b;

    public e(String... strArr) {
        this.f343a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f343a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f343a.add(str);
        return eVar;
    }

    public boolean c(String str, int i11) {
        if (i11 >= this.f343a.size()) {
            return false;
        }
        boolean z11 = i11 == this.f343a.size() - 1;
        String str2 = this.f343a.get(i11);
        if (!str2.equals("**")) {
            return (z11 || (i11 == this.f343a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(Marker.ANY_MARKER));
        }
        if (!z11 && this.f343a.get(i11 + 1).equals(str)) {
            return i11 == this.f343a.size() + (-2) || (i11 == this.f343a.size() + (-3) && b());
        } else if (z11) {
            return true;
        } else {
            int i12 = i11 + 1;
            if (i12 < this.f343a.size() - 1) {
                return false;
            }
            return this.f343a.get(i12).equals(str);
        }
    }

    public f d() {
        return this.f344b;
    }

    public int e(String str, int i11) {
        if (f(str)) {
            return 0;
        }
        if (this.f343a.get(i11).equals("**")) {
            return (i11 != this.f343a.size() - 1 && this.f343a.get(i11 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean g(String str, int i11) {
        if (f(str)) {
            return true;
        }
        if (i11 >= this.f343a.size()) {
            return false;
        }
        return this.f343a.get(i11).equals(str) || this.f343a.get(i11).equals("**") || this.f343a.get(i11).equals(Marker.ANY_MARKER);
    }

    public boolean h(String str, int i11) {
        return "__container".equals(str) || i11 < this.f343a.size() - 1 || this.f343a.get(i11).equals("**");
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f344b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f343a);
        sb2.append(",resolved=");
        sb2.append(this.f344b != null);
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    private e(e eVar) {
        this.f343a = new ArrayList(eVar.f343a);
        this.f344b = eVar.f344b;
    }
}