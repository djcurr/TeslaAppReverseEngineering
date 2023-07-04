package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList(0);
    List<Status> childrenList;
    long date;
    int level;
    final String message;
    final Object origin;
    Throwable throwable;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StatusBase(int i11, String str, Object obj) {
        this(i11, str, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StatusBase(int i11, String str, Object obj, Throwable th2) {
        this.level = i11;
        this.message = str;
        this.origin = obj;
        this.throwable = th2;
        this.date = System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        if (status == null) {
            throw new NullPointerException("Null values are not valid Status.");
        }
        if (this.childrenList == null) {
            this.childrenList = new ArrayList();
        }
        this.childrenList.add(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StatusBase statusBase = (StatusBase) obj;
            if (this.level != statusBase.level) {
                return false;
            }
            String str = this.message;
            String str2 = statusBase.message;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.date);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i11;
        i11 = this.level;
        Iterator<Status> it2 = iterator();
        while (it2.hasNext()) {
            int effectiveLevel = it2.next().getEffectiveLevel();
            if (effectiveLevel > i11) {
                i11 = effectiveLevel;
            }
        }
        return i11;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.origin;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean hasChildren() {
        boolean z11;
        List<Status> list = this.childrenList;
        if (list != null) {
            z11 = list.size() > 0;
        }
        return z11;
    }

    public int hashCode() {
        int i11 = (this.level + 31) * 31;
        String str = this.message;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List<Status> list = this.childrenList;
        if (list != null) {
            return list.iterator();
        }
        return EMPTY_LIST.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List<Status> list = this.childrenList;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getEffectiveLevel()
            if (r1 == 0) goto L18
            r2 = 1
            if (r1 == r2) goto L15
            r2 = 2
            if (r1 == r2) goto L12
            goto L1d
        L12:
            java.lang.String r1 = "ERROR"
            goto L1a
        L15:
            java.lang.String r1 = "WARN"
            goto L1a
        L18:
            java.lang.String r1 = "INFO"
        L1a:
            r0.append(r1)
        L1d:
            java.lang.Object r1 = r3.origin
            if (r1 == 0) goto L30
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.origin
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L30:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.message
            r0.append(r2)
            java.lang.Throwable r2 = r3.throwable
            if (r2 == 0) goto L46
            r0.append(r1)
            java.lang.Throwable r1 = r3.throwable
            r0.append(r1)
        L46:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.status.StatusBase.toString():java.lang.String");
    }
}