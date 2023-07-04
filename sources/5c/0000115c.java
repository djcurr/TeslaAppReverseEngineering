package ch.qos.logback.core.pattern.parser;

/* loaded from: classes.dex */
public class Node {
    static final int COMPOSITE_KEYWORD = 2;
    static final int LITERAL = 0;
    static final int SIMPLE_KEYWORD = 1;
    Node next;
    final int type;
    final Object value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Node(int i11) {
        this(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Node(int i11, Object obj) {
        this.type = i11;
        this.value = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Node) {
            Node node = (Node) obj;
            if (this.type == node.type && ((obj2 = this.value) == null ? node.value == null : obj2.equals(node.value))) {
                Node node2 = this.next;
                Node node3 = node.next;
                if (node2 != null) {
                    if (node2.equals(node3)) {
                        return true;
                    }
                } else if (node3 == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Node getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i11 = this.type * 31;
        Object obj = this.value;
        return i11 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String printNext() {
        if (this.next != null) {
            return " -> " + this.next;
        }
        return "";
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.type != 0) {
            str = super.toString();
        } else {
            str = "LITERAL(" + this.value + ")";
        }
        stringBuffer.append(str);
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }
}