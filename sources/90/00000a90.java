package atd.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public enum a {
    V1_1(atd.s0.a.a(-86688283814464L), false),
    V1_4(atd.s0.a.a(-86718348585536L), true);
    
    private final boolean mActive;
    private final String mVersion;

    a(String str, boolean z11) {
        this.mVersion = str;
        this.mActive = z11;
    }

    public static List<a> a() {
        a[] values;
        ArrayList arrayList = new ArrayList();
        for (a aVar : values()) {
            if (aVar.c()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public String b() {
        return this.mVersion;
    }

    public boolean c() {
        return this.mActive;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mVersion;
    }
}