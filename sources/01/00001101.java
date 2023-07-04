package ch.qos.logback.core.joran.spi;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ElementSelector extends ElementPath {
    public ElementSelector() {
    }

    public ElementSelector(String str) {
        super(str);
    }

    public ElementSelector(List<String> list) {
        super(list);
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    @Override // ch.qos.logback.core.joran.spi.ElementPath
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementSelector)) {
            return false;
        }
        ElementSelector elementSelector = (ElementSelector) obj;
        if (elementSelector.size() != size()) {
            return false;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!equalityCheck(get(i11), elementSelector.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public boolean fullPathMatch(ElementPath elementPath) {
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!equalityCheck(get(i11), elementPath.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public int getPrefixMatchLength(ElementPath elementPath) {
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size == 0 || size2 == 0) {
            return 0;
        }
        if (size > size2) {
            size = size2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size && equalityCheck(this.partList.get(i12), elementPath.partList.get(i12)); i12++) {
            i11++;
        }
        return i11;
    }

    public int getTailMatchLength(ElementPath elementPath) {
        int i11 = 0;
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size != 0 && size2 != 0) {
            int i12 = size <= size2 ? size : size2;
            for (int i13 = 1; i13 <= i12 && equalityCheck(this.partList.get(size - i13), elementPath.partList.get(size2 - i13)); i13++) {
                i11++;
            }
        }
        return i11;
    }

    public int hashCode() {
        int size = size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 ^= get(i12).toLowerCase(Locale.US).hashCode();
        }
        return i11;
    }

    public boolean isContainedIn(ElementPath elementPath) {
        if (elementPath == null) {
            return false;
        }
        return elementPath.toStableString().contains(toStableString());
    }
}