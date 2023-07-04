package o30;

/* loaded from: classes5.dex */
public class i {

    /* loaded from: classes5.dex */
    public interface a {
        void a(float f11);

        void b(boolean z11);

        void c(String str);

        void onStart();
    }

    public static h a(String str, String str2, int i11, int i12, int i13, a aVar) {
        h hVar = new h(aVar);
        hVar.execute(str, str2, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        return hVar;
    }
}