package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: b  reason: collision with root package name */
    public View f6130b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f6129a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<y> f6131c = new ArrayList<>();

    @Deprecated
    public e0() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return this.f6130b == e0Var.f6130b && this.f6129a.equals(e0Var.f6129a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6130b.hashCode() * 31) + this.f6129a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6130b + "\n") + "    values:";
        for (String str2 : this.f6129a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6129a.get(str2) + "\n";
        }
        return str;
    }

    public e0(View view) {
        this.f6130b = view;
    }
}