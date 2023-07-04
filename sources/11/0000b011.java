package r3;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f49122a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(LocaleList localeList) {
        this.f49122a = localeList;
    }

    @Override // r3.i
    public String a() {
        return this.f49122a.toLanguageTags();
    }

    @Override // r3.i
    public Object b() {
        return this.f49122a;
    }

    public boolean equals(Object obj) {
        return this.f49122a.equals(((i) obj).b());
    }

    @Override // r3.i
    public Locale get(int i11) {
        return this.f49122a.get(i11);
    }

    public int hashCode() {
        return this.f49122a.hashCode();
    }

    @Override // r3.i
    public boolean isEmpty() {
        return this.f49122a.isEmpty();
    }

    @Override // r3.i
    public int size() {
        return this.f49122a.size();
    }

    public String toString() {
        return this.f49122a.toString();
    }
}