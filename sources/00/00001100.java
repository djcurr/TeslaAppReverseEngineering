package ch.qos.logback.core.joran.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ElementPath {
    ArrayList<String> partList;

    public ElementPath() {
        this.partList = new ArrayList<>();
    }

    public ElementPath(String str) {
        String[] split;
        this.partList = new ArrayList<>();
        if (str == null || (split = str.split("/")) == null) {
            return;
        }
        for (String str2 : split) {
            if (str2.length() > 0) {
                this.partList.add(str2);
            }
        }
    }

    public ElementPath(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.partList = arrayList;
        arrayList.addAll(list);
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public ElementPath duplicate() {
        ElementPath elementPath = new ElementPath();
        elementPath.partList.addAll(this.partList);
        return elementPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementPath)) {
            return false;
        }
        ElementPath elementPath = (ElementPath) obj;
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

    public String get(int i11) {
        return this.partList.get(i11);
    }

    public List<String> getCopyOfPartList() {
        return new ArrayList(this.partList);
    }

    public String peekLast() {
        if (this.partList.isEmpty()) {
            return null;
        }
        return this.partList.get(this.partList.size() - 1);
    }

    public void pop() {
        if (this.partList.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = this.partList;
        arrayList.remove(arrayList.size() - 1);
    }

    public void push(String str) {
        this.partList.add(str);
    }

    public int size() {
        return this.partList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toStableString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it2 = this.partList.iterator();
        while (it2.hasNext()) {
            sb2.append("[");
            sb2.append(it2.next());
            sb2.append("]");
        }
        return sb2.toString();
    }

    public String toString() {
        return toStableString();
    }
}