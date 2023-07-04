package com.google.android.gms.internal.location;

import com.adyen.checkout.components.model.payments.request.Address;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzbs {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i12 >= length) {
                break;
            }
            Object obj = objArr[i12];
            if (obj == null) {
                sb2 = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e11) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb4.length() != 0 ? "Exception during lenientFormat for ".concat(sb4) : new String("Exception during lenientFormat for "), (Throwable) e11);
                    String name2 = e11.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 9 + name2.length());
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i12] = sb2;
            i12++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i13 = 0;
        while (true) {
            length2 = objArr.length;
            if (i11 >= length2 || (indexOf = str.indexOf("%s", i13)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i13, indexOf);
            sb6.append(objArr[i11]);
            i13 = indexOf + 2;
            i11++;
        }
        sb6.append((CharSequence) str, i13, str.length());
        if (i11 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb6.append(", ");
                sb6.append(objArr[i14]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}