package j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes7.dex */
class c implements Comparator {
    public c(int i11) {
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}