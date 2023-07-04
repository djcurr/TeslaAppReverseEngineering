package th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f51942a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f51943b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f51944a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f51945b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f51944a, Collections.unmodifiableList(this.f51945b));
        }

        public a b(List<c> list) {
            this.f51945b = list;
            return this;
        }

        public a c(String str) {
            this.f51944a = str;
            return this;
        }
    }

    static {
        new a().a();
    }

    d(String str, List<c> list) {
        this.f51942a = str;
        this.f51943b = list;
    }

    public static a c() {
        return new a();
    }

    @om.d(tag = 2)
    public List<c> a() {
        return this.f51943b;
    }

    @om.d(tag = 1)
    public String b() {
        return this.f51942a;
    }
}