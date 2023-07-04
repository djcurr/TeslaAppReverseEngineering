package atd.p;

import android.content.Context;

/* loaded from: classes.dex */
public class e extends a {
    @Override // atd.i.b
    /* renamed from: c */
    public Integer a(Context context) {
        String[] systemSharedLibraryNames = b(context).getSystemSharedLibraryNames();
        return Integer.valueOf(systemSharedLibraryNames != null ? systemSharedLibraryNames.length : 0);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71187746843200L);
    }
}