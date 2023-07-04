package androidx.work;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6689a = q.f("InputMerger");

    public static l a(String str) {
        try {
            return (l) Class.forName(str).newInstance();
        } catch (Exception e11) {
            q c11 = q.c();
            String str2 = f6689a;
            c11.b(str2, "Trouble instantiating + " + str, e11);
            return null;
        }
    }

    public abstract e b(List<e> list);
}