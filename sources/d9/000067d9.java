package eh;

import android.os.Build;
import eh.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d implements b.InterfaceC0486b {
    @Override // eh.b.InterfaceC0486b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // eh.b.InterfaceC0486b
    public String b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // eh.b.InterfaceC0486b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // eh.b.InterfaceC0486b
    public String[] d() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        String str = Build.CPU_ABI2;
        return !e.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // eh.b.InterfaceC0486b
    public void e(String str) {
        System.load(str);
    }
}