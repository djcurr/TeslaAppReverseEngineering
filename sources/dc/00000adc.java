package atd.m0;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Debug;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements a, b, c, f, d {
    static {
        atd.s0.a.a(-844341989665344L);
        atd.s0.a.a(-844170190973504L);
    }

    private boolean c() {
        String str = Build.TAGS;
        return str != null && str.contains(atd.s0.a.a(-776352657369664L));
    }

    private boolean d() {
        for (File file : e()) {
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    private List<File> e() {
        return Arrays.asList(new File(a(atd.s0.a.a(-776378427173440L))), new File(a(atd.s0.a.a(-775978995214912L))), new File(a(atd.s0.a.a(-775841556261440L))), new File(a(atd.s0.a.a(-776060599593536L))), new File(a(atd.s0.a.a(-775201606134336L))), new File(a(atd.s0.a.a(-775510843779648L))), new File(a(atd.s0.a.a(-774707684895296L))), new File(a(atd.s0.a.a(-774969677900352L))), new File(a(atd.s0.a.a(-774535886203456L))), new File(a(atd.s0.a.a(-844024162085440L))));
    }

    @Override // atd.m0.c
    public boolean a() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith(atd.s0.a.a(-777301845142080L)) && !str.startsWith(atd.s0.a.a(-777336204880448L))) {
            String str2 = Build.MODEL;
            if (!str2.contains(atd.s0.a.a(-777095686711872L)) && !str2.contains(atd.s0.a.a(-777125751482944L)) && !str2.contains(atd.s0.a.a(-776395607042624L)) && !Build.MANUFACTURER.contains(atd.s0.a.a(-776451441617472L)) && ((!Build.BRAND.startsWith(atd.s0.a.a(-776507276192320L)) || !Build.DEVICE.startsWith(atd.s0.a.a(-776266758023744L))) && !atd.s0.a.a(-776301117762112L).equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    @Override // atd.m0.a
    public boolean b(Context context) {
        return b() || Debug.isDebuggerConnected() || (context.getApplicationInfo().flags & 2) != 0;
    }

    @Override // atd.m0.d
    public boolean b(Context context, Collection<String> collection) {
        return false;
    }

    private boolean b() {
        StackTraceElement[] stackTrace;
        try {
            throw new Exception(atd.s0.a.a(-776356952336960L));
        } catch (Exception e11) {
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                for (String str : e.a()) {
                    if (stackTraceElement.getClassName().startsWith(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private String b(String str) {
        return str.replaceAll(a(atd.s0.a.a(-844299039992384L)), atd.s0.a.a(-844333399730752L)).toLowerCase(Locale.US);
    }

    @Override // atd.m0.b
    public boolean a(Context context) {
        return b() || c() || d();
    }

    @Override // atd.m0.d
    public boolean a(Context context, String str) {
        Signature[] a11;
        if (str == null || (a11 = atd.r0.e.a(context)) == null) {
            return false;
        }
        return a(a11, str);
    }

    @Override // atd.m0.d
    public boolean a(Context context, Collection<String> collection) {
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.addAll(h.a());
        return atd.r0.e.a(context, hashSet);
    }

    @Override // atd.m0.f
    public boolean a(int i11) {
        return Build.VERSION.SDK_INT >= i11;
    }

    private boolean a(Signature[] signatureArr, String str) {
        for (Signature signature : signatureArr) {
            if (a(signature, str)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Signature signature, String str) {
        String b11 = b(str);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(a(atd.s0.a.a(-843921082870336L)));
            messageDigest.update(signature.toByteArray());
            return a(messageDigest.digest()).equals(b11);
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    private String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            sb2.append(String.format(atd.s0.a.a(-844329104763456L), Byte.valueOf(b11)));
        }
        return sb2.toString();
    }

    private String a(String str) {
        return atd.r0.g.a(str);
    }
}