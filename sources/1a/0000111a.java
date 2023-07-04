package ch.qos.logback.core.net;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HardenedObjectInputStream extends ObjectInputStream {
    static final String[] JAVA_PACKAGES = {"java.lang", "java.util"};
    final List<String> whitelistedClassNames;

    public HardenedObjectInputStream(InputStream inputStream, List<String> list) {
        super(inputStream);
        ArrayList arrayList = new ArrayList();
        this.whitelistedClassNames = arrayList;
        arrayList.addAll(list);
    }

    public HardenedObjectInputStream(InputStream inputStream, String[] strArr) {
        super(inputStream);
        this.whitelistedClassNames = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                this.whitelistedClassNames.add(str);
            }
        }
    }

    private boolean isWhitelisted(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = JAVA_PACKAGES;
            if (i11 >= strArr.length) {
                for (String str2 : this.whitelistedClassNames) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
                return false;
            } else if (str.startsWith(strArr[i11])) {
                return true;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addToWhitelist(List<String> list) {
        this.whitelistedClassNames.addAll(list);
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        if (isWhitelisted(objectStreamClass.getName())) {
            return super.resolveClass(objectStreamClass);
        }
        throw new InvalidClassException("Unauthorized deserialization attempt", objectStreamClass.getName());
    }
}