package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class Node {
    Object defaultPart;
    Node next;
    Object payload;
    Type type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.subst.Node$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        VARIABLE
    }

    public Node(Type type, Object obj) {
        this.type = type;
        this.payload = obj;
    }

    public Node(Type type, Object obj, Object obj2) {
        this.type = type;
        this.payload = obj;
        this.defaultPart = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        System.out.print(toString());
        System.out.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            System.out.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type != node.type) {
            return false;
        }
        Object obj2 = this.payload;
        if (obj2 == null ? node.payload == null : obj2.equals(node.payload)) {
            Object obj3 = this.defaultPart;
            if (obj3 == null ? node.defaultPart == null : obj3.equals(node.defaultPart)) {
                Node node2 = this.next;
                Node node3 = node.next;
                return node2 == null ? node3 == null : node2.equals(node3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Type type = this.type;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.payload;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.defaultPart;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.next;
        return hashCode3 + (node != null ? node.hashCode() : 0);
    }

    void recursive(Node node, StringBuilder sb2) {
        while (node != null) {
            sb2.append(node.toString());
            sb2.append(" --> ");
            node = node.next;
        }
        sb2.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[this.type.ordinal()];
        if (i11 == 1) {
            return "Node{type=" + this.type + ", payload='" + this.payload + "'}";
        } else if (i11 != 2) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            Object obj = this.defaultPart;
            if (obj != null) {
                recursive((Node) obj, sb3);
            }
            recursive((Node) this.payload, sb2);
            String str = "Node{type=" + this.type + ", payload='" + sb2.toString() + "'";
            if (this.defaultPart != null) {
                str = str + ", defaultPart=" + sb3.toString();
            }
            return str + CoreConstants.CURLY_RIGHT;
        }
    }
}