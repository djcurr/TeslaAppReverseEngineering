package na;

import java.util.Collections;
import java.util.Map;
import na.j;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f40714a;

    /* loaded from: classes.dex */
    class a implements h {
        a() {
        }

        @Override // na.h
        public Map<String, String> a() {
            return Collections.emptyMap();
        }
    }

    static {
        new a();
        f40714a = new j.a().c();
    }

    Map<String, String> a();
}